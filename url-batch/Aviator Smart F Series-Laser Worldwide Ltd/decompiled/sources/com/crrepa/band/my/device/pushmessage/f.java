package com.crrepa.band.my.device.pushmessage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.model.db.MessagePush;
import com.crrepa.band.my.model.db.proxy.BandMessageDaoProxy;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class f extends ContentObserver {
    private static final String ADDRESS = "address";
    private static final String BODY = "body";
    private static final String DATE = "date";
    private static final long NEW_SMS_PERIOD = 2000;
    private static final String READ = "read";
    private static final String SMS_URI = "content://sms/";
    private static final String SMS_URI_INBOX = "content://sms/inbox";
    private static boolean registered = false;
    private static long smsChangedTime;
    private static f smsObserver;
    private final Context context;
    private final List<Long> sendTimeList;
    private Disposable subscribe;

    public f(Context context, Handler handler) {
        super(handler);
        this.sendTimeList = new ArrayList();
        this.context = context.getApplicationContext();
    }

    private static f getInstance(Context context) {
        if (q7.b.hasSelfPermissions(context, "android.permission.READ_SMS") && smsObserver == null) {
            smsObserver = new f(context, new Handler());
        }
        return smsObserver;
    }

    @SuppressLint({"Range"})
    private String getSmsContent(Cursor cursor) {
        String str = null;
        try {
            String string = cursor.getString(cursor.getColumnIndex("body"));
            String string2 = cursor.getString(cursor.getColumnIndex(ADDRESS));
            com.orhanobut.logger.f.d("sms body: " + string);
            com.orhanobut.logger.f.d("sms address: " + string2);
            StringBuilder sb = new StringBuilder();
            try {
                str = w0.a.getContactName(this.context, string2);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            if (!TextUtils.isEmpty(str)) {
                string2 = str;
            }
            sb.append(string2);
            sb.append(":");
            sb.append(string);
            return sb.toString();
        } catch (Exception e9) {
            e9.printStackTrace();
            return null;
        }
    }

    private boolean isSendTime(long j8) {
        Iterator<Long> it = this.sendTimeList.iterator();
        while (it.hasNext()) {
            if (it.next().longValue() == j8) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSmsChanged() {
        return System.currentTimeMillis() - smsChangedTime < 2000;
    }

    public static boolean isSmsEnable() {
        MessagePush messagePush = new BandMessageDaoProxy().get();
        if (messagePush == null || messagePush.getMessageEnable() == null) {
            return false;
        }
        return messagePush.getMessageEnable().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$querySmsMessage$0(ObservableEmitter observableEmitter) {
        Cursor queryLastSms = queryLastSms();
        if (queryLastSms != null) {
            observableEmitter.onNext(queryLastSms);
        }
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$querySmsMessage$1(Cursor cursor) {
        if (cursor == null) {
            return;
        }
        sendSmsMessage(getSmsContent(cursor));
    }

    private synchronized Cursor queryLastSms() {
        try {
            Cursor query = this.context.getContentResolver().query(Uri.parse(SMS_URI_INBOX), new String[]{ADDRESS, "body", DATE, READ}, "date < " + System.currentTimeMillis(), null, "date desc limit 1");
            if (query != null && query.moveToFirst()) {
                long j8 = query.getLong(query.getColumnIndex(DATE));
                com.orhanobut.logger.f.d("sms date: " + j8);
                if (System.currentTimeMillis() < j8) {
                    com.orhanobut.logger.f.d("SMS from the future!!!");
                    return null;
                }
                int i8 = query.getInt(query.getColumnIndex(READ));
                com.orhanobut.logger.f.d("sms read: " + i8);
                if (i8 != 0) {
                    return null;
                }
                if (isSendTime(j8)) {
                    com.orhanobut.logger.f.d("SMS already sent!!!");
                    return null;
                }
                this.sendTimeList.add(Long.valueOf(j8));
                return query;
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return null;
    }

    private synchronized void querySmsMessage() {
        Disposable disposable = this.subscribe;
        if (disposable != null && !disposable.isDisposed()) {
            com.orhanobut.logger.f.d("subscribe is disposed!");
        } else {
            if (isSmsEnable()) {
                this.subscribe = Observable.create(new ObservableOnSubscribe() { // from class: com.crrepa.band.my.device.pushmessage.d
                    @Override // io.reactivex.ObservableOnSubscribe
                    public final void subscribe(ObservableEmitter observableEmitter) {
                        f.this.lambda$querySmsMessage$0(observableEmitter);
                    }
                }).observeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.pushmessage.e
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        f.this.lambda$querySmsMessage$1((Cursor) obj);
                    }
                }, new com.crrepa.band.my.ble.band.config.b());
            }
        }
    }

    public static boolean register(Context context) {
        f fVar = getInstance(context);
        if (fVar == null) {
            com.orhanobut.logger.f.d("SmsObserver is null!");
            return false;
        }
        com.orhanobut.logger.f.d("SmsObserver register: " + registered);
        if (!registered) {
            registered = true;
            com.orhanobut.logger.f.d("SmsObserver registerContentObserver");
            try {
                context.getContentResolver().registerContentObserver(Uri.parse(SMS_URI), true, fVar);
            } catch (Exception e8) {
                e8.printStackTrace();
                registered = false;
            }
        }
        return registered;
    }

    private void sendSmsMessage(String str) {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().hasSMS()) {
            i4.getInstance().sendMessage(str, 1);
        }
    }

    public static boolean unregister(Context context) {
        if (smsObserver == null) {
            com.orhanobut.logger.f.d("SmsObserver is null!");
            return false;
        }
        com.orhanobut.logger.f.d("SmsObserver unregister");
        context.getContentResolver().unregisterContentObserver(smsObserver);
        registered = false;
        smsObserver = null;
        return true;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z7) {
        super.onChange(z7);
        com.orhanobut.logger.f.d("SmsObserver onChange: " + z7);
        smsChangedTime = System.currentTimeMillis();
        querySmsMessage();
    }
}

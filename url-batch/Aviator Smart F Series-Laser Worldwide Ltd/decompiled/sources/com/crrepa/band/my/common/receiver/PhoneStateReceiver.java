package com.crrepa.band.my.common.receiver;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.common.receiver.PhoneStateReceiver;
import com.crrepa.band.my.model.db.MessagePush;
import com.crrepa.band.my.model.db.proxy.BandMessageDaoProxy;
import com.orhanobut.logger.f;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class PhoneStateReceiver extends BroadcastReceiver {
    private static final long MIN_CALL_STATE_PERIOD = 1000;
    private static final String PHONE_STATE_RECEIVED = "android.intent.action.PHONE_STATE";
    private static c callStateListener;
    private static String incomingNumber;
    private static PhoneStateListener phoneStateListener;
    private static long previousCallTime;
    private static int previousState;
    private static PhoneStateReceiver receiver = new PhoneStateReceiver();
    private static boolean callStateListenerRegistered = false;

    class a extends c {
        a() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onCallStateChanged$0(int i8, Long l8) {
            PhoneStateReceiver.sendCallMessage(i8, PhoneStateReceiver.incomingNumber);
            String unused = PhoneStateReceiver.incomingNumber = null;
        }

        @Override // com.crrepa.band.my.common.receiver.PhoneStateReceiver.c, android.telephony.TelephonyCallback.CallStateListener
        public void onCallStateChanged(final int i8) {
            Observable.timer(1000L, TimeUnit.MILLISECONDS).subscribe(new Consumer() { // from class: com.crrepa.band.my.common.receiver.d
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PhoneStateReceiver.a.lambda$onCallStateChanged$0(i8, (Long) obj);
                }
            });
        }
    }

    class b extends PhoneStateListener {
        b() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i8, String str) {
            super.onCallStateChanged(i8, str);
            PhoneStateReceiver.sendCallMessage(i8, str);
        }
    }

    private static abstract class c extends TelephonyCallback implements TelephonyCallback.CallStateListener {
        private c() {
        }

        public abstract void onCallStateChanged(int i8);

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    static {
        int i8 = Build.VERSION.SDK_INT;
        callStateListener = i8 >= 31 ? new a() : null;
        phoneStateListener = i8 < 31 ? new b() : null;
    }

    public static boolean isCallRinging() {
        return previousState != 0;
    }

    private static boolean isMissCallEnable() {
        MessagePush messagePush = new BandMessageDaoProxy().get();
        if (messagePush == null || messagePush.getMissCallEnable() == null) {
            return false;
        }
        return messagePush.getMissCallEnable().booleanValue();
    }

    private static boolean isPhoneEnable() {
        MessagePush messagePush = new BandMessageDaoProxy().get();
        if (messagePush == null || messagePush.getPhoneEnable() == null) {
            return false;
        }
        return messagePush.getPhoneEnable().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendMissCall$0(Context context, String str) {
        String contactName = w0.a.getContactName(context, incomingNumber);
        if (!TextUtils.isEmpty(contactName)) {
            str = contactName;
        }
        i4.getInstance().sendMessage(str, 45);
    }

    public static void register(Context context) {
        f.d("PhoneStateReceiver register");
        previousState = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.setPriority(Integer.MAX_VALUE);
        intentFilter.addAction(PHONE_STATE_RECEIVED);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(receiver, intentFilter, 2);
        } else {
            context.registerReceiver(receiver, intentFilter);
        }
        registerCallStateListener(context);
    }

    private static void registerCallStateListener(Context context) {
        if (callStateListenerRegistered) {
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (Build.VERSION.SDK_INT < 31) {
            telephonyManager.listen(phoneStateListener, 32);
            callStateListenerRegistered = true;
        } else if (ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
            telephonyManager.registerTelephonyCallback(ContextCompat.getMainExecutor(context), callStateListener);
            callStateListenerRegistered = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r5 != 2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void sendCallMessage(int i8, String str) {
        f.d("onCallStateChanged state: " + i8);
        f.d("onCallStateChanged phoneNumber: " + str);
        if (TextUtils.isEmpty(str)) {
            previousState = i8;
            return;
        }
        if (i8 == previousState || System.currentTimeMillis() - previousCallTime < 1000) {
            f.e("onCallStateChanged the same callState", new Object[0]);
            previousState = i8;
            return;
        }
        if (isPhoneEnable()) {
            if (i8 != 0) {
                if (i8 == 1) {
                    incomingNumber = str;
                    com.crrepa.band.my.device.pushmessage.notify.a.getInstance().sendIncomingNumber(com.moyoung.dafit.module.common.utils.d.get(), incomingNumber);
                }
            }
            if (previousState == 1) {
                sendCallOffHook();
                if (i8 == 0) {
                    sendMissCall(com.moyoung.dafit.module.common.utils.d.get());
                }
            }
        }
        previousState = i8;
        previousCallTime = System.currentTimeMillis();
        f.d("onCallStateChanged previousState: " + previousState);
    }

    private static void sendCallOffHook() {
        f.d("sendCallOffHook");
        i4.getInstance().sendCallOffHook();
        com.crrepa.band.my.device.pushmessage.notify.a.getInstance().endCall();
    }

    @SuppressLint({"CheckResult"})
    private static void sendMissCall(final Context context) {
        f.d("sendMissCall: " + incomingNumber);
        if (!TextUtils.isEmpty(incomingNumber) && com.crrepa.band.my.ble.band.utils.a.getInstance().hasMessage(45) && isMissCallEnable()) {
            f.d("sendMissCall1111: " + incomingNumber);
            Observable.just(incomingNumber).observeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.crrepa.band.my.common.receiver.c
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PhoneStateReceiver.lambda$sendMissCall$0(context, (String) obj);
                }
            }, new com.crrepa.band.my.ble.band.config.b());
        }
    }

    public static void unregister(Context context) {
        context.unregisterReceiver(receiver);
        unregisterCallStateListener(context);
    }

    public static void unregisterCallStateListener(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (Build.VERSION.SDK_INT >= 31) {
            telephonyManager.unregisterTelephonyCallback(callStateListener);
        } else {
            telephonyManager.listen(phoneStateListener, 0);
        }
        callStateListenerRegistered = false;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        f.d("PhoneStateReceiver onReceive");
        com.crrepa.band.my.ble.band.connect.a.connect();
        incomingNumber = intent.getExtras().getString("incoming_number");
        f.d("PhoneStateReceiver onReceive: " + incomingNumber);
    }
}

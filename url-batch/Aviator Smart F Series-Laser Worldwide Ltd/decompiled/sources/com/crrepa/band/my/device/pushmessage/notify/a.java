package com.crrepa.band.my.device.pushmessage.notify;

import android.content.Context;
import android.text.TextUtils;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.model.net.IncomingNumberEntity;
import com.moyoung.dafit.module.common.utils.a0;
import com.moyoung.dafit.module.common.utils.s;
import com.moyoung.dafit.module.common.utils.u;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/* loaded from: classes2.dex */
public class a {
    private static final int MIN_NUMBER_LENGTH = 6;
    private boolean endCall;
    private String incomingNumber;
    private Disposable subscribe;

    /* renamed from: com.crrepa.band.my.device.pushmessage.notify.a$a, reason: collision with other inner class name */
    class C0185a implements Consumer {
        C0185a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(IncomingNumberEntity incomingNumberEntity) {
            if (incomingNumberEntity == null || incomingNumberEntity.getErrorCode() != 0) {
                return;
            }
            String numInfo = incomingNumberEntity.getNumInfo();
            if (numInfo.contains("：")) {
                String[] split = numInfo.split("：");
                if (split.length > 2) {
                    a.this.sendIncomingNumber(split[1]);
                }
            }
        }
    }

    class b implements Function {
        b() {
        }

        @Override // io.reactivex.functions.Function
        public IncomingNumberEntity apply(@NonNull String str) {
            String substring = str.substring(str.indexOf("{"), str.lastIndexOf("}") + 1);
            com.orhanobut.logger.f.d("incoming number: " + substring);
            return (IncomingNumberEntity) s.json2Bean(substring, IncomingNumberEntity.class);
        }
    }

    private static class c {
        private static final a INSTANCE = new a(null);

        private c() {
        }
    }

    /* synthetic */ a(C0185a c0185a) {
        this();
    }

    private boolean checkHarassingNumber(Context context, String str) {
        return u.isSimplified() && a0.isNetworkConnected(context) && 6 < str.length();
    }

    public static a getInstance() {
        return c.INSTANCE;
    }

    public void endCall() {
        this.endCall = true;
        Disposable disposable = this.subscribe;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.subscribe.dispose();
        this.subscribe = null;
    }

    public String getIncomingNumber() {
        return this.incomingNumber;
    }

    public void sendIncomingNumber(Context context, String str) {
        String str2;
        com.orhanobut.logger.f.d("sendIncomingNumber: " + str);
        this.endCall = false;
        if (TextUtils.isEmpty(str)) {
            com.orhanobut.logger.f.d("incoming number is null!");
            return;
        }
        this.incomingNumber = str;
        try {
            str2 = w0.a.getContactName(context, str);
        } catch (Exception e8) {
            e8.printStackTrace();
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            sendIncomingNumber(str2);
            return;
        }
        sendIncomingNumber(str);
        if (checkHarassingNumber(context, str)) {
            com.orhanobut.logger.f.d("checkHarassingNumber: " + str);
            this.subscribe = com.crrepa.band.my.device.net.c.getInstance().getApiStores().queryIncomingNumber(str).map(new b()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C0185a());
        }
    }

    private a() {
        this.endCall = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendIncomingNumber(String str) {
        if (TextUtils.isEmpty(str) || this.endCall) {
            return;
        }
        com.orhanobut.logger.f.d("sendIncomingMessage: " + str);
        i4.getInstance().sendMessage(str, 0);
    }
}

package com.crrepa.band.my.ble.band.cmd.listener;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.ble.conn.listener.CRPCallNumberListener;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/* loaded from: classes2.dex */
public class e implements CRPCallNumberListener {

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(String str) {
            i4.getInstance().sendCallContactName(str);
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            th.printStackTrace();
        }
    }

    class c implements Function {
        c() {
        }

        @Override // io.reactivex.functions.Function
        public String apply(String str) {
            String contactName = w0.a.getContactName(com.moyoung.dafit.module.common.utils.d.get(), str);
            return TextUtils.isEmpty(contactName) ? str : contactName;
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPCallNumberListener
    @SuppressLint({"CheckResult"})
    public void onCallNumber(String str) {
        com.orhanobut.logger.f.d("onCallNumber: " + str);
        Observable.just(str).map(new c()).subscribeOn(Schedulers.io()).subscribe(new a(), new b());
    }
}

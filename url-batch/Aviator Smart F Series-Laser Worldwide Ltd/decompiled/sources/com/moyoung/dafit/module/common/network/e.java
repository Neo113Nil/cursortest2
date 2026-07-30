package com.moyoung.dafit.module.common.network;

import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.functions.Consumer;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.IOException;

/* loaded from: classes4.dex */
public class e {

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            if (th instanceof UndeliverableException) {
                th = th.getCause();
            }
            if ((th instanceof IOException) || (th instanceof InterruptedException)) {
                return;
            }
            if ((th instanceof NullPointerException) || (th instanceof IllegalArgumentException)) {
                Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
                return;
            }
            if (th instanceof IllegalStateException) {
                Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
                return;
            }
            com.orhanobut.logger.f.w("Undeliverable exception: " + th.toString(), new Object[0]);
        }
    }

    private e() {
    }

    public static void setErrorHandler() {
        RxJavaPlugins.setErrorHandler(new a());
    }
}

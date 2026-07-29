package com.aiming.mdt.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.aiming.mdt.utils.ʼʾ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0285 {

    /* renamed from: com.aiming.mdt.utils.ʼʾ$ʻ, reason: contains not printable characters */
    public interface InterfaceC0286 {
    }

    /* renamed from: com.aiming.mdt.utils.ʼʾ$ʻʼ, reason: contains not printable characters */
    public static class HandlerC0287 extends Handler {

        /* renamed from: ʻʼ, reason: contains not printable characters */
        private WeakReference<InterfaceC0286> f826;

        public HandlerC0287(InterfaceC0286 interfaceC0286) {
            this(null, Looper.myLooper());
        }

        public HandlerC0287(InterfaceC0286 interfaceC0286, Looper looper) {
            super(looper);
            if (interfaceC0286 != null) {
                this.f826 = new WeakReference<>(interfaceC0286);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f826 != null) {
                this.f826.get();
            }
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static void m979(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            new HandlerC0287(null, Looper.getMainLooper()).postDelayed(runnable, 0L);
        }
    }
}

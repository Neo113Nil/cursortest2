package com.tapjoy.internal;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private static Handler f8517a;

    public static synchronized Handler a() {
        Handler handler;
        synchronized (u.class) {
            if (f8517a == null) {
                f8517a = new Handler(Looper.getMainLooper());
            }
            handler = f8517a;
        }
        return handler;
    }

    public static ba a(final Handler handler) {
        return new ba() { // from class: com.tapjoy.internal.u.1
            @Override // com.tapjoy.internal.ba
            public final boolean a(Runnable runnable) {
                return handler.post(runnable);
            }
        };
    }
}

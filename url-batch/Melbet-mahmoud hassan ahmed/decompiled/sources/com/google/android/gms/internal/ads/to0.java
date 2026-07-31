package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class to0 implements Executor {

    /* renamed from: f, reason: collision with root package name */
    private final Handler f12289f = new a3.s1(Looper.getMainLooper());

    to0() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.f12289f.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            y2.t.q();
            a3.g2.p(y2.t.p().c(), th);
            throw th;
        }
    }
}

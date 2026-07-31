package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* loaded from: classes.dex */
final class vh0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Thread.UncaughtExceptionHandler f13379a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ xh0 f13380b;

    vh0(xh0 xh0Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f13380b = xh0Var;
        this.f13379a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.f13380b.e(thread, th);
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f13379a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            } catch (Throwable th2) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f13379a;
                if (uncaughtExceptionHandler2 != null) {
                    uncaughtExceptionHandler2.uncaughtException(thread, th);
                }
                throw th2;
            }
        } catch (Throwable unused) {
            io0.d("AdMob exception reporter failed reporting the exception.");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f13379a;
            if (uncaughtExceptionHandler3 != null) {
                uncaughtExceptionHandler3.uncaughtException(thread, th);
            }
        }
    }
}

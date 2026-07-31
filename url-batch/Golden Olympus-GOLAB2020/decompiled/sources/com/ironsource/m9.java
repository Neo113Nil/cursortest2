package com.ironsource;

import java.lang.Thread;

/* loaded from: classes2.dex */
public class m9 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f17216a;

    m9(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f17216a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        n9 n9Var = new n9(th);
        if (n9Var.d()) {
            new lc(n9Var.b(), "" + System.currentTimeMillis(), "Crash").a();
        }
        this.f17216a.uncaughtException(thread, th);
    }
}

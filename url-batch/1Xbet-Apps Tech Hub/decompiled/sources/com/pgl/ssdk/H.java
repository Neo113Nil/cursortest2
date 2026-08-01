package com.pgl.ssdk;

import java.lang.Thread;

/* compiled from: CrashChecker.java */
/* loaded from: classes3.dex */
public class H implements Thread.UncaughtExceptionHandler {
    private static volatile H c;
    private volatile boolean b = false;
    private final Thread.UncaughtExceptionHandler a = Thread.getDefaultUncaughtExceptionHandler();

    private H() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static H b() {
        if (c == null) {
            synchronized (H.class) {
                if (c == null) {
                    c = new H();
                }
            }
        }
        return c;
    }

    public boolean a() {
        return this.b;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.b = true;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}

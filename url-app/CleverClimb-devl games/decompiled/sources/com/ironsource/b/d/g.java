package com.ironsource.b.d;

import com.ironsource.b.d.c;
import java.lang.Thread;

/* compiled from: ThreadExceptionHandler.java */
/* loaded from: classes2.dex */
public class g implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        d.c().a(c.a.NATIVE, "Thread name =" + thread.getName(), th);
    }
}

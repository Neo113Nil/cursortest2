package com.unity3d.player;

import android.os.Build;
import java.lang.Thread;

/* loaded from: classes2.dex */
final class k implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private volatile Thread.UncaughtExceptionHandler f9380a;

    k() {
    }

    final synchronized boolean a() {
        boolean z;
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler == this) {
            z = false;
        } else {
            this.f9380a = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
            z = true;
        }
        return z;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        try {
            Error error = new Error(String.format("FATAL EXCEPTION [%s]\n", thread.getName()) + String.format("Unity version     : %s\n", "2017.4.21f1") + String.format("Device model      : %s %s\n", Build.MANUFACTURER, Build.MODEL) + String.format("Device fingerprint: %s\n", Build.FINGERPRINT));
            error.setStackTrace(new StackTraceElement[0]);
            error.initCause(th);
            this.f9380a.uncaughtException(thread, error);
        } catch (Throwable unused) {
            this.f9380a.uncaughtException(thread, th);
        }
    }
}

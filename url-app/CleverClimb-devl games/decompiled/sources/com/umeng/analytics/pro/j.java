package com.umeng.analytics.pro;

import com.umeng.analytics.AnalyticsConfig;
import java.lang.Thread;

/* compiled from: CrashHandler.java */
/* loaded from: classes2.dex */
public class j implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f8937a;

    /* renamed from: b, reason: collision with root package name */
    private n f8938b;

    public j() {
        if (Thread.getDefaultUncaughtExceptionHandler() == this) {
            return;
        }
        this.f8937a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public void a(n nVar) {
        this.f8938b = nVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        a(th);
        if (this.f8937a == null || this.f8937a == Thread.getDefaultUncaughtExceptionHandler()) {
            return;
        }
        this.f8937a.uncaughtException(thread, th);
    }

    private void a(Throwable th) {
        if (AnalyticsConfig.CATCH_EXCEPTION) {
            this.f8938b.a(th);
        } else {
            this.f8938b.a(null);
        }
    }
}

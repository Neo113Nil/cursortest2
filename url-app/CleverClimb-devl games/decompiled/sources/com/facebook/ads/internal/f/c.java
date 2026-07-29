package com.facebook.ads.internal.f;

import android.content.Context;
import android.os.Process;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.internal.q.a.m;
import com.facebook.ads.internal.q.a.p;
import java.lang.Thread;
import java.util.Map;

/* loaded from: classes.dex */
public class c implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f5112a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f5113b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f5114c;

    public c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Context context, Map<String, String> map) {
        this.f5112a = uncaughtExceptionHandler;
        if (context == null) {
            throw new IllegalArgumentException("Missing Context");
        }
        this.f5113b = context.getApplicationContext();
        this.f5114c = map;
    }

    private void a(Thread thread, Throwable th) {
        if (this.f5112a != null) {
            this.f5112a.uncaughtException(thread, th);
            return;
        }
        try {
            Process.killProcess(Process.myPid());
        } catch (Throwable unused) {
        }
        try {
            System.exit(10);
        } catch (Throwable unused2) {
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        try {
            String a2 = p.a(th);
            if (a2 != null && a2.contains(BuildConfig.APPLICATION_ID)) {
                e.a(new d(m.b(), m.c(), new b(a2, this.f5114c).a()), this.f5113b);
            }
        } catch (Exception unused) {
        }
        a(thread, th);
    }
}

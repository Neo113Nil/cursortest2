package com.facebook.ads.internal.i;

import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5148a = "com.facebook.ads.internal.i.a";

    /* renamed from: b, reason: collision with root package name */
    private static a f5149b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f5150c;

    /* renamed from: d, reason: collision with root package name */
    private Context f5151d;

    private a(Context context) {
        this.f5151d = context;
    }

    public static a a(Context context) {
        if (f5149b == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (applicationContext) {
                if (f5149b == null) {
                    f5149b = new a(applicationContext);
                }
            }
        }
        return f5149b;
    }

    public synchronized void a() {
        if (!f5150c) {
            if (com.facebook.ads.internal.l.a.g(this.f5151d)) {
                try {
                    Thread.setDefaultUncaughtExceptionHandler(new com.facebook.ads.internal.f.c(Thread.getDefaultUncaughtExceptionHandler(), this.f5151d, new c(this.f5151d, false).b()));
                } catch (SecurityException e) {
                    Log.e(f5148a, "No permissions to set the default uncaught exception handler", e);
                }
            }
            f5150c = true;
        }
    }
}

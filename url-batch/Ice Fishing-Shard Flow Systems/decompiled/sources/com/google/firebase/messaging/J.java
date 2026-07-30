package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final long f4467a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f4468b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static J1.a f4469c;

    public static void a(Context context) {
        if (f4469c == null) {
            J1.a aVar = new J1.a(context);
            f4469c = aVar;
            synchronized (aVar.f1363a) {
                aVar.f1369g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f4468b) {
            try {
                if (f4469c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f4469c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (f4468b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f4469c.a(f4467a);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

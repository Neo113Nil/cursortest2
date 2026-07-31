package com.startapp.sdk.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.work.PeriodicWorkRequest;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class a6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f165a;
    public volatile Object b;
    public volatile long c;
    public final long d;

    public a6(Context context) {
        this.f165a = context;
        this.d = PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS;
    }

    public Object a() {
        return null;
    }

    public final Object b() {
        Object obj = this.b;
        if (obj == null || this.c + this.d < SystemClock.uptimeMillis()) {
            synchronized (this) {
                obj = this.b;
                boolean z = this.c + this.d < SystemClock.uptimeMillis();
                if (obj == null || z) {
                    try {
                        obj = a(z);
                    } catch (Throwable th) {
                        if (!zh.a(th, RemoteException.class)) {
                            n8.a(th);
                        }
                    }
                    if (obj != null) {
                        this.b = obj;
                        this.c = SystemClock.uptimeMillis();
                    }
                }
            }
        }
        return obj != null ? obj : c();
    }

    public abstract Object c();

    public Object a(boolean z) {
        return a();
    }

    public a6(Context context, long j) {
        this.f165a = context;
        this.d = j;
    }
}

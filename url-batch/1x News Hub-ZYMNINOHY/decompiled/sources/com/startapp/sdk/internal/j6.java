package com.startapp.sdk.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class j6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3998a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f3999b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f4000c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4001d;

    public j6(Context context) {
        this.f3998a = context;
        this.f4001d = 900000L;
    }

    public Object a() {
        return null;
    }

    public final Object b() {
        Object obj = this.f3999b;
        if (obj == null || this.f4000c + this.f4001d < SystemClock.uptimeMillis()) {
            synchronized (this) {
                try {
                    obj = this.f3999b;
                    boolean z = this.f4000c + this.f4001d < SystemClock.uptimeMillis();
                    if (obj == null || z) {
                        try {
                            obj = a(z);
                        } catch (Throwable th) {
                            if (!si.a(th, RemoteException.class)) {
                                d9.a(th);
                            }
                        }
                        if (obj != null) {
                            this.f3999b = obj;
                            this.f4000c = SystemClock.uptimeMillis();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return obj != null ? obj : c();
    }

    public abstract Object c();

    public Object a(boolean z) {
        return a();
    }

    public j6(Context context, long j3) {
        this.f3998a = context;
        this.f4001d = j3;
    }
}

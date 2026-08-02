package com.startapp.sdk.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class j6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7124a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f7125b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f7126c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7127d;

    public j6(Context context) {
        this.f7124a = context;
        this.f7127d = 900000L;
    }

    public Object a() {
        return null;
    }

    public final Object b() {
        Object obj = this.f7125b;
        if (obj == null || this.f7126c + this.f7127d < SystemClock.uptimeMillis()) {
            synchronized (this) {
                try {
                    obj = this.f7125b;
                    boolean z = this.f7126c + this.f7127d < SystemClock.uptimeMillis();
                    if (obj == null || z) {
                        try {
                            obj = a(z);
                        } catch (Throwable th) {
                            if (!si.a(th, RemoteException.class)) {
                                d9.a(th);
                            }
                        }
                        if (obj != null) {
                            this.f7125b = obj;
                            this.f7126c = SystemClock.uptimeMillis();
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

    public j6(Context context, long j4) {
        this.f7124a = context;
        this.f7127d = j4;
    }
}

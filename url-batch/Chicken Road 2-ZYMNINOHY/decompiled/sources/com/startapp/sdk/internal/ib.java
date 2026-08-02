package com.startapp.sdk.internal;

import android.util.Log;

/* loaded from: classes.dex */
public final class ib {

    /* renamed from: a, reason: collision with root package name */
    public final String f7092a;

    /* renamed from: b, reason: collision with root package name */
    public volatile i7 f7093b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f7094c;

    public ib(i7 i7Var) {
        this.f7093b = i7Var;
        this.f7092a = i7Var.toString();
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f7094c;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f7094c;
                if (obj == null) {
                    i7 i7Var = this.f7093b;
                    this.f7093b = null;
                    if (i7Var == null) {
                        throw new IllegalStateException("3, " + this.f7092a);
                    }
                    try {
                        obj = i7Var.a();
                        if (obj == null) {
                            throw new IllegalStateException("2, " + this.f7092a);
                        }
                        this.f7094c = obj;
                    } catch (Error e4) {
                        e = e4;
                        Log.println(7, "StartAppSDK", Log.getStackTraceString(e));
                        e.addSuppressed(new Exception(this.f7092a));
                        throw e;
                    } catch (RuntimeException e5) {
                        e = e5;
                        Log.println(7, "StartAppSDK", Log.getStackTraceString(e));
                        e.addSuppressed(new Exception(this.f7092a));
                        throw e;
                    }
                }
            } finally {
            }
        }
        return obj;
    }
}

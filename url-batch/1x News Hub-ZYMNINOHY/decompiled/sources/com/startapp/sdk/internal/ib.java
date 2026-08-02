package com.startapp.sdk.internal;

import android.util.Log;

/* loaded from: classes.dex */
public final class ib {

    /* renamed from: a, reason: collision with root package name */
    public final String f3966a;

    /* renamed from: b, reason: collision with root package name */
    public volatile i7 f3967b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f3968c;

    public ib(i7 i7Var) {
        this.f3967b = i7Var;
        this.f3966a = i7Var.toString();
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f3968c;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f3968c;
                if (obj == null) {
                    i7 i7Var = this.f3967b;
                    this.f3967b = null;
                    if (i7Var == null) {
                        throw new IllegalStateException("3, " + this.f3966a);
                    }
                    try {
                        obj = i7Var.a();
                        if (obj == null) {
                            throw new IllegalStateException("2, " + this.f3966a);
                        }
                        this.f3968c = obj;
                    } catch (Error e3) {
                        e = e3;
                        Log.println(7, "StartAppSDK", Log.getStackTraceString(e));
                        e.addSuppressed(new Exception(this.f3966a));
                        throw e;
                    } catch (RuntimeException e4) {
                        e = e4;
                        Log.println(7, "StartAppSDK", Log.getStackTraceString(e));
                        e.addSuppressed(new Exception(this.f3966a));
                        throw e;
                    }
                }
            } finally {
            }
        }
        return obj;
    }
}

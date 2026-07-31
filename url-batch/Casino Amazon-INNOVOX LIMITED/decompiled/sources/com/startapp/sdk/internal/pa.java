package com.startapp.sdk.internal;

import android.util.Log;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class pa {

    /* renamed from: a, reason: collision with root package name */
    public final String f377a;
    public volatile c7 b;
    public volatile Object c;

    public pa(c7 c7Var) {
        this.b = c7Var;
        this.f377a = c7Var.toString();
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.c;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this) {
            obj = this.c;
            if (obj == null) {
                c7 c7Var = this.b;
                this.b = null;
                if (c7Var == null) {
                    throw new IllegalStateException("3, " + this.f377a);
                }
                try {
                    obj = c7Var.call();
                    if (obj == null) {
                        throw new IllegalStateException("2, " + this.f377a);
                    }
                    this.c = obj;
                } catch (Error e) {
                    e = e;
                    Log.println(7, "StartAppSDK", Log.getStackTraceString(e));
                    e.addSuppressed(new Exception(this.f377a));
                    throw e;
                } catch (RuntimeException e2) {
                    e = e2;
                    Log.println(7, "StartAppSDK", Log.getStackTraceString(e));
                    e.addSuppressed(new Exception(this.f377a));
                    throw e;
                }
            }
        }
        return obj;
    }
}

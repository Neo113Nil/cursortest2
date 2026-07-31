package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class sb0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f11766a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Object f11767b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private cc0 f11768c;

    /* renamed from: d, reason: collision with root package name */
    private cc0 f11769d;

    private static final Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final cc0 a(Context context, po0 po0Var) {
        cc0 cc0Var;
        synchronized (this.f11766a) {
            if (this.f11768c == null) {
                this.f11768c = new cc0(c(context), po0Var, (String) sw.c().b(m10.f8152a));
            }
            cc0Var = this.f11768c;
        }
        return cc0Var;
    }

    public final cc0 b(Context context, po0 po0Var) {
        cc0 cc0Var;
        synchronized (this.f11767b) {
            if (this.f11769d == null) {
                this.f11769d = new cc0(c(context), po0Var, k30.f7363b.e());
            }
            cc0Var = this.f11769d;
        }
        return cc0Var;
    }
}

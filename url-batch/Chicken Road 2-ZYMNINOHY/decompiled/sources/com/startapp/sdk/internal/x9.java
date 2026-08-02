package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class x9 implements h7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7860a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f7861b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f7862c;

    public x9(Context context, ib ibVar, ib ibVar2) {
        this.f7860a = context;
        this.f7861b = ibVar;
        this.f7862c = ibVar2;
    }

    @Override // com.startapp.sdk.internal.h7
    public final Object a(Object obj, Object obj2, Object obj3) {
        d9 d9Var = (d9) obj;
        g9 g9Var = (g9) obj2;
        n9 n9Var = (n9) obj3;
        if (d9Var == null || g9Var == null) {
            return null;
        }
        return e9.f6844j.equals(d9Var.f6789a) ? new y9(this.f7861b, this.f7862c, d9Var, g9Var, n9Var) : new v9(this.f7860a, d9Var, g9Var, n9Var);
    }
}

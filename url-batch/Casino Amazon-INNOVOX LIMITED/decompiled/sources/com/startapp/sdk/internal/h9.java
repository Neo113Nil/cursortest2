package com.startapp.sdk.internal;

import android.content.Context;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class h9 implements b7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f261a;
    public final pa b;
    public final pa c;

    public h9(Context context, pa paVar, pa paVar2) {
        this.f261a = context;
        this.b = paVar;
        this.c = paVar2;
    }

    @Override // com.startapp.sdk.internal.b7
    public final Object a(Object obj, Object obj2, Object obj3) {
        n8 n8Var = (n8) obj;
        q8 q8Var = (q8) obj2;
        x8 x8Var = (x8) obj3;
        if (n8Var == null || q8Var == null) {
            return null;
        }
        return o8.j.equals(n8Var.f348a) ? new i9(this.b, this.c, n8Var, q8Var, x8Var) : new f9(this.f261a, n8Var, q8Var, x8Var);
    }
}

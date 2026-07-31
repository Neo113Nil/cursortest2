package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class cc0 {

    /* renamed from: b, reason: collision with root package name */
    static final a3.h0<ha0> f3799b = new ac0();

    /* renamed from: c, reason: collision with root package name */
    static final a3.h0<ha0> f3800c = new bc0();

    /* renamed from: a, reason: collision with root package name */
    private final nb0 f3801a;

    public cc0(Context context, po0 po0Var, String str) {
        this.f3801a = new nb0(context, po0Var, str, f3799b, f3800c);
    }

    public final <I, O> rb0<I, O> a(String str, vb0<I> vb0Var, tb0<O> tb0Var) {
        return new gc0(this.f3801a, str, vb0Var, tb0Var);
    }

    public final lc0 b() {
        return new lc0(this.f3801a);
    }
}

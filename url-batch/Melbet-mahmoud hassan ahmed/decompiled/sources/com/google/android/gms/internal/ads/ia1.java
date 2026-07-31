package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class ia1 implements kv3<Context> {

    /* renamed from: a, reason: collision with root package name */
    private final ha1 f6580a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Context> f6581b;

    public ia1(ha1 ha1Var, yv3<Context> yv3Var) {
        this.f6580a = ha1Var;
        this.f6581b = yv3Var;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        Context a7 = this.f6580a.a(((nt2) this.f6581b).b());
        sv3.b(a7);
        return a7;
    }
}

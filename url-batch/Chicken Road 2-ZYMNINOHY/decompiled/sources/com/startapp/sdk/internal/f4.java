package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class f4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g4 f6893a;

    public f4(g4 g4Var) {
        this.f6893a = g4Var;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new sf(this.f6893a.f6970a.getSharedPreferences("StartApp-dfeaf103310003d9", 0));
    }
}

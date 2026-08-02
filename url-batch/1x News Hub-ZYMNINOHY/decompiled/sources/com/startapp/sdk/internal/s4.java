package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class s4 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t4 f4416a;

    public s4(t4 t4Var) {
        this.f4416a = t4Var;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new sf(this.f4416a.f4452a.getSharedPreferences("StartApp-f401d8c3ad3d3e9b", 0));
    }
}

package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class j3 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k3 f3995a;

    public j3(k3 k3Var) {
        this.f3995a = k3Var;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new sf(this.f3995a.f4047a.getSharedPreferences("StartApp-c5f5846c2a728b2a", 0));
    }
}

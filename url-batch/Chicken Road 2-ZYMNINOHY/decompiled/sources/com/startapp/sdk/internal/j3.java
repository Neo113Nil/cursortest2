package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class j3 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k3 f7121a;

    public j3(k3 k3Var) {
        this.f7121a = k3Var;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new sf(this.f7121a.f7175a.getSharedPreferences("StartApp-c5f5846c2a728b2a", 0));
    }
}

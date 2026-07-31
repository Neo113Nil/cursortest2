package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class k94 implements gd1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7432a;

    /* renamed from: b, reason: collision with root package name */
    private final gd1 f7433b;

    public k94(Context context) {
        mj1 mj1Var = new mj1();
        this.f7432a = context.getApplicationContext();
        this.f7433b = mj1Var;
    }

    @Override // com.google.android.gms.internal.ads.gd1
    public final /* bridge */ /* synthetic */ he1 zza() {
        return new l94(this.f7432a, ((mj1) this.f7433b).zza());
    }
}

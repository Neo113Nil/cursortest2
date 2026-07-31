package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class nw extends pw<fk0> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f9347b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f9348c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ dd0 f9349d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ow f9350e;

    nw(ow owVar, Context context, String str, dd0 dd0Var) {
        this.f9350e = owVar;
        this.f9347b = context;
        this.f9348c = str;
        this.f9349d = dd0Var;
    }

    @Override // com.google.android.gms.internal.ads.pw
    protected final /* bridge */ /* synthetic */ fk0 a() {
        ow.n(this.f9347b, "rewarded");
        return new k00();
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ fk0 b(xx xxVar) {
        return xxVar.Y4(x3.b.B3(this.f9347b), this.f9348c, this.f9349d, 214106000);
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ fk0 c() {
        return sk0.a(this.f9347b, this.f9348c, this.f9349d);
    }
}

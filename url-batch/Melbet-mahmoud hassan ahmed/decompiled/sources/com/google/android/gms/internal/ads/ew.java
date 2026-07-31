package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class ew extends pw<nx> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f4776b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ pv f4777c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f4778d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ dd0 f4779e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ow f4780f;

    ew(ow owVar, Context context, pv pvVar, String str, dd0 dd0Var) {
        this.f4780f = owVar;
        this.f4776b = context;
        this.f4777c = pvVar;
        this.f4778d = str;
        this.f4779e = dd0Var;
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ nx a() {
        ow.n(this.f4776b, "banner");
        return new g00();
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ nx b(xx xxVar) {
        return xxVar.G3(x3.b.B3(this.f4776b), this.f4777c, this.f4778d, this.f4779e, 214106000);
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ nx c() {
        jv jvVar;
        jvVar = this.f4780f.f9841a;
        return jvVar.c(this.f4776b, this.f4777c, this.f4778d, this.f4779e, 1);
    }
}

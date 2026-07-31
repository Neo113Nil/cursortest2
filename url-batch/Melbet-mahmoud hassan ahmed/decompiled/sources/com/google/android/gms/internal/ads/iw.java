package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class iw extends pw<nx> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f6802b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ pv f6803c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f6804d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ dd0 f6805e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ow f6806f;

    iw(ow owVar, Context context, pv pvVar, String str, dd0 dd0Var) {
        this.f6806f = owVar;
        this.f6802b = context;
        this.f6803c = pvVar;
        this.f6804d = str;
        this.f6805e = dd0Var;
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ nx a() {
        ow.n(this.f6802b, "interstitial");
        return new g00();
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ nx b(xx xxVar) {
        return xxVar.g2(x3.b.B3(this.f6802b), this.f6803c, this.f6804d, this.f6805e, 214106000);
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ nx c() {
        jv jvVar;
        jvVar = this.f6806f.f9841a;
        return jvVar.c(this.f6802b, this.f6803c, this.f6804d, this.f6805e, 2);
    }
}

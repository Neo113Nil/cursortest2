package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class gw extends pw<nx> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f5780b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ pv f5781c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f5782d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ dd0 f5783e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ow f5784f;

    gw(ow owVar, Context context, pv pvVar, String str, dd0 dd0Var) {
        this.f5784f = owVar;
        this.f5780b = context;
        this.f5781c = pvVar;
        this.f5782d = str;
        this.f5783e = dd0Var;
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ nx a() {
        ow.n(this.f5780b, "app_open");
        return new g00();
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ nx b(xx xxVar) {
        return xxVar.E5(x3.b.B3(this.f5780b), this.f5781c, this.f5782d, this.f5783e, 214106000);
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ nx c() {
        jv jvVar;
        jvVar = this.f5784f.f9841a;
        return jvVar.c(this.f5780b, this.f5781c, this.f5782d, this.f5783e, 4);
    }
}

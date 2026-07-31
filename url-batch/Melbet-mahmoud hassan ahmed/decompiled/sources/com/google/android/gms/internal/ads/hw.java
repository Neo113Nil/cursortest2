package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class hw extends pw<nx> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f6437b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ pv f6438c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f6439d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ow f6440e;

    hw(ow owVar, Context context, pv pvVar, String str) {
        this.f6440e = owVar;
        this.f6437b = context;
        this.f6438c = pvVar;
        this.f6439d = str;
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ nx a() {
        ow.n(this.f6437b, "search");
        return new g00();
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ nx b(xx xxVar) {
        return xxVar.c3(x3.b.B3(this.f6437b), this.f6438c, this.f6439d, 214106000);
    }

    @Override // com.google.android.gms.internal.ads.pw
    public final /* bridge */ /* synthetic */ nx c() {
        jv jvVar;
        jvVar = this.f6440e.f9841a;
        return jvVar.c(this.f6437b, this.f6438c, this.f6439d, null, 3);
    }
}

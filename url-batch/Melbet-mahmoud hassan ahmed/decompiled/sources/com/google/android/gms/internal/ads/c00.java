package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class c00 extends fx {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ d00 f3675f;

    /* synthetic */ c00(d00 d00Var, b00 b00Var) {
        this.f3675f = d00Var;
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final void Y1(kv kvVar) {
        q1(kvVar, 1);
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final String b() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final String d() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final boolean h() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.gx
    public final void q1(kv kvVar, int i7) {
        io0.d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        bo0.f3473b.post(new a00(this));
    }
}

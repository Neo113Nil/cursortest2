package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ch2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    public final qr2 f3847a;

    public ch2(qr2 qr2Var) {
        this.f3847a = qr2Var;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        Bundle bundle2 = bundle;
        qr2 qr2Var = this.f3847a;
        if (qr2Var != null) {
            bundle2.putBoolean("render_in_browser", qr2Var.d());
            bundle2.putBoolean("disable_ml", this.f3847a.c());
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class hf2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    public final double f6220a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6221b;

    public hf2(double d7, boolean z6) {
        this.f6220a = d7;
        this.f6221b = z6;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle a7 = vs2.a(bundle2, "device");
        bundle2.putBundle("device", a7);
        Bundle a8 = vs2.a(a7, "battery");
        a7.putBundle("battery", a8);
        a8.putBoolean("is_charging", this.f6221b);
        a8.putDouble("battery_level", this.f6220a);
    }
}

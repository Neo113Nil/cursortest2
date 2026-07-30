package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.os, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3708os implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final double f33227a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33228b;

    public C3708os(boolean z8, double d2) {
        this.f33227a = d2;
        this.f33228b = z8;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle b9 = AbstractC2720Pd.b("device", bundle);
        bundle.putBundle("device", b9);
        Bundle b10 = AbstractC2720Pd.b("battery", b9);
        b9.putBundle("battery", b10);
        b10.putBoolean("is_charging", this.f33228b);
        b10.putDouble("battery_level", this.f33227a);
    }
}

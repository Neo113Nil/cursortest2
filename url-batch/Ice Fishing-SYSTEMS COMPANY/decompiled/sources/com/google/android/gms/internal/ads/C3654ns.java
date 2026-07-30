package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ns, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3654ns implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final int f33043a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33044b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33045c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33046d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33047e;

    /* renamed from: f, reason: collision with root package name */
    public final int f33048f;

    /* renamed from: g, reason: collision with root package name */
    public final int f33049g;

    /* renamed from: h, reason: collision with root package name */
    public final int f33050h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f33051j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f33052k;

    public C3654ns(int i, boolean z8, boolean z9, int i4, int i9, int i10, int i11, int i12, float f6, boolean z10, boolean z11) {
        this.f33043a = i;
        this.f33044b = z8;
        this.f33045c = z9;
        this.f33046d = i4;
        this.f33047e = i9;
        this.f33048f = i10;
        this.f33049g = i11;
        this.f33050h = i12;
        this.i = f6;
        this.f33051j = z10;
        this.f33052k = z11;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.sc)).booleanValue()) {
            bundle.putInt("muv_min", this.f33047e);
            bundle.putInt("muv_max", this.f33048f);
        }
        bundle.putFloat("android_app_volume", this.i);
        bundle.putBoolean("android_app_muted", this.f33051j);
        if (this.f33052k) {
            return;
        }
        bundle.putInt("am", this.f33043a);
        bundle.putBoolean("ma", this.f33044b);
        bundle.putBoolean("sp", this.f33045c);
        bundle.putInt("muv", this.f33046d);
        bundle.putInt("rm", this.f33049g);
        bundle.putInt("riv", this.f33050h);
    }
}

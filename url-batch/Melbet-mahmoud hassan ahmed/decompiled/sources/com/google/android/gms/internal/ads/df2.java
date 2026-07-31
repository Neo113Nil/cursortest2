package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class df2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    public final int f4194a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4195b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4196c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4197d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4198e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4199f;

    /* renamed from: g, reason: collision with root package name */
    public final float f4200g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4201h;

    public df2(int i7, boolean z6, boolean z7, int i8, int i9, int i10, float f7, boolean z8) {
        this.f4194a = i7;
        this.f4195b = z6;
        this.f4196c = z7;
        this.f4197d = i8;
        this.f4198e = i9;
        this.f4199f = i10;
        this.f4200g = f7;
        this.f4201h = z8;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putInt("am", this.f4194a);
        bundle2.putBoolean("ma", this.f4195b);
        bundle2.putBoolean("sp", this.f4196c);
        bundle2.putInt("muv", this.f4197d);
        bundle2.putInt("rm", this.f4198e);
        bundle2.putInt("riv", this.f4199f);
        bundle2.putFloat("android_app_volume", this.f4200g);
        bundle2.putBoolean("android_app_muted", this.f4201h);
    }
}

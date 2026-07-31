package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class yi2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14697a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14698b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14699c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14700d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14701e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14702f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14703g;

    public yi2(boolean z6, boolean z7, String str, boolean z8, int i7, int i8, int i9) {
        this.f14697a = z6;
        this.f14698b = z7;
        this.f14699c = str;
        this.f14700d = z8;
        this.f14701e = i7;
        this.f14702f = i8;
        this.f14703g = i9;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("js", this.f14699c);
        bundle2.putBoolean("is_nonagon", true);
        bundle2.putString("extra_caps", (String) sw.c().b(m10.f8259n2));
        bundle2.putInt("target_api", this.f14701e);
        bundle2.putInt("dv", this.f14702f);
        bundle2.putInt("lv", this.f14703g);
        Bundle a7 = vs2.a(bundle2, "sdk_env");
        a7.putBoolean("mf", b30.f3180a.e().booleanValue());
        a7.putBoolean("instant_app", this.f14697a);
        a7.putBoolean("lite", this.f14698b);
        a7.putBoolean("is_privileged_process", this.f14700d);
        bundle2.putBundle("sdk_env", a7);
        Bundle a8 = vs2.a(a7, "build_meta");
        a8.putString("cl", "428884702");
        a8.putString("rapid_rc", "dev");
        a8.putString("rapid_rollup", "HEAD");
        a7.putBundle("build_meta", a8);
    }
}

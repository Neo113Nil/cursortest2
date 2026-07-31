package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nj2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9125a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9126b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9127c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9128d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9129e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9130f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9131g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList<String> f9132h;

    /* renamed from: i, reason: collision with root package name */
    public final String f9133i;

    /* renamed from: j, reason: collision with root package name */
    public final String f9134j;

    /* renamed from: k, reason: collision with root package name */
    public final String f9135k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f9136l;

    /* renamed from: m, reason: collision with root package name */
    public final String f9137m;

    /* renamed from: n, reason: collision with root package name */
    public final long f9138n;

    public nj2(boolean z6, boolean z7, String str, boolean z8, boolean z9, boolean z10, String str2, ArrayList<String> arrayList, String str3, String str4, String str5, boolean z11, String str6, long j7) {
        this.f9125a = z6;
        this.f9126b = z7;
        this.f9127c = str;
        this.f9128d = z8;
        this.f9129e = z9;
        this.f9130f = z10;
        this.f9131g = str2;
        this.f9132h = arrayList;
        this.f9133i = str3;
        this.f9134j = str4;
        this.f9135k = str5;
        this.f9136l = z11;
        this.f9137m = str6;
        this.f9138n = j7;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putBoolean("cog", this.f9125a);
        bundle2.putBoolean("coh", this.f9126b);
        bundle2.putString("gl", this.f9127c);
        bundle2.putBoolean("simulator", this.f9128d);
        bundle2.putBoolean("is_latchsky", this.f9129e);
        bundle2.putBoolean("is_sidewinder", this.f9130f);
        bundle2.putString("hl", this.f9131g);
        if (!this.f9132h.isEmpty()) {
            bundle2.putStringArrayList("hl_list", this.f9132h);
        }
        bundle2.putString("mv", this.f9133i);
        bundle2.putString("submodel", this.f9137m);
        Bundle a7 = vs2.a(bundle2, "device");
        bundle2.putBundle("device", a7);
        a7.putString("build", this.f9135k);
        a7.putLong("remaining_data_partition_space", this.f9138n);
        Bundle a8 = vs2.a(a7, "browser");
        a7.putBundle("browser", a8);
        a8.putBoolean("is_browser_custom_tabs_capable", this.f9136l);
        if (TextUtils.isEmpty(this.f9134j)) {
            return;
        }
        Bundle a9 = vs2.a(a7, "play_store");
        a7.putBundle("play_store", a9);
        a9.putString("package_version", this.f9134j);
    }
}

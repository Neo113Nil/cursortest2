package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class rj2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    public final String f11172a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11173b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11174c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11175d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11176e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11177f;

    public rj2(String str, int i7, int i8, int i9, boolean z6, int i10) {
        this.f11172a = str;
        this.f11173b = i7;
        this.f11174c = i8;
        this.f11175d = i9;
        this.f11176e = z6;
        this.f11177f = i10;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        Bundle bundle2 = bundle;
        vs2.g(bundle2, "carrier", this.f11172a, !TextUtils.isEmpty(r0));
        vs2.f(bundle2, "cnt", Integer.valueOf(this.f11173b), this.f11173b != -2);
        bundle2.putInt("gnt", this.f11174c);
        bundle2.putInt("pt", this.f11175d);
        Bundle a7 = vs2.a(bundle2, "device");
        bundle2.putBundle("device", a7);
        Bundle a8 = vs2.a(a7, "network");
        a7.putBundle("network", a8);
        a8.putInt("active_network_state", this.f11177f);
        a8.putBoolean("active_network_metered", this.f11176e);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
final class yf2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final String f14668a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14669b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f14670c;

    /* synthetic */ yf2(String str, String str2, Bundle bundle, xf2 xf2Var) {
        this.f14668a = str;
        this.f14669b = str2;
        this.f14670c = bundle;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("consent_string", this.f14668a);
        bundle2.putString("fc_consent", this.f14669b);
        bundle2.putBundle("iab_consent_info", this.f14670c);
    }
}

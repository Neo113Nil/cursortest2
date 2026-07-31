package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class we2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final String f13803a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13804b;

    public we2(String str, int i7) {
        this.f13803a = str;
        this.f13804b = i7;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (TextUtils.isEmpty(this.f13803a) || this.f13804b == -1) {
            return;
        }
        Bundle a7 = vs2.a(bundle2, "pii");
        bundle2.putBundle("pii", a7);
        a7.putString("pvid", this.f13803a);
        a7.putInt("pvid_s", this.f13804b);
    }
}

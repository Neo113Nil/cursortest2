package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class yg2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f14678a;

    public yg2(Bundle bundle) {
        this.f14678a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle a7 = vs2.a(bundle2, "device");
        a7.putBundle("android_mem_info", this.f14678a);
        bundle2.putBundle("device", a7);
    }
}

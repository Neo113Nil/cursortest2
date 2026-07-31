package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ii2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final String f6660a;

    public ii2(String str) {
        this.f6660a = str;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        bundle.putString("rtb", this.f6660a);
    }
}

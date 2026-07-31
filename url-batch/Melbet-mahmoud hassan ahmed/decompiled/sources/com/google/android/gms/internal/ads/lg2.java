package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class lg2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f7967a;

    public lg2(boolean z6) {
        this.f7967a = z6;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        bundle.putBoolean("is_gbid", this.f7967a);
    }
}

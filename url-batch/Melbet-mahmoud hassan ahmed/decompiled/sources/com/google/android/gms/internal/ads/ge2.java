package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ge2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f5586a;

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (this.f5586a.isEmpty()) {
            return;
        }
        bundle2.putBundle("installed_adapter_data", this.f5586a);
    }
}

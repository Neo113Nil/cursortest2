package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class wh2 implements hj2<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f13827a;

    public wh2(Bundle bundle) {
        this.f13827a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.hj2
    public final /* bridge */ /* synthetic */ void c(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle bundle3 = this.f13827a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class bj2 implements ij2<hj2<Bundle>> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f3446a;

    bj2(kp2 kp2Var) {
        this.f3446a = kp2Var != null;
    }

    @Override // com.google.android.gms.internal.ads.ij2
    public final cc3<hj2<Bundle>> a() {
        return rb3.i(this.f3446a ? new hj2() { // from class: com.google.android.gms.internal.ads.aj2
            @Override // com.google.android.gms.internal.ads.hj2
            public final void c(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}

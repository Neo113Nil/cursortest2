package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* loaded from: classes.dex */
public final class rc1 extends lg1<o03> implements s60 {

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f11102g;

    public rc1(Set<hi1<o03>> set) {
        super(set);
        this.f11102g = new Bundle();
    }

    public final synchronized Bundle S0() {
        return new Bundle(this.f11102g);
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final synchronized void t(String str, Bundle bundle) {
        this.f11102g.putAll(bundle);
        R0(new kg1() { // from class: com.google.android.gms.internal.ads.qc1
            @Override // com.google.android.gms.internal.ads.kg1
            public final void c(Object obj) {
                ((o03) obj).y();
            }
        });
    }
}

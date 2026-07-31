package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class ob1 extends lg1<qb1> {

    /* renamed from: g, reason: collision with root package name */
    private boolean f9593g;

    public ob1(Set<hi1<qb1>> set) {
        super(set);
        this.f9593g = false;
    }

    public final synchronized void zza() {
        if (this.f9593g) {
            return;
        }
        R0(new kg1() { // from class: com.google.android.gms.internal.ads.nb1
            @Override // com.google.android.gms.internal.ads.kg1
            public final void c(Object obj) {
                ((qb1) obj).k();
            }
        });
        this.f9593g = true;
    }
}

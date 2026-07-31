package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class ib1 extends lg1<mb1> implements za1 {
    public ib1(Set<hi1<mb1>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final void a() {
        R0(new kg1() { // from class: com.google.android.gms.internal.ads.hb1
            @Override // com.google.android.gms.internal.ads.kg1
            public final void c(Object obj) {
                ((mb1) obj).M0(dt2.d(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final void d(final cv cvVar) {
        R0(new kg1() { // from class: com.google.android.gms.internal.ads.fb1
            @Override // com.google.android.gms.internal.ads.kg1
            public final void c(Object obj) {
                ((mb1) obj).M0(cv.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.za1
    public final void r0(final ok1 ok1Var) {
        if (((Boolean) sw.c().b(m10.i7)).booleanValue()) {
            R0(new kg1() { // from class: com.google.android.gms.internal.ads.gb1
                @Override // com.google.android.gms.internal.ads.kg1
                public final void c(Object obj) {
                    ((mb1) obj).M0(dt2.d(12, ok1.this.getMessage(), null));
                }
            });
        }
    }
}

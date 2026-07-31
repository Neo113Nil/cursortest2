package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* loaded from: classes.dex */
public final class vb1 extends lg1<rb1> {
    public vb1(Set<hi1<rb1>> set) {
        super(set);
    }

    public final void S0(final Context context) {
        R0(new kg1() { // from class: com.google.android.gms.internal.ads.sb1
            @Override // com.google.android.gms.internal.ads.kg1
            public final void c(Object obj) {
                ((rb1) obj).y(context);
            }
        });
    }

    public final void U0(final Context context) {
        R0(new kg1() { // from class: com.google.android.gms.internal.ads.tb1
            @Override // com.google.android.gms.internal.ads.kg1
            public final void c(Object obj) {
                ((rb1) obj).r(context);
            }
        });
    }

    public final void Z0(final Context context) {
        R0(new kg1() { // from class: com.google.android.gms.internal.ads.ub1
            @Override // com.google.android.gms.internal.ads.kg1
            public final void c(Object obj) {
                ((rb1) obj).f(context);
            }
        });
    }
}

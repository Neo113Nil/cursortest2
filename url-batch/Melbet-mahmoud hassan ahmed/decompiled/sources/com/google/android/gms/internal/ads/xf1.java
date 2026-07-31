package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class xf1 extends lg1<fe> implements u60 {
    public xf1(Set<hi1<fe>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.u60
    public final synchronized void Q(final String str, final String str2) {
        R0(new kg1() { // from class: com.google.android.gms.internal.ads.wf1
            @Override // com.google.android.gms.internal.ads.kg1
            public final void c(Object obj) {
                ((fe) obj).c(str, str2);
            }
        });
    }
}

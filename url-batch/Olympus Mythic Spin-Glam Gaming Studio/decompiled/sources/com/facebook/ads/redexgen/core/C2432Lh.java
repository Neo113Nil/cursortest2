package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2432Lh extends AbstractRunnableC2705Wc {
    public final WeakReference<C3163fp> A00;

    public C2432Lh(C3163fp c3163fp) {
        this.A00 = new WeakReference<>(c3163fp);
    }

    public C2432Lh(WeakReference<C3163fp> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        C3163fp viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}

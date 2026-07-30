package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ko, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0561Ko extends AbstractRunnableC0846Vt {
    public final WeakReference<C1232eX> A00;

    public C0561Ko(C1232eX c1232eX) {
        this.A00 = new WeakReference<>(c1232eX);
    }

    public C0561Ko(WeakReference<C1232eX> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        C1232eX viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}

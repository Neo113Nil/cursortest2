package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* renamed from: com.facebook.ads.redexgen.X.eD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3064eD extends AbstractRunnableC2705Wc {
    public final /* synthetic */ C3214ge A00;

    public C3064eD(C3214ge c3214ge) {
        this.A00 = c3214ge;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}

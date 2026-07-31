package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.facebook.ads.internal.api.BidderTokenProviderApi;

/* renamed from: com.facebook.ads.redexgen.X.Rn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2589Rn implements BidderTokenProviderApi {
    public final C2615So A00 = new C2615So();

    public final C2615So A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.BidderTokenProviderApi
    public final String getBidderToken(Context context) {
        return this.A00.A06(C2591Rp.A09(context));
    }
}

package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.bridge.gms.AdvertisingId;

/* renamed from: com.facebook.ads.redexgen.X.Xm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0953Xm implements C7W {
    public final /* synthetic */ AdvertisingId A00;
    public final /* synthetic */ C0952Xl A01;

    public C0953Xm(C0952Xl c0952Xl, AdvertisingId advertisingId) {
        this.A01 = c0952Xl;
        this.A00 = advertisingId;
    }

    @Override // com.facebook.ads.redexgen.X.C7W
    public final boolean A8w() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.facebook.ads.redexgen.X.C7W
    public final String getId() {
        return this.A00.getId();
    }
}

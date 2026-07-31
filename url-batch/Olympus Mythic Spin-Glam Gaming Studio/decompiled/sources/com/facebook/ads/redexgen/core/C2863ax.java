package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.bridge.gms.AdvertisingId;

/* renamed from: com.facebook.ads.redexgen.X.ax, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2863ax implements TC {
    public final /* synthetic */ AdvertisingId A00;
    public final /* synthetic */ C2854ao A01;

    public C2863ax(C2854ao c2854ao, AdvertisingId advertisingId) {
        this.A01 = c2854ao;
        this.A00 = advertisingId;
    }

    @Override // com.facebook.ads.redexgen.core.TC
    public final boolean AAX() {
        return this.A00.isLimitAdTracking();
    }

    @Override // com.facebook.ads.redexgen.core.TC
    public final String getId() {
        return this.A00.getId();
    }
}

package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.mn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2185mn implements HY {
    public final long A00;
    public final HX A01;

    public C2185mn(long j9) {
        this(j9, 0L);
    }

    public C2185mn(long j9, long j10) {
        this.A00 = j9;
        this.A01 = new HX(j10 == 0 ? HZ.A04 : new HZ(0L, j10));
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final long A7t() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final HX A91(long j9) {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final boolean AAj() {
        return false;
    }
}

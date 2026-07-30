package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.9C, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C9C extends Timeline {
    public final Timeline A00;

    public C9C(Timeline timeline) {
        this.A00 = timeline;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A06() {
        return this.A00.A06();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A07() {
        return this.A00.A07();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public int A08(int i, int i2, boolean z) {
        return this.A00.A08(i, i2, z);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public int A0A(Object obj) {
        return this.A00.A0A(obj);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0B(boolean z) {
        return this.A00.A0B(z);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0C(boolean z) {
        return this.A00.A0C(z);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public C1807oN A0I(int i, C1807oN c1807oN, boolean z) {
        return this.A00.A0I(i, c1807oN, z);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public C1805oL A0L(int i, C1805oL c1805oL, long j) {
        return this.A00.A0L(i, c1805oL, j);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public Object A0M(int i) {
        return this.A00.A0M(i);
    }
}

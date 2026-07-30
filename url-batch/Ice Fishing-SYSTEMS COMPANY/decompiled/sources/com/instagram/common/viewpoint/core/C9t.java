package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.9t, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C9t extends Timeline {
    public final Timeline A00;

    public C9t(Timeline timeline) {
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
    public int A08(int i, int i4, boolean z8) {
        return this.A00.A08(i, i4, z8);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public int A0A(Object obj) {
        return this.A00.A0A(obj);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0B(boolean z8) {
        return this.A00.A0B(z8);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0C(boolean z8) {
        return this.A00.A0C(z8);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public C2366pl A0I(int i, C2366pl c2366pl, boolean z8) {
        return this.A00.A0I(i, c2366pl, z8);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public C2364pj A0L(int i, C2364pj c2364pj, long j9) {
        return this.A00.A0L(i, c2364pj, j9);
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public Object A0M(int i) {
        return this.A00.A0M(i);
    }
}

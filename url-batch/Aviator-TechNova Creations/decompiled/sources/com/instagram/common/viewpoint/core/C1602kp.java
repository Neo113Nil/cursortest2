package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.kp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1602kp implements I8 {
    public final /* synthetic */ MatroskaExtractor A00;

    public C1602kp(MatroskaExtractor matroskaExtractor) {
        this.A00 = matroskaExtractor;
    }

    @Override // com.instagram.common.viewpoint.core.I8
    public final void A4a(int i, int i2, InterfaceC1625lN interfaceC1625lN) throws IOException {
        this.A00.A0U(i, i2, interfaceC1625lN);
    }

    @Override // com.instagram.common.viewpoint.core.I8
    public final void A6F(int i) throws C01042i {
        this.A00.A0S(i);
    }

    @Override // com.instagram.common.viewpoint.core.I8
    public final void A6S(int i, double d) throws C01042i {
        this.A00.A0T(i, d);
    }

    @Override // com.instagram.common.viewpoint.core.I8
    public final int A7m(int i) {
        return this.A00.A0R(i);
    }

    @Override // com.instagram.common.viewpoint.core.I8
    public final void AA9(int i, long j) throws C01042i {
        this.A00.A0V(i, j);
    }

    @Override // com.instagram.common.viewpoint.core.I8
    public final boolean AAN(int i) {
        return this.A00.A0Y(i);
    }

    @Override // com.instagram.common.viewpoint.core.I8
    public final void AJO(int i, long j, long j2) throws C01042i {
        this.A00.A0W(i, j, j2);
    }

    @Override // com.instagram.common.viewpoint.core.I8
    public final void AJZ(int i, String str) throws C01042i {
        this.A00.A0X(i, str);
    }
}

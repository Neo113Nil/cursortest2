package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class X2 implements InterfaceC0409Bm {
    @Override // com.facebook.ads.redexgen.X.InterfaceC0409Bm
    public final void A5j(Format format) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0409Bm
    public final int AEq(InterfaceC0400Bb interfaceC0400Bb, int i, boolean z) throws IOException, InterruptedException {
        int AFb = interfaceC0400Bb.AFb(i);
        if (AFb == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return AFb;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0409Bm
    public final void AEr(C0541Hh c0541Hh, int i) {
        c0541Hh.A0Z(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0409Bm
    public final void AEs(long j, int i, int i2, int i3, C0408Bl c0408Bl) {
    }
}

package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0904Vm implements InterfaceC0477Et {
    public static String[] A03 = {"2iJQWlRsUDoPLtxxhE0wL9Cx9C7nOBrU", "oJgjoNY6hjjHJmelHDlI5xZuIY2b67h", "lPiJTezOZt4yDoox6bX3l7R6F2XzCVNN", "wrWzKGBonHGMzL1uPVOM3eUURFaMzKwB", "aBcbXNoo2m3wtFqQFSiOk3RFoevM7GVG", "GcCP7ZOQcwM7LeXwSBQclRy3S6aYmmD", "JUPsbTU3PQNYOt9vjPoPUzbQPtEFF22Q", "21kt6KXNgOdDUktVBInrV9GyhB6eLfYq"};
    public boolean A00;
    public final InterfaceC0477Et A01;
    public final /* synthetic */ BW A02;

    public C0904Vm(BW bw, InterfaceC0477Et interfaceC0477Et) {
        this.A02 = bw;
        this.A01 = interfaceC0477Et;
    }

    public final void A00() {
        this.A00 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0477Et
    public final boolean A90() {
        return !this.A02.A03() && this.A01.A90();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0477Et
    public final void AA2() throws IOException {
        this.A01.AA2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r0 != 0) goto L15;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0477Et
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AEC(C9X c9x, XE xe, boolean z) {
        if (this.A02.A03()) {
            return -3;
        }
        if (this.A00) {
            xe.A02(4);
            return -4;
        }
        int AEC = this.A01.AEC(c9x, xe, z);
        if (AEC == -5) {
            Format format = c9x.A00;
            int result = format.A06;
            if (result == 0) {
                int result2 = format.A07;
            }
            int encoderPadding = this.A02.A01 != 0 ? 0 : format.A06;
            c9x.A00 = format.A0G(encoderPadding, this.A02.A00 == Long.MIN_VALUE ? format.A07 : 0);
            return -5;
        }
        if (this.A02.A00 != Long.MIN_VALUE && ((AEC == -4 && xe.A00 >= this.A02.A00) || (AEC == -3 && this.A02.A68() == Long.MIN_VALUE))) {
            xe.A07();
            xe.A02(4);
            this.A00 = true;
            return -4;
        }
        return AEC;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0477Et
    public final int AFd(long j) {
        if (!this.A02.A03()) {
            return this.A01.AFd(j);
        }
        if (A03[7].charAt(6) == 'T') {
            throw new RuntimeException();
        }
        A03[0] = "I7Vle9theSHJs2vfg5SYnPGKFT8j8RVM";
        return -3;
    }
}

package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class Bx {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public boolean A04;
    public final byte[] A05 = new byte[10];

    public final void A00() {
        this.A04 = false;
    }

    public final void A01(InterfaceC0400Bb interfaceC0400Bb, int i, int i2) throws IOException, InterruptedException {
        if (!this.A04) {
            interfaceC0400Bb.ADl(this.A05, 0, 10);
            interfaceC0400Bb.AEm();
            if (A8.A06(this.A05) == -1) {
                return;
            }
            this.A04 = true;
            this.A02 = 0;
        }
        if (this.A02 == 0) {
            this.A00 = i;
            this.A01 = 0;
        }
        this.A01 += i2;
    }

    public final void A02(C0415Bw c0415Bw) {
        if (this.A04 && this.A02 > 0) {
            c0415Bw.A0W.AEs(this.A03, this.A00, this.A01, 0, c0415Bw.A0V);
            this.A02 = 0;
        }
    }

    public final void A03(C0415Bw c0415Bw, long j) {
        if (!this.A04) {
            return;
        }
        int i = this.A02;
        int i2 = i + 1;
        this.A02 = i2;
        if (i == 0) {
            this.A03 = j;
        }
        if (i2 < 16) {
            return;
        }
        c0415Bw.A0W.AEs(this.A03, this.A00, this.A01, 0, c0415Bw.A0V);
        this.A02 = 0;
    }
}

package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;

/* renamed from: com.facebook.ads.redexgen.X.Kz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1045Kz {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final InterfaceC0946Hd A07;

    public C1045Kz(InterfaceC0946Hd interfaceC0946Hd) {
        this.A07 = interfaceC0946Hd;
    }

    public final void A00() {
        this.A05 = false;
        this.A04 = false;
        this.A06 = false;
        this.A00 = -1;
    }

    public final void A01(int i, long j9) {
        this.A00 = i;
        this.A06 = false;
        boolean z8 = true;
        this.A05 = i == 182 || i == 179;
        if (i != 182) {
            z8 = false;
        }
        this.A04 = z8;
        this.A01 = 0;
        this.A03 = j9;
    }

    public final void A02(long j9, int i, boolean z8) {
        if (this.A00 == 182 && z8 && this.A05 && this.A03 != b.f6539b) {
            this.A07.AIu(this.A03, this.A06 ? 1 : 0, (int) (j9 - this.A02), i, null);
        }
        if (this.A00 != 179) {
            this.A02 = j9;
        }
    }

    public final void A03(byte[] bArr, int i, int i4) {
        if (this.A04) {
            int i9 = (i + 1) - this.A01;
            if (i9 < i4) {
                int headerOffset = bArr[i9];
                this.A06 = ((headerOffset & 192) >> 6) == 0;
                this.A04 = false;
                return;
            }
            this.A01 += i4 - i;
        }
    }
}

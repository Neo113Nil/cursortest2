package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.8v, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C03438v {
    public final int A00;
    public final C03408s A01;

    public C03438v(int i, C03408s c03408s) {
        this.A00 = i;
        this.A01 = c03408s;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() throws IOException {
        return this.A01.A05();
    }

    public final C8j A02(int i, byte[] bArr, int i2, int[] iArr, int i3) throws IOException {
        return this.A01.A06(i, bArr, i2, iArr, i3);
    }

    public final void A03() throws IOException {
        this.A01.A07();
    }

    public final void A04() throws IOException {
        this.A01.A08();
    }

    public final boolean A05(byte[] bArr) throws IOException {
        return this.A01.A09(bArr);
    }
}

package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* loaded from: assets/audience_network.dex */
public final class WE implements InterfaceC0420Cg {
    public static String[] A0C = {"M8nxhoQeDkjHEk3tjnypaUsJeky9pUPe", "22wDV1USJ2tZABUEWkFG7fElxPqoDepQ", "WSXmuBny7XXEQ4s813c9BSbsqOjqSskJ", "KVrLQEQFGtTXAXMopyF5dj", "jUO9kFQXOuNF5MkzWpfFf35Wzr3tp3jj", "UgJN", "fATsZHYNQKGGAXuN", "X77CUtb4yEwh8nH4MH"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public InterfaceC0409Bm A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final Bg A09;
    public final C0541Hh A0A;
    public final String A0B;

    public WE() {
        this(null);
    }

    public WE(String str) {
        this.A02 = 0;
        C0541Hh c0541Hh = new C0541Hh(4);
        this.A0A = c0541Hh;
        c0541Hh.A00[0] = -1;
        this.A09 = new Bg();
        this.A0B = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b A[LOOP:0: B:2:0x000a->B:13:0x003b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A00(C0541Hh c0541Hh) {
        boolean z;
        byte[] bArr = c0541Hh.A00;
        int A07 = c0541Hh.A07();
        for (int A06 = c0541Hh.A06(); A06 < A07; A06++) {
            int startOffset = bArr[A06];
            boolean z2 = (startOffset & 255) == 255;
            if (this.A08) {
                int startOffset2 = bArr[A06];
                if ((startOffset2 & 224) == 224) {
                    z = true;
                    this.A08 = z2;
                    if (!z) {
                        c0541Hh.A0Y(A06 + 1);
                        this.A08 = false;
                        this.A0A.A00[1] = bArr[A06];
                        this.A00 = 2;
                        this.A02 = 1;
                        return;
                    }
                }
            }
            z = false;
            this.A08 = z2;
            if (!z) {
            }
        }
        c0541Hh.A0Y(A07);
    }

    private void A01(C0541Hh c0541Hh) {
        int min = Math.min(c0541Hh.A04(), this.A01 - this.A00);
        this.A05.AEr(c0541Hh, min);
        int bytesToRead = this.A00 + min;
        this.A00 = bytesToRead;
        int i = this.A01;
        if (bytesToRead < i) {
            return;
        }
        InterfaceC0409Bm interfaceC0409Bm = this.A05;
        if (A0C[2].charAt(7) == 'H') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "Ix3a1KSHqy7cK1t6WtGmlZzK6PY1tVDv";
        strArr[1] = "TW6fubs4zpuEa3cAWqrpZRXJHWdUZhrV";
        interfaceC0409Bm.AEs(this.A04, 1, i, 0, null);
        this.A04 += this.A03;
        this.A00 = 0;
        this.A02 = 0;
    }

    private void A02(C0541Hh c0541Hh) {
        int min = Math.min(c0541Hh.A04(), 4 - this.A00);
        c0541Hh.A0c(this.A0A.A00, this.A00, min);
        int i = this.A00 + min;
        this.A00 = i;
        if (i < 4) {
            return;
        }
        this.A0A.A0Y(0);
        if (Bg.A04(this.A0A.A08(), this.A09)) {
            this.A01 = this.A09.A02;
            if (!this.A07) {
                this.A03 = (this.A09.A04 * 1000000) / this.A09.A03;
                this.A05.A5j(Format.A07(this.A06, this.A09.A06, null, -1, 4096, this.A09.A01, this.A09.A03, null, null, 0, this.A0B));
                this.A07 = true;
            }
            this.A0A.A0Y(0);
            this.A05.AEr(this.A0A, 4);
            this.A02 = 2;
            return;
        }
        this.A00 = 0;
        this.A02 = 1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0420Cg
    public final void A4O(C0541Hh c0541Hh) {
        while (c0541Hh.A04() > 0) {
            switch (this.A02) {
                case 0:
                    A00(c0541Hh);
                    break;
                case 1:
                    A02(c0541Hh);
                    break;
                case 2:
                    A01(c0541Hh);
                    break;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0420Cg
    public final void A4l(InterfaceC0401Bc interfaceC0401Bc, C0431Cu c0431Cu) {
        c0431Cu.A05();
        this.A06 = c0431Cu.A04();
        this.A05 = interfaceC0401Bc.AFx(c0431Cu.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0420Cg
    public final void ADi() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0420Cg
    public final void ADj(long j, boolean z) {
        this.A04 = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0420Cg
    public final void AEv() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
    }
}

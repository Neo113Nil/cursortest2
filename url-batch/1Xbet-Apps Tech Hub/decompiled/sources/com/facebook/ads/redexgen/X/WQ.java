package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.common.base.Ascii;

/* loaded from: assets/audience_network.dex */
public final class WQ implements InterfaceC0420Cg {
    public static String[] A0C = {"jvuSXyRxFwWN5M53JxqXTqjBlHPmO5yS", "Nx6fwt5mIYqSRgPxQoB61NXpIqViXreb", "NbRu72XFqCPxMxVeHFzrnyrjREaihhdr", "Z3KBXmMomO9rJfjLZz1JQz2Kw0Fx28Ab", "zLbRIBf4nYWkQfyOEtwQDAQMGMEl8", "zvpubyWaUoinARhzufpjCqD1DbWF7ekR", "kxIGpaDKqbCPDUN5La7nQCmFVSx", "CqFgkkKKOYx1Bj1EdbgCjsaN4ksOOdQn"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public Format A05;
    public InterfaceC0409Bm A06;
    public String A07;
    public boolean A08;
    public final C0540Hg A09;
    public final C0541Hh A0A;
    public final String A0B;

    public WQ() {
        this(null);
    }

    public WQ(String str) {
        C0540Hg c0540Hg = new C0540Hg(new byte[128]);
        this.A09 = c0540Hg;
        this.A0A = new C0541Hh(c0540Hg.A00);
        this.A02 = 0;
        this.A0B = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r2.A05 == r14.A05.A0O) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A00() {
        this.A09.A07(0);
        A7 A09 = A8.A09(this.A09);
        if (this.A05 != null && A09.A00 == this.A05.A05) {
            int i = A09.A03;
            int i2 = this.A05.A0C;
            if (A0C[6].length() != 27) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[2] = "rmTuGOWOeoxLIH1QLptnusvxizN1V0jV";
            strArr[5] = "2RMufqWRuZFq3WutxyrHt00cbPeHqbYj";
            if (i == i2) {
            }
        }
        Format A07 = Format.A07(this.A07, A09.A05, null, -1, -1, A09.A00, A09.A03, null, null, 0, this.A0B);
        this.A05 = A07;
        this.A06.A5j(A07);
        this.A01 = A09.A01;
        this.A03 = (A09.A02 * 1000000) / this.A05.A0C;
    }

    private boolean A01(C0541Hh c0541Hh) {
        while (true) {
            if (c0541Hh.A04() <= 0) {
                return false;
            }
            if (!this.A08) {
                this.A08 = c0541Hh.A0E() == 11;
            } else {
                int A0E = c0541Hh.A0E();
                if (A0E == 119) {
                    this.A08 = false;
                    return true;
                }
                this.A08 = A0E == 11;
            }
        }
    }

    private boolean A02(C0541Hh c0541Hh, byte[] bArr, int i) {
        int min = Math.min(c0541Hh.A04(), i - this.A00);
        int bytesToRead = this.A00;
        c0541Hh.A0c(bArr, bytesToRead, min);
        int bytesToRead2 = this.A00;
        int bytesToRead3 = bytesToRead2 + min;
        this.A00 = bytesToRead3;
        return bytesToRead3 == i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0420Cg
    public final void A4O(C0541Hh c0541Hh) {
        while (true) {
            int A04 = c0541Hh.A04();
            if (A0C[3].charAt(28) != '2') {
                throw new RuntimeException();
            }
            A0C[6] = "j4ZJ9Sb1FxDogpbJuhr4W7MrwTg";
            if (A04 > 0) {
                switch (this.A02) {
                    case 0:
                        if (!A01(c0541Hh)) {
                            break;
                        } else {
                            this.A02 = 1;
                            this.A0A.A00[0] = Ascii.VT;
                            this.A0A.A00[1] = 119;
                            this.A00 = 2;
                            break;
                        }
                    case 1:
                        if (!A02(c0541Hh, this.A0A.A00, 128)) {
                            break;
                        } else {
                            A00();
                            this.A0A.A0Y(0);
                            this.A06.AEr(this.A0A, 128);
                            this.A02 = 2;
                            break;
                        }
                    case 2:
                        int min = Math.min(c0541Hh.A04(), this.A01 - this.A00);
                        this.A06.AEr(c0541Hh, min);
                        int bytesToRead = this.A00 + min;
                        this.A00 = bytesToRead;
                        int i = this.A01;
                        if (bytesToRead != i) {
                            break;
                        } else {
                            this.A06.AEs(this.A04, 1, i, 0, null);
                            long j = this.A04;
                            long j2 = this.A03;
                            String[] strArr = A0C;
                            if (strArr[0].charAt(28) == strArr[7].charAt(28)) {
                                A0C[4] = "thGmrgzi8Rkjtt3yqKW2WPJBde0Fj";
                                this.A04 = j + j2;
                                this.A02 = 0;
                                break;
                            } else {
                                this.A04 = j + j2;
                                this.A02 = 0;
                                break;
                            }
                        }
                }
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0420Cg
    public final void A4l(InterfaceC0401Bc interfaceC0401Bc, C0431Cu c0431Cu) {
        c0431Cu.A05();
        this.A07 = c0431Cu.A04();
        this.A06 = interfaceC0401Bc.AFx(c0431Cu.A03(), 1);
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

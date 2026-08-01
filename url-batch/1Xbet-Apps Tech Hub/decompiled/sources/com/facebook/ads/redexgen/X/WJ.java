package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public final class WJ implements InterfaceC0420Cg {
    public static byte[] A0D;
    public static final double[] A0E;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public InterfaceC0409Bm A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final boolean[] A0C = new boolean[4];
    public final Ch A0B = new Ch(128);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Format, Long> A00(Ch ch, String str) {
        byte[] copyOf = Arrays.copyOf(ch.A02, ch.A00);
        int i = copyOf[4] & 255;
        int i2 = copyOf[5] & 255;
        int i3 = (i << 4) | (i2 >> 4);
        int i4 = ((i2 & 15) << 8) | (copyOf[6] & 255);
        float f = 1.0f;
        switch ((copyOf[7] & 240) >> 4) {
            case 2:
                f = (i4 * 4) / (i3 * 3);
                break;
            case 3:
                f = (i4 * 16) / (i3 * 9);
                break;
            case 4:
                f = (i4 * 121) / (i3 * 100);
                break;
        }
        Format A03 = Format.A03(str, A01(0, 11, 121), null, -1, -1, i3, i4, -1.0f, Collections.singletonList(copyOf), -1, f, null);
        long j = 0;
        int i5 = (copyOf[7] & Ascii.SI) - 1;
        if (i5 >= 0) {
            double[] dArr = A0E;
            if (i5 < dArr.length) {
                double d = dArr[i5];
                int i6 = ch.A01;
                int i7 = (copyOf[i6 + 9] & 96) >> 5;
                if (i7 != (copyOf[i6 + 9] & Ascii.US)) {
                    d *= (i7 + 1.0d) / (r4 + 1);
                }
                j = (long) (1000000.0d / d);
            }
        }
        return Pair.create(A03, Long.valueOf(j));
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0D = new byte[]{7, Ascii.CAN, Ascii.NAK, Ascii.DC4, Ascii.RS, 94, Ascii.FS, 1, Ascii.DC4, Ascii.SYN, 67};
    }

    static {
        A02();
        A0E = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0420Cg
    public final void A4O(C0541Hh c0541Hh) {
        int A06 = c0541Hh.A06();
        int A07 = c0541Hh.A07();
        byte[] bArr = c0541Hh.A00;
        this.A04 += c0541Hh.A04();
        this.A05.AEr(c0541Hh, c0541Hh.A04());
        while (true) {
            int A04 = C0537Hd.A04(bArr, A06, A07, this.A0C);
            if (A04 == A07) {
                break;
            }
            int i = c0541Hh.A00[A04 + 3] & 255;
            if (!this.A07) {
                int i2 = A04 - A06;
                if (i2 > 0) {
                    this.A0B.A01(bArr, A06, A04);
                }
                if (this.A0B.A02(i, i2 < 0 ? -i2 : 0)) {
                    Pair<Format, Long> A00 = A00(this.A0B, this.A06);
                    this.A05.A5j((Format) A00.first);
                    this.A00 = ((Long) A00.second).longValue();
                    this.A07 = true;
                }
            }
            if (i == 0 || i == 179) {
                int i3 = A07 - A04;
                if (this.A0A && this.A08 && this.A07) {
                    this.A05.AEs(this.A03, this.A09 ? 1 : 0, ((int) (this.A04 - this.A02)) - i3, i3, null);
                }
                boolean z = this.A0A;
                if (!z || this.A08) {
                    this.A02 = this.A04 - i3;
                    long j = this.A01;
                    if (j == -9223372036854775807L) {
                        j = z ? this.A03 + this.A00 : 0L;
                    }
                    this.A03 = j;
                    this.A09 = false;
                    this.A01 = -9223372036854775807L;
                    this.A0A = true;
                }
                this.A08 = i == 0;
            } else if (i == 184) {
                this.A09 = true;
            }
            A06 = A04 + 3;
        }
        if (!this.A07) {
            this.A0B.A01(bArr, A06, A07);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0420Cg
    public final void A4l(InterfaceC0401Bc interfaceC0401Bc, C0431Cu c0431Cu) {
        c0431Cu.A05();
        this.A06 = c0431Cu.A04();
        this.A05 = interfaceC0401Bc.AFx(c0431Cu.A03(), 2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0420Cg
    public final void ADi() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0420Cg
    public final void ADj(long j, boolean z) {
        this.A01 = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0420Cg
    public final void AEv() {
        C0537Hd.A0B(this.A0C);
        this.A0B.A00();
        this.A04 = 0L;
        this.A0A = false;
    }
}

package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.4v, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06464v {
    public static byte[] A03;
    public static String[] A04 = {"RlBAQ9etSzb6rKOU0OwTULVtudJYJZp0", "XAmGWsEC26u1mjqUpAPP", "gKAOne2sLRpvkAzkWDtxdYOHT1y3K7xN", "iu", "f0TxnfWyKi4JtHzbatu6pF78XF274ljv", "5Aw1jR83b8etF7", "lH1Eai5bIm9O9MK22LfAWzb", "DxY4VOe5grYAJX95lLrlpegM3yyEwSTm"};
    public static final Set<Charset> A05;
    public static final char[] A06;
    public static final char[] A07;
    public byte[] A00;
    public int A01;
    public int A02;

    public static String A03(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 65);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{c.f16475b, 103, Byte.MAX_VALUE, 104, 101, 96, 109, 41, 92, 93, 79, 36, 49, 41, 122, 108, 120, 124, 108, 103, 106, 108, 41, 106, 102, 103, 125, 96, 103, 124, 104, 125, 96, 102, 103, 41, 107, 112, 125, 108, 51, 41, 88, Byte.MAX_VALUE, 103, 112, 125, 120, 117, 49, 68, 69, 87, 60, 41, 49, 98, 116, 96, 100, 116, Byte.MAX_VALUE, 114, 116, 49, 119, 120, 99, 98, 101, 49, 115, 104, 101, 116, 43, 49, 2, 57, 38, 118, 52, c.f16476c, 34, 118, 56, 57, 34, 118, 44, 51, 36, 57, 108, 118, 38, 29, 0, 6, 3, 3, 28, 1, 7, 22, 23, 83, 16, 27, 18, 1, 0, 22, 7, 73, 83};
    }

    static {
        A04();
        A06 = new char[]{'\r', '\n'};
        A07 = new char[]{'\n'};
        A05 = MetaExoPlayerCustomizedCollections.A05(AbstractC2036k9.A01, AbstractC2036k9.A05, AbstractC2036k9.A02, AbstractC2036k9.A03, AbstractC2036k9.A04);
    }

    public C06464v() {
        this.A00 = C5C.A07;
    }

    public C06464v(int i) {
        this.A00 = new byte[i];
        this.A01 = i;
    }

    public C06464v(byte[] bArr) {
        this.A00 = bArr;
        this.A01 = bArr.length;
    }

    public C06464v(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
    }

    private char A00(Charset charset, char[] cArr) {
        char A01;
        int i;
        if ((charset.equals(AbstractC2036k9.A05) || charset.equals(AbstractC2036k9.A01)) && A07() >= 1) {
            A01 = AbstractC2343pN.A01(AbstractC2457rc.A00(this.A00[this.A02]));
            i = 1;
        } else if ((charset.equals(AbstractC2036k9.A02) || charset.equals(AbstractC2036k9.A03)) && A07() >= 2) {
            A01 = AbstractC2343pN.A00(this.A00[this.A02], this.A00[this.A02 + 1]);
            i = 2;
        } else {
            if (!charset.equals(AbstractC2036k9.A04) || A07() < 2) {
                return (char) 0;
            }
            A01 = AbstractC2343pN.A00(this.A00[this.A02 + 1], this.A00[this.A02]);
            i = 2;
        }
        if (!AbstractC2343pN.A04(cArr, A01)) {
            return (char) 0;
        }
        this.A02 += i;
        char character = AbstractC2343pN.A01(A01);
        return character;
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x0018 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int A01(Charset charset) {
        int i;
        if (charset.equals(AbstractC2036k9.A05) || charset.equals(AbstractC2036k9.A01)) {
            i = 1;
        } else if (charset.equals(AbstractC2036k9.A02) || charset.equals(AbstractC2036k9.A04) || charset.equals(AbstractC2036k9.A03)) {
            i = 2;
        } else {
            throw new IllegalArgumentException(A03(95, 21, 50) + charset);
        }
        for (int i4 = this.A02; i4 < i - (i - 1); i4 += i) {
            if ((charset.equals(AbstractC2036k9.A05) || charset.equals(AbstractC2036k9.A01)) && C5C.A16(this.A00[i4])) {
                return i4;
            }
            if ((charset.equals(AbstractC2036k9.A02) || charset.equals(AbstractC2036k9.A03)) && this.A00[i4] == 0 && C5C.A16(this.A00[i4 + 1])) {
                return i4;
            }
            if (charset.equals(AbstractC2036k9.A04) && this.A00[i4 + 1] == 0 && C5C.A16(this.A00[i4])) {
                return i4;
            }
        }
        int stride = this.A01;
        return stride;
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String A02(char c4) {
        if (A07() == 0) {
            return null;
        }
        int i = this.A02;
        while (i < stringLimit) {
            int stringLimit = this.A00[i];
            if (stringLimit == c4) {
                break;
            }
            i++;
        }
        byte[] bArr = this.A00;
        int i4 = this.A02;
        int stringLimit2 = this.A02;
        String A0r = C5C.A0r(bArr, i4, i - stringLimit2);
        this.A02 = i;
        int i9 = this.A02;
        int stringLimit3 = this.A01;
        if (i9 < stringLimit3) {
            int stringLimit4 = this.A02;
            this.A02 = stringLimit4 + 1;
        }
        return A0r;
    }

    private void A05(Charset charset) {
        if (A00(charset, A06) == '\r') {
            A00(charset, A07);
        }
    }

    public final double A06() {
        return Double.longBitsToDouble(A0P());
    }

    public final int A07() {
        return this.A01 - this.A02;
    }

    public final int A08() {
        return this.A00.length;
    }

    public final int A09() {
        return this.A02;
    }

    public final int A0A() {
        return this.A01;
    }

    public final int A0B() {
        return this.A00[this.A02] & 255;
    }

    public final int A0C() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i4 = (bArr[i] & 255) << 24;
        byte[] bArr2 = this.A00;
        int i9 = this.A02;
        this.A02 = i9 + 1;
        int i10 = i4 | ((bArr2[i9] & 255) << 16);
        byte[] bArr3 = this.A00;
        int i11 = this.A02;
        this.A02 = i11 + 1;
        int i12 = i10 | ((bArr3[i11] & 255) << 8);
        byte[] bArr4 = this.A00;
        int i13 = this.A02;
        this.A02 = i13 + 1;
        return i12 | (bArr4[i13] & 255);
    }

    public final int A0D() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i4 = ((bArr[i] & 255) << 24) >> 8;
        byte[] bArr2 = this.A00;
        int i9 = this.A02;
        this.A02 = i9 + 1;
        int i10 = i4 | ((bArr2[i9] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i11 = this.A02;
        this.A02 = i11 + 1;
        return i10 | (bArr3[i11] & 255);
    }

    public final int A0E() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i4 = bArr[i] & 255;
        byte[] bArr2 = this.A00;
        int i9 = this.A02;
        this.A02 = i9 + 1;
        int i10 = i4 | ((bArr2[i9] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i11 = this.A02;
        this.A02 = i11 + 1;
        int i12 = i10 | ((bArr3[i11] & 255) << 16);
        byte[] bArr4 = this.A00;
        int i13 = this.A02;
        this.A02 = i13 + 1;
        return i12 | ((bArr4[i13] & 255) << 24);
    }

    public final int A0F() {
        int A0E = A0E();
        if (A0E >= 0) {
            return A0E;
        }
        throw new IllegalStateException(A03(77, 18, 23) + A0E);
    }

    public final int A0G() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i4 = bArr[i] & 255;
        byte[] bArr2 = this.A00;
        int i9 = this.A02;
        this.A02 = i9 + 1;
        return i4 | ((bArr2[i9] & 255) << 8);
    }

    public final int A0H() {
        int b22 = A0I();
        int b12 = A0I();
        int b42 = A0I();
        int b32 = A0I();
        int b23 = (b22 << 21) | (b12 << 14);
        int b13 = b42 << 7;
        return b23 | b13 | b32;
    }

    public final int A0I() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        return bArr[i] & 255;
    }

    public final int A0J() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i9 = this.A02;
        this.A02 = i9 + 1;
        int i10 = i4 | (bArr2[i9] & 255);
        int result = this.A02;
        this.A02 = result + 2;
        return i10;
    }

    public final int A0K() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i4 = (bArr[i] & 255) << 16;
        byte[] bArr2 = this.A00;
        int i9 = this.A02;
        this.A02 = i9 + 1;
        int i10 = i4 | ((bArr2[i9] & 255) << 8);
        byte[] bArr3 = this.A00;
        int i11 = this.A02;
        this.A02 = i11 + 1;
        return i10 | (bArr3[i11] & 255);
    }

    public final int A0L() {
        int A0C = A0C();
        if (A0C >= 0) {
            return A0C;
        }
        throw new IllegalStateException(A03(77, 18, 23) + A0C);
    }

    public final int A0M() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i9 = this.A02;
        this.A02 = i9 + 1;
        return i4 | (bArr2[i9] & 255);
    }

    public final long A0N() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j9 = bArr[r1] & 255;
        byte[] bArr2 = this.A00;
        this.A02 = this.A02 + 1;
        long j10 = j9 | ((bArr2[r1] & 255) << 8);
        byte[] bArr3 = this.A00;
        this.A02 = this.A02 + 1;
        long j11 = j10 | ((bArr3[r1] & 255) << 16);
        byte[] bArr4 = this.A00;
        this.A02 = this.A02 + 1;
        long j12 = j11 | ((bArr4[r1] & 255) << 24);
        byte[] bArr5 = this.A00;
        this.A02 = this.A02 + 1;
        long j13 = j12 | ((bArr5[r1] & 255) << 32);
        byte[] bArr6 = this.A00;
        this.A02 = this.A02 + 1;
        long j14 = j13 | ((bArr6[r1] & 255) << 40);
        byte[] bArr7 = this.A00;
        this.A02 = this.A02 + 1;
        long j15 = j14 | ((bArr7[r1] & 255) << 48);
        byte[] bArr8 = this.A00;
        this.A02 = this.A02 + 1;
        return j15 | ((255 & bArr8[r1]) << 56);
    }

    public final long A0O() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j9 = bArr[r1] & 255;
        byte[] bArr2 = this.A00;
        this.A02 = this.A02 + 1;
        long j10 = j9 | ((bArr2[r1] & 255) << 8);
        byte[] bArr3 = this.A00;
        this.A02 = this.A02 + 1;
        long j11 = j10 | ((bArr3[r1] & 255) << 16);
        byte[] bArr4 = this.A00;
        this.A02 = this.A02 + 1;
        return j11 | ((255 & bArr4[r1]) << 24);
    }

    public final long A0P() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j9 = (bArr[r1] & 255) << 56;
        byte[] bArr2 = this.A00;
        this.A02 = this.A02 + 1;
        long j10 = j9 | ((bArr2[r1] & 255) << 48);
        byte[] bArr3 = this.A00;
        this.A02 = this.A02 + 1;
        long j11 = j10 | ((bArr3[r1] & 255) << 40);
        byte[] bArr4 = this.A00;
        this.A02 = this.A02 + 1;
        long j12 = j11 | ((bArr4[r1] & 255) << 32);
        byte[] bArr5 = this.A00;
        this.A02 = this.A02 + 1;
        long j13 = j12 | ((bArr5[r1] & 255) << 24);
        byte[] bArr6 = this.A00;
        this.A02 = this.A02 + 1;
        long j14 = j13 | ((bArr6[r1] & 255) << 16);
        byte[] bArr7 = this.A00;
        this.A02 = this.A02 + 1;
        long j15 = j14 | ((bArr7[r1] & 255) << 8);
        byte[] bArr8 = this.A00;
        this.A02 = this.A02 + 1;
        return j15 | (255 & bArr8[r1]);
    }

    public final long A0Q() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j9 = (bArr[r1] & 255) << 24;
        byte[] bArr2 = this.A00;
        this.A02 = this.A02 + 1;
        long j10 = j9 | ((bArr2[r1] & 255) << 16);
        byte[] bArr3 = this.A00;
        this.A02 = this.A02 + 1;
        long j11 = j10 | ((bArr3[r1] & 255) << 8);
        byte[] bArr4 = this.A00;
        this.A02 = this.A02 + 1;
        return j11 | (255 & bArr4[r1]);
    }

    public final long A0R() {
        long A0P = A0P();
        if (A0P >= 0) {
            return A0P;
        }
        throw new IllegalStateException(A03(77, 18, 23) + A0P);
    }

    public final long A0S() {
        int i = 0;
        byte[] bArr = this.A00;
        int length = this.A02;
        long j9 = bArr[length];
        int i4 = 7;
        while (A04[3].length() != 11) {
            A04[0] = "oMNWSgm03bScuVXxVZmUeRStw4NVi0TN";
            if (i4 >= 0) {
                int length2 = 1 << i4;
                long value = length2;
                if ((value & j9) == 0) {
                    if (i4 < 6) {
                        int length3 = 1 << i4;
                        j9 &= length3 - 1;
                        i = 7 - i4;
                    } else if (i4 == 7) {
                        i = 1;
                    }
                } else {
                    i4--;
                }
            }
            if (i != 0) {
                int i9 = 1;
                while (i9 < i) {
                    byte[] bArr2 = this.A00;
                    int length4 = this.A02;
                    byte b9 = bArr2[length4 + i9];
                    if ((b9 & 192) == 128) {
                        int length5 = b9 & c.f16476c;
                        j9 = (j9 << 6) | length5;
                        if (A04[3].length() != 11) {
                            A04[2] = "QkYn4WhdN3Bc00ITVAtZ7M0H0JKEG2qx";
                            i9++;
                        } else {
                            i9++;
                        }
                    } else {
                        throw new NumberFormatException(A03(0, 42, 72) + j9);
                    }
                }
                int length6 = this.A02;
                this.A02 = length6 + i;
                return j9;
            }
            throw new NumberFormatException(A03(42, 35, 80) + j9);
        }
        throw new RuntimeException();
    }

    public final String A0T() {
        return A0Y(AbstractC2036k9.A05);
    }

    public final String A0U() {
        return A02((char) 0);
    }

    public final String A0V(int i) {
        if (i == 0) {
            return A03(0, 0, 97);
        }
        int i4 = i;
        int stringLength = this.A02;
        int lastIndex = (stringLength + i) - 1;
        int stringLength2 = this.A01;
        if (lastIndex < stringLength2) {
            int stringLength3 = this.A00[lastIndex];
            if (stringLength3 == 0) {
                i4--;
            }
        }
        byte[] bArr = this.A00;
        int stringLength4 = this.A02;
        String A0r = C5C.A0r(bArr, stringLength4, i4);
        int stringLength5 = this.A02;
        this.A02 = stringLength5 + i;
        return A0r;
    }

    public final String A0W(int i) {
        return A0X(i, AbstractC2036k9.A05);
    }

    public final String A0X(int i, Charset charset) {
        String str = new String(this.A00, this.A02, i, charset);
        this.A02 += i;
        return str;
    }

    public final String A0Y(Charset charset) {
        AbstractC06233y.A09(A05.contains(charset), A03(95, 21, 50) + charset);
        if (A07() == 0) {
            return null;
        }
        if (!charset.equals(AbstractC2036k9.A01)) {
            A0Z();
        }
        int A01 = A01(charset);
        int lineLimit = this.A02;
        String A0X = A0X(A01 - lineLimit, charset);
        int i = this.A02;
        int lineLimit2 = this.A01;
        if (i == lineLimit2) {
            return A0X;
        }
        A05(charset);
        return A0X;
    }

    public final Charset A0Z() {
        if (A07() >= 3 && this.A00[this.A02] == -17 && this.A00[this.A02 + 1] == -69 && this.A00[this.A02 + 2] == -65) {
            this.A02 += 3;
            return AbstractC2036k9.A05;
        }
        if (A07() >= 2) {
            if (this.A00[this.A02] == -2) {
                byte[] bArr = this.A00;
                int i = this.A02;
                if (A04[0].charAt(23) != 't') {
                    throw new RuntimeException();
                }
                A04[1] = "9QZAaK9H1E15SkUu26Oe";
                if (bArr[i + 1] == -1) {
                    this.A02 += 2;
                    return AbstractC2036k9.A03;
                }
            }
            if (this.A00[this.A02] == -1 && this.A00[this.A02 + 1] == -2) {
                this.A02 += 2;
                return AbstractC2036k9.A04;
            }
            return null;
        }
        return null;
    }

    public final short A0a() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i4 = bArr[i] & 255;
        byte[] bArr2 = this.A00;
        int i9 = this.A02;
        this.A02 = i9 + 1;
        return (short) (i4 | ((bArr2[i9] & 255) << 8));
    }

    public final short A0b() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.A00;
        int i9 = this.A02;
        this.A02 = i9 + 1;
        return (short) (i4 | (bArr2[i9] & 255));
    }

    public final void A0c(int i) {
        if (i > A08()) {
            this.A00 = Arrays.copyOf(this.A00, i);
        }
    }

    public final void A0d(int i) {
        A0j(A08() < i ? new byte[i] : this.A00, i);
        String[] strArr = A04;
        if (strArr[5].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A04[3] = "3F79npZxDc4PfqkC8vfulVLdM";
    }

    public final void A0e(int i) {
        AbstractC06233y.A07(i >= 0 && i <= this.A00.length);
        this.A01 = i;
    }

    public final void A0f(int i) {
        boolean z8;
        if (i >= 0) {
            int i4 = this.A01;
            String[] strArr = A04;
            if (strArr[4].charAt(20) != strArr[7].charAt(20)) {
                throw new RuntimeException();
            }
            A04[3] = "UMwuHioqOI4Z";
            if (i <= i4) {
                z8 = true;
                AbstractC06233y.A07(z8);
                this.A02 = i;
            }
        }
        z8 = false;
        AbstractC06233y.A07(z8);
        this.A02 = i;
    }

    public final void A0g(int i) {
        A0f(this.A02 + i);
    }

    public final void A0h(C06454u c06454u, int i) {
        A0k(c06454u.A00, 0, i);
        c06454u.A08(0);
    }

    public final void A0i(byte[] bArr) {
        A0j(bArr, bArr.length);
    }

    public final void A0j(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
        this.A02 = 0;
    }

    public final void A0k(byte[] bArr, int i, int i4) {
        System.arraycopy(this.A00, this.A02, bArr, i, i4);
        this.A02 += i4;
    }

    public final byte[] A0l() {
        return this.A00;
    }
}

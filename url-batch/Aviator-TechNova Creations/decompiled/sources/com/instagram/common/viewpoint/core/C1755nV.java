package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.nV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1755nV implements C6S {
    public static byte[] A0B;
    public static String[] A0C = {"WWBqbqM8cT7NtZ20aOE3uXs3Aw8DSv9K", "wsMqXc0RGaIy4bMjDS0CDKFK5K3H0E7a", "tXUn5oHGArEZhR5EfIYxUHEmkE2i7Wlz", "L3oqKt7yiugAXq9nLkVCiYddeszNHWIU", "GxMV2HKS42DeS6e3iSG9rTJ", "iBUmcZRwnnz5BMe8LKV", "MLtAALupoqSZMT31TgfSKHmksSEA2gyG", "KlBG0Bt2bdiLbLP3pzzetkFN2"};
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final C1644lh A08;
    public final boolean A09;
    public final boolean A0A;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 69);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0B = new byte[]{-127, -60, -62, -49, -49, -48, -43, -127, -61, -58, -127, -51, -58, -44, -44, -127, -43, -55, -62, -49, -127, 123, -91, -58, -57, -62, -42, -51, -43, -83, -48, -62, -59, -92, -48, -49, -43, -45, -48, -51, 3, 16, 33, Ascii.SYN, Ascii.DC4, 35, -49, 17, 36, Ascii.NAK, Ascii.NAK, Ascii.DC4, 33, -49, 34, Ascii.CAN, 41, Ascii.DC4, -49, 33, Ascii.DC4, 16, Ascii.DC2, Ascii.ETB, Ascii.DC4, 19, -49, 38, Ascii.CAN, 35, Ascii.ETB, -49, Ascii.ESC, Ascii.DC4, 34, 34, -49, 35, Ascii.ETB, 16, Ascii.GS, -49, -28, -33, -33, Ascii.FS, 34, -49, Ascii.RS, Ascii.NAK, -49, 17, 36, Ascii.NAK, Ascii.NAK, Ascii.DC4, 33, Ascii.DC4, 19, -49, Ascii.FS, Ascii.DC4, 19, Ascii.CAN, 16, -49, 19, 16, 35, 16, -35, -36, -37, -35, -27, -68, -17, -32, -32, -33, -20, -66, -17, -20, -37, -18, -29, -23, -24, -57, -19, -77, -58, -73, -73, -74, -61, -105, -64, -61, -95, -67, -78, -54, -77, -78, -76, -68, -110, -73, -59, -74, -61, -93, -74, -77, -58, -73, -73, -74, -61, -98, -60, Ascii.NAK, 40, Ascii.EM, Ascii.EM, Ascii.CAN, 37, -7, 34, 37, 3, Ascii.US, Ascii.DC4, 44, Ascii.NAK, Ascii.DC4, Ascii.SYN, Ascii.RS, 0, 38, -12, -24, -1, -55, -4, -19, -19, -20, -7, -44, -6, 43, 39, 44, 0, 51, 36, 36, 35, 48, Ascii.VT, 49};
    }

    static {
        A03();
    }

    public C1755nV() {
        this(new C1644lh(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    public C1755nV(C1644lh c1644lh, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        int i7;
        String A02 = A02(Opcodes.IF_ICMPGT, 19, 110);
        String A022 = A02(21, 1, 6);
        A04(i3, 0, A02, A022);
        String A023 = A02(Opcodes.LXOR, 32, 12);
        A04(i4, 0, A023, A022);
        String A024 = A02(Opcodes.INSTANCEOF, 11, Opcodes.LSHL);
        A04(i, i3, A024, A02);
        A04(i, i4, A024, A023);
        A04(i2, i, A02(Opcodes.INVOKEVIRTUAL, 11, 66), A024);
        A04(i6, 0, A02(111, 20, 53), A022);
        this.A08 = c1644lh;
        this.A07 = AbstractC01484a.A0O(i);
        this.A06 = AbstractC01484a.A0O(i2);
        this.A05 = AbstractC01484a.A0O(i3);
        this.A04 = AbstractC01484a.A0O(i4);
        this.A02 = i5;
        if (this.A02 != -1) {
            i7 = this.A02;
        } else {
            i7 = 13107200;
        }
        this.A00 = i7;
        this.A09 = z;
        this.A03 = AbstractC01484a.A0O(i6);
        this.A0A = z2;
    }

    public static int A00(int i) {
        switch (i) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                if (A0C[7].length() == 32) {
                    throw new RuntimeException();
                }
                A0C[5] = "ABED08YC";
                return 131072000;
            case 3:
                return 131072;
            case 4:
                return 131072;
            case 5:
                return 131072;
            case 6:
                return 131072;
        }
    }

    private final int A01(InterfaceC1646lj[] interfaceC1646ljArr) {
        int i = 0;
        for (InterfaceC1646lj interfaceC1646lj : interfaceC1646ljArr) {
            if (interfaceC1646lj != null) {
                int targetBufferSize = interfaceC1646lj.A9D().A02;
                i += A00(targetBufferSize);
            }
        }
        int max = Math.max(13107200, i);
        if (A0C[0].charAt(6) == 'f') {
            throw new RuntimeException();
        }
        A0C[0] = "RHrwW0B94f4UqoylhYQPwgHgnQSWW3zM";
        return max;
    }

    public static void A04(int i, int i2, String str, String str2) {
        C3M.A09(i >= i2, str + A02(0, 21, 28) + str2);
    }

    private void A05(boolean z) {
        int i;
        if (this.A02 == -1) {
            i = 13107200;
        } else {
            i = this.A02;
        }
        this.A00 = i;
        this.A01 = false;
        if (z) {
            this.A08.A01();
        }
    }

    @Override // com.instagram.common.viewpoint.core.C6S
    public final C1644lh A6n() {
        return this.A08;
    }

    @Override // com.instagram.common.viewpoint.core.C6S
    public final long A6s(C02387m c02387m) {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.C6S
    public final void AEj(C02387m c02387m) {
        A05(false);
    }

    @Override // com.instagram.common.viewpoint.core.C6S
    public final void AEu(C02387m c02387m) {
        A05(true);
    }

    @Override // com.instagram.common.viewpoint.core.C6S
    public final void AFN(C02387m c02387m) {
        A05(true);
    }

    @Override // com.instagram.common.viewpoint.core.C6S
    public final void AFV(C6R c6r, C1673mA c1673mA, InterfaceC1646lj[] interfaceC1646ljArr) {
        int i;
        if (this.A02 == -1) {
            i = A01(interfaceC1646ljArr);
        } else {
            i = this.A02;
        }
        this.A00 = i;
        this.A08.A02(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.C6S
    public final boolean AI3(C02387m c02387m) {
        return this.A0A;
    }

    @Override // com.instagram.common.viewpoint.core.C6S
    public final boolean AJB(C6R c6r) {
        boolean z = true;
        boolean z2 = this.A08.A00() >= this.A00;
        long j = this.A07;
        if (c6r.A00 > 1.0f) {
            j = Math.min(AbstractC01484a.A0Q(j, c6r.A00), this.A06);
        }
        if (c6r.A01 < Math.max(j, 500000L)) {
            boolean targetBufferSizeReached = this.A09;
            if (!targetBufferSizeReached && z2) {
                z = false;
            }
            this.A01 = z;
            boolean targetBufferSizeReached2 = this.A01;
            if (!targetBufferSizeReached2 && c6r.A01 < 500000) {
                AnonymousClass44.A07(A02(22, 18, 28), A02(40, 71, 106));
            }
        } else if (c6r.A01 >= this.A06 || z2) {
            this.A01 = false;
        }
        boolean targetBufferSizeReached3 = this.A01;
        return targetBufferSizeReached3;
    }

    @Override // com.instagram.common.viewpoint.core.C6S
    public final boolean AJE(long j, float f, boolean z, boolean z2, long minBufferDurationUs) {
        long A0R = AbstractC01484a.A0R(j, f);
        long j2 = z ? this.A04 : this.A05;
        String[] strArr = A0C;
        if (strArr[3].charAt(20) == strArr[1].charAt(20)) {
            throw new RuntimeException();
        }
        A0C[4] = "l7tzQS6toEbIIxnpfZA1NGx";
        if (minBufferDurationUs != -9223372036854775807L) {
            j2 = Math.min(minBufferDurationUs / 2, j2);
        }
        return j2 <= 0 || A0R >= j2 || (!this.A09 && this.A08.A00() >= this.A00);
    }
}

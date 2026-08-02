package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7q, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02367q implements InterfaceC1592kk {
    public static byte[] A04;
    public final long A00;
    public final long A01;
    public final long[] A02;
    public final long[] A03;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C02367q A00(long j, long j2, C0449Gl c0449Gl, C4J c4j) {
        int A0I;
        long j3 = j2;
        c4j.A0g(10);
        int A0C = c4j.A0C();
        if (A0C <= 0) {
            return null;
        }
        int i = c0449Gl.A03;
        long A0U = AbstractC01424a.A0U(A0C, (i >= 32000 ? 1152 : 576) * 1000000, i);
        int A0M = c4j.A0M();
        int A0M2 = c4j.A0M();
        int A0M3 = c4j.A0M();
        c4j.A0g(2);
        long j4 = j3 + c0449Gl.A02;
        long[] jArr = new long[A0M];
        long[] jArr2 = new long[A0M];
        for (int i2 = 0; i2 < A0M; i2++) {
            jArr[i2] = (i2 * A0U) / A0M;
            jArr2[i2] = Math.max(j3, j4);
            switch (A0M3) {
                case 1:
                    A0I = c4j.A0I();
                    break;
                case 2:
                    A0I = c4j.A0M();
                    break;
                case 3:
                    A0I = c4j.A0K();
                    break;
                case 4:
                    A0I = c4j.A0L();
                    break;
                default:
                    return null;
            }
            j3 += A0I * A0M2;
        }
        if (j != -1 && j != j3) {
            AnonymousClass44.A07(A01(27, 10, 89), A01(2, 25, 50) + j + A01(0, 2, 80) + j3);
        }
        return new C02367q(jArr, jArr2, A0U, j3);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 43);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-89, -101, -77, -97, -81, -90, 125, -63, -66, -47, -66, 125, -48, -58, -41, -62, 125, -54, -58, -48, -54, -66, -47, -64, -59, -105, 125, -38, -26, -10, -19, -41, -23, -23, -17, -23, -10};
    }

    public C02367q(long[] jArr, long[] jArr2, long j, long j2) {
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1592kk
    public final long A7b() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0460Gw
    public final long A7l() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0460Gw
    public final C0459Gv A8t(long j) {
        int A0L = AbstractC01424a.A0L(this.A03, j, true, true);
        C0461Gx c0461Gx = new C0461Gx(this.A03[A0L], this.A02[A0L]);
        if (c0461Gx.A01 < j) {
            int tableIndex = this.A03.length;
            if (A0L != tableIndex - 1) {
                int tableIndex2 = A0L + 1;
                long j2 = this.A03[tableIndex2];
                int tableIndex3 = A0L + 1;
                C0461Gx nextSeekPoint = new C0461Gx(j2, this.A02[tableIndex3]);
                return new C0459Gv(c0461Gx, nextSeekPoint);
            }
        }
        return new C0459Gv(c0461Gx);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1592kk
    public final long A99(long j) {
        return this.A03[AbstractC01424a.A0L(this.A02, j, true, true)];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0460Gw
    public final boolean AAa() {
        return true;
    }
}

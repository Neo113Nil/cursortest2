package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.my, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2195my implements HY {
    public static byte[] A06;
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long A05;

    static {
        A02();
    }

    public static String A01(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 24);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{65, 57, 53, 113, 96, 103, 116, 97, 124, 122, 123, 102, c.f16475b, 102, 40, 111, 99, 44, 37, 37, 48, 38, 55, 48, 126, 53, 57, 106, 112, 99, 124, 106, 36, 105, 101, 49, 44, 40, 32, 16, 54, 120, 47, 4, 25, 2, 7, 37, 2, 8, 9, 20, 68, 0, 9, 2, 11, 24, 4, 81};
    }

    public C2195my(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A01 = iArr;
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A04 = jArr3;
        this.A00 = iArr.length;
        if (this.A00 > 0) {
            this.A05 = jArr2[this.A00 - 1] + jArr3[this.A00 - 1];
        } else {
            this.A05 = 0L;
        }
    }

    private final int A00(long j9) {
        return C5C.A0L(this.A04, j9, true, true);
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final long A7t() {
        return this.A05;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final HX A91(long j9) {
        int A00 = A00(j9);
        HZ hz = new HZ(this.A04[A00], this.A03[A00]);
        if (hz.A01 < j9) {
            int chunkIndex = this.A00;
            if (A00 != chunkIndex - 1) {
                int chunkIndex2 = A00 + 1;
                long j10 = this.A04[chunkIndex2];
                int chunkIndex3 = A00 + 1;
                HZ seekPoint = new HZ(j10, this.A03[chunkIndex3]);
                return new HX(hz, seekPoint);
            }
        }
        return new HX(hz);
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final boolean AAj() {
        return true;
    }

    public final String toString() {
        return A01(42, 18, 116) + this.A00 + A01(25, 8, 1) + Arrays.toString(this.A01) + A01(15, 10, 91) + Arrays.toString(this.A03) + A01(33, 9, 93) + Arrays.toString(this.A04) + A01(1, 14, 13) + Arrays.toString(this.A02) + A01(0, 1, 112);
    }
}

package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.kh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1595kh implements IL {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final C4J A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{65, 77, Ascii.RS, Ascii.EM, Ascii.RS, Ascii.ETB, 77, Ascii.RS, Ascii.FF, 0, Ascii.GS, 1, 8, 77, Ascii.RS, 4, Ascii.ETB, 8, 87, 77, 70, 115, 104, 106, 87, 102, 117, 116, 98, 117, 116, 9, Base64.padSymbol, 44, 33, 39, 104, 59, 41, 37, 56, 36, 45, 104, 59, 33, 50, 45, 104, 37, 33, 59, 37, 41, 60, 43, 32, 102, 104, 59, 60, 59, 44, 104, 59, 41, 37, 56, 36, 45, 104, 59, 33, 50, 45, 114, 104, Ascii.EM, Ascii.CR, Ascii.FS, 17, Ascii.ETB, 87, 10, Ascii.EM, Ascii.SI};
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (r0 != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1595kh(C1596ki c1596ki, C1836or c1836or) {
        this.A02 = c1596ki.A00;
        this.A02.A0f(12);
        int A0L = this.A02.A0L();
        if (A00(77, 9, 20).equals(c1836or.A0W)) {
            int i = c1836or.A0C;
            int fixedSampleSize = c1836or.A06;
            int A06 = AbstractC01484a.A06(i, fixedSampleSize);
            if (A0L != 0) {
                int fixedSampleSize2 = A0L % A06;
            }
            AnonymousClass44.A07(A00(20, 11, 107), A00(31, 46, 36) + A06 + A00(0, 20, 1) + A0L);
            A0L = A06;
        }
        this.A00 = A0L == 0 ? -1 : A0L;
        int fixedSampleSize3 = this.A02.A0L();
        this.A01 = fixedSampleSize3;
    }

    @Override // com.instagram.common.viewpoint.core.IL
    public final int A82() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.IL
    public final int A8n() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.IL
    public final int AGi() {
        return this.A00 == -1 ? this.A02.A0L() : this.A00;
    }
}

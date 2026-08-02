package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Pv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0689Pv {
    public static byte[] A06;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC0700Qg A04;
    public AbstractC0700Qg A05;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 67);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{118, 122, 60, 40, 53, 55, 2, 103, Ascii.SO, 2, 68, 80, 77, 79, 123, Ascii.US, 76, 64, Ascii.SO, 5, Ascii.ETB, 40, Ascii.SI, Ascii.FF, 4, 5, Ascii.DC2, 93, 86, 90, Ascii.SO, Ascii.NAK, 34, 71, 71, 75, Ascii.US, 4, 50, 86, 109, 70, 79, 64, 73, 75, 103, 64, 72, 65, 85, 65, 66, 74, 102, 65, 66, 74, 75, 92, 19};
    }

    public C0689Pv(AbstractC0700Qg abstractC0700Qg, AbstractC0700Qg abstractC0700Qg2) {
        this.A05 = abstractC0700Qg;
        this.A04 = abstractC0700Qg2;
    }

    public C0689Pv(AbstractC0700Qg abstractC0700Qg, AbstractC0700Qg abstractC0700Qg2, int i, int i2, int i3, int i4) {
        this(abstractC0700Qg, abstractC0700Qg2);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }

    public final String toString() {
        return A00(40, 21, 109) + this.A05 + A00(16, 12, 35) + this.A04 + A00(0, 8, 25) + this.A00 + A00(8, 8, 97) + this.A01 + A00(28, 6, 57) + this.A02 + A00(34, 6, 40) + this.A03 + '}';
    }
}

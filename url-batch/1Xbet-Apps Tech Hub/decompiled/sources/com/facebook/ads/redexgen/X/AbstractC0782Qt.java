package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Qt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0782Qt {
    public static byte[] A05;
    public C0778Qp A00;
    public EnumC0781Qs A01;
    public String A02;
    public String A03;
    public byte[] A04;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 21);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{119};
    }

    public AbstractC0782Qt(String str, C0784Qv c0784Qv, C0778Qp c0778Qp) {
        this.A03 = A00(0, 0, 77);
        if (str != null) {
            this.A03 = str;
        }
        if (c0784Qv != null && !c0784Qv.A06().isEmpty()) {
            this.A03 += A00(0, 1, 35) + c0784Qv.A06();
        }
        this.A00 = c0778Qp;
    }

    public final C0778Qp A02() {
        return this.A00;
    }

    public final EnumC0781Qs A03() {
        return this.A01;
    }

    public final String A04() {
        return this.A02;
    }

    public final String A05() {
        return this.A03;
    }

    public final byte[] A06() {
        return this.A04;
    }
}

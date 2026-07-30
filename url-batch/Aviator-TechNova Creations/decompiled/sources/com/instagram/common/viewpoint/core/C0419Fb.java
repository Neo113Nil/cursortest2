package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Fb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0419Fb extends AbstractRunnableC0846Vt {
    public static byte[] A01;
    public final /* synthetic */ C01393r A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 95);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-67, -48, -53, -52, -42, -121, -34, -56, -38, -121, -43, -52, -35, -52, -39, -121, -41, -39, -52, -41, -56, -39, -52, -53};
    }

    public C0419Fb(C01393r c01393r) {
        this.A00 = c01393r;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        boolean z;
        z = this.A00.A0E;
        if (!z) {
            this.A00.A0R(A00(0, 24, 8));
        }
    }
}

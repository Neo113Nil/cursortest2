package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ph, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0681Ph extends AbstractRunnableC0846Vt {
    public static byte[] A01;
    public final /* synthetic */ VU A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-81, -78, -90, -92, -81, -94, -73, -85, -75, -78, -73, -73, -81, -88};
    }

    public C0681Ph(VU vu) {
        this.A00 = vu;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        C1159dL c1159dL;
        c1159dL = this.A00.A05;
        c1159dL.A08().A9v(A00(0, 14, 26));
    }
}

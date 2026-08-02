package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.iF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1441iF extends AbstractRunnableC0840Vt {
    public static byte[] A01;
    public final /* synthetic */ C1440iE A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 14);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-107, -116, -95, -116, -98, -114, -99, -108, -101, -97, 101};
    }

    public C1441iF(C1440iE c1440iE) {
        this.A00 = c1440iE;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        C1153dL c1153dL;
        AbstractC0927Ze abstractC0927Ze;
        C1442iG c1442iG;
        c1153dL = this.A00.A03;
        c1153dL.A0F().AKB();
        abstractC0927Ze = this.A00.A05;
        StringBuilder append = new StringBuilder().append(A00(0, 11, 29));
        c1442iG = this.A00.A00;
        abstractC0927Ze.loadUrl(append.append(c1442iG.A03()).toString());
    }
}

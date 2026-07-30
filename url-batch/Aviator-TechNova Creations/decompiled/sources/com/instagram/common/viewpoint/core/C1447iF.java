package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.iF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1447iF extends AbstractRunnableC0846Vt {
    public static byte[] A01;
    public final /* synthetic */ C1446iE A00;

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

    public C1447iF(C1446iE c1446iE) {
        this.A00 = c1446iE;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        C1159dL c1159dL;
        AbstractC0933Ze abstractC0933Ze;
        C1448iG c1448iG;
        c1159dL = this.A00.A03;
        c1159dL.A0F().AKB();
        abstractC0933Ze = this.A00.A05;
        StringBuilder append = new StringBuilder().append(A00(0, 11, 29));
        c1448iG = this.A00.A00;
        abstractC0933Ze.loadUrl(append.append(c1448iG.A03()).toString());
    }
}

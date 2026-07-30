package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class I7 extends AbstractRunnableC0846Vt {
    public static byte[] A02;
    public final /* synthetic */ C1062bl A00;
    public final /* synthetic */ C3Q A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-103, -52, -67, -67, -68, -55, -64, -59, -66, 119, -64, -59, -69, -68, -67, -64, -59, -64, -53, -68, -61, -48};
    }

    public I7(C1062bl c1062bl, C3Q c3q) {
        this.A00 = c1062bl;
        this.A01 = c3q;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        E1 e1;
        E1 e12;
        e1 = this.A00.A0D;
        if (e1.getState() != EnumC1229eU.A02) {
            return;
        }
        e12 = this.A00.A0D;
        if (e12.getCurrentPositionInMillis() != A00()) {
            return;
        }
        this.A00.A0I(A00(0, 22, 47));
    }
}

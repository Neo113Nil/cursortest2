package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class GO extends AbstractRunnableC0846Vt {
    public static byte[] A01;
    public final /* synthetic */ C4K A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 14);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{67, 124, 113, 112, 122, 53, 98, 116, 102, 53, 123, 112, 99, 112, 103, 53, 101, 103, 112, 101, 116, 103, 112, 113};
    }

    public GO(C4K c4k) {
        this.A00 = c4k;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        boolean z;
        InterfaceC1106cT interfaceC1106cT;
        z = this.A00.A0J;
        if (!z) {
            interfaceC1106cT = this.A00.A0V;
            interfaceC1106cT.AFg(A00(0, 24, 27));
        }
    }
}

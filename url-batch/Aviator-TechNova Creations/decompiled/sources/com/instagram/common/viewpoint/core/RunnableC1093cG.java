package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1093cG implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C01494b A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 83);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{78, 113, 124, 125, 119, 72, 116, 121, 97, 122, 121, 123, 115, 93, 106, 106, 119, 106};
    }

    public RunnableC1093cG(C01494b c01494b) {
        this.A00 = c01494b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1106cT interfaceC1106cT;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            interfaceC1106cT = this.A00.A00.A0Z;
            interfaceC1106cT.AFg(A00(0, 18, 75));
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}

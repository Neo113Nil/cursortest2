package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0893Xq implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C6H A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 13);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-106, -108, -122, -109, Byte.MIN_VALUE, -125, -106, -121, -121, -122, -109, -122, -123, Byte.MIN_VALUE, -124, -115, -118, -124, -116, Byte.MIN_VALUE, -126, -121, -107, -122, -109, Byte.MIN_VALUE, -123, -122, -115, -126, -102};
    }

    public RunnableC0893Xq(C6H c6h) {
        this.A00 = c6h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0H(A00(0, 31, 20));
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}

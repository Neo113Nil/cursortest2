package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.c8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1085c8 implements Runnable {
    public static byte[] A01;
    public static String[] A02 = {"CXh9IgKc", "O7eitgLXwuQabaJwawISN5vHvLm6eCHh", "CD1jo8Ha", "FPDId41ZEfoYhMJr4YCyxsIaRA1sy82M", "v53i6y7e6", "iQAdLEQn", "ZcZ8pescI", "Z1kdPveD"};
    public final /* synthetic */ C01634p A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 102);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{58, 77, 72, 73, 83, 52, 80, 69, 93, 70, 69, 71, 79, 41, 86, 86, 83, 86};
    }

    static {
        A01();
    }

    public RunnableC1085c8(C01634p c01634p) {
        this.A00 = c01634p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1106cT interfaceC1106cT;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            interfaceC1106cT = this.A00.A00.A0M;
            interfaceC1106cT.AFg(A00(0, 18, 126));
        } catch (Throwable th) {
            String[] strArr = A02;
            if (strArr[4].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "CbmYJDHc";
            strArr2[5] = "9BNL1g6R";
            AbstractC0838Vl.A00(th, this);
        }
    }
}

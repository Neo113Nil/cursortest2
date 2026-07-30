package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C02287c extends AbstractC1496j4<LF> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-56, -49, -58, -58};
    }

    public C02287c(String str) {
        super(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1496j4
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final LN A04(LF lf) {
        return new LN(this, lf == null ? A00(0, 4, 46) : A00(0, 0, 18) + lf.A03());
    }
}

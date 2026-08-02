package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C02207a extends AbstractC1490j4<LT> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{83, 90, 81, 81};
    }

    public C02207a(String str) {
        super(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1490j4
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final LN A04(LT lt) {
        return new LN(this, lt == null ? A00(0, 4, 114) : lt.A03());
    }
}

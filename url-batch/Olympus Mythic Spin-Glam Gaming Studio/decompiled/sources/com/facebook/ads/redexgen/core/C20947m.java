package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.7m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C20947m extends AbstractC3383jd {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 49);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{52, 59, 46, 51, 44, 63};
    }

    public C20947m(List<NR> list) {
        super(list);
    }

    public static C20947m A00(JSONObject jSONObject, C3218gi c3218gi) {
        C20947m c20947m = new C20947m(AbstractC3383jd.A08(jSONObject, c3218gi, new C3375jR()));
        c20947m.A2I(jSONObject);
        c20947m.A1N(A01(0, 6, 107));
        return c20947m;
    }

    @Override // com.facebook.ads.redexgen.core.NQ
    public final int A0o() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.NQ
    public final int A0p() {
        return 0;
    }
}

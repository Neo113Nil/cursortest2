package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.7o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C20967o extends AbstractC3383jd {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{63, 60, 51, 51, 56, 47};
    }

    public C20967o(List<NR> list) {
        super(list);
    }

    public static C20967o A00(JSONObject jSONObject, C3218gi c3218gi) {
        C20967o c20967o = new C20967o(AbstractC3383jd.A08(jSONObject, c3218gi, new C3381jb()));
        c20967o.A2I(jSONObject);
        c20967o.A1N(A01(0, 6, 6));
        return c20967o;
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

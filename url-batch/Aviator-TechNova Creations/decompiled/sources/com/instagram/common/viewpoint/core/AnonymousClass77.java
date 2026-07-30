package com.instagram.common.viewpoint.core;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.77, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass77 extends AbstractC1434hy implements Serializable {
    public static byte[] A00 = null;
    public static String[] A01 = {"", "DwBpRdjhynFrlzLsBFrR", "QSeBoONoLaQYOKTzvkglRPiKzJDmlw8V", "7gQnCJoaPerIMpa6ilCeIjK7d9DzDLkx", "0G82UgBGsFbmab2LaOSe1R1N", "BET7yFkEMT8u6XlB2K", "", "QGCw11GNV2Lw2F7bA4MSMYlzIGOyIq"};
    public static final long serialVersionUID = 5751287062553772011L;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
            if (A01[5].length() != 18) {
                throw new RuntimeException();
            }
            A01[4] = "xBe8M";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{86, 81, 75, 90, 77, 76, 75, 86, 75, 86, 94, 83};
    }

    static {
        A02();
    }

    public AnonymousClass77(List<C0613Mp> list) {
        super(list);
    }

    public static AnonymousClass77 A00(JSONObject jSONObject, C1159dL c1159dL) {
        AnonymousClass77 anonymousClass77 = new AnonymousClass77(AbstractC1434hy.A08(jSONObject, c1159dL, new C1427hp()));
        anonymousClass77.A29(jSONObject);
        anonymousClass77.A1I(A01(0, 12, 9));
        return anonymousClass77;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0612Mo
    public final int A0l() {
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0612Mo
    public final int A0m() {
        return 0;
    }
}

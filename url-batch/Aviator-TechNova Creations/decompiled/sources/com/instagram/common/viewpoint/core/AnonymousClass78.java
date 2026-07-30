package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.List;
import okio.Utf8;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.78, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass78 extends AbstractC1434hy {
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
        A00 = new byte[]{Utf8.REPLACEMENT_BYTE, 60, 51, 51, 56, 47};
    }

    public AnonymousClass78(List<C0613Mp> list) {
        super(list);
    }

    public static AnonymousClass78 A00(JSONObject jSONObject, C1159dL c1159dL) {
        AnonymousClass78 anonymousClass78 = new AnonymousClass78(AbstractC1434hy.A08(jSONObject, c1159dL, new C1433hx()));
        anonymousClass78.A29(jSONObject);
        anonymousClass78.A1I(A01(0, 6, 6));
        return anonymousClass78;
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

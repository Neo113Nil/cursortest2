package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.ik, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1476ik extends MH {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{52, 54, 45, 51, 54, 45, 56, Base64.padSymbol, -32, -27, -36, -47};
    }

    static {
        A01();
        A03 = C1476ik.class.getSimpleName();
    }

    public C1476ik(C1159dL c1159dL, US us, String str, Uri uri, Map<String, String> mExtraData) {
        super(c1159dL, us, str);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.instagram.common.viewpoint.core.MH
    public final ME A0G(String str) {
        UU uu = UU.A05;
        String queryParameter = this.A00.getQueryParameter(A00(0, 8, 109));
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                uu = UU.values()[Integer.valueOf(queryParameter).intValue()];
            } catch (Exception unused) {
            }
        }
        this.A02.ABK(this.A03, this.A01, this.A00.getQueryParameter(A00(8, 4, 21)), uu);
        return ME.A09;
    }
}

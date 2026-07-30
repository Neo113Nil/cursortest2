package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1501bE implements InterfaceC1066Lu {
    public static byte[] A01;
    public final T8 A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 24);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-93, -73, -56, -82, -118, -71, -78, -78, -87, -80, -87, -40, -47, -47, -56, -49, -99, -125, -39, -24, -2, -52, -3, -20, -11, -5, -26, -117, -102, -109, -109, -118, -111, -68, -53, -60, -60, -69, -62, -75, -62, -59, -67, -67, -69, -70, -58, -43, -50, -50, -59, -52, -65, -52, -49, -57, -57, -55, -50, -57, -65, -51, -49, -60, -59};
    }

    public C1501bE(T8 t82) {
        this.A00 = t82;
    }

    private void A02(int i, String str, JSONObject jSONObject, boolean z8, int i4) {
        C1252Te c1252Te = new C1252Te(A00(4, 6, 44));
        c1252Te.A07(jSONObject);
        c1252Te.A05(1);
        c1252Te.A09(z8);
        c1252Te.A04(i4);
        try {
            jSONObject.put(A00(33, 13, 62), TX.A0H(this.A00));
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put(A00(46, 19, 72), i4);
        } catch (JSONException unused2) {
        }
        this.A00.A08().ABD(A00(27, 6, 13), i + 4000, c1252Te);
        if (this.A00.A05().AAO()) {
            String str2 = A00(10, 8, 75) + str + A00(0, 1, 99) + i + A00(1, 3, 118) + jSONObject.toString();
        }
    }

    public static boolean A03(EnumC1068Lw enumC1068Lw) {
        for (EnumC1068Lw enumC1068Lw2 : ZJ.A06) {
            if (enumC1068Lw2.equals(enumC1068Lw)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1066Lu
    public final void ABE(EnumC1068Lw enumC1068Lw, JSONObject jSONObject, int i) {
        A02(enumC1068Lw.A03(), enumC1068Lw.toString(), jSONObject, A03(enumC1068Lw), i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1066Lu
    public final void ABs(int i, JSONObject jSONObject, int i4) {
        A02(i, A00(18, 9, 111) + i, jSONObject, false, i4);
    }
}

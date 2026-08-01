package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public final class FG extends AbstractC1075aw {
    public static byte[] A02;
    public static String[] A03 = {"EO73VH", "Qgz5bq7vpM6wgaeZrwJ0N", "K0RixItTLV229tIQ9volfY9Fr2yfBG4Z", "0XJd0xzB9RaoqzSBbOWrwbmO5Qd7B1Hm", "", "cDFQfUnzrKwrnb1BC8KnyL9IHyRAK9fC", "Q7Q0M0vYffDRrtcuJmKxnq", "hygqtGcON2Cep"};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {Ascii.SO, 41, 49, 52, 45, 44, -24, 60, 55, -24, 55, 56, 45, 54, -24, 52, 49, 54, 51, -24, Base64.padSymbol, 58, 52, 2, -24, -14, -17, -12, -15};
        if (A03[0].length() == 23) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[3] = "z2LBMWL3UZ6mgEOfq1wT6wdWGhdUBaxY";
        strArr[2] = "LNV6u0tAGiEAXpu6l5ZCQkq7c5KJBKxy";
        A02 = bArr;
    }

    static {
        A01();
        A04 = FG.class.getSimpleName();
    }

    public FG(YA ya, InterfaceC0565If interfaceC0565If, String str, Uri uri, Map<String, String> mExtraData, C01420n c01420n, boolean z) {
        super(ya, interfaceC0565If, str, c01420n, z);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01360g
    public final EnumC01350f A0A() {
        if (A0F(this.A00)) {
            return null;
        }
        try {
            KZ.A0C(new KZ(), ((AbstractC01360g) this).A00, C0611Kc.A00(this.A00.getQueryParameter(A00(25, 4, 35))), ((AbstractC01360g) this).A02);
            return null;
        } catch (Exception unused) {
            String str = A00(0, 25, 101) + this.A00.toString();
            return EnumC01350f.A02;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1075aw
    public final void A0D() {
        EnumC01350f enumC01350f = null;
        if (((AbstractC1075aw) this).A02) {
            enumC01350f = A0A();
        }
        A0E(this.A01, enumC01350f);
    }
}

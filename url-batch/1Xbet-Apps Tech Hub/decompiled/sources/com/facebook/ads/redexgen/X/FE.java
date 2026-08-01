package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class FE extends TD {
    public static byte[] A02;
    public static String[] A03 = {"RkD1OJxt7Cm", "85G", "rOg3VWXB3SEY3xQpEJ0sm9sa", "k8A4i4hEDbRwTbJ7ZqirbVmRMdyhqYao", "w8o7PtZgo3USKQqv4zP9Jz4sqmraE2my", "KkDuTncCOt8", "W5AvxWS2W", "p0drNpcb1k1QxXuNf36gE6"};
    public final /* synthetic */ C1063ak A00;
    public final /* synthetic */ C1053aa A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-113, -68, -68, -71, -68, 106, -81, -62, -81, -83, -65, -66, -77, -72, -79, 106, -85, -83, -66, -77, -71, -72, 2, -2, -3, 0};
    }

    static {
        A01();
    }

    public FE(C1063ak c1063ak, C1053aa c1053aa) {
        this.A00 = c1063ak;
        this.A01 = c1053aa;
    }

    @Override // com.facebook.ads.redexgen.X.NE
    public final void AAY() {
        boolean z;
        this.A00.A0E = true;
        z = this.A00.A0F;
        if (!z) {
            return;
        }
        this.A00.A09();
    }

    @Override // com.facebook.ads.redexgen.X.TD, com.facebook.ads.redexgen.X.NE
    public final void AAp(String str, Map<String, String> extraData) {
        C0457Dz c0457Dz;
        C0457Dz c0457Dz2;
        InterfaceC0565If interfaceC0565If;
        F6 f6;
        F6 f62;
        C1R A0x;
        String str2;
        C0457Dz c0457Dz3;
        InterfaceC01510w interfaceC01510w;
        InterfaceC01510w interfaceC01510w2;
        c0457Dz = this.A00.A03;
        c0457Dz.A0E().A3f();
        Uri A00 = C0611Kc.A00(str);
        if (A00(22, 4, 82).equals(A00.getScheme()) && C01370h.A04(A00.getAuthority())) {
            interfaceC01510w = this.A00.A00;
            if (interfaceC01510w != null) {
                interfaceC01510w2 = this.A00.A00;
                interfaceC01510w2.AAi(this.A00);
            }
        }
        c0457Dz2 = this.A00.A03;
        interfaceC0565If = this.A00.A04;
        String A6N = this.A01.A6N();
        f6 = this.A00.A02;
        if (f6 == null) {
            A0x = null;
        } else {
            f62 = this.A00.A02;
            A0x = f62.A0x();
        }
        AbstractC01360g adAction = C01370h.A00(c0457Dz2, interfaceC0565If, A6N, A00, extraData, A0x);
        if (adAction == null) {
            return;
        }
        try {
            c0457Dz3 = this.A00.A03;
            c0457Dz3.A0E().A3c();
            adAction.A0C();
        } catch (Exception e) {
            str2 = C1063ak.A0I;
            String[] strArr = A03;
            if (strArr[0].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "yKt";
            strArr2[2] = "O3cmN93hsB9jwoMarcV7SE5e";
            Log.e(str2, A00(0, 22, 0), e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.TD, com.facebook.ads.redexgen.X.NE
    public final void ABZ() {
        C0457Dz c0457Dz;
        C1051aY c1051aY;
        C1051aY c1051aY2;
        C1051aY c1051aY3;
        c0457Dz = this.A00.A03;
        InterfaceC1082b3 A0E = c0457Dz.A0E();
        c1051aY = this.A00.A01;
        A0E.A3g(c1051aY != null);
        c1051aY2 = this.A00.A01;
        if (c1051aY2 == null) {
            return;
        }
        c1051aY3 = this.A00.A01;
        c1051aY3.A02();
    }

    @Override // com.facebook.ads.redexgen.X.TD, com.facebook.ads.redexgen.X.NE
    public final void ACH() {
        C0457Dz c0457Dz;
        C1051aY c1051aY;
        c0457Dz = this.A00.A03;
        c0457Dz.A0E().A3i();
        c1051aY = this.A00.A01;
        c1051aY.A07();
    }

    @Override // com.facebook.ads.redexgen.X.NE
    public final void ADZ() {
    }
}

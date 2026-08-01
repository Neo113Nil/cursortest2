package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Zz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1016Zz implements InterfaceC01791y {
    public static byte[] A04;
    public static String[] A05 = {"iEaWyjzULIZCFnp1nESlU5XZjwcvRjHd", "KbGYZiX8Pduw0KfpYwrRe1NWFWC1OMxy", "fhu9engps4P6WEn4zln6smGq5lQXex4h", "tbT6PfDqIL055", "rKa5gX4b0", "TAsNWcfBygYGmj6nueBPL3we7Mc4FYi0", "mn5595Nd0", "gAb4cPpeQcskkpTdmUE6rt9G8rZq3FNo"};
    public EnumC01781x A00 = EnumC01781x.A03;
    public EnumC01781x A01 = EnumC01781x.A03;
    public final AbstractC1013Zw A02;
    public final YA A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A05;
            if (strArr[7].charAt(1) != strArr[5].charAt(1)) {
                throw new RuntimeException();
            }
            A05[0] = "d2XCtNqKB2PlkmIVLWNasBjUSsZJOiBr";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 29);
            i4++;
        }
    }

    public static void A01() {
        A04 = new byte[]{-73, Ascii.VT, 6, -73, 118, 104, -95, -73, -67, 104, -85, -87, -74, 104, -85, -80, -87, -74, -81, -83, 104, -111, -74, -68, -83, -81, -70, -87, -68, -79, -73, -74, 104, -115, -70, -70, -73, -70, 104, -75, -73, -84, -83, 104, -86, -63, 104, -69, -83, -68, -68, -79, -74, -81, 104, -119, -84, -101, -83, -68, -68, -79, -74, -81, -69, 118, -69, -83, -68, -111, -74, -68, -83, -81, -70, -87, -68, -79, -73, -74, -115, -70, -70, -73, -70, -107, -73, -84, -83, 112, 113, 112, 108, 107, -97, -114, -109, -113, -104, -115, -113, 120, -113, -98, -95, -103, -100, -107, -103, -59, -62, -64, 115, -41, -14, -17, -18, -25, -96, -23, -18, -12, -27, -14, -18, -31, -20, -96, -12, -14, -31, -18, -13, -23, -12, -23, -17, -18, -82, -15, 0, -7, -67, -64, -78, -75, 121, 122, -63, -74, -67, -59, 118, 119, Ascii.SI, 3, -4, Ascii.SI, -69, 4, Ascii.SO, -69, -4, 7, Ascii.CR, 0, -4, -1, Ascii.DC4, -69, -25, -22, -36, -33, -28, -23, -30, -57, -69, -25, -22, -36, -33, -32, -33, -69, 10, Ascii.CR, -69, -18, -29, -22, -14, -28, -23, -30, -45, -57, -64, -45, Byte.MAX_VALUE, -56, -46, Byte.MAX_VALUE, -64, -53, -47, -60, -64, -61, -40, Byte.MAX_VALUE, -78, -89, -82, -74, -88, -83, -90, -14, -26, -33, -14, -98, -25, -15, -98, -20, -19, -14, -98, -54, -51, -65, -62, -61, -62};
    }

    static {
        A01();
    }

    public C1016Zz(YA ya, AbstractC1013Zw abstractC1013Zw) {
        this.A03 = ya;
        this.A02 = abstractC1013Zw;
    }

    private void A02(EnumC01781x enumC01781x, EnumC01781x enumC01781x2) {
        String A00 = A00(113, 26, 99);
        StringBuilder sb = new StringBuilder();
        String errorTitle = A00(108, 5, 54);
        StringBuilder append = sb.append(errorTitle).append(enumC01781x);
        String errorTitle2 = A00(0, 4, 122);
        String sb2 = append.append(errorTitle2).append(enumC01781x2).toString();
        InterfaceC03197w A07 = this.A03.A07();
        int i = C03207x.A0e;
        C03217y c03217y = new C03217y(A00, sb2);
        String errorTitle3 = A00(Opcodes.F2I, 3, 115);
        A07.A9M(errorTitle3, i, c03217y);
        String errorTitle4 = A00 + ' ' + sb2;
        this.A03.A0E().AGX(errorTitle4);
    }

    private void A03(String str, String str2, boolean z) {
        AdSettings.IntegrationErrorMode A00 = C01751u.A00(this.A03);
        String format = String.format(Locale.US, AdErrorType.INCORRECT_API_CALL_ERROR.getDefaultErrorMessage(), str, str2);
        String A002 = A00(Opcodes.F2I, 3, 115);
        String A003 = A00(91, 17, 13);
        if (!z) {
            Log.e(A003, format);
            this.A03.A07().A9M(A002, C03207x.A0c, new C03217y(format));
            this.A03.A0E().AGW(format);
            return;
        }
        switch (C01771w.A00[A00.ordinal()]) {
            case 1:
                String errorMessage = format + A00(4, 87, 43);
                throw new C01801z(errorMessage);
            case 2:
                this.A02.A05();
                this.A02.A06(10, AdErrorType.INCORRECT_STATE_ERROR, format);
                this.A03.A0E().AGW(format);
                Log.e(A003, format);
                this.A03.A07().A9M(A002, C03207x.A0c, new C03217y(format));
                break;
        }
        Log.e(A003, format);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01791y
    public final boolean A5Y() {
        boolean z = (this.A00 == EnumC01781x.A03 || this.A00 == EnumC01781x.A05) && this.A01 != EnumC01781x.A08;
        if (z) {
            this.A00 = EnumC01781x.A07;
        } else {
            A03(A00(Opcodes.D2I, 6, 52), A00(154, 42, 126), false);
        }
        return !z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01791y
    public final boolean A5Z() {
        boolean z = this.A00 == EnumC01781x.A06 && (this.A01 != EnumC01781x.A08 || IP.A0h(this.A03));
        if (z) {
            this.A00 = EnumC01781x.A03;
            this.A01 = EnumC01781x.A08;
        } else {
            EnumC01781x enumC01781x = this.A00;
            EnumC01781x enumC01781x2 = EnumC01781x.A06;
            String A00 = A00(Opcodes.LCMP, 6, 49);
            if (enumC01781x != enumC01781x2) {
                A03(A00, A00(219, 18, 97), true);
            } else {
                A03(A00, A00(196, 23, 66), false);
            }
        }
        return !z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01791y
    public final EnumC01781x A5r() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01791y
    public final void AFC(EnumC01781x enumC01781x) {
        this.A00 = enumC01781x;
        this.A01 = enumC01781x;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01791y
    public final void AFG(AdError adError) {
        this.A00 = EnumC01781x.A05;
        this.A01 = EnumC01781x.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01791y
    public final void AFK() {
        if (this.A00 != EnumC01781x.A07) {
            A02(this.A00, EnumC01781x.A06);
        }
        this.A00 = EnumC01781x.A06;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01791y
    public final void AFU() {
        if (this.A01 != EnumC01781x.A08) {
            A02(this.A00, EnumC01781x.A09);
        }
        this.A01 = EnumC01781x.A09;
    }
}

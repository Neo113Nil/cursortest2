package com.facebook.ads.redexgen.X;

import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public class UT extends AbstractC01440p {
    public static byte[] A01;
    public final /* synthetic */ UJ A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 109);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.ETB, 42, Base64.padSymbol, 50, 63, 46, -23, 42, 45, 60, -23, 54, 42, 55, 42, 48, 46, 59, -23, Base64.padSymbol, 49, 46, 50, 59, -23, 56, 64, 55, -23, 50, 54, 57, 59, 46, 60, 60, 50, 56, 55, 60, -9};
    }

    public UT(UJ uj) {
        this.A00 = uj;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01440p
    public final void A0B(C1060ah c1060ah) {
        this.A00.A1T(c1060ah);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01440p
    public final void A0C() {
        UI ui;
        UI ui2;
        ui = this.A00.A0G;
        if (ui != null) {
            ui2 = this.A00.A0G;
            ui2.AAN();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01440p
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 92));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01440p
    public final void A0F(InterfaceC01430o interfaceC01430o) {
        C0472Eo c0472Eo;
        C0472Eo c0472Eo2;
        c0472Eo = this.A00.A0A;
        if (c0472Eo != null) {
            c0472Eo2 = this.A00.A0A;
            c0472Eo2.A0I();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC01440p
    public final void A0G(JG jg) {
        long j;
        UI ui;
        UI ui2;
        C0S A0E = this.A00.A11().A0E();
        j = this.A00.A00;
        A0E.A2i(LM.A01(j), jg.A03().getErrorCode(), jg.A04());
        ui = this.A00.A0G;
        if (ui != null) {
            ui2 = this.A00.A0G;
            ui2.ABH(jg);
        }
    }
}

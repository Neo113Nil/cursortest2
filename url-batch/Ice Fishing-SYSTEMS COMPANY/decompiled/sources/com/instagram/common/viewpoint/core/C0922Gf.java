package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Gf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0922Gf implements InterfaceC1373Ya {
    public static byte[] A01;
    public static String[] A02 = {"csDJTKMsYdQDTZ6oaAKl5T8I2UfElmlw", "ZPoBWwRbmlxJW4JBXeHiCznpgduRwX0R", "YnHNxwrcL4VP2rzDabEPBpSRhKQlF70O", "ZXjFBdL6N8QRVPocRq4T6yjW", "DvDV4BG5U2fSuPxyYCt3atNQBem4gb3r", "Lz5NxPzXDVZYAcKGP0xvxFjIAyYktO5Y", "USLnjf5V4FwfzNcoOXwUO87ZM5qcDzRn", "2jpbWPspWwKCP4YD7vZxOkEv1N6M1MwD"};
    public final /* synthetic */ C0921Ge A00;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        if (A02[0].charAt(1) == '2') {
            throw new RuntimeException();
        }
        A02[3] = "dLINtRlzHu";
        A01 = new byte[]{117, 109, 111, 118};
    }

    static {
        A01();
    }

    public C0922Gf(C0921Ge c0921Ge) {
        this.A00 = c0921Ge;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1373Ya
    public final void ACl(AbstractC1374Yb abstractC1374Yb) {
        AbstractC0978Ij abstractC0978Ij;
        VI vi;
        AbstractC0978Ij abstractC0978Ij2;
        if (abstractC1374Yb.getToolbarActionMode() == 8) {
            abstractC0978Ij = this.A00.A04;
            if (abstractC0978Ij != null) {
                vi = this.A00.A0F;
                vi.A04(VH.A0Y, null);
                abstractC0978Ij2 = this.A00.A04;
                abstractC0978Ij2.A1D(A00(0, 4, 95));
                this.A00.A0G();
                return;
            }
        }
        this.A00.A0E();
    }
}

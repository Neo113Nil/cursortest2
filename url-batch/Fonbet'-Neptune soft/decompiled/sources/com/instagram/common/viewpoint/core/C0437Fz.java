package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Fz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0437Fz implements InterfaceC0882Xl {
    public static byte[] A01;
    public static String[] A02 = {"csDJTKMsYdQDTZ6oaAKl5T8I2UfElmlw", "ZPoBWwRbmlxJW4JBXeHiCznpgduRwX0R", "YnHNxwrcL4VP2rzDabEPBpSRhKQlF70O", "ZXjFBdL6N8QRVPocRq4T6yjW", "DvDV4BG5U2fSuPxyYCt3atNQBem4gb3r", "Lz5NxPzXDVZYAcKGP0xvxFjIAyYktO5Y", "USLnjf5V4FwfzNcoOXwUO87ZM5qcDzRn", "2jpbWPspWwKCP4YD7vZxOkEv1N6M1MwD"};
    public final /* synthetic */ C0436Fy A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 89);
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

    public C0437Fz(C0436Fy c0436Fy) {
        this.A00 = c0436Fy;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0882Xl
    public final void ACC(AbstractC0883Xm abstractC0883Xm) {
        AbstractC0480Hr abstractC0480Hr;
        C0796Ua c0796Ua;
        AbstractC0480Hr abstractC0480Hr2;
        if (abstractC0883Xm.getToolbarActionMode() == 8) {
            abstractC0480Hr = this.A00.A04;
            if (abstractC0480Hr != null) {
                c0796Ua = this.A00.A0F;
                c0796Ua.A04(UZ.A0Y, null);
                abstractC0480Hr2 = this.A00.A04;
                abstractC0480Hr2.A1A(A00(0, 4, 95));
                this.A00.A0E();
                return;
            }
        }
        this.A00.A0C();
    }
}

package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class W9 implements InterfaceC0426Co {
    public static byte[] A03;
    public InterfaceC0409Bm A00;
    public C0553Ht A01;
    public boolean A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{90, 75, 75, 87, 82, 88, 90, 79, 82, 84, 85, Ascii.DC4, 67, Ascii.SYN, 72, 88, 79, 94, 8, Ascii.SO};
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Co
    public final void A4O(C0541Hh c0541Hh) {
        if (!this.A02) {
            if (this.A01.A05() == -9223372036854775807L) {
                return;
            }
            this.A00.A5j(Format.A02(null, A00(0, 20, 99), this.A01.A05()));
            this.A02 = true;
        }
        int A04 = c0541Hh.A04();
        this.A00.AEr(c0541Hh, A04);
        this.A00.AEs(this.A01.A04(), 1, A04, 0, null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Co
    public final void A8g(C0553Ht c0553Ht, InterfaceC0401Bc interfaceC0401Bc, C0431Cu c0431Cu) {
        this.A01 = c0553Ht;
        c0431Cu.A05();
        InterfaceC0409Bm AFx = interfaceC0401Bc.AFx(c0431Cu.A03(), 4);
        this.A00 = AFx;
        AFx.A5j(Format.A0B(c0431Cu.A04(), A00(0, 20, 99), null, -1, null));
    }
}

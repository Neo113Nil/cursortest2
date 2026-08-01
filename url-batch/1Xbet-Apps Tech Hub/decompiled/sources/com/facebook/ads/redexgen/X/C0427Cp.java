package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Cp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0427Cp {
    public static byte[] A02;
    public final List<Format> A00;
    public final InterfaceC0409Bm[] A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 56);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-107, -70, -62, -83, -72, -75, -80, 108, -81, -72, -69, -65, -79, -80, 108, -81, -83, -68, -64, -75, -69, -70, 108, -71, -75, -71, -79, 108, -64, -59, -68, -79, 108, -68, -66, -69, -62, -75, -80, -79, -80, -122, 108, -17, -2, -2, -6, -9, -15, -17, 2, -9, -3, -4, -67, -15, -13, -17, -69, -60, -66, -58, -4, Ascii.VT, Ascii.VT, 7, 4, -2, -4, Ascii.SI, 4, 10, 9, -54, -2, 0, -4, -56, -46, -53, -45};
    }

    public C0427Cp(List<Format> closedCaptionFormats) {
        this.A00 = closedCaptionFormats;
        this.A01 = new InterfaceC0409Bm[closedCaptionFormats.size()];
    }

    public final void A02(long j, C0541Hh c0541Hh) {
        C0490Fg.A03(j, c0541Hh, this.A01);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A03(InterfaceC0401Bc interfaceC0401Bc, C0431Cu c0431Cu) {
        for (int i = 0; i < i; i++) {
            c0431Cu.A05();
            InterfaceC0409Bm output = interfaceC0401Bc.AFx(c0431Cu.A03(), 3);
            Format format = this.A00.get(i);
            String str = format.A0O;
            HI.A05(A00(43, 19, 86).equals(str) || A00(62, 19, 99).equals(str), A00(0, 43, 20) + str);
            output.A5j(Format.A08(format.A0M != null ? format.A0M : c0431Cu.A04(), str, null, -1, format.A0D, format.A0N, format.A03, null));
            this.A01[i] = output;
        }
    }
}

package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1029aC extends K8 {
    public static byte[] A03;
    public final /* synthetic */ C1063ak A00;
    public final /* synthetic */ C01731s A01;
    public final /* synthetic */ C0481Ex A02;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{32, 5, 0, 17, Ascii.NAK, 4, 19, 65, Ascii.NAK, 8, Ascii.FF, 4, Ascii.SO, Ascii.DC4, Ascii.NAK, 79};
    }

    public C1029aC(C0481Ex c0481Ex, C01731s c01731s, C1063ak c1063ak) {
        this.A02 = c0481Ex;
        this.A01 = c01731s;
        this.A00 = c1063ak;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        this.A02.A0P(this.A01);
        this.A02.A0M(this.A00);
        this.A02.ABH(new JG(AdErrorType.NETWORK_ERROR, A00(0, 16, 43)));
    }
}

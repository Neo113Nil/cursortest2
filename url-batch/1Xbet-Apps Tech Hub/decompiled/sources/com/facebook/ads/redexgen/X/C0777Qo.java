package com.facebook.ads.redexgen.X;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Qo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0777Qo {
    public static byte[] A07;
    public InterfaceC0768Qf A05;
    public int A04 = 60000;
    public int A03 = 100;
    public int A00 = 10000;
    public int A02 = 8000;
    public int A01 = 3;
    public Map<String, String> A06 = new HashMap();

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{49, Ascii.GS, 4, Ascii.NAK, 17, 9, 17, 92, Ascii.SO, Ascii.EM, 8, Ascii.SO, Ascii.NAK, Ascii.EM, Ascii.SI, 92, 17, 9, Ascii.SI, 8, 92, Ascii.RS, Ascii.EM, 92, Ascii.RS, Ascii.EM, 8, Ascii.VT, Ascii.EM, Ascii.EM, Ascii.DC2, 92, 77, 92, Ascii.GS, Ascii.DC2, Ascii.CAN, 92, 77, 68};
    }

    public final C0777Qo A02(int i) {
        this.A00 = i;
        return this;
    }

    public final C0777Qo A03(int i) {
        if (i >= 1 && i <= 18) {
            this.A01 = i;
            return this;
        }
        throw new IllegalArgumentException(A00(0, 40, 56));
    }

    public final C0777Qo A04(int i) {
        this.A02 = i;
        return this;
    }

    public final C0777Qo A05(int i) {
        this.A03 = i;
        return this;
    }

    public final C0777Qo A06(int i) {
        this.A04 = i;
        return this;
    }

    public final C0777Qo A07(InterfaceC0768Qf interfaceC0768Qf) {
        this.A05 = interfaceC0768Qf;
        return this;
    }

    public final C0777Qo A08(Map<String, String> requestHeaders) {
        this.A06 = requestHeaders;
        return this;
    }

    public final C0778Qp A09() {
        return new C0778Qp(this.A04, this.A00, this.A02, this.A03, this.A01, this.A06, this.A05);
    }
}

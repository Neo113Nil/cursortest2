package com.facebook.ads.redexgen.X;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Xs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0959Xs implements InterfaceC0768Qf {
    public static byte[] A01;
    public final Y9 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 127);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-2, -45, -20, -24, -45, -10, Ascii.NAK, Ascii.NAK, Ascii.DC2, -45, -8, Ascii.NAK, Ascii.ESC, Ascii.SUB, Ascii.SI, Ascii.DC4, Ascii.CR, -45, -6, Ascii.NAK, 17, Ascii.VT, Ascii.DC4, 102, 100, 86, 99, Ascii.RS, 82, 88, 86, 95, 101};
    }

    public C0959Xs(Y9 y9) {
        this.A00 = y9;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0768Qf
    public final Map<String, String> A5k(boolean z) {
        HashMap hashMap = new HashMap();
        if (!AnonymousClass62.A00().A04()) {
            hashMap.put(A00(0, 23, 39), C8S.A00().A01(this.A00, true).A0A());
        }
        hashMap.put(A00(23, 10, 114), C8W.A06(new AnonymousClass87(this.A00), this.A00, z));
        return hashMap;
    }
}

package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class YN implements InterfaceC1230eb {
    public static byte[] A01;
    public final C1127cu A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{82, 39, 76, 72, 39, 90, 101, 101, 102, 39, 88, 101, Byte.MAX_VALUE, 126, 99, 100, 109, 39, 94, 101, 97, 111, 100, Ascii.FF, 10, Ascii.FS, Ascii.VT, 84, Ascii.CAN, Ascii.RS, Ascii.FS, Ascii.ETB, Ascii.CR};
    }

    public YN(C1127cu c1127cu) {
        this.A00 = c1127cu;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1230eb
    public final Map<String, String> A6Y(boolean z) {
        HashMap hashMap = new HashMap();
        if (!AbstractC0737Rr.A00().A04()) {
            hashMap.put(A00(0, 23, 64), TY.A00().A01(this.A00, true).A04());
        }
        hashMap.put(A00(23, 10, 51), AbstractC0772Tb.A06(new T6(this.A00), this.A00, z));
        return hashMap;
    }
}

package com.instagram.common.viewpoint.core;

import android.util.Log;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Bd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0319Bd implements InterfaceC1335gE {
    public static byte[] A02;
    public static final C0319Bd A03;
    public String A01 = A01(1, 7, 98);
    public int A00 = 5;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 42);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A02 = new byte[]{-33, 1, -6, -9, -6, -5, 3, -6};
    }

    static {
        A05();
        A03 = new C0319Bd();
    }

    public static C0319Bd A00() {
        return A03;
    }

    private String A02(String str) {
        if (this.A01 != null) {
            return this.A01 + A01(0, 1, Opcodes.LSHR) + str;
        }
        return str;
    }

    public static String A03(String str, Throwable th) {
        return str + '\n' + A04(th);
    }

    public static String A04(Throwable th) {
        if (th == null) {
            return A01(0, 0, 21);
        }
        return Log.getStackTraceString(th);
    }

    private void A06(int i, String str, String str2) {
        Log.println(i, A02(str), str2);
    }

    private void A07(int i, String str, String str2, Throwable th) {
        Log.println(i, A02(str), A03(str2, th));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1335gE
    public final void A9l(String str, String str2) {
        A06(4, str, str2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1335gE
    public final void A9m(String str, String str2, Throwable th) {
        A07(4, str, str2, th);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1335gE
    public final boolean AAP(int i) {
        return this.A00 <= i;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1335gE
    public final void AIo(int i) {
        this.A00 = i;
    }
}

package com.facebook.ads.redexgen.X;

import android.content.ActivityNotFoundException;
import android.util.Log;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class NW {
    public static byte[] A0A;
    public NV A00;
    public boolean A01;
    public boolean A02;
    public final C1R A03;
    public final YA A04;
    public final InterfaceC0565If A05;
    public final LN A06;
    public final InterfaceC0652Lt A07;
    public final C0764Qb A08;
    public final String A09;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 104);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{Ascii.US, 8, Ascii.GS, Ascii.RS, 41, 40, 40, 51, 50, Ascii.US, 48, 53, 63, 55, 16, 53, 47, 40, 57, 50, 57, 46, 114, 69, 69, 88, 69, Ascii.ETB, 82, 79, 82, 84, 66, 67, 94, 89, 80, Ascii.ETB, 86, 84, 67, 94, 88, 89, 73, 126, 126, 99, 126, 44, 123, 100, 101, 96, 105, 44, 99, 124, 105, 98, 101, 98, 107, 44};
    }

    public NW(YA ya, String str, C0764Qb c0764Qb, LN ln, InterfaceC0565If interfaceC0565If, C1R c1r) {
        this(ya, str, c0764Qb, ln, interfaceC0565If, c1r, new T4());
    }

    public NW(YA ya, String str, C0764Qb c0764Qb, LN ln, InterfaceC0565If interfaceC0565If, C1R c1r, InterfaceC0652Lt interfaceC0652Lt) {
        this.A01 = true;
        this.A04 = ya;
        this.A09 = str;
        this.A08 = c0764Qb;
        this.A06 = ln;
        this.A05 = interfaceC0565If;
        this.A03 = c1r;
        this.A07 = interfaceC0652Lt;
    }

    public static void A03(YA ya, C0764Qb c0764Qb, LN ln, InterfaceC0565If interfaceC0565If, C1N c1n, String str, C1R c1r) {
        AbstractC01360g A01 = C01370h.A01(ya, interfaceC0565If, str, C0611Kc.A00(c1n.A05()), new NL().A03(c0764Qb).A02(ln).A05(), false, false, c1r);
        if (A01 != null) {
            A01.A0A();
        }
    }

    private void A05(String str, String str2, Map<String, String> extraData) {
        this.A05.A9o(str, extraData);
        C0625Ks.A00(new NT(this, extraData, str, str2), new NU(this, str, extraData), ActivityUtils.A00());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(String str, String str2, Map<String, String> map) {
        String A01 = A01(0, 22, 52);
        try {
            AbstractC01360g A012 = C01370h.A01(this.A04, this.A05, str, C0611Kc.A00(str2), new NL(map).A03(this.A08).A02(this.A06).A05(), this.A01, this.A02, this.A03);
            if (A012 != null) {
                A012.A0C();
            }
            NV nv = this.A00;
            if (nv != null) {
                nv.AAz();
            }
            this.A07.A3z(this.A09);
        } catch (ActivityNotFoundException e) {
            Log.e(A01, A01(44, 20, 100) + str2, e);
        } catch (Exception e2) {
            Log.e(A01, A01(22, 22, 95), e2);
        }
    }

    public final void A07(NV nv) {
        this.A00 = nv;
    }

    public final void A08(String str, String str2, Map<String, String> extraData) {
        new C0573In(str, this.A05).A04(EnumC0572Im.A0J, extraData);
        if (this.A06.A09(this.A04)) {
            this.A05.A9I(str, extraData);
        } else if (IP.A1I(this.A04)) {
            A05(str, str2, extraData);
        } else {
            A06(str, str2, extraData);
        }
    }

    public final void A09(boolean z) {
        this.A02 = z;
    }

    public final void A0A(boolean z) {
        this.A01 = z;
    }
}

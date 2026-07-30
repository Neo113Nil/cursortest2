package com.instagram.common.viewpoint.core;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class a5 {
    public static long A0F;
    public static byte[] A0G;
    public static String[] A0H = {"R0SbMgWAoC497HVFrz", "HjDMjTQFKfQjEPdjddKMHVEmssyIO6xJ", "qLmiUd82g2mhrwqPXxjSPUm4NIZHyVr2", "b8w5", "5ahVLoWejnV8u5u0zxB2Y4aA1Z0H734m", "82nB4Ww4zktBcOGVc7", "fE0nEfPNcAkneFTlCeTsSM9yzZ1yQJUc", "9xmO"};
    public MF A00;
    public MH A01;
    public AbstractC1434hy A02;
    public C0858Wh A03;
    public InterfaceC0872Wv A04;
    public InterfaceC0959a4 A05;
    public boolean A06;
    public boolean A07;
    public final N3 A08;
    public final C1159dL A09;
    public final US A0A;
    public final XH A0B;
    public final InterfaceC0890Xn A0C;
    public final C1232eX A0D;
    public final String A0E;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 19);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {119, -120, 117, 118, -87, -88, -88, -93, -94, 119, -96, -99, -105, -97, Byte.MIN_VALUE, -99, -89, -88, -103, -94, -103, -90, 115, -96, -96, -99, -96, 78, -109, -90, -109, -111, -93, -94, -105, -100, -107, 78, -113, -111, -94, -105, -99, -100, -100, -55, -55, -58, -55, 119, -50, -65, -64, -61, -68, 119, -58, -57, -68, -59, -64, -59, -66, 119, -55, -46, -49, -55, -47, -59, -39, -43, -37, -40, -55, -53};
        String[] strArr = A0H;
        if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
            throw new RuntimeException();
        }
        A0H[5] = "";
        A0G = bArr;
    }

    static {
        A03();
        A0F = 0L;
    }

    public a5(C1159dL c1159dL, String str, C1232eX c1232eX, XH xh, US us, N3 n3) {
        this(c1159dL, str, c1232eX, xh, us, n3, new KF());
    }

    public a5(C1159dL c1159dL, String str, C1232eX c1232eX, XH xh, US us, N3 n3, InterfaceC0890Xn interfaceC0890Xn) {
        this.A06 = true;
        this.A09 = c1159dL;
        this.A0E = str;
        this.A0D = c1232eX;
        this.A0B = xh;
        this.A0A = us;
        this.A08 = n3;
        this.A0C = interfaceC0890Xn;
    }

    public a5(C1159dL c1159dL, String str, C1232eX c1232eX, XH xh, US us, N3 n3, InterfaceC0890Xn interfaceC0890Xn, InterfaceC0872Wv interfaceC0872Wv) {
        this.A06 = true;
        this.A09 = c1159dL;
        this.A0E = str;
        this.A0D = c1232eX;
        this.A0B = xh;
        this.A0A = us;
        this.A08 = n3;
        this.A0C = interfaceC0890Xn;
        this.A04 = interfaceC0872Wv;
    }

    private ME A00(String str, String str2, Map<String, String> map) {
        String A01 = A01(0, 22, 33);
        ME actionOutcome = ME.A09;
        try {
            XP.A0Y(map, this.A02);
            Uri A00 = WQ.A00(str2);
            if (this.A01 == null) {
                this.A01 = MI.A01(this.A09, this.A0A, str, A00, new C0944Zp(map).A03(this.A0D).A02(this.A0B).A05(), this.A06, this.A07, this.A08);
                A02();
            }
            if (this.A01 instanceof C7Q) {
                ((C7Q) this.A01).A0N(this.A03);
            }
            if (this.A01 != null) {
                actionOutcome = this.A01.A0G(map.get(A01(64, 12, 83)));
                if (this.A07 && (this.A01 instanceof C7P)) {
                    actionOutcome = ME.A08;
                }
            }
            if (!(((this.A01 instanceof C7O) || (this.A01 instanceof C7Q)) && XP.A0e(this.A09, actionOutcome, map)) && actionOutcome != ME.A06) {
                if (this.A05 != null) {
                    this.A05.ACu();
                }
                this.A0C.A4b(this.A0E);
            }
        } catch (ActivityNotFoundException e) {
            Log.e(A01, A01(44, 20, 68) + str2, e);
        } catch (Exception e2) {
            Log.e(A01, A01(22, 22, 27), e2);
        }
        return actionOutcome;
    }

    private void A02() {
        if (this.A01 != null && this.A01.A0E() == null && this.A00 != null) {
            this.A01.A0F(this.A00);
        }
    }

    public static boolean A04(C1159dL c1159dL) {
        boolean A2o = U7.A2o(c1159dL);
        int A07 = U7.A07(c1159dL);
        long currentTimeMillis = System.currentTimeMillis() - A0F;
        if (A2o && A0F > 0 && currentTimeMillis < A07) {
            return true;
        }
        A0F = System.currentTimeMillis();
        return false;
    }

    public final ME A05(String str, String str2, Map<String, String> extraData) {
        ME me = ME.A09;
        new C0802Ua(str, this.A0A).A04(UZ.A0J, extraData);
        if (this.A0B.A09(this.A09)) {
            this.A0A.AAs(str, extraData);
        } else {
            me = A00(str, str2, extraData);
            if (this.A02 != null && this.A02.A20().A0L() != null && this.A04 != null) {
                WX.A07(this.A09.A02(), this.A02.A20().A0L(), this.A04);
            }
        }
        return me;
    }

    public final MF A06() {
        if (this.A01 != null) {
            MF A0E = this.A01.A0E();
            String[] strArr = A0H;
            if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0H;
            strArr2[4] = "m9EeWSKmUQIcAT4bR8TqW1uNxXCrncrR";
            strArr2[6] = "ZpUrOoewPl5vbi76KZuNJwABiWDkIMaY";
            return A0E;
        }
        return null;
    }

    public final void A07(MF mf) {
        this.A00 = mf;
        A02();
    }

    public final void A08(AbstractC1434hy abstractC1434hy) {
        this.A02 = abstractC1434hy;
    }

    public final void A09(C0858Wh c0858Wh) {
        this.A03 = c0858Wh;
    }

    public final void A0A(InterfaceC0872Wv interfaceC0872Wv) {
        this.A04 = interfaceC0872Wv;
    }

    public final void A0B(InterfaceC0959a4 interfaceC0959a4) {
        this.A05 = interfaceC0959a4;
    }

    public final void A0C(boolean z) {
        this.A07 = z;
    }
}

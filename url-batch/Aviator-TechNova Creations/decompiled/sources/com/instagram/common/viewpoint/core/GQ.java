package com.instagram.common.viewpoint.core;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public abstract class GQ {
    public static byte[] A04;
    public static String[] A05 = {"uP2VmRjmPrkQ", "gRGWgf4lLYF9Rif8PQPDNbGokb9BUMtV", "bSjOyzwe8Lqn79dPeHIi8kfJVgfNJaEZ", "7R1XMZQjg8S2TiXm1wE8kLqT1leJFKD3", "sD", "qKJRf3b", "Q40N8hoONMcQBFaHNU", "iAP6W7CwppN1UlUQVXHbR"};
    public GK A00;
    public final int A01;
    public final C1632lV A02;
    public final GP A03;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 35);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{7, 32, 56, 47, 34, 39, 42, 110, 45, 47, Base64.padSymbol, 43};
    }

    static {
        A03();
    }

    public GQ(GL gl, GP gp, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.A03 = gp;
        this.A01 = i;
        this.A02 = new C1632lV(gl, j, j2, j3, j4, j5, j6);
    }

    private final int A00(InterfaceC1625lN interfaceC1625lN, long j, C0463Gt c0463Gt) {
        if (j != interfaceC1625lN.A8f()) {
            c0463Gt.A00 = j;
            return 1;
        }
        if (A05[5].length() != 7) {
            throw new RuntimeException();
        }
        A05[4] = "eb0wJDSKJb6zWnRAqReB9UTGfXv";
        return 0;
    }

    private final GK A01(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long A052 = this.A02.A05(j);
        j2 = this.A02.A05;
        j3 = this.A02.A02;
        j4 = this.A02.A04;
        j5 = this.A02.A01;
        j6 = this.A02.A00;
        return new GK(j, A052, j2, j3, j4, j5, j6);
    }

    private final void A04(boolean z, long j) {
        this.A00 = null;
        this.A03.AFA();
    }

    private final boolean A05(InterfaceC1625lN interfaceC1625lN, long j) throws IOException {
        long A8f = j - interfaceC1625lN.A8f();
        if (A8f >= 0 && A8f <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            interfaceC1625lN.AJJ((int) A8f);
            return true;
        }
        return false;
    }

    public final int A06(InterfaceC1625lN interfaceC1625lN, C0463Gt c0463Gt) throws IOException {
        long A01;
        long A00;
        long A02;
        long A042;
        int i;
        long j;
        long j2;
        long j3;
        long floorPosition;
        long j4;
        long j5;
        long j6;
        while (true) {
            GK gk = (GK) C3M.A02(this.A00);
            A01 = gk.A01();
            A00 = gk.A00();
            A02 = gk.A02();
            if (A00 - A01 <= this.A01) {
                A04(false, A01);
                String[] strArr = A05;
                if (strArr[3].charAt(1) != strArr[1].charAt(1)) {
                    throw new RuntimeException();
                }
                A05[5] = "cjf3Phs";
                return A00(interfaceC1625lN, A01, c0463Gt);
            }
            if (!A05(interfaceC1625lN, A02)) {
                return A00(interfaceC1625lN, A02, c0463Gt);
            }
            interfaceC1625lN.AI1();
            GP gp = this.A03;
            A042 = gk.A04();
            GN AIC = gp.AIC(interfaceC1625lN, A042);
            i = AIC.A00;
            switch (i) {
                case -3:
                    A04(false, A02);
                    return A00(interfaceC1625lN, A02, c0463Gt);
                case -2:
                    j5 = AIC.A02;
                    j6 = AIC.A01;
                    gk.A0D(j5, j6);
                    break;
                case -1:
                    j = AIC.A02;
                    j2 = AIC.A01;
                    gk.A0C(j, j2);
                    break;
                case 0:
                    j3 = AIC.A01;
                    A05(interfaceC1625lN, j3);
                    floorPosition = AIC.A01;
                    A04(true, floorPosition);
                    j4 = AIC.A01;
                    return A00(interfaceC1625lN, j4, c0463Gt);
                default:
                    throw new IllegalStateException(A02(0, 12, 109));
            }
        }
    }

    public final C1632lV A07() {
        return this.A02;
    }

    public final void A08(long j) {
        long A03;
        if (this.A00 != null) {
            A03 = this.A00.A03();
            if (A03 == j) {
                return;
            }
        }
        this.A00 = A01(j);
    }

    public final boolean A09() {
        return this.A00 != null;
    }
}

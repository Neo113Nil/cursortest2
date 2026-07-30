package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.view.Surface;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.fX, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1766fX {
    public static byte[] A02;
    public final AA A00;
    public final C2207nA A01 = new C2207nA();

    static {
        A02();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-64, -54, -66, -64, 1, -1, 19, 17, 3, -64, -66, -40, -66, -64, -74, -64, -76, -74, 6, -7, 2, -8, -7, 6, -7, 6, -35, 2, -8, -7, 12, -74, -76, -50, -76, -74, -54, 37, -9, -6, 9, 16, -73, 2, -6, 8, 8, -10, -4, -6, -73, -75, -49, -75, -73, -75, 92, -82, -77, -86, -97, 92, 90, 116, 90, 92};
    }

    public C1766fX(C1839gi c1839gi) {
        InterfaceC0878Em trackSelectionFactory = new C2224nR(this.A01);
        C07569h c07569h = new C07569h(trackSelectionFactory);
        AnonymousClass74 loadControl = new C2317ox();
        this.A00 = AbstractC06786b.A00(new C2314ou(c1839gi), c07569h, loadControl, this.A01);
    }

    public static String A01(C2380pz c2380pz) {
        boolean z8 = c2380pz instanceof AD;
        String A00 = A00(36, 2, 118);
        String A002 = A00(0, 14, 108);
        if (z8) {
            AD ad = (AD) c2380pz;
            return A00(55, 11, 8) + ad.A03 + A00(14, 22, 98) + ad.A02 + A002 + ad.getCause() + A00;
        }
        return A00(41, 14, 99) + c2380pz.getMessage() + A002 + c2380pz.getCause() + A00;
    }

    public static boolean A03() {
        return true;
    }

    public final int A04() {
        return this.A00.A0I();
    }

    public final int A05() {
        return this.A00.A00();
    }

    public final long A06() {
        return this.A00.A7e();
    }

    public final long A07() {
        return this.A00.A7s();
    }

    public final C1764fV A08() {
        C2399qI vf = this.A00.A0K();
        if (vf == null) {
            return null;
        }
        return new C1764fV(vf.A0L, vf.A0A);
    }

    public final void A09() {
        this.A00.A0L();
    }

    public final void A0A() {
        this.A00.A02();
    }

    public final void A0B() {
        this.A00.A01();
    }

    public final void A0C(float f6) {
        this.A00.A0M(f6);
    }

    public final void A0D(long j9) {
        this.A00.A04(j9);
    }

    public final void A0E(Surface surface) {
        this.A00.A0N(surface);
    }

    public final void A0F(C1835ge c1835ge, Uri uri) {
        if (C1289Up.A2z(c1835ge, A03())) {
            C1770fb cacheManager = C1770fb.A06(c1835ge);
            C5Y cachedDataSourceFactory = cacheManager.A0H(c1835ge);
            this.A00.A0Q(new C07619o(cachedDataSourceFactory).A04(uri));
            return;
        }
        InterfaceC0837Cx mediaSource = new C07619o(new C2334pE(c1835ge, C5C.A0j(c1835ge, A00(38, 3, 100)), this.A01)).A04(uri);
        this.A00.A0Q(mediaSource);
    }

    public final void A0G(InterfaceC1763fU interfaceC1763fU) {
        this.A00.A0O(new D6(this, interfaceC1763fU));
    }

    public final void A0H(final InterfaceC1765fW interfaceC1765fW) {
        this.A00.A0P(new InterfaceC2305ol() { // from class: com.facebook.ads.redexgen.X.2s
            @Override // com.instagram.common.viewpoint.core.C5L
            public final void AGa(int i, int i4, int i9, float f6) {
                interfaceC1765fW.AGa(i, i4, i9, f6);
            }
        });
    }

    public final void A0I(boolean z8) {
        this.A00.A0S(z8);
    }

    public final boolean A0J() {
        return this.A00.A0T();
    }

    public final boolean A0K() {
        return this.A00.A0J() != null;
    }
}

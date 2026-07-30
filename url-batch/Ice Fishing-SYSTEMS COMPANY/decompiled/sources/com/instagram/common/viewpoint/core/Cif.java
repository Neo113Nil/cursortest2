package com.instagram.common.viewpoint.core;

import android.view.View;
import com.anythink.core.common.s.a.c;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.if, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class Cif extends N2 {
    public static byte[] A01;
    public static String[] A02 = {"swComlxz6aoGHqKS8LOj1g5iAOstdInC", "iLoXwxITRpbgZFbT1koR1uJW4vvDXY2W", "MpkXHfR6HdYIg9t449R", "HQI6v11U6roDlbOuDHGyMjhCWVrAbgmk", "qsbQ14vrFuO8q1N0nwgFIOsRNgh3HWyt", "NXqrvE65RyYHWICx", "E9yzS8MfEszoKvwo", "osh9YHk0bwFUuMRHqHbnPk"};
    public final /* synthetic */ C1953id A00;

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 112, 105, 47, 35, 34, 56, 62, 35, 32, 32, 41, 62, 108, 37, c.f16476c, 108, 34, 57, 32, 32};
    }

    static {
        A01();
    }

    public Cif(C1953id c1953id) {
        this.A00 = c1953id;
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A02() {
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAd = this.A00.A01;
        if (interstitialAd == null) {
            this.A00.A04 = false;
            interstitialAdExtendedListener = this.A00.A07;
            interstitialAdExtendedListener.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A04() {
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
        C07127j c07127j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1949iY c1949iY;
        C07127j c07127j2;
        C07127j c07127j3;
        C07127j c07127j4;
        interstitialAd = this.A00.A01;
        if (interstitialAd != null) {
            interstitialAd2 = this.A00.A01;
            interstitialAd2.show();
            return;
        }
        this.A00.A04 = false;
        c07127j = this.A00.A03;
        if (c07127j != null && C1289Up.A2D(this.A00.A06)) {
            c07127j2 = this.A00.A03;
            c07127j2.A0S(new C1955ig(this));
            c07127j3 = this.A00.A03;
            c07127j3.A0N();
            c07127j4 = this.A00.A03;
            c07127j4.A0K();
            this.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A00.A07;
        c1949iY = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c1949iY.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A05() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1949iY c1949iY;
        interstitialAdExtendedListener = this.A00.A07;
        c1949iY = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDisplayed(c1949iY.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A06() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerFailed();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A07() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerSucceeded();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A08() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdCompleted();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0C() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1949iY c1949iY;
        this.A00.A06.A0F().A3K();
        interstitialAdExtendedListener = this.A00.A07;
        c1949iY = this.A00.A08;
        interstitialAdExtendedListener.onAdClicked(c1949iY.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0D() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1949iY c1949iY;
        interstitialAdExtendedListener = this.A00.A07;
        c1949iY = this.A00.A08;
        interstitialAdExtendedListener.onLoggingImpression(c1949iY.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0E(View view) {
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0F(N1 n1) {
        C07127j c07127j;
        C07127j c07127j2;
        NQ nq;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1949iY c1949iY;
        NQ nq2;
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener2;
        C1949iY c1949iY2;
        InterstitialAdExtendedListener interstitialAdExtendedListener3;
        C1949iY c1949iY3;
        InterstitialAd interstitialAd2;
        C1949iY c1949iY4;
        C1949iY c1949iY5;
        InterstitialAd interstitialAd3;
        C1949iY c1949iY6;
        C1949iY c1949iY7;
        C1949iY c1949iY8;
        c07127j = this.A00.A03;
        if (c07127j != null) {
            this.A00.A05 = true;
            C1953id c1953id = this.A00;
            c07127j2 = this.A00.A03;
            c1953id.A02 = c07127j2.A0I();
            nq = this.A00.A02;
            if (!(nq instanceof AbstractC2004jd)) {
                interstitialAdExtendedListener = this.A00.A07;
                String[] strArr = A02;
                if (strArr[0].charAt(8) == strArr[3].charAt(8)) {
                    String[] strArr2 = A02;
                    strArr2[6] = "JHAXxmwzHKs3NajX";
                    strArr2[5] = "FHZeNyejFCAXh3Vz";
                    c1949iY = this.A00.A08;
                    interstitialAdExtendedListener.onAdLoaded(c1949iY.A6k());
                    return;
                }
            } else {
                nq2 = this.A00.A02;
                AbstractC2004jd abstractC2004jd = (AbstractC2004jd) nq2;
                if (abstractC2004jd.A26() > 0) {
                    XC xc = new XC();
                    C1839gi c1839gi = this.A00.A06;
                    c1949iY6 = this.A00.A08;
                    if (xc.A09(c1839gi, c1949iY6.A08(), abstractC2004jd.A26())) {
                        xc.A08(this.A00.A06, true);
                        C1953id c1953id2 = this.A00;
                        C1839gi c1839gi2 = this.A00.A06;
                        c1949iY7 = this.A00.A08;
                        String A0A = c1949iY7.A0A();
                        c1949iY8 = this.A00.A08;
                        c1953id2.A01 = xc.A06(c1839gi2, A0A, c1949iY8.A08());
                    } else {
                        C1953id c1953id3 = this.A00;
                        if (A02[1].charAt(2) != 'w') {
                            A02[7] = "alFbtn3b1";
                            xc.A08(c1953id3.A06, false);
                        } else {
                            String[] strArr3 = A02;
                            strArr3[6] = "OkLAbmcEeyte5Vfo";
                            strArr3[5] = "zgaU15rF2mVDrexS";
                            xc.A08(c1953id3.A06, false);
                        }
                    }
                }
                C1953id c1953id4 = this.A00;
                if (A02[1].charAt(2) != 'w') {
                    A02[1] = "23I4hcZMgJ395X2lYna8PMjzW0ozt3hz";
                    interstitialAd = c1953id4.A01;
                    if (interstitialAd != null) {
                        abstractC2004jd.A2J(true);
                        interstitialAd2 = this.A00.A01;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener = interstitialAd2.buildLoadAdConfig().withAdListener(new OH(this, abstractC2004jd));
                        c1949iY4 = this.A00.A08;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withCacheFlags = withAdListener.withCacheFlags(c1949iY4.A0B());
                        c1949iY5 = this.A00.A08;
                        InterstitialAd.InterstitialLoadAdConfig loadAdConfig = withCacheFlags.withRewardData(c1949iY5.A03()).build();
                        interstitialAd3 = this.A00.A01;
                        interstitialAd3.loadAd(loadAdConfig);
                        return;
                    }
                    C1953id c1953id5 = this.A00;
                    String[] strArr4 = A02;
                    if (strArr4[0].charAt(8) != strArr4[3].charAt(8)) {
                        interstitialAdExtendedListener3 = c1953id5.A07;
                        c1949iY3 = this.A00.A08;
                        interstitialAdExtendedListener3.onAdLoaded(c1949iY3.A6k());
                        return;
                    } else {
                        A02[2] = "joZPUUFug9Ts";
                        interstitialAdExtendedListener2 = c1953id5.A07;
                        c1949iY2 = this.A00.A08;
                        interstitialAdExtendedListener2.onAdLoaded(c1949iY2.A6k());
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
        this.A00.A06.A08().ABC(A00(0, 3, 98), AbstractC1251Td.A0N, new C1252Te(A00(3, 18, 46)));
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0G(C1311Vm c1311Vm) {
        long j9;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1949iY c1949iY;
        InterfaceC1065Lt A0F = this.A00.A06.A0F();
        j9 = this.A00.A00;
        A0F.A3N(Y1.A01(j9), c1311Vm.A03().getErrorCode(), c1311Vm.A04());
        interstitialAdExtendedListener = this.A00.A07;
        c1949iY = this.A00.A08;
        interstitialAdExtendedListener.onError(c1949iY.A6k(), XE.A00(c1311Vm));
    }
}

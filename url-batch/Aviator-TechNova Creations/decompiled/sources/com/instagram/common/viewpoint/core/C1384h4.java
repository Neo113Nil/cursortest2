package com.instagram.common.viewpoint.core;

import android.view.View;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.h4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1384h4 extends MQ {
    public static byte[] A01;
    public static String[] A02 = {"swComlxz6aoGHqKS8LOj1g5iAOstdInC", "iLoXwxITRpbgZFbT1koR1uJW4vvDXY2W", "MpkXHfR6HdYIg9t449R", "HQI6v11U6roDlbOuDHGyMjhCWVrAbgmk", "qsbQ14vrFuO8q1N0nwgFIOsRNgh3HWyt", "NXqrvE65RyYHWICx", "E9yzS8MfEszoKvwo", "osh9YHk0bwFUuMRHqHbnPk"};
    public final /* synthetic */ C1380gz A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 112, 105, 47, 35, 34, 56, 62, 35, 32, 32, 41, 62, 108, 37, Utf8.REPLACEMENT_BYTE, 108, 34, 57, 32, 32};
    }

    static {
        A01();
    }

    public C1384h4(C1380gz c1380gz) {
        this.A00 = c1380gz;
    }

    @Override // com.instagram.common.viewpoint.core.MQ
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

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A04() {
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
        C02246y c02246y;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1376gv c1376gv;
        C02246y c02246y2;
        C02246y c02246y3;
        C02246y c02246y4;
        interstitialAd = this.A00.A01;
        if (interstitialAd != null) {
            interstitialAd2 = this.A00.A01;
            interstitialAd2.show();
            return;
        }
        this.A00.A04 = false;
        c02246y = this.A00.A03;
        if (c02246y != null && U7.A26(this.A00.A06)) {
            c02246y2 = this.A00.A03;
            c02246y2.A0S(new C1385h5(this));
            c02246y3 = this.A00.A03;
            c02246y3.A0N();
            c02246y4 = this.A00.A03;
            c02246y4.A0K();
            this.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A00.A07;
        c1376gv = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c1376gv.A6c());
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A05() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1376gv c1376gv;
        interstitialAdExtendedListener = this.A00.A07;
        c1376gv = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDisplayed(c1376gv.A6c());
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A06() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerFailed();
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A07() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerSucceeded();
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A08() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdCompleted();
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0C() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1376gv c1376gv;
        this.A00.A06.A0F().A3C();
        interstitialAdExtendedListener = this.A00.A07;
        c1376gv = this.A00.A08;
        interstitialAdExtendedListener.onAdClicked(c1376gv.A6c());
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0D() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1376gv c1376gv;
        interstitialAdExtendedListener = this.A00.A07;
        c1376gv = this.A00.A08;
        interstitialAdExtendedListener.onLoggingImpression(c1376gv.A6c());
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0E(View view) {
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0F(MP mp) {
        C02246y c02246y;
        C02246y c02246y2;
        AbstractC0612Mo abstractC0612Mo;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1376gv c1376gv;
        AbstractC0612Mo abstractC0612Mo2;
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener2;
        C1376gv c1376gv2;
        InterstitialAdExtendedListener interstitialAdExtendedListener3;
        C1376gv c1376gv3;
        InterstitialAd interstitialAd2;
        C1376gv c1376gv4;
        C1376gv c1376gv5;
        InterstitialAd interstitialAd3;
        C1376gv c1376gv6;
        C1376gv c1376gv7;
        C1376gv c1376gv8;
        c02246y = this.A00.A03;
        if (c02246y != null) {
            this.A00.A05 = true;
            C1380gz c1380gz = this.A00;
            c02246y2 = this.A00.A03;
            c1380gz.A02 = c02246y2.A0I();
            abstractC0612Mo = this.A00.A02;
            if (!(abstractC0612Mo instanceof AbstractC1434hy)) {
                interstitialAdExtendedListener = this.A00.A07;
                String[] strArr = A02;
                if (strArr[0].charAt(8) == strArr[3].charAt(8)) {
                    String[] strArr2 = A02;
                    strArr2[6] = "JHAXxmwzHKs3NajX";
                    strArr2[5] = "FHZeNyejFCAXh3Vz";
                    c1376gv = this.A00.A08;
                    interstitialAdExtendedListener.onAdLoaded(c1376gv.A6c());
                    return;
                }
            } else {
                abstractC0612Mo2 = this.A00.A02;
                AbstractC1434hy abstractC1434hy = (AbstractC1434hy) abstractC0612Mo2;
                if (abstractC1434hy.A1x() > 0) {
                    WR wr = new WR();
                    C1159dL c1159dL = this.A00.A06;
                    c1376gv6 = this.A00.A08;
                    if (wr.A09(c1159dL, c1376gv6.A08(), abstractC1434hy.A1x())) {
                        wr.A08(this.A00.A06, true);
                        C1380gz c1380gz2 = this.A00;
                        C1159dL c1159dL2 = this.A00.A06;
                        c1376gv7 = this.A00.A08;
                        String A0A = c1376gv7.A0A();
                        c1376gv8 = this.A00.A08;
                        c1380gz2.A01 = wr.A06(c1159dL2, A0A, c1376gv8.A08());
                    } else {
                        C1380gz c1380gz3 = this.A00;
                        if (A02[1].charAt(2) != 'w') {
                            A02[7] = "alFbtn3b1";
                            wr.A08(c1380gz3.A06, false);
                        } else {
                            String[] strArr3 = A02;
                            strArr3[6] = "OkLAbmcEeyte5Vfo";
                            strArr3[5] = "zgaU15rF2mVDrexS";
                            wr.A08(c1380gz3.A06, false);
                        }
                    }
                }
                C1380gz c1380gz4 = this.A00;
                if (A02[1].charAt(2) != 'w') {
                    A02[1] = "23I4hcZMgJ395X2lYna8PMjzW0ozt3hz";
                    interstitialAd = c1380gz4.A01;
                    if (interstitialAd != null) {
                        abstractC1434hy.A2A(true);
                        interstitialAd2 = this.A00.A01;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener = interstitialAd2.buildLoadAdConfig().withAdListener(new C0627Nd(this, abstractC1434hy));
                        c1376gv4 = this.A00.A08;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withCacheFlags = withAdListener.withCacheFlags(c1376gv4.A0B());
                        c1376gv5 = this.A00.A08;
                        InterstitialAd.InterstitialLoadAdConfig loadAdConfig = withCacheFlags.withRewardData(c1376gv5.A03()).build();
                        interstitialAd3 = this.A00.A01;
                        interstitialAd3.loadAd(loadAdConfig);
                        return;
                    }
                    C1380gz c1380gz5 = this.A00;
                    String[] strArr4 = A02;
                    if (strArr4[0].charAt(8) != strArr4[3].charAt(8)) {
                        interstitialAdExtendedListener3 = c1380gz5.A07;
                        c1376gv3 = this.A00.A08;
                        interstitialAdExtendedListener3.onAdLoaded(c1376gv3.A6c());
                        return;
                    } else {
                        A02[2] = "joZPUUFug9Ts";
                        interstitialAdExtendedListener2 = c1380gz5.A07;
                        c1376gv2 = this.A00.A08;
                        interstitialAdExtendedListener2.onAdLoaded(c1376gv2.A6c());
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
        this.A00.A06.A08().AAy(A00(0, 3, 98), AbstractC0772Sv.A0N, new C0773Sw(A00(3, 18, 46)));
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0G(V1 v1) {
        long j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1376gv c1376gv;
        LH A0F = this.A00.A06.A0F();
        j = this.A00.A00;
        A0F.A3F(XG.A01(j), v1.A03().getErrorCode(), v1.A04());
        interstitialAdExtendedListener = this.A00.A07;
        c1376gv = this.A00.A08;
        interstitialAdExtendedListener.onError(c1376gv.A6c(), WT.A00(v1));
    }
}

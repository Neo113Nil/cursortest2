package com.instagram.common.viewpoint.core;

import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.gy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1379gy extends MQ {
    public static byte[] A01;
    public final /* synthetic */ C1377gw A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 43);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{9, Ascii.CAN, 1, 36, 40, 41, 51, 53, 40, 43, 43, 34, 53, 103, 46, 52, 103, 41, 50, 43, 43};
    }

    public C1379gy(C1377gw c1377gw) {
        this.A00 = c1377gw;
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A06() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardServerFailed();
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A07() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardServerSuccess();
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A08() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A08;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
        }
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A09() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A08;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0A() {
        RewardedVideoAd rewardedVideoAd;
        RewardedVideoAd rewardedVideoAd2;
        long j;
        RewardedVideoAd rewardedVideoAd3;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd != null) {
            rewardedVideoAd2 = this.A00.A03;
            C0727Rb c0727Rb = (C0727Rb) rewardedVideoAd2.buildShowAdConfig();
            long currentTimeMillis = System.currentTimeMillis();
            j = this.A00.A02;
            c0727Rb.A02(currentTimeMillis - j);
            rewardedVideoAd3 = this.A00.A03;
            rewardedVideoAd3.show(c0727Rb.build());
            return;
        }
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0C() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1367gm c1367gm;
        this.A00.A07.A0F().A3C();
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        c1367gm = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onAdClicked(c1367gm.A6c());
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0D() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1367gm c1367gm;
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        c1367gm = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onLoggingImpression(c1367gm.A6c());
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0F(MP mp) {
        C02176r c02176r;
        C1367gm c1367gm;
        C1367gm c1367gm2;
        C02176r c02176r2;
        AbstractC0612Mo abstractC0612Mo;
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1367gm c1367gm3;
        AbstractC0612Mo abstractC0612Mo2;
        RewardedVideoAd rewardedVideoAd2;
        AbstractC0612Mo abstractC0612Mo3;
        C1367gm c1367gm4;
        RewardedVideoAd rewardedVideoAd3;
        AbstractC0612Mo abstractC0612Mo4;
        C1367gm c1367gm5;
        C1367gm c1367gm6;
        C1367gm c1367gm7;
        AbstractC0612Mo abstractC0612Mo5;
        C1367gm c1367gm8;
        c02176r = this.A00.A05;
        if (c02176r == null) {
            this.A00.A07.A08().AAy(A00(0, 3, 67), AbstractC0772Sv.A0N, new C0773Sw(A00(3, 18, 108)));
            return;
        }
        AbstractC1442iA abstractC1442iA = (AbstractC1442iA) mp;
        c1367gm = this.A00.A09;
        if (c1367gm.A03 != null) {
            c1367gm8 = this.A00.A09;
            abstractC1442iA.A02(c1367gm8.A03);
        }
        c1367gm2 = this.A00.A09;
        c1367gm2.A00 = abstractC1442iA.A0H();
        this.A00.A06 = true;
        C1377gw c1377gw = this.A00;
        c02176r2 = this.A00.A05;
        c1377gw.A04 = c02176r2.A0I();
        abstractC0612Mo = this.A00.A04;
        if (abstractC0612Mo != null) {
            int i = 0;
            abstractC0612Mo4 = this.A00.A04;
            if (!abstractC0612Mo4.A1T()) {
                abstractC0612Mo5 = this.A00.A04;
                i = ((AbstractC1434hy) abstractC0612Mo5).A1x();
            }
            if (i > 0) {
                WR wr = new WR();
                C1159dL c1159dL = this.A00.A07;
                c1367gm5 = this.A00.A09;
                if (wr.A09(c1159dL, c1367gm5.A06, i)) {
                    wr.A08(this.A00.A07, true);
                    C1377gw c1377gw2 = this.A00;
                    C1159dL c1159dL2 = this.A00.A07;
                    c1367gm6 = this.A00.A09;
                    String str = c1367gm6.A0D;
                    c1367gm7 = this.A00.A09;
                    c1377gw2.A03 = wr.A07(c1159dL2, str, c1367gm7.A06);
                } else {
                    wr.A08(this.A00.A07, false);
                }
            }
        }
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A08;
            c1367gm3 = this.A00.A09;
            s2SRewardedVideoAdExtendedListener.onAdLoaded(c1367gm3.A6c());
            return;
        }
        abstractC0612Mo2 = this.A00.A04;
        ((AbstractC1434hy) abstractC0612Mo2).A2A(true);
        rewardedVideoAd2 = this.A00.A03;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled = rewardedVideoAd2.buildLoadAdConfig().withFailOnCacheFailureEnabled(true);
        abstractC0612Mo3 = this.A00.A04;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withRewardData = withFailOnCacheFailureEnabled.withRewardData(abstractC0612Mo3.A0p());
        c1367gm4 = this.A00.A09;
        RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = withRewardData.withAdExperience(c1367gm4.A02).withAdListener(new C0628Ne(this)).build();
        rewardedVideoAd3 = this.A00.A03;
        rewardedVideoAd3.loadAd(loadAdConfig);
    }

    @Override // com.instagram.common.viewpoint.core.MQ
    public final void A0G(V1 v1) {
        C1367gm c1367gm;
        long j;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1367gm c1367gm2;
        this.A00.A0D(true);
        c1367gm = this.A00.A09;
        LH A0F = c1367gm.A0B.A0F();
        j = this.A00.A01;
        A0F.A3F(XG.A01(j), v1.A03().getErrorCode(), v1.A04());
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        c1367gm2 = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onError(c1367gm2.A6c(), WT.A00(v1));
    }
}

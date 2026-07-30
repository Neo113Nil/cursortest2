package com.instagram.common.viewpoint.core;

import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ib, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1952ib extends N2 {
    public static byte[] A01;
    public final /* synthetic */ C1950iZ A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 43);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{9, 24, 1, 36, 40, 41, 51, 53, 40, 43, 43, 34, 53, 103, 46, 52, 103, 41, 50, 43, 43};
    }

    public C1952ib(C1950iZ c1950iZ) {
        this.A00 = c1950iZ;
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A06() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        s2SRewardedVideoAdExtendedListener.onRewardServerFailed();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A07() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        s2SRewardedVideoAdExtendedListener.onRewardServerSuccess();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A08() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A02;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A07;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
        }
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A09() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A02;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A07;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0A() {
        RewardedVideoAd rewardedVideoAd;
        RewardedVideoAd rewardedVideoAd2;
        long j9;
        RewardedVideoAd rewardedVideoAd3;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A02;
        if (rewardedVideoAd != null) {
            rewardedVideoAd2 = this.A00.A02;
            SJ sj = (SJ) rewardedVideoAd2.buildShowAdConfig();
            long currentTimeMillis = System.currentTimeMillis();
            j9 = this.A00.A01;
            sj.A02(currentTimeMillis - j9);
            rewardedVideoAd3 = this.A00.A02;
            rewardedVideoAd3.show(sj.build());
            return;
        }
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0C() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1934iI c1934iI;
        this.A00.A06.A0F().A3K();
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        c1934iI = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onAdClicked(c1934iI.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0D() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1934iI c1934iI;
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        c1934iI = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onLoggingImpression(c1934iI.A6k());
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0F(N1 n1) {
        C07037a c07037a;
        C1934iI c1934iI;
        C1934iI c1934iI2;
        C07037a c07037a2;
        NQ nq;
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1934iI c1934iI3;
        NQ nq2;
        RewardedVideoAd rewardedVideoAd2;
        NQ nq3;
        C1934iI c1934iI4;
        RewardedVideoAd rewardedVideoAd3;
        NQ nq4;
        C1934iI c1934iI5;
        C1934iI c1934iI6;
        C1934iI c1934iI7;
        NQ nq5;
        C1934iI c1934iI8;
        c07037a = this.A00.A04;
        if (c07037a == null) {
            this.A00.A06.A08().ABC(A00(0, 3, 67), AbstractC1251Td.A0N, new C1252Te(A00(3, 18, 108)));
            return;
        }
        AbstractC2008jh abstractC2008jh = (AbstractC2008jh) n1;
        c1934iI = this.A00.A08;
        if (c1934iI.A03 != null) {
            c1934iI8 = this.A00.A08;
            abstractC2008jh.A02(c1934iI8.A03);
        }
        c1934iI2 = this.A00.A08;
        c1934iI2.A00 = abstractC2008jh.A0H();
        this.A00.A05 = true;
        C1950iZ c1950iZ = this.A00;
        c07037a2 = this.A00.A04;
        c1950iZ.A03 = c07037a2.A0I();
        nq = this.A00.A03;
        if (nq != null) {
            int i = 0;
            nq4 = this.A00.A03;
            if (!nq4.A1b()) {
                nq5 = this.A00.A03;
                i = ((AbstractC2004jd) nq5).A26();
            }
            if (i > 0) {
                XC xc = new XC();
                C1839gi c1839gi = this.A00.A06;
                c1934iI5 = this.A00.A08;
                if (xc.A09(c1839gi, c1934iI5.A06, i)) {
                    xc.A08(this.A00.A06, true);
                    C1950iZ c1950iZ2 = this.A00;
                    C1839gi c1839gi2 = this.A00.A06;
                    c1934iI6 = this.A00.A08;
                    String str = c1934iI6.A0D;
                    c1934iI7 = this.A00.A08;
                    c1950iZ2.A02 = xc.A07(c1839gi2, str, c1934iI7.A06);
                } else {
                    xc.A08(this.A00.A06, false);
                }
            }
        }
        rewardedVideoAd = this.A00.A02;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A07;
            c1934iI3 = this.A00.A08;
            s2SRewardedVideoAdExtendedListener.onAdLoaded(c1934iI3.A6k());
            return;
        }
        nq2 = this.A00.A03;
        ((AbstractC2004jd) nq2).A2J(true);
        rewardedVideoAd2 = this.A00.A02;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled = rewardedVideoAd2.buildLoadAdConfig().withFailOnCacheFailureEnabled(true);
        nq3 = this.A00.A03;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withRewardData = withFailOnCacheFailureEnabled.withRewardData(nq3.A0s());
        c1934iI4 = this.A00.A08;
        RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = withRewardData.withAdExperience(c1934iI4.A02).withAdListener(new OI(this)).build();
        rewardedVideoAd3 = this.A00.A02;
        rewardedVideoAd3.loadAd(loadAdConfig);
    }

    @Override // com.instagram.common.viewpoint.core.N2
    public final void A0G(C1311Vm c1311Vm) {
        C1934iI c1934iI;
        long j9;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1934iI c1934iI2;
        this.A00.A0D(true);
        c1934iI = this.A00.A08;
        InterfaceC1065Lt A0F = c1934iI.A0B.A0F();
        j9 = this.A00.A00;
        A0F.A3N(Y1.A01(j9), c1311Vm.A03().getErrorCode(), c1311Vm.A04());
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        c1934iI2 = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onError(c1934iI2.A6k(), XE.A00(c1311Vm));
    }
}

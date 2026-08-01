package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardedInterstitialAd;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.api.RewardedInterstitialAdApi;
import com.facebook.ads.internal.context.Repairable;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.5h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02635h implements RewardedInterstitialAdApi, Repairable {
    public static byte[] A01;
    public static String[] A02 = {"3NmEwDZbIt", "O8AdKP", "F3ALGhsyO3", "0MHUDKJg5DuGWh7rPRyim2f5Q3jzHAIy", "HXUpQ47Mk3E2sR2m", "8jXe5NRPzLqsvVidOiIerBtc23OceItu", "2ZUtk7q5pb8vSbqEv1qAEyjXWKkByt40", "lRwzP9ChqND6LzN"};
    public final C02675l A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {69, 64, 67, 76, 77, 64, Ascii.DC2, 68, 120, 125, 46, 121, 120, 115, 126, 115, 8, Ascii.SO, Ascii.FF, Ascii.SI, 6, 89, 94, Ascii.CR, 85, 98, 112, 102, 117, 99, 98, 99, 39, 110, 105, 115, 98, 117, 116, 115, 110, 115, 110, 102, 107, 39, 102, 99, 39, 99, 98, 116, 115, 117, 104, 126, 98, 99, 36, 19, 1, Ascii.ETB, 4, Ascii.DC2, 19, Ascii.DC2, 86, Ascii.US, Ascii.CAN, 2, 19, 4, 5, 2, Ascii.US, 2, Ascii.US, Ascii.ETB, Ascii.SUB, 86, Ascii.ETB, Ascii.DC2, 86, Ascii.SUB, Ascii.EM, Ascii.ETB, Ascii.DC2, 86, 4, 19, 7, 3, 19, 5, 2, 19, Ascii.DC2, 6, 49, 35, 53, 38, 48, 49, 48, 116, Base64.padSymbol, 58, 32, 49, 38, 39, 32, Base64.padSymbol, 32, Base64.padSymbol, 53, 56, 116, 53, 48, 116, 39, 60, 59, 35, 116, 55, 53, 56, 56, 49, 48, Ascii.DC2, 69, Ascii.ETB, Ascii.NAK, 68, 65, Ascii.DC4, 73, 72, 94, 89, 95, 66, 84, 50, 49, 63, 58, Ascii.US, 58, 6, Ascii.GS, Ascii.SUB, 2};
        if (A02[4].length() == 1) {
            throw new RuntimeException();
        }
        A02[7] = "xXnNwnRRjThYq22";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C02635h(Context context, String str, RewardedInterstitialAd rewardedInterstitialAd) {
        this.A00 = new C02675l(context, str, rewardedInterstitialAd);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.FullScreenAd
    public final RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return new C02655j(this.A00.buildLoadAdConfig());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.FullScreenAd
    public final RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder buildShowAdConfig() {
        return new C02665k(this.A00.buildShowAdConfig());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final void destroy() {
        JU.A05(A00(Opcodes.F2L, 7, 83), A00(24, 34, 121), A00(0, 8, 10));
        this.A00.A04();
    }

    public final void finalize() {
        this.A00.finalize();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A00.getPlacementId();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final int getVideoDuration() {
        return this.A00.getVideoDuration();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        return this.A00.isAdInvalidated();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final boolean isAdLoaded() {
        return this.A00.isAdLoaded();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    public final void loadAd() {
        JU.A05(A00(Opcodes.I2S, 6, 32), A00(58, 39, 8), A00(Opcodes.I2L, 7, 8));
        this.A00.A07(null, AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED_INTERSTITIAL, true, false);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final void loadAd(RewardedInterstitialAd.RewardedInterstitialLoadAdConfig rewardedInterstitialLoadAdConfig) {
        ((C02655j) rewardedInterstitialLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final void registerAdCompanionView(AdCompanionView adCompanionView) {
        this.A00.registerAdCompanionView(adCompanionView);
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        this.A00.repair(th);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A00.setExtraHints(extraHints);
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        JU.A05(A00(153, 4, 11), A00(97, 36, 42), A00(16, 8, 65));
        return this.A00.A08(new C02695n().withAppOrientation(-1).build());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final boolean show(RewardedInterstitialAd.RewardedInterstitialShowAdConfig rewardedInterstitialShowAdConfig) {
        JU.A05(A00(153, 4, 11), A00(97, 36, 42), A00(8, 8, 53));
        return this.A00.A08(((C02665k) rewardedInterstitialShowAdConfig).A00());
    }

    @Override // com.facebook.ads.internal.api.RewardedInterstitialAdApi
    public final void unregisterAdCompanionView() {
        this.A00.unregisterAdCompanionView();
    }
}

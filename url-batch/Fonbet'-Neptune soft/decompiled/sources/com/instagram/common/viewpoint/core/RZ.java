package com.instagram.common.viewpoint.core;

import android.content.Context;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.UUID;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class RZ implements RewardedVideoAdApi, Repairable {
    public static byte[] A04;
    public static String[] A05 = {"k8yEFjaDDmJNEMKVrce3vEWkKDhb9GrD", "5HJZEEaowyWiZ6x5JcW91LnqKILZK9iv", "JCdbC5zohUOjfclxz", "cbOkRGwJ0he66t85Zev39Ck1DLyP", "QnWh1EoQaEskbAIVlUx7Y0ywxM6b", "GMmjAnpO", "8CCIVLGxcMAoQXrfALv1hDyohO9DfryR", "UYxyoZ6BjjTfNK3ar4eEie7WMpDsFwCV"};
    public final Ad A00;
    public final C1361gm A01;
    public final C02096p A02;
    public final C1153dL A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 9);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{122, 43, 126, 45, 122, 45, 121, 124, Ascii.EM, 76, Ascii.US, 78, 75, Ascii.SUB, Ascii.ETB, Ascii.CAN, 102, 52, 102, 53, 96, 104, 102, 104, 94, 121, 99, 114, 101, 121, 118, 123, 55, 114, 101, 101, 120, 101, 57, Ascii.GS, 47, Ascii.CAN, 10, Ascii.FS, Ascii.SI, Ascii.EM, Ascii.CAN, Ascii.EM, 93, Ascii.VT, Ascii.DC4, Ascii.EM, Ascii.CAN, Ascii.DC2, 93, Ascii.FS, Ascii.EM, 93, Ascii.EM, Ascii.CAN, Ascii.SO, 9, Ascii.SI, Ascii.DC2, 4, Ascii.CAN, Ascii.EM, 105, 94, 76, 90, 73, 95, 94, 95, Ascii.ESC, 77, 82, 95, 94, 84, Ascii.ESC, 90, 95, Ascii.ESC, 87, 84, 90, 95, Ascii.ESC, 73, 94, 74, 78, 94, 72, 79, 94, 95, 59, Ascii.FF, Ascii.RS, 8, Ascii.ESC, Ascii.CR, Ascii.FF, Ascii.CR, 73, Ascii.US, 0, Ascii.CR, Ascii.FF, 6, 73, 8, Ascii.CR, 73, Ascii.SUB, 1, 6, Ascii.RS, 73, 10, 8, 5, 5, Ascii.FF, Ascii.CR, 16, 74, 67, Ascii.ETB, 64, 75, Ascii.ETB, 66, 67, 85, 82, 84, 73, 95, 73, 74, 68, 65, 100, 65, Ascii.SYN, Ascii.CR, 10, Ascii.DC2};
    }

    static {
        A01();
    }

    public RZ(Context context, String str, Ad ad) {
        String uuid;
        this.A00 = ad;
        if (context instanceof C1153dL) {
            this.A03 = (C1153dL) context;
            uuid = this.A03.A0F().getId();
        } else {
            uuid = UUID.randomUUID().toString();
            this.A03 = RB.A07(context, uuid);
        }
        LH A0F = this.A03.A0F();
        String adId = AdPlacementType.REWARDED_VIDEO.toString();
        A0F.A3L(adId, str);
        this.A01 = new C1361gm(this.A03, str, this.A00, new C1385hB());
        this.A03.A0O(this);
        this.A02 = new C02096p(this.A01, uuid);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final C0720Ra buildLoadAdConfig() {
        return new C0720Ra(this);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final C0721Rb buildShowAdConfig() {
        return new C0721Rb();
    }

    public final void A04() {
        if (U7.A2F(this.A03)) {
            return;
        }
        this.A02.A08();
        this.A03.A0F().A3M();
    }

    public final void A05(RewardData rewardData) {
        this.A02.A0G(rewardData);
    }

    public final void A06(RewardedVideoAdListener rewardedVideoAdListener) {
        this.A01.A04 = rewardedVideoAdListener;
        this.A03.A0F().A3E(rewardedVideoAdListener != null);
        String[] strArr = A05;
        if (strArr[1].charAt(24) != strArr[0].charAt(24)) {
            throw new RuntimeException();
        }
        A05[6] = "1SRpemADNZd8xb9i9fuLSYNF0AwY2Tu2";
    }

    public final void A07(String str, AdExperienceType adExperienceType, boolean z) {
        if (str == null) {
            this.A03.A0F().A3I();
        } else {
            C1153dL c1153dL = this.A03;
            if (A05[6].charAt(25) == 'H') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[3] = "67CWYk6q7caxeYWX3cgidRuGJDEH";
            strArr[4] = "JzT9b8y5FiDfchRrDecE58hhFV9F";
            c1153dL.A0F().A3H();
        }
        this.A02.A0F(this.A00, str, adExperienceType, z);
        this.A03.A0F().A3G();
    }

    public final boolean A08(RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        this.A03.A0F().A3R();
        boolean A0J = this.A02.A0J(this.A00, rewardedVideoShowAdConfig);
        this.A03.A0F().A3Q(A0J);
        return A0J;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final void destroy() {
        VF.A05(A00(Opcodes.I2D, 7, 47), A00(40, 27, 116), A00(128, 7, 122));
        A04();
    }

    public final void finalize() {
        this.A02.A07();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A01.A0D;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final int getVideoDuration() {
        return this.A01.A00;
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean A0H = this.A02.A0H();
        this.A03.A0F().A5X(A0H);
        return A0H;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean isAdLoaded() {
        return this.A02.A0I();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final void loadAd() {
        VF.A05(A00(Opcodes.D2I, 6, 44), A00(67, 32, 50), A00(8, 8, 38));
        A07(null, null, true);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final void loadAd(RewardedVideoAd.RewardedVideoLoadAdConfig rewardedVideoLoadAdConfig) {
        ((C0720Ra) rewardedVideoLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        if (this.A01.A04 != null) {
            this.A01.A04.onError(this.A00, new AdError(AdError.INTERNAL_ERROR_CODE, A00(24, 16, 30) + X7.A03(this.A01.A0B, th)));
        }
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A01.A06 = extraHints.getHints();
        this.A01.A07 = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        VF.A05(A00(Opcodes.LCMP, 4, 108), A00(99, 29, 96), A00(0, 8, 64));
        return A08(new C0721Rb().withAppOrientation(-1).build());
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean show(RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        VF.A05(A00(Opcodes.LCMP, 4, 108), A00(99, 29, 96), A00(16, 8, 88));
        return A08(rewardedVideoShowAdConfig);
    }
}

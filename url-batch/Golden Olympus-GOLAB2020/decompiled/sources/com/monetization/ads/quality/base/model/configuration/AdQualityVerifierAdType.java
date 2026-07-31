package com.monetization.ads.quality.base.model.configuration;

import b2.AbstractC1372b;
import b2.InterfaceC1371a;
import com.ironsource.mediationsdk.l;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* loaded from: classes2.dex */
public final class AdQualityVerifierAdType {
    private static final /* synthetic */ InterfaceC1371a $ENTRIES;
    private static final /* synthetic */ AdQualityVerifierAdType[] $VALUES;
    public static final AdQualityVerifierAdType BANNER;
    public static final AdQualityVerifierAdType INTERSTITIAL;
    public static final AdQualityVerifierAdType NATIVE;
    public static final AdQualityVerifierAdType REWARDED;

    static {
        AdQualityVerifierAdType adQualityVerifierAdType = new AdQualityVerifierAdType(0, l.f17627a);
        BANNER = adQualityVerifierAdType;
        AdQualityVerifierAdType adQualityVerifierAdType2 = new AdQualityVerifierAdType(1, "INTERSTITIAL");
        INTERSTITIAL = adQualityVerifierAdType2;
        AdQualityVerifierAdType adQualityVerifierAdType3 = new AdQualityVerifierAdType(2, "REWARDED");
        REWARDED = adQualityVerifierAdType3;
        AdQualityVerifierAdType adQualityVerifierAdType4 = new AdQualityVerifierAdType(3, "NATIVE");
        NATIVE = adQualityVerifierAdType4;
        AdQualityVerifierAdType[] adQualityVerifierAdTypeArr = {adQualityVerifierAdType, adQualityVerifierAdType2, adQualityVerifierAdType3, adQualityVerifierAdType4};
        $VALUES = adQualityVerifierAdTypeArr;
        $ENTRIES = AbstractC1372b.a(adQualityVerifierAdTypeArr);
    }

    private AdQualityVerifierAdType(int i4, String str) {
    }

    public static AdQualityVerifierAdType valueOf(String str) {
        return (AdQualityVerifierAdType) Enum.valueOf(AdQualityVerifierAdType.class, str);
    }

    public static AdQualityVerifierAdType[] values() {
        return (AdQualityVerifierAdType[]) $VALUES.clone();
    }
}

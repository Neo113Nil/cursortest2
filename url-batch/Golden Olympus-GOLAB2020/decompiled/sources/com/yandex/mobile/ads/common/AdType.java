package com.yandex.mobile.ads.common;

import b2.AbstractC1372b;
import b2.InterfaceC1371a;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ironsource.mediationsdk.l;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* loaded from: classes2.dex */
public final class AdType {
    public static final AdType APP_OPEN_AD;
    public static final AdType BANNER;
    public static final AdType INTERSTITIAL;
    public static final AdType NATIVE;
    public static final AdType REWARDED;
    public static final AdType UNKNOWN;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AdType[] f22429b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1371a f22430c;

    static {
        AdType adType = new AdType(0, GrsBaseInfo.CountryCodeSource.UNKNOWN);
        UNKNOWN = adType;
        AdType adType2 = new AdType(1, l.f17627a);
        BANNER = adType2;
        AdType adType3 = new AdType(2, "INTERSTITIAL");
        INTERSTITIAL = adType3;
        AdType adType4 = new AdType(3, "REWARDED");
        REWARDED = adType4;
        AdType adType5 = new AdType(4, "NATIVE");
        NATIVE = adType5;
        AdType adType6 = new AdType(5, "APP_OPEN_AD");
        APP_OPEN_AD = adType6;
        AdType[] adTypeArr = {adType, adType2, adType3, adType4, adType5, adType6};
        f22429b = adTypeArr;
        f22430c = AbstractC1372b.a(adTypeArr);
    }

    private AdType(int i4, String str) {
    }

    @NotNull
    public static InterfaceC1371a getEntries() {
        return f22430c;
    }

    public static AdType valueOf(String str) {
        return (AdType) Enum.valueOf(AdType.class, str);
    }

    public static AdType[] values() {
        return (AdType[]) f22429b.clone();
    }
}

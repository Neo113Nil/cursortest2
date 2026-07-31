package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.zd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2389zd {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2389zd f35552c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2389zd f35553d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC2389zd f35554e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC2389zd f35555f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC2389zd f35556g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC2389zd f35557h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumC2389zd[] f35558i;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f35559b;

    static {
        EnumC2389zd enumC2389zd = new EnumC2389zd(0, "AD_REQUEST", "ad_request");
        f35552c = enumC2389zd;
        EnumC2389zd enumC2389zd2 = new EnumC2389zd(1, "AD_ATTEMPT", "ad_attempt");
        f35553d = enumC2389zd2;
        EnumC2389zd enumC2389zd3 = new EnumC2389zd(2, "AD_FILLED_REQUEST", "ad_filled_request");
        f35554e = enumC2389zd3;
        EnumC2389zd enumC2389zd4 = new EnumC2389zd(3, "AD_IMPRESSION", FirebaseAnalytics.Event.AD_IMPRESSION);
        f35555f = enumC2389zd4;
        EnumC2389zd enumC2389zd5 = new EnumC2389zd(4, "AD_CLICK", "ad_click");
        f35556g = enumC2389zd5;
        EnumC2389zd enumC2389zd6 = new EnumC2389zd(5, "AD_REWARD", "ad_reward");
        f35557h = enumC2389zd6;
        EnumC2389zd[] enumC2389zdArr = {enumC2389zd, enumC2389zd2, enumC2389zd3, enumC2389zd4, enumC2389zd5, enumC2389zd6};
        f35558i = enumC2389zdArr;
        AbstractC1372b.a(enumC2389zdArr);
    }

    private EnumC2389zd(int i4, String str, String str2) {
        this.f35559b = str2;
    }

    public static EnumC2389zd valueOf(String str) {
        return (EnumC2389zd) Enum.valueOf(EnumC2389zd.class, str);
    }

    public static EnumC2389zd[] values() {
        return (EnumC2389zd[]) f35558i.clone();
    }

    @NotNull
    public final String a() {
        return this.f35559b;
    }
}

package com.squareup.cash.ui.overlays.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BannerStyle {
    public static final /* synthetic */ BannerStyle[] $VALUES;
    public static final BannerStyle CRITICAL;
    public static final BannerStyle INFORMATIONAL;
    public static final BannerStyle SEVERE;
    public static final BannerStyle SUCCESS;

    static {
        BannerStyle bannerStyle = new BannerStyle("SEVERE", 0);
        SEVERE = bannerStyle;
        BannerStyle bannerStyle2 = new BannerStyle("CRITICAL", 1);
        CRITICAL = bannerStyle2;
        BannerStyle bannerStyle3 = new BannerStyle("SUCCESS", 2);
        SUCCESS = bannerStyle3;
        BannerStyle bannerStyle4 = new BannerStyle("INFORMATIONAL", 3);
        INFORMATIONAL = bannerStyle4;
        $VALUES = new BannerStyle[]{bannerStyle, bannerStyle2, bannerStyle3, bannerStyle4};
    }

    public static BannerStyle valueOf(String str) {
        return (BannerStyle) Enum.valueOf(BannerStyle.class, str);
    }

    public static BannerStyle[] values() {
        return (BannerStyle[]) $VALUES.clone();
    }
}

package com.startapp.sdk.ads.banner;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class BannerSize {
    public static final BannerSize ZERO = new BannerSize(0, 0);
    private final int height;
    private final int width;

    public BannerSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}

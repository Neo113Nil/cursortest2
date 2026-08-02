package com.startapp.sdk.ads.banner;

/* loaded from: classes.dex */
public class BannerSize {
    public static final BannerSize ZERO = new BannerSize(0, 0);
    private final int height;
    private final int width;

    public BannerSize(int i4, int i5) {
        this.width = i4;
        this.height = i5;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}

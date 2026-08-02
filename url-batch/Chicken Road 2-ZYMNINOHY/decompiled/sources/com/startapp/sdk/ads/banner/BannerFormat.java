package com.startapp.sdk.ads.banner;

/* loaded from: classes.dex */
public enum BannerFormat {
    BANNER(0, 320, 50),
    MREC(1, 300, 250),
    COVER(2, 300, 157);

    final int heightDp;
    final int type;
    final int widthDp;

    BannerFormat(int i4, int i5, int i6) {
        this.type = i4;
        this.widthDp = i5;
        this.heightDp = i6;
    }
}

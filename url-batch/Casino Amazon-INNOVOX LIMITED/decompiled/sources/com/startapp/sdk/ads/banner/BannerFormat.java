package com.startapp.sdk.ads.banner;

import androidx.recyclerview.widget.ItemTouchHelper;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public enum BannerFormat {
    BANNER(0, 320, 50),
    MREC(1, 300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION),
    COVER(2, 300, 157);

    final int heightDp;
    final int type;
    final int widthDp;

    BannerFormat(int i, int i2, int i3) {
        this.type = i;
        this.widthDp = i2;
        this.heightDp = i3;
    }
}

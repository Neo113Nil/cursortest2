package com.bytedance.sdk.openadsdk.api.banner;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.material.card.MaterialCardViewHelper;

/* loaded from: classes2.dex */
public final class PAGBannerSize {
    private final int icD;
    private final int pvs;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(320, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i, int i2) {
        this.pvs = i;
        this.icD = i2;
    }

    public int getWidth() {
        return this.pvs;
    }

    public int getHeight() {
        return this.icD;
    }
}

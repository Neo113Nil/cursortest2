package com.startapp.sdk.ads.banner;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.l1;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class Mrec extends BannerStandard {
    public Mrec(Activity activity) {
        super(activity);
    }

    @Override // com.startapp.sdk.ads.banner.bannerstandard.BannerStandard, com.startapp.sdk.ads.banner.BannerBase
    protected String getBannerName() {
        return "StartApp Mrec";
    }

    @Override // com.startapp.sdk.ads.banner.bannerstandard.BannerStandard
    protected int getBannerType() {
        return 1;
    }

    @Override // com.startapp.sdk.ads.banner.bannerstandard.BannerStandard, com.startapp.sdk.ads.banner.BannerBase
    protected int getHeightInDp() {
        return ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
    }

    @Override // com.startapp.sdk.ads.banner.bannerstandard.BannerStandard, com.startapp.sdk.ads.banner.BannerBase
    protected int getWidthInDp() {
        return 300;
    }

    public Mrec(Activity activity, AdPreferences adPreferences) {
        super(activity, adPreferences);
    }

    public Mrec(Activity activity, BannerListener bannerListener) {
        super(activity, bannerListener);
    }

    public Mrec(Activity activity, AdPreferences adPreferences, BannerListener bannerListener) {
        super(activity, adPreferences, bannerListener);
    }

    public Mrec(Activity activity, AttributeSet attributeSet) {
        super(activity, attributeSet);
    }

    public Mrec(Activity activity, AttributeSet attributeSet, int i) {
        super(activity, attributeSet, i);
    }

    @Deprecated
    public Mrec(Context context) {
        super(context);
    }

    @Deprecated
    public Mrec(Context context, AdPreferences adPreferences) {
        super(context, adPreferences);
    }

    @Deprecated
    public Mrec(Context context, BannerListener bannerListener) {
        super(context, bannerListener);
    }

    @Deprecated
    public Mrec(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        super(context, adPreferences, bannerListener);
    }

    @Deprecated
    public Mrec(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Deprecated
    public Mrec(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    Mrec(Context context, boolean z, AdPreferences adPreferences, l1 l1Var) {
        super(context, z, adPreferences, l1Var);
    }
}

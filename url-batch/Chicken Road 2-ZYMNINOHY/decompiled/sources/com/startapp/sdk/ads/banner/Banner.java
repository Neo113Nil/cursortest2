package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.util.AttributeSet;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.q1;

/* loaded from: classes.dex */
public class Banner extends BannerStandard {
    public Banner(Context context) {
        super(context);
    }

    public Banner(Context context, AdPreferences adPreferences) {
        super(context, adPreferences);
    }

    public Banner(Context context, BannerListener bannerListener) {
        super(context, bannerListener);
    }

    public Banner(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        super(context, adPreferences, bannerListener);
    }

    public Banner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Banner(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }

    public Banner(Context context, boolean z, AdPreferences adPreferences, q1 q1Var) {
        super(context, z, adPreferences, q1Var);
    }
}

package com.aiming.mdt.banner;

import android.app.Activity;
import com.aiming.mdt.a.ViewOnAttachStateChangeListenerC0037;

/* loaded from: classes.dex */
public class BannerAd {
    private ViewOnAttachStateChangeListenerC0037 mBanner;

    public BannerAd(Activity activity, String str, BannerAdListener bannerAdListener) {
        this.mBanner = new ViewOnAttachStateChangeListenerC0037(activity, str, bannerAdListener);
    }

    public void destroy() {
        if (this.mBanner != null) {
            this.mBanner.mo73();
        }
    }

    public void loadAd() {
        if (this.mBanner != null) {
            this.mBanner.m898();
        }
    }
}

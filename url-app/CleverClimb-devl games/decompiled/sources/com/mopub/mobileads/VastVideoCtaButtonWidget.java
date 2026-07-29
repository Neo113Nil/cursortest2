package com.mopub.mobileads;

import android.content.Context;
import android.content.res.Configuration;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Dips;
import com.mopub.common.util.Utils;
import com.mopub.mobileads.resource.CtaButtonDrawable;

/* loaded from: classes2.dex */
public class VastVideoCtaButtonWidget extends ImageView {
    private CtaButtonDrawable mCtaButtonDrawable;
    private boolean mHasClickthroughUrl;
    private boolean mHasCompanionAd;
    private boolean mHasSocialActions;
    private boolean mIsVideoComplete;
    private boolean mIsVideoSkippable;
    private final RelativeLayout.LayoutParams mLandscapeLayoutParams;
    private final RelativeLayout.LayoutParams mPortraitLayoutParams;

    public VastVideoCtaButtonWidget(Context context, int i, boolean z, boolean z2) {
        super(context);
        this.mHasCompanionAd = z;
        this.mHasClickthroughUrl = z2;
        this.mHasSocialActions = false;
        setId((int) Utils.generateUniqueId());
        int dipsToIntPixels = Dips.dipsToIntPixels(150.0f, context);
        int dipsToIntPixels2 = Dips.dipsToIntPixels(38.0f, context);
        int dipsToIntPixels3 = Dips.dipsToIntPixels(16.0f, context);
        this.mCtaButtonDrawable = new CtaButtonDrawable(context);
        setImageDrawable(this.mCtaButtonDrawable);
        this.mLandscapeLayoutParams = new RelativeLayout.LayoutParams(dipsToIntPixels, dipsToIntPixels2);
        this.mLandscapeLayoutParams.setMargins(dipsToIntPixels3, dipsToIntPixels3, dipsToIntPixels3, dipsToIntPixels3);
        this.mLandscapeLayoutParams.addRule(8, i);
        this.mLandscapeLayoutParams.addRule(7, i);
        this.mPortraitLayoutParams = new RelativeLayout.LayoutParams(dipsToIntPixels, dipsToIntPixels2);
        this.mPortraitLayoutParams.setMargins(dipsToIntPixels3, dipsToIntPixels3, dipsToIntPixels3, dipsToIntPixels3);
        this.mPortraitLayoutParams.addRule(12);
        this.mPortraitLayoutParams.addRule(11);
        updateLayoutAndVisibility();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateLayoutAndVisibility();
    }

    void updateCtaText(String str) {
        this.mCtaButtonDrawable.setCtaText(str);
    }

    void setHasSocialActions(boolean z) {
        this.mHasSocialActions = z;
    }

    boolean getHasSocialActions() {
        return this.mHasSocialActions;
    }

    void notifyVideoSkippable() {
        this.mIsVideoSkippable = true;
        updateLayoutAndVisibility();
    }

    void notifyVideoComplete() {
        this.mIsVideoSkippable = true;
        this.mIsVideoComplete = true;
        updateLayoutAndVisibility();
    }

    private void updateLayoutAndVisibility() {
        if (!this.mHasClickthroughUrl) {
            setVisibility(8);
            return;
        }
        if (!this.mIsVideoSkippable) {
            setVisibility(4);
            return;
        }
        if (this.mIsVideoComplete && this.mHasCompanionAd && !this.mHasSocialActions) {
            setVisibility(8);
            return;
        }
        switch (getResources().getConfiguration().orientation) {
            case 0:
                MoPubLog.d("Screen orientation undefined: CTA button widget defaulting to portrait layout");
                setLayoutParams(this.mPortraitLayoutParams);
                break;
            case 1:
                setLayoutParams(this.mPortraitLayoutParams);
                break;
            case 2:
                setLayoutParams(this.mLandscapeLayoutParams);
                break;
            case 3:
                MoPubLog.d("Screen orientation is deprecated ORIENTATION_SQUARE: CTA button widget defaulting to portrait layout");
                setLayoutParams(this.mPortraitLayoutParams);
                break;
            default:
                MoPubLog.d("Unrecognized screen orientation: CTA button widget defaulting to portrait layout");
                setLayoutParams(this.mPortraitLayoutParams);
                break;
        }
        setVisibility(0);
    }

    @VisibleForTesting
    @Deprecated
    String getCtaText() {
        return this.mCtaButtonDrawable.getCtaText();
    }

    @VisibleForTesting
    @Deprecated
    boolean hasPortraitLayoutParams() {
        return getLayoutParams().equals(this.mPortraitLayoutParams);
    }

    @VisibleForTesting
    @Deprecated
    boolean hasLandscapeLayoutParams() {
        return getLayoutParams().equals(this.mLandscapeLayoutParams);
    }
}

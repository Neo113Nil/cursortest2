package com.mopub.mobileads;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.DeviceUtils;
import com.mopub.common.util.Dips;
import com.mopub.mobileads.resource.DrawableConstants;

/* loaded from: classes2.dex */
public class VastVideoGradientStripWidget extends ImageView {
    DeviceUtils.ForceOrientation mForceOrientation;
    private boolean mHasCompanionAd;
    private boolean mIsVideoComplete;
    private int mVisibilityForCompanionAd;

    public VastVideoGradientStripWidget(Context context, GradientDrawable.Orientation orientation, DeviceUtils.ForceOrientation forceOrientation, boolean z, int i, int i2, int i3) {
        super(context);
        this.mForceOrientation = forceOrientation;
        this.mVisibilityForCompanionAd = i;
        this.mHasCompanionAd = z;
        setImageDrawable(new GradientDrawable(orientation, new int[]{DrawableConstants.GradientStrip.START_COLOR, DrawableConstants.GradientStrip.END_COLOR}));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, Dips.dipsToIntPixels(72.0f, context));
        layoutParams.addRule(i2, i3);
        setLayoutParams(layoutParams);
        updateVisibility();
    }

    void notifyVideoComplete() {
        this.mIsVideoComplete = true;
        updateVisibility();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateVisibility();
    }

    private void updateVisibility() {
        if (this.mIsVideoComplete) {
            if (this.mHasCompanionAd) {
                setVisibility(this.mVisibilityForCompanionAd);
                return;
            } else {
                setVisibility(8);
            }
        }
        if (this.mForceOrientation == DeviceUtils.ForceOrientation.FORCE_PORTRAIT) {
            setVisibility(4);
            return;
        }
        if (this.mForceOrientation == DeviceUtils.ForceOrientation.FORCE_LANDSCAPE) {
            setVisibility(0);
            return;
        }
        switch (getResources().getConfiguration().orientation) {
            case 0:
                MoPubLog.d("Screen orientation undefined: do not show gradient strip widget");
                setVisibility(4);
                break;
            case 1:
                setVisibility(4);
                break;
            case 2:
                setVisibility(0);
                break;
            case 3:
                MoPubLog.d("Screen orientation is deprecated ORIENTATION_SQUARE: do not show gradient strip widget");
                setVisibility(4);
                break;
            default:
                MoPubLog.d("Unrecognized screen orientation: do not show gradient strip widget");
                setVisibility(4);
                break;
        }
    }
}

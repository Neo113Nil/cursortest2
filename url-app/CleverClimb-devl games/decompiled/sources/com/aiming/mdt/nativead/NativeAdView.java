package com.aiming.mdt.nativead;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public class NativeAdView extends RelativeLayout {
    private AdIconView adIconView;
    private View callToActionView;
    private View descView;
    private MediaView mediaView;
    private View titleView;

    public NativeAdView(Context context) {
        super(context);
    }

    public AdIconView getAdIconView() {
        return this.adIconView;
    }

    public View getCallToActionView() {
        return this.callToActionView;
    }

    public View getDescView() {
        return this.descView;
    }

    public MediaView getMediaView() {
        return this.mediaView;
    }

    public View getTitleView() {
        return this.titleView;
    }

    public void setAdIconView(AdIconView adIconView) {
        this.adIconView = adIconView;
    }

    public void setCallToActionView(View view) {
        this.callToActionView = view;
    }

    public void setDescView(View view) {
        this.descView = view;
    }

    public void setMediaView(MediaView mediaView) {
        this.mediaView = mediaView;
    }

    public void setTitleView(View view) {
        this.titleView = view;
    }
}

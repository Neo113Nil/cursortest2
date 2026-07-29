package com.applovin.mediation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.applovin.nativeAds.AppLovinNativeAd;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import java.util.ArrayList;

/* loaded from: classes.dex */
class AppLovinNativeAdMapper extends NativeAppInstallAdMapper {
    private AppLovinNativeAd mNativeAd;

    AppLovinNativeAdMapper(AppLovinNativeAd appLovinNativeAd, Context context) {
        this.mNativeAd = appLovinNativeAd;
        setHeadline(appLovinNativeAd.getTitle());
        setBody(appLovinNativeAd.getDescriptionText());
        setCallToAction(appLovinNativeAd.getCtaText());
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ArrayList arrayList = new ArrayList(1);
        Uri parse = Uri.parse(appLovinNativeAd.getImageUrl());
        Drawable createFromPath = Drawable.createFromPath(parse.getPath());
        Uri parse2 = Uri.parse(appLovinNativeAd.getIconUrl());
        Drawable createFromPath2 = Drawable.createFromPath(parse2.getPath());
        AppLovinNativeAdImage appLovinNativeAdImage = new AppLovinNativeAdImage(parse, createFromPath);
        NativeAd.Image appLovinNativeAdImage2 = new AppLovinNativeAdImage(parse2, createFromPath2);
        arrayList.add(appLovinNativeAdImage);
        setImages(arrayList);
        setIcon(appLovinNativeAdImage2);
        imageView.setImageDrawable(createFromPath);
        setMediaView(imageView);
        setStarRating(appLovinNativeAd.getStarRating());
        Bundle bundle = new Bundle();
        bundle.putLong(AppLovinNativeAdapter.KEY_EXTRA_AD_ID, appLovinNativeAd.getAdId());
        bundle.putString(AppLovinNativeAdapter.KEY_EXTRA_CAPTION_TEXT, appLovinNativeAd.getCaptionText());
        setExtras(bundle);
        setOverrideClickHandling(false);
        setOverrideImpressionRecording(false);
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public void recordImpression() {
        this.mNativeAd.trackImpression();
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public void handleClick(View view) {
        this.mNativeAd.launchClickTarget(view.getContext());
    }

    private static class AppLovinNativeAdImage extends NativeAd.Image {
        private final Drawable mDrawable;
        private final Uri mUri;

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        AppLovinNativeAdImage(Uri uri, Drawable drawable) {
            this.mDrawable = drawable;
            this.mUri = uri;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.mDrawable;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.mUri;
        }
    }
}

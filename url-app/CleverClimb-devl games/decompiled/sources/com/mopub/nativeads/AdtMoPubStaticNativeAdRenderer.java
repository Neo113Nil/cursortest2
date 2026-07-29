package com.mopub.nativeads;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.aiming.mdt.nativead.NativeAdView;
import com.mopub.common.Preconditions;
import com.mopub.nativeads.AdtNative;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class AdtMoPubStaticNativeAdRenderer implements MoPubAdRenderer<StaticNativeAd> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final AdtViewBinder f1273;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private WeakHashMap<View, AdtStaticNativeViewHolder> f1274 = new WeakHashMap<>();

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private Context f1275;

    /* renamed from: ʼ, reason: contains not printable characters */
    private RelativeLayout f1276;

    public AdtMoPubStaticNativeAdRenderer(AdtViewBinder adtViewBinder, Context context) {
        this.f1273 = adtViewBinder;
        this.f1275 = context;
    }

    @Override // com.mopub.nativeads.MoPubAdRenderer
    public View createAdView(Context context, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(this.f1273.f1302, viewGroup, false);
    }

    @Override // com.mopub.nativeads.MoPubAdRenderer
    public void renderAdView(View view, StaticNativeAd staticNativeAd) {
        AdtStaticNativeViewHolder adtStaticNativeViewHolder = this.f1274.get(view);
        if (adtStaticNativeViewHolder == null) {
            adtStaticNativeViewHolder = AdtStaticNativeViewHolder.m1350(view, this.f1273);
            this.f1274.put(view, adtStaticNativeViewHolder);
        }
        if (staticNativeAd instanceof AdtNative.AdtStaticNativeAd) {
            AdtNative.AdtStaticNativeAd adtStaticNativeAd = (AdtNative.AdtStaticNativeAd) staticNativeAd;
            NativeAdView nativeAdView = new NativeAdView(this.f1275);
            if (adtStaticNativeViewHolder.f1292 != null) {
                adtStaticNativeViewHolder.f1292.setText(adtStaticNativeAd.getTitle());
                nativeAdView.setTitleView(adtStaticNativeViewHolder.f1292);
            }
            if (adtStaticNativeViewHolder.f1289 != null) {
                adtStaticNativeViewHolder.f1289.setText(adtStaticNativeAd.getText());
                nativeAdView.setDescView(adtStaticNativeViewHolder.f1289);
            }
            if (adtStaticNativeViewHolder.f1285 != null) {
                adtStaticNativeViewHolder.f1285.setText(adtStaticNativeAd.getCallToAction());
                nativeAdView.setCallToActionView(adtStaticNativeViewHolder.f1285);
            }
            if (adtStaticNativeViewHolder.f1288 != null) {
                adtStaticNativeViewHolder.f1288.setVisibility(8);
            }
            if (adtStaticNativeViewHolder.f1290 != null) {
                adtStaticNativeViewHolder.f1290.removeAllViews();
                nativeAdView.setMediaView(adtStaticNativeViewHolder.f1290);
            }
            if (adtStaticNativeViewHolder.f1293 != null) {
                adtStaticNativeViewHolder.f1293.removeAllViews();
                nativeAdView.setAdIconView(adtStaticNativeViewHolder.f1293);
            }
            if (adtStaticNativeViewHolder.f1287 != null) {
                ((ViewGroup) adtStaticNativeViewHolder.f1287.getParent()).removeAllViews();
                nativeAdView.addView(adtStaticNativeViewHolder.f1287);
            }
            adtStaticNativeAd.getNativeAd().registerNativeAdView(nativeAdView);
            if (this.f1276 != null && adtStaticNativeViewHolder.f1287 != null) {
                adtStaticNativeViewHolder.f1287.getLayoutParams().width = -1;
                adtStaticNativeViewHolder.f1287.getLayoutParams().height = -2;
                this.f1276.removeAllViews();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(17);
                this.f1276.addView(nativeAdView, layoutParams);
            }
        } else {
            NativeRendererHelper.addTextView(adtStaticNativeViewHolder.f1292, staticNativeAd.getTitle());
            NativeRendererHelper.addTextView(adtStaticNativeViewHolder.f1289, staticNativeAd.getText());
            NativeRendererHelper.addTextView(adtStaticNativeViewHolder.f1285, staticNativeAd.getCallToAction());
            NativeImageHelper.loadImageView(staticNativeAd.getMainImageUrl(), adtStaticNativeViewHolder.f1286);
            NativeImageHelper.loadImageView(staticNativeAd.getIconImageUrl(), adtStaticNativeViewHolder.f1291);
            NativeRendererHelper.addPrivacyInformationIcon(adtStaticNativeViewHolder.f1288, staticNativeAd.getPrivacyInformationIconImageUrl(), staticNativeAd.getPrivacyInformationIconClickThroughUrl());
        }
        NativeRendererHelper.updateExtras(adtStaticNativeViewHolder.f1287, this.f1273.f1298, staticNativeAd.getExtras());
        if (adtStaticNativeViewHolder.f1287 != null) {
            adtStaticNativeViewHolder.f1287.setVisibility(0);
        }
    }

    public void setAdParent(RelativeLayout relativeLayout) {
        this.f1276 = relativeLayout;
    }

    @Override // com.mopub.nativeads.MoPubAdRenderer
    public boolean supports(BaseNativeAd baseNativeAd) {
        Preconditions.checkNotNull(baseNativeAd);
        return baseNativeAd instanceof StaticNativeAd;
    }
}

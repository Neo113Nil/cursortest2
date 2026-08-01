package dev.cct.translatorapp.TranslatorAdmobAds.facebookads;

import android.app.Activity;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.shimmer.ShimmerFrameLayout;
import dev.cct.translatorapp.ads.ConstantParam;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FacebookBannerAdManager.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Ldev/cct/translatorapp/TranslatorAdmobAds/facebookads/FacebookBannerAdManager;", "", "()V", "adListener", "Lcom/facebook/ads/AdListener;", "getAdListener", "()Lcom/facebook/ads/AdListener;", "setAdListener", "(Lcom/facebook/ads/AdListener;)V", "bannerAdview", "Lcom/facebook/ads/AdView;", "getBannerAdview", "()Lcom/facebook/ads/AdView;", "setBannerAdview", "(Lcom/facebook/ads/AdView;)V", "loadFbBannerAd", "", "context", "Landroid/app/Activity;", "adContainerView", "Landroid/widget/LinearLayout;", "shimmerFrameLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "removeFbBannerAdView", "Landroid/widget/FrameLayout;", "Companion", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FacebookBannerAdManager {
    public static final String BANNER_TAG = "FacebookBannerAd";
    private AdListener adListener;
    private AdView bannerAdview;

    public final AdView getBannerAdview() {
        return this.bannerAdview;
    }

    public final void setBannerAdview(AdView adView) {
        this.bannerAdview = adView;
    }

    public final AdListener getAdListener() {
        return this.adListener;
    }

    public final void setAdListener(AdListener adListener) {
        this.adListener = adListener;
    }

    public final void loadFbBannerAd(Activity context, LinearLayout adContainerView, final ShimmerFrameLayout shimmerFrameLayout) {
        Intrinsics.checkNotNullParameter(shimmerFrameLayout, "shimmerFrameLayout");
        if (ConstantParam.INSTANCE.m204isPurchased()) {
            if (adContainerView != null) {
                ExtensionFunctionKt.hide(adContainerView);
                return;
            }
            return;
        }
        this.bannerAdview = new AdView(context, ConstantParam.INSTANCE.getFbBannerId(), AdSize.BANNER_HEIGHT_50);
        this.adListener = new AdListener() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.facebookads.FacebookBannerAdManager$loadFbBannerAd$1
            @Override // com.facebook.ads.AdListener
            public void onError(Ad p0, AdError p1) {
                Log.d(FacebookBannerAdManager.BANNER_TAG, "onError:" + (p1 != null ? p1.getErrorMessage() : null) + " ");
            }

            @Override // com.facebook.ads.AdListener
            public void onAdLoaded(Ad p0) {
                Log.d(FacebookBannerAdManager.BANNER_TAG, "onAdLoaded: ");
                ExtensionFunctionKt.hide(ShimmerFrameLayout.this);
            }

            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad p0) {
                Log.d(FacebookBannerAdManager.BANNER_TAG, "onAdClicked: ");
            }

            @Override // com.facebook.ads.AdListener
            public void onLoggingImpression(Ad p0) {
                Log.d(FacebookBannerAdManager.BANNER_TAG, "onLoggingImpression: ");
            }
        };
        AdView adView = this.bannerAdview;
        if (adView != null) {
            if (adContainerView != null) {
                adContainerView.addView(adView);
            }
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(this.adListener).build());
        }
    }

    public final void removeFbBannerAdView(FrameLayout adContainerView) {
        if (adContainerView != null) {
            try {
                adContainerView.removeAllViews();
            } catch (Exception e) {
                Log.e(BANNER_TAG, "removeFbBannerAdView:" + e.getMessage());
                return;
            }
        }
        AdView adView = this.bannerAdview;
        if (adView != null) {
            adView.destroy();
        }
        this.bannerAdview = null;
    }
}

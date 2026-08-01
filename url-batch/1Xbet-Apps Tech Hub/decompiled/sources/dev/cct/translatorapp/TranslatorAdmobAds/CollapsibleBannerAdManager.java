package dev.cct.translatorapp.TranslatorAdmobAds;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import dev.cct.translatorapp.ads.ConstantParam;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollapsibleBannerAdManager.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J,\u0010\u000f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\nJ\u0006\u0010\u0017\u001a\u00020\nJ\u0010\u0010\u0018\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001a"}, d2 = {"Ldev/cct/translatorapp/TranslatorAdmobAds/CollapsibleBannerAdManager;", "", "()V", "adView", "Lcom/google/android/gms/ads/AdView;", "getAdView", "()Lcom/google/android/gms/ads/AdView;", "setAdView", "(Lcom/google/android/gms/ads/AdView;)V", "destroyBannerAd", "", "getAdSize", "Lcom/google/android/gms/ads/AdSize;", "context", "Landroid/app/Activity;", "loadBannerAd", FacebookMediationAdapter.KEY_ID, "", "adContainerView", "Landroid/widget/FrameLayout;", "shimmerFrameLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "onPauseBannerAd", "onResumeBannerAd", "removeBannerAdView", "Companion", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CollapsibleBannerAdManager {
    public static final String BANNER_MANAGER_TAG = "collapsibleBanner";
    private AdView adView;

    public final AdView getAdView() {
        return this.adView;
    }

    public final void setAdView(AdView adView) {
        this.adView = adView;
    }

    public final void loadBannerAd(Activity context, String id, FrameLayout adContainerView, final ShimmerFrameLayout shimmerFrameLayout) {
        Intrinsics.checkNotNullParameter(shimmerFrameLayout, "shimmerFrameLayout");
        if (ConstantParam.INSTANCE.m204isPurchased()) {
            if (adContainerView != null) {
                ExtensionFunctionKt.hide(adContainerView);
            }
            ExtensionFunctionKt.hide(shimmerFrameLayout);
            return;
        }
        if (context != null) {
            Log.e("collapsibleBanner", "LoadNewBannerAd");
            removeBannerAdView(adContainerView);
            Bundle bundle = new Bundle();
            bundle.putString("collapsible", "bottom");
            AdRequest build = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …                 .build()");
            AdView adView = new AdView(context);
            this.adView = adView;
            if (id != null) {
                adView.setAdUnitId(id);
            }
            if (adContainerView != null) {
                adContainerView.addView(this.adView);
            }
            AdSize adSize = getAdSize(context);
            AdView adView2 = this.adView;
            if (adView2 != null) {
                adView2.setAdSize(adSize);
            }
            AdView adView3 = this.adView;
            if (adView3 != null) {
                adView3.loadAd(build);
            }
            AdView adView4 = this.adView;
            if (adView4 == null) {
                return;
            }
            adView4.setAdListener(new AdListener() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.CollapsibleBannerAdManager$loadBannerAd$1$2
                @Override // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(LoadAdError p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    super.onAdFailedToLoad(p0);
                    Log.e("collapsibleBanner", "onAdFailedToLoad:" + p0.getMessage());
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdImpression() {
                    super.onAdImpression();
                    Log.e("collapsibleBanner", "AdImpression");
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdLoaded() {
                    super.onAdLoaded();
                    Log.e("collapsibleBanner", "onAdLoaded");
                    ExtensionFunctionKt.hide(ShimmerFrameLayout.this);
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdOpened() {
                    super.onAdOpened();
                }
            });
        }
    }

    public final void removeBannerAdView(FrameLayout adContainerView) {
        try {
            AdView adView = this.adView;
            if (adView != null) {
                if (adView.getParent() != null) {
                    ViewParent parent = adView.getParent();
                    Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent).removeView(adView);
                }
                if (adContainerView != null) {
                    adContainerView.removeAllViews();
                }
            }
        } catch (Exception unused) {
            Log.e("collapsibleBanner", "ExceptionInAdUnBinding");
        }
    }

    private final AdSize getAdSize(Activity context) {
        Display defaultDisplay;
        if (Build.VERSION.SDK_INT >= 30) {
            defaultDisplay = context.getDisplay();
        } else {
            defaultDisplay = context.getWindowManager().getDefaultDisplay();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        AdSize currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, (int) (displayMetrics.widthPixels / displayMetrics.density));
        Intrinsics.checkNotNullExpressionValue(currentOrientationAnchoredAdaptiveBannerAdSize, "getCurrentOrientationAnc…rAdSize(context, adWidth)");
        return currentOrientationAnchoredAdaptiveBannerAdSize;
    }

    public final void onPauseBannerAd() {
        Log.e("collapsibleBanner", "OnPauseBannerAd");
        AdView adView = this.adView;
        if (adView != null) {
            adView.pause();
        }
    }

    public final void onResumeBannerAd() {
        Log.e("collapsibleBanner", "onResumeBannerAd");
        AdView adView = this.adView;
        if (adView != null) {
            adView.resume();
        }
    }

    public final void destroyBannerAd() {
        AdView adView = this.adView;
        if (adView != null) {
            adView.destroy();
        }
        this.adView = null;
    }
}

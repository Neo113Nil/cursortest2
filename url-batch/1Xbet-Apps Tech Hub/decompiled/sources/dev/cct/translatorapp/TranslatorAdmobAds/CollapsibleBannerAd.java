package dev.cct.translatorapp.TranslatorAdmobAds;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
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

/* compiled from: CollapsibleBannerAd.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Ldev/cct/translatorapp/TranslatorAdmobAds/CollapsibleBannerAd;", "", "()V", "adView", "Lcom/google/android/gms/ads/AdView;", "loadBanner", "", "context", "Landroid/content/Context;", FacebookMediationAdapter.KEY_ID, "", "adContainerView", "Landroid/widget/FrameLayout;", "shimmerFrameLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "Companion", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CollapsibleBannerAd {
    public static final String COLLAPSIBLE_BANNER_TAG = "collapsibleBanner";
    private AdView adView;

    public final void loadBanner(Context context, String id, FrameLayout adContainerView, final ShimmerFrameLayout shimmerFrameLayout) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(adContainerView, "adContainerView");
        Intrinsics.checkNotNullParameter(shimmerFrameLayout, "shimmerFrameLayout");
        if (!ConstantParam.INSTANCE.m204isPurchased()) {
            this.adView = new AdView(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            AdView adView = this.adView;
            if (adView != null) {
                adView.setLayoutParams(layoutParams);
            }
            adContainerView.addView(this.adView);
            AdView adView2 = this.adView;
            if (adView2 != null) {
                adView2.setAdUnitId(id);
            }
            Object systemService = context.getSystemService("window");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            float f = displayMetrics.density;
            float width = adContainerView.getWidth();
            if (width == 0.0f) {
                width = displayMetrics.widthPixels;
            }
            AdSize currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, (int) (width / f));
            Intrinsics.checkNotNullExpressionValue(currentOrientationAnchoredAdaptiveBannerAdSize, "getCurrentOrientationAnc…rAdSize(context, adWidth)");
            Bundle bundle = new Bundle();
            bundle.putString("collapsible", "bottom");
            AdView adView3 = this.adView;
            if (adView3 != null) {
                adView3.setAdSize(currentOrientationAnchoredAdaptiveBannerAdSize);
            }
            AdRequest build = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …\n                .build()");
            AdView adView4 = this.adView;
            if (adView4 != null) {
                adView4.loadAd(build);
            }
            AdView adView5 = this.adView;
            if (adView5 == null) {
                return;
            }
            adView5.setAdListener(new AdListener() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.CollapsibleBannerAd$loadBanner$1
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
            return;
        }
        ExtensionFunctionKt.hide(adContainerView);
        ExtensionFunctionKt.hide(shimmerFrameLayout);
    }
}

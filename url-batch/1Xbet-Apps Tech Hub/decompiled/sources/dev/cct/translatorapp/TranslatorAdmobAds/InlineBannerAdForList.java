package dev.cct.translatorapp.TranslatorAdmobAds;

import android.app.Activity;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import dev.cct.translatorapp.ads.ConstantParam;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InlineBannerAdForList.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J$\u0010\u000f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u0011J\u0006\u0010\u0013\u001a\u00020\nJ\u0006\u0010\u0014\u001a\u00020\nJ\u0010\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0018\u0010\u0018\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001c"}, d2 = {"Ldev/cct/translatorapp/TranslatorAdmobAds/InlineBannerAdForList;", "", "()V", "adView", "Lcom/google/android/gms/ads/AdView;", "getAdView", "()Lcom/google/android/gms/ads/AdView;", "setAdView", "(Lcom/google/android/gms/ads/AdView;)V", "destroyBannerAd", "", "getAdSize", "Lcom/google/android/gms/ads/AdSize;", "context", "Landroid/app/Activity;", "loadBannerAd", "onShowAdCompletedAction", "Lkotlin/Function1;", "", "onPauseBannerAd", "onResumeBannerAd", "removeBannerAdView", "adContainerView", "Landroid/widget/FrameLayout;", "showInlineBannerAd", "shimmerFrameLayout", "Landroid/widget/TextView;", "Companion", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InlineBannerAdForList {
    public static final String BANNER_MANAGER_TAG = "InlineBannerAdForList";
    private AdView adView;

    public final AdView getAdView() {
        return this.adView;
    }

    public final void setAdView(AdView adView) {
        this.adView = adView;
    }

    public final void loadBannerAd(Activity context, final Function1<? super Boolean, Unit> onShowAdCompletedAction) {
        Intrinsics.checkNotNullParameter(onShowAdCompletedAction, "onShowAdCompletedAction");
        if (ConstantParam.INSTANCE.m204isPurchased() || context == null) {
            return;
        }
        Log.e(BANNER_MANAGER_TAG, "LoadNewBannerAd");
        if (this.adView == null) {
            AdView adView = new AdView(context);
            adView.setAdUnitId(ConstantParam.INSTANCE.getInlineBannerId());
            adView.setAdSize(getAdSize(context));
            this.adView = adView;
        }
        AdRequest build = new AdRequest.Builder().build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder().build()");
        AdView adView2 = this.adView;
        if (adView2 != null) {
            adView2.loadAd(build);
        }
        AdView adView3 = this.adView;
        if (adView3 == null) {
            return;
        }
        adView3.setAdListener(new AdListener() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.InlineBannerAdForList$loadBannerAd$1$2
            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                super.onAdFailedToLoad(p0);
                Log.e(InlineBannerAdForList.BANNER_MANAGER_TAG, "onAdFailedToLoad:" + p0.getMessage());
                onShowAdCompletedAction.invoke(false);
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                super.onAdLoaded();
                Log.e(InlineBannerAdForList.BANNER_MANAGER_TAG, "onAdLoaded");
                onShowAdCompletedAction.invoke(true);
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdImpression() {
                super.onAdImpression();
                Log.e(InlineBannerAdForList.BANNER_MANAGER_TAG, "AdImpression");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
                super.onAdOpened();
            }
        });
    }

    public final void showInlineBannerAd(FrameLayout adContainerView, TextView shimmerFrameLayout) {
        Intrinsics.checkNotNullParameter(shimmerFrameLayout, "shimmerFrameLayout");
        AdView adView = this.adView;
        if (adView != null) {
            ViewParent parent = adView.getParent();
            Unit unit = null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(adView);
            }
            if (adContainerView != null) {
                adContainerView.removeAllViews();
                adContainerView.addView(adView);
                ExtensionFunctionKt.show(adContainerView);
                unit = Unit.INSTANCE;
            }
            if (unit != null) {
                return;
            }
        }
        if (adContainerView != null) {
            ExtensionFunctionKt.hide(adContainerView);
        }
        ExtensionFunctionKt.hide(shimmerFrameLayout);
        Unit unit2 = Unit.INSTANCE;
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
            Log.e(BANNER_MANAGER_TAG, "ExceptionInAdUnBinding");
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
        int i = displayMetrics.widthPixels;
        float f = displayMetrics.density;
        AdSize currentOrientationInlineAdaptiveBannerAdSize = AdSize.getCurrentOrientationInlineAdaptiveBannerAdSize(context, 320);
        Intrinsics.checkNotNullExpressionValue(currentOrientationInlineAdaptiveBannerAdSize, "getCurrentOrientationInl…annerAdSize(context, 320)");
        return currentOrientationInlineAdaptiveBannerAdSize;
    }

    public final void onPauseBannerAd() {
        Log.e(BANNER_MANAGER_TAG, "OnPauseBannerAd");
        AdView adView = this.adView;
        if (adView != null) {
            adView.pause();
        }
    }

    public final void onResumeBannerAd() {
        Log.e(BANNER_MANAGER_TAG, "onResumeBannerAd");
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
    }
}

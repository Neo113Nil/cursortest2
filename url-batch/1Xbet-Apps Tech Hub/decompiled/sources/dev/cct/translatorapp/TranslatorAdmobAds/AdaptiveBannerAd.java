package dev.cct.translatorapp.TranslatorAdmobAds;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import dev.cct.translatorapp.ads.ConstantParam;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdaptiveBannerAd.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J>\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004¨\u0006\u0018"}, d2 = {"Ldev/cct/translatorapp/TranslatorAdmobAds/AdaptiveBannerAd;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "TAG", "", "adView", "Lcom/google/android/gms/ads/AdView;", "getContext", "()Landroid/content/Context;", "setContext", "loadBanner", "", "containerLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "adLayout", "Landroid/widget/FrameLayout;", "bannerId", "loadingText", "Landroid/widget/TextView;", "onShowAdCompletedAction", "Lkotlin/Function1;", "", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdaptiveBannerAd {
    private String TAG;
    private AdView adView;
    private Context context;

    public AdaptiveBannerAd(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.TAG = "AdaptiveBanner";
    }

    public final Context getContext() {
        return this.context;
    }

    public final void setContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public static /* synthetic */ void loadBanner$default(AdaptiveBannerAd adaptiveBannerAd, ConstraintLayout constraintLayout, FrameLayout frameLayout, String str, TextView textView, Function1 function1, int i, Object obj) {
        if ((i & 16) != 0) {
            function1 = null;
        }
        adaptiveBannerAd.loadBanner(constraintLayout, frameLayout, str, textView, function1);
    }

    public final void loadBanner(ConstraintLayout containerLayout, FrameLayout adLayout, String bannerId, TextView loadingText, final Function1<? super Boolean, Unit> onShowAdCompletedAction) {
        Intrinsics.checkNotNullParameter(containerLayout, "containerLayout");
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        Intrinsics.checkNotNullParameter(bannerId, "bannerId");
        Intrinsics.checkNotNullParameter(loadingText, "loadingText");
        if (!ConstantParam.INSTANCE.m204isPurchased() && AdsExtensionKt.isNetworkAvailable(this.context)) {
            this.adView = new AdView(this.context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            AdView adView = this.adView;
            AdView adView2 = null;
            if (adView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adView");
                adView = null;
            }
            adView.setLayoutParams(layoutParams);
            AdView adView3 = this.adView;
            if (adView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adView");
                adView3 = null;
            }
            adLayout.addView(adView3);
            AdView adView4 = this.adView;
            if (adView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adView");
                adView4 = null;
            }
            adView4.setAdUnitId(bannerId);
            Object systemService = this.context.getSystemService("window");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            float f = displayMetrics.density;
            float width = adLayout.getWidth();
            if (width == 0.0f) {
                width = displayMetrics.widthPixels;
            }
            AdSize currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this.context, (int) (width / f));
            Intrinsics.checkNotNullExpressionValue(currentOrientationAnchoredAdaptiveBannerAdSize, "getCurrentOrientationAnc…rAdSize(context, adWidth)");
            AdView adView5 = this.adView;
            if (adView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adView");
                adView5 = null;
            }
            adView5.setAdSize(currentOrientationAnchoredAdaptiveBannerAdSize);
            AdRequest build = new AdRequest.Builder().build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder().build()");
            AdView adView6 = this.adView;
            if (adView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adView");
                adView6 = null;
            }
            adView6.loadAd(build);
            AdView adView7 = this.adView;
            if (adView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adView");
            } else {
                adView2 = adView7;
            }
            adView2.setAdListener(new AdListener() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.AdaptiveBannerAd$loadBanner$1
                @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
                public void onAdClicked() {
                    String str;
                    str = AdaptiveBannerAd.this.TAG;
                    Log.d(str, "onAdClicked: ");
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdClosed() {
                    String str;
                    str = AdaptiveBannerAd.this.TAG;
                    Log.d(str, "onAdClosed: ");
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(LoadAdError adError) {
                    String str;
                    Intrinsics.checkNotNullParameter(adError, "adError");
                    str = AdaptiveBannerAd.this.TAG;
                    Log.d(str, "onAdFailedToLoad: ");
                    Function1<Boolean, Unit> function1 = onShowAdCompletedAction;
                    if (function1 != null) {
                        function1.invoke(false);
                    }
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdImpression() {
                    String str;
                    str = AdaptiveBannerAd.this.TAG;
                    Log.d(str, "onAdImpression: ");
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdLoaded() {
                    String str;
                    str = AdaptiveBannerAd.this.TAG;
                    Log.d(str, "onAdLoaded: ");
                    Function1<Boolean, Unit> function1 = onShowAdCompletedAction;
                    if (function1 != null) {
                        function1.invoke(true);
                    }
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdOpened() {
                    String str;
                    str = AdaptiveBannerAd.this.TAG;
                    Log.d(str, "onAdOpened: ");
                }
            });
            return;
        }
        if (onShowAdCompletedAction != null) {
            onShowAdCompletedAction.invoke(false);
        }
        adLayout.setVisibility(8);
        containerLayout.setVisibility(8);
        loadingText.setVisibility(8);
    }
}

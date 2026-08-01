package dev.cct.translatorapp.TranslatorAdmobAds.facebookads;

import android.app.Activity;
import android.app.Dialog;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import dev.cct.translatorapp.TranslatorAdmobAds.AdsExtensionKt;
import dev.cct.translatorapp.TranslatorAdmobAds.enums.AdState;
import dev.cct.translatorapp.ads.ConstantParam;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: FacebookInterstitials.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\tJ\u0006\u0010\u001c\u001a\u00020\u0005J(\u0010\u001d\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\b\u0002\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Ldev/cct/translatorapp/TranslatorAdmobAds/facebookads/FacebookInterstitials;", "", "()V", "action", "Lkotlin/Function0;", "", "adState", "Ldev/cct/translatorapp/TranslatorAdmobAds/enums/AdState;", "currentActivityRegisterCheck", "", "interstitialAd", "Lcom/facebook/ads/InterstitialAd;", "lastInterstitialAdId", "getLastInterstitialAdId", "()Ljava/lang/String;", "setLastInterstitialAdId", "(Ljava/lang/String;)V", "loadingDialog", "Landroid/app/Dialog;", "preLoad", "", "requestedForAd", "userWaitingJob", "Lkotlinx/coroutines/Job;", "loadFbInterstitialAd", "activity", "Landroid/app/Activity;", "placementId", "removeFbInterstitialAd", "showFbInterstitialAd", "onShowAdCompletedAction", "onInterstitialFailed", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FacebookInterstitials {
    private Function0<Unit> action;
    private InterstitialAd interstitialAd;
    private Dialog loadingDialog;
    private boolean preLoad;
    private boolean requestedForAd;
    private Job userWaitingJob;
    private AdState adState = AdState.LOAD;
    private String currentActivityRegisterCheck = "";
    private String lastInterstitialAdId = ConstantParam.INSTANCE.getFbInterstitialsAdId();

    public final String getLastInterstitialAdId() {
        return this.lastInterstitialAdId;
    }

    public final void setLastInterstitialAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastInterstitialAdId = str;
    }

    public final void loadFbInterstitialAd(final Activity activity, String placementId) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        if (this.interstitialAd == null) {
            this.interstitialAd = new InterstitialAd(activity, placementId);
            InterstitialAdListener interstitialAdListener = new InterstitialAdListener() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.facebookads.FacebookInterstitials$loadFbInterstitialAd$interstitialAdListener$1
                @Override // com.facebook.ads.InterstitialAdListener
                public void onInterstitialDisplayed(Ad ad) {
                    Intrinsics.checkNotNullParameter(ad, "ad");
                    Log.e("fb", "Interstitial ad displayed.");
                    ConstantParam.INSTANCE.setOTHER_AD_DISPLAYED(true);
                    FacebookInterstitials.this.adState = AdState.SHOWING;
                }

                @Override // com.facebook.ads.InterstitialAdListener
                public void onInterstitialDismissed(Ad ad) {
                    Function0 function0;
                    Intrinsics.checkNotNullParameter(ad, "ad");
                    Log.e("fb", "Interstitial ad dismissed.");
                    ConstantParam.INSTANCE.setInterstitialAdCount(0);
                    FacebookInterstitials.this.removeFbInterstitialAd();
                    ConstantParam.INSTANCE.setLoadedFbInterstitialsAd(false);
                    ConstantParam.INSTANCE.setLoadedAdInters(false);
                    FacebookInterstitials.this.adState = AdState.DISMISSED;
                    ConstantParam.INSTANCE.setOTHER_AD_DISPLAYED(false);
                    function0 = FacebookInterstitials.this.action;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    AdsExtensionKt.loadFbInterstitial(activity, ConstantParam.INSTANCE.getFbInterstitialAdId());
                }

                @Override // com.facebook.ads.AdListener
                public void onError(Ad ad, AdError adError) {
                    Function0 function0;
                    Intrinsics.checkNotNullParameter(adError, "adError");
                    Log.e("fb", "Interstitial ad failed to load: " + adError.getErrorMessage());
                    Log.e("fb", "Interstitial ad failed to load: " + adError.getErrorCode());
                    ConstantParam.INSTANCE.setLoadedAdInters(false);
                    function0 = FacebookInterstitials.this.action;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    FacebookInterstitials.this.removeFbInterstitialAd();
                    ConstantParam.INSTANCE.setLoadedFbInterstitialsAd(false);
                    ConstantParam.INSTANCE.setInterstitialAdCount(0);
                    FacebookInterstitials.this.adState = AdState.FAILED;
                    ConstantParam.INSTANCE.setOTHER_AD_DISPLAYED(false);
                }

                @Override // com.facebook.ads.AdListener
                public void onAdLoaded(Ad ad) {
                    Intrinsics.checkNotNullParameter(ad, "ad");
                    Log.d("fb", "Interstitial ad is loaded and ready to be displayed!");
                    ConstantParam.INSTANCE.setLoadedFbInterstitialsAd(true);
                    ConstantParam.INSTANCE.setLoadedAdInters(true);
                    FacebookInterstitials.this.adState = AdState.LOADED;
                }

                @Override // com.facebook.ads.AdListener
                public void onAdClicked(Ad ad) {
                    Intrinsics.checkNotNullParameter(ad, "ad");
                    Log.d("fb", "Interstitial ad clicked!");
                }

                @Override // com.facebook.ads.AdListener
                public void onLoggingImpression(Ad ad) {
                    Intrinsics.checkNotNullParameter(ad, "ad");
                    Log.d("fb", "Interstitial ad impression logged!");
                }
            };
            InterstitialAd interstitialAd = this.interstitialAd;
            if (interstitialAd != null) {
                interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(interstitialAdListener).build());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showFbInterstitialAd$default(FacebookInterstitials facebookInterstitials, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 2) != 0) {
            function02 = null;
        }
        facebookInterstitials.showFbInterstitialAd(function0, function02);
    }

    public final void showFbInterstitialAd(Function0<Unit> onShowAdCompletedAction, Function0<Unit> onInterstitialFailed) {
        Intrinsics.checkNotNullParameter(onShowAdCompletedAction, "onShowAdCompletedAction");
        Log.d("fb", "showFbInterstitialAd: //" + onShowAdCompletedAction);
        this.action = onShowAdCompletedAction;
        Log.d("fb", "showFbInterstitialAd: " + onShowAdCompletedAction);
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            Object obj = null;
            if (interstitialAd.isAdLoaded()) {
                ConstantParam.INSTANCE.setLoadedFbInterstitialsAd(false);
                InterstitialAd interstitialAd2 = this.interstitialAd;
                if (interstitialAd2 != null) {
                    obj = Boolean.valueOf(interstitialAd2.show());
                }
            } else {
                Log.d("fb", "showFbInterstitialAd: class");
                if (onInterstitialFailed != null) {
                    obj = (Unit) onInterstitialFailed.invoke();
                }
            }
            if (obj != null) {
                return;
            }
        }
        if (onInterstitialFailed != null) {
            onInterstitialFailed.invoke();
        }
    }

    public final void removeFbInterstitialAd() {
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        this.interstitialAd = null;
    }
}

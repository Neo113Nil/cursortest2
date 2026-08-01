package dev.cct.translatorapp.TranslatorAdmobAds;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.util.Log;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.textview.MaterialTextView;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.ads.ConstantParam;
import dev.cct.translatorapp.databinding.LoadDialogBinding;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdsExtension.kt */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001aT\u0010\b\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000e\u001a\u0012\u0010\u0010\u001a\u00020\u0011*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0007\u001a\n\u0010\u0013\u001a\u00020\u0004*\u00020\u0014\u001a\f\u0010\u0015\u001a\u00020\u0004*\u0004\u0018\u00010\u0005\u001a\f\u0010\u0016\u001a\u00020\u0001*\u0004\u0018\u00010\u0017\u001a\n\u0010\u0018\u001a\u00020\u0004*\u00020\u0005\u001a.\u0010\u0019\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00072\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b\u001a\u0012\u0010\u001c\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0007\u001a\u0012\u0010\u001e\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\f\u0010\u001f\u001a\u00020\u0004*\u0004\u0018\u00010\u0005\u001a\f\u0010 \u001a\u00020\u0004*\u0004\u0018\u00010\u0005\u001a\u0014\u0010!\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\u0006\u0010\"\u001a\u00020\u0007\u001a4\u0010#\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\u0006\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u00012\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b\u001a\u0012\u0010'\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a.\u0010(\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010%\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e\u001aJ\u0010)\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\u0006\u0010*\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000e\u001aJ\u0010+\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000e\u001aT\u0010,\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002022\b\b\u0002\u0010\n\u001a\u00020\u00012\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e\u001a\n\u00106\u001a\u00020\u0014*\u000207\u001a\\\u00108\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\u0006\u0010-\u001a\u00020.2\u0006\u00109\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002022\b\b\u0002\u0010\n\u001a\u00020\u00012\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e\u001aP\u0010:\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010;\u001a\u00020\u00012\b\b\u0002\u0010<\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e\u001a\\\u0010>\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002022\b\b\u0002\u0010\n\u001a\u00020\u00012\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e\u001aT\u0010?\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002022\b\b\u0002\u0010\n\u001a\u00020\u00012\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e¨\u0006@"}, d2 = {"canLoadInterstitialAd", "", "canShowInterstitialAd", "checkAndLoadInterstitial", "", "Landroid/app/Activity;", "interstitialAdId", "", "checkAndShowInterstitial", "onlyShowAdMob", "preLoad", "waitingTime", "", "onShowAdCompletedAction", "Lkotlin/Function0;", "onInterstitialFailed", "createLoadingDialog", "Landroid/app/Dialog;", "text", "dismissLoadingDialog", "Landroidx/appcompat/app/AlertDialog;", "interstitialOnPause", "isNetworkAvailable", "Landroid/content/Context;", "loadAdIfNeeded", "loadAppOpen", "appOpenId", "Lkotlin/Function1;", "loadFbInterstitial", "fbIntersId", "loadPreInterstitial", "onPauseAppOpen", "onResumeAppOpen", "preLoadFullNativeAd", "nativeAdId", "preLoadRewardedVideos", "activity", "showLoadingDialog", "onRewardedAdLoaded", "setScreenInterstitialId", "showAppOpen", "showFbInterstitial", "interstitialFbAdId", "showInterstitial", "showLargeNative", "nativeAdLayout", "", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "frameLayout", "Landroid/widget/FrameLayout;", "shimmerFrameLayout", "actionLoaded", "actionFailed", "showLoadingDialogProgress", "Landroidx/appcompat/app/AppCompatActivity;", "showNative", "nativeId", "showRewarded", "dontShowAnyDialog", "showSavingDialog", "onFailedAdAction", "showShowFullNative", "showSmallNative", "Translator_1.0.32_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdsExtensionKt {
    public static /* synthetic */ void loadAppOpen$default(Activity activity, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ConstantParam.INSTANCE.getOnResumeAppOpenId();
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        loadAppOpen(activity, str, function1);
    }

    public static final void loadAppOpen(Activity activity, String appOpenId, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(appOpenId, "appOpenId");
        if (activity != null) {
            if (!ConstantParam.INSTANCE.m204isPurchased()) {
                ConstantParam.INSTANCE.getAppOpen().loadAd(activity, appOpenId, function1);
            } else if (function1 != null) {
                function1.invoke(false);
            }
        }
    }

    public static /* synthetic */ void showAppOpen$default(Activity activity, long j, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        showAppOpen(activity, j, z, function0);
    }

    public static final void showAppOpen(Activity activity, long j, boolean z, Function0<Unit> onShowAdCompletedAction) {
        Unit unit;
        Intrinsics.checkNotNullParameter(onShowAdCompletedAction, "onShowAdCompletedAction");
        if (activity != null) {
            if (!ConstantParam.INSTANCE.m204isPurchased()) {
                Log.e("AppOpen", "Ext showAppOpen " + (!ConstantParam.INSTANCE.getOTHER_AD_DISPLAYED()));
                if (!ConstantParam.INSTANCE.getOTHER_AD_DISPLAYED() && ConstantParam.INSTANCE.getAppIsForeground()) {
                    ConstantParam.INSTANCE.getAppOpen().showAppOpenAd(activity, j, onShowAdCompletedAction, z);
                } else {
                    onShowAdCompletedAction.invoke();
                }
            } else {
                onShowAdCompletedAction.invoke();
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            onShowAdCompletedAction.invoke();
        }
    }

    public static final void onResumeAppOpen(Activity activity) {
        if (activity != null) {
            ConstantParam.INSTANCE.getAppOpen().onResume(activity);
        }
    }

    public static final void onPauseAppOpen(Activity activity) {
        if (activity != null) {
            ConstantParam.INSTANCE.getAppOpen().onPause();
        }
    }

    public static final void checkAndShowInterstitial(Activity activity, boolean z, String interstitialAdId, boolean z2, long j, Function0<Unit> onShowAdCompletedAction, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(interstitialAdId, "interstitialAdId");
        Intrinsics.checkNotNullParameter(onShowAdCompletedAction, "onShowAdCompletedAction");
        Log.d("zh", "checkAndShowInterstitial: " + ConstantParam.INSTANCE.isAppOpenShowed());
        if (ConstantParam.INSTANCE.isAppOpenShowed()) {
            Log.e("ads", "Last ad was App Open");
            ConstantParam.INSTANCE.setAppOpenShowed(false);
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (!z) {
            Log.e("ads", "checkAndShowInterstitial " + ConstantParam.INSTANCE.getInterstitialAdCount());
            if (ConstantParam.INSTANCE.getInterstitialAdCount() == 2) {
                Log.d("zh", "checkAndShowInterstitial: show fb inter");
                showFbInterstitial(activity, interstitialAdId, z2, j, onShowAdCompletedAction, function0);
                return;
            }
            Log.e("ads", "checkAndShowInterstitial showAdmob Interstitial");
            if (ConstantParam.INSTANCE.isFailInterstitialAd()) {
                Log.d("zh", "checkAndShowInterstitial: show fb inter");
                showFbInterstitial(activity, interstitialAdId, z2, j, onShowAdCompletedAction, function0);
                return;
            } else {
                Log.d("zh", "checkAndShowInterstitial: show inter");
                showInterstitial(activity, interstitialAdId, z2, j, onShowAdCompletedAction, function0);
                return;
            }
        }
        showInterstitial(activity, interstitialAdId, z2, j, onShowAdCompletedAction, function0);
    }

    public static /* synthetic */ void showInterstitial$default(Activity activity, String str, boolean z, long j, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            function02 = null;
        }
        showInterstitial(activity, str, z2, j2, function0, function02);
    }

    public static final void showInterstitial(Activity activity, String interstitialAdId, boolean z, long j, Function0<Unit> onShowAdCompletedAction, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(interstitialAdId, "interstitialAdId");
        Intrinsics.checkNotNullParameter(onShowAdCompletedAction, "onShowAdCompletedAction");
        Unit unit = null;
        if (activity != null) {
            Log.e("ad", "showInterstitial/ " + (!ConstantParam.INSTANCE.m204isPurchased()));
            if (!ConstantParam.INSTANCE.m204isPurchased()) {
                Log.e("ad", "showInterstitial/  " + ConstantParam.INSTANCE.getOTHER_AD_DISPLAYED());
                if (!ConstantParam.INSTANCE.getOTHER_AD_DISPLAYED() && ConstantParam.INSTANCE.getAppIsForeground()) {
                    ConstantParam.INSTANCE.setLastAdWasAdmob(true);
                    Log.e("ad", "showInterstitial/ " + ConstantParam.INSTANCE.getInterstitialAdCount() + " interstitial.showInterstitial} " + ConstantParam.INSTANCE.isLastAdWasAdmob());
                    Log.e("ad", "showInterstitial/  " + ConstantParam.INSTANCE.isFailInterstitialAd());
                    ConstantParam.INSTANCE.getInterstitial().showInterstitial(activity, interstitialAdId, z, j, onShowAdCompletedAction, function0);
                    unit = Unit.INSTANCE;
                } else {
                    ConstantParam.INSTANCE.setLastAdWasAdmob(false);
                    MobileAds.initialize(activity.getApplication(), new OnInitializationCompleteListener() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.AdsExtensionKt$$ExternalSyntheticLambda0
                        @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                        public final void onInitializationComplete(InitializationStatus initializationStatus) {
                            AdsExtensionKt.showInterstitial$lambda$6$lambda$5(initializationStatus);
                        }
                    });
                    if (function0 != null) {
                        unit = function0.invoke();
                    }
                }
            } else {
                ConstantParam.INSTANCE.setLastAdWasAdmob(true);
                onShowAdCompletedAction.invoke();
                unit = Unit.INSTANCE;
            }
        }
        if (unit == null) {
            ConstantParam.INSTANCE.setLastAdWasAdmob(true);
            onShowAdCompletedAction.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showInterstitial$lambda$6$lambda$5(InitializationStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ConstantParam.INSTANCE.setADS_INITIALIZATION_COMPLETED(true);
    }

    public static final void interstitialOnPause(Activity activity) {
        ConstantParam.INSTANCE.getInterstitial().onPause();
    }

    public static final void checkAndLoadInterstitial(Activity activity, String interstitialAdId) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(interstitialAdId, "interstitialAdId");
        if (ConstantParam.INSTANCE.m204isPurchased() || !ConstantParam.INSTANCE.isInterstitialOnOrOff()) {
            return;
        }
        if (ConstantParam.INSTANCE.getInterstitialAdCount() == 2) {
            ConstantParam.INSTANCE.getFbInterstitial().loadFbInterstitialAd(activity, ConstantParam.INSTANCE.getFbInterstitialsAdId());
            return;
        }
        Log.d("zh", "checkAndLoadInterstitial: " + ConstantParam.INSTANCE.isFailInterstitialAd());
        ConstantParam.INSTANCE.getInterstitial().loadInterstitial(activity, interstitialAdId);
    }

    public static final void loadPreInterstitial(Activity activity, String interstitialAdId) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(interstitialAdId, "interstitialAdId");
        if (ConstantParam.INSTANCE.m204isPurchased()) {
            return;
        }
        ConstantParam.INSTANCE.getInterstitial().loadInterstitial(activity, interstitialAdId);
    }

    public static final void loadFbInterstitial(Activity activity, String fbIntersId) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(fbIntersId, "fbIntersId");
        if (ConstantParam.INSTANCE.m204isPurchased()) {
            return;
        }
        ConstantParam.INSTANCE.getFbInterstitial().loadFbInterstitialAd(activity, fbIntersId);
    }

    public static /* synthetic */ void showFbInterstitial$default(Activity activity, String str, boolean z, long j, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            function02 = null;
        }
        showFbInterstitial(activity, str, z2, j2, function0, function02);
    }

    public static final void showFbInterstitial(Activity activity, String interstitialFbAdId, boolean z, long j, Function0<Unit> onShowAdCompletedAction, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(interstitialFbAdId, "interstitialFbAdId");
        Intrinsics.checkNotNullParameter(onShowAdCompletedAction, "onShowAdCompletedAction");
        if (activity != null) {
            if (!ConstantParam.INSTANCE.m204isPurchased()) {
                Log.e("fb_interstitial", "showing  " + (true ^ ConstantParam.INSTANCE.getOTHER_AD_DISPLAYED()));
                Log.d("fb_interstitial", "showFbInterstitial: showing");
                if (!ConstantParam.INSTANCE.getOTHER_AD_DISPLAYED() && ConstantParam.INSTANCE.getAppIsForeground()) {
                    ConstantParam.INSTANCE.getFbInterstitial().showFbInterstitialAd(onShowAdCompletedAction, function0);
                } else {
                    ConstantParam.INSTANCE.setLastAdWasAdmob(false);
                    MobileAds.initialize(activity.getApplication(), new OnInitializationCompleteListener() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.AdsExtensionKt$$ExternalSyntheticLambda2
                        @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                        public final void onInitializationComplete(InitializationStatus initializationStatus) {
                            AdsExtensionKt.showFbInterstitial$lambda$9$lambda$8(initializationStatus);
                        }
                    });
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                Log.d("fb_interstitial", "showFbInterstitial: show");
                return;
            }
            Log.d("fb_interstitial", "showFbInterstitial: purchase");
            ConstantParam.INSTANCE.setLastAdWasAdmob(true);
            onShowAdCompletedAction.invoke();
            return;
        }
        Log.d("fb_interstitial", "showFbInterstitial: run");
        ConstantParam.INSTANCE.setLastAdWasAdmob(true);
        onShowAdCompletedAction.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFbInterstitial$lambda$9$lambda$8(InitializationStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ConstantParam.INSTANCE.setADS_INITIALIZATION_COMPLETED(true);
    }

    public static final void setScreenInterstitialId(Activity activity, String interstitialAdId) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(interstitialAdId, "interstitialAdId");
        ConstantParam.INSTANCE.getInterstitial().setLastInterstitialAdId(interstitialAdId);
    }

    public static final void showShowFullNative(Activity activity, String nativeAdId, int i, ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout shimmerFrameLayout, boolean z, Function0<Unit> actionLoaded, Function0<Unit> actionFailed) {
        Unit unit;
        Intrinsics.checkNotNullParameter(nativeAdId, "nativeAdId");
        Intrinsics.checkNotNullParameter(frameLayout, "frameLayout");
        Intrinsics.checkNotNullParameter(shimmerFrameLayout, "shimmerFrameLayout");
        Intrinsics.checkNotNullParameter(actionLoaded, "actionLoaded");
        Intrinsics.checkNotNullParameter(actionFailed, "actionFailed");
        if (activity != null) {
            if (!ConstantParam.INSTANCE.m204isPurchased() && isNetworkAvailable(activity)) {
                ConstantParam.INSTANCE.getShowFullNative().showPreLoadNative(nativeAdId, activity, i, constraintLayout, frameLayout, shimmerFrameLayout, actionLoaded, actionFailed);
            } else {
                if (constraintLayout != null) {
                    ExtensionFunctionKt.hide(constraintLayout);
                }
                ExtensionFunctionKt.hide(frameLayout);
                ExtensionFunctionKt.hide(shimmerFrameLayout);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            if (constraintLayout != null) {
                ExtensionFunctionKt.hide(constraintLayout);
            }
            ExtensionFunctionKt.hide(frameLayout);
            ExtensionFunctionKt.hide(shimmerFrameLayout);
        }
    }

    public static final void preLoadFullNativeAd(Activity activity, String nativeAdId) {
        Intrinsics.checkNotNullParameter(nativeAdId, "nativeAdId");
        if (activity == null || ConstantParam.INSTANCE.m204isPurchased() || !isNetworkAvailable(activity)) {
            return;
        }
        Log.e("Aqeel", "Pre load exit Native");
        NativeFullScreen.preLoadNative$default(ConstantParam.INSTANCE.getShowFullNative(), activity, nativeAdId, null, null, 12, null);
    }

    public static final void loadAdIfNeeded(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        boolean canLoadInterstitialAd = canLoadInterstitialAd();
        Log.e("InterstitialNew", "canLoadInterstitialAd State: " + canLoadInterstitialAd);
        if (ConstantParam.INSTANCE.m204isPurchased() || !canLoadInterstitialAd) {
            return;
        }
        Log.e("InterstitialNew", "Load interstial: loadAdIfNeeded ");
        ConstantParam.INSTANCE.getInterstitial().loadInterstitial(activity, "");
    }

    public static final boolean canLoadInterstitialAd() {
        Log.e("InterstitialNew", "canLoadInterstitialAd count is : " + ConstantParam.INSTANCE.getClickCount());
        return (ConstantParam.INSTANCE.getClickCount() + 1) % 3 == 0;
    }

    public static final void showNative(Activity activity, int i, String nativeId, ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout shimmerFrameLayout, boolean z, Function0<Unit> actionLoaded, Function0<Unit> actionFailed) {
        Unit unit;
        Intrinsics.checkNotNullParameter(nativeId, "nativeId");
        Intrinsics.checkNotNullParameter(frameLayout, "frameLayout");
        Intrinsics.checkNotNullParameter(shimmerFrameLayout, "shimmerFrameLayout");
        Intrinsics.checkNotNullParameter(actionLoaded, "actionLoaded");
        Intrinsics.checkNotNullParameter(actionFailed, "actionFailed");
        if (activity != null) {
            if (!ConstantParam.INSTANCE.m204isPurchased() && isNetworkAvailable(activity)) {
                if (ConstantParam.INSTANCE.getADS_INITIALIZATION_COMPLETED()) {
                    ConstantParam.INSTANCE.getNative().showNative(activity, i, nativeId, constraintLayout, frameLayout, shimmerFrameLayout, actionLoaded, actionFailed);
                    if (z) {
                        Native.preLoadNative$default(ConstantParam.INSTANCE.getNative(), activity, null, null, 6, null);
                    }
                } else {
                    MobileAds.initialize(activity.getApplication(), new OnInitializationCompleteListener() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.AdsExtensionKt$$ExternalSyntheticLambda4
                        @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                        public final void onInitializationComplete(InitializationStatus initializationStatus) {
                            AdsExtensionKt.showNative$lambda$16$lambda$15(initializationStatus);
                        }
                    });
                    if (constraintLayout != null) {
                        ExtensionFunctionKt.hide(constraintLayout);
                    }
                    ExtensionFunctionKt.hide(frameLayout);
                    ExtensionFunctionKt.hide(shimmerFrameLayout);
                }
            } else {
                if (constraintLayout != null) {
                    ExtensionFunctionKt.hide(constraintLayout);
                }
                ExtensionFunctionKt.hide(frameLayout);
                ExtensionFunctionKt.hide(shimmerFrameLayout);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            if (constraintLayout != null) {
                ExtensionFunctionKt.hide(constraintLayout);
            }
            ExtensionFunctionKt.hide(frameLayout);
            ExtensionFunctionKt.hide(shimmerFrameLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showNative$lambda$16$lambda$15(InitializationStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ConstantParam.INSTANCE.setADS_INITIALIZATION_COMPLETED(true);
    }

    public static final void showSmallNative(Activity activity, int i, ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout shimmerFrameLayout, boolean z, Function0<Unit> actionLoaded, Function0<Unit> actionFailed) {
        Unit unit;
        Intrinsics.checkNotNullParameter(frameLayout, "frameLayout");
        Intrinsics.checkNotNullParameter(shimmerFrameLayout, "shimmerFrameLayout");
        Intrinsics.checkNotNullParameter(actionLoaded, "actionLoaded");
        Intrinsics.checkNotNullParameter(actionFailed, "actionFailed");
        if (activity != null) {
            if (!ConstantParam.INSTANCE.m204isPurchased() && isNetworkAvailable(activity)) {
                if (ConstantParam.INSTANCE.getADS_INITIALIZATION_COMPLETED()) {
                    ConstantParam.INSTANCE.getSmallNative().showNative(activity, i, constraintLayout, frameLayout, shimmerFrameLayout, actionLoaded, actionFailed);
                    if (z) {
                        NativeSmall.preLoadNative$default(ConstantParam.INSTANCE.getSmallNative(), activity, null, null, 6, null);
                    }
                } else {
                    MobileAds.initialize(activity.getApplication(), new OnInitializationCompleteListener() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.AdsExtensionKt$$ExternalSyntheticLambda3
                        @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                        public final void onInitializationComplete(InitializationStatus initializationStatus) {
                            AdsExtensionKt.showSmallNative$lambda$19$lambda$18(initializationStatus);
                        }
                    });
                    if (constraintLayout != null) {
                        ExtensionFunctionKt.hide(constraintLayout);
                    }
                    ExtensionFunctionKt.hide(frameLayout);
                    ExtensionFunctionKt.hide(shimmerFrameLayout);
                }
            } else {
                if (constraintLayout != null) {
                    ExtensionFunctionKt.hide(constraintLayout);
                }
                ExtensionFunctionKt.hide(frameLayout);
                ExtensionFunctionKt.hide(shimmerFrameLayout);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            if (constraintLayout != null) {
                ExtensionFunctionKt.hide(constraintLayout);
            }
            ExtensionFunctionKt.hide(frameLayout);
            ExtensionFunctionKt.hide(shimmerFrameLayout);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSmallNative$lambda$19$lambda$18(InitializationStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ConstantParam.INSTANCE.setADS_INITIALIZATION_COMPLETED(true);
    }

    public static final void showLargeNative(Activity activity, int i, ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout shimmerFrameLayout, boolean z, Function0<Unit> actionLoaded, Function0<Unit> actionFailed) {
        Unit unit;
        Intrinsics.checkNotNullParameter(frameLayout, "frameLayout");
        Intrinsics.checkNotNullParameter(shimmerFrameLayout, "shimmerFrameLayout");
        Intrinsics.checkNotNullParameter(actionLoaded, "actionLoaded");
        Intrinsics.checkNotNullParameter(actionFailed, "actionFailed");
        if (activity != null) {
            if (!ConstantParam.INSTANCE.m204isPurchased() && isNetworkAvailable(activity)) {
                ConstantParam.INSTANCE.getLargeNative().showNative(activity, i, constraintLayout, frameLayout, shimmerFrameLayout, actionLoaded, actionFailed);
                if (z) {
                    NativeSmall.preLoadNative$default(ConstantParam.INSTANCE.getSmallNative(), activity, null, null, 6, null);
                }
            } else {
                if (constraintLayout != null) {
                    ExtensionFunctionKt.hide(constraintLayout);
                }
                ExtensionFunctionKt.hide(frameLayout);
                ExtensionFunctionKt.hide(shimmerFrameLayout);
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            if (constraintLayout != null) {
                ExtensionFunctionKt.hide(constraintLayout);
            }
            ExtensionFunctionKt.hide(frameLayout);
            ExtensionFunctionKt.hide(shimmerFrameLayout);
        }
    }

    public static final boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(activeNetwork, "cm?.activeNetwork ?: return false");
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(networkCapabilities, "cm.getNetworkCapabilitie…bilities) ?: return false");
        if (!networkCapabilities.hasTransport(4) && !networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0)) {
            networkCapabilities.hasTransport(3);
        }
        return true;
    }

    public static final boolean canShowInterstitialAd() {
        if (!ConstantParam.INSTANCE.isAppOpenShowed()) {
            return true;
        }
        ConstantParam.INSTANCE.setAppOpenShowed(false);
        return false;
    }

    public static final Dialog createLoadingDialog(Activity activity, String text) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        LoadDialogBinding inflate = LoadDialogBinding.inflate(dialog.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        dialog.setContentView(inflate.getRoot());
        ((MaterialTextView) dialog.findViewById(R.id.loadingTextView)).setText(text);
        return dialog;
    }

    public static final void showRewarded(Activity activity, boolean z, long j, boolean z2, boolean z3, Function0<Unit> onShowAdCompletedAction, Function0<Unit> onFailedAdAction) {
        Unit unit;
        Intrinsics.checkNotNullParameter(onShowAdCompletedAction, "onShowAdCompletedAction");
        Intrinsics.checkNotNullParameter(onFailedAdAction, "onFailedAdAction");
        if (ConstantParam.INSTANCE.m204isPurchased()) {
            onShowAdCompletedAction.invoke();
            return;
        }
        if (activity != null) {
            if (isNetworkAvailable(activity)) {
                if (ConstantParam.INSTANCE.getADS_INITIALIZATION_COMPLETED()) {
                    ConstantParam.INSTANCE.getRewarded().showRewarded(activity, z, j, z3, z2, onShowAdCompletedAction, onFailedAdAction);
                } else {
                    MobileAds.initialize(activity.getApplication(), new OnInitializationCompleteListener() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.AdsExtensionKt$$ExternalSyntheticLambda1
                        @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                        public final void onInitializationComplete(InitializationStatus initializationStatus) {
                            AdsExtensionKt.showRewarded$lambda$26$lambda$25(initializationStatus);
                        }
                    });
                    onFailedAdAction.invoke();
                }
            } else {
                onFailedAdAction.invoke();
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            onFailedAdAction.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRewarded$lambda$26$lambda$25(InitializationStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ConstantParam.INSTANCE.setADS_INITIALIZATION_COMPLETED(true);
    }

    public static /* synthetic */ void preLoadRewardedVideos$default(Activity activity, Activity activity2, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        preLoadRewardedVideos(activity, activity2, z, function1);
    }

    public static final void preLoadRewardedVideos(Activity activity, Activity activity2, boolean z, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(activity2, "activity");
        if (ConstantParam.INSTANCE.m204isPurchased()) {
            if (function1 != null) {
                function1.invoke(true);
            }
        } else if (activity != null) {
            ConstantParam.INSTANCE.getRewarded().loadRewarded(activity2, z, function1);
        } else if (function1 != null) {
            function1.invoke(false);
        }
    }

    public static final AlertDialog showLoadingDialogProgress(AppCompatActivity appCompatActivity) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "<this>");
        AlertDialog.Builder builder = new AlertDialog.Builder(appCompatActivity);
        builder.setView(R.layout.load_dialog);
        AlertDialog create = builder.create();
        Intrinsics.checkNotNullExpressionValue(create, "alertDialog.create()");
        Window window = create.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        create.show();
        create.setCanceledOnTouchOutside(false);
        create.setCancelable(false);
        return create;
    }

    public static final void dismissLoadingDialog(AlertDialog alertDialog) {
        Intrinsics.checkNotNullParameter(alertDialog, "<this>");
        if (alertDialog.isShowing()) {
            alertDialog.dismiss();
        }
    }
}

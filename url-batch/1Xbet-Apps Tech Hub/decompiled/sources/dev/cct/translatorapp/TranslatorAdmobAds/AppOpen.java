package dev.cct.translatorapp.TranslatorAdmobAds;

import android.app.Activity;
import android.app.Dialog;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import dev.cct.translatorapp.TranslatorAdmobAds.enums.AdState;
import dev.cct.translatorapp.ads.ConstantParam;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* compiled from: AppOpen.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0006\u0010\u0018\u001a\u00020\u0014J\u0006\u0010\u0019\u001a\u00020\u0014J0\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001fJ\u001e\u0010 \u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0006\u0010!\u001a\u00020\u0005J\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010#\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J0\u0010$\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010%\u001a\u00020&2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010'\u001a\u00020\u0014R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Ldev/cct/translatorapp/TranslatorAdmobAds/AppOpen;", "", "()V", "action", "Lkotlin/Function0;", "", "adState", "Ldev/cct/translatorapp/TranslatorAdmobAds/enums/AdState;", "appOpenAd", "Lcom/google/android/gms/ads/appopen/AppOpenAd;", "currentActivityRegisterCheck", "", "lastAppOpenId", "getLastAppOpenId", "()Ljava/lang/String;", "setLastAppOpenId", "(Ljava/lang/String;)V", "loadingDialog", "Landroid/app/Dialog;", "requestedForAd", "", "userWaitingJob", "Lkotlinx/coroutines/Job;", "isAdAvailable", "isAppOpenAdAvailable", "isShowingAppOpen", "loadAd", "activity", "Landroid/app/Activity;", "appOpenId", "onShowAdCompletedAction", "Lkotlin/Function1;", "loadAdWithWaiting", "onPause", "onResume", "setAdListeners", "showAppOpenAd", "waitingTime", "", "showLoadingDialog", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppOpen {
    private Function0<Unit> action;
    private AdState adState;
    private AppOpenAd appOpenAd;
    private String currentActivityRegisterCheck = "";
    private String lastAppOpenId = "";
    private Dialog loadingDialog;
    private boolean requestedForAd;
    private Job userWaitingJob;

    public AppOpen() {
        this.adState = AdState.LOAD;
        Log.e("Splash", "init App Open");
        this.adState = AdState.LOAD;
    }

    public final String getLastAppOpenId() {
        return this.lastAppOpenId;
    }

    public final void setLastAppOpenId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastAppOpenId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadAd$default(AppOpen appOpen, Activity activity, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            str = ConstantParam.INSTANCE.getOnResumeAppOpenId();
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        appOpen.loadAd(activity, str, function1);
    }

    public final void loadAd(Activity activity, String appOpenId, final Function1<? super Boolean, Unit> onShowAdCompletedAction) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(appOpenId, "appOpenId");
        Log.e("Splash", "start loadAd");
        this.lastAppOpenId = appOpenId;
        if (isAdAvailable()) {
            Log.e("Splash", "callback from isAdAvailable");
            if (onShowAdCompletedAction != null) {
                onShowAdCompletedAction.invoke(true);
                return;
            }
            return;
        }
        if (AdState.LOADING == this.adState) {
            Log.e("Splash", "callback from AdState.LOADING");
            if (onShowAdCompletedAction != null) {
                onShowAdCompletedAction.invoke(false);
                return;
            }
            return;
        }
        Log.e("AppOpen", "Loading New App Open Ad - " + ConstantParam.INSTANCE.getOnResumeAppOpenId());
        this.adState = AdState.LOADING;
        AdRequest build = new AdRequest.Builder().build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder().build()");
        AppOpenAd.load(activity, appOpenId, build, 1, new AppOpenAd.AppOpenAdLoadCallback() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.AppOpen$loadAd$1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(AppOpenAd ad) {
                Intrinsics.checkNotNullParameter(ad, "ad");
                Log.e("AppOpen", "onAdLoaded");
                Log.e("Splash", "callback from onAdLoaded");
                AppOpen.this.appOpenAd = ad;
                AppOpen.this.adState = AdState.LOADED;
                Function1<Boolean, Unit> function1 = onShowAdCompletedAction;
                if (function1 != null) {
                    function1.invoke(true);
                }
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                Intrinsics.checkNotNullParameter(loadAdError, "loadAdError");
                Log.e("AppOpen", "onAdFailedToLoad");
                Log.e("Splash", "callback from onAdFailedToLoad");
                AppOpen.this.adState = AdState.FAILED;
                Function1<Boolean, Unit> function1 = onShowAdCompletedAction;
                if (function1 != null) {
                    function1.invoke(false);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadAdWithWaiting(final Activity activity, final Function0<Unit> onShowAdCompletedAction) {
        if (AdState.LOADING == this.adState || isAdAvailable()) {
            return;
        }
        this.adState = AdState.LOADING;
        AdRequest build = new AdRequest.Builder().build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder().build()");
        AppOpenAd.load(activity, this.lastAppOpenId, build, 1, new AppOpenAd.AppOpenAdLoadCallback() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.AppOpen$loadAdWithWaiting$1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(AppOpenAd ad) {
                AppOpenAd appOpenAd;
                Intrinsics.checkNotNullParameter(ad, "ad");
                AppOpen.this.appOpenAd = ad;
                AppOpen.this.adState = AdState.LOADED;
                appOpenAd = AppOpen.this.appOpenAd;
                if (appOpenAd != null) {
                    AppOpen appOpen = AppOpen.this;
                    Function0<Unit> function0 = onShowAdCompletedAction;
                    Activity activity2 = activity;
                    appOpen.setAdListeners(function0);
                    appOpenAd.show(activity2);
                }
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                Intrinsics.checkNotNullParameter(loadAdError, "loadAdError");
                AppOpen.this.adState = AdState.FAILED;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAdListeners(final Function0<Unit> onShowAdCompletedAction) {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd != null) {
            appOpenAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.AppOpen$setAdListeners$1$1
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    ConstantParam.INSTANCE.setAppOpenShowed(true);
                    AppOpen.this.appOpenAd = null;
                    AppOpen.this.requestedForAd = false;
                    AppOpen.this.adState = AdState.DISMISSED;
                    ConstantParam.INSTANCE.setOTHER_AD_DISPLAYED(false);
                    onShowAdCompletedAction.invoke();
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdFailedToShowFullScreenContent(AdError adError) {
                    Intrinsics.checkNotNullParameter(adError, "adError");
                    AppOpen.this.adState = AdState.SHOWN_FAILED;
                    ConstantParam.INSTANCE.setOTHER_AD_DISPLAYED(false);
                    AppOpen.this.appOpenAd = null;
                    onShowAdCompletedAction.invoke();
                    ConstantParam.INSTANCE.setAppOpenShowed(false);
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    ConstantParam.INSTANCE.setOTHER_AD_DISPLAYED(true);
                    AppOpen.this.adState = AdState.SHOWING;
                }
            });
        }
    }

    private final boolean isAdAvailable() {
        return this.appOpenAd != null;
    }

    public final boolean isShowingAppOpen() {
        return this.adState == AdState.SHOWING;
    }

    public static /* synthetic */ void showAppOpenAd$default(AppOpen appOpen, Activity activity, long j, Function0 function0, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 6000;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            z = false;
        }
        appOpen.showAppOpenAd(activity, j2, function0, z);
    }

    public final void showAppOpenAd(Activity activity, long waitingTime, Function0<Unit> onShowAdCompletedAction, boolean showLoadingDialog) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onShowAdCompletedAction, "onShowAdCompletedAction");
        this.requestedForAd = true;
        if (this.adState == AdState.SHOWING) {
            Log.e("AppOpen", "showAppOpenAd class " + this.adState);
            return;
        }
        if (ConstantParam.INSTANCE.getOTHER_AD_DISPLAYED()) {
            Log.e(AppOpenKt.LOG_TAG, "The other ad is already showing.");
            return;
        }
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd != null) {
            Log.e("AppOpen", "showAppOpenAd show now " + this.adState);
            setAdListeners(onShowAdCompletedAction);
            appOpenAd.show(activity);
            return;
        }
        try {
            loadAdWithWaiting(activity, onShowAdCompletedAction);
            this.action = onShowAdCompletedAction;
            launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new AppOpen$showAppOpenAd$2$1(waitingTime, this, onShowAdCompletedAction, activity, null), 3, null);
            this.userWaitingJob = launch$default;
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            e.printStackTrace();
            Integer.valueOf(Log.e("AppOpen", "ExceptionIntoDisplay: " + Unit.INSTANCE));
        }
    }

    public final void onResume(Activity activity) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Intrinsics.areEqual(this.currentActivityRegisterCheck, activity.getLocalClassName()) && this.requestedForAd) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new AppOpen$onResume$1(this, activity, null), 3, null);
            this.userWaitingJob = launch$default;
            return;
        }
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        try {
            String localClassName = activity.getLocalClassName();
            Intrinsics.checkNotNullExpressionValue(localClassName, "activity.localClassName");
            this.currentActivityRegisterCheck = localClassName;
            Dialog dialog = this.loadingDialog;
            if (dialog == null || !dialog.isShowing()) {
                return;
            }
            dialog.dismiss();
        } catch (Exception unused) {
        }
    }

    public final void onPause() {
        final Activity ownerActivity;
        Dialog dialog = this.loadingDialog;
        if (dialog != null && (ownerActivity = dialog.getOwnerActivity()) != null) {
            ownerActivity.runOnUiThread(new Runnable() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.AppOpen$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AppOpen.onPause$lambda$6$lambda$5(ownerActivity, this);
                }
            });
        }
        Job job = this.userWaitingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPause$lambda$6$lambda$5(Activity it, AppOpen this$0) {
        Dialog dialog;
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (it.isFinishing() || it.isDestroyed() || (dialog = this$0.loadingDialog) == null || !dialog.isShowing()) {
            return;
        }
        dialog.dismiss();
    }

    public final boolean isAppOpenAdAvailable() {
        return this.appOpenAd != null;
    }
}

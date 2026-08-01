package dev.cct.translatorapp.TranslatorAdmobAds;

import android.app.Activity;
import android.app.Dialog;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
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

/* compiled from: Rewarded.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u000bJ.\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000bH\u0002J\u0006\u0010\u001d\u001a\u00020\u0005J*\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000b2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002JL\u0010 \u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Ldev/cct/translatorapp/TranslatorAdmobAds/Rewarded;", "", "()V", "action", "Lkotlin/Function0;", "", "adState", "Ldev/cct/translatorapp/TranslatorAdmobAds/enums/AdState;", "currentActivityRegisterCheck", "", "isRewardGranted", "", "loadingDialog", "Landroid/app/Dialog;", "mRewardedAd", "Lcom/google/android/gms/ads/rewarded/RewardedAd;", "preLoad", "requestedForAd", "userWaitingJob", "Lkotlinx/coroutines/Job;", "dismissLoadingDialog", "activity", "Landroid/app/Activity;", "isRewardedAdAvailable", "loadRewarded", "showLoadingDialog", "onRewardedAdLoaded", "Lkotlin/Function1;", "loadRewardedWithWaiting", "onPause", "setRewardedAdListeners", "onShowAdCompletedAction", "showRewarded", "waitingTime", "", "showSavingDialog", "dontShowAnyDialog", "onFailedAdAction", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Rewarded {
    private Function0<Unit> action;
    private AdState adState = AdState.LOAD;
    private String currentActivityRegisterCheck = "";
    private boolean isRewardGranted;
    private Dialog loadingDialog;
    private RewardedAd mRewardedAd;
    private boolean preLoad;
    private boolean requestedForAd;
    private Job userWaitingJob;

    public static /* synthetic */ void loadRewarded$default(Rewarded rewarded, Activity activity, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        rewarded.loadRewarded(activity, z, function1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r5 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void loadRewarded(final Activity activity, boolean showLoadingDialog, final Function1<? super Boolean, Unit> onRewardedAdLoaded) {
        Dialog dialog;
        Dialog dialog2;
        Intrinsics.checkNotNullParameter(activity, "activity");
        dismissLoadingDialog(activity);
        if (showLoadingDialog) {
            Dialog dialog3 = this.loadingDialog;
            if (dialog3 != null) {
                if (!dialog3.isShowing()) {
                    dialog2 = AdsExtensionKt.createLoadingDialog(activity, "Processing...!");
                } else {
                    dialog2 = this.loadingDialog;
                }
            }
            this.loadingDialog = AdsExtensionKt.createLoadingDialog(activity, "Processing...!");
            Unit unit = Unit.INSTANCE;
            Dialog dialog4 = this.loadingDialog;
            if (dialog4 != null && !dialog4.isShowing() && (dialog = this.loadingDialog) != null) {
                dialog.show();
            }
        }
        Unit unit2 = null;
        if (this.mRewardedAd != null) {
            dismissLoadingDialog(activity);
            if (onRewardedAdLoaded != null) {
                onRewardedAdLoaded.invoke(true);
                unit2 = Unit.INSTANCE;
            }
        }
        if (unit2 == null) {
            AdRequest build = new AdRequest.Builder().build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder().build()");
            this.adState = AdState.LOADING;
            Log.d("RewardedVideo", "loadRewarded: " + ConstantParam.INSTANCE.getRewardedInterstitials());
            RewardedAd.load(activity, ConstantParam.INSTANCE.getRewardedInterstitials(), build, new RewardedAdLoadCallback() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.Rewarded$loadRewarded$5$1
                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError adError) {
                    Intrinsics.checkNotNullParameter(adError, "adError");
                    Log.d("RewardedVideo", "onAdFailedToLoad: " + adError.getMessage());
                    Rewarded.this.adState = AdState.FAILED;
                    Rewarded.this.mRewardedAd = null;
                    Rewarded.this.dismissLoadingDialog(activity);
                    Function1<Boolean, Unit> function1 = onRewardedAdLoaded;
                    if (function1 != null) {
                        function1.invoke(false);
                    }
                }

                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdLoaded(RewardedAd rewardedAd) {
                    Intrinsics.checkNotNullParameter(rewardedAd, "rewardedAd");
                    Log.d("RewardedVideo", "onAdLoaded:");
                    Rewarded.this.adState = AdState.LOADED;
                    Rewarded.this.mRewardedAd = rewardedAd;
                    Rewarded.this.dismissLoadingDialog(activity);
                    Function1<Boolean, Unit> function1 = onRewardedAdLoaded;
                    if (function1 != null) {
                        function1.invoke(true);
                    }
                }
            });
        }
    }

    public final void dismissLoadingDialog(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Dialog dialog = this.loadingDialog;
        if (dialog == null || !dialog.isShowing() || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        try {
            dialog.dismiss();
        } catch (IllegalArgumentException | Exception unused) {
        } catch (Throwable th) {
            this.loadingDialog = null;
            throw th;
        }
        this.loadingDialog = null;
    }

    private final void loadRewardedWithWaiting(Activity activity, boolean preLoad) {
        if ((this.mRewardedAd != null ? Unit.INSTANCE : null) == null) {
            AdRequest build = new AdRequest.Builder().build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder().build()");
            this.adState = AdState.LOADING;
            RewardedAd.load(activity, ConstantParam.INSTANCE.getRewardedInterstitials(), build, new RewardedAdLoadCallback() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.Rewarded$loadRewardedWithWaiting$2$1
                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError adError) {
                    Intrinsics.checkNotNullParameter(adError, "adError");
                    Log.d("RewardedVideo", "onAdFailedToLoad: " + adError.getMessage());
                    Rewarded.this.adState = AdState.FAILED;
                    Rewarded.this.mRewardedAd = null;
                }

                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdLoaded(RewardedAd rewardedAd) {
                    Intrinsics.checkNotNullParameter(rewardedAd, "rewardedAd");
                    Log.d("RewardedVideo", "onAdLoaded: " + rewardedAd.getRewardItem());
                    Rewarded.this.adState = AdState.LOADED;
                    Rewarded.this.mRewardedAd = rewardedAd;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void setRewardedAdListeners$default(Rewarded rewarded, Activity activity, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        rewarded.setRewardedAdListeners(activity, z, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRewardedAdListeners(Activity activity, boolean preLoad, final Function0<Unit> onShowAdCompletedAction) {
        RewardedAd rewardedAd = this.mRewardedAd;
        if (rewardedAd == null) {
            return;
        }
        rewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.Rewarded$setRewardedAdListeners$1
            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdClicked() {
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdDismissedFullScreenContent() {
                boolean z;
                Rewarded.this.adState = AdState.DISMISSED;
                ConstantParam.INSTANCE.setOTHER_AD_DISPLAYED(false);
                Rewarded.this.requestedForAd = false;
                z = Rewarded.this.isRewardGranted;
                if (z) {
                    Rewarded.this.isRewardGranted = false;
                    Function0<Unit> function0 = onShowAdCompletedAction;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                Rewarded.this.mRewardedAd = null;
                Rewarded.this.currentActivityRegisterCheck = "";
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdFailedToShowFullScreenContent(AdError adError) {
                Intrinsics.checkNotNullParameter(adError, "adError");
                Log.d("RewardedVideo", "LoadFailed: " + adError.getMessage());
                Rewarded.this.adState = AdState.SHOWN_FAILED;
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdImpression() {
                Rewarded.this.adState = AdState.IMPRESSION;
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdShowedFullScreenContent() {
                Rewarded.this.adState = AdState.SHOWING;
                ConstantParam.INSTANCE.setOTHER_AD_DISPLAYED(true);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0072, code lost:
    
        if (r1 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void showRewarded(Activity activity, boolean preLoad, long waitingTime, boolean showSavingDialog, boolean dontShowAnyDialog, Function0<Unit> onShowAdCompletedAction, Function0<Unit> onFailedAdAction) {
        Dialog createLoadingDialog;
        Job launch$default;
        Dialog dialog;
        Dialog dialog2;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onFailedAdAction, "onFailedAdAction");
        try {
            this.preLoad = preLoad;
            this.requestedForAd = true;
            if (this.adState == AdState.SHOWING) {
                return;
            }
            Dialog dialog3 = this.loadingDialog;
            if (dialog3 != null && dialog3.isShowing() && !activity.isFinishing() && !activity.isDestroyed()) {
                try {
                    dialog3.dismiss();
                } catch (IllegalArgumentException | Exception unused) {
                } catch (Throwable th) {
                    this.loadingDialog = null;
                    throw th;
                }
                this.loadingDialog = null;
            }
            RewardedAd rewardedAd = this.mRewardedAd;
            if (rewardedAd != null) {
                setRewardedAdListeners(activity, preLoad, onShowAdCompletedAction);
                rewardedAd.show(activity, new OnUserEarnedRewardListener() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.Rewarded$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                    public final void onUserEarnedReward(RewardItem rewardItem) {
                        Rewarded.showRewarded$lambda$10$lambda$9(Rewarded.this, rewardItem);
                    }
                });
                return;
            }
            Rewarded rewarded = this;
            if (showSavingDialog) {
                createLoadingDialog = AdsExtensionKt.createLoadingDialog(activity, "Saving File");
            } else {
                Dialog dialog4 = this.loadingDialog;
                if (dialog4 != null) {
                    if (!dialog4.isShowing()) {
                        createLoadingDialog = AdsExtensionKt.createLoadingDialog(activity, "Processing...!");
                    } else {
                        createLoadingDialog = this.loadingDialog;
                    }
                }
                createLoadingDialog = AdsExtensionKt.createLoadingDialog(activity, "Processing...!");
            }
            this.loadingDialog = createLoadingDialog;
            if (!dontShowAnyDialog && !activity.isFinishing() && !activity.isDestroyed() && (dialog = this.loadingDialog) != null && !dialog.isShowing() && (dialog2 = this.loadingDialog) != null) {
                dialog2.show();
            }
            loadRewardedWithWaiting(activity, preLoad);
            this.action = onShowAdCompletedAction;
            launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new Rewarded$showRewarded$3$4(waitingTime, this, onFailedAdAction, activity, preLoad, onShowAdCompletedAction, null), 3, null);
            this.userWaitingJob = launch$default;
        } catch (Exception unused2) {
            onFailedAdAction.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRewarded$lambda$10$lambda$9(Rewarded this$0, RewardItem it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.requestedForAd = false;
        this$0.isRewardGranted = true;
    }

    public final boolean isRewardedAdAvailable() {
        return this.mRewardedAd != null;
    }

    public final void onPause() {
        Dialog dialog = this.loadingDialog;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        Job job = this.userWaitingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }
}

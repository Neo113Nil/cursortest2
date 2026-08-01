package dev.cct.translatorapp.TranslatorAdmobAds;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import dev.cct.translatorapp.TranslatorAdmobAds.enums.AdState;
import dev.cct.translatorapp.TranslatorAdmobAds.facebookads.FacebookInterstitials;
import dev.cct.translatorapp.ads.ConstantParam;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* compiled from: Interstitial.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 '2\u00020\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\tJB\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\b\u0002\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004H\u0002J\u0006\u0010!\u001a\u00020\u0005J\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eJB\u0010#\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\b\u0002\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004H\u0002JH\u0010$\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\b\u0002\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Ldev/cct/translatorapp/TranslatorAdmobAds/Interstitial;", "", "()V", "action", "Lkotlin/Function0;", "", "adState", "Ldev/cct/translatorapp/TranslatorAdmobAds/enums/AdState;", "currentActivityRegisterCheck", "", "lastInterstitialAdId", "getLastInterstitialAdId", "()Ljava/lang/String;", "setLastInterstitialAdId", "(Ljava/lang/String;)V", "loadingDialog", "Landroid/app/Dialog;", "mInterstitialAd", "Lcom/google/android/gms/ads/interstitial/InterstitialAd;", "preLoad", "", "requestedForAd", "userWaitingJob", "Lkotlinx/coroutines/Job;", "loadInterstitial", "context", "Landroid/content/Context;", "interstitialAdId", "loadInterstitialWithWaiting", "activity", "Landroid/app/Activity;", "onShowAdCompletedAction", "onInterstitialFailed", "onPause", "onResume", "setInterstitialAdListeners", "showInterstitial", "waitingTime", "", "Companion", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Interstitial {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean discardDone;
    private Function0<Unit> action;
    private AdState adState = AdState.LOAD;
    private String currentActivityRegisterCheck = "";
    private String lastInterstitialAdId = "";
    private Dialog loadingDialog;
    private InterstitialAd mInterstitialAd;
    private boolean preLoad;
    private boolean requestedForAd;
    private Job userWaitingJob;

    public Interstitial() {
        Log.e("InterstitialNew", "Creating interstitial class");
    }

    public final String getLastInterstitialAdId() {
        return this.lastInterstitialAdId;
    }

    public final void setLastInterstitialAdId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastInterstitialAdId = str;
    }

    /* compiled from: Interstitial.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ldev/cct/translatorapp/TranslatorAdmobAds/Interstitial$Companion;", "", "()V", "discardDone", "", "getDiscardDone", "()Z", "setDiscardDone", "(Z)V", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean getDiscardDone() {
            return Interstitial.discardDone;
        }

        public final void setDiscardDone(boolean z) {
            Interstitial.discardDone = z;
        }
    }

    public final void loadInterstitial(final Context context, String interstitialAdId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(interstitialAdId, "interstitialAdId");
        if (interstitialAdId.length() > 0) {
            this.lastInterstitialAdId = interstitialAdId;
        }
        if (this.adState == AdState.LOADING) {
            return;
        }
        if ((this.mInterstitialAd != null ? Unit.INSTANCE : null) == null) {
            Log.e("InterstitialNew", "Loading new Interstitial");
            AdRequest build = new AdRequest.Builder().build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder().build()");
            this.adState = AdState.LOADING;
            InterstitialAd.load(context.getApplicationContext(), this.lastInterstitialAdId, build, new InterstitialAdLoadCallback() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.Interstitial$loadInterstitial$2$1
                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError adError) {
                    Intrinsics.checkNotNullParameter(adError, "adError");
                    Log.e("InterstitialNew", "onAdFailedToLoad");
                    Interstitial.this.adState = AdState.FAILED;
                    Interstitial.this.mInterstitialAd = null;
                    ConstantParam.INSTANCE.setFailInterstitialAd(true);
                    ConstantParam.INSTANCE.setLoadedAdInters(false);
                    FacebookInterstitials fbInterstitial = ConstantParam.INSTANCE.getFbInterstitial();
                    Context context2 = context;
                    Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type android.app.Activity");
                    fbInterstitial.loadFbInterstitialAd((Activity) context2, ConstantParam.INSTANCE.getFbMainInterstitialsAdId());
                }

                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdLoaded(InterstitialAd interstitialAd) {
                    Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
                    Log.e("InterstitialNew", "onAdLoaded");
                    Interstitial.this.adState = AdState.LOADED;
                    Interstitial.this.mInterstitialAd = interstitialAd;
                    ConstantParam.INSTANCE.setFailInterstitialAd(false);
                    ConstantParam.INSTANCE.setLoadedAdInters(true);
                }
            });
        }
    }

    static /* synthetic */ void loadInterstitialWithWaiting$default(Interstitial interstitial, Activity activity, String str, boolean z, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 16) != 0) {
            function02 = null;
        }
        interstitial.loadInterstitialWithWaiting(activity, str, z, function0, function02);
    }

    private final void loadInterstitialWithWaiting(final Activity activity, final String interstitialAdId, final boolean preLoad, final Function0<Unit> onShowAdCompletedAction, final Function0<Unit> onInterstitialFailed) {
        if ((this.mInterstitialAd != null ? Unit.INSTANCE : null) == null) {
            AdRequest build = new AdRequest.Builder().build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder().build()");
            this.adState = AdState.LOADING;
            InterstitialAd.load(activity.getApplicationContext(), interstitialAdId, build, new InterstitialAdLoadCallback() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.Interstitial$loadInterstitialWithWaiting$2$1
                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError adError) {
                    Intrinsics.checkNotNullParameter(adError, "adError");
                    Interstitial.this.adState = AdState.FAILED;
                    Interstitial.this.mInterstitialAd = null;
                }

                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdLoaded(InterstitialAd interstitialAd) {
                    Intrinsics.checkNotNullParameter(interstitialAd, "interstitialAd");
                    Interstitial.this.adState = AdState.LOADED;
                    Interstitial.this.mInterstitialAd = interstitialAd;
                    Interstitial.this.setInterstitialAdListeners(activity, interstitialAdId, preLoad, onShowAdCompletedAction, onInterstitialFailed);
                }
            });
        }
    }

    static /* synthetic */ void setInterstitialAdListeners$default(Interstitial interstitial, Activity activity, String str, boolean z, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 16) != 0) {
            function02 = null;
        }
        interstitial.setInterstitialAdListeners(activity, str, z, function0, function02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInterstitialAdListeners(Activity activity, String interstitialAdId, boolean preLoad, final Function0<Unit> onShowAdCompletedAction, final Function0<Unit> onInterstitialFailed) {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd == null) {
            return;
        }
        interstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.Interstitial$setInterstitialAdListeners$1
            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdClicked() {
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdDismissedFullScreenContent() {
                Interstitial.INSTANCE.setDiscardDone(true);
                Interstitial.this.adState = AdState.DISMISSED;
                Interstitial.this.requestedForAd = false;
                ConstantParam.INSTANCE.setOTHER_AD_DISPLAYED(false);
                ConstantParam.INSTANCE.setInterstitialShowed(true);
                ConstantParam constantParam = ConstantParam.INSTANCE;
                constantParam.setInterstitialAdCount(constantParam.getInterstitialAdCount() + 1);
                onShowAdCompletedAction.invoke();
                Interstitial.this.mInterstitialAd = null;
                ConstantParam.INSTANCE.setLoadedAdInters(false);
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdFailedToShowFullScreenContent(AdError adError) {
                Intrinsics.checkNotNullParameter(adError, "adError");
                Interstitial.this.adState = AdState.SHOWN_FAILED;
                ConstantParam.INSTANCE.setOTHER_AD_DISPLAYED(false);
                Function0<Unit> function0 = onInterstitialFailed;
                if (function0 != null) {
                    function0.invoke();
                }
                ConstantParam.INSTANCE.setLoadedAdInters(false);
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdImpression() {
                Interstitial.this.adState = AdState.IMPRESSION;
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdShowedFullScreenContent() {
                Interstitial.this.adState = AdState.SHOWING;
                ConstantParam.INSTANCE.setOTHER_AD_DISPLAYED(true);
            }
        });
    }

    public final void showInterstitial(Activity activity, String interstitialAdId, boolean preLoad, long waitingTime, Function0<Unit> onShowAdCompletedAction, Function0<Unit> onInterstitialFailed) {
        Job launch$default;
        Dialog dialog;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(interstitialAdId, "interstitialAdId");
        Intrinsics.checkNotNullParameter(onShowAdCompletedAction, "onShowAdCompletedAction");
        Log.e("InterstitialNew", "showInterstitial");
        this.preLoad = preLoad;
        this.lastInterstitialAdId = interstitialAdId;
        this.requestedForAd = true;
        if (this.adState == AdState.SHOWING) {
            return;
        }
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            ConstantParam.INSTANCE.setOTHER_AD_DISPLAYED(true);
            Log.e("InterstitialNew", "showInterstitial called show");
            setInterstitialAdListeners$default(this, activity, interstitialAdId, preLoad, onShowAdCompletedAction, null, 16, null);
            interstitialAd.show(activity);
            return;
        }
        if (preLoad) {
            this.loadingDialog = AdsExtensionKt.createLoadingDialog(activity, "Processing...!");
            if (!activity.isFinishing() && !activity.isDestroyed() && (dialog = this.loadingDialog) != null) {
                dialog.show();
            }
            loadInterstitialWithWaiting$default(this, activity, interstitialAdId, preLoad, onShowAdCompletedAction, null, 16, null);
            this.action = onShowAdCompletedAction;
            launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new Interstitial$showInterstitial$2$1(waitingTime, this, onInterstitialFailed, activity, interstitialAdId, preLoad, onShowAdCompletedAction, null), 3, null);
            this.userWaitingJob = launch$default;
        }
    }

    public final void onResume(Activity activity) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Intrinsics.areEqual(this.currentActivityRegisterCheck, activity.getLocalClassName()) && this.requestedForAd) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new Interstitial$onResume$1(this, activity, null), 3, null);
            this.userWaitingJob = launch$default;
            return;
        }
        String localClassName = activity.getLocalClassName();
        Intrinsics.checkNotNullExpressionValue(localClassName, "activity.localClassName");
        this.currentActivityRegisterCheck = localClassName;
        Dialog dialog = this.loadingDialog;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        dialog.dismiss();
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

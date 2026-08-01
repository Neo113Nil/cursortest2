package dev.cct.translatorapp.TranslatorAdmobAds;

import android.app.Activity;
import android.app.Dialog;
import android.util.Log;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import dev.cct.translatorapp.TranslatorAdmobAds.enums.AdState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: Rewarded.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.TranslatorAdmobAds.Rewarded$showRewarded$3$4", f = "Rewarded.kt", i = {0}, l = {219}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class Rewarded$showRewarded$3$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Function0<Unit> $onFailedAdAction;
    final /* synthetic */ Function0<Unit> $onShowAdCompletedAction;
    final /* synthetic */ boolean $preLoad;
    final /* synthetic */ Rewarded $this_run;
    final /* synthetic */ long $waitingTime;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: Rewarded.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdState.values().length];
            try {
                iArr[AdState.LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdState.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdState.LOADED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdState.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdState.SHOWN_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdState.SHOWING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AdState.DISMISSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AdState.IMPRESSION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AdState.AD_CLICKED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Rewarded$showRewarded$3$4(long j, Rewarded rewarded, Function0<Unit> function0, Activity activity, boolean z, Function0<Unit> function02, Continuation<? super Rewarded$showRewarded$3$4> continuation) {
        super(2, continuation);
        this.$waitingTime = j;
        this.$this_run = rewarded;
        this.$onFailedAdAction = function0;
        this.$activity = activity;
        this.$preLoad = z;
        this.$onShowAdCompletedAction = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Rewarded$showRewarded$3$4 rewarded$showRewarded$3$4 = new Rewarded$showRewarded$3$4(this.$waitingTime, this.$this_run, this.$onFailedAdAction, this.$activity, this.$preLoad, this.$onShowAdCompletedAction, continuation);
        rewarded$showRewarded$3$4.L$0 = obj;
        return rewarded$showRewarded$3$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Rewarded$showRewarded$3$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AdState adState;
        AdState adState2;
        Dialog dialog;
        Dialog dialog2;
        RewardedAd rewardedAd;
        Dialog dialog3;
        Dialog dialog4;
        Dialog dialog5;
        RewardedAd rewardedAd2;
        Dialog dialog6;
        Dialog dialog7;
        Dialog dialog8;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.L$0 = (CoroutineScope) this.L$0;
            this.label = 1;
            if (DelayKt.delay(this.$waitingTime, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        adState = this.$this_run.adState;
        Log.d("RewardedVideo", "showRewarded: adState = " + adState);
        adState2 = this.$this_run.adState;
        Unit unit = null;
        switch (WhenMappings.$EnumSwitchMapping$0[adState2.ordinal()]) {
            case 2:
                Log.e("Rewarded", "LOADING");
                this.$this_run.requestedForAd = false;
                dialog = this.$this_run.loadingDialog;
                if (dialog != null) {
                    Activity activity = this.$activity;
                    Rewarded rewarded = this.$this_run;
                    if (dialog.isShowing() && !activity.isFinishing() && !activity.isDestroyed()) {
                        try {
                            dialog.dismiss();
                        } catch (IllegalArgumentException | Exception unused) {
                        } catch (Throwable th) {
                            rewarded.loadingDialog = null;
                            throw th;
                        }
                        rewarded.loadingDialog = null;
                    }
                }
                this.$onFailedAdAction.invoke();
                break;
            case 3:
                dialog2 = this.$this_run.loadingDialog;
                if (dialog2 != null) {
                    Activity activity2 = this.$activity;
                    if (dialog2.isShowing() && !activity2.isFinishing() && !activity2.isDestroyed()) {
                        dialog2.dismiss();
                    }
                }
                this.$this_run.setRewardedAdListeners(this.$activity, this.$preLoad, this.$onShowAdCompletedAction);
                rewardedAd = this.$this_run.mRewardedAd;
                if (rewardedAd != null) {
                    Activity activity3 = this.$activity;
                    final Rewarded rewarded2 = this.$this_run;
                    rewardedAd.show(activity3, new OnUserEarnedRewardListener() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.Rewarded$showRewarded$3$4$$ExternalSyntheticLambda0
                        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                        public final void onUserEarnedReward(RewardItem rewardItem) {
                            Rewarded$showRewarded$3$4.invokeSuspend$lambda$2(Rewarded.this, rewardItem);
                        }
                    });
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    Rewarded rewarded3 = this.$this_run;
                    Function0<Unit> function0 = this.$onFailedAdAction;
                    Activity activity4 = this.$activity;
                    rewarded3.requestedForAd = false;
                    dialog3 = rewarded3.loadingDialog;
                    if (dialog3 != null && dialog3.isShowing() && !activity4.isFinishing() && !activity4.isDestroyed()) {
                        dialog3.dismiss();
                    }
                    function0.invoke();
                    break;
                }
                break;
            case 4:
                this.$this_run.requestedForAd = true;
                dialog4 = this.$this_run.loadingDialog;
                if (dialog4 != null) {
                    Activity activity5 = this.$activity;
                    if (dialog4.isShowing() && !activity5.isFinishing() && !activity5.isDestroyed()) {
                        dialog4.dismiss();
                    }
                }
                this.$onFailedAdAction.invoke();
                break;
            case 5:
                Log.e("Rewarded", "ShowFailed");
                dialog5 = this.$this_run.loadingDialog;
                if (dialog5 != null) {
                    Activity activity6 = this.$activity;
                    if (dialog5.isShowing() && !activity6.isFinishing() && !activity6.isDestroyed()) {
                        dialog5.dismiss();
                    }
                }
                this.$this_run.setRewardedAdListeners(this.$activity, this.$preLoad, this.$onShowAdCompletedAction);
                rewardedAd2 = this.$this_run.mRewardedAd;
                if (rewardedAd2 != null) {
                    Activity activity7 = this.$activity;
                    final Rewarded rewarded4 = this.$this_run;
                    rewardedAd2.show(activity7, new OnUserEarnedRewardListener() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.Rewarded$showRewarded$3$4$$ExternalSyntheticLambda1
                        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                        public final void onUserEarnedReward(RewardItem rewardItem) {
                            Rewarded$showRewarded$3$4.invokeSuspend$lambda$7(Rewarded.this, rewardItem);
                        }
                    });
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    Rewarded rewarded5 = this.$this_run;
                    Function0<Unit> function02 = this.$onFailedAdAction;
                    Activity activity8 = this.$activity;
                    rewarded5.requestedForAd = false;
                    dialog6 = rewarded5.loadingDialog;
                    if (dialog6 != null && dialog6.isShowing() && !activity8.isFinishing() && !activity8.isDestroyed()) {
                        dialog6.dismiss();
                    }
                    function02.invoke();
                    break;
                }
                break;
            case 6:
                dialog7 = this.$this_run.loadingDialog;
                if (dialog7 != null) {
                    Activity activity9 = this.$activity;
                    if (dialog7.isShowing() && !activity9.isFinishing() && !activity9.isDestroyed()) {
                        dialog7.dismiss();
                        break;
                    }
                }
                break;
            case 7:
                dialog8 = this.$this_run.loadingDialog;
                if (dialog8 != null) {
                    Activity activity10 = this.$activity;
                    if (dialog8.isShowing() && !activity10.isFinishing() && !activity10.isDestroyed()) {
                        dialog8.dismiss();
                    }
                }
                this.$this_run.requestedForAd = false;
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(Rewarded rewarded, RewardItem rewardItem) {
        rewarded.requestedForAd = false;
        rewarded.isRewardGranted = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$7(Rewarded rewarded, RewardItem rewardItem) {
        rewarded.requestedForAd = false;
        rewarded.isRewardGranted = true;
    }
}

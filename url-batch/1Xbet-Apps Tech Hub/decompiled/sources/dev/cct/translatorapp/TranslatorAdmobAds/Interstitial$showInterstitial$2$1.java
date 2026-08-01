package dev.cct.translatorapp.TranslatorAdmobAds;

import android.app.Activity;
import android.app.Dialog;
import com.google.android.gms.ads.interstitial.InterstitialAd;
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

/* compiled from: Interstitial.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.TranslatorAdmobAds.Interstitial$showInterstitial$2$1", f = "Interstitial.kt", i = {0}, l = {211}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class Interstitial$showInterstitial$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ String $interstitialAdId;
    final /* synthetic */ Function0<Unit> $onInterstitialFailed;
    final /* synthetic */ Function0<Unit> $onShowAdCompletedAction;
    final /* synthetic */ boolean $preLoad;
    final /* synthetic */ Interstitial $this_run;
    final /* synthetic */ long $waitingTime;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: Interstitial.kt */
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
    Interstitial$showInterstitial$2$1(long j, Interstitial interstitial, Function0<Unit> function0, Activity activity, String str, boolean z, Function0<Unit> function02, Continuation<? super Interstitial$showInterstitial$2$1> continuation) {
        super(2, continuation);
        this.$waitingTime = j;
        this.$this_run = interstitial;
        this.$onInterstitialFailed = function0;
        this.$activity = activity;
        this.$interstitialAdId = str;
        this.$preLoad = z;
        this.$onShowAdCompletedAction = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Interstitial$showInterstitial$2$1 interstitial$showInterstitial$2$1 = new Interstitial$showInterstitial$2$1(this.$waitingTime, this.$this_run, this.$onInterstitialFailed, this.$activity, this.$interstitialAdId, this.$preLoad, this.$onShowAdCompletedAction, continuation);
        interstitial$showInterstitial$2$1.L$0 = obj;
        return interstitial$showInterstitial$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Interstitial$showInterstitial$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Dialog dialog;
        AdState adState;
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
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
        dialog = this.$this_run.loadingDialog;
        if (dialog != null) {
            Activity activity = this.$activity;
            if (!activity.isFinishing() && !activity.isDestroyed() && dialog.isShowing()) {
                dialog.dismiss();
            }
        }
        adState = this.$this_run.adState;
        int i2 = WhenMappings.$EnumSwitchMapping$0[adState.ordinal()];
        if (i2 != 2) {
            Unit unit = null;
            if (i2 == 3) {
                Interstitial.setInterstitialAdListeners$default(this.$this_run, this.$activity, this.$interstitialAdId, this.$preLoad, this.$onShowAdCompletedAction, null, 16, null);
                interstitialAd = this.$this_run.mInterstitialAd;
                if (interstitialAd != null) {
                    interstitialAd.show(this.$activity);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    this.$onShowAdCompletedAction.invoke();
                }
            } else if (i2 == 4) {
                Function0<Unit> function0 = this.$onInterstitialFailed;
                if (function0 != null) {
                    function0.invoke();
                }
            } else if (i2 == 5) {
                Interstitial.setInterstitialAdListeners$default(this.$this_run, this.$activity, this.$interstitialAdId, this.$preLoad, this.$onShowAdCompletedAction, null, 16, null);
                interstitialAd2 = this.$this_run.mInterstitialAd;
                if (interstitialAd2 != null) {
                    interstitialAd2.show(this.$activity);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    this.$onShowAdCompletedAction.invoke();
                }
            } else if (i2 == 7) {
                this.$this_run.requestedForAd = false;
            }
        } else {
            Function0<Unit> function02 = this.$onInterstitialFailed;
            if (function02 != null) {
                function02.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}

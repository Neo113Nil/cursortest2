package dev.cct.translatorapp.TranslatorAdmobAds;

import android.app.Activity;
import com.google.android.gms.ads.appopen.AppOpenAd;
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

/* compiled from: AppOpen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "dev.cct.translatorapp.TranslatorAdmobAds.AppOpen$onResume$1", f = "AppOpen.kt", i = {}, l = {214}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class AppOpen$onResume$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    int label;
    final /* synthetic */ AppOpen this$0;

    /* compiled from: AppOpen.kt */
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
    AppOpen$onResume$1(AppOpen appOpen, Activity activity, Continuation<? super AppOpen$onResume$1> continuation) {
        super(2, continuation);
        this.this$0 = appOpen;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppOpen$onResume$1(this.this$0, this.$activity, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppOpen$onResume$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r6 = r5.this$0.action;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AdState adState;
        Function0 function0;
        Function0 function02;
        Function0 function03;
        AppOpenAd appOpenAd;
        Function0 function04;
        Function0 function05;
        AppOpenAd appOpenAd2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        adState = this.this$0.adState;
        int i2 = WhenMappings.$EnumSwitchMapping$0[adState.ordinal()];
        if (i2 == 1) {
            function0 = this.this$0.action;
            if (function0 != null) {
                this.this$0.loadAdWithWaiting(this.$activity, function0);
            }
        } else if (i2 == 2) {
            function02 = this.this$0.action;
            if (function02 != null) {
                function02.invoke();
            }
        } else if (i2 == 3) {
            function03 = this.this$0.action;
            if (function03 != null) {
                AppOpen appOpen = this.this$0;
                Activity activity = this.$activity;
                appOpen.setAdListeners(function03);
                appOpenAd = appOpen.appOpenAd;
                if (appOpenAd != null) {
                    appOpenAd.show(activity);
                }
            }
        } else if (i2 == 4) {
            function04 = this.this$0.action;
            if (function04 != null) {
                function04.invoke();
            }
        } else if (i2 == 5 && function05 != null) {
            AppOpen appOpen2 = this.this$0;
            Activity activity2 = this.$activity;
            appOpen2.setAdListeners(function05);
            appOpenAd2 = appOpen2.appOpenAd;
            if (appOpenAd2 != null) {
                appOpenAd2.show(activity2);
            }
        }
        return Unit.INSTANCE;
    }
}

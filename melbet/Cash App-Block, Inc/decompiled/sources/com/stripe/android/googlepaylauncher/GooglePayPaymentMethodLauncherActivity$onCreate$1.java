package com.stripe.android.googlepaylauncher;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class GooglePayPaymentMethodLauncherActivity$onCreate$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ GooglePayPaymentMethodLauncherActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GooglePayPaymentMethodLauncherActivity$onCreate$1(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = googlePayPaymentMethodLauncherActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = this.this$0;
        switch (i) {
            case 0:
                return new GooglePayPaymentMethodLauncherActivity$onCreate$1(googlePayPaymentMethodLauncherActivity, continuation, 0);
            default:
                return new GooglePayPaymentMethodLauncherActivity$onCreate$1(googlePayPaymentMethodLauncherActivity, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
            case 0:
                ((GooglePayPaymentMethodLauncherActivity$onCreate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            default:
                return ((GooglePayPaymentMethodLauncherActivity$onCreate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    int i3 = GooglePayPaymentMethodLauncherActivity.$r8$clinit;
                    ReadonlyStateFlow readonlyStateFlow = googlePayPaymentMethodLauncherActivity.getViewModel().googlePayResult;
                    ExoPlayerVideoView.AnonymousClass2.AnonymousClass1 anonymousClass1 = new ExoPlayerVideoView.AnonymousClass2.AnonymousClass1(googlePayPaymentMethodLauncherActivity, 17);
                    this.label = 1;
                    if (readonlyStateFlow.$$delegate_0.collect(anonymousClass1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 != 0) {
                    if (i4 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                int i5 = GooglePayPaymentMethodLauncherActivity.$r8$clinit;
                GooglePayPaymentMethodLauncherViewModel viewModel = googlePayPaymentMethodLauncherActivity.getViewModel();
                this.label = 1;
                Object loadPaymentData = viewModel.loadPaymentData(this);
                return loadPaymentData == coroutineSingletons2 ? coroutineSingletons2 : loadPaymentData;
        }
    }
}

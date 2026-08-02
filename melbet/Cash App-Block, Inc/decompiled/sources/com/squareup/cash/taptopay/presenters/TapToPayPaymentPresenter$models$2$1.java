package com.squareup.cash.taptopay.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.taptopay.FlowType;
import com.squareup.cash.cdf.taptopay.ScreenID;
import com.squareup.cash.taptopay.backend.api.TapToPayPaymentData;
import com.squareup.cash.taptopay.backend.real.RealTapToPayAnalyticsHelper;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class TapToPayPaymentPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TapToPayPaymentData $sessionData;
    public int label;
    public final /* synthetic */ CardLockPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TapToPayPaymentPresenter$models$2$1(CardLockPresenter cardLockPresenter, TapToPayPaymentData tapToPayPaymentData, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cardLockPresenter;
        this.$sessionData = tapToPayPaymentData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        TapToPayPaymentData tapToPayPaymentData = this.$sessionData;
        CardLockPresenter cardLockPresenter = this.this$0;
        switch (i) {
            case 0:
                return new TapToPayPaymentPresenter$models$2$1(cardLockPresenter, tapToPayPaymentData, continuation, 0);
            default:
                return new TapToPayPaymentPresenter$models$2$1(cardLockPresenter, tapToPayPaymentData, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((TapToPayPaymentPresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        TapToPayPaymentData tapToPayPaymentData = this.$sessionData;
        CardLockPresenter cardLockPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper = (RealTapToPayAnalyticsHelper) cardLockPresenter.franklinAppService;
                    String str = tapToPayPaymentData.customerToken;
                    FlowType flowType = FlowType.PAYMENT;
                    ScreenID screenID = ScreenID.AndroidReadCardScreen;
                    String str2 = tapToPayPaymentData.idempotencyToken;
                    this.label = 1;
                    if (realTapToPayAnalyticsHelper.submitViewEvent(str, str2, flowType, screenID, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper2 = (RealTapToPayAnalyticsHelper) cardLockPresenter.franklinAppService;
                    String str3 = tapToPayPaymentData.customerToken;
                    FlowType flowType2 = FlowType.ONBOARDING;
                    ScreenID screenID2 = ScreenID.AndroidReadCardScreen;
                    String str4 = tapToPayPaymentData.idempotencyToken;
                    this.label = 1;
                    if (RealTapToPayAnalyticsHelper.submitSelectEvent$default(realTapToPayAnalyticsHelper2, str3, str4, screenID2, "Cancel", null, this, 32) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}

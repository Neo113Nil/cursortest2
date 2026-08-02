package com.squareup.cash.taptopay.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.taptopay.FlowType;
import com.squareup.cash.cdf.taptopay.ScreenID;
import com.squareup.cash.taptopay.backend.api.TapToPayPaymentData;
import com.squareup.cash.taptopay.backend.real.RealTapToPayAnalyticsHelper;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class TapToPayInitiatorNotesPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TapToPayPaymentData $sessionData;
    public int label;
    public final /* synthetic */ WorkHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TapToPayInitiatorNotesPresenter$models$1$1(WorkHomePresenter workHomePresenter, TapToPayPaymentData tapToPayPaymentData, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = workHomePresenter;
        this.$sessionData = tapToPayPaymentData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        TapToPayPaymentData tapToPayPaymentData = this.$sessionData;
        WorkHomePresenter workHomePresenter = this.this$0;
        switch (i) {
            case 0:
                return new TapToPayInitiatorNotesPresenter$models$1$1(workHomePresenter, tapToPayPaymentData, continuation, 0);
            default:
                return new TapToPayInitiatorNotesPresenter$models$1$1(workHomePresenter, tapToPayPaymentData, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((TapToPayInitiatorNotesPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        int i = this.$r8$classId;
        TapToPayPaymentData tapToPayPaymentData = this.$sessionData;
        WorkHomePresenter workHomePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper = (RealTapToPayAnalyticsHelper) workHomePresenter.shiftsAnalytics;
                    String str2 = tapToPayPaymentData != null ? tapToPayPaymentData.customerToken : null;
                    FlowType flowType = FlowType.PAYMENT;
                    ScreenID screenID = ScreenID.PurchaseDescriptionScreen;
                    str = tapToPayPaymentData != null ? tapToPayPaymentData.idempotencyToken : null;
                    this.label = 1;
                    if (realTapToPayAnalyticsHelper.submitViewEvent(str2, str, flowType, screenID, this) == coroutineSingletons) {
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
                    RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper2 = (RealTapToPayAnalyticsHelper) workHomePresenter.shiftsAnalytics;
                    String str3 = tapToPayPaymentData != null ? tapToPayPaymentData.customerToken : null;
                    FlowType flowType2 = FlowType.ONBOARDING;
                    ScreenID screenID2 = ScreenID.PurchaseDescriptionScreen;
                    str = tapToPayPaymentData != null ? tapToPayPaymentData.idempotencyToken : null;
                    this.label = 1;
                    if (RealTapToPayAnalyticsHelper.submitSelectEvent$default(realTapToPayAnalyticsHelper2, str3, str, screenID2, null, "Next", this, 16) == coroutineSingletons2) {
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

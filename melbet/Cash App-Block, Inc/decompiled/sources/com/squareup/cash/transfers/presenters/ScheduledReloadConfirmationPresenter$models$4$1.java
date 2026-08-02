package com.squareup.cash.transfers.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ScheduledReloadConfirmationPresenter$models$4$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Money $submitAmount;
    public final /* synthetic */ Integer $submitDayOfPeriod;
    public final /* synthetic */ RecurringSchedule.Frequency $submitFrequency;
    public final /* synthetic */ MutableState $submitting$delegate;
    public int label;
    public final /* synthetic */ ScheduledReloadConfirmationPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledReloadConfirmationPresenter$models$4$1(ScheduledReloadConfirmationPresenter scheduledReloadConfirmationPresenter, RecurringSchedule.Frequency frequency, Integer num, Money money, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scheduledReloadConfirmationPresenter;
        this.$submitFrequency = frequency;
        this.$submitDayOfPeriod = num;
        this.$submitAmount = money;
        this.$submitting$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScheduledReloadConfirmationPresenter$models$4$1(this.this$0, this.$submitFrequency, this.$submitDayOfPeriod, this.$submitAmount, this.$submitting$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ScheduledReloadConfirmationPresenter$models$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            this.label = 1;
            obj = ScheduledReloadConfirmationPresenter.access$submitPreference(this.this$0, this.$submitFrequency, this.$submitDayOfPeriod, this.$submitAmount, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            Money money = ScheduledReloadConfirmationPresenter.PLACEHOLDER_AMOUNT;
            this.$submitting$delegate.setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}

package com.squareup.cash.transfers.presenters;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationQuestion;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationScreen;
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
public final class ScheduledReloadConfirmationPresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Money $amount;
    public final /* synthetic */ RecurringReloadConfigurationScreen.ScheduledStartAt $autoLaunchStartAt;
    public final /* synthetic */ Integer $dayOfPeriod;
    public final /* synthetic */ RecurringSchedule.Frequency $frequency;
    public final /* synthetic */ MutableState $hasAutoLaunched$delegate;
    public final /* synthetic */ ScheduledReloadConfirmationPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledReloadConfirmationPresenter$models$3$1(ScheduledReloadConfirmationPresenter scheduledReloadConfirmationPresenter, RecurringSchedule.Frequency frequency, Integer num, Money money, RecurringReloadConfigurationScreen.ScheduledStartAt scheduledStartAt, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scheduledReloadConfirmationPresenter;
        this.$frequency = frequency;
        this.$dayOfPeriod = num;
        this.$amount = money;
        this.$autoLaunchStartAt = scheduledStartAt;
        this.$hasAutoLaunched$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScheduledReloadConfirmationPresenter$models$3$1(this.this$0, this.$frequency, this.$dayOfPeriod, this.$amount, this.$autoLaunchStartAt, this.$hasAutoLaunched$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ScheduledReloadConfirmationPresenter$models$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        Money money = ScheduledReloadConfirmationPresenter.PLACEHOLDER_AMOUNT;
        this.$hasAutoLaunched$delegate.setValue(Boolean.TRUE);
        this.this$0.navigator.askQuestion(RecurringReloadConfigurationQuestion.INSTANCE, new OpenSourceKt$$ExternalSyntheticLambda9(this.$frequency, this.$dayOfPeriod, this.$amount, this.$autoLaunchStartAt, 7));
        return Unit.INSTANCE;
    }
}

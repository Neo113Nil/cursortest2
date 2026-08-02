package com.squareup.cash.transfers.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.transfers.screens.ScheduledReloadConfirmationScreen;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SetScheduledTransactionPreferenceRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ScheduledReloadConfirmationPresenter$submitPreference$result$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ SetScheduledTransactionPreferenceRequest $request;
    public int label;
    public final /* synthetic */ ScheduledReloadConfirmationPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledReloadConfirmationPresenter$submitPreference$result$1(ScheduledReloadConfirmationPresenter scheduledReloadConfirmationPresenter, SetScheduledTransactionPreferenceRequest setScheduledTransactionPreferenceRequest, Continuation continuation) {
        super(1, continuation);
        this.this$0 = scheduledReloadConfirmationPresenter;
        this.$request = setScheduledTransactionPreferenceRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScheduledReloadConfirmationPresenter$submitPreference$result$1(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ScheduledReloadConfirmationPresenter$submitPreference$result$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScheduledReloadConfirmationPresenter scheduledReloadConfirmationPresenter = this.this$0;
        ScheduledReloadConfirmationScreen scheduledReloadConfirmationScreen = scheduledReloadConfirmationPresenter.args;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        AppService appService = scheduledReloadConfirmationPresenter.appService;
        ClientScenario clientScenario = scheduledReloadConfirmationScreen.blockersData.clientScenario;
        clientScenario.getClass();
        String str = scheduledReloadConfirmationScreen.blockersData.flowToken;
        this.label = 1;
        Object scheduledTransactionPreference = appService.setScheduledTransactionPreference(clientScenario, str, this.$request, this);
        return scheduledTransactionPreference == coroutineSingletons ? coroutineSingletons : scheduledTransactionPreference;
    }
}

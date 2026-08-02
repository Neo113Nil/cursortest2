package com.squareup.cash.transfers.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.payments.presenters.PersonalizePaymentPresenter;
import com.squareup.cash.support.chat.presenters.ChatPresenter$models$$inlined$CollectEffect$1;
import com.squareup.cash.support.chat.presenters.ChatPresenter$models$lambda$43$$inlined$map$1;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.protos.common.CurrencyCode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class WithdrawPresenter$models$$inlined$CollectEffect$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $currency$inlined;
    public final /* synthetic */ MutableState $currentAmount$delegate$inlined;
    public final /* synthetic */ MutableState $depositPreferenceOption$delegate$inlined;
    public final /* synthetic */ Flow $flow;
    public final /* synthetic */ MutableState $initialChangeAmount$delegate$inlined;
    public final /* synthetic */ MutableState $inputMode$delegate$inlined;
    public final /* synthetic */ State $instrument$delegate$inlined;
    public final /* synthetic */ State $instrumentCapabilities$delegate$inlined;
    public final /* synthetic */ State $instruments$delegate$inlined;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object $selectedDepositPreferenceOption$inlined;
    public final /* synthetic */ MutableState $signalsContext$delegate$inlined;
    public final /* synthetic */ MutableState $submitting$delegate$inlined;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ MoleculePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawPresenter$models$$inlined$CollectEffect$1(Flow flow, Continuation continuation, PersonalizePaymentPresenter personalizePaymentPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11) {
        super(2, continuation);
        this.$flow = flow;
        this.this$0 = personalizePaymentPresenter;
        this.$currentAmount$delegate$inlined = mutableState;
        this.$depositPreferenceOption$delegate$inlined = mutableState2;
        this.$initialChangeAmount$delegate$inlined = mutableState3;
        this.$inputMode$delegate$inlined = mutableState4;
        this.$signalsContext$delegate$inlined = mutableState5;
        this.$submitting$delegate$inlined = mutableState6;
        this.$selectedDepositPreferenceOption$inlined = mutableState7;
        this.$currency$inlined = mutableState8;
        this.$instrument$delegate$inlined = mutableState9;
        this.$instrumentCapabilities$delegate$inlined = mutableState10;
        this.$instruments$delegate$inlined = mutableState11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$currency$inlined;
        Object obj3 = this.$selectedDepositPreferenceOption$inlined;
        MoleculePresenter moleculePresenter = this.this$0;
        switch (i) {
            case 0:
                CurrencyCode currencyCode = (CurrencyCode) obj2;
                State state = this.$instruments$delegate$inlined;
                MutableState mutableState = this.$submitting$delegate$inlined;
                WithdrawPresenter$models$$inlined$CollectEffect$1 withdrawPresenter$models$$inlined$CollectEffect$1 = new WithdrawPresenter$models$$inlined$CollectEffect$1(this.$flow, continuation, (WithdrawPresenter) moleculePresenter, (WithdrawViewModel.DepositPreferenceOption) obj3, currencyCode, this.$instrument$delegate$inlined, this.$currentAmount$delegate$inlined, this.$depositPreferenceOption$delegate$inlined, this.$instrumentCapabilities$delegate$inlined, this.$initialChangeAmount$delegate$inlined, this.$inputMode$delegate$inlined, this.$signalsContext$delegate$inlined, state, mutableState);
                withdrawPresenter$models$$inlined$CollectEffect$1.L$0 = obj;
                return withdrawPresenter$models$$inlined$CollectEffect$1;
            default:
                MutableState mutableState2 = (MutableState) this.$instrument$delegate$inlined;
                MutableState mutableState3 = (MutableState) this.$instrumentCapabilities$delegate$inlined;
                MutableState mutableState4 = (MutableState) this.$instruments$delegate$inlined;
                WithdrawPresenter$models$$inlined$CollectEffect$1 withdrawPresenter$models$$inlined$CollectEffect$12 = new WithdrawPresenter$models$$inlined$CollectEffect$1(this.$flow, continuation, (PersonalizePaymentPresenter) moleculePresenter, this.$currentAmount$delegate$inlined, this.$depositPreferenceOption$delegate$inlined, this.$initialChangeAmount$delegate$inlined, this.$inputMode$delegate$inlined, this.$signalsContext$delegate$inlined, this.$submitting$delegate$inlined, (MutableState) obj3, (MutableState) obj2, mutableState2, mutableState3, mutableState4);
                withdrawPresenter$models$$inlined$CollectEffect$12.L$0 = obj;
                return withdrawPresenter$models$$inlined$CollectEffect$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((WithdrawPresenter$models$$inlined$CollectEffect$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$currency$inlined;
        Object obj3 = this.$selectedDepositPreferenceOption$inlined;
        MoleculePresenter moleculePresenter = this.this$0;
        Flow flow = this.$flow;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChatPresenter$models$lambda$43$$inlined$map$1.AnonymousClass2 anonymousClass2 = new ChatPresenter$models$lambda$43$$inlined$map$1.AnonymousClass2(coroutineScope, (WithdrawPresenter) moleculePresenter, (WithdrawViewModel.DepositPreferenceOption) obj3, (CurrencyCode) obj2, this.$instrument$delegate$inlined, this.$currentAmount$delegate$inlined, this.$depositPreferenceOption$delegate$inlined, this.$instrumentCapabilities$delegate$inlined, this.$initialChangeAmount$delegate$inlined, this.$inputMode$delegate$inlined, this.$signalsContext$delegate$inlined, this.$instruments$delegate$inlined, this.$submitting$delegate$inlined);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(anonymousClass2, this) == coroutineSingletons) {
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
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChatPresenter$models$$inlined$CollectEffect$1.AnonymousClass1 anonymousClass1 = new ChatPresenter$models$$inlined$CollectEffect$1.AnonymousClass1(coroutineScope2, (PersonalizePaymentPresenter) moleculePresenter, this.$currentAmount$delegate$inlined, this.$depositPreferenceOption$delegate$inlined, this.$initialChangeAmount$delegate$inlined, this.$inputMode$delegate$inlined, this.$signalsContext$delegate$inlined, this.$submitting$delegate$inlined, (MutableState) obj3, (MutableState) obj2, (MutableState) this.$instrument$delegate$inlined, (MutableState) this.$instrumentCapabilities$delegate$inlined, (MutableState) this.$instruments$delegate$inlined);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(anonymousClass1, this) == coroutineSingletons2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawPresenter$models$$inlined$CollectEffect$1(Flow flow, Continuation continuation, WithdrawPresenter withdrawPresenter, WithdrawViewModel.DepositPreferenceOption depositPreferenceOption, CurrencyCode currencyCode, State state, MutableState mutableState, MutableState mutableState2, State state2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, State state3, MutableState mutableState6) {
        super(2, continuation);
        this.$flow = flow;
        this.this$0 = withdrawPresenter;
        this.$selectedDepositPreferenceOption$inlined = depositPreferenceOption;
        this.$currency$inlined = currencyCode;
        this.$instrument$delegate$inlined = state;
        this.$currentAmount$delegate$inlined = mutableState;
        this.$depositPreferenceOption$delegate$inlined = mutableState2;
        this.$instrumentCapabilities$delegate$inlined = state2;
        this.$initialChangeAmount$delegate$inlined = mutableState3;
        this.$inputMode$delegate$inlined = mutableState4;
        this.$signalsContext$delegate$inlined = mutableState5;
        this.$instruments$delegate$inlined = state3;
        this.$submitting$delegate$inlined = mutableState6;
    }
}

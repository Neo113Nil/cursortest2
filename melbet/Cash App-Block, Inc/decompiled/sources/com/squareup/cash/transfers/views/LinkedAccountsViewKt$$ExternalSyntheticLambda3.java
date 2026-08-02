package com.squareup.cash.transfers.views;

import com.squareup.cash.transfers.viewmodels.AddMoneyViewEvent;
import com.squareup.cash.transfers.viewmodels.InstrumentLinkingOptionsViewEvent;
import com.squareup.cash.transfers.viewmodels.InstrumentNotLinkedViewEvent;
import com.squareup.cash.transfers.viewmodels.LinkedAccountsNuxViewEvent;
import com.squareup.cash.transfers.viewmodels.LinkedAccountsViewEvent;
import com.squareup.cash.transfers.viewmodels.PendingTransfersConfirmationViewEvent;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewEvent;
import com.squareup.cash.transfers.viewmodels.RecurringReloadOptionViewEvent;
import com.squareup.cash.transfers.viewmodels.WithdrawViewEvent;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class LinkedAccountsViewKt$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ LinkedAccountsViewKt$$ExternalSyntheticLambda3(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        InstrumentLinkingOptionsViewEvent.Close close = InstrumentLinkingOptionsViewEvent.Close.INSTANCE;
        InstrumentNotLinkedViewEvent.CloseClick closeClick = InstrumentNotLinkedViewEvent.CloseClick.INSTANCE;
        RecurringReloadConfigurationViewEvent.ScheduledAmountSubmit scheduledAmountSubmit = RecurringReloadConfigurationViewEvent.ScheduledAmountSubmit.INSTANCE;
        RecurringReloadConfigurationViewEvent.MinBalanceContinue minBalanceContinue = RecurringReloadConfigurationViewEvent.MinBalanceContinue.INSTANCE;
        RecurringReloadConfigurationViewEvent.ReloadAmountSubmit reloadAmountSubmit = RecurringReloadConfigurationViewEvent.ReloadAmountSubmit.INSTANCE;
        RecurringReloadConfigurationViewEvent.Peeking peeking = RecurringReloadConfigurationViewEvent.Peeking.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(LinkedAccountsViewEvent.ExitFlow.INSTANCE);
                break;
            case 1:
                function1.invoke(close);
                break;
            case 2:
                function1.invoke(close);
                break;
            case 3:
                function1.invoke(InstrumentNotLinkedViewEvent.ContinueClick.INSTANCE);
                break;
            case 4:
                function1.invoke(closeClick);
                break;
            case 5:
                function1.invoke(closeClick);
                break;
            case 6:
                function1.invoke(InstrumentNotLinkedViewEvent.BackClick.INSTANCE);
                break;
            case 7:
                function1.invoke(LinkedAccountsNuxViewEvent.CloseClick.INSTANCE);
                break;
            case 8:
                function1.invoke(LinkedAccountsNuxViewEvent.CtaClick.INSTANCE);
                break;
            case 9:
                function1.invoke(new LinkedAccountsViewEvent.Link(EmptyList.INSTANCE));
                break;
            case 10:
                function1.invoke(AddMoneyViewEvent.CloseClick.INSTANCE);
                break;
            case 11:
                function1.invoke(AddMoneyViewEvent.InstrumentPickerDoneClick.INSTANCE);
                break;
            case 12:
                function1.invoke(WithdrawViewEvent.CtaClick.INSTANCE);
                break;
            case 13:
                int i2 = PendingTransfersConfirmationDialogView.$r8$clinit;
                function1.invoke(PendingTransfersConfirmationViewEvent.OnBack.INSTANCE);
                break;
            case 14:
                int i3 = PendingTransfersConfirmationDialogView.$r8$clinit;
                function1.invoke(PendingTransfersConfirmationViewEvent.PositiveButtonClick.INSTANCE);
                break;
            case 15:
                int i4 = PendingTransfersConfirmationDialogView.$r8$clinit;
                function1.invoke(PendingTransfersConfirmationViewEvent.NegativeButtonClick.INSTANCE);
                break;
            case 16:
                function1.invoke(scheduledAmountSubmit);
                break;
            case 17:
                function1.invoke(scheduledAmountSubmit);
                break;
            case 18:
                function1.invoke(peeking);
                break;
            case 19:
                function1.invoke(minBalanceContinue);
                break;
            case 20:
                function1.invoke(minBalanceContinue);
                break;
            case 21:
                function1.invoke(peeking);
                break;
            case 22:
                function1.invoke(reloadAmountSubmit);
                break;
            case 23:
                function1.invoke(reloadAmountSubmit);
                break;
            case 24:
                function1.invoke(RecurringReloadConfigurationViewEvent.Close.INSTANCE);
                break;
            case 25:
                function1.invoke(peeking);
                break;
            case 26:
                function1.invoke(RecurringReloadConfigurationViewEvent.Expanded.INSTANCE);
                break;
            case 27:
                function1.invoke(peeking);
                break;
            case 28:
                function1.invoke(RecurringReloadConfigurationViewEvent.Back.INSTANCE);
                break;
            default:
                function1.invoke(RecurringReloadOptionViewEvent.FromClick.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}

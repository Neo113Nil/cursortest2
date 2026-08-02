package com.squareup.cash.wallet.views;

import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewEvent;
import com.squareup.cash.transfers.viewmodels.RecurringReloadOptionViewEvent;
import com.squareup.cash.transfers.viewmodels.RecurringReloadsChangeInstrumentViewEvent;
import com.squareup.cash.transfers.viewmodels.RecurringReloadsDismissDialogViewEvent;
import com.squareup.cash.transfers.viewmodels.ScheduledReloadConfirmationViewEvent;
import com.squareup.cash.transfers.viewmodels.WithdrawViewEvent;
import com.squareup.cash.wallet.presenters.CardLockViewEvent;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class HeroCardViewKt$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ HeroCardViewKt$$ExternalSyntheticLambda5(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        RecurringReloadsChangeInstrumentViewEvent.CloseClick closeClick = RecurringReloadsChangeInstrumentViewEvent.CloseClick.INSTANCE;
        WithdrawViewEvent.CloseClick closeClick2 = WithdrawViewEvent.CloseClick.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(WalletHomeViewEvent.PrepurchaseToggleTapped.INSTANCE);
                break;
            case 1:
                function1.invoke(RecurringReloadOptionViewEvent.BackClick.INSTANCE);
                break;
            case 2:
                function1.invoke(RecurringReloadOptionViewEvent.ToggleClick.INSTANCE);
                break;
            case 3:
                function1.invoke(RecurringReloadOptionViewEvent.MinimumBalanceClick.INSTANCE);
                break;
            case 4:
                function1.invoke(RecurringReloadOptionViewEvent.IncrementAmountClick.INSTANCE);
                break;
            case 5:
                function1.invoke(RecurringReloadOptionViewEvent.FrequencyClick.INSTANCE);
                break;
            case 6:
                function1.invoke(RecurringReloadOptionViewEvent.FrequencyDayClick.INSTANCE);
                break;
            case 7:
                function1.invoke(RecurringReloadOptionViewEvent.AmountClick.INSTANCE);
                break;
            case 8:
                function1.invoke(closeClick);
                break;
            case 9:
                function1.invoke(closeClick);
                break;
            case 10:
                function1.invoke(RecurringReloadsChangeInstrumentViewEvent.GoToLinkedBanksClicked.INSTANCE);
                break;
            case 11:
                function1.invoke(RecurringReloadsDismissDialogViewEvent.OnBack.INSTANCE);
                break;
            case 12:
                function1.invoke(RecurringReloadsDismissDialogViewEvent.ConfirmClick.INSTANCE);
                break;
            case 13:
                function1.invoke(RecurringReloadsDismissDialogViewEvent.CancelClick.INSTANCE);
                break;
            case 14:
                function1.invoke(ScheduledReloadConfirmationViewEvent.InstrumentCellTapped.INSTANCE);
                break;
            case 15:
                function1.invoke(ScheduledReloadConfirmationViewEvent.ConfirmClicked.INSTANCE);
                break;
            case 16:
                function1.invoke(ScheduledReloadConfirmationViewEvent.Close.INSTANCE);
                break;
            case 17:
                function1.invoke(ScheduledReloadConfirmationViewEvent.FrequencyClicked.INSTANCE);
                break;
            case 18:
                function1.invoke(ScheduledReloadConfirmationViewEvent.DayClicked.INSTANCE);
                break;
            case 19:
                function1.invoke(ScheduledReloadConfirmationViewEvent.AmountClicked.INSTANCE);
                break;
            case 20:
                function1.invoke(closeClick2);
                break;
            case 21:
                function1.invoke(closeClick2);
                break;
            case 22:
                function1.invoke(WithdrawViewEvent.Expanded.INSTANCE);
                break;
            case 23:
                function1.invoke(WithdrawViewEvent.Peeking.INSTANCE);
                break;
            case 24:
                function1.invoke(WithdrawViewEvent.ChangeInstrumentClick.INSTANCE);
                break;
            case 25:
                function1.invoke(WithdrawViewEvent.CtaClick.INSTANCE);
                break;
            case 26:
                function1.invoke(RecurringReloadConfigurationViewEvent.DayContinue.INSTANCE);
                break;
            case 27:
                function1.invoke(RecurringReloadConfigurationViewEvent.FrequencyContinue.INSTANCE);
                break;
            case 28:
                function1.invoke(CardLockViewEvent.Dismiss.INSTANCE);
                break;
            default:
                function1.invoke(new Exception("sceneCache error"));
                break;
        }
        return Unit.INSTANCE;
    }
}

package com.squareup.cash.tax.views;

import com.squareup.cash.taptopay.viewmodels.TapToPayErrorViewEvent$Close;
import com.squareup.cash.taptopay.viewmodels.TapToPayPaymentViewEvent$Close;
import com.squareup.cash.tax.viewmodels.TaxReturnsEvent;
import com.squareup.cash.tax.viewmodels.TaxTooltipEvent$TooltipDismissed;
import com.squareup.cash.transactionpicker.viewmodels.TransactionPickerViewEvent;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewEvent;
import com.squareup.cash.transfers.viewmodels.BalanceBasedAddCashDisabledDialogViewEvent;
import com.squareup.cash.transfers.viewmodels.BalanceBasedAutoReloadConfirmationViewEvent;
import com.squareup.cash.transfers.viewmodels.InstrumentDetailsViewEvent;
import com.squareup.cash.transfers.views.BalanceBasedAddCashDisabledDialogView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class TaxReturnsView$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ TaxReturnsView$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        TapToPayPaymentViewEvent$Close tapToPayPaymentViewEvent$Close = TapToPayPaymentViewEvent$Close.INSTANCE;
        TaxReturnsEvent.GoBack goBack = TaxReturnsEvent.GoBack.INSTANCE;
        AddMoneyViewEvent.CloseClick closeClick = AddMoneyViewEvent.CloseClick.INSTANCE;
        InstrumentDetailsViewEvent.SetDefault setDefault = InstrumentDetailsViewEvent.SetDefault.INSTANCE;
        InstrumentDetailsViewEvent.Remove remove = InstrumentDetailsViewEvent.Remove.INSTANCE;
        InstrumentDetailsViewEvent.Replace replace = InstrumentDetailsViewEvent.Replace.INSTANCE;
        InstrumentDetailsViewEvent.Cancel cancel = InstrumentDetailsViewEvent.Cancel.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                int i2 = TaxReturnsView.$r8$clinit;
                function1.invoke(goBack);
                break;
            case 1:
                function1.invoke(TapToPayErrorViewEvent$Close.INSTANCE);
                break;
            case 2:
                function1.invoke(tapToPayPaymentViewEvent$Close);
                break;
            case 3:
                function1.invoke(tapToPayPaymentViewEvent$Close);
                break;
            case 4:
                function1.invoke(goBack);
                break;
            case 5:
                function1.invoke(TaxTooltipEvent$TooltipDismissed.INSTANCE);
                break;
            case 6:
                function1.invoke(TransactionPickerViewEvent.ExitFlow.INSTANCE);
                break;
            case 7:
                function1.invoke(closeClick);
                break;
            case 8:
                function1.invoke(closeClick);
                break;
            case 9:
                function1.invoke(AddMoneyViewEvent.Expanded.INSTANCE);
                break;
            case 10:
                function1.invoke(AddMoneyViewEvent.Peeking.INSTANCE);
                break;
            case 11:
                function1.invoke(AddMoneyViewEvent.PayWithGooglePayClick.INSTANCE);
                break;
            case 12:
                function1.invoke(AddMoneyViewEvent.RecurringCashInToggleClick.INSTANCE);
                break;
            case 13:
                int i3 = BalanceBasedAddCashDisabledDialogView.$r8$clinit;
                function1.invoke(BalanceBasedAddCashDisabledDialogViewEvent.OnBack.INSTANCE);
                break;
            case 14:
                function1.invoke(BalanceBasedAddCashDisabledDialogViewEvent.PositiveButtonClick.INSTANCE);
                break;
            case 15:
                function1.invoke(BalanceBasedAddCashDisabledDialogViewEvent.NegativeButtonClick.INSTANCE);
                break;
            case 16:
                function1.invoke(BalanceBasedAutoReloadConfirmationViewEvent.Close.INSTANCE);
                break;
            case 17:
                function1.invoke(BalanceBasedAutoReloadConfirmationViewEvent.MinimumBalanceClicked.INSTANCE);
                break;
            case 18:
                function1.invoke(BalanceBasedAutoReloadConfirmationViewEvent.IncrementAmountClicked.INSTANCE);
                break;
            case 19:
                function1.invoke(BalanceBasedAutoReloadConfirmationViewEvent.InstrumentCellTapped.INSTANCE);
                break;
            case 20:
                function1.invoke(BalanceBasedAutoReloadConfirmationViewEvent.ConfirmClicked.INSTANCE);
                break;
            case 21:
                function1.invoke(setDefault);
                break;
            case 22:
                function1.invoke(remove);
                break;
            case 23:
                function1.invoke(replace);
                break;
            case 24:
                function1.invoke(setDefault);
                break;
            case 25:
                function1.invoke(remove);
                break;
            case 26:
                function1.invoke(replace);
                break;
            case 27:
                function1.invoke(cancel);
                break;
            case 28:
                function1.invoke(cancel);
                break;
            default:
                function1.invoke(cancel);
                break;
        }
        return Unit.INSTANCE;
    }
}

package com.squareup.cash.work.views.pay;

import com.squareup.cash.wallet.viewmodels.PresentationTimelineViewEvent;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewEvent;
import com.squareup.cash.work.viewmodels.ClockInBottomSheetViewEvent;
import com.squareup.cash.work.viewmodels.DeclareCashTipBottomSheetViewEvent;
import com.squareup.cash.work.viewmodels.MerchantPickerViewEvent;
import com.squareup.cash.work.viewmodels.PayHistoryListViewEvent;
import com.squareup.cash.work.viewmodels.PayHomeViewEvent;
import com.squareup.cash.work.viewmodels.ShiftDetailViewEvent;
import com.squareup.cash.work.viewmodels.ShiftNotStartedDialogViewEvent$Dismiss;
import com.squareup.cash.work.viewmodels.TakeBreakBottomSheetViewEvent;
import com.squareup.cash.work.viewmodels.TaxFormDownloaderViewEvent$CancelClicked;
import com.squareup.cash.work.viewmodels.TaxFormsListViewEvent;
import com.squareup.cash.work.viewmodels.WorkHomeViewEvent;
import com.squareup.cash.work.viewmodels.WorkHomeViewEvent$PayCellViewEvent$DetailsClicked;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class PayHomeViewKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ PayHomeViewKt$$ExternalSyntheticLambda2(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        TakeBreakBottomSheetViewEvent.Dismiss dismiss = TakeBreakBottomSheetViewEvent.Dismiss.INSTANCE;
        ShiftDetailViewEvent.BackClicked backClicked = ShiftDetailViewEvent.BackClicked.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(PayHomeViewEvent.BackPressed.INSTANCE);
                break;
            case 1:
                function1.invoke(PresentationTimelineViewEvent.Dismiss.INSTANCE);
                break;
            case 2:
                function1.invoke(WalletHomeViewEvent.PrepurchaseToggleTapped.INSTANCE);
                break;
            case 3:
                function1.invoke(WalletHomeViewEvent.CopyCard.INSTANCE);
                break;
            case 4:
                function1.invoke(MerchantPickerViewEvent.DismissClicked.INSTANCE);
                break;
            case 5:
                function1.invoke(MerchantPickerViewEvent.UpdateClicked.INSTANCE);
                break;
            case 6:
                function1.invoke(WorkHomeViewEvent.TitleBarViewEvent.GoBack.INSTANCE);
                break;
            case 7:
                function1.invoke(WorkHomeViewEvent.TitleBarViewEvent.ShowShiftList.INSTANCE);
                break;
            case 8:
                function1.invoke(WorkHomeViewEvent.TitleBarViewEvent.ShowMerchantPicker.INSTANCE);
                break;
            case 9:
                function1.invoke(ClockInBottomSheetViewEvent.LocationPermissionLinkClicked.INSTANCE);
                break;
            case 10:
                function1.invoke(ClockInBottomSheetViewEvent.OpenAppSettingsClicked.INSTANCE);
                break;
            case 11:
                function1.invoke(ClockInBottomSheetViewEvent.Dismiss.INSTANCE);
                break;
            case 12:
                function1.invoke(DeclareCashTipBottomSheetViewEvent.Dismiss.INSTANCE);
                break;
            case 13:
                function1.invoke(ShiftNotStartedDialogViewEvent$Dismiss.INSTANCE);
                break;
            case 14:
                function1.invoke(dismiss);
                break;
            case 15:
                function1.invoke(dismiss);
                break;
            case 16:
                function1.invoke(PayHistoryListViewEvent.BackPressed.INSTANCE);
                break;
            case 17:
                function1.invoke(PayHistoryListViewEvent.RetryClicked.INSTANCE);
                break;
            case 18:
                function1.invoke(PayHomeViewEvent.LinkedAccountsClicked.INSTANCE);
                break;
            case 19:
                function1.invoke(PayHomeViewEvent.DirectDepositClicked.INSTANCE);
                break;
            case 20:
                function1.invoke(PayHomeViewEvent.RetryClicked.INSTANCE);
                break;
            case 21:
                function1.invoke(PayHomeViewEvent.SeeMoreClicked.INSTANCE);
                break;
            case 22:
                function1.invoke(WorkHomeViewEvent$PayCellViewEvent$DetailsClicked.INSTANCE);
                break;
            case 23:
                function1.invoke(TaxFormDownloaderViewEvent$CancelClicked.INSTANCE);
                break;
            case 24:
                function1.invoke(TaxFormsListViewEvent.BackPressed.INSTANCE);
                break;
            case 25:
                function1.invoke(TaxFormsListViewEvent.RetryClicked.INSTANCE);
                break;
            case 26:
                function1.invoke(ShiftDetailViewEvent.ClockInClicked.INSTANCE);
                break;
            case 27:
                function1.invoke(backClicked);
                break;
            case 28:
                function1.invoke(backClicked);
                break;
            default:
                function1.invoke(ShiftDetailViewEvent.OverflowMenuClicked.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}

package com.squareup.util.android;

import android.view.View;
import android.view.ViewGroup;
import app.cash.broadway.ui.compose.DialogListenerEvent;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewEvent;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.transfers.viewmodels.SetDefaultInstrumentViewEvent$CloseClick;
import com.squareup.cash.transfers.viewmodels.WithdrawViewEvent;
import com.squareup.cash.ui.widget.amount.AmountEvent;
import com.squareup.cash.upsell.viewmodels.NullStateCarouselViewEvent;
import com.squareup.cash.wallet.screens.CardControlDialogScreen;
import com.squareup.cash.wallet.viewmodels.CardControlDialogViewModel;
import com.squareup.cash.wallet.viewmodels.PresentationAction;
import com.squareup.cash.wallet.viewmodels.PresentationTimelineViewEvent;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewEvent;
import com.squareup.cash.work.viewmodels.PayHomeViewEvent;
import com.squareup.cash.work.viewmodels.ShiftDetailViewEvent;
import com.squareup.cash.work.viewmodels.ShiftListViewEvent;
import com.squareup.protos.common.Money;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlinx.coroutines.JobKt;

/* loaded from: classes7.dex */
public final /* synthetic */ class ViewGroups$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ ViewGroups$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                View view = (View) obj;
                view.getClass();
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    return ViewGroups.findViewInTree(viewGroup, function1);
                }
                return null;
            case 1:
                Money money = (Money) obj;
                money.getClass();
                function1.invoke(new RecurringReloadConfigurationViewEvent.ScheduledAmountChanged(money));
                return Unit.INSTANCE;
            case 2:
                Money money2 = (Money) obj;
                money2.getClass();
                function1.invoke(new RecurringReloadConfigurationViewEvent.MinBalanceChanged(money2));
                return Unit.INSTANCE;
            case 3:
                RecurringReloadConfigurationViewModel.AmountPickerItem amountPickerItem = (RecurringReloadConfigurationViewModel.AmountPickerItem) obj;
                amountPickerItem.getClass();
                function1.invoke(new RecurringReloadConfigurationViewEvent.AmountPickerItemSelected(amountPickerItem));
                return Unit.INSTANCE;
            case 4:
                Money money3 = (Money) obj;
                money3.getClass();
                function1.invoke(new RecurringReloadConfigurationViewEvent.ReloadAmountChanged(money3));
                return Unit.INSTANCE;
            case 5:
                ((DialogListenerEvent) obj).getClass();
                function1.invoke(SetDefaultInstrumentViewEvent$CloseClick.INSTANCE);
                return Unit.INSTANCE;
            case 6:
                AmountEvent amountEvent = (AmountEvent) obj;
                amountEvent.getClass();
                if (amountEvent instanceof AmountEvent.AmountChanged) {
                    function1.invoke(new WithdrawViewEvent.OnAmountChanged(((AmountEvent.AmountChanged) amountEvent).rawAmount));
                }
                return Unit.INSTANCE;
            case 7:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new WalletHomeViewEvent.OpenUrl(str));
                return Unit.INSTANCE;
            case 8:
                PresentationAction presentationAction = (PresentationAction) obj;
                presentationAction.getClass();
                function1.invoke(new PresentationTimelineViewEvent.ActionClicked(presentationAction));
                return Unit.INSTANCE;
            case 9:
                ((Boolean) obj).booleanValue();
                function1.invoke(WalletHomeViewEvent.PrepurchaseToggleTapped.INSTANCE);
                return Unit.INSTANCE;
            case 10:
                TabToolbarInternalViewEvent tabToolbarInternalViewEvent = (TabToolbarInternalViewEvent) obj;
                tabToolbarInternalViewEvent.getClass();
                function1.invoke(new WalletHomeViewEvent.TabToolbarEvent(tabToolbarInternalViewEvent));
                return Unit.INSTANCE;
            case 11:
                NullStateCarouselViewEvent nullStateCarouselViewEvent = (NullStateCarouselViewEvent) obj;
                nullStateCarouselViewEvent.getClass();
                function1.invoke(new WalletHomeViewEvent.NullStateCarouselEvent(nullStateCarouselViewEvent));
                return Unit.INSTANCE;
            case 12:
                DialogListenerEvent dialogListenerEvent = (DialogListenerEvent) obj;
                dialogListenerEvent.getClass();
                DialogListenerEvent.OnDialogResult onDialogResult = dialogListenerEvent instanceof DialogListenerEvent.OnDialogResult ? (DialogListenerEvent.OnDialogResult) dialogListenerEvent : null;
                if (onDialogResult == null || (obj2 = onDialogResult.result) == null) {
                    return Unit.INSTANCE;
                }
                if (((DialogListenerEvent.OnDialogResult) dialogListenerEvent).screen instanceof CardControlDialogScreen) {
                    CardControlDialogViewModel.Button.Response response = obj2 instanceof CardControlDialogViewModel.Button.Response ? (CardControlDialogViewModel.Button.Response) obj2 : null;
                    if (response instanceof CardControlDialogViewModel.Button.Response.OpenUrl) {
                        function1.invoke(new WalletHomeViewEvent.OpenUrl(((CardControlDialogViewModel.Button.Response.OpenUrl) response).url));
                    }
                }
                return Unit.INSTANCE;
            case 13:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new PayHomeViewEvent.PastPayStubClicked(str2));
                return Unit.INSTANCE;
            case 14:
                function1.invoke(ShiftDetailViewEvent.DisabledClockInTapped.INSTANCE);
                return Unit.INSTANCE;
            case 15:
                LocalDate localDate = (LocalDate) obj;
                localDate.getClass();
                function1.invoke(new ShiftListViewEvent.DateClicked(localDate));
                return Unit.INSTANCE;
            case 16:
                YearMonth yearMonth = (YearMonth) obj;
                yearMonth.getClass();
                function1.invoke(new ShiftListViewEvent.MonthChanged(yearMonth));
                return Unit.INSTANCE;
            case 17:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(str3);
                return Unit.INSTANCE;
            case 18:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(str4);
                return Unit.INSTANCE;
            case 19:
                List list = (List) obj;
                list.getClass();
                Option option = (Option) CollectionsKt.firstOrNull(list);
                if (option == null) {
                    return Unit.INSTANCE;
                }
                function1.invoke(option);
                return Unit.INSTANCE;
            case 20:
                UiComponent uiComponent = (UiComponent) obj;
                uiComponent.getClass();
                function1.invoke(uiComponent);
                return Unit.INSTANCE;
            case 21:
                UiComponent uiComponent2 = (UiComponent) obj;
                uiComponent2.getClass();
                function1.invoke(uiComponent2);
                return Unit.INSTANCE;
            default:
                return Long.valueOf(JobKt.m4183toDelayMillisLRDsOJo(((Duration) function1.invoke(obj)).rawValue));
        }
    }
}

package com.squareup.cash.transfers.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.room.util.TableInfoKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrl;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.support.backend.api.disputesTracker.DisputeRow;
import com.squareup.cash.support.viewmodels.PhoneVerificationViewModel;
import com.squareup.cash.support.viewmodels.SupportDisputeTrackerViewModel;
import com.squareup.cash.support.viewmodels.SupportIncidentDetailsViewModel;
import com.squareup.cash.support.viewmodels.SupportPhoneStatusViewModel;
import com.squareup.cash.support.viewmodels.SupportSearchViewModel;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.support.views.search.SupportSearchViewKt;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.taptopay.viewmodels.TapToPayAvatarViewModel;
import com.squareup.cash.taptopay.viewmodels.TapToPayInitiatorNotesViewModel;
import com.squareup.cash.taptopay.viewmodels.TapToPayPaymentRequestViewModel;
import com.squareup.cash.taptopay.views.TapToPayKt;
import com.squareup.cash.taptopay.views.components.TapToPayButtonKt;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.transactionpicker.viewmodels.TransactionPickerViewModel;
import com.squareup.cash.transactionpicker.views.ArcadeTransactionPickerViewKt;
import com.squareup.cash.transfers.presenters.SetDefaultInstrumentPresenter;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.transfers.viewmodels.InstrumentNotLinkedViewModel;
import com.squareup.cash.transfers.viewmodels.LinkedAccountsNuxViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadsChangeInstrumentViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadsDismissDialogViewModel;
import com.squareup.cash.upsell.viewmodels.NullStateCarouselViewModel;
import com.squareup.cash.upsell.viewmodels.UiGroupElementViewModel;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.DeviceLockModel;
import com.squareup.cash.wallet.viewmodels.PresentationTimelineViewModel;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.cash.work.applets.views.WorkAppletTile;
import com.squareup.cash.work.viewmodels.MerchantPickerViewModel;
import com.squareup.cash.work.views.MerchantPickerBottomSheetViewKt;
import com.squareup.scannerview.TextSetter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final /* synthetic */ class AddMoneyViewKt$$ExternalSyntheticLambda11 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ AddMoneyViewKt$$ExternalSyntheticLambda11(int i, int i2, int i3, Object obj, Function1 function1) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = function1;
        this.f$2 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                AddMoneyViewKt.AddMoneyFooter((AddMoneyViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.Dispute((DisputeRow) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                ScreenshotReviewViewKt.DisputesTrackerLoadedContent((SupportDisputeTrackerViewModel.Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.SupportIncidentDetails((SupportIncidentDetailsViewModel.Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1), i2);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.SupportPhoneStatus((SupportPhoneStatusViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1), i2);
                break;
            case 5:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.ButtonBox((PhoneVerificationViewModel.Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                SupportSearchViewKt.SupportSearch((SupportSearchViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((InviteErrorPresenter) obj4).m3587models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((TaxReturnsPresenter) obj4).m3767models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((ErrorPresenter) obj4).m3725models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((TapToPayPresenter) obj4).m3759models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                TapToPayKt.TapToPayInitiatorNotes((TapToPayInitiatorNotesViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                TapToPayKt.TapToPayPaymentRequest((TapToPayPaymentRequestViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                TapToPayButtonKt.TapToPayRecipientAvatar((TapToPayAvatarViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                ArcadeTransactionPickerViewKt.TransactionPicker((TransactionPickerViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ArcadeTransactionPickerViewKt.LoadedWithLazyColumn((TextSetter) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ((SetDefaultInstrumentPresenter) obj4).m3772models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ((ErrorPresenter) obj4).m3725models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                AddMoneyViewKt.InstrumentNotLinkedSheet((InstrumentNotLinkedViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).intValue();
                AddMoneyViewKt.LinkedAccountsNux((LinkedAccountsNuxViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).intValue();
                AddMoneyViewKt.RecurringReloadsChangeInstrumentSheet((RecurringReloadsChangeInstrumentViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).intValue();
                AddMoneyViewKt.RecurringReloadsDismissDialog((RecurringReloadsDismissDialogViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).intValue();
                TableInfoKt.NullStateCarouselContent((NullStateCarouselViewModel.Content) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                zzrl.DrawableImage((UiGroupElementViewModel.DrawableViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                UtilsKt.DeviceLockRow((DeviceLockModel) obj4, (Function2) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).intValue();
                UtilsKt.PresentationTimelineView((PresentationTimelineViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                UtilsKt.Render((CardSchemeViewModel.Module.ShippingTimeline) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                UtilsKt.Render((CardSchemeViewModel.Module.StatusModule) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                ((WorkAppletTile) obj4).UI((AppletTile.AppletTileAppearance) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                MerchantPickerBottomSheetViewKt.MerchantPickerBottomSheet((MerchantPickerViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AddMoneyViewKt$$ExternalSyntheticLambda11(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
    }
}

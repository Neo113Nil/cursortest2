package com.squareup.cash.work.views.shift;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import app.cash.local.backend.RefreshMarketingMessagesKt;
import com.fillr.browsersdk.model.FillrWidget;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.work.applets.viewmodels.WorkAppletTileModel;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.viewmodels.DeclareCashTipBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.ShiftFilterViewModel;
import com.squareup.cash.work.viewmodels.ShiftNotStartedDialogViewModel;
import com.squareup.cash.work.viewmodels.TaxFormDownloaderViewModel;
import com.squareup.cash.work.views.clockin.ClockInOverlayState;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import com.squareup.cash.work.views.pay.PayCellViewKt;
import com.stripe.android.financialconnections.exception.InstitutionPlannedDowntimeError;
import com.stripe.android.financialconnections.exception.InstitutionUnplannedDowntimeError;
import com.stripe.android.financialconnections.features.common.AccountSelectionState;
import com.stripe.android.financialconnections.features.common.IconSize;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationScreenKt;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationState;
import com.stripe.android.financialconnections.features.success.SuccessContentKt;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import com.stripe.android.financialconnections.model.NetworkedAccount;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.components.TextKt;
import defpackage.FinancialConnectionsGenericInfoScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShiftListViewKt$$ExternalSyntheticLambda12 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ ShiftListViewKt$$ExternalSyntheticLambda12(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ShiftListViewKt.ShiftListFilterSheet((ShiftFilterViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                RefreshMarketingMessagesKt.InstalledUI((WorkAppletTileModel.Installed) obj5, (String) obj4, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                DisclaimerTextKt.ClockInOverlayMainContent((ClockInOverlayState) obj5, (ClockInOverlayViewModel.Loaded) obj4, (PaddingValuesImpl) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                DisclaimerTextKt.ClockInStatusDataContent((ClockInOverlayViewModel.Loaded) obj5, (Function0) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                DisclaimerTextKt.ClockedOutSection((ClockInOverlayViewModel.Loaded.ClockedOut) obj5, (Function0) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                DisclaimerTextKt.DeclareCashTipSheetContent((DeclareCashTipBottomSheetViewModel) obj5, (PaddingValues) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                DisclaimerTextKt.ShiftNotStartedDialogView((ShiftNotStartedDialogViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                PayCellViewKt.TaxFormDownloaderDialogView((TaxFormDownloaderViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ListItemKt.AccountSubtitle((AccountSelectionState) obj5, (PartnerAccount) obj4, (NetworkedAccount) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                ListItemKt.InstitutionPlannedDowntimeErrorContent((InstitutionPlannedDowntimeError) obj5, (Function0) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                ListItemKt.InstitutionUnplannedDowntimeErrorContent((InstitutionUnplannedDowntimeError) obj5, (Function0) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                ListItemKt.LegalDetailsBottomSheetContent((LegalDetailsNotice) obj5, (Function1) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                ListItemKt.DataAccessBottomSheetContent((DataAccessNotice) obj5, (Function1) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                ListItemKt.LocalIcon((IconSize) obj5, (Painter) obj4, (String) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                FillrWidget.WidgetType.AnonymousClass1.GenericButton((Function0) obj5, (TextKt) obj4, (FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                NetworkingLinkVerificationScreenKt.NetworkingLinkVerificationLoaded((Async) obj5, (NetworkingLinkVerificationState.Payload) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                SuccessContentKt.m4018SuccessContentInternal8GFhAUE((Async) obj5, (Async) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ShiftListViewKt$$ExternalSyntheticLambda12(Object obj, Object obj2, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = function1;
        this.f$3 = i;
    }
}

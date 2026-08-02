package com.squareup.cash.work.views;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.navigation.NavBackStackEntry;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.security.views.databinding.SecurityViewPasswordEntryBinding;
import com.squareup.cash.taptopay.viewmodels.TapToPayErrorDialogViewModel;
import com.squareup.cash.taptopay.viewmodels.TapToPayInitiatorNotesViewModel;
import com.squareup.cash.taptopay.viewmodels.TapToPayPaymentRequestViewModel;
import com.squareup.cash.taptopay.views.TapToPayKt;
import com.squareup.cash.transfers.viewmodels.InstrumentNotLinkedViewModel;
import com.squareup.cash.transfers.viewmodels.LinkedAccountsNuxViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadsChangeInstrumentViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadsDismissDialogViewModel;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.squareup.cash.wallet.viewmodels.CardLockHalfSheetModel;
import com.squareup.cash.wallet.viewmodels.PresentationTimelineViewModel;
import com.squareup.cash.wallet.views.HeroCardNullStateKt$$ExternalSyntheticLambda8;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.cash.work.applets.views.WorkApplet$applet$1;
import com.squareup.cash.work.viewmodels.ClockInBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.viewmodels.DeclareCashTipBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.ShiftNotStartedDialogViewModel;
import com.squareup.cash.work.viewmodels.ShiftNoteViewModel;
import com.squareup.cash.work.viewmodels.TakeBreakBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.TaxFormDownloaderViewModel;
import com.squareup.cash.work.viewmodels.TaxFormsListViewModel;
import com.squareup.cash.work.viewmodels.TimecardDetailViewModel;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import com.squareup.cash.work.views.pay.PayCellViewKt;
import com.squareup.cash.work.views.shift.ShiftListViewKt;
import com.squareup.cash.work.views.timecard.TimecardDetailViewKt;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt;
import com.withpersona.sdk2.inquiry.advancedCustomizations.AdvancedCustomizations;
import com.withpersona.sdk2.inquiry.advancedCustomizations.ViewControllerVersion;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.BasicSelectCountryAndIdClassViewController;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.SelectCountryAndIdClassRunner;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidReviewBinding;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$render$viewController$1;
import com.withpersona.sdk2.inquiry.governmentid.reviewCaptureScreen.BasicGovIdReviewCaptureViewController;
import com.withpersona.sdk2.inquiry.governmentid.reviewCaptureScreen.GovernmentIdReviewRunner;
import com.withpersona.sdk2.inquiry.governmentid.reviewCaptureScreen.GovernmentIdReviewRunner$Companion$1$viewController$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* loaded from: classes7.dex */
public final /* synthetic */ class ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0 implements Function4 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.$r8$classId) {
            case 0:
                ClockInBottomSheetViewModel clockInBottomSheetViewModel = (ClockInBottomSheetViewModel) obj;
                Function1 function1 = (Function1) obj2;
                int intValue = ((Integer) obj4).intValue();
                clockInBottomSheetViewModel.getClass();
                function1.getClass();
                DisclaimerTextKt.ClockInBottomSheetView(clockInBottomSheetViewModel, function1, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 1:
                Composer composer = (Composer) obj3;
                int m = re$$ExternalSyntheticOutline0.m((Integer) obj4, (Unit) obj, (Function1) obj2);
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(m & 1, (m & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                    TapToPayKt.TapToPay(gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                TapToPayPaymentRequestViewModel tapToPayPaymentRequestViewModel = (TapToPayPaymentRequestViewModel) obj;
                Function1 function12 = (Function1) obj2;
                int intValue2 = ((Integer) obj4).intValue();
                tapToPayPaymentRequestViewModel.getClass();
                function12.getClass();
                TapToPayKt.TapToPayPaymentRequest(tapToPayPaymentRequestViewModel, function12, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 3:
                TapToPayInitiatorNotesViewModel tapToPayInitiatorNotesViewModel = (TapToPayInitiatorNotesViewModel) obj;
                Function1 function13 = (Function1) obj2;
                int intValue3 = ((Integer) obj4).intValue();
                tapToPayInitiatorNotesViewModel.getClass();
                function13.getClass();
                TapToPayKt.TapToPayInitiatorNotes(tapToPayInitiatorNotesViewModel, function13, (Composer) obj3, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 4:
                Function1 function14 = (Function1) obj2;
                Composer composer2 = (Composer) obj3;
                int m2 = re$$ExternalSyntheticOutline0.m((Integer) obj4, (Unit) obj, function14);
                if ((m2 & 48) == 0) {
                    m2 |= ((GapComposer) composer2).changedInstance(function14) ? 32 : 16;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(m2 & 1, (m2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    TapToPayKt.TapToPayPaymentError(function14, gapComposer2, (m2 >> 3) & 14);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                TapToPayErrorDialogViewModel tapToPayErrorDialogViewModel = (TapToPayErrorDialogViewModel) obj;
                Function1 function15 = (Function1) obj2;
                Composer composer3 = (Composer) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                tapToPayErrorDialogViewModel.getClass();
                function15.getClass();
                if ((intValue4 & 6) == 0) {
                    i = intValue4 | (((GapComposer) composer3).changed(tapToPayErrorDialogViewModel.ordinal()) ? 4 : 2);
                } else {
                    i = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i |= ((GapComposer) composer3).changedInstance(function15) ? 32 : 16;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(i & 1, (i & 147) != 146)) {
                    TapToPayKt.TapToPayErrorDialog(tapToPayErrorDialogViewModel, function15, null, gapComposer3, i & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Function1 function16 = (Function1) obj2;
                Composer composer4 = (Composer) obj3;
                int m3 = re$$ExternalSyntheticOutline0.m((Integer) obj4, (Unit) obj, function16);
                if ((m3 & 48) == 0) {
                    m3 |= ((GapComposer) composer4).changedInstance(function16) ? 32 : 16;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(m3 & 1, (m3 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    TapToPayKt.TapToPayFirstTime(function16, gapComposer4, (m3 >> 3) & 14);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Function1 function17 = (Function1) obj2;
                Composer composer5 = (Composer) obj3;
                int m4 = re$$ExternalSyntheticOutline0.m((Integer) obj4, (Unit) obj, function17);
                if ((m4 & 48) == 0) {
                    m4 |= ((GapComposer) composer5).changedInstance(function17) ? 32 : 16;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(m4 & 1, (m4 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    TapToPayKt.TapToPayOnboardingComplete(function17, gapComposer5, (m4 >> 3) & 14);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                LinkedAccountsNuxViewModel linkedAccountsNuxViewModel = (LinkedAccountsNuxViewModel) obj;
                Function1 function18 = (Function1) obj2;
                int intValue5 = ((Integer) obj4).intValue();
                linkedAccountsNuxViewModel.getClass();
                function18.getClass();
                AddMoneyViewKt.LinkedAccountsNux(linkedAccountsNuxViewModel, function18, (Composer) obj3, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 9:
                InstrumentNotLinkedViewModel instrumentNotLinkedViewModel = (InstrumentNotLinkedViewModel) obj;
                Function1 function19 = (Function1) obj2;
                int intValue6 = ((Integer) obj4).intValue();
                instrumentNotLinkedViewModel.getClass();
                function19.getClass();
                AddMoneyViewKt.InstrumentNotLinkedSheet(instrumentNotLinkedViewModel, function19, (Composer) obj3, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 10:
                Composer composer6 = (Composer) obj3;
                int m5 = re$$ExternalSyntheticOutline0.m((Integer) obj4, (Unit) obj, (Function1) obj2);
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(m5 & 1, (m5 & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                    AddMoneyViewKt.TransfersRouterView(gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Function1 function110 = (Function1) obj2;
                Composer composer7 = (Composer) obj3;
                int m6 = re$$ExternalSyntheticOutline0.m((Integer) obj4, (Unit) obj, function110);
                if ((m6 & 48) == 0) {
                    m6 |= ((GapComposer) composer7).changedInstance(function110) ? 32 : 16;
                }
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(m6 & 1, (m6 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    AddMoneyViewKt.SetDefaultInstrumentView(function110, gapComposer7, (m6 >> 3) & 14);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                RecurringReloadsChangeInstrumentViewModel recurringReloadsChangeInstrumentViewModel = (RecurringReloadsChangeInstrumentViewModel) obj;
                Function1 function111 = (Function1) obj2;
                int intValue7 = ((Integer) obj4).intValue();
                recurringReloadsChangeInstrumentViewModel.getClass();
                function111.getClass();
                AddMoneyViewKt.RecurringReloadsChangeInstrumentSheet(recurringReloadsChangeInstrumentViewModel, function111, (Composer) obj3, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 13:
                RecurringReloadsDismissDialogViewModel recurringReloadsDismissDialogViewModel = (RecurringReloadsDismissDialogViewModel) obj;
                Function1 function112 = (Function1) obj2;
                int intValue8 = ((Integer) obj4).intValue();
                recurringReloadsDismissDialogViewModel.getClass();
                function112.getClass();
                AddMoneyViewKt.RecurringReloadsDismissDialog(recurringReloadsDismissDialogViewModel, function112, (Composer) obj3, intValue8 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 14:
                CardLockHalfSheetModel cardLockHalfSheetModel = (CardLockHalfSheetModel) obj;
                Function1 function113 = (Function1) obj2;
                Composer composer8 = (Composer) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                cardLockHalfSheetModel.getClass();
                function113.getClass();
                if ((intValue9 & 6) == 0) {
                    i2 = intValue9 | (((GapComposer) composer8).changed(cardLockHalfSheetModel) ? 4 : 2);
                } else {
                    i2 = intValue9;
                }
                if ((intValue9 & 48) == 0) {
                    i2 |= ((GapComposer) composer8).changedInstance(function113) ? 32 : 16;
                }
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
                    int i3 = i2 & 112;
                    boolean z = i3 == 32;
                    Object rememberedValue = gapComposer8.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (z || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new HeroCardNullStateKt$$ExternalSyntheticLambda8(18, function113);
                        gapComposer8.updateRememberedValue(rememberedValue);
                    }
                    Function2 function2 = (Function2) rememberedValue;
                    boolean z2 = i3 == 32;
                    Object rememberedValue2 = gapComposer8.rememberedValue();
                    if (z2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new HeroCardViewKt$$ExternalSyntheticLambda5(28, function113);
                        gapComposer8.updateRememberedValue(rememberedValue2);
                    }
                    UtilsKt.CardLockHalfSheetView(cardLockHalfSheetModel, function2, (Function0) rememberedValue2, gapComposer8, i2 & 14);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                PresentationTimelineViewModel presentationTimelineViewModel = (PresentationTimelineViewModel) obj;
                Function1 function114 = (Function1) obj2;
                int intValue10 = ((Integer) obj4).intValue();
                presentationTimelineViewModel.getClass();
                function114.getClass();
                UtilsKt.PresentationTimelineView(presentationTimelineViewModel, function114, (Composer) obj3, intValue10 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 16:
                TakeBreakBottomSheetViewModel takeBreakBottomSheetViewModel = (TakeBreakBottomSheetViewModel) obj;
                Function1 function115 = (Function1) obj2;
                int intValue11 = ((Integer) obj4).intValue();
                takeBreakBottomSheetViewModel.getClass();
                function115.getClass();
                DisclaimerTextKt.TakeBreakBottomSheetView(takeBreakBottomSheetViewModel, function115, (Composer) obj3, intValue11 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 17:
                DeclareCashTipBottomSheetViewModel declareCashTipBottomSheetViewModel = (DeclareCashTipBottomSheetViewModel) obj;
                Function1 function116 = (Function1) obj2;
                int intValue12 = ((Integer) obj4).intValue();
                declareCashTipBottomSheetViewModel.getClass();
                function116.getClass();
                DisclaimerTextKt.DeclareCashTipBottomSheetView(declareCashTipBottomSheetViewModel, function116, (Composer) obj3, intValue12 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 18:
                ShiftNotStartedDialogViewModel shiftNotStartedDialogViewModel = (ShiftNotStartedDialogViewModel) obj;
                Function1 function117 = (Function1) obj2;
                int intValue13 = ((Integer) obj4).intValue();
                shiftNotStartedDialogViewModel.getClass();
                function117.getClass();
                DisclaimerTextKt.ShiftNotStartedDialogView(shiftNotStartedDialogViewModel, function117, null, (Composer) obj3, intValue13 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 19:
                ShiftNoteViewModel shiftNoteViewModel = (ShiftNoteViewModel) obj;
                Function1 function118 = (Function1) obj2;
                int intValue14 = ((Integer) obj4).intValue();
                shiftNoteViewModel.getClass();
                function118.getClass();
                ShiftListViewKt.ShiftNoteView(shiftNoteViewModel, function118, (Composer) obj3, intValue14 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 20:
                TimecardDetailViewModel timecardDetailViewModel = (TimecardDetailViewModel) obj;
                Function1 function119 = (Function1) obj2;
                int intValue15 = ((Integer) obj4).intValue();
                timecardDetailViewModel.getClass();
                function119.getClass();
                TimecardDetailViewKt.TimecardDetailView(timecardDetailViewModel, function119, (Composer) obj3, intValue15 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 21:
                TaxFormsListViewModel taxFormsListViewModel = (TaxFormsListViewModel) obj;
                Function1 function120 = (Function1) obj2;
                int intValue16 = ((Integer) obj4).intValue();
                taxFormsListViewModel.getClass();
                function120.getClass();
                PayCellViewKt.TaxFormsListView(taxFormsListViewModel, function120, (Composer) obj3, intValue16 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 22:
                TaxFormDownloaderViewModel taxFormDownloaderViewModel = (TaxFormDownloaderViewModel) obj;
                Function1 function121 = (Function1) obj2;
                int intValue17 = ((Integer) obj4).intValue();
                taxFormDownloaderViewModel.getClass();
                function121.getClass();
                PayCellViewKt.TaxFormDownloaderDialogView(taxFormDownloaderViewModel, function121, null, (Composer) obj3, intValue17 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                return Unit.INSTANCE;
            case 23:
                ClockInOverlayViewModel.Loaded loaded = (ClockInOverlayViewModel.Loaded) obj2;
                int intValue18 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                loaded.getClass();
                DisclaimerTextKt.ClockStatusBadge(loaded, null, (Composer) obj3, (intValue18 >> 3) & 14);
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                Composer composer9 = (Composer) obj3;
                int intValue19 = ((Integer) obj4).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue19 & 1, (intValue19 & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                    ListItemKt.LoadingShimmerEffect(AccountPickerScreenKt.lambda$229709570, gapComposer9, 6);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                Composer composer10 = (Composer) obj3;
                int intValue20 = ((Integer) obj4).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue20 & 1, (intValue20 & EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) != 128)) {
                    ListItemKt.LoadingShimmerEffect(LinkAccountPickerScreenKt.lambda$2110578920, gapComposer10, 6);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj4).intValue();
                ((ColumnScope) obj).getClass();
                ((NavBackStackEntry) obj2).getClass();
                return Unit.INSTANCE;
            case 27:
                Screen.AutoClassificationSelectCountryAndIdClassScreen autoClassificationSelectCountryAndIdClassScreen = (Screen.AutoClassificationSelectCountryAndIdClassScreen) obj;
                ViewEnvironment viewEnvironment = (ViewEnvironment) obj2;
                Context context = (Context) obj3;
                ViewGroup viewGroup = (ViewGroup) obj4;
                autoClassificationSelectCountryAndIdClassScreen.getClass();
                viewEnvironment.getClass();
                context.getClass();
                int i4 = AdvancedCustomizations.$r8$clinit;
                GovernmentIdStepFragment$render$viewController$1 governmentIdStepFragment$render$viewController$1 = new GovernmentIdStepFragment$render$viewController$1(1);
                int ordinal = autoClassificationSelectCountryAndIdClassScreen.designVersion.ordinal();
                if (ordinal == 0) {
                    ViewControllerVersion[] viewControllerVersionArr = ViewControllerVersion.$VALUES;
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ViewControllerVersion[] viewControllerVersionArr2 = ViewControllerVersion.$VALUES;
                }
                BasicSelectCountryAndIdClassViewController newViewController = governmentIdStepFragment$render$viewController$1.newViewController(context, viewGroup);
                SecurityViewPasswordEntryBinding securityViewPasswordEntryBinding = newViewController.binding;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) securityViewPasswordEntryBinding.rootView;
                coordinatorLayout.getClass();
                ViewShowRenderingKt.bindShowRendering(coordinatorLayout, autoClassificationSelectCountryAndIdClassScreen, viewEnvironment, new WorkApplet$applet$1(2, new SelectCountryAndIdClassRunner(newViewController), SelectCountryAndIdClassRunner.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$AutoClassificationSelectCountryAndIdClassScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0, 26));
                CoordinatorLayout coordinatorLayout2 = (CoordinatorLayout) securityViewPasswordEntryBinding.rootView;
                coordinatorLayout2.getClass();
                return coordinatorLayout2;
            case 28:
                Screen.ReviewScreen reviewScreen = (Screen.ReviewScreen) obj;
                ViewEnvironment viewEnvironment2 = (ViewEnvironment) obj2;
                Context context2 = (Context) obj3;
                ViewGroup viewGroup2 = (ViewGroup) obj4;
                reviewScreen.getClass();
                viewEnvironment2.getClass();
                context2.getClass();
                int i5 = AdvancedCustomizations.$r8$clinit;
                GovernmentIdReviewRunner$Companion$1$viewController$1 governmentIdReviewRunner$Companion$1$viewController$1 = new GovernmentIdReviewRunner$Companion$1$viewController$1(0);
                int ordinal2 = reviewScreen.designVersion.ordinal();
                if (ordinal2 == 0) {
                    ViewControllerVersion[] viewControllerVersionArr3 = ViewControllerVersion.$VALUES;
                } else {
                    if (ordinal2 != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ViewControllerVersion[] viewControllerVersionArr4 = ViewControllerVersion.$VALUES;
                }
                BasicGovIdReviewCaptureViewController newViewController2 = governmentIdReviewRunner$Companion$1$viewController$1.newViewController(context2, viewGroup2);
                Pi2GovernmentidReviewBinding pi2GovernmentidReviewBinding = newViewController2.binding;
                FrameLayout frameLayout = pi2GovernmentidReviewBinding.rootView;
                frameLayout.getClass();
                ViewShowRenderingKt.bindShowRendering(frameLayout, reviewScreen, viewEnvironment2, new WorkApplet$applet$1(2, new GovernmentIdReviewRunner(newViewController2), GovernmentIdReviewRunner.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$ReviewScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0, 28));
                FrameLayout frameLayout2 = pi2GovernmentidReviewBinding.rootView;
                frameLayout2.getClass();
                return frameLayout2;
            default:
                if (obj != null) {
                    throw new ClassCastException();
                }
                throw null;
        }
    }
}

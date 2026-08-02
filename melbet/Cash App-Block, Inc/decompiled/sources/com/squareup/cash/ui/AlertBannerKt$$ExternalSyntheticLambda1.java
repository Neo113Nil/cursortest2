package com.squareup.cash.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import com.fillr.browsersdk.BrowserSDKLogger$Companion;
import com.fillr.browsersdk.model.FillrWidget;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerViewModel;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.work.viewmodels.ScheduleCalendarViewModel;
import com.squareup.cash.work.views.SellerCardKt;
import com.stripe.android.financialconnections.exception.AccountLoadError;
import com.stripe.android.financialconnections.features.common.IconSize;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.consent.ConsentState;
import com.stripe.android.financialconnections.features.generic.GenericScreenState;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationState;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetLayoutInfo;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt;
import defpackage.FinancialConnectionsGenericInfoScreen;
import java.time.LocalDate;
import java.time.YearMonth;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final /* synthetic */ class AlertBannerKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ AlertBannerKt$$ExternalSyntheticLambda1(StripeBottomSheetState stripeBottomSheetState, StripeBottomSheetLayoutInfo stripeBottomSheetLayoutInfo, Function0 function0, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = 10;
        this.f$0 = stripeBottomSheetState;
        this.f$1 = stripeBottomSheetLayoutInfo;
        this.f$2 = function0;
        this.f$4 = composableLambdaImpl;
        this.f$5 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$5;
        Object obj3 = this.f$4;
        Object obj4 = this.f$2;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AlertBannerKt.AlertBannerContainer((AlertBannerViewModel) obj6, (Modifier) obj5, (Function0) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.RecurringReloadConfigurationContent((RecurringReloadConfigurationViewModel) obj6, (Function1) obj5, (LocalizedMoneyFormatter.Factory) obj4, (RealCashVibrator) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.WithdrawViewAmountContent((Modifier) obj5, (WithdrawViewModel.ViewAmount) obj6, (Function1) obj3, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                SellerCardKt.ScheduleCalendarWeekRow((LocalDate) obj6, (ScheduleCalendarViewModel) obj5, (YearMonth) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                ListItemKt.NoAccountsAvailableErrorContent((AccountLoadError) obj6, (Function0) obj4, (Function0) obj5, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                ListItemKt.GenericBottomSheetContent((FinancialConnectionsGenericInfoScreen) obj6, (Function1) obj5, (Function0) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ListItemKt.IconWrapperBox((Modifier) obj5, (IconSize) obj6, (Shape) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                BrowserSDKLogger$Companion.LoadedContent((ConsentState.Payload) obj6, (Async) obj5, (Function1) obj3, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                FillrWidget.WidgetType.AnonymousClass1.GenericScreen((GenericScreenState) obj6, (Function0) obj4, (Function0) obj5, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                NetworkingSaveToLinkVerificationScreenKt.NetworkingSaveToLinkVerificationLoaded((Async) obj6, (NetworkingSaveToLinkVerificationState.Payload) obj5, (Function1) obj3, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                StripeBottomSheetStateKt.StripeBottomSheetLayout((StripeBottomSheetState) obj6, (StripeBottomSheetLayoutInfo) obj5, (Function0) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AlertBannerKt$$ExternalSyntheticLambda1(Modifier modifier, IconSize iconSize, Shape shape, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = 6;
        this.f$1 = modifier;
        this.f$0 = iconSize;
        this.f$2 = shape;
        this.f$4 = composableLambdaImpl;
        this.f$5 = i;
    }

    public /* synthetic */ AlertBannerKt$$ExternalSyntheticLambda1(Modifier modifier, WithdrawViewModel.ViewAmount viewAmount, Function1 function1, Function0 function0, int i) {
        this.$r8$classId = 2;
        this.f$1 = modifier;
        this.f$0 = viewAmount;
        this.f$4 = function1;
        this.f$2 = function0;
        this.f$5 = i;
    }

    public /* synthetic */ AlertBannerKt$$ExternalSyntheticLambda1(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$4 = obj4;
        this.f$5 = i;
    }

    public /* synthetic */ AlertBannerKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Function1 function1, Function0 function0, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$4 = function1;
        this.f$2 = function0;
        this.f$5 = i;
    }

    public /* synthetic */ AlertBannerKt$$ExternalSyntheticLambda1(Object obj, Function0 function0, Function0 function02, Function function, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = function0;
        this.f$1 = function02;
        this.f$4 = function;
        this.f$5 = i;
    }
}

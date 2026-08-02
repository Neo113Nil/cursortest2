package com.squareup.cash.tabs.views;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.TextFieldValue;
import coil3.RealImageLoader;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.downloadmanager.android.AndroidDownloadManager$Factory$Impl;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.loadable.Loadable;
import com.squareup.cash.marketing.components.CardUpsellKt;
import com.squareup.cash.marketing.components.TooltipState;
import com.squareup.cash.merchant.viewmodels.MerchantHeaderViewModel;
import com.squareup.cash.merchant.views.MerchantProfileViewKt;
import com.squareup.cash.merchant.views.SquareLoyaltyDetailsView;
import com.squareup.cash.moneybot.viewmodels.chat.MessageViewModel;
import com.squareup.cash.moneybot.widgets.UtilsKt;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewModel;
import com.squareup.cash.passkeys.views.PasskeyUpsellViewKt;
import com.squareup.cash.payments.viewmodels.QuickPayViewModel;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowSheetKt;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowSheetPeekPosition$FixedHeight;
import com.squareup.cash.shopping.viewmodels.ButtonModel;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.squareup.cash.transfers.views.composer.RecurringReloadConfigurationComposersKt;
import com.squareup.cash.transfers.views.composer.ScheduledReloadConfigurationComposersKt;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.views.CardNuxState;
import com.squareup.cash.wallet.views.RevolvingInteractiveCardsKt;
import com.squareup.cash.webview.android.WebViewProvider;
import com.squareup.cash.work.webview.viewmodels.WorkWebViewModel;
import com.squareup.cash.work.webview.views.WorkWebViewKt;
import com.squareup.protos.cash.ui.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class TabToolbarsKt$$ExternalSyntheticLambda17 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda17(ComposableLambdaImpl composableLambdaImpl, TooltipState tooltipState, Alignment.Horizontal horizontal, Function0 function0, ComposableLambdaImpl composableLambdaImpl2, int i) {
        this.$r8$classId = 1;
        this.f$0 = composableLambdaImpl;
        this.f$1 = tooltipState;
        this.f$2 = horizontal;
        this.f$3 = function0;
        this.f$4 = composableLambdaImpl2;
        this.f$5 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$5;
        Object obj3 = this.f$4;
        Object obj4 = this.f$3;
        Object obj5 = this.f$1;
        Object obj6 = this.f$2;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                TabToolbarsKt.TextButton((TitleBarActionScope) obj7, (TabToolbarInternalViewModel.TextButton) obj5, (Function1) obj6, (MoneybotToolbarSharedElementConfig) obj4, (SharedToolbarSwipeScope) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                CardUpsellKt.TooltipPopupBox((ComposableLambdaImpl) obj7, (TooltipState) obj5, (Alignment.Horizontal) obj6, (Function0) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                MerchantProfileViewKt.MerchantProfileLoaded((Modifier) obj7, (MerchantHeaderViewModel) obj5, (Loadable) obj4, (Function1) obj6, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                MerchantProfileViewKt.GenericTreeElementsWidget((Modifier) obj7, (GenericTreeElementsViewModel) obj5, (RealImageLoader) obj4, (Function1) obj6, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                LazyDslKt.MoneybotQuickActionsBar((String) obj7, (String) obj5, (MessageViewModel.MoneybotMessageViewModel.ThumbState) obj4, (Function1) obj6, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                UtilsKt.CollapsedChatInput((TextFieldValue) obj7, (Modifier) obj5, (String) obj4, (Function1) obj6, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                PasskeyUpsellViewKt.PasskeyItemCell((PasskeyManagementViewModel.PasskeyItemViewModel) obj7, (Modifier) obj5, (CellDefaultAccessory) obj6, (Function0) obj4, (String) obj3, (Composer) obj, Updater.updateChangedFlags(1), this.f$5);
                break;
            case 7:
                ((Integer) obj2).getClass();
                QuickPayViewKt.QuickPayView((QuickPayViewModel) obj7, (Function1) obj6, (RealImageLoader) obj5, (RealCashVibrator) obj4, (ElementBoundsRegistry) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                CoreFlowSheetKt.TheCoreFlowSheet((Function0) obj7, (Modifier) obj5, (CoreFlowRealSheetState) obj6, (CoreFlowSheetPeekPosition$FixedHeight) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((SquareLoyaltyDetailsView) obj7).InfoSheetButton((ButtonModel) obj5, (Color) obj4, (Function1) obj6, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.AddMoneyKeypad((Modifier) obj7, (AddMoneyViewModel.Keypad) obj5, (Function1) obj6, (MoneyFormatter) obj4, (RealCashVibrator) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.WithdrawChangedAmountContent((Modifier) obj7, (WithdrawViewModel.ChangeAmount) obj5, (MoneyFormatter) obj4, (Function1) obj6, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                RecurringReloadConfigurationComposersKt.AmountPickerContent((Modifier) obj7, (RecurringReloadConfigurationViewModel.AtmPicker) obj5, (Function1) obj6, (Function0) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                ScheduledReloadConfigurationComposersKt.ScheduledAmountPickerContent((Modifier) obj7, (RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker) obj5, (Function1) obj6, (Function0) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                RevolvingInteractiveCardsKt.Card2DFallback((Function0) obj7, (CardNuxState) obj5, (Function0) obj6, (Function0) obj4, (FiniteAnimationSpec) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                WorkWebViewKt.WorkWebView((WorkWebViewModel) obj7, (Function1) obj6, (WebViewProvider) obj5, (String) obj4, (AndroidDownloadManager$Factory$Impl) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda17(PasskeyManagementViewModel.PasskeyItemViewModel passkeyItemViewModel, Modifier modifier, CellDefaultAccessory cellDefaultAccessory, Function0 function0, String str, int i, int i2) {
        this.$r8$classId = 6;
        this.f$0 = passkeyItemViewModel;
        this.f$1 = modifier;
        this.f$2 = cellDefaultAccessory;
        this.f$3 = function0;
        this.f$4 = str;
        this.f$5 = i2;
    }

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda17(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = i;
    }

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda17(Object obj, Object obj2, Object obj3, Function1 function1, Object obj4, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$2 = function1;
        this.f$4 = obj4;
        this.f$5 = i;
    }

    public /* synthetic */ TabToolbarsKt$$ExternalSyntheticLambda17(Object obj, Function1 function1, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = function1;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
        this.f$5 = i;
    }
}

package com.squareup.cash.tax.views;

import android.content.Context;
import android.content.Intent;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$1$1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.navigation.NavArgumentKt;
import androidx.room.util.TableInfoKt;
import app.cash.local.views.LocalViewFactory;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.cdf.instrument.InstrumentLinkInitiate;
import com.squareup.cash.cdf.instrument.InstrumentLinkShowOptions;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.instruments.backend.api.InstrumentLinkingOptionManager$InstrumentLinkingOption;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.cash.shopping.views.ProductSearchView;
import com.squareup.cash.taptopay.viewmodels.TapToPayAvatarViewModel;
import com.squareup.cash.taptopay.views.components.TapToPayButtonKt;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.cash.tax.viewmodels.TaxAuthorizationViewModel$Empty;
import com.squareup.cash.tax.viewmodels.TaxReturnsViewModel;
import com.squareup.cash.tax.viewmodels.TaxTooltipViewModel;
import com.squareup.cash.tax.viewmodels.TaxesAppletTileModel;
import com.squareup.cash.transactionpicker.viewmodels.TransactionPickerViewModel;
import com.squareup.cash.transfers.presenters.LinkedAccountsPresenter;
import com.squareup.cash.transfers.screens.InstrumentLinkingOption;
import com.squareup.cash.transfers.screens.InstrumentLinkingOptionsQuestion;
import com.squareup.cash.transfers.screens.LinkedAccountsScreen;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.transfers.viewmodels.BalanceBasedAutoReloadConfirmationViewModel;
import com.squareup.cash.transfers.viewmodels.InstrumentDetailsViewModel;
import com.squareup.cash.transfers.viewmodels.InstrumentLinkingOptionsViewModel;
import com.squareup.cash.transfers.viewmodels.InstrumentNotLinkedViewModel;
import com.squareup.cash.transfers.viewmodels.LinkedAccountsViewModel;
import com.squareup.cash.transfers.viewmodels.PendingTransfersConfirmationViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadsChangeInstrumentViewModel;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.squareup.cash.transfers.views.BalanceBasedAutoReloadConfirmationView;
import com.squareup.cash.transfers.views.LinkedAccountsViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.transfers.views.LinkedAccountsViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.transfers.views.PendingTransfersConfirmationDialogView;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidgetData;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidgetKt;
import com.squareup.cash.upsell.viewmodels.NullStateCarouselViewModel;
import com.squareup.cash.wallet.viewmodels.CardAppletTileViewModel;
import com.squareup.cash.wallet.viewmodels.CardControlDialogViewModel;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.PrepurchaseCardData;
import com.squareup.cash.wallet.viewmodels.PresentationTimelineViewModel;
import com.squareup.cash.wallet.viewmodels.WalletHomeViewModel$WalletScheme;
import com.squareup.cash.wallet.views.ArcadeCardControlDialog;
import com.squareup.cash.wallet.views.CardAppletTileKt;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.views.HeroCardViewKt;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.cash.wallet.views.WalletHomeViewKt;
import com.squareup.cash.work.viewmodels.MerchantPickerViewModel;
import com.squareup.cash.work.views.MerchantPickerBottomSheetViewKt;
import com.squareup.protos.franklin.api.CashInstrumentType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class TaxReturnsView$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ TaxReturnsView$$ExternalSyntheticLambda1(Function1 function1, RealImageLoader realImageLoader, InstrumentLinkingOptionsViewModel instrumentLinkingOptionsViewModel) {
        this.$r8$classId = 12;
        this.f$2 = function1;
        this.f$0 = realImageLoader;
        this.f$1 = instrumentLinkingOptionsViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i2 = 2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$2;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int i3 = TaxReturnsView.$r8$clinit;
                ((TaxReturnsView) obj5).Content((TaxReturnsViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                TapToPayButtonKt.TapToPayRecipient((String) obj5, (TapToPayAvatarViewModel) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ((TaxesAppletTile) obj5).InstalledUI((TaxesAppletTileModel.Installed) obj3, (AppletTile.AppletTileAppearance) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                int i4 = TaxAuthorizationView.$r8$clinit;
                ((TaxAuthorizationView) obj5).Content((TaxAuthorizationViewModel$Empty) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                TaxReturnsViewKt.TaxReturns((TaxReturnsViewModel) obj3, (Function1) obj4, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                int i5 = TaxTooltipView.$r8$clinit;
                ((TaxTooltipView) obj5).Content((TaxTooltipViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                ((ProductSearchView) obj5).Content((TransactionPickerViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                LinkedAccountsPresenter linkedAccountsPresenter = (LinkedAccountsPresenter) obj5;
                LinkedAccountsScreen linkedAccountsScreen = (LinkedAccountsScreen) linkedAccountsPresenter.args;
                FlowStarter flowStarter = (FlowStarter) linkedAccountsPresenter.flowStarter;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) linkedAccountsPresenter.navigator;
                Analytics analytics = (Analytics) linkedAccountsPresenter.analytics;
                MutableState mutableState = (MutableState) obj3;
                MutableState mutableState2 = (MutableState) obj4;
                InstrumentLinkingOption instrumentLinkingOption = (InstrumentLinkingOption) obj2;
                ((InstrumentLinkingOptionsQuestion) obj).getClass();
                if (instrumentLinkingOption instanceof InstrumentLinkingOption.Link) {
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(((InstrumentLinkingOption.Link) instrumentLinkingOption).cashInstrumentType);
                    CashInstrumentType cashInstrumentType = (CashInstrumentType) CollectionsKt.firstOrNull(listOf);
                    analytics.track(new InstrumentLinkInitiate(null, cashInstrumentType != null ? NavArgumentKt.toCdfInstrumentType(cashInstrumentType) : null, 4), null);
                    screenNavigator.goTo(((RealFlowStarter) flowStarter).startProfileLinkingFlow(listOf, linkedAccountsScreen, (String) null));
                } else {
                    if (instrumentLinkingOption instanceof InstrumentLinkingOption.Replace) {
                        List list = (List) mutableState.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj6 : list) {
                            if (((Instrument) obj6).cashInstrumentType == ((InstrumentLinkingOption.Replace) instrumentLinkingOption).cashInstrumentType) {
                                arrayList.add(obj6);
                            }
                        }
                        for (InstrumentLinkingOptionManager$InstrumentLinkingOption instrumentLinkingOptionManager$InstrumentLinkingOption : (List) mutableState2.getValue()) {
                            if (CollectionsKt.first(instrumentLinkingOptionManager$InstrumentLinkingOption.cashInstrumentType) == ((InstrumentLinkingOption.Replace) instrumentLinkingOption).cashInstrumentType) {
                                analytics.track(new InstrumentLinkShowOptions(InstrumentLinkShowOptions.OptionSheetType.REPLACE_INSTRUMENT), null);
                                InstrumentLinkingOptionManager$InstrumentLinkingOption.LinkingAction linkingAction = instrumentLinkingOptionManager$InstrumentLinkingOption.linkingAction;
                                linkingAction.getClass();
                                screenNavigator.askQuestion(InstrumentLinkingOptionsQuestion.INSTANCE, new CardTransitionKt$$ExternalSyntheticLambda4(13, linkingAction, linkedAccountsPresenter, arrayList));
                            }
                        }
                        OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                        return null;
                    }
                    if (!(instrumentLinkingOption instanceof InstrumentLinkingOption.ReplaceInstrument)) {
                        if (instrumentLinkingOption == null) {
                            a$$ExternalSyntheticBUOutline0.m$1("Received a null answer for InstrumentLinkingOptionsQuestion.");
                            return null;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    InstrumentLinkingOption.ReplaceInstrument replaceInstrument = (InstrumentLinkingOption.ReplaceInstrument) instrumentLinkingOption;
                    CashInstrumentType cashInstrumentType2 = replaceInstrument.cashInstrumentType;
                    String str = replaceInstrument.instrumentToken;
                    NavArgumentKt.logInstrumentLinkReplace(analytics, cashInstrumentType2, str);
                    screenNavigator.goTo(((RealFlowStarter) flowStarter).startProfileLinkingFlow(linkedAccountsScreen, cashInstrumentType2, str));
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.RecurringCashInToggleRow((AddMoneyViewModel.RecurringCashInToggle) obj5, (Function0) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                int i6 = BalanceBasedAutoReloadConfirmationView.$r8$clinit;
                ((BalanceBasedAutoReloadConfirmationView) obj5).Content((BalanceBasedAutoReloadConfirmationViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.Content((Modifier) obj5, (InstrumentDetailsViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                InstrumentDetailsViewModel instrumentDetailsViewModel = (InstrumentDetailsViewModel) obj5;
                PaddingValues paddingValues = (PaddingValues) obj3;
                Function1 function1 = (Function1) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    AddMoneyViewKt.Content(SpacerKt.padding(companion, paddingValues), instrumentDetailsViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Function1 function12 = (Function1) obj4;
                RealImageLoader realImageLoader = (RealImageLoader) obj5;
                InstrumentLinkingOptionsViewModel instrumentLinkingOptionsViewModel = (InstrumentLinkingOptionsViewModel) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean changed = gapComposer2.changed(function12);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(i2, function12);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    SheetKt.Sheet((Function0) rememberedValue, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-1949567140, new SheetKt$$ExternalSyntheticLambda5(24, realImageLoader, instrumentLinkingOptionsViewModel, function12), gapComposer2), gapComposer2, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                PaddingValues paddingValues2 = (PaddingValues) obj5;
                InstrumentLinkingOptionsViewModel instrumentLinkingOptionsViewModel2 = (InstrumentLinkingOptionsViewModel) obj3;
                Function1 function13 = (Function1) obj4;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    AddMoneyViewKt.Content(SpacerKt.padding(companion, paddingValues2), instrumentLinkingOptionsViewModel2, function13, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.Content((Modifier) obj5, (InstrumentLinkingOptionsViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.Content((Modifier) obj5, (InstrumentNotLinkedViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                RealImageLoader realImageLoader2 = (RealImageLoader) obj5;
                LinkedAccountsViewModel linkedAccountsViewModel = (LinkedAccountsViewModel) obj3;
                Function1 function14 = (Function1) obj4;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader2), Expect_jvmKt.rememberComposableLambda(-1809561151, new LinkedAccountsViewKt$$ExternalSyntheticLambda2(linkedAccountsViewModel, function14), gapComposer4), gapComposer4, 56);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                int i7 = PendingTransfersConfirmationDialogView.$r8$clinit;
                ((PendingTransfersConfirmationDialogView) obj5).Content((PendingTransfersConfirmationViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.RecurringReloadsChangeInstrumentContent((Modifier) obj5, (RecurringReloadsChangeInstrumentViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                CashQrWidgetKt.QrWidgetContent((Context) obj5, (CashQrWidgetData) obj3, (Intent) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                TableInfoKt.NullStateCarousel((NullStateCarouselViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                int i8 = ArcadeCardControlDialog.$r8$clinit;
                ((ArcadeCardControlDialog) obj5).Content((CardControlDialogViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                Modifier modifier = (Modifier) obj5;
                Function0 function0 = (Function0) obj3;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj4;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Unit unit = Unit.INSTANCE;
                    boolean changed2 = gapComposer5.changed(function0);
                    Object rememberedValue2 = gapComposer5.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(3, function0);
                        gapComposer5.updateRememberedValue(rememberedValue2);
                    }
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier, unit, (PointerInputEventHandler) rememberedValue2);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer5, 0);
                    int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, pointerInput);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Recorder$$ExternalSyntheticOutline1.m(6, composableLambdaImpl, ColumnScopeInstance.INSTANCE, gapComposer5, true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                CardAppletTileKt.CardPillOverlay((CardSchemeViewModel.Module.HeroCardDetails) obj5, (CardAppletTileViewModel.CardPillViewModel) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                UtilsKt.DeliveryStatusRow((CardSchemeViewModel.Module.HeroPaymentDevices.DeliveryStatusRowModel) obj5, (Modifier) obj3, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                UtilsKt.PrepurchaseCardHeaderView((PrepurchaseCardData.CardHeader) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                UtilsKt.PresentationTimelineContent((PresentationTimelineViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                CardSchemeViewModel.Module module = (CardSchemeViewModel.Module) obj5;
                Modifier modifier2 = (Modifier) obj3;
                Function1 function15 = (Function1) obj4;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    HeroCardViewKt.Render((CardSchemeViewModel.Module.HeroCard) module, modifier2, function15, gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                LocalViewFactory localViewFactory = (LocalViewFactory) obj5;
                WalletHomeViewModel$WalletScheme walletHomeViewModel$WalletScheme = (WalletHomeViewModel$WalletScheme) obj3;
                Function1 function16 = (Function1) obj4;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    WalletHomeViewKt.WalletHome(localViewFactory.imageLoader, (RealImageLoader) localViewFactory.addressSearcher, (ElementBoundsRegistry) localViewFactory.mapEngineProvider, walletHomeViewModel$WalletScheme, function16, gapComposer7, 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                MerchantPickerBottomSheetViewKt.MerchantPickerContent((MerchantPickerViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TaxReturnsView$$ExternalSyntheticLambda1(Modifier modifier, Object obj, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = function1;
        this.f$1 = modifier;
    }

    public /* synthetic */ TaxReturnsView$$ExternalSyntheticLambda1(TaxReturnsViewModel taxReturnsViewModel, Function1 function1, Modifier modifier, int i) {
        this.$r8$classId = 4;
        this.f$1 = taxReturnsViewModel;
        this.f$2 = function1;
        this.f$0 = modifier;
    }

    public /* synthetic */ TaxReturnsView$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ TaxReturnsView$$ExternalSyntheticLambda1(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }
}

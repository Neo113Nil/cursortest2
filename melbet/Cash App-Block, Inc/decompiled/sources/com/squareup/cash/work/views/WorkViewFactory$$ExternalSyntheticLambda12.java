package com.squareup.cash.work.views;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import androidx.glance.GlanceModifier;
import androidx.glance.layout.SizeModifiersKt;
import androidx.glance.text.FontWeight;
import androidx.glance.text.TextAlign;
import androidx.glance.text.TextKt;
import androidx.glance.unit.FixedColorProvider;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1$start$2;
import app.cash.local.backend.RefreshMarketingMessagesKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrl;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.filament.RealFilamentSupportProvider;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.instruments.views.CardArtImageKt;
import com.squareup.cash.instruments.views.CardInfoLabelPosition;
import com.squareup.cash.instruments.views.InstrumentCellAlignment;
import com.squareup.cash.instruments.views.InstrumentCellKt;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.overlays.RealOverlayLayer$show$3;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.SheetStateKt;
import com.squareup.cash.sheet.UserDismissMode;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.tax.views.TaxReturnsView$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.views.TaxReturnsViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.transfers.viewmodels.InstrumentDetailsViewModel;
import com.squareup.cash.transfers.viewmodels.InstrumentNotLinkedViewModel;
import com.squareup.cash.transfers.viewmodels.LinkedAccountsNuxViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadOptionViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadsChangeInstrumentViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadsDismissDialogViewModel;
import com.squareup.cash.transfers.viewmodels.ScheduledReloadConfirmationViewModel;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.squareup.cash.transfers.views.InstrumentNotLinkedSheetKt$$ExternalSyntheticLambda3;
import com.squareup.cash.transfers.views.LinkedAccountsViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.transfers.views.RecurringReloadsChangeInstrumentSheetKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidgetData;
import com.squareup.cash.ui.qrcodes.widget.CashQrWidgetKt;
import com.squareup.cash.upsell.viewmodels.UiGroupElementViewModel;
import com.squareup.cash.upsell.viewmodels.UiGroupViewModel;
import com.squareup.cash.wallet.presenters.CardAppletTilePresenter;
import com.squareup.cash.wallet.presenters.CardAppletTilePresenter$Factory$Impl;
import com.squareup.cash.wallet.presenters.CardAppletTileRepository;
import com.squareup.cash.wallet.viewmodels.CardAppletTileViewModel;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardAppletTile;
import com.squareup.cash.wallet.views.CardAppletTileKt;
import com.squareup.cash.wallet.views.CardNuxState;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.RevolvingInteractiveCardsKt;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.cash.wallet.views.lifecycle.WindowBoundLifecycleOwner;
import com.squareup.cash.work.applets.viewmodels.WorkAppletTileModel;
import com.squareup.cash.work.applets.views.WorkAppletTile;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.viewmodels.DeclareCashTipBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.ToastState;
import com.squareup.cash.work.viewmodels.WorkHomeTitleBarViewModel;
import com.squareup.cash.work.views.clockin.ClockInOverlayState;
import com.squareup.cash.work.views.clockin.ClockInOverlayTransitionsKt;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import com.squareup.cash.work.views.pay.PayHomeViewKt$$ExternalSyntheticLambda2;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public final /* synthetic */ class WorkViewFactory$$ExternalSyntheticLambda12 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ WorkViewFactory$$ExternalSyntheticLambda12(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    private final Object invoke$com$squareup$cash$wallet$views$WalletViewsModule$Companion$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        CardAppletTilePresenter$Factory$Impl cardAppletTilePresenter$Factory$Impl = (CardAppletTilePresenter$Factory$Impl) this.f$0;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f$1;
        Navigator navigator = (Navigator) obj;
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        navigator.getClass();
        coroutineScope.getClass();
        Reward$Adapter reward$Adapter = cardAppletTilePresenter$Factory$Impl.delegateFactory;
        CardAppletTileRepository cardAppletTileRepository = (CardAppletTileRepository) ((DoubleCheck) reward$Adapter.avatarsAdapter).getValue();
        MoneyAnalyticsService moneyAnalyticsService = (MoneyAnalyticsService) ((Provider) reward$Adapter.reward_selection_stateAdapter).invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) ((Provider) reward$Adapter.boost_detail_bottom_upsellAdapter).invoke();
        RealFilamentSupportProvider realFilamentSupportProvider = (RealFilamentSupportProvider) ((Provider) reward$Adapter.app_linksAdapter).invoke();
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) ((Provider) reward$Adapter.program_detail_rowsAdapter).invoke();
        RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) ((Provider) reward$Adapter.boost_detail_rowsAdapter).invoke();
        PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl = (PromotedAppletTilePresenter$Factory$Impl) ((Provider) reward$Adapter.boost_attributesAdapter).invoke();
        cardAppletTileRepository.getClass();
        moneyAnalyticsService.getClass();
        androidStringManager.getClass();
        realFilamentSupportProvider.getClass();
        featureFlagManager.getClass();
        realFamilyProfileManager.getClass();
        promotedAppletTilePresenter$Factory$Impl.getClass();
        Presenter.Binding start$default = Presenter.start$default(MoleculePresenterKt.asPresenter$default(new CardAppletTilePresenter(navigator, cardAppletTileRepository, moneyAnalyticsService, androidStringManager, realFilamentSupportProvider, featureFlagManager, realFamilyProfileManager, promotedAppletTilePresenter$Factory$Impl)), coroutineScope, lifecycleOwner);
        return new CardAppletTile(((MoleculePresenterKt$asPresenter$1$start$2) start$default).getModels(), new TaxesAppletViewsModule$$ExternalSyntheticLambda1(start$default, 17), new TaxesAppletViewsModule$$ExternalSyntheticLambda1(start$default, 18), new TaxesAppletViewsModule$$ExternalSyntheticLambda1(start$default, 19));
    }

    private final Object invoke$com$squareup$cash$wallet$views$lifecycle$WindowBoundLifecycleKt$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        WindowBoundLifecycleOwner windowBoundLifecycleOwner = (WindowBoundLifecycleOwner) this.f$0;
        ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) this.f$1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(Modifier.Companion.$$INSTANCE, windowBoundLifecycleOwner);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, onGloballyPositioned);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$work$views$WorkTitleBarViewKt$$ExternalSyntheticLambda2(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        SellerCardKt.WorkTitleBarView((WorkHomeTitleBarViewModel) this.f$0, (Function1) this.f$1, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$work$views$clockin$ClockInOverlayTransitionsKt$$ExternalSyntheticLambda6(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ClockInOverlayTransitionsKt.AnimatedClockStatusBadge((Transition) this.f$0, (Modifier) this.f$1, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$work$views$clockin$ClockInOverlayViewKt$$ExternalSyntheticLambda2(Object obj, Object obj2) {
        ClockInOverlayState clockInOverlayState = (ClockInOverlayState) this.f$1;
        ClockInOverlayViewModel clockInOverlayViewModel = (ClockInOverlayViewModel) this.f$0;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            boolean changed = gapComposer.changed(clockInOverlayState);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                RealOverlayLayer$show$3 realOverlayLayer$show$3 = new RealOverlayLayer$show$3(0, clockInOverlayState, ClockInOverlayState.class, "dismissOverlay", "dismissOverlay()V", 0, 25);
                gapComposer.updateRememberedValue(realOverlayLayer$show$3);
                rememberedValue = realOverlayLayer$show$3;
            }
            SheetKt.Sheet((Function0) ((KFunction) rememberedValue), null, SheetStateKt.rememberSheetState(UserDismissMode.None, gapComposer, 6, 0), null, null, false, null, Expect_jvmKt.rememberComposableLambda(-1724094354, new WorkTitleBarViewKt$$ExternalSyntheticLambda4(11, clockInOverlayViewModel, clockInOverlayState), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$work$views$clockin$ClockInOverlayViewKt$$ExternalSyntheticLambda33(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        DisclaimerTextKt.ClockInOverlayToast((ToastState) this.f$0, (Modifier) this.f$1, (Composer) obj, Updater.updateChangedFlags(1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x0695, code lost:
    
        if (r2 == r1) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0c7c, code lost:
    
        if (r3 == r2) goto L336;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i;
        NeverEqualPolicy neverEqualPolicy;
        Painter painterResource;
        NeverEqualPolicy neverEqualPolicy2;
        boolean z;
        int i2 = this.$r8$classId;
        int i3 = 26;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Continuation continuation = null;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i4 = 13;
        NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
        Object obj3 = this.f$0;
        Object obj4 = this.f$1;
        final int i5 = 1;
        switch (i2) {
            case 0:
                ClockInOverlayViewModel clockInOverlayViewModel = (ClockInOverlayViewModel) obj3;
                Function1 function1 = (Function1) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    DisclaimerTextKt.ClockInOverlayView(clockInOverlayViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.DefaultPaymentMethodRow((InstrumentDetailsViewModel.DefaultState) obj3, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                InstrumentDetailsViewModel instrumentDetailsViewModel = (InstrumentDetailsViewModel) obj3;
                Function1 function12 = (Function1) obj4;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier statusBarsPadding = SpacerKt.statusBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, statusBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    String str = instrumentDetailsViewModel.displayNameCompact;
                    if (str == null) {
                        str = instrumentDetailsViewModel.title;
                    }
                    String str2 = str;
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed = gapComposer2.changed(function12);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy3) {
                        rememberedValue = new TaxReturnsView$$ExternalSyntheticLambda0(29, function12);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub(str2, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 48, 108);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), ImageKt.rememberScrollState(gapComposer2), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, verticalScroll$default);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    InstrumentIcon instrumentIcon = instrumentDetailsViewModel.instrumentIcon;
                    if (instrumentIcon == null) {
                        gapComposer2.startReplaceGroup(-1464479652);
                        i = 0;
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1464479651);
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                        ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        CardArtImageKt.m3576CardArtImageAFY4PWA(SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), instrumentIcon, 16.0f, instrumentDetailsViewModel.cardInfoLabel, instrumentDetailsViewModel.cardNameLabel, CardInfoLabelPosition.BOTTOM_LEFT, false, gapComposer2, 196992, 64);
                        i = 0;
                        gapComposer2.end(false);
                    }
                    DBUtil.SpacerBetweenSectionLarge(i, 1, gapComposer2, null);
                    InstrumentDetailsViewModel.DefaultState defaultState = instrumentDetailsViewModel.defaultState;
                    boolean changed2 = gapComposer2.changed(function12);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (!changed2) {
                        neverEqualPolicy = neverEqualPolicy3;
                        break;
                    } else {
                        neverEqualPolicy = neverEqualPolicy3;
                    }
                    rememberedValue2 = new TaxReturnsView$$ExternalSyntheticLambda0(21, function12);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                    AddMoneyViewKt.DefaultPaymentMethodRow(defaultState, (Function0) rememberedValue2, gapComposer2, 0);
                    gapComposer2.end(true);
                    String str3 = instrumentDetailsViewModel.removeCtaLabel;
                    String str4 = instrumentDetailsViewModel.replaceCtaLabel;
                    boolean changed3 = gapComposer2.changed(function12);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new TaxReturnsView$$ExternalSyntheticLambda0(22, function12);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    Function0 function0 = (Function0) rememberedValue3;
                    boolean changed4 = gapComposer2.changed(function12);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new TaxReturnsView$$ExternalSyntheticLambda0(23, function12);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    }
                    AddMoneyViewKt.InstrumentDetailsActions(0, gapComposer2, null, str3, str4, function0, (Function0) rememberedValue4);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Function1 function13 = (Function1) obj4;
                InstrumentNotLinkedViewModel instrumentNotLinkedViewModel = (InstrumentNotLinkedViewModel) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    boolean changed5 = gapComposer3.changed(function13);
                    Object rememberedValue5 = gapComposer3.rememberedValue();
                    if (changed5 || rememberedValue5 == neverEqualPolicy3) {
                        rememberedValue5 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(4, function13);
                        gapComposer3.updateRememberedValue(rememberedValue5);
                    }
                    SheetKt.Sheet((Function0) rememberedValue5, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1372635766, new InstrumentNotLinkedSheetKt$$ExternalSyntheticLambda3(instrumentNotLinkedViewModel, function13), gapComposer3), gapComposer3, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                    boolean changed6 = gapComposer3.changed(function13);
                    Object rememberedValue6 = gapComposer3.rememberedValue();
                    if (changed6 || rememberedValue6 == neverEqualPolicy3) {
                        rememberedValue6 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(5, function13);
                        gapComposer3.updateRememberedValue(rememberedValue6);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue6, gapComposer3, 0, 1);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Function1 function14 = (Function1) obj4;
                LinkedAccountsNuxViewModel linkedAccountsNuxViewModel = (LinkedAccountsNuxViewModel) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                boolean shouldExecute2 = gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2);
                Applier applier2 = gapComposer4.applier;
                if (shouldExecute2) {
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(companion, 1.0f)), Strings.getColors(gapComposer4).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, Alignment.Companion.Start, gapComposer4, 0);
                    int hashCode3 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer4, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$15);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$16);
                    Integer valueOf2 = Integer.valueOf(hashCode3);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer4, valueOf2, composeUiNode$Companion$SetModifier$17);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer4, materializeModifier3, composeUiNode$Companion$SetModifier$18);
                    NavigationType navigationType2 = NavigationType.CLOSE;
                    boolean changed7 = gapComposer4.changed(function14);
                    Object rememberedValue7 = gapComposer4.rememberedValue();
                    if (changed7 || rememberedValue7 == neverEqualPolicy3) {
                        rememberedValue7 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(7, function14);
                        gapComposer4.updateRememberedValue(rememberedValue7);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue7, (Modifier) null, (Function3) null, gapComposer4, 54, 108);
                    Modifier verticalScroll$default2 = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), ImageKt.rememberScrollState(gapComposer4), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, Alignment.Companion.CenterHorizontally, gapComposer4, 48);
                    int hashCode4 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer4, verticalScroll$default2);
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$15);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$16);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer4, composeUiNode$Companion$SetModifier$17, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    Updater.m576setimpl(gapComposer4, materializeModifier4, composeUiNode$Companion$SetModifier$18);
                    Strings.getSizes(gapComposer4).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), 250.0f);
                    boolean z2 = Strings.getColors(gapComposer4).isLight;
                    if (z2) {
                        gapComposer4.startReplaceGroup(973846747);
                        painterResource = Countries.painterResource(R.drawable.credit_luggage, 0, gapComposer4);
                        gapComposer4.end(false);
                    } else {
                        if (z2) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, 973845034, false);
                        }
                        gapComposer4.startReplaceGroup(973848864);
                        painterResource = Countries.painterResource(R.drawable.credit_luggage_dark, 0, gapComposer4);
                        gapComposer4.end(false);
                    }
                    ImageKt.Image(painterResource, null, m285size3ABfNKs, null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, null, gapComposer4, Painter.$stable | 24624, 104);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer4, null);
                    Strings.getSizes(gapComposer4).getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, Strings.getColors(gapComposer4).semantic.text.prominent, (Composer) gapComposer4, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer4).hero, (TextLineBalancing) null, linkedAccountsNuxViewModel.heroText, (Map) null, (Function1) null, false);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer4, null);
                    gapComposer4.startReplaceGroup(973866680);
                    for (final LinkedAccountsNuxViewModel.InfoItem infoItem : linkedAccountsNuxViewModel.infoItems) {
                        final int i6 = 0;
                        final int i7 = 1;
                        CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(1456892735, new Function2() { // from class: com.squareup.cash.transfers.views.LinkedAccountsNuxViewKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                int i8 = i6;
                                LinkedAccountsNuxViewModel.InfoItem infoItem2 = infoItem;
                                switch (i8) {
                                    case 0:
                                        Composer composer5 = (Composer) obj5;
                                        int intValue5 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                        if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                                            zzd zzdVar = Icons.Companion;
                                            String str5 = infoItem2.icon;
                                            zzdVar.getClass();
                                            Icons icons = zzd.get(str5);
                                            icons.getClass();
                                            Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer5, 48, 12);
                                        } else {
                                            gapComposer5.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer6 = (Composer) obj5;
                                        int intValue6 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, infoItem2.label, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer4), Expect_jvmKt.rememberComposableLambda(1475319488, new Function2() { // from class: com.squareup.cash.transfers.views.LinkedAccountsNuxViewKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                int i8 = i7;
                                LinkedAccountsNuxViewModel.InfoItem infoItem2 = infoItem;
                                switch (i8) {
                                    case 0:
                                        Composer composer5 = (Composer) obj5;
                                        int intValue5 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                        if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                                            zzd zzdVar = Icons.Companion;
                                            String str5 = infoItem2.icon;
                                            zzdVar.getClass();
                                            Icons icons = zzd.get(str5);
                                            icons.getClass();
                                            Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer5, 48, 12);
                                        } else {
                                            gapComposer5.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer6 = (Composer) obj5;
                                        int intValue6 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                        if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, infoItem2.label, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer4), SizeKt.fillMaxWidth(companion, 1.0f), null, false, false, null, null, null, 0L, gapComposer4, 438, 4088);
                    }
                    gapComposer4.end(false);
                    gapComposer4.end(true);
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(TestTagKt.testTag(companion, "linked-accounts-nux-cta"), 1.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer4.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    ((DefaultSizes) gapComposer4.consume(staticProvidableCompositionLocal)).getClass();
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth2, 16.0f, 16.0f);
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean changed8 = gapComposer4.changed(function14);
                    Object rememberedValue8 = gapComposer4.rememberedValue();
                    if (changed8 || rememberedValue8 == neverEqualPolicy3) {
                        rememberedValue8 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(8, function14);
                        gapComposer4.updateRememberedValue(rememberedValue8);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue8, m299paddingVpY3zN4, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(736593314, new TaxReturnsViewKt$$ExternalSyntheticLambda5(linkedAccountsNuxViewModel, i4), gapComposer4), gapComposer4, 1573248, 56);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Function1 function15 = (Function1) obj4;
                RecurringReloadOptionViewModel recurringReloadOptionViewModel = (RecurringReloadOptionViewModel) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                boolean shouldExecute3 = gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2);
                Applier applier3 = gapComposer5.applier;
                if (shouldExecute3) {
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors2 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    Arrangement$Top$1 arrangement$Top$13 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement$Top$13, horizontal2, gapComposer5, 0);
                    int hashCode5 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer5, m177backgroundbw27NRU2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (applier3 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer5.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy5, composeUiNode$Companion$SetModifier$19);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$110 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$110);
                    Integer valueOf3 = Integer.valueOf(hashCode5);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$111 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer5, valueOf3, composeUiNode$Companion$SetModifier$111);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$13);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$112 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer5, materializeModifier5, composeUiNode$Companion$SetModifier$112);
                    NavigationType navigationType3 = NavigationType.BACK;
                    boolean changed9 = gapComposer5.changed(function15);
                    Object rememberedValue9 = gapComposer5.rememberedValue();
                    if (changed9 || rememberedValue9 == neverEqualPolicy3) {
                        rememberedValue9 = new HeroCardViewKt$$ExternalSyntheticLambda5(1, function15);
                        gapComposer5.updateRememberedValue(rememberedValue9);
                    }
                    DBUtil.TitleBarSub("", navigationType3, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue9, (Modifier) null, (Function3) null, gapComposer5, 54, 108);
                    Modifier verticalScroll$default3 = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), ImageKt.rememberScrollState(gapComposer5), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement$Top$13, horizontal2, gapComposer5, 0);
                    int hashCode6 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer5, verticalScroll$default3);
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, columnMeasurePolicy6, composeUiNode$Companion$SetModifier$19);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$110);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode6, gapComposer5, composeUiNode$Companion$SetModifier$111, gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$13);
                    Updater.m576setimpl(gapComposer5, materializeModifier6, composeUiNode$Companion$SetModifier$112);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer5, null);
                    String str5 = recurringReloadOptionViewModel.title;
                    RecurringReloadOptionViewModel.Settings settings = recurringReloadOptionViewModel.settings;
                    ViewfinderDefaults.SectionHeader(str5, (Modifier) null, (String) null, (Function0) null, recurringReloadOptionViewModel.description, gapComposer5, 0, 14);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer5, null);
                    Modifier m299paddingVpY3zN42 = SpacerKt.m299paddingVpY3zN4(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, 16.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer5, 48);
                    int hashCode7 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer5, m299paddingVpY3zN42);
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, rowMeasurePolicy, composeUiNode$Companion$SetModifier$19);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope7, composeUiNode$Companion$SetModifier$110);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode7, gapComposer5, composeUiNode$Companion$SetModifier$111, gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$13);
                    Updater.m576setimpl(gapComposer5, materializeModifier7, composeUiNode$Companion$SetModifier$112);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer5, (Modifier) new LayoutWeightElement(1.0f, true), (TextStyle) null, (TextLineBalancing) null, recurringReloadOptionViewModel.toggleLabel, (Map) null, (Function1) null, false);
                    ButtonProminence buttonProminence2 = ButtonProminence.STANDARD;
                    boolean changed10 = gapComposer5.changed(function15);
                    Object rememberedValue10 = gapComposer5.rememberedValue();
                    if (!changed10) {
                        neverEqualPolicy2 = neverEqualPolicy3;
                        break;
                    } else {
                        neverEqualPolicy2 = neverEqualPolicy3;
                    }
                    rememberedValue10 = new HeroCardViewKt$$ExternalSyntheticLambda5(2, function15);
                    gapComposer5.updateRememberedValue(rememberedValue10);
                    coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue10, null, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(-754050400, new TaxReturnsViewKt$$ExternalSyntheticLambda5(recurringReloadOptionViewModel, 17), gapComposer5), gapComposer5, 1573248, 58);
                    gapComposer5.end(true);
                    DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer5, null);
                    if (settings instanceof RecurringReloadOptionViewModel.Settings.BalanceBased) {
                        gapComposer5.startReplaceGroup(30526865);
                        RecurringReloadOptionViewModel.Settings.BalanceBased balanceBased = (RecurringReloadOptionViewModel.Settings.BalanceBased) settings;
                        RecurringReloadOptionViewModel.SettingRow settingRow = balanceBased.minimumBalance;
                        boolean changed11 = gapComposer5.changed(function15);
                        Object rememberedValue11 = gapComposer5.rememberedValue();
                        if (changed11 || rememberedValue11 == neverEqualPolicy2) {
                            rememberedValue11 = new HeroCardViewKt$$ExternalSyntheticLambda5(3, function15);
                            gapComposer5.updateRememberedValue(rememberedValue11);
                        }
                        AddMoneyViewKt.SettingCell(settingRow, (Function0) rememberedValue11, gapComposer5, 0);
                        RecurringReloadOptionViewModel.SettingRow settingRow2 = balanceBased.incrementAmount;
                        boolean changed12 = gapComposer5.changed(function15);
                        Object rememberedValue12 = gapComposer5.rememberedValue();
                        if (changed12 || rememberedValue12 == neverEqualPolicy2) {
                            rememberedValue12 = new HeroCardViewKt$$ExternalSyntheticLambda5(4, function15);
                            gapComposer5.updateRememberedValue(rememberedValue12);
                        }
                        z = false;
                        AddMoneyViewKt.SettingCell(settingRow2, (Function0) rememberedValue12, gapComposer5, 0);
                        gapComposer5.end(false);
                    } else {
                        if (!(settings instanceof RecurringReloadOptionViewModel.Settings.Scheduled)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer5, -553206588, false);
                        }
                        gapComposer5.startReplaceGroup(30777934);
                        RecurringReloadOptionViewModel.Settings.Scheduled scheduled = (RecurringReloadOptionViewModel.Settings.Scheduled) settings;
                        RecurringReloadOptionViewModel.SettingRow settingRow3 = scheduled.frequency;
                        boolean changed13 = gapComposer5.changed(function15);
                        Object rememberedValue13 = gapComposer5.rememberedValue();
                        if (changed13 || rememberedValue13 == neverEqualPolicy2) {
                            rememberedValue13 = new HeroCardViewKt$$ExternalSyntheticLambda5(5, function15);
                            gapComposer5.updateRememberedValue(rememberedValue13);
                        }
                        AddMoneyViewKt.SettingCell(settingRow3, (Function0) rememberedValue13, gapComposer5, 0);
                        RecurringReloadOptionViewModel.SettingRow settingRow4 = scheduled.frequencyDay;
                        if (settingRow4 == null) {
                            gapComposer5.startReplaceGroup(30896074);
                            gapComposer5.end(false);
                        } else {
                            gapComposer5.startReplaceGroup(30896075);
                            boolean changed14 = gapComposer5.changed(function15);
                            Object rememberedValue14 = gapComposer5.rememberedValue();
                            if (changed14 || rememberedValue14 == neverEqualPolicy2) {
                                rememberedValue14 = new HeroCardViewKt$$ExternalSyntheticLambda5(6, function15);
                                gapComposer5.updateRememberedValue(rememberedValue14);
                            }
                            AddMoneyViewKt.SettingCell(settingRow4, (Function0) rememberedValue14, gapComposer5, 0);
                            gapComposer5.end(false);
                        }
                        RecurringReloadOptionViewModel.SettingRow settingRow5 = scheduled.amount;
                        boolean changed15 = gapComposer5.changed(function15);
                        Object rememberedValue15 = gapComposer5.rememberedValue();
                        if (changed15 || rememberedValue15 == neverEqualPolicy2) {
                            rememberedValue15 = new HeroCardViewKt$$ExternalSyntheticLambda5(7, function15);
                            gapComposer5.updateRememberedValue(rememberedValue15);
                        }
                        z = false;
                        AddMoneyViewKt.SettingCell(settingRow5, (Function0) rememberedValue15, gapComposer5, 0);
                        gapComposer5.end(false);
                    }
                    InstrumentCellViewModel from = settings.getFrom();
                    if (from == null) {
                        gapComposer5.startReplaceGroup(31156660);
                        gapComposer5.end(z);
                    } else {
                        gapComposer5.startReplaceGroup(31156661);
                        InstrumentCellAlignment instrumentCellAlignment = InstrumentCellAlignment.RIGHT;
                        boolean changed16 = gapComposer5.changed(function15);
                        Object rememberedValue16 = gapComposer5.rememberedValue();
                        if (changed16 || rememberedValue16 == neverEqualPolicy2) {
                            rememberedValue16 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(29, function15);
                            gapComposer5.updateRememberedValue(rememberedValue16);
                        }
                        InstrumentCellKt.InstrumentCellSmall(null, from, instrumentCellAlignment, null, (Function0) rememberedValue16, gapComposer5, MLKEMEngine.KyberPolyBytes, 9);
                        gapComposer5.end(false);
                    }
                    gapComposer5.end(true);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.SettingCell((RecurringReloadOptionViewModel.SettingRow) obj3, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                Function1 function16 = (Function1) obj4;
                RecurringReloadsChangeInstrumentViewModel recurringReloadsChangeInstrumentViewModel = (RecurringReloadsChangeInstrumentViewModel) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    boolean changed17 = gapComposer6.changed(function16);
                    Object rememberedValue17 = gapComposer6.rememberedValue();
                    if (changed17 || rememberedValue17 == neverEqualPolicy3) {
                        rememberedValue17 = new HeroCardViewKt$$ExternalSyntheticLambda5(8, function16);
                        gapComposer6.updateRememberedValue(rememberedValue17);
                    }
                    SheetKt.Sheet((Function0) rememberedValue17, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(254995245, new RecurringReloadsChangeInstrumentSheetKt$$ExternalSyntheticLambda3(recurringReloadsChangeInstrumentViewModel, function16), gapComposer6), gapComposer6, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                    boolean changed18 = gapComposer6.changed(function16);
                    Object rememberedValue18 = gapComposer6.rememberedValue();
                    if (changed18 || rememberedValue18 == neverEqualPolicy3) {
                        rememberedValue18 = new HeroCardViewKt$$ExternalSyntheticLambda5(9, function16);
                        gapComposer6.updateRememberedValue(rememberedValue18);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue18, gapComposer6, 0, 1);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                final Function1 function17 = (Function1) obj4;
                final RecurringReloadsDismissDialogViewModel recurringReloadsDismissDialogViewModel = (RecurringReloadsDismissDialogViewModel) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    boolean changed19 = gapComposer7.changed(function17);
                    Object rememberedValue19 = gapComposer7.rememberedValue();
                    if (changed19 || rememberedValue19 == neverEqualPolicy3) {
                        rememberedValue19 = new HeroCardViewKt$$ExternalSyntheticLambda5(11, function17);
                        gapComposer7.updateRememberedValue(rememberedValue19);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue19, gapComposer7, 0, 1);
                    String str6 = recurringReloadsDismissDialogViewModel.title;
                    String str7 = recurringReloadsDismissDialogViewModel.body;
                    final int i8 = r3 ? 1 : 0;
                    ModalKt.Modal((Modifier) null, str6, str7, Expect_jvmKt.rememberComposableLambda(1425291204, new Function3() { // from class: com.squareup.cash.transfers.views.RecurringReloadsDismissDialogViewKt$$ExternalSyntheticLambda3
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i9 = i8;
                            NeverEqualPolicy neverEqualPolicy4 = Composer.Companion.Empty;
                            final RecurringReloadsDismissDialogViewModel recurringReloadsDismissDialogViewModel2 = recurringReloadsDismissDialogViewModel;
                            Function1 function18 = function17;
                            Object[] objArr = 0;
                            char c = 1;
                            switch (i9) {
                                case 0:
                                    ModalButtonScope modalButtonScope = (ModalButtonScope) obj5;
                                    Composer composer8 = (Composer) obj6;
                                    int intValue8 = ((Integer) obj7).intValue();
                                    modalButtonScope.getClass();
                                    if ((intValue8 & 6) == 0) {
                                        intValue8 |= ((GapComposer) composer8).changed(modalButtonScope) ? 4 : 2;
                                    }
                                    GapComposer gapComposer8 = (GapComposer) composer8;
                                    if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18)) {
                                        boolean changed20 = gapComposer8.changed(function18);
                                        Object rememberedValue20 = gapComposer8.rememberedValue();
                                        if (changed20 || rememberedValue20 == neverEqualPolicy4) {
                                            rememberedValue20 = new HeroCardViewKt$$ExternalSyntheticLambda5(12, function18);
                                            gapComposer8.updateRememberedValue(rememberedValue20);
                                        }
                                        final Object[] objArr2 = objArr == true ? 1 : 0;
                                        modalButtonScope.PrimaryModalButton((Function0) rememberedValue20, null, false, Expect_jvmKt.rememberComposableLambda(-2094640689, new Function3() { // from class: com.squareup.cash.transfers.views.RecurringReloadsDismissDialogViewKt$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                int i10 = objArr2;
                                                RecurringReloadsDismissDialogViewModel recurringReloadsDismissDialogViewModel3 = recurringReloadsDismissDialogViewModel2;
                                                switch (i10) {
                                                    case 0:
                                                        Composer composer9 = (Composer) obj9;
                                                        int intValue9 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer9 = (GapComposer) composer9;
                                                        if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, recurringReloadsDismissDialogViewModel3.primaryButtonLabel, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer9.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer10 = (Composer) obj9;
                                                        int intValue10 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer10 = (GapComposer) composer10;
                                                        if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, recurringReloadsDismissDialogViewModel3.secondaryButtonLabel, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer10.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer8), gapComposer8, (57344 & (intValue8 << 12)) | 3072, 6);
                                    } else {
                                        gapComposer8.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj5;
                                    Composer composer9 = (Composer) obj6;
                                    int intValue9 = ((Integer) obj7).intValue();
                                    modalButtonScope2.getClass();
                                    if ((intValue9 & 6) == 0) {
                                        intValue9 |= ((GapComposer) composer9).changed(modalButtonScope2) ? 4 : 2;
                                    }
                                    GapComposer gapComposer9 = (GapComposer) composer9;
                                    if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                                        boolean changed21 = gapComposer9.changed(function18);
                                        Object rememberedValue21 = gapComposer9.rememberedValue();
                                        if (changed21 || rememberedValue21 == neverEqualPolicy4) {
                                            rememberedValue21 = new HeroCardViewKt$$ExternalSyntheticLambda5(13, function18);
                                            gapComposer9.updateRememberedValue(rememberedValue21);
                                        }
                                        final char c2 = c == true ? 1 : 0;
                                        modalButtonScope2.SecondaryModalButton((Function0) rememberedValue21, null, false, Expect_jvmKt.rememberComposableLambda(-539115262, new Function3() { // from class: com.squareup.cash.transfers.views.RecurringReloadsDismissDialogViewKt$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                int i10 = c2;
                                                RecurringReloadsDismissDialogViewModel recurringReloadsDismissDialogViewModel3 = recurringReloadsDismissDialogViewModel2;
                                                switch (i10) {
                                                    case 0:
                                                        Composer composer92 = (Composer) obj9;
                                                        int intValue92 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer92 = (GapComposer) composer92;
                                                        if (gapComposer92.shouldExecute(intValue92 & 1, (intValue92 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer92, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, recurringReloadsDismissDialogViewModel3.primaryButtonLabel, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer92.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer10 = (Composer) obj9;
                                                        int intValue10 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer10 = (GapComposer) composer10;
                                                        if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, recurringReloadsDismissDialogViewModel3.secondaryButtonLabel, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer10.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer9), gapComposer9, ((intValue9 << 12) & 57344) | 3072, 6);
                                    } else {
                                        gapComposer9.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer7), Expect_jvmKt.rememberComposableLambda(-1054188603, new Function3() { // from class: com.squareup.cash.transfers.views.RecurringReloadsDismissDialogViewKt$$ExternalSyntheticLambda3
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i9 = i5;
                            NeverEqualPolicy neverEqualPolicy4 = Composer.Companion.Empty;
                            final RecurringReloadsDismissDialogViewModel recurringReloadsDismissDialogViewModel2 = recurringReloadsDismissDialogViewModel;
                            Function1 function18 = function17;
                            Object[] objArr = 0;
                            char c = 1;
                            switch (i9) {
                                case 0:
                                    ModalButtonScope modalButtonScope = (ModalButtonScope) obj5;
                                    Composer composer8 = (Composer) obj6;
                                    int intValue8 = ((Integer) obj7).intValue();
                                    modalButtonScope.getClass();
                                    if ((intValue8 & 6) == 0) {
                                        intValue8 |= ((GapComposer) composer8).changed(modalButtonScope) ? 4 : 2;
                                    }
                                    GapComposer gapComposer8 = (GapComposer) composer8;
                                    if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18)) {
                                        boolean changed20 = gapComposer8.changed(function18);
                                        Object rememberedValue20 = gapComposer8.rememberedValue();
                                        if (changed20 || rememberedValue20 == neverEqualPolicy4) {
                                            rememberedValue20 = new HeroCardViewKt$$ExternalSyntheticLambda5(12, function18);
                                            gapComposer8.updateRememberedValue(rememberedValue20);
                                        }
                                        final int objArr2 = objArr == true ? 1 : 0;
                                        modalButtonScope.PrimaryModalButton((Function0) rememberedValue20, null, false, Expect_jvmKt.rememberComposableLambda(-2094640689, new Function3() { // from class: com.squareup.cash.transfers.views.RecurringReloadsDismissDialogViewKt$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                int i10 = objArr2;
                                                RecurringReloadsDismissDialogViewModel recurringReloadsDismissDialogViewModel3 = recurringReloadsDismissDialogViewModel2;
                                                switch (i10) {
                                                    case 0:
                                                        Composer composer92 = (Composer) obj9;
                                                        int intValue92 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer92 = (GapComposer) composer92;
                                                        if (gapComposer92.shouldExecute(intValue92 & 1, (intValue92 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer92, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, recurringReloadsDismissDialogViewModel3.primaryButtonLabel, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer92.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer10 = (Composer) obj9;
                                                        int intValue10 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer10 = (GapComposer) composer10;
                                                        if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, recurringReloadsDismissDialogViewModel3.secondaryButtonLabel, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer10.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer8), gapComposer8, (57344 & (intValue8 << 12)) | 3072, 6);
                                    } else {
                                        gapComposer8.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj5;
                                    Composer composer9 = (Composer) obj6;
                                    int intValue9 = ((Integer) obj7).intValue();
                                    modalButtonScope2.getClass();
                                    if ((intValue9 & 6) == 0) {
                                        intValue9 |= ((GapComposer) composer9).changed(modalButtonScope2) ? 4 : 2;
                                    }
                                    GapComposer gapComposer9 = (GapComposer) composer9;
                                    if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                                        boolean changed21 = gapComposer9.changed(function18);
                                        Object rememberedValue21 = gapComposer9.rememberedValue();
                                        if (changed21 || rememberedValue21 == neverEqualPolicy4) {
                                            rememberedValue21 = new HeroCardViewKt$$ExternalSyntheticLambda5(13, function18);
                                            gapComposer9.updateRememberedValue(rememberedValue21);
                                        }
                                        final int c2 = c == true ? 1 : 0;
                                        modalButtonScope2.SecondaryModalButton((Function0) rememberedValue21, null, false, Expect_jvmKt.rememberComposableLambda(-539115262, new Function3() { // from class: com.squareup.cash.transfers.views.RecurringReloadsDismissDialogViewKt$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                int i10 = c2;
                                                RecurringReloadsDismissDialogViewModel recurringReloadsDismissDialogViewModel3 = recurringReloadsDismissDialogViewModel2;
                                                switch (i10) {
                                                    case 0:
                                                        Composer composer92 = (Composer) obj9;
                                                        int intValue92 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer92 = (GapComposer) composer92;
                                                        if (gapComposer92.shouldExecute(intValue92 & 1, (intValue92 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer92, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, recurringReloadsDismissDialogViewModel3.primaryButtonLabel, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer92.skipToGroupEnd();
                                                        }
                                                        break;
                                                    default:
                                                        Composer composer10 = (Composer) obj9;
                                                        int intValue10 = ((Integer) obj10).intValue();
                                                        ((RowScope) obj8).getClass();
                                                        GapComposer gapComposer10 = (GapComposer) composer10;
                                                        if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, recurringReloadsDismissDialogViewModel3.secondaryButtonLabel, (Map) null, (Function1) null, false);
                                                        } else {
                                                            gapComposer10.skipToGroupEnd();
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer9), gapComposer9, ((intValue9 << 12) & 57344) | 3072, 6);
                                    } else {
                                        gapComposer9.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer7), (Function3) null, gapComposer7, 27648, 33);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.ScheduledReloadConfirmation((ScheduledReloadConfirmationViewModel.Content) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                WithdrawViewModel.DepositPreferenceOption depositPreferenceOption = (WithdrawViewModel.DepositPreferenceOption) obj3;
                WithdrawViewModel.ViewAmount.DepositPreferenceStyle depositPreferenceStyle = (WithdrawViewModel.ViewAmount.DepositPreferenceStyle) obj4;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    ((DefaultSizes) gapComposer8.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer8, 48);
                    int hashCode8 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope8 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier8 = PlatformKt.materializeModifier(gapComposer8, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer8.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, rowMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope8, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer8, Integer.valueOf(hashCode8), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer8, materializeModifier8, ComposeUiNode.Companion.SetModifier);
                    String str8 = depositPreferenceOption.feeLabel;
                    if (str8 == null) {
                        gapComposer8.startReplaceGroup(2015258177);
                        String str9 = depositPreferenceOption.title;
                        TextStyle textStyle = ((Typography) gapComposer8.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                        Colors colors3 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                        } else {
                            gapComposer8.startReplaceGroup(-1762997739);
                            gapComposer8.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors3.semantic.text.standard, (Composer) gapComposer8, (Modifier) null, textStyle, (TextLineBalancing) null, str9, (Map) null, (Function1) null, false);
                        gapComposer8.end(false);
                    } else {
                        gapComposer8.startReplaceGroup(-1951252991);
                        OffsetKt.FlowRow(null, null, null, null, 0, 0, Expect_jvmKt.rememberComposableLambda(-550524194, new SheetKt$$ExternalSyntheticLambda5(25, depositPreferenceOption, depositPreferenceStyle, str8), gapComposer8), gapComposer8, 1572864, 63);
                        gapComposer8.end(false);
                    }
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                PageTagSlotKt$$ExternalSyntheticLambda0 pageTagSlotKt$$ExternalSyntheticLambda0 = (PageTagSlotKt$$ExternalSyntheticLambda0) obj3;
                Context context = (Context) obj4;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    coil3.size.SizeKt.Button(pageTagSlotKt$$ExternalSyntheticLambda0, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(911045974, new TaxReturnsViewKt$$ExternalSyntheticLambda5(context, i3), gapComposer9), gapComposer9, 1572864, 62);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Context context2 = (Context) obj3;
                Intent intent = (Intent) obj4;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Object rememberedValue20 = gapComposer10.rememberedValue();
                    if (rememberedValue20 == neverEqualPolicy3) {
                        context2.getClass();
                        rememberedValue20 = FlowKt.channelFlow(new TaxWebAppBridge.AnonymousClass3(context2, continuation, 27));
                        gapComposer10.updateRememberedValue(rememberedValue20);
                    }
                    CashQrWidgetKt.QrWidgetContent(context2, (CashQrWidgetData) Updater.collectAsState((Flow) rememberedValue20, new CashQrWidgetData(null, null), null, gapComposer10, 0, 2).getValue(), intent, gapComposer10, 0);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                CashQrWidgetData cashQrWidgetData = (CashQrWidgetData) obj3;
                Context context3 = (Context) obj4;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Bitmap bitmap = cashQrWidgetData.qrImage;
                    if (bitmap != null) {
                        gapComposer11.startReplaceGroup(267061496);
                        androidx.glance.layout.ColumnKt.m1126ColumnK4GKKTE(SizeModifiersKt.fillMaxSize(GlanceModifier.Companion.$$INSTANCE), 1, 1, Expect_jvmKt.rememberComposableLambda(-1635824001, new TabToolbarsKt$$ExternalSyntheticLambda3(i3, bitmap, cashQrWidgetData), gapComposer11), gapComposer11, 3072);
                        gapComposer11.end(false);
                    } else {
                        gapComposer11.startReplaceGroup(268024604);
                        String string2 = context3.getString(R.string.qr_code_widget_empty_cta);
                        string2.getClass();
                        TextKt.Text(string2, null, new androidx.glance.text.TextStyle(new FixedColorProvider(Color.Black), new TextUnit(Room.getSp(13)), new FontWeight(), new TextAlign(), 104), 0, gapComposer11, 0, 10);
                        gapComposer11.end(false);
                    }
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                zzrl.NullStateUiGroupContent((UiGroupViewModel) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                zzrl.ImageOrVisual((UiGroupElementViewModel) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                zzrl.NullStateText((UiGroupElementViewModel.TextViewModel) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                CardAppletTileKt.CardPillOverlay((CardSchemeViewModel.Module.HeroCardDetails) obj3, (CardAppletTileViewModel.CardPillViewModel) obj4, companion, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                UtilsKt.Disclosure((CardSchemeViewModel.Module.Disclosure) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                RevolvingInteractiveCardsKt.CardGridPreInit((List) obj3, (CardNuxState) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                return invoke$com$squareup$cash$wallet$views$WalletViewsModule$Companion$$ExternalSyntheticLambda0(obj, obj2);
            case 21:
                return invoke$com$squareup$cash$wallet$views$lifecycle$WindowBoundLifecycleKt$$ExternalSyntheticLambda1(obj, obj2);
            case 22:
                WorkAppletTile workAppletTile = (WorkAppletTile) obj3;
                State state = (State) obj4;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    RefreshMarketingMessagesKt.UI((WorkAppletTileModel) state.getValue(), (TaxesAppletViewsModule$$ExternalSyntheticLambda1) workAppletTile.onClick, gapComposer12, 0);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                RefreshMarketingMessagesKt.UI((WorkAppletTileModel) obj3, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                RefreshMarketingMessagesKt.LoadingUI((String) obj3, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                return invoke$com$squareup$cash$work$views$WorkTitleBarViewKt$$ExternalSyntheticLambda2(obj, obj2);
            case 26:
                return invoke$com$squareup$cash$work$views$clockin$ClockInOverlayTransitionsKt$$ExternalSyntheticLambda6(obj, obj2);
            case 27:
                return invoke$com$squareup$cash$work$views$clockin$ClockInOverlayViewKt$$ExternalSyntheticLambda2(obj, obj2);
            case 28:
                return invoke$com$squareup$cash$work$views$clockin$ClockInOverlayViewKt$$ExternalSyntheticLambda33(obj, obj2);
            default:
                Function1 function18 = (Function1) obj4;
                DeclareCashTipBottomSheetViewModel declareCashTipBottomSheetViewModel = (DeclareCashTipBottomSheetViewModel) obj3;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    boolean changed20 = gapComposer13.changed(function18);
                    Object rememberedValue21 = gapComposer13.rememberedValue();
                    int i9 = 12;
                    if (changed20 || rememberedValue21 == neverEqualPolicy3) {
                        rememberedValue21 = new PayHomeViewKt$$ExternalSyntheticLambda2(12, function18);
                        gapComposer13.updateRememberedValue(rememberedValue21);
                    }
                    SheetKt.Sheet((Function0) rememberedValue21, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1810775261, new WorkTitleBarViewKt$$ExternalSyntheticLambda4(i9, (Object) declareCashTipBottomSheetViewModel, function18), gapComposer13), gapComposer13, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ WorkViewFactory$$ExternalSyntheticLambda12(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ WorkViewFactory$$ExternalSyntheticLambda12(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = obj2;
    }
}

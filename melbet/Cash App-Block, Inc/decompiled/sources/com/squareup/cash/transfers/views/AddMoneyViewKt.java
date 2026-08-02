package com.squareup.cash.transfers.views;

import android.content.res.Configuration;
import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$1$1;
import androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda5;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda7;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.navigation.compose.NavHostKt$NavHost$33$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda0;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda1;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SelectionViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.instruments.views.CardArtImageKt;
import com.squareup.cash.instruments.views.InstrumentCellAlignment;
import com.squareup.cash.instruments.views.InstrumentCellKt;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda9;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.moneybot.widgets.FullscreenNoticeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.offers.views.OffersSearchViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda41;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda4;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.SheetPeekPosition$FixedHeight;
import com.squareup.cash.shopping.views.ShopErrorKt$$ExternalSyntheticLambda0;
import com.squareup.cash.support.views.article.ArticleViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.tabs.views.ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda17;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.taptopay.views.TapToPayFirstTimeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.taptopay.views.TapToPayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.views.TaxReturnsView$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.views.TaxReturnsView$$ExternalSyntheticLambda1;
import com.squareup.cash.tax.views.TaxReturnsViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.tax.views.TaxTooltipView$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda1;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.transfers.viewmodels.BalanceBasedAddCashDisabledDialogViewModel;
import com.squareup.cash.transfers.viewmodels.BalanceBasedAutoReloadConfirmationViewModel;
import com.squareup.cash.transfers.viewmodels.InstrumentDetailsViewModel;
import com.squareup.cash.transfers.viewmodels.InstrumentLinkingOptionsViewModel;
import com.squareup.cash.transfers.viewmodels.InstrumentNotLinkedViewModel;
import com.squareup.cash.transfers.viewmodels.LinkedAccountsNuxViewModel;
import com.squareup.cash.transfers.viewmodels.LinkedAccountsViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadOptionViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadsChangeInstrumentViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadsDismissDialogViewModel;
import com.squareup.cash.transfers.viewmodels.ScheduledReloadConfirmationViewModel;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel$AmountConfig$KeypadConfig;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda4;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadAmount;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda16;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$4$1;
import com.squareup.cash.work.views.ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.work.webview.views.WorkWebViewKt$$ExternalSyntheticLambda14;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.util.Strings;
import com.squareup.util.android.ViewGroups$$ExternalSyntheticLambda0;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.LifecycleKt$$ExternalSyntheticLambda0;
import com.squareup.util.compose.SharedViewEventsKt;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda4;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class AddMoneyViewKt {

    /* renamed from: lambda$-2093542017, reason: not valid java name */
    public static final ComposableLambdaImpl f733lambda$2093542017 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(16), false, -2093542017);
    public static final ComposableLambdaImpl lambda$904857959 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(17), false, 904857959);
    public static final ComposableLambdaImpl lambda$902255226 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(18), false, 902255226);
    public static final ComposableLambdaImpl lambda$2017508457 = new ComposableLambdaImpl(new TapToPayKt$$ExternalSyntheticLambda0(21), false, 2017508457);
    public static final ComposableLambdaImpl lambda$731418900 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(19), false, 731418900);

    /* renamed from: lambda$-308867670, reason: not valid java name */
    public static final ComposableLambdaImpl f734lambda$308867670 = new ComposableLambdaImpl(new TapToPayKt$$ExternalSyntheticLambda0(23), false, -308867670);
    public static final ComposableLambdaImpl lambda$1551846774 = new ComposableLambdaImpl(new TapToPayKt$$ExternalSyntheticLambda0(24), false, 1551846774);
    public static final ComposableLambdaImpl lambda$52735271 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(8), false, 52735271);

    /* renamed from: lambda$-1936656939, reason: not valid java name */
    public static final ComposableLambdaImpl f732lambda$1936656939 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(9), false, -1936656939);

    /* renamed from: lambda$-328994883, reason: not valid java name */
    public static final ComposableLambdaImpl f736lambda$328994883 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(10), false, -328994883);

    /* renamed from: lambda$-156580802, reason: not valid java name */
    public static final ComposableLambdaImpl f731lambda$156580802 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(11), false, -156580802);

    /* renamed from: lambda$-974023911, reason: not valid java name */
    public static final ComposableLambdaImpl f738lambda$974023911 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(12), false, -974023911);
    public static final ComposableLambdaImpl lambda$745845477 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(13), false, 745845477);

    /* renamed from: lambda$-31002160, reason: not valid java name */
    public static final ComposableLambdaImpl f735lambda$31002160 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(20), false, -31002160);

    /* renamed from: lambda$-643985123, reason: not valid java name */
    public static final ComposableLambdaImpl f737lambda$643985123 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(21), false, -643985123);

    public static final void AddMoneyAtmPicker(Modifier modifier, AddMoneyViewModel.AtmPicker atmPicker, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        atmPicker.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-307272713);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(atmPicker) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            String str = atmPicker.title;
            String str2 = atmPicker.subtitle;
            AtmHeader(0, gapComposer, m300paddingVpY3zN4$default, str, str2, str2 != null);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            InputChipKt.InputChipGrid(SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2), 0, Expect_jvmKt.rememberComposableLambda(-779835112, new SheetKt$$ExternalSyntheticLambda5(22, atmPicker, function1, function0), gapComposer), gapComposer, 390, 2);
            gapComposer = gapComposer;
            AddMoneyFooter(atmPicker, function1, gapComposer, (i2 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(modifier, (AddMoneyViewModel) atmPicker, function1, function0, i, 28);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v10 */
    public static final void AddMoneyFooter(AddMoneyViewModel addMoneyViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        ?? r13;
        GapComposer gapComposer;
        int i3;
        NeverEqualPolicy neverEqualPolicy;
        View view;
        Modifier modifier;
        boolean z;
        GapComposer gapComposer2;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(1198213776);
        if ((i & 6) == 0) {
            i2 = (gapComposer3.changedInstance(addMoneyViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= gapComposer3.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2;
        if (gapComposer3.shouldExecute(i5 & 1, (i5 & 19) != 18)) {
            View view2 = (View) gapComposer3.consume(AndroidCompositionLocals_androidKt.LocalView);
            if (addMoneyViewModel.getRecurringCashInToggle() != null) {
                gapComposer3.startReplaceGroup(432208842);
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer3, null);
                gapComposer3.end(false);
            } else if (addMoneyViewModel.getPayWithGooglePayLabel() == null && addMoneyViewModel.getInstrumentCellViewModel() == null) {
                gapComposer3.startReplaceGroup(432213867);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
                gapComposer3.end(false);
            } else {
                gapComposer3.startReplaceGroup(432212587);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                gapComposer3.end(false);
            }
            InstrumentCellViewModel instrumentCellViewModel = addMoneyViewModel.getInstrumentCellViewModel();
            int i6 = 12;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (instrumentCellViewModel == null) {
                gapComposer3.startReplaceGroup(513808683);
                gapComposer3.end(false);
                view = view2;
                z = false;
                neverEqualPolicy = neverEqualPolicy2;
                i3 = i5;
                modifier = null;
                gapComposer2 = gapComposer3;
            } else {
                gapComposer3.startReplaceGroup(513808684);
                Object rememberedValue = gapComposer3.rememberedValue();
                if (rememberedValue == neverEqualPolicy2) {
                    rememberedValue = new TaxWebAppBridge$$ExternalSyntheticLambda1(i4);
                    gapComposer3.updateRememberedValue(rememberedValue);
                }
                Function1 function12 = (Function1) rememberedValue;
                Object rememberedValue2 = gapComposer3.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy2) {
                    rememberedValue2 = new TaxWebAppBridge$$ExternalSyntheticLambda1(17);
                    gapComposer3.updateRememberedValue(rememberedValue2);
                }
                GapComposer gapComposer4 = gapComposer3;
                i3 = i5;
                neverEqualPolicy = neverEqualPolicy2;
                view = view2;
                modifier = null;
                z = false;
                AnimatedContentKt.AnimatedContent(instrumentCellViewModel, null, function12, null, "instrument-cell-animation", (Function1) rememberedValue2, Expect_jvmKt.rememberComposableLambda(-42896051, new PoolDetailsViewKt$$ExternalSyntheticLambda41(i6, view2, function1), gapComposer3), gapComposer4, 1794432, 10);
                gapComposer4.end(false);
                gapComposer2 = gapComposer4;
            }
            AddMoneyViewModel.RecurringCashInToggle recurringCashInToggle = addMoneyViewModel.getRecurringCashInToggle();
            if (recurringCashInToggle == null) {
                gapComposer2.startReplaceGroup(514347990);
                gapComposer2.end(z);
            } else {
                gapComposer2.startReplaceGroup(514347991);
                if (addMoneyViewModel.getInstrumentCellViewModel() != null) {
                    gapComposer2.startReplaceGroup(1065301702);
                    DBUtil.SpacerWithinSectionSmall(z ? 1 : 0, 1, gapComposer2, modifier);
                    gapComposer2.end(z);
                } else {
                    gapComposer2.startReplaceGroup(1065340142);
                    gapComposer2.end(z);
                }
                boolean z2 = (i3 & 112) == 32 ? true : z ? 1 : 0;
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (z2 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new TaxReturnsView$$ExternalSyntheticLambda0(12, function1);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                RecurringCashInToggleRow(recurringCashInToggle, (Function0) rememberedValue3, modifier, gapComposer2, z ? 1 : 0);
                DBUtil.SpacerWithinSectionSmall(z ? 1 : 0, 1, gapComposer2, modifier);
                gapComposer2.end(z);
            }
            GapComposer gapComposer5 = gapComposer2;
            DimensionKt.ButtonCtaGroup(SpacerKt.imePadding(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f)), false, null, null, Expect_jvmKt.rememberComposableLambda(-369265458, new SheetKt$$ExternalSyntheticLambda5(21, addMoneyViewModel, view, function1), gapComposer2), gapComposer5, 24576, 14);
            gapComposer = gapComposer5;
            DBUtil.SpacerWithinSectionSmall(z ? 1 : 0, 1, gapComposer, modifier);
            r13 = z;
        } else {
            r13 = 0;
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(addMoneyViewModel, function1, i, r13);
        }
    }

    public static final void AddMoneyKeypad(Modifier modifier, AddMoneyViewModel.Keypad keypad, Function1 function1, MoneyFormatter moneyFormatter, RealCashVibrator realCashVibrator, Composer composer, int i) {
        Modifier modifier2;
        int i2;
        GapComposer gapComposer;
        Function1 function12;
        AddMoneyViewModel.Keypad keypad2;
        int i3;
        Object[] objArr;
        FocusRequester focusRequester;
        Object obj;
        AmountDisplayState amountDisplayState;
        KeypadAmount keypadAmount;
        View view;
        Shaker shaker;
        AddMoneyViewModel.Keypad keypad3 = keypad;
        keypad3.getClass();
        function1.getClass();
        moneyFormatter.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1357132273);
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i2 = (gapComposer2.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(keypad3) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(moneyFormatter) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(realCashVibrator) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(modifier2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, navigationBarsPadding);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            Continuation continuation = null;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function0);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            View view2 = (View) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalView);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1);
            NavigationType navigationType = NavigationType.CLOSE;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-755699809, new FieldBinding$$ExternalSyntheticLambda4(keypad3, 3), gapComposer2);
            int i4 = i2 & 896;
            boolean changedInstance = gapComposer2.changedInstance(view2) | (i4 == 256);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == obj2) {
                rememberedValue = new AddMoneyViewKt$$ExternalSyntheticLambda1(view2, function1, 0);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(rememberComposableLambda, navigationType, m177backgroundbw27NRU, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, lambda$902255226, gapComposer2, 1572918, 40);
            gapComposer = gapComposer2;
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            SpacerKt.Spacer(gapComposer, columnScopeInstance.weight(1.0f, companion, true));
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj2) {
                rememberedValue2 = new KeypadAmount();
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            KeypadAmount keypadAmount2 = (KeypadAmount) rememberedValue2;
            FocusRequester rememberFocusRequesterAndRequestFocus = DBUtil.rememberFocusRequesterAndRequestFocus(gapComposer);
            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(true, gapComposer, 0);
            Money money = keypad3.currentAmount;
            CurrencyCode currencyCode = money.currency_code;
            currencyCode.getClass();
            AmountConfig.MoneyConfig moneyConfig = new AmountConfig.MoneyConfig(currencyCode, null, false, 0, 14);
            int i5 = i2;
            String format2 = moneyFormatter.format(money);
            boolean z = i4 == 256;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z || rememberedValue3 == obj2) {
                i3 = i4;
                rememberedValue3 = new ScoreHomeKt$$ExternalSyntheticLambda5(27, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            } else {
                i3 = i4;
            }
            AmountDisplayState rememberAmountDisplayState = ConnectionPoolKt.rememberAmountDisplayState(moneyConfig, format2, (Function1) rememberedValue3, gapComposer, 0);
            Object[] objArr2 = {keypadAmount2, rememberAmountDisplayState, realCashVibrator, rememberShaker};
            boolean changedInstance2 = gapComposer.changedInstance(keypadAmount2) | gapComposer.changed(rememberAmountDisplayState) | gapComposer.changedInstance(rememberShaker) | gapComposer.changedInstance(realCashVibrator) | gapComposer.changedInstance(moneyFormatter) | gapComposer.changedInstance(keypad3);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue4 == obj2) {
                objArr = objArr2;
                focusRequester = rememberFocusRequesterAndRequestFocus;
                obj = obj2;
                amountDisplayState = rememberAmountDisplayState;
                keypadAmount = keypadAmount2;
                view = view2;
                Object navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(keypadAmount, moneyFormatter, keypad3, amountDisplayState, rememberShaker, realCashVibrator, (Continuation) null, 18);
                keypad3 = keypad3;
                shaker = rememberShaker;
                gapComposer.updateRememberedValue(navHostKt$NavHost$33$1);
                rememberedValue4 = navHostKt$NavHost$33$1;
            } else {
                shaker = rememberShaker;
                amountDisplayState = rememberAmountDisplayState;
                objArr = objArr2;
                keypadAmount = keypadAmount2;
                focusRequester = rememberFocusRequesterAndRequestFocus;
                view = view2;
                obj = obj2;
            }
            Updater.LaunchedEffect(objArr, (Function2) rememberedValue4, gapComposer);
            CurrencyCode currencyCode2 = money.currency_code;
            Money money2 = keypad3.maxAmount;
            boolean changed = gapComposer.changed(amountDisplayState) | gapComposer.changedInstance(keypad3) | gapComposer.changedInstance(keypadAmount);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changed || rememberedValue5 == obj) {
                KeypadAmount keypadAmount3 = keypadAmount;
                AmountDisplayState amountDisplayState2 = amountDisplayState;
                Object logger$_log$2 = new Logger$_log$2(amountDisplayState2, keypad3, keypadAmount3, continuation, 5);
                amountDisplayState = amountDisplayState2;
                keypad2 = keypad3;
                keypadAmount = keypadAmount3;
                gapComposer.updateRememberedValue(logger$_log$2);
                rememberedValue5 = logger$_log$2;
            } else {
                keypad2 = keypad3;
            }
            Updater.LaunchedEffect(currencyCode2, money2, amountDisplayState, (Function2) rememberedValue5, gapComposer);
            Modifier align = columnScopeInstance.align(SharedViewEventsKt.shakeWith(SizeKt.fillMaxWidth(companion, 1.0f), shaker), Alignment.Companion.CenterHorizontally);
            boolean changedInstance3 = gapComposer.changedInstance(view) | (i3 == 256);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue6 == obj) {
                function12 = function1;
                rememberedValue6 = new AddMoneyViewKt$$ExternalSyntheticLambda1(view, function12, 7);
                gapComposer.updateRememberedValue(rememberedValue6);
            } else {
                function12 = function1;
            }
            Function0 function02 = (Function0) rememberedValue6;
            FocusRequester focusRequester2 = focusRequester;
            boolean changed2 = gapComposer.changed(focusRequester2) | gapComposer.changedInstance(view);
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue7 == obj) {
                rememberedValue7 = new AddMoneyViewKt$$ExternalSyntheticLambda4(focusRequester2, view, 0);
                gapComposer.updateRememberedValue(rememberedValue7);
            }
            TransfersAmountView(amountDisplayState, keypadAmount, align, function02, (Function0) rememberedValue7, focusRequester2, gapComposer, 560, 0);
            SpacerKt.Spacer(gapComposer, columnScopeInstance.weight(1.0f, companion, true));
            AddMoneyFooter(keypad2, function12, gapComposer, (i5 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            function12 = function1;
            keypad2 = keypad3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda17(modifier, keypad2, function12, moneyFormatter, realCashVibrator, i, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ArcadeAutoReloadConfirm(final BalanceBasedAutoReloadConfirmationViewModel.Content content, Function1 function1, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer;
        NeverEqualPolicy neverEqualPolicy;
        InstrumentCellViewModel instrumentCellViewModel;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1348067361);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changedInstance(content) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
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
            NavigationType navigationType = NavigationType.CLOSE;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy2) {
                rememberedValue = new TaxReturnsView$$ExternalSyntheticLambda0(16, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 54, 108);
            final int i4 = 0;
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
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            Countries.PageHeader(Room.stringResource(gapComposer2, R.string.balance_based_auto_reload_confirmation_title), (Modifier) null, (Function2) null, (String) null, gapComposer2, 0, 14);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
            CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(content.minimumBalance.amount, 2);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1122901436, new Function2() { // from class: com.squareup.cash.transfers.views.BalanceBasedAutoReloadConfirmationViewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    BalanceBasedAutoReloadConfirmationViewModel.Content content2 = content;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content2.minimumBalance.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content2.incrementAmount.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            boolean z2 = i3 == 32;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = new TaxReturnsView$$ExternalSyntheticLambda0(17, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(null, rememberComposableLambda, null, (Function0) rememberedValue2, false, false, null, null, label, 0L, gapComposer2, 54, 3572);
            CellDefaultAccessory.Label label2 = new CellDefaultAccessory.Label(content.incrementAmount.amount, 2);
            final int i5 = 1;
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-34481293, new Function2() { // from class: com.squareup.cash.transfers.views.BalanceBasedAutoReloadConfirmationViewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i5;
                    BalanceBasedAutoReloadConfirmationViewModel.Content content2 = content;
                    switch (i52) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content2.minimumBalance.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content2.incrementAmount.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            boolean z3 = i3 == 32;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (z3) {
                neverEqualPolicy = neverEqualPolicy2;
            } else {
                neverEqualPolicy = neverEqualPolicy2;
                if (rememberedValue3 != neverEqualPolicy) {
                    NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy;
                    CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(null, rememberComposableLambda2, null, (Function0) rememberedValue3, false, false, null, null, label2, 0L, gapComposer2, 54, 3572);
                    gapComposer = gapComposer2;
                    instrumentCellViewModel = content.instrumentCellViewModel;
                    if (instrumentCellViewModel != null) {
                        gapComposer.startReplaceGroup(468797419);
                        gapComposer.end(false);
                        function12 = function1;
                    } else {
                        gapComposer.startReplaceGroup(468797420);
                        InstrumentCellAlignment instrumentCellAlignment = InstrumentCellAlignment.RIGHT;
                        TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                        boolean z4 = i3 == 32;
                        Object rememberedValue4 = gapComposer.rememberedValue();
                        if (z4 || rememberedValue4 == neverEqualPolicy3) {
                            function12 = function1;
                            rememberedValue4 = new TaxReturnsView$$ExternalSyntheticLambda0(19, function12);
                            gapComposer.updateRememberedValue(rememberedValue4);
                        } else {
                            function12 = function1;
                        }
                        InstrumentCellKt.InstrumentCellSmall(null, instrumentCellViewModel, instrumentCellAlignment, textStyle, (Function0) rememberedValue4, gapComposer, MLKEMEngine.KyberPolyBytes, 1);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1974543769, new WorkWebViewKt$$ExternalSyntheticLambda14(13, function12), gapComposer), gapComposer, 24576, 15);
                    gapComposer.end(true);
                }
            }
            rememberedValue3 = new TaxReturnsView$$ExternalSyntheticLambda0(18, function1);
            gapComposer2.updateRememberedValue(rememberedValue3);
            NeverEqualPolicy neverEqualPolicy32 = neverEqualPolicy;
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(null, rememberComposableLambda2, null, (Function0) rememberedValue3, false, false, null, null, label2, 0L, gapComposer2, 54, 3572);
            gapComposer = gapComposer2;
            instrumentCellViewModel = content.instrumentCellViewModel;
            if (instrumentCellViewModel != null) {
            }
            gapComposer.end(true);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1974543769, new WorkWebViewKt$$ExternalSyntheticLambda14(13, function12), gapComposer), gapComposer, 24576, 15);
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxTooltipView$$ExternalSyntheticLambda0(content, function12, i, 29);
        }
    }

    public static final void ArcadeDepositPreferenceOptions(Modifier modifier, List list, WithdrawViewModel.ViewAmount.DepositPreferenceStyle depositPreferenceStyle, DepositPreference depositPreference, String str, Function1 function1, Composer composer, int i) {
        int i2;
        list.getClass();
        depositPreferenceStyle.getClass();
        str.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1522679046);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(depositPreferenceStyle.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(depositPreference == null ? -1 : depositPreference.ordinal()) ? 2048 : 1024;
        }
        String str2 = str;
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(str2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        Function1 function12 = function1;
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(function12) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        boolean z = false;
        boolean z2 = true;
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TouchRecorder();
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TouchRecorder touchRecorder = (TouchRecorder) rememberedValue;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Modifier modifier2 = null;
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(2114083795);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Modifier modifier3 = modifier2;
                boolean z3 = z2;
                boolean z4 = z;
                Strings.TouchRecordingLayout(touchRecorder, null, Expect_jvmKt.rememberComposableLambda(-1421307358, new SwipeToDismissKt$$ExternalSyntheticLambda3((WithdrawViewModel.DepositPreferenceOption) it.next(), depositPreference, depositPreferenceStyle, function12, touchRecorder, str2, 28), gapComposer), gapComposer, 392, 2);
                DBUtil.SpacerWithinSectionMedium(z4 ? 1 : 0, z3 ? 1 : 0, gapComposer, modifier3);
                function12 = function1;
                modifier2 = modifier3;
                z = z4 ? 1 : 0;
                z2 = z3 ? 1 : 0;
                str2 = str;
            }
            gapComposer.end(z);
            gapComposer.end(z2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OffersSearchViewKt$$ExternalSyntheticLambda6(modifier, list, depositPreferenceStyle, depositPreference, str, function1, i);
        }
    }

    public static final void AtmHeader(int i, Composer composer, Modifier modifier, String str, String str2, boolean z) {
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(410573376);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(str2) ? 256 : 128) | (gapComposer.changed(z) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, z ? Alignment.Companion.CenterHorizontally : Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 3) & 14, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).header, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            if (str2 == null) {
                gapComposer.startReplaceGroup(1020122745);
                gapComposer.end(false);
                z2 = true;
            } else {
                gapComposer.startReplaceGroup(1020122746);
                z2 = true;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            gapComposer.end(z2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda23(modifier, str, str2, z, i);
        }
    }

    public static final void BalanceBasedAddCashDisabledDialog(final BalanceBasedAddCashDisabledDialogViewModel balanceBasedAddCashDisabledDialogViewModel, final Function1 function1, Composer composer, int i) {
        balanceBasedAddCashDisabledDialogViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-885325247);
        int i2 = (gapComposer.changedInstance(balanceBasedAddCashDisabledDialogViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ModalKt.Modal((Modifier) null, balanceBasedAddCashDisabledDialogViewModel.title, balanceBasedAddCashDisabledDialogViewModel.message, Expect_jvmKt.rememberComposableLambda(-1406940259, new Function3() { // from class: com.squareup.cash.transfers.views.BalanceBasedAddCashDisabledDialogViewKt$$ExternalSyntheticLambda0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    final BalanceBasedAddCashDisabledDialogViewModel balanceBasedAddCashDisabledDialogViewModel2 = balanceBasedAddCashDisabledDialogViewModel;
                    Function1 function12 = function1;
                    Object[] objArr = 0;
                    char c = 1;
                    switch (i5) {
                        case 0:
                            ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            modalButtonScope.getClass();
                            if ((intValue & 6) == 0) {
                                intValue |= ((GapComposer) composer2).changed(modalButtonScope) ? 4 : 2;
                            }
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                boolean changed = gapComposer2.changed(function12);
                                Object rememberedValue = gapComposer2.rememberedValue();
                                if (changed || rememberedValue == neverEqualPolicy) {
                                    rememberedValue = new TaxReturnsView$$ExternalSyntheticLambda0(14, function12);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                final Object[] objArr2 = objArr == true ? 1 : 0;
                                modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, Expect_jvmKt.rememberComposableLambda(1647335474, new Function3() { // from class: com.squareup.cash.transfers.views.BalanceBasedAddCashDisabledDialogViewKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                        int i6 = objArr2;
                                        BalanceBasedAddCashDisabledDialogViewModel balanceBasedAddCashDisabledDialogViewModel3 = balanceBasedAddCashDisabledDialogViewModel2;
                                        switch (i6) {
                                            case 0:
                                                Composer composer3 = (Composer) obj5;
                                                int intValue2 = ((Integer) obj6).intValue();
                                                ((RowScope) obj4).getClass();
                                                GapComposer gapComposer3 = (GapComposer) composer3;
                                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, balanceBasedAddCashDisabledDialogViewModel3.positiveButtonLabel, (Map) null, (Function1) null, false);
                                                } else {
                                                    gapComposer3.skipToGroupEnd();
                                                }
                                                break;
                                            default:
                                                Composer composer4 = (Composer) obj5;
                                                int intValue3 = ((Integer) obj6).intValue();
                                                ((RowScope) obj4).getClass();
                                                GapComposer gapComposer4 = (GapComposer) composer4;
                                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, balanceBasedAddCashDisabledDialogViewModel3.negativeButtonLabel, (Map) null, (Function1) null, false);
                                                } else {
                                                    gapComposer4.skipToGroupEnd();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, gapComposer2), gapComposer2, (57344 & (intValue << 12)) | 3072, 6);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            modalButtonScope2.getClass();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((GapComposer) composer3).changed(modalButtonScope2) ? 4 : 2;
                            }
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                boolean changed2 = gapComposer3.changed(function12);
                                Object rememberedValue2 = gapComposer3.rememberedValue();
                                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                    rememberedValue2 = new TaxReturnsView$$ExternalSyntheticLambda0(15, function12);
                                    gapComposer3.updateRememberedValue(rememberedValue2);
                                }
                                final char c2 = c == true ? 1 : 0;
                                modalButtonScope2.SecondaryModalButton((Function0) rememberedValue2, null, false, Expect_jvmKt.rememberComposableLambda(1425123999, new Function3() { // from class: com.squareup.cash.transfers.views.BalanceBasedAddCashDisabledDialogViewKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                        int i6 = c2;
                                        BalanceBasedAddCashDisabledDialogViewModel balanceBasedAddCashDisabledDialogViewModel3 = balanceBasedAddCashDisabledDialogViewModel2;
                                        switch (i6) {
                                            case 0:
                                                Composer composer32 = (Composer) obj5;
                                                int intValue22 = ((Integer) obj6).intValue();
                                                ((RowScope) obj4).getClass();
                                                GapComposer gapComposer32 = (GapComposer) composer32;
                                                if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, balanceBasedAddCashDisabledDialogViewModel3.positiveButtonLabel, (Map) null, (Function1) null, false);
                                                } else {
                                                    gapComposer32.skipToGroupEnd();
                                                }
                                                break;
                                            default:
                                                Composer composer4 = (Composer) obj5;
                                                int intValue3 = ((Integer) obj6).intValue();
                                                ((RowScope) obj4).getClass();
                                                GapComposer gapComposer4 = (GapComposer) composer4;
                                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, balanceBasedAddCashDisabledDialogViewModel3.negativeButtonLabel, (Map) null, (Function1) null, false);
                                                } else {
                                                    gapComposer4.skipToGroupEnd();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, gapComposer3), gapComposer3, ((intValue2 << 12) & 57344) | 3072, 6);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), Expect_jvmKt.rememberComposableLambda(-1163403396, new Function3() { // from class: com.squareup.cash.transfers.views.BalanceBasedAddCashDisabledDialogViewKt$$ExternalSyntheticLambda0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    final BalanceBasedAddCashDisabledDialogViewModel balanceBasedAddCashDisabledDialogViewModel2 = balanceBasedAddCashDisabledDialogViewModel;
                    Function1 function12 = function1;
                    Object[] objArr = 0;
                    char c = 1;
                    switch (i5) {
                        case 0:
                            ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            modalButtonScope.getClass();
                            if ((intValue & 6) == 0) {
                                intValue |= ((GapComposer) composer2).changed(modalButtonScope) ? 4 : 2;
                            }
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                boolean changed = gapComposer2.changed(function12);
                                Object rememberedValue = gapComposer2.rememberedValue();
                                if (changed || rememberedValue == neverEqualPolicy) {
                                    rememberedValue = new TaxReturnsView$$ExternalSyntheticLambda0(14, function12);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                final int objArr2 = objArr == true ? 1 : 0;
                                modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, Expect_jvmKt.rememberComposableLambda(1647335474, new Function3() { // from class: com.squareup.cash.transfers.views.BalanceBasedAddCashDisabledDialogViewKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                        int i6 = objArr2;
                                        BalanceBasedAddCashDisabledDialogViewModel balanceBasedAddCashDisabledDialogViewModel3 = balanceBasedAddCashDisabledDialogViewModel2;
                                        switch (i6) {
                                            case 0:
                                                Composer composer32 = (Composer) obj5;
                                                int intValue22 = ((Integer) obj6).intValue();
                                                ((RowScope) obj4).getClass();
                                                GapComposer gapComposer32 = (GapComposer) composer32;
                                                if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, balanceBasedAddCashDisabledDialogViewModel3.positiveButtonLabel, (Map) null, (Function1) null, false);
                                                } else {
                                                    gapComposer32.skipToGroupEnd();
                                                }
                                                break;
                                            default:
                                                Composer composer4 = (Composer) obj5;
                                                int intValue3 = ((Integer) obj6).intValue();
                                                ((RowScope) obj4).getClass();
                                                GapComposer gapComposer4 = (GapComposer) composer4;
                                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, balanceBasedAddCashDisabledDialogViewModel3.negativeButtonLabel, (Map) null, (Function1) null, false);
                                                } else {
                                                    gapComposer4.skipToGroupEnd();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, gapComposer2), gapComposer2, (57344 & (intValue << 12)) | 3072, 6);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            modalButtonScope2.getClass();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((GapComposer) composer3).changed(modalButtonScope2) ? 4 : 2;
                            }
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                boolean changed2 = gapComposer3.changed(function12);
                                Object rememberedValue2 = gapComposer3.rememberedValue();
                                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                    rememberedValue2 = new TaxReturnsView$$ExternalSyntheticLambda0(15, function12);
                                    gapComposer3.updateRememberedValue(rememberedValue2);
                                }
                                final int c2 = c == true ? 1 : 0;
                                modalButtonScope2.SecondaryModalButton((Function0) rememberedValue2, null, false, Expect_jvmKt.rememberComposableLambda(1425123999, new Function3() { // from class: com.squareup.cash.transfers.views.BalanceBasedAddCashDisabledDialogViewKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                        int i6 = c2;
                                        BalanceBasedAddCashDisabledDialogViewModel balanceBasedAddCashDisabledDialogViewModel3 = balanceBasedAddCashDisabledDialogViewModel2;
                                        switch (i6) {
                                            case 0:
                                                Composer composer32 = (Composer) obj5;
                                                int intValue22 = ((Integer) obj6).intValue();
                                                ((RowScope) obj4).getClass();
                                                GapComposer gapComposer32 = (GapComposer) composer32;
                                                if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, balanceBasedAddCashDisabledDialogViewModel3.positiveButtonLabel, (Map) null, (Function1) null, false);
                                                } else {
                                                    gapComposer32.skipToGroupEnd();
                                                }
                                                break;
                                            default:
                                                Composer composer4 = (Composer) obj5;
                                                int intValue3 = ((Integer) obj6).intValue();
                                                ((RowScope) obj4).getClass();
                                                GapComposer gapComposer4 = (GapComposer) composer4;
                                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, balanceBasedAddCashDisabledDialogViewModel3.negativeButtonLabel, (Map) null, (Function1) null, false);
                                                } else {
                                                    gapComposer4.skipToGroupEnd();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, gapComposer3), gapComposer3, ((intValue2 << 12) & 57344) | 3072, 6);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), (Function3) null, gapComposer, 27648, 33);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceBasedAddCashDisabledDialogView$$ExternalSyntheticLambda1(i, balanceBasedAddCashDisabledDialogViewModel, function1);
        }
    }

    public static final void Content(Modifier modifier, InstrumentLinkingOptionsViewModel instrumentLinkingOptionsViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1780953399);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(instrumentLinkingOptionsViewModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(modifier, Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            int i3 = i2;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).header, (TextLineBalancing) null, instrumentLinkingOptionsViewModel.header, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            String str = instrumentLinkingOptionsViewModel.body;
            if (str == null) {
                gapComposer.startReplaceGroup(-1805038835);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1805038834);
                Strings.getSizes(gapComposer).getClass();
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            gapComposer.startReplaceGroup(-889501233);
            for (InstrumentLinkingOptionsViewModel.Option option : instrumentLinkingOptionsViewModel.instrumentLinkOptions) {
                InstrumentCellViewModel instrumentCellViewModel = option.instrumentViewModel;
                int i4 = i3;
                boolean changedInstance = gapComposer.changedInstance(option) | ((i4 & 896) == 256);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new TaxWebAppBridge$$ExternalSyntheticLambda0(24, function1, option);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                InstrumentCellKt.m3578InstrumentRowjM_yU8I(null, instrumentCellViewModel, null, false, null, (Function0) rememberedValue, gapComposer, 0, 29);
                i3 = i4;
            }
            gapComposer.end(false);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxReturnsView$$ExternalSyntheticLambda1((Object) modifier, (Object) instrumentLinkingOptionsViewModel, (Object) function1, i, 14);
        }
    }

    public static final void DefaultPaymentMethodRow(final InstrumentDetailsViewModel.DefaultState defaultState, Function0 function0, Composer composer, int i) {
        CellDefaultAccessory.ButtonCompact buttonCompact;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-606550898);
        int i2 = (gapComposer.changedInstance(defaultState) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (defaultState.equals(InstrumentDetailsViewModel.DefaultState.Invalid.INSTANCE)) {
            gapComposer.startReplaceGroup(-830253070);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-830214630);
            if (defaultState instanceof InstrumentDetailsViewModel.DefaultState.NotSet) {
                gapComposer.startReplaceGroup(-829924284);
                buttonCompact = new CellDefaultAccessory.ButtonCompact(null, null, false, Expect_jvmKt.rememberComposableLambda(272492693, new TaxReturnsViewKt$$ExternalSyntheticLambda5(defaultState, 12), gapComposer), 15);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-829809770);
                gapComposer.end(false);
                buttonCompact = null;
            }
            CellDefaultAccessory.ButtonCompact buttonCompact2 = buttonCompact;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(110029789, new Function2() { // from class: com.squareup.cash.transfers.views.InstrumentDetailsViewKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    InstrumentDetailsViewModel.DefaultState defaultState2 = defaultState;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                String title = defaultState2.getTitle();
                                if (title == null) {
                                    gapComposer2.startReplaceGroup(837419572);
                                } else {
                                    gapComposer2.startReplaceGroup(837419573);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, title, (Map) null, (Function1) null, false);
                                }
                                gapComposer2.end(false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                String subtitle = defaultState2.getSubtitle();
                                if (subtitle == null) {
                                    gapComposer3.startReplaceGroup(754062810);
                                } else {
                                    gapComposer3.startReplaceGroup(754062811);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, subtitle, (Map) null, (Function1) null, false);
                                }
                                gapComposer3.end(false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            boolean changedInstance = ((i2 & 112) == 32) | gapComposer.changedInstance(defaultState);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TaxWebAppBridge$$ExternalSyntheticLambda0(23, defaultState, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, fillMaxWidth, (Function0) rememberedValue, false, false, Expect_jvmKt.rememberComposableLambda(2114277783, new Function2() { // from class: com.squareup.cash.transfers.views.InstrumentDetailsViewKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    InstrumentDetailsViewModel.DefaultState defaultState2 = defaultState;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                String title = defaultState2.getTitle();
                                if (title == null) {
                                    gapComposer2.startReplaceGroup(837419572);
                                } else {
                                    gapComposer2.startReplaceGroup(837419573);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, title, (Map) null, (Function1) null, false);
                                }
                                gapComposer2.end(false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                String subtitle = defaultState2.getSubtitle();
                                if (subtitle == null) {
                                    gapComposer3.startReplaceGroup(754062810);
                                } else {
                                    gapComposer3.startReplaceGroup(754062811);
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, subtitle, (Map) null, (Function1) null, false);
                                }
                                gapComposer3.end(false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, 0L, buttonCompact2, null, gapComposer, 1572918, 1464);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkViewFactory$$ExternalSyntheticLambda12(defaultState, function0, i, 1);
        }
    }

    public static final void Header(Modifier modifier, String str, TextStyle textStyle, String str2, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1662196353);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(textStyle) ? 256 : 128) | (gapComposer.changed(str2) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            Room.m1165Text25TpFw(0, 0, 0, 0, ((i2 >> 3) & 14) | (i2 & 896), 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) new HorizontalAlignElement(horizontal), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 9) & 14, 0, 4080, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) new HorizontalAlignElement(horizontal), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleKt$$ExternalSyntheticLambda0(modifier, i, str, textStyle, str2, 13);
        }
    }

    public static final void InstrumentDetailsActions(int i, Composer composer, Modifier modifier, String str, String str2, Function0 function0, Function0 function02) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1782636997);
        int i2 = i | 6 | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(str2) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024) | (gapComposer.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1615264899, new FullscreenNoticeKt$$ExternalSyntheticLambda0(function0, function02, str, str2), gapComposer);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            DimensionKt.ButtonCtaGroup(companion, false, null, null, rememberComposableLambda, gapComposer, 24582, 14);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda15(i, modifier, str, str2, function0, function02);
        }
    }

    public static final void InstrumentDetailsFullscreenView(InstrumentDetailsViewModel instrumentDetailsViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1674433031);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(instrumentDetailsViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (instrumentDetailsViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1968645252, new InstrumentDetailsViewKt$$ExternalSyntheticLambda0(realImageLoader, instrumentDetailsViewModel, function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentDetailsViewKt$$ExternalSyntheticLambda2(instrumentDetailsViewModel, function1, realImageLoader, i, 1);
        }
    }

    public static final void InstrumentDetailsSheet(InstrumentDetailsViewModel instrumentDetailsViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-419599906);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(instrumentDetailsViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (instrumentDetailsViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(214817523, new InstrumentDetailsViewKt$$ExternalSyntheticLambda0(function1, realImageLoader, instrumentDetailsViewModel), gapComposer), gapComposer, 3072, 7);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TaxReturnsView$$ExternalSyntheticLambda0(27, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentDetailsViewKt$$ExternalSyntheticLambda2(instrumentDetailsViewModel, function1, realImageLoader, i, 0);
        }
    }

    public static final void InstrumentLinkingOptionsSheetView(InstrumentLinkingOptionsViewModel instrumentLinkingOptionsViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        instrumentLinkingOptionsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(623661950);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(instrumentLinkingOptionsViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1233554989, new TaxReturnsView$$ExternalSyntheticLambda1(function1, realImageLoader, instrumentLinkingOptionsViewModel), gapComposer), gapComposer, 3072, 7);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(1, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(instrumentLinkingOptionsViewModel, function1, realImageLoader, i, 17);
        }
    }

    public static final void InstrumentNotLinkedSheet(InstrumentNotLinkedViewModel instrumentNotLinkedViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        instrumentNotLinkedViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1961582188);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(instrumentNotLinkedViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        boolean z = false;
        int i3 = 18;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1168971615, new WorkViewFactory$$ExternalSyntheticLambda12(function1, instrumentNotLinkedViewModel, z, 3), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(instrumentNotLinkedViewModel, function1, i, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InternalTransfersAmountDisplay(AmountDisplayState amountDisplayState, Modifier modifier, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1525100346);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(amountDisplayState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer.changedInstance(function0) ? 256 : 128;
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = Modifier.Companion.$$INSTANCE;
                modifier3 = i4 != 0 ? modifier4 : modifier2;
                Modifier testTag = TestTagKt.testTag(SizeKt.fillMaxWidth(modifier3, 1.0f), "amount-view");
                if (function0 != null) {
                    gapComposer.startReplaceGroup(2100666583);
                    boolean z = (i3 & 896) == 256;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (z || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(2, function0);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    modifier4 = SuspendingPointerInputFilterKt.pointerInput(modifier4, function0, (PointerInputEventHandler) rememberedValue);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(2100782182);
                    gapComposer.end(false);
                }
                Modifier then = testTag.then(modifier4);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                ConnectionPoolKt.m1177AmountDisplaykNX22eY(amountDisplayState, then, colors.semantic.text.standard, 0L, 0, 0, gapComposer, i3 & 14, 56);
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9((Object) amountDisplayState, modifier3, (Object) function0, i, i2, 23);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void LinkedAccountsContent(LinkedAccountsViewModel linkedAccountsViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1800455690);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(linkedAccountsViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (linkedAccountsViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1712281983, new TaxReturnsView$$ExternalSyntheticLambda1(i3, realImageLoader, linkedAccountsViewModel, function1), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(linkedAccountsViewModel, function1, realImageLoader, i, 18);
        }
    }

    public static final void LinkedAccountsNux(LinkedAccountsNuxViewModel linkedAccountsNuxViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        linkedAccountsNuxViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(978503250);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(linkedAccountsNuxViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-34777955, new WorkViewFactory$$ExternalSyntheticLambda12(function1, linkedAccountsNuxViewModel, z, i3), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(linkedAccountsNuxViewModel, function1, i, 19);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.Throwable] */
    public static final void LinkedAccountsView(LinkedAccountsViewModel linkedAccountsViewModel, Function1 function1, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer;
        NeverEqualPolicy neverEqualPolicy;
        boolean z;
        Object obj;
        GapComposer gapComposer2;
        boolean z2;
        GapComposer gapComposer3;
        Iterator it;
        int i2;
        Modifier modifier;
        NeverEqualPolicy neverEqualPolicy2;
        linkedAccountsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer4 = (GapComposer) composer;
        gapComposer4.startRestartGroup(-493078502);
        Applier applier = gapComposer4.applier;
        int i3 = i | (gapComposer4.changedInstance(linkedAccountsViewModel) ? 4 : 2) | (gapComposer4.changedInstance(function1) ? 32 : 16);
        if (gapComposer4.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(companion, 1.0f));
            Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
            } else {
                gapComposer4.startReplaceGroup(-1762997739);
                gapComposer4.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(systemBarsPadding, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer4, 0);
            int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer4.startReusableNode();
            if (gapComposer4.inserting) {
                gapComposer4.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer4.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer4, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer4, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer4, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            NavigationType navigationType = NavigationType.BACK;
            int i4 = i3 & 112;
            boolean z3 = i4 == 32;
            Object rememberedValue = gapComposer4.rememberedValue();
            NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
            if (z3 || rememberedValue == neverEqualPolicy3) {
                neverEqualPolicy = neverEqualPolicy3;
                z = false;
                LinkedAccountsViewKt$$ExternalSyntheticLambda3 linkedAccountsViewKt$$ExternalSyntheticLambda3 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(0, function1);
                gapComposer4.updateRememberedValue(linkedAccountsViewKt$$ExternalSyntheticLambda3);
                obj = linkedAccountsViewKt$$ExternalSyntheticLambda3;
            } else {
                neverEqualPolicy = neverEqualPolicy3;
                z = false;
                obj = rememberedValue;
            }
            boolean z4 = z;
            NeverEqualPolicy neverEqualPolicy4 = neverEqualPolicy;
            int i5 = i4;
            Modifier modifier2 = null;
            DBUtil.TitleBarSub(f734lambda$308867670, navigationType, fillMaxWidth, (DynamicColorConfiguration) null, (Function0) obj, (Modifier) null, (Function3) null, gapComposer4, 438, 104);
            DBUtil.SpacerWithinSectionMedium(z4 ? 1 : 0, 1, gapComposer4, null);
            if (linkedAccountsViewModel instanceof LinkedAccountsViewModel.Ready) {
                gapComposer4.startReplaceGroup(-2144442834);
                Modifier verticalScroll$default = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), ImageKt.rememberScrollState(gapComposer4), z4, 14);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer4, z4 ? 1 : 0);
                int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, verticalScroll$default);
                gapComposer4.startReusableNode();
                if (gapComposer4.inserting) {
                    gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer4.useNode();
                }
                Updater.m576setimpl(gapComposer4, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer4, composeUiNode$Companion$SetModifier$13, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer4, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                gapComposer4.startReplaceGroup(1966258099);
                LinkedAccountsViewModel.Ready ready = (LinkedAccountsViewModel.Ready) linkedAccountsViewModel;
                Iterator it2 = ready.instrumentSections.iterator();
                int i6 = 0;
                GapComposer gapComposer5 = gapComposer4;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        ?? r18 = modifier2;
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw r18;
                    }
                    LinkedAccountsViewModel.Ready.InstrumentSection instrumentSection = (LinkedAccountsViewModel.Ready.InstrumentSection) next;
                    int i8 = i6;
                    String str = instrumentSection.title;
                    List<LinkedAccountsViewModel.Ready.InstrumentSection.InstrumentRow> list = instrumentSection.instrumentRows;
                    if (str == null) {
                        gapComposer5.startReplaceGroup(-1252598813);
                        z2 = false;
                        gapComposer5.end(false);
                        gapComposer3 = gapComposer5;
                    } else {
                        z2 = false;
                        gapComposer5.startReplaceGroup(-1252598812);
                        if (i8 > 0) {
                            gapComposer5.startReplaceGroup(-2131201475);
                            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer5, modifier2);
                            gapComposer5.end(false);
                        } else {
                            gapComposer5.startReplaceGroup(-2131146698);
                            gapComposer5.end(false);
                        }
                        GapComposer gapComposer6 = gapComposer5;
                        ViewfinderDefaults.SectionHeader(str, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer6, 0, 30);
                        GapComposer gapComposer7 = gapComposer6;
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer7, modifier2);
                        gapComposer7.end(false);
                        gapComposer3 = gapComposer7;
                    }
                    if (instrumentSection.useStackedCardLayout) {
                        gapComposer3.startReplaceGroup(-1252366746);
                        int i9 = i5;
                        StackedCardSection(list, function1, gapComposer3, i9);
                        gapComposer3.end(z2);
                        it = it2;
                        i2 = i9;
                        modifier = modifier2;
                        neverEqualPolicy2 = neverEqualPolicy4;
                    } else {
                        Function1 function13 = function1;
                        int i10 = i5;
                        gapComposer3.startReplaceGroup(-1252242250);
                        gapComposer3 = gapComposer3;
                        for (LinkedAccountsViewModel.Ready.InstrumentSection.InstrumentRow instrumentRow : list) {
                            InstrumentCellViewModel instrumentCellViewModel = instrumentRow.instrumentCellViewModel;
                            boolean changedInstance = (i10 == 32) | gapComposer3.changedInstance(instrumentRow);
                            Object rememberedValue2 = gapComposer3.rememberedValue();
                            NeverEqualPolicy neverEqualPolicy5 = neverEqualPolicy4;
                            if (changedInstance || rememberedValue2 == neverEqualPolicy5) {
                                rememberedValue2 = new LinkedAccountsViewKt$$ExternalSyntheticLambda4(function13, instrumentRow, 0);
                                gapComposer3.updateRememberedValue(rememberedValue2);
                            }
                            GapComposer gapComposer8 = gapComposer3;
                            InstrumentCellKt.m3578InstrumentRowjM_yU8I(null, instrumentCellViewModel, null, false, null, (Function0) rememberedValue2, gapComposer8, 0, 29);
                            i10 = i10;
                            gapComposer3 = gapComposer8;
                            function13 = function1;
                            neverEqualPolicy4 = neverEqualPolicy5;
                            it2 = it2;
                            modifier2 = modifier2;
                        }
                        it = it2;
                        i2 = i10;
                        modifier = modifier2;
                        neverEqualPolicy2 = neverEqualPolicy4;
                        gapComposer3.end(false);
                    }
                    i5 = i2;
                    i6 = i7;
                    neverEqualPolicy4 = neverEqualPolicy2;
                    it2 = it;
                    modifier2 = modifier;
                    gapComposer5 = gapComposer3;
                }
                function12 = function1;
                int i11 = i5;
                NeverEqualPolicy neverEqualPolicy6 = neverEqualPolicy4;
                boolean z5 = false;
                gapComposer5.end(false);
                gapComposer5.end(true);
                String str2 = ready.linkAccountButtonLabel;
                if (str2 == null) {
                    gapComposer5.startReplaceGroup(-2143568511);
                    gapComposer5.end(false);
                } else {
                    gapComposer5.startReplaceGroup(-2143568510);
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer5.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    ((DefaultSizes) gapComposer5.consume(staticProvidableCompositionLocal)).getClass();
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth2, 16.0f, 16.0f);
                    ButtonProminence buttonProminence = ButtonProminence.STANDARD;
                    boolean z6 = i11 == 32;
                    Object rememberedValue3 = gapComposer5.rememberedValue();
                    Object obj2 = rememberedValue3;
                    if (z6 || rememberedValue3 == neverEqualPolicy6) {
                        LinkedAccountsViewKt$$ExternalSyntheticLambda3 linkedAccountsViewKt$$ExternalSyntheticLambda32 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(9, function12);
                        gapComposer5.updateRememberedValue(linkedAccountsViewKt$$ExternalSyntheticLambda32);
                        obj2 = linkedAccountsViewKt$$ExternalSyntheticLambda32;
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) obj2, m299paddingVpY3zN4, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1227855948, new ShopErrorKt$$ExternalSyntheticLambda0(str2, 8), gapComposer5), gapComposer5, 1573248, 56);
                    z5 = false;
                    gapComposer5.end(false);
                }
                gapComposer5.end(z5);
                gapComposer2 = gapComposer5;
            } else {
                function12 = function1;
                gapComposer4.startReplaceGroup(-2143197378);
                gapComposer4.end(z4);
                gapComposer2 = gapComposer4;
            }
            gapComposer2.end(true);
            gapComposer = gapComposer2;
        } else {
            function12 = function1;
            gapComposer4.skipToGroupEnd();
            gapComposer = gapComposer4;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LinkedAccountsViewKt$$ExternalSyntheticLambda2(linkedAccountsViewModel, function12, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v9 */
    public static final void ManagedAccountAmountEntryContent(Modifier modifier, WithdrawViewModel.ManagedAccountAmountEntry managedAccountAmountEntry, MoneyFormatter moneyFormatter, RealCashVibrator realCashVibrator, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        MutableState mutableState;
        KeypadAmount keypadAmount;
        Object navHostKt$NavHost$33$1;
        AmountDisplayState amountDisplayState;
        NeverEqualPolicy neverEqualPolicy;
        Continuation continuation;
        ?? r12;
        Function0 function02;
        managedAccountAmountEntry.getClass();
        WithdrawViewModel$AmountConfig$KeypadConfig withdrawViewModel$AmountConfig$KeypadConfig = managedAccountAmountEntry.amountConfig;
        moneyFormatter.getClass();
        realCashVibrator.getClass();
        function1.getClass();
        function0.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1206047796);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(managedAccountAmountEntry) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(moneyFormatter) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(realCashVibrator) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i3 = i2;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 74899) != 74898)) {
            View view = (View) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalView);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy2) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, Strings.getColors(gapComposer2).semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            String str = managedAccountAmountEntry.title;
            Money money = withdrawViewModel$AmountConfig$KeypadConfig.currentAmount;
            Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3832, 0L, (Composer) gapComposer2, fillMaxWidth, Strings.getTypography(gapComposer2).pageTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, SizeKt.fillMaxWidth(companion, 1.0f), Strings.getTypography(gapComposer2).bodySmall, (TextLineBalancing) null, managedAccountAmountEntry.subtitle, (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = new KeypadAmount();
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            KeypadAmount keypadAmount2 = (KeypadAmount) rememberedValue2;
            FocusRequester rememberFocusRequesterAndRequestFocus = DBUtil.rememberFocusRequesterAndRequestFocus(gapComposer);
            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(true, gapComposer, 0);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy2) {
                Long l = money.amount;
                rememberedValue3 = Updater.mutableStateOf$default(Long.valueOf(l != null ? l.longValue() : 0L));
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState2 = (MutableState) rememberedValue3;
            AmountConfig.MoneyConfig moneyConfig = new AmountConfig.MoneyConfig(withdrawViewModel$AmountConfig$KeypadConfig.currency, null, false, 0, 14);
            String format2 = moneyFormatter.format(money);
            boolean changedInstance = ((i3 & 57344) == 16384) | gapComposer.changedInstance(keypadAmount2);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy2) {
                rememberedValue4 = new CardTransitionKt$$ExternalSyntheticLambda4(15, function1, mutableState2, keypadAmount2);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            AmountDisplayState rememberAmountDisplayState = ConnectionPoolKt.rememberAmountDisplayState(moneyConfig, format2, (Function1) rememberedValue4, gapComposer, 0);
            Object[] objArr = {keypadAmount2, rememberAmountDisplayState, realCashVibrator, rememberShaker};
            boolean changedInstance2 = gapComposer.changedInstance(moneyFormatter) | gapComposer.changedInstance(managedAccountAmountEntry) | gapComposer.changedInstance(keypadAmount2) | gapComposer.changed(rememberAmountDisplayState) | gapComposer.changedInstance(realCashVibrator) | gapComposer.changedInstance(rememberShaker);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue5 == neverEqualPolicy2) {
                mutableState = mutableState2;
                keypadAmount = keypadAmount2;
                amountDisplayState = rememberAmountDisplayState;
                neverEqualPolicy = neverEqualPolicy2;
                continuation = null;
                navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(moneyFormatter, managedAccountAmountEntry, keypadAmount, amountDisplayState, realCashVibrator, rememberShaker, (Continuation) null, 19);
                gapComposer.updateRememberedValue(navHostKt$NavHost$33$1);
            } else {
                navHostKt$NavHost$33$1 = rememberedValue5;
                mutableState = mutableState2;
                keypadAmount = keypadAmount2;
                neverEqualPolicy = neverEqualPolicy2;
                amountDisplayState = rememberAmountDisplayState;
                continuation = null;
            }
            Updater.LaunchedEffect(objArr, (Function2) navHostKt$NavHost$33$1, gapComposer);
            boolean changed = gapComposer.changed(amountDisplayState) | gapComposer.changedInstance(managedAccountAmountEntry) | gapComposer.changedInstance(keypadAmount);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changed || rememberedValue6 == neverEqualPolicy) {
                AmountDisplayState amountDisplayState2 = amountDisplayState;
                Continuation continuation2 = continuation;
                Logger$_log$2 logger$_log$2 = new Logger$_log$2(amountDisplayState2, managedAccountAmountEntry, keypadAmount, continuation2, 6);
                r12 = continuation2;
                amountDisplayState = amountDisplayState2;
                gapComposer.updateRememberedValue(logger$_log$2);
                rememberedValue6 = logger$_log$2;
            } else {
                r12 = continuation;
            }
            Updater.LaunchedEffect(withdrawViewModel$AmountConfig$KeypadConfig, amountDisplayState, keypadAmount, (Function2) rememberedValue6, gapComposer);
            Modifier shakeWith = SharedViewEventsKt.shakeWith(SizeKt.fillMaxWidth(companion, 1.0f), rememberShaker);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(Alignment.Companion.CenterHorizontally, SpacerKt.m300paddingVpY3zN4$default(shakeWith, 16.0f, RecyclerView.DECELERATION_RATE, 2));
            boolean z = (i3 & 458752) == 131072;
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (z || rememberedValue7 == neverEqualPolicy) {
                function02 = function0;
                rememberedValue7 = new AlertBannerKt$$ExternalSyntheticLambda2(10, function02);
                gapComposer.updateRememberedValue(rememberedValue7);
            } else {
                function02 = function0;
            }
            TransfersAmountView(amountDisplayState, keypadAmount, m, (Function0) rememberedValue7, null, rememberFocusRequesterAndRequestFocus, gapComposer, 560, 32);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, r12);
            DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, null, null, Expect_jvmKt.rememberComposableLambda(194925908, new SubcomposeAsyncImageKt$$ExternalSyntheticLambda0(mutableState, view, coroutineScope, function1, function02, managedAccountAmountEntry, 11), gapComposer), gapComposer, 24582, 14);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OffersSearchViewKt$$ExternalSyntheticLambda6(modifier, managedAccountAmountEntry, moneyFormatter, realCashVibrator, function1, function0, i);
        }
    }

    public static final void ManagedAccountConfirmationContent(Modifier modifier, WithdrawViewModel.ManagedAccountConfirmation managedAccountConfirmation, Function1 function1, Composer composer, int i) {
        int i2;
        managedAccountConfirmation.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-265784442);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(managedAccountConfirmation) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, Request$Priority$EnumUnboxingLocalUtility.m(Alignment.Companion.CenterHorizontally, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2)), Strings.getTypography(gapComposer).header, (TextLineBalancing) null, managedAccountConfirmation.title, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            InstrumentCellViewModel instrumentCellViewModel = managedAccountConfirmation.instrumentCellViewModel;
            if (instrumentCellViewModel == null) {
                gapComposer.startReplaceGroup(-579128800);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-579128799);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ArticleViewKt$$ExternalSyntheticLambda7(7);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                InstrumentCellKt.InstrumentCellSmall(null, instrumentCellViewModel, null, null, (Function0) rememberedValue, gapComposer, 24576, 13);
                gapComposer.end(false);
            }
            DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
            DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, null, null, Expect_jvmKt.rememberComposableLambda(425967886, new TabToolbarsKt$$ExternalSyntheticLambda3(18, function1, managedAccountConfirmation), gapComposer), gapComposer, 24582, 14);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(i, 19, modifier, managedAccountConfirmation, function1);
        }
    }

    public static final void ManagedAccountInstrumentPickerContent(Modifier modifier, AddMoneyViewModel.ManagedAccountInstrumentPicker managedAccountInstrumentPicker, Function1 function1, Function0 function0, Composer composer, int i) {
        Object obj;
        managedAccountInstrumentPicker.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1096349381);
        Applier applier = gapComposer.applier;
        int i2 = (i & 6) == 0 ? (gapComposer.changed(modifier) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(managedAccountInstrumentPicker) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            if (function0 == null) {
                gapComposer.startReplaceGroup(-1881664420);
            } else {
                gapComposer.startReplaceGroup(-1881664419);
                DBUtil.BackHandler(false, function0, gapComposer, 0, 1);
            }
            gapComposer.end(false);
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, navigationBarsPadding);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            NavigationType navigationType = NavigationType.CLOSE;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (z || rememberedValue == obj2) {
                rememberedValue = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(10, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            int i4 = i3;
            Object obj3 = obj2;
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f, true), 1.0f), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            Countries.PageHeader(managedAccountInstrumentPicker.pickerTitle, (Modifier) null, (Function2) null, managedAccountInstrumentPicker.pickerSubtitle, gapComposer, 0, 6);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            gapComposer.startReplaceGroup(-470672832);
            for (AddMoneyViewModel.ManagedAccountInstrumentPicker.InstrumentItem instrumentItem : managedAccountInstrumentPicker.instruments) {
                InstrumentCellViewModel instrumentCellViewModel = instrumentItem.cellViewModel;
                boolean equals = instrumentItem.token.equals(managedAccountInstrumentPicker.currentInstrumentToken);
                int i5 = i4;
                boolean changedInstance = (i5 == 256) | gapComposer.changedInstance(instrumentItem);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance) {
                    obj = obj3;
                } else {
                    obj = obj3;
                    if (rememberedValue2 != obj) {
                        Function0 function02 = (Function0) rememberedValue2;
                        obj3 = obj;
                        GapComposer gapComposer2 = gapComposer;
                        i4 = i5;
                        InstrumentCellKt.m3578InstrumentRowjM_yU8I(null, instrumentCellViewModel, null, equals, null, function02, gapComposer2, 0, 21);
                        gapComposer = gapComposer2;
                    }
                }
                rememberedValue2 = new TaxWebAppBridge$$ExternalSyntheticLambda0(25, function1, instrumentItem);
                gapComposer.updateRememberedValue(rememberedValue2);
                Function0 function022 = (Function0) rememberedValue2;
                obj3 = obj;
                GapComposer gapComposer22 = gapComposer;
                i4 = i5;
                InstrumentCellKt.m3578InstrumentRowjM_yU8I(null, instrumentCellViewModel, null, equals, null, function022, gapComposer22, 0, 21);
                gapComposer = gapComposer22;
            }
            int i6 = i4;
            Object obj4 = obj3;
            gapComposer.end(false);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            gapComposer.end(true);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier imePadding = SpacerKt.imePadding(SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2));
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean z2 = i6 == 256;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z2 || rememberedValue3 == obj4) {
                rememberedValue3 = new LinkedAccountsViewKt$$ExternalSyntheticLambda3(11, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, imePadding, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(846363402, new TaxReturnsViewKt$$ExternalSyntheticLambda5(managedAccountInstrumentPicker, 14), gapComposer), gapComposer, 1573248, 56);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(modifier, (AddMoneyViewModel) managedAccountInstrumentPicker, function1, function0, i, 29);
        }
    }

    public static final void RecurringCashInToggleRow(AddMoneyViewModel.RecurringCashInToggle recurringCashInToggle, Function0 function0, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1340128907);
        int i2 = 4;
        int i3 = i | (gapComposer.changedInstance(recurringCashInToggle) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            CellDefaultAccessory.Toggle toggle = new CellDefaultAccessory.Toggle(recurringCashInToggle.checked);
            boolean z = recurringCashInToggle.enabled;
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(Expect_jvmKt.rememberComposableLambda(1175431171, new FieldBinding$$ExternalSyntheticLambda4(recurringCashInToggle, i2), gapComposer), fillMaxWidth, z ? function0 : null, z, false, null, null, 0L, toggle, null, gapComposer, 6, 1512);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxReturnsView$$ExternalSyntheticLambda1(recurringCashInToggle, function0, modifier2, i, 8);
        }
    }

    public static final void RecurringReloadConfigurationContent(RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel, Function1 function1, LocalizedMoneyFormatter.Factory factory, RealCashVibrator realCashVibrator, Composer composer, int i) {
        int i2;
        recurringReloadConfigurationViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-68480125);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(recurringReloadConfigurationViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(factory) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(realCashVibrator) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1321597208, new SliderKt$$ExternalSyntheticLambda7(((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).fontScale, factory, recurringReloadConfigurationViewModel, realCashVibrator, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda1(recurringReloadConfigurationViewModel, i, function1, factory, realCashVibrator, 1);
        }
    }

    public static final void RecurringReloadOptionContent(RecurringReloadOptionViewModel recurringReloadOptionViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        recurringReloadOptionViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(729558952);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(recurringReloadOptionViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-1495952664, new WorkViewFactory$$ExternalSyntheticLambda12(function1, recurringReloadOptionViewModel, z, 5), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(recurringReloadOptionViewModel, function1, realImageLoader, i, 20);
        }
    }

    public static final void RecurringReloadsChangeInstrumentContent(Modifier modifier, RecurringReloadsChangeInstrumentViewModel recurringReloadsChangeInstrumentViewModel, Function1 function1, Composer composer, int i) {
        recurringReloadsChangeInstrumentViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-540302328);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(recurringReloadsChangeInstrumentViewModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Countries.PageHeader(recurringReloadsChangeInstrumentViewModel.title, (Modifier) null, (Function2) null, recurringReloadsChangeInstrumentViewModel.body, gapComposer, 0, 6);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(801809280, new RecurringReloadsChangeInstrumentSheetKt$$ExternalSyntheticLambda3(function1, recurringReloadsChangeInstrumentViewModel), gapComposer), gapComposer, 24576, 15);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxReturnsView$$ExternalSyntheticLambda1((Object) modifier, (Object) recurringReloadsChangeInstrumentViewModel, (Object) function1, i, 18);
        }
    }

    public static final void RecurringReloadsChangeInstrumentSheet(RecurringReloadsChangeInstrumentViewModel recurringReloadsChangeInstrumentViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        recurringReloadsChangeInstrumentViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(182740559);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(recurringReloadsChangeInstrumentViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-652193244, new WorkViewFactory$$ExternalSyntheticLambda12(function1, recurringReloadsChangeInstrumentViewModel, z, 7), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(recurringReloadsChangeInstrumentViewModel, function1, i, 20);
        }
    }

    public static final void RecurringReloadsDismissDialog(RecurringReloadsDismissDialogViewModel recurringReloadsDismissDialogViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        recurringReloadsDismissDialogViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(945742037);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(recurringReloadsDismissDialogViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1871354464, new WorkViewFactory$$ExternalSyntheticLambda12(function1, recurringReloadsDismissDialogViewModel, z, 8), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(recurringReloadsDismissDialogViewModel, function1, i, 21);
        }
    }

    public static final void ScheduledReloadConfirmation(final ScheduledReloadConfirmationViewModel.Content content, Function1 function1, Composer composer, int i) {
        Function1 function12;
        int i2;
        CellDefaultAccessory cellDefaultAccessory;
        NeverEqualPolicy neverEqualPolicy;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-938512287);
        Applier applier = gapComposer.applier;
        int i3 = i | (gapComposer.changedInstance(content) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            NavigationType navigationType = NavigationType.CLOSE;
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy2) {
                rememberedValue = new HeroCardViewKt$$ExternalSyntheticLambda5(16, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            final int i5 = 0;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Countries.PageHeader(content.title, (Modifier) null, (Function2) null, (String) null, gapComposer, 0, 14);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            String str = content.frequencyValue;
            if (str != null) {
                i2 = 2;
                cellDefaultAccessory = new CellDefaultAccessory.Label(str, 2);
            } else {
                i2 = 2;
                cellDefaultAccessory = CellDefaultAccessory.Push.INSTANCE;
            }
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1798926170, new Function2() { // from class: com.squareup.cash.transfers.views.ScheduledReloadConfirmationViewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    ScheduledReloadConfirmationViewModel.Content content2 = content;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content2.frequencyLabel, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content2.dayLabel, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content2.amountLabel, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            boolean z3 = i4 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z3 || rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = new HeroCardViewKt$$ExternalSyntheticLambda5(17, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            gapComposer = gapComposer;
            final int i6 = i2;
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(null, rememberComposableLambda, null, (Function0) rememberedValue2, false, false, null, null, cellDefaultAccessory, 0L, gapComposer, 54, 3572);
            if (content.showDay) {
                gapComposer.startReplaceGroup(653964113);
                String str2 = content.dayValue;
                CellDefaultAccessory label = str2 != null ? new CellDefaultAccessory.Label(str2, i6) : CellDefaultAccessory.Push.INSTANCE;
                final int i7 = 1;
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1225419605, new Function2() { // from class: com.squareup.cash.transfers.views.ScheduledReloadConfirmationViewKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i62 = i7;
                        ScheduledReloadConfirmationViewModel.Content content2 = content;
                        switch (i62) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content2.frequencyLabel, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content2.dayLabel, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj;
                                int intValue3 = ((Integer) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content2.amountLabel, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                boolean z4 = i4 == 32;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z4 || rememberedValue3 == neverEqualPolicy2) {
                    rememberedValue3 = new HeroCardViewKt$$ExternalSyntheticLambda5(18, function1);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                neverEqualPolicy = neverEqualPolicy2;
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(null, rememberComposableLambda2, null, (Function0) rememberedValue3, false, false, null, null, label, 0L, gapComposer, 54, 3572);
                z = false;
                gapComposer.end(false);
            } else {
                neverEqualPolicy = neverEqualPolicy2;
                z = false;
                gapComposer.startReplaceGroup(654298541);
                gapComposer.end(false);
            }
            String str3 = content.amountValue;
            CellDefaultAccessory label2 = str3 != null ? new CellDefaultAccessory.Label(str3, i6) : CellDefaultAccessory.Push.INSTANCE;
            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-932215217, new Function2() { // from class: com.squareup.cash.transfers.views.ScheduledReloadConfirmationViewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i6;
                    ScheduledReloadConfirmationViewModel.Content content2 = content;
                    switch (i62) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content2.frequencyLabel, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content2.dayLabel, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content2.amountLabel, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            boolean z5 = i4 == 32 ? true : z;
            Object rememberedValue4 = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy;
            if (z5 || rememberedValue4 == neverEqualPolicy3) {
                rememberedValue4 = new HeroCardViewKt$$ExternalSyntheticLambda5(19, function1);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            boolean z6 = z;
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(null, rememberComposableLambda3, null, (Function0) rememberedValue4, false, false, null, null, label2, 0L, gapComposer, 54, 3572);
            InstrumentCellViewModel instrumentCellViewModel = content.instrumentCellViewModel;
            if (instrumentCellViewModel == null) {
                gapComposer.startReplaceGroup(654683715);
                gapComposer.end(z6);
                function12 = function1;
            } else {
                gapComposer.startReplaceGroup(654683716);
                InstrumentCellAlignment instrumentCellAlignment = InstrumentCellAlignment.RIGHT;
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                boolean z7 = i4 == 32 ? true : z6;
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (z7 || rememberedValue5 == neverEqualPolicy3) {
                    function12 = function1;
                    rememberedValue5 = new HeroCardViewKt$$ExternalSyntheticLambda5(14, function12);
                    gapComposer.updateRememberedValue(rememberedValue5);
                } else {
                    function12 = function1;
                }
                InstrumentCellKt.InstrumentCellSmall(null, instrumentCellViewModel, instrumentCellAlignment, textStyle, (Function0) rememberedValue5, gapComposer, MLKEMEngine.KyberPolyBytes, 1);
                gapComposer.end(z6);
            }
            gapComposer.end(true);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1201855977, new TabToolbarsKt$$ExternalSyntheticLambda3(19, content, function12), gapComposer), gapComposer, 24576, 15);
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkViewFactory$$ExternalSyntheticLambda12(content, function12, i, 9);
        }
    }

    public static final void ScheduledReloadConfirmationContent(ScheduledReloadConfirmationViewModel scheduledReloadConfirmationViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        scheduledReloadConfirmationViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2000921512);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(scheduledReloadConfirmationViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-1908707432, new ScheduledReloadConfirmationViewKt$$ExternalSyntheticLambda0(scheduledReloadConfirmationViewModel, function1, i3), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(scheduledReloadConfirmationViewModel, function1, realImageLoader, i, 21);
        }
    }

    public static final void SetDefaultInstrumentView(Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1500182751);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ViewGroups$$ExternalSyntheticLambda0(5, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue, gapComposer, 0);
            ArcadeThemeKt.ArcadeTheme(null, null, null, lambda$1551846774, gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayFirstTimeKt$$ExternalSyntheticLambda1(i, 8, function1);
        }
    }

    public static final void SettingCell(RecurringReloadOptionViewModel.SettingRow settingRow, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1510609598);
        int i2 = (gapComposer.changedInstance(settingRow) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        int i3 = 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(null, Expect_jvmKt.rememberComposableLambda(532726833, new FieldBinding$$ExternalSyntheticLambda4(settingRow, i3), gapComposer), null, function0, false, false, null, null, new CellDefaultAccessory.Label(settingRow.value, 2), 0L, gapComposer, ((i2 << 6) & 7168) | 54, 3572);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkViewFactory$$ExternalSyntheticLambda12(settingRow, function0, i, 6);
        }
    }

    public static final void StackedCardSection(List list, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1435116075);
        int i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            OffsetKt.BoxWithConstraints(SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), null, false, Expect_jvmKt.rememberComposableLambda(-524860501, new InfoSectionKt$$ExternalSyntheticLambda0(3, function1, list), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SelectionViewKt$$ExternalSyntheticLambda6(list, function1, i, 15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TransfersAmountView(AmountDisplayState amountDisplayState, KeypadAmount keypadAmount, Modifier modifier, Function0 function0, Function0 function02, FocusRequester focusRequester, Composer composer, int i, int i2) {
        int i3;
        GapComposer gapComposer;
        Function0 function03;
        RecomposeScopeImpl endRestartGroup;
        MutableState mutableState;
        GapComposer gapComposer2;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(600214158);
        if ((i & 6) == 0) {
            i3 = (gapComposer3.changed(amountDisplayState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer3.changed(true) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= (i & 512) == 0 ? gapComposer3.changed(keypadAmount) : gapComposer3.changedInstance(keypadAmount) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer3.changed(modifier) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer3.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            i3 |= gapComposer3.changedInstance(function02) ? PKIFailureInfo.unsupportedVersion : 65536;
            if ((1572864 & i) == 0) {
                i3 |= gapComposer3.changed(focusRequester) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            }
            if (gapComposer3.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
                gapComposer = gapComposer3;
                gapComposer.skipToGroupEnd();
                function03 = function02;
            } else {
                Function0 function04 = i4 != 0 ? null : function02;
                gapComposer3.startReplaceGroup(1031530825);
                if (focusRequester == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("FocusRequester must be provided when showKeyboard is true");
                    return;
                }
                Object rememberedValue = gapComposer3.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Updater.mutableStateOf$default(Boolean.TRUE);
                    gapComposer3.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState2 = (MutableState) rememberedValue;
                Object rememberedValue2 = gapComposer3.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    mutableState = mutableState2;
                    rememberedValue2 = Updater.mutableStateOf$default(new TextFieldValue((String) null, 0L, 7));
                    gapComposer3.updateRememberedValue(rememberedValue2);
                } else {
                    mutableState = mutableState2;
                }
                MutableState mutableState3 = (MutableState) rememberedValue2;
                Object rememberedValue3 = gapComposer3.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = Updater.mutableStateOf$default(((TextFieldValue) mutableState3.getValue()).annotatedString.text);
                    gapComposer3.updateRememberedValue(rememberedValue3);
                }
                MutableState mutableState4 = (MutableState) rememberedValue3;
                if (keypadAmount != null) {
                    TextFieldValue textFieldValue = (TextFieldValue) mutableState3.getValue();
                    String str = keypadAmount.amountText;
                    int length = str.length();
                    gapComposer2 = gapComposer3;
                    mutableState3.setValue(TextFieldValue.m1002copy3r_uNRQ$default(textFieldValue, str, coil3.size.SizeKt.TextRange(length, length), 4));
                    mutableState4.setValue(keypadAmount.amountText);
                } else {
                    gapComposer2 = gapComposer3;
                }
                Modifier focusRequester2 = FocusTraversalKt.focusRequester(TestTagKt.testTag(modifier, "input-amount-view"), focusRequester);
                TextFieldValue textFieldValue2 = (TextFieldValue) mutableState3.getValue();
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, Boolean.FALSE, 9, 7, Boolean.TRUE, 81);
                boolean z = (57344 & i3) == 16384;
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (z || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new CardTransitionKt$$ExternalSyntheticLambda16(2, function0);
                    gapComposer = gapComposer2;
                    gapComposer.updateRememberedValue(rememberedValue4);
                } else {
                    gapComposer = gapComposer2;
                }
                KeyboardActions keyboardActions = new KeyboardActions((Function1) rememberedValue4, null, null, 62);
                boolean z2 = (i3 & 896) == 256 || ((i3 & 512) != 0 && gapComposer.changedInstance(keypadAmount));
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (z2 || rememberedValue5 == neverEqualPolicy) {
                    OpenSourceKt$$ExternalSyntheticLambda9 openSourceKt$$ExternalSyntheticLambda9 = new OpenSourceKt$$ExternalSyntheticLambda9(mutableState, (Object) keypadAmount, (Object) mutableState4, mutableState3, 8);
                    gapComposer.updateRememberedValue(openSourceKt$$ExternalSyntheticLambda9);
                    rememberedValue5 = openSourceKt$$ExternalSyntheticLambda9;
                }
                BasicTextFieldKt.BasicTextField(textFieldValue2, (Function1) rememberedValue5, focusRequester2, true, null, keyboardOptions, keyboardActions, true, 0, 0, null, null, null, null, Expect_jvmKt.rememberComposableLambda(-1597999754, new TabToolbarsKt$$ExternalSyntheticLambda3(20, amountDisplayState, function04), gapComposer), gapComposer, 100666368, 196608, 32304);
                gapComposer.end(false);
                function03 = function04;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(amountDisplayState, keypadAmount, modifier, function0, function03, focusRequester, i, i2, 24);
                return;
            }
            return;
        }
        if ((1572864 & i) == 0) {
        }
        if (gapComposer3.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void TransfersRouterView(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1535282806);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayKt$$ExternalSyntheticLambda0(i, 25);
        }
    }

    public static final void WithdrawAmountView(Modifier modifier, WithdrawViewModel$AmountConfig$KeypadConfig withdrawViewModel$AmountConfig$KeypadConfig, MoneyFormatter moneyFormatter, Function1 function1, KeypadAmount keypadAmount, Function0 function0, FocusRequester focusRequester, Composer composer, int i) {
        int i2;
        WithdrawViewModel$AmountConfig$KeypadConfig withdrawViewModel$AmountConfig$KeypadConfig2;
        GapComposer gapComposer;
        View view;
        Object obj;
        Function0 function02;
        AmountDisplayState amountDisplayState;
        Shaker shaker;
        boolean z;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(660693188);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(withdrawViewModel$AmountConfig$KeypadConfig) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(moneyFormatter) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= (i & PKIFailureInfo.transactionIdInUse) == 0 ? gapComposer2.changed(keypadAmount) : gapComposer2.changedInstance(keypadAmount) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        int i3 = i2 | 12582912;
        if ((100663296 & i) == 0) {
            i3 |= gapComposer2.changed(focusRequester) ? 67108864 : 33554432;
        }
        int i4 = i3;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 38347923) != 38347922)) {
            View view2 = (View) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalView);
            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(true, gapComposer2, 0);
            AmountConfig.MoneyConfig moneyConfig = new AmountConfig.MoneyConfig(withdrawViewModel$AmountConfig$KeypadConfig.currency, null, false, 0, 14);
            String format2 = moneyFormatter.format(withdrawViewModel$AmountConfig$KeypadConfig.currentAmount);
            boolean z2 = (i4 & 57344) == 16384;
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (z2 || rememberedValue == obj2) {
                rememberedValue = new ViewGroups$$ExternalSyntheticLambda0(6, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            AmountDisplayState rememberAmountDisplayState = ConnectionPoolKt.rememberAmountDisplayState(moneyConfig, format2, (Function1) rememberedValue, gapComposer2, 0);
            Object[] objArr = {keypadAmount, rememberAmountDisplayState, null, rememberShaker};
            int i5 = i4 & 458752;
            boolean changedInstance = gapComposer2.changedInstance(moneyFormatter) | gapComposer2.changedInstance(withdrawViewModel$AmountConfig$KeypadConfig) | (i5 == 131072 || ((i4 & PKIFailureInfo.transactionIdInUse) != 0 && gapComposer2.changedInstance(keypadAmount))) | gapComposer2.changed(rememberAmountDisplayState) | gapComposer2.changedInstance(null) | gapComposer2.changedInstance(rememberShaker);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue2 == obj2) {
                view = view2;
                obj = obj2;
                function02 = null;
                amountDisplayState = rememberAmountDisplayState;
                Object withdrawViewKt$WithdrawAmountView$1$1 = new WithdrawViewKt$WithdrawAmountView$1$1(moneyFormatter, withdrawViewModel$AmountConfig$KeypadConfig, keypadAmount, amountDisplayState, rememberShaker, null, 0);
                shaker = rememberShaker;
                gapComposer2.updateRememberedValue(withdrawViewKt$WithdrawAmountView$1$1);
                rememberedValue2 = withdrawViewKt$WithdrawAmountView$1$1;
            } else {
                view = view2;
                obj = obj2;
                function02 = null;
                shaker = rememberShaker;
                amountDisplayState = rememberAmountDisplayState;
            }
            Updater.LaunchedEffect(objArr, (Function2) rememberedValue2, gapComposer2);
            boolean changed = gapComposer2.changed(amountDisplayState) | gapComposer2.changedInstance(withdrawViewModel$AmountConfig$KeypadConfig) | (i5 == 131072 || ((i4 & PKIFailureInfo.transactionIdInUse) != 0 && gapComposer2.changedInstance(keypadAmount))) | gapComposer2.changedInstance(moneyFormatter);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed || rememberedValue3 == obj) {
                AmountDisplayState amountDisplayState2 = amountDisplayState;
                Object anonymousClass2 = new HeroCardViewKt$Render$1$4$1.AnonymousClass2(amountDisplayState2, withdrawViewModel$AmountConfig$KeypadConfig, keypadAmount, moneyFormatter, (Continuation) null, 6);
                amountDisplayState = amountDisplayState2;
                withdrawViewModel$AmountConfig$KeypadConfig2 = withdrawViewModel$AmountConfig$KeypadConfig;
                gapComposer2.updateRememberedValue(anonymousClass2);
                rememberedValue3 = anonymousClass2;
            } else {
                withdrawViewModel$AmountConfig$KeypadConfig2 = withdrawViewModel$AmountConfig$KeypadConfig;
            }
            int i6 = i4 >> 3;
            int i7 = (i4 >> 9) & 896;
            Updater.LaunchedEffect(withdrawViewModel$AmountConfig$KeypadConfig2, amountDisplayState, keypadAmount, (Function2) rememberedValue3, gapComposer2);
            Modifier shakeWith = SharedViewEventsKt.shakeWith(modifier, shaker);
            if (focusRequester == null) {
                gapComposer2.startReplaceGroup(-1122360993);
                gapComposer2.end(false);
                z = false;
            } else {
                gapComposer2.startReplaceGroup(-1122360992);
                View view3 = view;
                boolean changed2 = gapComposer2.changed(focusRequester) | gapComposer2.changedInstance(view3);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (changed2 || rememberedValue4 == obj) {
                    rememberedValue4 = new AddMoneyViewKt$$ExternalSyntheticLambda4(focusRequester, view3, 1);
                    gapComposer2.updateRememberedValue(rememberedValue4);
                }
                Function0 function03 = (Function0) rememberedValue4;
                z = false;
                gapComposer2.end(false);
                function02 = function03;
            }
            if ((i4 & 3670016) == 1048576) {
                z = true;
            }
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (z || rememberedValue5 == obj) {
                rememberedValue5 = new AlertBannerKt$$ExternalSyntheticLambda2(11, function0);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            gapComposer = gapComposer2;
            TransfersAmountView(amountDisplayState, keypadAmount, shakeWith, (Function0) rememberedValue5, function02, focusRequester, gapComposer, (i6 & 112) | 512 | i7 | ((i4 >> 6) & 3670016), 0);
        } else {
            withdrawViewModel$AmountConfig$KeypadConfig2 = withdrawViewModel$AmountConfig$KeypadConfig;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScaffoldKt$$ExternalSyntheticLambda5(modifier, withdrawViewModel$AmountConfig$KeypadConfig2, moneyFormatter, function1, keypadAmount, function0, focusRequester, i, 10);
        }
    }

    public static final void WithdrawChangedAmountContent(Modifier modifier, WithdrawViewModel.ChangeAmount changeAmount, MoneyFormatter moneyFormatter, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        Function1 function12;
        changeAmount.getClass();
        moneyFormatter.getClass();
        function1.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(861344296);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(changeAmount) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(moneyFormatter) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            long j = Strings.getColors(gapComposer).semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(ImageKt.m177backgroundbw27NRU(modifier, j, rectangleShapeKt$RectangleShape$1));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, navigationBarsPadding);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
            long j2 = Strings.getColors(gapComposer).semantic.background.f1047app;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, j2, rectangleShapeKt$RectangleShape$1);
            NavigationType navigationType = NavigationType.BACK;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(2094219928, new FieldBinding$$ExternalSyntheticLambda4(changeAmount, 7), gapComposer);
            int i3 = i2 & 7168;
            int i4 = i2 & 57344;
            boolean changedInstance = gapComposer.changedInstance(view) | (i3 == 2048) | (i4 == 16384);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BasicShieetScope$$ExternalSyntheticLambda10(26, view, function1, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            int i5 = i2;
            DBUtil.TitleBarSub(rememberComposableLambda, navigationType, m177backgroundbw27NRU, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, f737lambda$643985123, gapComposer, 1572918, 40);
            gapComposer = gapComposer;
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            SpacerKt.Spacer(gapComposer, columnScopeInstance.weight(1.0f, companion, true));
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new KeypadAmount();
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            int i6 = i5 << 3;
            WithdrawAmountView(columnScopeInstance.align(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterHorizontally), changeAmount.amountConfig, moneyFormatter, function1, (KeypadAmount) rememberedValue2, function0, DBUtil.rememberFocusRequesterAndRequestFocus(gapComposer), gapComposer, (3670016 & (i5 << 6)) | (i6 & 57344) | (i6 & 7168) | MLKEMEngine.KyberPolyBytes | PKIFailureInfo.transactionIdInUse);
            function12 = function1;
            SpacerKt.Spacer(gapComposer, columnScopeInstance.weight(1.0f, companion, true));
            Modifier imePadding = SpacerKt.imePadding(SizeKt.fillMaxWidth(companion, 1.0f));
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(imePadding, 16.0f, 16.0f);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean z = (i3 == 2048) | (i4 == 16384);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new WithdrawViewKt$$ExternalSyntheticLambda2(function12, function0);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, m299paddingVpY3zN4, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1974181181, new TaxReturnsViewKt$$ExternalSyntheticLambda5(changeAmount, 20), gapComposer), gapComposer, 1573248, 56);
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda17((Object) modifier, (Object) changeAmount, (Object) moneyFormatter, function12, (Object) function0, i, 11);
        }
    }

    public static final void WithdrawViewAmountContent(Modifier modifier, final WithdrawViewModel.ViewAmount viewAmount, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Function1 function12 = function1;
        viewAmount.getClass();
        function12.getClass();
        function0.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2134450010);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(viewAmount) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 2048 : 1024;
        }
        int i3 = i2;
        final int i4 = 0;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, Strings.getColors(gapComposer2).semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            final int i5 = 1;
            Header(Request$Priority$EnumUnboxingLocalUtility.m(horizontal, m300paddingVpY3zN4$default), viewAmount.title, Strings.getTypography(gapComposer2).header, viewAmount.subtitle, gapComposer2, 0);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            Strings.getSizes(gapComposer2).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, Request$Priority$EnumUnboxingLocalUtility.m(horizontal, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2)), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).numeralLarge, 0L, Room.getSp(64), null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213), (TextLineBalancing) null, viewAmount.formattedAmount, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer2, null);
            Strings.getSizes(gapComposer2).getClass();
            Strings.getSizes(gapComposer2).getClass();
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(horizontal, SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 4.0f));
            boolean z = (i3 & 7168) == 2048;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new AlertBannerKt$$ExternalSyntheticLambda2(12, function0);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue, m, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-158141240, new Function3() { // from class: com.squareup.cash.transfers.views.WithdrawViewKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i4;
                    WithdrawViewModel.ViewAmount viewAmount2 = viewAmount;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((RowScope) obj).getClass();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, viewAmount2.changeAmountButtonLabel, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((RowScope) obj).getClass();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, viewAmount2.confirmationButtonLabel, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), gapComposer2, 1572864, 60);
            GapComposer gapComposer3 = gapComposer2;
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
            InstrumentCellViewModel instrumentCellViewModel = viewAmount.instrumentCellViewModel;
            if (instrumentCellViewModel == null) {
                gapComposer3.startReplaceGroup(32638439);
                gapComposer3.end(false);
            } else {
                gapComposer3.startReplaceGroup(32638440);
                boolean z2 = (i3 & 896) == 256;
                Object rememberedValue2 = gapComposer3.rememberedValue();
                if (z2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new HeroCardViewKt$$ExternalSyntheticLambda5(24, function12);
                    gapComposer3.updateRememberedValue(rememberedValue2);
                }
                InstrumentCellKt.InstrumentCellSmall(null, instrumentCellViewModel, null, null, (Function0) rememberedValue2, gapComposer3, 0, 13);
                gapComposer3 = gapComposer3;
                gapComposer3.end(false);
            }
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
            Strings.getSizes(gapComposer3).getClass();
            GapComposer gapComposer4 = gapComposer3;
            ArcadeDepositPreferenceOptions(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), viewAmount.depositPreferenceOptions, viewAmount.depositPreferenceStyle, viewAmount.selectedDepositPreference, viewAmount.confirmationButtonLabel, function1, gapComposer4, (i3 << 9) & 458752);
            function12 = function1;
            if (viewAmount.depositPreferenceStyle == WithdrawViewModel.ViewAmount.DepositPreferenceStyle.DEFAULT) {
                gapComposer4.startReplaceGroup(33299422);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(TestTagKt.testTag(companion, "withdraw-cta"), 1.0f);
                Strings.getSizes(gapComposer4).getClass();
                Strings.getSizes(gapComposer4).getClass();
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth, 16.0f, 16.0f);
                boolean z3 = viewAmount.selectedDepositPreference != null;
                ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                boolean z4 = (i3 & 896) == 256;
                Object rememberedValue3 = gapComposer4.rememberedValue();
                if (z4 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new HeroCardViewKt$$ExternalSyntheticLambda5(25, function12);
                    gapComposer4.updateRememberedValue(rememberedValue3);
                }
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, m299paddingVpY3zN4, buttonProminence, false, z3, null, Expect_jvmKt.rememberComposableLambda(1676059664, new Function3() { // from class: com.squareup.cash.transfers.views.WithdrawViewKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i6 = i5;
                        WithdrawViewModel.ViewAmount viewAmount2 = viewAmount;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer32 = (GapComposer) composer2;
                                if (gapComposer32.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, viewAmount2.changeAmountButtonLabel, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer32.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer42 = (GapComposer) composer3;
                                if (gapComposer42.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, viewAmount2.confirmationButtonLabel, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer42.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer4), gapComposer4, 1573248, 40);
                gapComposer = gapComposer4;
                gapComposer.end(false);
            } else {
                gapComposer = gapComposer4;
                gapComposer.startReplaceGroup(33755122);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda1(modifier, viewAmount, function12, function0, i);
        }
    }

    public static final SheetPeekPosition$FixedHeight calculatePeekPosition(RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel, float f) {
        return new SheetPeekPosition$FixedHeight(6, (recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectFrequency ? 431 : recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectDay ? 540 : ((recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker) || (recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad)) ? 430 : 400) + ((int) (((f - 1.0f) * 8.0f) / 0.08f)), false);
    }

    public static final int getNavigationStep(RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel) {
        if ((recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker) || (recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad)) {
            return 0;
        }
        if ((recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker) || (recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad)) {
            return 1;
        }
        if (recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectFrequency) {
            return 0;
        }
        if (recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectDay) {
            return 1;
        }
        if ((recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker) || (recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad)) {
            return 2;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    public static final void Content(Modifier modifier, InstrumentNotLinkedViewModel instrumentNotLinkedViewModel, Function1 function1, Composer composer, int i) {
        instrumentNotLinkedViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2059316748);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(instrumentNotLinkedViewModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier != null) {
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                Transformations.SheetHeader(instrumentNotLinkedViewModel.header, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-350752671, new FieldBinding$$ExternalSyntheticLambda4(instrumentNotLinkedViewModel, 5), gapComposer), (String) null, gapComposer, MLKEMEngine.KyberPolyBytes, 10);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(-1609174140, new InstrumentNotLinkedSheetKt$$ExternalSyntheticLambda3(function1, instrumentNotLinkedViewModel), gapComposer), gapComposer, 24960, 11);
                gapComposer = gapComposer;
                gapComposer.end(true);
            } else {
                Updater.invalidApplier();
                throw null;
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxReturnsView$$ExternalSyntheticLambda1((Object) modifier, (Object) instrumentNotLinkedViewModel, (Object) function1, i, 15);
        }
    }

    public static final void Content(Modifier modifier, final InstrumentDetailsViewModel instrumentDetailsViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        instrumentDetailsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-17259106);
        final int i2 = 2;
        int i3 = i | (gapComposer2.changed(modifier) ? 4 : 2) | (gapComposer2.changedInstance(instrumentDetailsViewModel) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        final int i4 = 1;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier != null) {
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                Transformations.SheetHeader(Expect_jvmKt.rememberComposableLambda(2011485223, new Function2() { // from class: com.squareup.cash.transfers.views.InstrumentDetailsViewKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = r2;
                        InstrumentDetailsViewModel instrumentDetailsViewModel2 = instrumentDetailsViewModel;
                        switch (i5) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    String str = instrumentDetailsViewModel2.title;
                                    if (str == null) {
                                        gapComposer3.startReplaceGroup(772579978);
                                    } else {
                                        gapComposer3.startReplaceGroup(772579979);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    InstrumentIcon instrumentIcon = instrumentDetailsViewModel2.instrumentIcon;
                                    if (instrumentDetailsViewModel2.enableHeroImage && (instrumentIcon instanceof InstrumentIcon.RemoteIcon)) {
                                        gapComposer4.startReplaceGroup(-95241797);
                                        CardArtImageKt.m3576CardArtImageAFY4PWA(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), instrumentIcon, 16.0f, instrumentDetailsViewModel2.cardInfoLabel, null, null, false, gapComposer4, 390, 112);
                                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer4, null);
                                        gapComposer4.end(false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-94987566);
                                        if (instrumentIcon == null) {
                                            gapComposer4.startReplaceGroup(-94971757);
                                        } else {
                                            gapComposer4.startReplaceGroup(-94971756);
                                            InstrumentCellKt.InstrumentAvatar(null, CollectionsKt__CollectionsJVMKt.listOf(instrumentIcon), AvatarSize.Size64, gapComposer4, MLKEMEngine.KyberPolyBytes, 1);
                                        }
                                        gapComposer4.end(false);
                                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer4, null);
                                        gapComposer4.end(false);
                                    }
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj;
                                int intValue3 = ((Integer) obj2).intValue();
                                GapComposer gapComposer5 = (GapComposer) composer4;
                                if (gapComposer5.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                    String str2 = instrumentDetailsViewModel2.subtitle;
                                    if (str2 == null) {
                                        gapComposer5.startReplaceGroup(-529308089);
                                    } else {
                                        gapComposer5.startReplaceGroup(-529308088);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer5.end(false);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer2), (Modifier) null, Expect_jvmKt.rememberComposableLambda(43680297, new Function2() { // from class: com.squareup.cash.transfers.views.InstrumentDetailsViewKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = i4;
                        InstrumentDetailsViewModel instrumentDetailsViewModel2 = instrumentDetailsViewModel;
                        switch (i5) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    String str = instrumentDetailsViewModel2.title;
                                    if (str == null) {
                                        gapComposer3.startReplaceGroup(772579978);
                                    } else {
                                        gapComposer3.startReplaceGroup(772579979);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    InstrumentIcon instrumentIcon = instrumentDetailsViewModel2.instrumentIcon;
                                    if (instrumentDetailsViewModel2.enableHeroImage && (instrumentIcon instanceof InstrumentIcon.RemoteIcon)) {
                                        gapComposer4.startReplaceGroup(-95241797);
                                        CardArtImageKt.m3576CardArtImageAFY4PWA(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), instrumentIcon, 16.0f, instrumentDetailsViewModel2.cardInfoLabel, null, null, false, gapComposer4, 390, 112);
                                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer4, null);
                                        gapComposer4.end(false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-94987566);
                                        if (instrumentIcon == null) {
                                            gapComposer4.startReplaceGroup(-94971757);
                                        } else {
                                            gapComposer4.startReplaceGroup(-94971756);
                                            InstrumentCellKt.InstrumentAvatar(null, CollectionsKt__CollectionsJVMKt.listOf(instrumentIcon), AvatarSize.Size64, gapComposer4, MLKEMEngine.KyberPolyBytes, 1);
                                        }
                                        gapComposer4.end(false);
                                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer4, null);
                                        gapComposer4.end(false);
                                    }
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj;
                                int intValue3 = ((Integer) obj2).intValue();
                                GapComposer gapComposer5 = (GapComposer) composer4;
                                if (gapComposer5.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                    String str2 = instrumentDetailsViewModel2.subtitle;
                                    if (str2 == null) {
                                        gapComposer5.startReplaceGroup(-529308089);
                                    } else {
                                        gapComposer5.startReplaceGroup(-529308088);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer5.end(false);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer2), Expect_jvmKt.rememberComposableLambda(1207261482, new Function2() { // from class: com.squareup.cash.transfers.views.InstrumentDetailsViewKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = i2;
                        InstrumentDetailsViewModel instrumentDetailsViewModel2 = instrumentDetailsViewModel;
                        switch (i5) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    String str = instrumentDetailsViewModel2.title;
                                    if (str == null) {
                                        gapComposer3.startReplaceGroup(772579978);
                                    } else {
                                        gapComposer3.startReplaceGroup(772579979);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    InstrumentIcon instrumentIcon = instrumentDetailsViewModel2.instrumentIcon;
                                    if (instrumentDetailsViewModel2.enableHeroImage && (instrumentIcon instanceof InstrumentIcon.RemoteIcon)) {
                                        gapComposer4.startReplaceGroup(-95241797);
                                        CardArtImageKt.m3576CardArtImageAFY4PWA(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), instrumentIcon, 16.0f, instrumentDetailsViewModel2.cardInfoLabel, null, null, false, gapComposer4, 390, 112);
                                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer4, null);
                                        gapComposer4.end(false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-94987566);
                                        if (instrumentIcon == null) {
                                            gapComposer4.startReplaceGroup(-94971757);
                                        } else {
                                            gapComposer4.startReplaceGroup(-94971756);
                                            InstrumentCellKt.InstrumentAvatar(null, CollectionsKt__CollectionsJVMKt.listOf(instrumentIcon), AvatarSize.Size64, gapComposer4, MLKEMEngine.KyberPolyBytes, 1);
                                        }
                                        gapComposer4.end(false);
                                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer4, null);
                                        gapComposer4.end(false);
                                    }
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj;
                                int intValue3 = ((Integer) obj2).intValue();
                                GapComposer gapComposer5 = (GapComposer) composer4;
                                if (gapComposer5.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                    String str2 = instrumentDetailsViewModel2.subtitle;
                                    if (str2 == null) {
                                        gapComposer5.startReplaceGroup(-529308089);
                                    } else {
                                        gapComposer5.startReplaceGroup(-529308088);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer5.end(false);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer2), gapComposer2, 3462, 2);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                InstrumentDetailsViewModel.DefaultState defaultState = instrumentDetailsViewModel.defaultState;
                int i5 = i3 & 896;
                boolean z = i5 == 256;
                Object rememberedValue = gapComposer2.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (z || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new TaxReturnsView$$ExternalSyntheticLambda0(24, function1);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                DefaultPaymentMethodRow(defaultState, (Function0) rememberedValue, gapComposer2, 0);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                String str = instrumentDetailsViewModel.removeCtaLabel;
                String str2 = instrumentDetailsViewModel.replaceCtaLabel;
                boolean z2 = i5 == 256;
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (z2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new TaxReturnsView$$ExternalSyntheticLambda0(25, function1);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                Function0 function0 = (Function0) rememberedValue2;
                r12 = i5 == 256 ? 1 : 0;
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (r12 != 0 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new TaxReturnsView$$ExternalSyntheticLambda0(26, function1);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                InstrumentDetailsActions(0, gapComposer2, null, str, str2, function0, (Function0) rememberedValue3);
                gapComposer = gapComposer2;
                gapComposer.end(true);
            } else {
                Updater.invalidApplier();
                throw null;
            }
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxReturnsView$$ExternalSyntheticLambda1((Object) modifier, (Object) instrumentDetailsViewModel, (Object) function1, i, 10);
        }
    }
}

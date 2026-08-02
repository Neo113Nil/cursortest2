package net.oneformapp;

import android.util.Log;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.miteksystems.misnap.core.DateUtil;
import com.nimbusds.jose.util.X509CertChainUtils;
import com.nimbusds.jose.util.X509CertUtils;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.borrow.views.BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarKt;
import com.squareup.cash.datefilterbar.views.DateFilterChipKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.components.ArcadeBordersKt;
import com.squareup.cash.investing.components.InvestingMetricView$Factory$Impl;
import com.squareup.cash.investing.components.autoinvest.InvestingAutoInvestKt;
import com.squareup.cash.investing.components.stock.details.InvestmentEntityViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.components.stock.details.InvestmentEntityViewKt$$ExternalSyntheticLambda19;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestingAboutContentModel;
import com.squareup.cash.investing.viewmodels.InvestingDetailTileViewModel;
import com.squareup.cash.investing.viewmodels.InvestmentEntityContentModel;
import com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingDetailsCategorySectionContentModel;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingsViewModel;
import com.squareup.cash.investing.viewmodels.metrics.InvestingAnalystOpinionsViewModel$Content;
import com.squareup.cash.investing.viewmodels.metrics.InvestingAnalystOpinionsViewModel$Loading;
import com.squareup.cash.investing.viewmodels.metrics.InvestingEarningsViewModel;
import com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewModel$Content;
import com.squareup.cash.investing.viewmodels.metrics.InvestingFinancialViewModel$Loading;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoRecurringPurchaseTileViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewModel;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda5;
import com.squareup.cash.invitations.InviteErrorDialogKt$$ExternalSyntheticLambda0;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingStockDetailsHeaderViewModel;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphTabsViewKt;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.guava.ListenableFutureKt;
import kotlinx.coroutines.rx3.RxAwaitKt;
import kotlinx.serialization.PolymorphicSerializerKt;
import net.idrnd.misnap.iad.Result;
import net.idrnd.misnap.iad.a;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class DLog {
    public static final void EntityComponent(InvestmentEntityContentModel investmentEntityContentModel, Function1 function1, InvestmentEntityContentModel.Component component, RealImageLoader realImageLoader, InvestingScreens investingScreens, Composer composer, int i) {
        NeverEqualPolicy neverEqualPolicy;
        int i2;
        Modifier fillMaxWidth;
        boolean z;
        boolean z2;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
        Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1823030162);
        Applier applier = gapComposer.applier;
        int i3 = i | (gapComposer.changed(investmentEntityContentModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(component.ordinal()) ? 256 : 128) | (gapComposer.changedInstance(realImageLoader) ? 2048 : 1024) | (gapComposer.changedInstance(investingScreens) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            int ordinal = component.ordinal();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            switch (ordinal) {
                case 0:
                    gapComposer.startReplaceGroup(-29836394);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    if (investmentEntityContentModel.showPlaceHolderGraph) {
                        gapComposer.startReplaceGroup(-745320382);
                        fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                        Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(fillMaxWidth, 216.0f);
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        neverEqualPolicy = neverEqualPolicy2;
                        DateUtil.m2164MooncakeInvestingPreIpoGraphFNF3uiM(m277height3ABfNKs, null, colors.getSemantic().getText().placeholder, gapComposer, 6);
                        gapComposer = gapComposer;
                        gapComposer.endReplaceGroup();
                        i2 = 32;
                    } else {
                        neverEqualPolicy = neverEqualPolicy2;
                        gapComposer.startReplaceGroup(-745109117);
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 45.0f, 7);
                        InvestingGraphContentModel investingGraphContentModel = investmentEntityContentModel.graphContentModel;
                        Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        long j = colors2.getSemantic().getBackground().subtle;
                        boolean z3 = (i3 & 112) == 32;
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (z3 || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new InviteContactsBodyKt$$ExternalSyntheticLambda5(23, function1);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        i2 = 32;
                        InvestingGraphTabsViewKt.m3722MooncakeInvestingGraphRFMEUTM(investingGraphContentModel, m302paddingqDBjuR0$default, (Function1) rememberedValue, null, false, j, gapComposer, 48, 56);
                        gapComposer = gapComposer;
                        gapComposer.endReplaceGroup();
                    }
                    HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(Alignment.Companion.CenterHorizontally);
                    HistoricalRange historicalRange = investmentEntityContentModel.selectedRangeModel.range;
                    boolean z4 = investmentEntityContentModel.showPlaceHolderGraph;
                    boolean z5 = (i3 & 112) == i2;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (z5 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new InviteContactsBodyKt$$ExternalSyntheticLambda5(25, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    InvestingGraphTabsViewKt.InvestingGraphTimeRangeButtons(historicalRange, z4, (Function1) rememberedValue2, horizontalAlignElement, null, gapComposer, 0, 16);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                    gapComposer.endNode();
                    gapComposer.endReplaceGroup();
                    break;
                case 1:
                    boolean z6 = false;
                    gapComposer.startReplaceGroup(-28918019);
                    InvestmentEntityContentModel.InvestmentEntityButtonContainerModel investmentEntityButtonContainerModel = investmentEntityContentModel.entityButtonContainerModel;
                    if (investmentEntityButtonContainerModel != null) {
                        gapComposer.startReplaceGroup(-28802885);
                        ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                        int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                        ArcadeBordersKt.InvestmentEntityButtons(investmentEntityButtonContainerModel, function1, null, gapComposer, i3 & 112);
                        gapComposer.end(true);
                        z6 = false;
                        DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-28655852);
                        gapComposer.end(false);
                    }
                    gapComposer.end(z6);
                    break;
                case 2:
                    boolean z7 = false;
                    gapComposer.startReplaceGroup(-28585451);
                    MyInvestmentsContentModel myInvestmentsContentModel = investmentEntityContentModel.myInvestmentsModel;
                    if (myInvestmentsContentModel == null) {
                        gapComposer.startReplaceGroup(-28585452);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-28585451);
                        ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                        int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, companion);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$13);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                        boolean z8 = (i3 & 112) == 32;
                        Object rememberedValue3 = gapComposer.rememberedValue();
                        if (z8 || rememberedValue3 == neverEqualPolicy2) {
                            rememberedValue3 = new InviteErrorDialogKt$$ExternalSyntheticLambda0(15, function1);
                            gapComposer.updateRememberedValue(rememberedValue3);
                        }
                        z7 = false;
                        ArcadeBordersKt.MyInvestmentsTile(myInvestmentsContentModel, (Function0) rememberedValue3, null, gapComposer, 0);
                        DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                        gapComposer.end(true);
                        gapComposer.end(false);
                    }
                    gapComposer.end(z7);
                    break;
                case 3:
                    boolean z9 = false;
                    gapComposer.startReplaceGroup(-28287789);
                    InvestingAboutContentModel investingAboutContentModel = investmentEntityContentModel.aboutSection;
                    if (investingAboutContentModel == null) {
                        gapComposer.startReplaceGroup(-28287790);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-28287789);
                        ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                        int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, companion);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$14);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, columnMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                        z9 = false;
                        Result.InvestingAboutTile(null, investingAboutContentModel, gapComposer, 0);
                        DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                        gapComposer.end(true);
                        gapComposer.end(false);
                    }
                    gapComposer.end(z9);
                    break;
                case 4:
                    boolean z10 = false;
                    gapComposer.startReplaceGroup(-28129968);
                    if (investmentEntityContentModel.showKeyStats) {
                        gapComposer.startReplaceGroup(-28099402);
                        ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                        int hashCode5 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer, companion);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$15);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, columnMeasurePolicy5, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                        InvestingDetailTileViewModel investingDetailTileViewModel = investmentEntityContentModel.keyStatsModel;
                        boolean z11 = (i3 & 112) == 32;
                        Object rememberedValue4 = gapComposer.rememberedValue();
                        if (z11 || rememberedValue4 == neverEqualPolicy2) {
                            rememberedValue4 = new InviteContactsBodyKt$$ExternalSyntheticLambda5(17, function1);
                            gapComposer.updateRememberedValue(rememberedValue4);
                        }
                        z10 = false;
                        ArcadeBordersKt.InvestingKeyStatsTile(investingDetailTileViewModel, (Function1) rememberedValue4, null, gapComposer, 0);
                        DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                        gapComposer.end(true);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-27855308);
                        gapComposer.end(false);
                    }
                    gapComposer.end(z10);
                    break;
                case 5:
                    boolean z12 = false;
                    gapComposer.startReplaceGroup(-27480270);
                    InvestingCryptoRecurringPurchaseTileViewModel investingCryptoRecurringPurchaseTileViewModel = investmentEntityContentModel.recurringPurchaseModel;
                    if (investingCryptoRecurringPurchaseTileViewModel == null) {
                        gapComposer.startReplaceGroup(-27480271);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-27480270);
                        ColumnMeasurePolicy columnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                        int hashCode6 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer, companion);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$16 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$16);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, columnMeasurePolicy6, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope6, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode6), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier6, ComposeUiNode.Companion.SetModifier);
                        boolean z13 = (i3 & 112) == 32;
                        Object rememberedValue5 = gapComposer.rememberedValue();
                        if (z13 || rememberedValue5 == neverEqualPolicy2) {
                            rememberedValue5 = new BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3(9, function1);
                            gapComposer.updateRememberedValue(rememberedValue5);
                        }
                        z12 = false;
                        InvestingAutoInvestKt.InvestingAutoInvest(investingCryptoRecurringPurchaseTileViewModel, (Function1) rememberedValue5, gapComposer, 0);
                        DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                        gapComposer.end(true);
                        gapComposer.end(false);
                    }
                    gapComposer.end(z12);
                    break;
                case 6:
                    gapComposer.startReplaceGroup(-27826478);
                    InvestingCryptoNewsViewModel investingCryptoNewsViewModel = investmentEntityContentModel.newsModel;
                    if (investingCryptoNewsViewModel == null || investingCryptoNewsViewModel.articles.isEmpty()) {
                        z = false;
                        gapComposer.startReplaceGroup(-27553740);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-27726720);
                        ColumnMeasurePolicy columnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                        int hashCode7 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer, companion);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$17 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$17);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, columnMeasurePolicy7, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope7, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode7), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier7, ComposeUiNode.Companion.SetModifier);
                        boolean z14 = (i3 & 112) == 32;
                        Object rememberedValue6 = gapComposer.rememberedValue();
                        if (z14 || rememberedValue6 == neverEqualPolicy2) {
                            rememberedValue6 = new InviteContactsBodyKt$$ExternalSyntheticLambda5(18, function1);
                            gapComposer.updateRememberedValue(rememberedValue6);
                        }
                        OnBackPressedDispatcherKt.InvestingCryptoNewsCarousel(investingCryptoNewsViewModel, (Function1) rememberedValue6, null, gapComposer, 0, 4);
                        gapComposer = gapComposer;
                        z = false;
                        DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                        gapComposer.end(true);
                        gapComposer.end(false);
                    }
                    gapComposer.end(z);
                    break;
                case 7:
                    boolean z15 = false;
                    gapComposer.startReplaceGroup(-27133039);
                    InvestingEtfHoldingsViewModel investingEtfHoldingsViewModel = investmentEntityContentModel.etfHoldingSection;
                    if (investingEtfHoldingsViewModel == null) {
                        gapComposer.startReplaceGroup(-27133040);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-27133039);
                        if (investingEtfHoldingsViewModel instanceof InvestingEtfHoldingsViewModel.Content) {
                            gapComposer.startReplaceGroup(1319374780);
                            ColumnMeasurePolicy columnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                            int hashCode8 = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope8 = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier8 = PlatformKt.materializeModifier(gapComposer, companion);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$18 = ComposeUiNode.Companion.Constructor;
                            if (applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer.startReusableNode();
                            if (gapComposer.inserting) {
                                gapComposer.createNode(layoutNode$Companion$Constructor$18);
                            } else {
                                gapComposer.useNode();
                            }
                            Updater.m576setimpl(gapComposer, columnMeasurePolicy8, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope8, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode8), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer, materializeModifier8, ComposeUiNode.Companion.SetModifier);
                            InvestingEtfHoldingsViewModel.Content content = (InvestingEtfHoldingsViewModel.Content) investingEtfHoldingsViewModel;
                            boolean z16 = (i3 & 112) == 32;
                            Object rememberedValue7 = gapComposer.rememberedValue();
                            if (z16 || rememberedValue7 == neverEqualPolicy2) {
                                rememberedValue7 = new InviteContactsBodyKt$$ExternalSyntheticLambda5(19, function1);
                                gapComposer.updateRememberedValue(rememberedValue7);
                            }
                            z15 = false;
                            ListenableFutureKt.InvestingEtfHoldingsComponent(content, (Function1) rememberedValue7, null, gapComposer, 0);
                            DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                            gapComposer.end(true);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(1319643860);
                            gapComposer.end(false);
                        }
                        gapComposer.end(z15);
                    }
                    gapComposer.end(z15);
                    break;
                case 8:
                    boolean z17 = false;
                    gapComposer.startReplaceGroup(-26692839);
                    UiCallbackModel uiCallbackModel = investmentEntityContentModel.activityModel;
                    if (uiCallbackModel == null) {
                        gapComposer.startReplaceGroup(-26692840);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-26692839);
                        ColumnMeasurePolicy columnMeasurePolicy9 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                        int hashCode9 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope9 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier9 = PlatformKt.materializeModifier(gapComposer, companion);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$19 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$19);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, columnMeasurePolicy9, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope9, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode9), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier9, ComposeUiNode.Companion.SetModifier);
                        AvatarsKt.ActivityEmbeddedView(uiCallbackModel, null, Expect_jvmKt.rememberComposableLambda(2029559479, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(uiCallbackModel, 6), gapComposer), null, null, gapComposer, MLKEMEngine.KyberPolyBytes, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
                        z17 = false;
                        DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                        gapComposer.end(true);
                        gapComposer.end(false);
                    }
                    gapComposer.end(z17);
                    break;
                case 9:
                    boolean z18 = false;
                    gapComposer.startReplaceGroup(-26159856);
                    X509CertUtils x509CertUtils = investmentEntityContentModel.financialSection;
                    if (x509CertUtils instanceof InvestingFinancialViewModel$Content) {
                        gapComposer.startReplaceGroup(-26082945);
                        ColumnMeasurePolicy columnMeasurePolicy10 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                        int hashCode10 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope10 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier10 = PlatformKt.materializeModifier(gapComposer, companion);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$110 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$110);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, columnMeasurePolicy10, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope10, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode10), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier10, ComposeUiNode.Companion.SetModifier);
                        X509CertUtils x509CertUtils2 = investmentEntityContentModel.financialSection;
                        boolean z19 = (i3 & 112) == 32;
                        Object rememberedValue8 = gapComposer.rememberedValue();
                        if (z19 || rememberedValue8 == neverEqualPolicy2) {
                            rememberedValue8 = new InviteContactsBodyKt$$ExternalSyntheticLambda5(20, function1);
                            gapComposer.updateRememberedValue(rememberedValue8);
                        }
                        z18 = false;
                        PolymorphicSerializerKt.InvestingFinancialTile(x509CertUtils2, (Function1) rememberedValue8, null, gapComposer, 0);
                        DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                        gapComposer.end(true);
                        gapComposer.end(false);
                    } else {
                        if (!x509CertUtils.equals(InvestingFinancialViewModel$Loading.INSTANCE)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 414798130, false);
                        }
                        gapComposer.startReplaceGroup(414809778);
                        gapComposer.end(false);
                    }
                    gapComposer.end(z18);
                    break;
                case 10:
                    boolean z20 = false;
                    gapComposer.startReplaceGroup(-25743464);
                    InvestingEarningsViewModel investingEarningsViewModel = investmentEntityContentModel.earningsSection;
                    if (investingEarningsViewModel instanceof InvestingEarningsViewModel.Content) {
                        gapComposer.startReplaceGroup(-25668382);
                        ColumnMeasurePolicy columnMeasurePolicy11 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                        int hashCode11 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope11 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier11 = PlatformKt.materializeModifier(gapComposer, companion);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$111 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$111);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, columnMeasurePolicy11, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope11, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode11), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier11, ComposeUiNode.Companion.SetModifier);
                        InvestingEarningsViewModel investingEarningsViewModel2 = investmentEntityContentModel.earningsSection;
                        boolean z21 = (i3 & 112) == 32;
                        Object rememberedValue9 = gapComposer.rememberedValue();
                        if (z21 || rememberedValue9 == neverEqualPolicy2) {
                            rememberedValue9 = new InviteContactsBodyKt$$ExternalSyntheticLambda5(21, function1);
                            gapComposer.updateRememberedValue(rememberedValue9);
                        }
                        z20 = false;
                        RxAwaitKt.InvestingEarningsTile(investingEarningsViewModel2, (Function1) rememberedValue9, null, gapComposer, 0);
                        DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                        gapComposer.end(true);
                        gapComposer.end(false);
                    } else {
                        if (!investingEarningsViewModel.equals(InvestingEarningsViewModel.Loading.INSTANCE)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 414811562, false);
                        }
                        gapComposer.startReplaceGroup(-25388142);
                        gapComposer.end(false);
                    }
                    gapComposer.end(z20);
                    break;
                case 11:
                    boolean z22 = false;
                    gapComposer.startReplaceGroup(-25326421);
                    X509CertChainUtils x509CertChainUtils = investmentEntityContentModel.analystOpinionsSection;
                    if (x509CertChainUtils instanceof InvestingAnalystOpinionsViewModel$Content) {
                        gapComposer.startReplaceGroup(-25238102);
                        ColumnMeasurePolicy columnMeasurePolicy12 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                        int hashCode12 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope12 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier12 = PlatformKt.materializeModifier(gapComposer, companion);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$112 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$112);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, columnMeasurePolicy12, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope12, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode12), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier12, ComposeUiNode.Companion.SetModifier);
                        X509CertChainUtils x509CertChainUtils2 = investmentEntityContentModel.analystOpinionsSection;
                        boolean z23 = (i3 & 112) == 32;
                        Object rememberedValue10 = gapComposer.rememberedValue();
                        if (z23 || rememberedValue10 == neverEqualPolicy2) {
                            rememberedValue10 = new InviteContactsBodyKt$$ExternalSyntheticLambda5(22, function1);
                            gapComposer.updateRememberedValue(rememberedValue10);
                        }
                        z22 = false;
                        a.InvestingAnalystOptions(x509CertChainUtils2, (Function1) rememberedValue10, null, gapComposer, 0);
                        DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                        gapComposer.end(true);
                        gapComposer.end(false);
                    } else {
                        if (!x509CertChainUtils.equals(InvestingAnalystOpinionsViewModel$Loading.INSTANCE)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 414825015, false);
                        }
                        gapComposer.startReplaceGroup(-24927854);
                        gapComposer.end(false);
                    }
                    gapComposer.end(z22);
                    break;
                case 12:
                    boolean z24 = false;
                    gapComposer.startReplaceGroup(-24855004);
                    InvestingDetailsCategorySectionContentModel investingDetailsCategorySectionContentModel = investmentEntityContentModel.categorySection;
                    if (investingDetailsCategorySectionContentModel == null) {
                        gapComposer.startReplaceGroup(-24855005);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-24855004);
                        ColumnMeasurePolicy columnMeasurePolicy13 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                        int hashCode13 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope13 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier13 = PlatformKt.materializeModifier(gapComposer, companion);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$113 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$113);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, columnMeasurePolicy13, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope13, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode13), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier13, ComposeUiNode.Companion.SetModifier);
                        ArcadeBordersKt.InvestingFeaturedIn(realImageLoader, investingDetailsCategorySectionContentModel, function1, gapComposer, ((i3 >> 9) & 14) | ((i3 << 3) & 896));
                        z24 = false;
                        DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                        gapComposer.end(true);
                        gapComposer.end(false);
                    }
                    gapComposer.end(z24);
                    break;
                case 13:
                    gapComposer.startReplaceGroup(-24650032);
                    if (investingScreens instanceof InvestingScreens.StockDetails) {
                        gapComposer.startReplaceGroup(-24595441);
                        ColumnMeasurePolicy columnMeasurePolicy14 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                        int hashCode14 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope14 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier14 = PlatformKt.materializeModifier(gapComposer, companion);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$114 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$114);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, columnMeasurePolicy14, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope14, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode14), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier14, ComposeUiNode.Companion.SetModifier);
                        String str = investmentEntityContentModel.disclosureText;
                        boolean z25 = (i3 & 112) == 32;
                        Object rememberedValue11 = gapComposer.rememberedValue();
                        if (z25 || rememberedValue11 == neverEqualPolicy2) {
                            rememberedValue11 = new InviteContactsBodyKt$$ExternalSyntheticLambda5(24, function1);
                            gapComposer.updateRememberedValue(rememberedValue11);
                        }
                        z2 = false;
                        ArcadeBordersKt.InvestingDisclosures(str, (Function1) rememberedValue11, gapComposer, 0);
                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                        gapComposer.end(true);
                        gapComposer.end(false);
                    } else {
                        z2 = false;
                        gapComposer.startReplaceGroup(-24375372);
                        gapComposer.end(false);
                    }
                    gapComposer.end(z2);
                    break;
                default:
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 414683158, false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CashMapViewKt$$ExternalSyntheticLambda15(investmentEntityContentModel, function1, component, realImageLoader, investingScreens, i, 6));
        }
    }

    /* renamed from: InvestmentEntityCollapsingHeader-uDo3WH8, reason: not valid java name */
    public static final void m4316InvestmentEntityCollapsingHeaderuDo3WH8(InvestmentEntityContentModel investmentEntityContentModel, RealImageLoader realImageLoader, long j, Function1 function1, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1051171585);
        int i2 = i | (gapComposer.changed(investmentEntityContentModel) ? 32 : 16) | (gapComposer.changedInstance(realImageLoader) ? 256 : 128) | (gapComposer.changed(j) ? 2048 : 1024) | (gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            InvestingStockDetailsHeaderViewModel investingStockDetailsHeaderViewModel = investmentEntityContentModel.headerViewModel;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(2056769043, new HypeWelcomeUIKt$$ExternalSyntheticLambda0(9, investingStockDetailsHeaderViewModel, realImageLoader), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(2134890132, new InvestmentEntityViewKt$$ExternalSyntheticLambda19(investingStockDetailsHeaderViewModel, r10, r10), gapComposer);
            r10 = (57344 & i2) == 16384 ? (byte) 1 : (byte) 0;
            Object rememberedValue = gapComposer.rememberedValue();
            if (r10 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InviteErrorDialogKt$$ExternalSyntheticLambda0(16, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CollapsingToolbarKt.m3476CollapsingHeaderScaffoldMooncake8r3B23s(rememberComposableLambda, rememberComposableLambda2, j, null, null, (Function0) rememberedValue, Expect_jvmKt.rememberComposableLambda(-834541900, new OverlayKt$$ExternalSyntheticLambda0(composableLambdaImpl, 14), gapComposer), gapComposer, 12583350 | (i2 & 7168));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DateFilterChipKt$$ExternalSyntheticLambda0(investmentEntityContentModel, realImageLoader, j, function1, composableLambdaImpl, i);
        }
    }

    public static final void InvestmentEntityContent(InvestmentEntityContentModel investmentEntityContentModel, Function1 function1, RealImageLoader realImageLoader, InvestingMetricView$Factory$Impl investingMetricView$Factory$Impl, InvestingScreens investingScreens, Composer composer, int i) {
        int i2;
        RealImageLoader realImageLoader2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(488617074);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(investmentEntityContentModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            realImageLoader2 = realImageLoader;
            i2 |= gapComposer.changedInstance(realImageLoader2) ? 256 : 128;
        } else {
            realImageLoader2 = realImageLoader;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(investingScreens) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 8339) != 8338)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InviteErrorDialogKt$$ExternalSyntheticLambda0(14, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(618105031, new InvestmentEntityViewKt$$ExternalSyntheticLambda1(realImageLoader2, investmentEntityContentModel, function1, investingScreens, 0), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(investmentEntityContentModel, function1, realImageLoader, investingMetricView$Factory$Impl, investingScreens, i, 28);
        }
    }

    public static void d(Object obj, String str) {
        Class<?> cls = obj.getClass();
        if (str.length() <= 4000) {
            Log.d("pop_generic", cls.getName() + "|" + str);
            return;
        }
        int length = str.length() / 4000;
        int i = 0;
        while (i <= length) {
            int i2 = i + 1;
            int i3 = i2 * 4000;
            if (i3 >= str.length()) {
                Log.d("pop_generic", cls.getName() + "|" + str.substring(i * 4000));
            } else {
                Log.d("pop_generic", cls.getName() + "|" + str.substring(i * 4000, i3));
            }
            i = i2;
        }
    }
}

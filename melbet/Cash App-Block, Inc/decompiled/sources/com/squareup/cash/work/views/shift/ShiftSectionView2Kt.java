package com.squareup.cash.work.views.shift;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.compose.ViewfinderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState$$ExternalSyntheticLambda3;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.internal.ProgressBarKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.SegmentedControlKt$$ExternalSyntheticLambda8;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda41;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.work.viewmodels.ClockInButtonState;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.cash.work.viewmodels.ShiftCardModel;
import com.squareup.cash.work.viewmodels.ShiftSection2ViewEvent$ClockInClicked;
import com.squareup.cash.work.viewmodels.ShiftSection2ViewModel;
import com.squareup.cash.work.views.SellerCardKt;
import com.squareup.cash.work.views.SellerCardShape;
import com.squareup.cash.work.views.SellerCardSize;
import com.squareup.cash.work.views.pay.PayHomeViewKt$$ExternalSyntheticLambda19;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda1;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import radiography.Radiography$$ExternalSyntheticLambda1;

/* loaded from: classes7.dex */
public abstract class ShiftSectionView2Kt {
    static {
        new SellerCardViewModel("JB", "#0000FF", "#0000FF", 480);
    }

    public static final void EmptyShiftSection2(ShiftSection2ViewModel.Empty empty, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-127287061);
        int i2 = i | (gapComposer.changedInstance(empty) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
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
            String stringResource = Room.stringResource(gapComposer, R.string.work_views_shift_section_empty_header);
            TextStyle textStyle = Strings.getTypography(gapComposer).sectionTitle;
            long j = Strings.getColors(gapComposer).semantic.text.standard;
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 8.0f, gapComposer);
            ViewfinderKt.HeroHeader(Room.stringResource(gapComposer, R.string.work_views_shift_section_no_shifts), (Modifier) null, (String) null, (TextStyle) null, gapComposer, 0, 14);
            NoShiftsHeroToFindShiftsSpacer(gapComposer, 0);
            ButtonProminence buttonProminence = ButtonProminence.STANDARD;
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new AlertBannerKt$$ExternalSyntheticLambda0(28);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, m300paddingVpY3zN4$default, buttonProminence, false, false, null, ShiftListViewKt.f786lambda$563747728, gapComposer, 1573254, 56);
            if (empty.showClockInUnscheduledButton) {
                gapComposer.startReplaceGroup(2143477261);
                Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 16.0f, gapComposer);
                ButtonProminence buttonProminence2 = ButtonProminence.SUBTLE;
                HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(Alignment.Companion.CenterHorizontally);
                boolean z = (i3 & 112) == 32;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ShiftListViewKt$$ExternalSyntheticLambda4(5, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, horizontalAlignElement, buttonProminence2, false, false, null, ShiftListViewKt.f788lambda$625849483, gapComposer, 1573248, 56);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(2144061549);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new KotterKnifeKt$$ExternalSyntheticLambda1(empty, function1, i, 13);
        }
    }

    public static final void LoadedShiftSection2(ShiftSection2ViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1237014311);
        int i2 = i | (gapComposer.changedInstance(loaded) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            boolean changedInstance = gapComposer.changedInstance(loaded);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new HCaptcha$$ExternalSyntheticLambda0(loaded, 4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DefaultPagerState rememberPagerState = PagerStateKt.rememberPagerState(0, (Function0) rememberedValue, gapComposer, 0, 3);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            ShiftSection2Header(loaded.shifts, rememberPagerState, gapComposer, 0);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 4.0f));
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 8.0f));
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(16.0f, RecyclerView.DECELERATION_RATE, 2);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            PagerKt.m328HorizontalPager8jOkeI(rememberPagerState, null, m295PaddingValuesYgX7TsA$default, null, 0, 16.0f, null, null, false, null, null, null, Expect_jvmKt.rememberComposableLambda(1707467280, new PoolDetailsViewKt$$ExternalSyntheticLambda41(14, loaded, function1), gapComposer), gapComposer, 0, 24576, 16346);
            gapComposer = gapComposer;
            if (loaded.showClockInUnscheduledButton) {
                gapComposer.startReplaceGroup(-1754183517);
                Request$Priority$EnumUnboxingLocalUtility.m((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal), companion, 16.0f, gapComposer);
                ButtonProminence buttonProminence = ButtonProminence.SUBTLE;
                HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(Alignment.Companion.CenterHorizontally);
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(horizontalAlignElement, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                boolean z = (i3 & 112) == 32;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z || rememberedValue2 == neverEqualPolicy) {
                    function12 = function1;
                    rememberedValue2 = new ShiftListViewKt$$ExternalSyntheticLambda4(6, function12);
                    gapComposer.updateRememberedValue(rememberedValue2);
                } else {
                    function12 = function1;
                }
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, m300paddingVpY3zN4$default, buttonProminence, false, false, null, ShiftListViewKt.f781lambda$1140103375, gapComposer, 1573248, 56);
                gapComposer.end(false);
            } else {
                function12 = function1;
                gapComposer.startReplaceGroup(-1753524271);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new KotterKnifeKt$$ExternalSyntheticLambda1(loaded, function12, i, 14);
        }
    }

    public static final void LoadingShiftSection2(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2073313968);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            VisibleKt.ShimmerBox(null, false, null, ShiftListViewKt.lambda$572887105, gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PayHomeViewKt$$ExternalSyntheticLambda19(i, 28);
        }
    }

    public static final void MerchantHeader(SellerCardViewModel sellerCardViewModel, String str, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2115349846);
        int i2 = i | (gapComposer.changedInstance(sellerCardViewModel) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            SellerCardKt.SellerCard(sellerCardViewModel, null, SellerCardSize.Medium, SellerCardShape.Circle, gapComposer, (i2 & 14) | 3456, 2);
            SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(companion, 12.0f));
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 3) & 14, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Radiography$$ExternalSyntheticLambda1(sellerCardViewModel, str, i, 11);
        }
    }

    public static final void NoShiftsHeroToFindShiftsSpacer(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(135228934);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(Modifier.Companion.$$INSTANCE, 200.0f));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PayHomeViewKt$$ExternalSyntheticLambda19(i, 29);
        }
    }

    public static final void PagerDots(int i, int i2, int i3, Composer composer, Modifier modifier) {
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(106054755);
        int i4 = (gapComposer.changed(i) ? 4 : 2) | i3 | (gapComposer.changed(i2) ? 32 : 16);
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            boolean z = ((i4 & 14) == 4) | ((i4 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SegmentedControlKt$$ExternalSyntheticLambda8(i2, i, 6);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(modifier, false, (Function1) rememberedValue);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(6.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-1498909771);
            for (int i5 = 0; i5 < i; i5++) {
                if (i5 == i2) {
                    gapComposer.startReplaceGroup(-1337219464);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors.semantic.icon.prominent;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1337217670);
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors2.semantic.icon.extraSubtle;
                    gapComposer.end(false);
                }
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 4.0f), j, RoundedCornerShapeKt.CircleShape), gapComposer, 0);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProgressBarKt$$ExternalSyntheticLambda0(i, i2, modifier, i3, 15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ShiftCardActions(final ShiftCardModel shiftCardModel, final Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        GapComposer gapComposer;
        Modifier modifier;
        boolean z;
        int i3;
        Object obj;
        boolean z2;
        Object obj2;
        Object obj3;
        GapComposer gapComposer2;
        RowScopeInstance rowScopeInstance;
        Object obj4;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(1857852828);
        int i4 = i | (gapComposer3.changedInstance(shiftCardModel) ? 4 : 2) | (gapComposer3.changedInstance(function1) ? 32 : 16);
        final int i5 = 1;
        final int i6 = 0;
        if (gapComposer3.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            Modifier modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier2, 1.0f);
            ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            Function0 function02 = null;
            if (gapComposer3.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(function0);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ClockInButtonState clockInButtonState = shiftCardModel.clockInButtonState;
            boolean z3 = clockInButtonState instanceof ClockInButtonState.ClockedIn;
            Object obj5 = Composer.Companion.Empty;
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            if (z3) {
                gapComposer3.startReplaceGroup(1803421915);
                ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                Modifier weight = rowScopeInstance2.weight(1.0f, modifier2, true);
                boolean changedInstance = ((i4 & 112) == 32) | gapComposer3.changedInstance(shiftCardModel);
                Object rememberedValue = gapComposer3.rememberedValue();
                Object obj6 = rememberedValue;
                if (changedInstance || rememberedValue == obj5) {
                    Object obj7 = new Function0() { // from class: com.squareup.cash.work.views.shift.ShiftSectionView2Kt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i6) {
                                case 0:
                                    function1.invoke(new ShiftSection2ViewEvent$ClockInClicked(shiftCardModel.shiftId));
                                    break;
                                case 1:
                                    function1.invoke(new ShiftSection2ViewEvent$ClockInClicked(shiftCardModel.shiftId));
                                    break;
                                default:
                                    function1.invoke(new ShiftSection2ViewEvent$ClockInClicked(shiftCardModel.shiftId));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer3.updateRememberedValue(obj7);
                    obj6 = obj7;
                }
                obj = obj5;
                rowScopeInstance = rowScopeInstance2;
                modifier = modifier2;
                z = false;
                i3 = i4;
                coil3.size.SizeKt.ButtonCta((Function0) obj6, weight, buttonProminence, false, false, null, ShiftListViewKt.lambda$2076860317, gapComposer3, 1573248, 56);
                gapComposer3.end(false);
                z2 = 1;
                gapComposer2 = gapComposer3;
            } else {
                modifier = modifier2;
                z = false;
                RowScopeInstance rowScopeInstance3 = rowScopeInstance2;
                i3 = i4;
                if (clockInButtonState instanceof ClockInButtonState.OnBreak) {
                    gapComposer3.startReplaceGroup(1803805385);
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    Modifier weight2 = rowScopeInstance3.weight(1.0f, modifier, true);
                    boolean changedInstance2 = gapComposer3.changedInstance(shiftCardModel) | ((i3 & 112) == 32);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changedInstance2) {
                        obj2 = obj5;
                    } else {
                        obj2 = obj5;
                        if (rememberedValue2 != obj2) {
                            obj3 = rememberedValue2;
                            obj = obj2;
                            coil3.size.SizeKt.ButtonCta((Function0) obj3, weight2, buttonProminence2, false, false, null, ShiftListViewKt.f783lambda$1369447482, gapComposer3, 1573248, 56);
                            gapComposer3.end(false);
                            z2 = 1;
                            rowScopeInstance = rowScopeInstance3;
                            gapComposer2 = gapComposer3;
                        }
                    }
                    Object obj8 = new Function0() { // from class: com.squareup.cash.work.views.shift.ShiftSectionView2Kt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i5) {
                                case 0:
                                    function1.invoke(new ShiftSection2ViewEvent$ClockInClicked(shiftCardModel.shiftId));
                                    break;
                                case 1:
                                    function1.invoke(new ShiftSection2ViewEvent$ClockInClicked(shiftCardModel.shiftId));
                                    break;
                                default:
                                    function1.invoke(new ShiftSection2ViewEvent$ClockInClicked(shiftCardModel.shiftId));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer3.updateRememberedValue(obj8);
                    obj3 = obj8;
                    obj = obj2;
                    coil3.size.SizeKt.ButtonCta((Function0) obj3, weight2, buttonProminence2, false, false, null, ShiftListViewKt.f783lambda$1369447482, gapComposer3, 1573248, 56);
                    gapComposer3.end(false);
                    z2 = 1;
                    rowScopeInstance = rowScopeInstance3;
                    gapComposer2 = gapComposer3;
                } else if (clockInButtonState instanceof ClockInButtonState.ClockedOut) {
                    gapComposer3.startReplaceGroup(1804217468);
                    String stringResource = Room.stringResource(gapComposer3, R.string.work_shift_not_started_title);
                    Object obj9 = shiftCardModel.startDateTime;
                    Object obj10 = shiftCardModel.timeZoneId;
                    if (obj9 != null) {
                        gapComposer3.startReplaceGroup(1804461190);
                        boolean changedInstance3 = ((i3 & 112) == 32) | gapComposer3.changedInstance(obj9) | gapComposer3.changed(obj10);
                        Object rememberedValue3 = gapComposer3.rememberedValue();
                        Object obj11 = rememberedValue3;
                        if (changedInstance3 || rememberedValue3 == obj5) {
                            Object heroCardViewKt$$ExternalSyntheticLambda9 = new HeroCardViewKt$$ExternalSyntheticLambda9(14, function1, obj9, obj10);
                            gapComposer3.updateRememberedValue(heroCardViewKt$$ExternalSyntheticLambda9);
                            obj11 = heroCardViewKt$$ExternalSyntheticLambda9;
                        }
                        function02 = (Function0) obj11;
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(1804709437);
                        gapComposer3.end(false);
                    }
                    Function0 function03 = function02;
                    boolean z4 = ((ClockInButtonState.ClockedOut) clockInButtonState).isClockInEnabled;
                    Modifier weight3 = rowScopeInstance3.weight(1.0f, modifier, true);
                    boolean changedInstance4 = ((i3 & 112) == 32) | gapComposer3.changedInstance(shiftCardModel);
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    Object obj12 = rememberedValue4;
                    if (changedInstance4 || rememberedValue4 == obj5) {
                        final int i7 = 2;
                        Object obj13 = new Function0() { // from class: com.squareup.cash.work.views.shift.ShiftSectionView2Kt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i7) {
                                    case 0:
                                        function1.invoke(new ShiftSection2ViewEvent$ClockInClicked(shiftCardModel.shiftId));
                                        break;
                                    case 1:
                                        function1.invoke(new ShiftSection2ViewEvent$ClockInClicked(shiftCardModel.shiftId));
                                        break;
                                    default:
                                        function1.invoke(new ShiftSection2ViewEvent$ClockInClicked(shiftCardModel.shiftId));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer3.updateRememberedValue(obj13);
                        obj12 = obj13;
                    }
                    obj = obj5;
                    z2 = 1;
                    SellerCardKt.DisabledClickableButtonCta(z4, R.string.work_views_clock_in_button, (Function0) obj12, weight3, null, false, function03, stringResource, gapComposer3, 0, 48);
                    GapComposer gapComposer4 = gapComposer3;
                    gapComposer4.end(false);
                    rowScopeInstance = rowScopeInstance3;
                    gapComposer2 = gapComposer4;
                } else {
                    obj = obj5;
                    z2 = 1;
                    if (!Intrinsics.areEqual(clockInButtonState, ClockInButtonState.Hidden.INSTANCE)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -1465847540, false);
                    }
                    gapComposer3.startReplaceGroup(-1465789948);
                    gapComposer3.end(false);
                    rowScopeInstance = rowScopeInstance3;
                    gapComposer2 = gapComposer3;
                }
            }
            String str = shiftCardModel.shiftId;
            if (!shiftCardModel.showDetailsButton || str == null) {
                function12 = function1;
                gapComposer2.startReplaceGroup(1805531682);
                gapComposer2.end(z);
            } else {
                gapComposer2.startReplaceGroup(1805262416);
                ButtonProminence buttonProminence3 = ButtonProminence.STANDARD;
                Modifier weight4 = rowScopeInstance.weight(1.0f, modifier, z2);
                boolean changed = gapComposer2.changed(str) | ((i3 & 112) == 32 ? z2 ? 1 : 0 : z);
                Object rememberedValue5 = gapComposer2.rememberedValue();
                if (changed || rememberedValue5 == obj) {
                    function12 = function1;
                    Object p2PListViewKt$$ExternalSyntheticLambda13 = new P2PListViewKt$$ExternalSyntheticLambda13(function12, str, 29);
                    gapComposer2.updateRememberedValue(p2PListViewKt$$ExternalSyntheticLambda13);
                    obj4 = p2PListViewKt$$ExternalSyntheticLambda13;
                } else {
                    function12 = function1;
                    obj4 = rememberedValue5;
                }
                coil3.size.SizeKt.ButtonCta((Function0) obj4, weight4, buttonProminence3, false, false, null, ShiftListViewKt.lambda$742374720, gapComposer2, 1573248, 56);
                gapComposer2.end(z);
            }
            gapComposer2.end(z2);
            gapComposer = gapComposer2;
            i2 = z2;
        } else {
            i2 = 1;
            function12 = function1;
            gapComposer3.skipToGroupEnd();
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftSectionView2Kt$$ExternalSyntheticLambda10(shiftCardModel, function12, i, i2);
        }
    }

    public static final void ShiftSection2Card(ShiftCardModel shiftCardModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1816767460);
        int i2 = i | (gapComposer.changedInstance(shiftCardModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 450.0f, RecyclerView.DECELERATION_RATE, 2);
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(ClipKt.clip(m279heightInVpY3zN4$default, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), Strings.getColors(gapComposer).semantic.background.subtle, ColorKt.RectangleShape), 24.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            MerchantHeader(shiftCardModel.sellerCardViewModel, shiftCardModel.merchantName, gapComposer, 0);
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).headlineLarge, (TextLineBalancing) null, shiftCardModel.shiftTimeText, (Map) null, (Function1) null, false);
            String str = shiftCardModel.locationAndJobText;
            if (str != null) {
                gapComposer.startReplaceGroup(-236748403);
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 8.0f));
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-236526412);
                gapComposer.end(false);
            }
            Strings.getSizes(gapComposer).getClass();
            Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion, 32.0f, gapComposer);
            ShiftCardActions(shiftCardModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftSectionView2Kt$$ExternalSyntheticLambda10(shiftCardModel, function1, i, 0);
        }
    }

    public static final void ShiftSection2Header(final List list, PagerState pagerState, Composer composer, final int i) {
        final int i2;
        Modifier.Companion companion;
        int i3;
        boolean z;
        final float f;
        Object obj;
        boolean z2;
        final float f2;
        NeverEqualPolicy neverEqualPolicy;
        HeaderGroupingState headerGroupingState;
        final PagerState pagerState2 = pagerState;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1533153003);
        Applier applier = gapComposer.applier;
        int i4 = (gapComposer.changedInstance(list) ? 4 : 2) | i | (gapComposer.changed(pagerState2) ? 32 : 16);
        final int i5 = 0;
        if (!gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            i2 = 1;
            gapComposer.skipToGroupEnd();
        } else {
            if (list.isEmpty()) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new Function2(list, pagerState2, i, i5) { // from class: com.squareup.cash.work.views.shift.ShiftSectionView2Kt$$ExternalSyntheticLambda11
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ List f$0;
                        public final /* synthetic */ PagerState f$1;

                        {
                            this.$r8$classId = i5;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i6 = this.$r8$classId;
                            Composer composer2 = (Composer) obj2;
                            ((Integer) obj3).getClass();
                            switch (i6) {
                                case 0:
                                    ShiftSectionView2Kt.ShiftSection2Header(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    ShiftSectionView2Kt.ShiftSection2Header(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            int intValue = ((ParcelableSnapshotMutableIntState) pagerState2.scrollPosition.elementTypes).getIntValue();
            boolean changed = gapComposer.changed(list);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy2) {
                if (list.isEmpty()) {
                    rememberedValue = new HeaderGroupingState(EmptyList.INSTANCE, new int[0]);
                } else {
                    ArrayList arrayList = new ArrayList();
                    int[] iArr = new int[list.size()];
                    int size = list.size();
                    int i6 = -1;
                    for (int i7 = 0; i7 < size; i7++) {
                        if (i7 == 0 || !Intrinsics.areEqual(((ShiftCardModel) list.get(i7)).dateText, ((ShiftCardModel) list.get(i7 - 1)).dateText)) {
                            arrayList.add(((ShiftCardModel) list.get(i7)).dateText);
                            i6++;
                        }
                        iArr[i7] = i6;
                    }
                    rememberedValue = new HeaderGroupingState(arrayList, iArr);
                }
                gapComposer.updateRememberedValue(rememberedValue);
            }
            final HeaderGroupingState headerGroupingState2 = (HeaderGroupingState) rememberedValue;
            int[] iArr2 = headerGroupingState2.headerIndices;
            int i8 = iArr2[RangesKt___RangesKt.coerceIn(intValue, 0, iArr2.length - 1)];
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            float mo236toPx0680j_4 = density.mo236toPx0680j_4(16.0f);
            float mo236toPx0680j_42 = density.mo236toPx0680j_4(40.0f) + mo236toPx0680j_4;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier.Companion companion3 = companion2;
            int i9 = intValue;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion2, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier clipToBounds = ClipKt.clipToBounds(new LayoutWeightElement(1.0f, true));
            boolean changedInstance = gapComposer.changedInstance(headerGroupingState2) | gapComposer.changed(i8);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = new LazyListState$$ExternalSyntheticLambda3(headerGroupingState2, i8, 14);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(clipToBounds, (Function1) rememberedValue2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            float f3 = mo236toPx0680j_42;
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, clearAndSetSemantics);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            gapComposer.startReplaceGroup(-1317576878);
            final int i10 = i8 - 1;
            boolean z3 = true;
            int i11 = i8 + 1;
            if (i10 <= i11) {
                while (true) {
                    gapComposer.startReplaceGroup(2104867585);
                    String str = (String) CollectionsKt.getOrNull(i10, headerGroupingState2.headerTexts);
                    if (str == null) {
                        gapComposer.end(false);
                        pagerState2 = pagerState;
                        headerGroupingState = headerGroupingState2;
                        f2 = mo236toPx0680j_4;
                        companion = companion3;
                        neverEqualPolicy = neverEqualPolicy2;
                        z = false;
                        f = f3;
                        i3 = i9;
                    } else {
                        TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        long j = colors.semantic.text.standard;
                        Object rememberedValue3 = gapComposer.rememberedValue();
                        if (rememberedValue3 == neverEqualPolicy2) {
                            rememberedValue3 = new StripePaymentController$$ExternalSyntheticLambda1(22);
                            gapComposer.updateRememberedValue(rememberedValue3);
                        }
                        Modifier clearAndSetSemantics2 = SemanticsModifierKt.clearAndSetSemantics(companion3, (Function1) rememberedValue3);
                        f = f3;
                        boolean changedInstance2 = gapComposer.changedInstance(headerGroupingState2) | ((i4 & 112) == 32 ? z3 : false) | gapComposer.changed(i10) | gapComposer.changed(mo236toPx0680j_4) | gapComposer.changed(f);
                        Object rememberedValue4 = gapComposer.rememberedValue();
                        if (changedInstance2 || rememberedValue4 == neverEqualPolicy2) {
                            float f4 = mo236toPx0680j_4;
                            z2 = 32;
                            f2 = f4;
                            pagerState2 = pagerState;
                            obj = new Function1() { // from class: com.squareup.cash.work.views.shift.ShiftSectionView2Kt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    float abs;
                                    ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj2;
                                    reusableGraphicsLayerScope.getClass();
                                    PagerState pagerState3 = pagerState2;
                                    int intValue2 = ((ParcelableSnapshotMutableIntState) pagerState3.scrollPosition.elementTypes).getIntValue();
                                    float floatValue = ((ParcelableSnapshotMutableFloatState) pagerState3.scrollPosition.fieldSortOrder).getFloatValue();
                                    int[] iArr3 = HeaderGroupingState.this.headerIndices;
                                    if (iArr3.length == 0) {
                                        abs = 0.0f;
                                    } else {
                                        int coerceIn = RangesKt___RangesKt.coerceIn(intValue2, 0, iArr3.length - 1);
                                        int coerceIn2 = RangesKt___RangesKt.coerceIn(((int) Math.signum(floatValue)) + coerceIn, 0, iArr3.length - 1);
                                        int i12 = iArr3[coerceIn];
                                        int i13 = iArr3[coerceIn2];
                                        abs = (Math.abs(floatValue) * (i13 - i12)) + i12;
                                    }
                                    float f5 = i10 - abs;
                                    reusableGraphicsLayerScope.setAlpha(RangesKt___RangesKt.coerceIn(1.0f - (Math.abs(f5) * 1.5f), RecyclerView.DECELERATION_RATE, 1.0f));
                                    reusableGraphicsLayerScope.setTranslationX((f5 * f) + f2);
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer.updateRememberedValue(obj);
                        } else {
                            float f5 = mo236toPx0680j_4;
                            z2 = 32;
                            f2 = f5;
                            obj = rememberedValue4;
                            pagerState2 = pagerState;
                        }
                        Modifier graphicsLayer = ColorKt.graphicsLayer(clearAndSetSemantics2, (Function1) obj);
                        GapComposer gapComposer2 = gapComposer;
                        neverEqualPolicy = neverEqualPolicy2;
                        headerGroupingState = headerGroupingState2;
                        i3 = i9;
                        z = false;
                        companion = companion3;
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer2, graphicsLayer, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                        gapComposer = gapComposer2;
                        gapComposer.end(false);
                    }
                    if (i10 == i11) {
                        break;
                    }
                    i10++;
                    headerGroupingState2 = headerGroupingState;
                    i9 = i3;
                    mo236toPx0680j_4 = f2;
                    f3 = f;
                    companion3 = companion;
                    neverEqualPolicy2 = neverEqualPolicy;
                    z3 = true;
                }
            } else {
                pagerState2 = pagerState;
                companion = companion3;
                i3 = i9;
                z = false;
            }
            gapComposer.end(z);
            i2 = 1;
            gapComposer.end(true);
            if (list.size() > 1) {
                gapComposer.startReplaceGroup(-1329983135);
                PagerDots(list.size(), i3, MLKEMEngine.KyberPolyBytes, gapComposer, OffsetKt.m273offsetVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 8.0f, 1));
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(-1329842829);
                gapComposer.end(z);
            }
            gapComposer.end(true);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new Function2(list, pagerState2, i, i2) { // from class: com.squareup.cash.work.views.shift.ShiftSectionView2Kt$$ExternalSyntheticLambda11
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ List f$0;
                public final /* synthetic */ PagerState f$1;

                {
                    this.$r8$classId = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i62 = this.$r8$classId;
                    Composer composer2 = (Composer) obj2;
                    ((Integer) obj3).getClass();
                    switch (i62) {
                        case 0:
                            ShiftSectionView2Kt.ShiftSection2Header(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            ShiftSectionView2Kt.ShiftSection2Header(this.f$0, this.f$1, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void ShiftSectionView2(ShiftSection2ViewModel shiftSection2ViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1458108681);
        int i2 = (gapComposer.changedInstance(shiftSection2ViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (shiftSection2ViewModel.equals(ShiftSection2ViewModel.Loading.INSTANCE)) {
            gapComposer.startReplaceGroup(-1083099027);
            LoadingShiftSection2(gapComposer, 0);
            gapComposer.end(false);
        } else if (shiftSection2ViewModel.equals(ShiftSection2ViewModel.Error.INSTANCE)) {
            gapComposer.startReplaceGroup(-1083097157);
            gapComposer.end(false);
        } else if (shiftSection2ViewModel instanceof ShiftSection2ViewModel.Empty) {
            gapComposer.startReplaceGroup(-1083095719);
            EmptyShiftSection2((ShiftSection2ViewModel.Empty) shiftSection2ViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(false);
        } else {
            if (!(shiftSection2ViewModel instanceof ShiftSection2ViewModel.Loaded)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1083100475, false);
            }
            gapComposer.startReplaceGroup(-1083093318);
            LoadedShiftSection2((ShiftSection2ViewModel.Loaded) shiftSection2ViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new KotterKnifeKt$$ExternalSyntheticLambda1(shiftSection2ViewModel, function1, i, 12);
        }
    }
}

package com.squareup.cash.tax.views;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.unit.DpSize;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.c7$$ExternalSyntheticLambda6;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.music.views.TrackRowKt$$ExternalSyntheticLambda0;
import com.squareup.cash.taptopay.views.TapToPayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.primitives.TaxTooltipModel;
import com.squareup.cash.tax.viewmodels.TaxReturnsViewModel;
import com.squareup.cash.tax.viewmodels.TaxTooltipViewModel;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class TaxReturnsViewKt {

    /* renamed from: lambda$-898286036, reason: not valid java name */
    public static final ComposableLambdaImpl f729lambda$898286036 = new ComposableLambdaImpl(new TapToPayKt$$ExternalSyntheticLambda0(16), false, -898286036);

    /* renamed from: DesktopToolTip-mKWK414, reason: not valid java name */
    public static final void m3768DesktopToolTipmKWK414(TaxTooltipViewModel taxTooltipViewModel, long j, long j2, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1825272060);
        int i2 = i | (gapComposer.changedInstance(taxTooltipViewModel) ? 32 : 16) | (gapComposer.changed(j2) ? 2048 : 1024) | (gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9361) != 9360)) {
            TooltipOverLay(RecyclerView.DECELERATION_RATE, gapComposer, 0);
            int i3 = i2 >> 6;
            m3769TooltipArrowWFtPT2k(j, j2, MooncakeTheme.getColors(gapComposer).tooltipBackground, gapComposer, i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopCenter, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            boolean z = (i2 & 7168) == 2048;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                StorageLinkQueries$$ExternalSyntheticLambda5 storageLinkQueries$$ExternalSyntheticLambda5 = new StorageLinkQueries$$ExternalSyntheticLambda5(1, j2, j);
                gapComposer.updateRememberedValue(storageLinkQueries$$ExternalSyntheticLambda5);
                rememberedValue = storageLinkQueries$$ExternalSyntheticLambda5;
            }
            TaxDesktopToolTipContent(SizeKt.m279heightInVpY3zN4$default(SizeKt.m292widthInVpY3zN4$default(SpacerKt.m302paddingqDBjuR0$default(OffsetKt.offset(companion, (Function1) rememberedValue), 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 10), RecyclerView.DECELERATION_RATE, 360.0f, 1), RecyclerView.DECELERATION_RATE, 240.0f, 1), taxTooltipViewModel.taxTooltip, function1, gapComposer, i3 & 896);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxToolTipViewKt$$ExternalSyntheticLambda1(taxTooltipViewModel, j, j2, function1, i, 0);
        }
    }

    public static final void TaxAuthorizationContent(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1446656855);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, f729lambda$898286036, gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayKt$$ExternalSyntheticLambda0(i, 17);
        }
    }

    public static final void TaxDesktopToolTipContent(Modifier modifier, TaxTooltipModel taxTooltipModel, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1575712162);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(taxTooltipModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            KeypadKt.m3641CardIkByU14(modifier, null, MooncakeTheme.getColors(gapComposer).tooltipBackground, false, null, null, null, Expect_jvmKt.rememberComposableLambda(1854892954, new TaxToolTipViewKt$$ExternalSyntheticLambda3(taxTooltipModel, ColorKt.Color(-1), function1, 0), gapComposer), gapComposer, (i2 & 14) | 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(i, 15, modifier, taxTooltipModel, function1);
        }
    }

    public static final void TaxReturns(TaxReturnsViewModel taxReturnsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1804490802);
        int i2 = (gapComposer.changedInstance(taxReturnsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(95077081, new TaxReturnsViewKt$$ExternalSyntheticLambda0(taxReturnsViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxReturnsView$$ExternalSyntheticLambda1(taxReturnsViewModel, function1, modifier, i);
        }
    }

    /* renamed from: TooltipArrow-WFtPT2k, reason: not valid java name */
    public static final void m3769TooltipArrowWFtPT2k(final long j, final long j2, final long j3, Composer composer, final int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-555549136);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(j2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(j3) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new c7$$ExternalSyntheticLambda6(j2, 21);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier aspectRatio = OffsetKt.aspectRatio(1.0f, SizeKt.m287sizeVpY3zN4(OffsetKt.offset(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue), DpSize.m1044getWidthD9Ej5fM(j), DpSize.m1043getHeightD9Ej5fM(j)), false);
            boolean z2 = (i2 & 896) == 256;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new c7$$ExternalSyntheticLambda6(j3, 22);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CanvasKt.Canvas(0, gapComposer, aspectRatio, (Function1) rememberedValue2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.tax.views.TaxToolTipViewKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    TaxReturnsViewKt.m3769TooltipArrowWFtPT2k(j, j2, j3, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void TooltipOverLay(float f, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(570960049);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            long j = Color.Transparent;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            BoxKt.Box(SizeKt.m277height3ABfNKs(SpacerKt.statusBarsPadding(SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f)), 56.0f), gapComposer, 0);
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), Color.m675copywmQWz5c$default(0.45f, Color.Black, 14), rectangleShapeKt$RectangleShape$1), gapComposer, 0);
            gapComposer.end(true);
            f = 0.45f;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TrackRowKt$$ExternalSyntheticLambda0(f, i, 10);
        }
    }
}

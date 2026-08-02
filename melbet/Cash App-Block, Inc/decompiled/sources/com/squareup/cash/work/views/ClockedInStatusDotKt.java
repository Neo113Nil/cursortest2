package com.squareup.cash.work.views;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.ArcSplineKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.CheckboxKt$$ExternalSyntheticLambda6;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda4;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class ClockedInStatusDotKt {
    public static final long ClockedOutStatusDotColor = ColorKt.Color(4294916912L);

    public static final void ClockedInStatusDot(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1164325886);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.icon.brand;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            m3802PulsingStatusDotKTwxG1Y(432, j, gapComposer, companion, "clocked-in-pulse");
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier, i, 23);
        }
    }

    public static final void ClockedOutStatusDot(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(89924179);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(companion, 6.0f), ClockedOutStatusDotColor, RoundedCornerShapeKt.CircleShape), gapComposer, 0);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier, i, 24);
        }
    }

    public static final void OnBreakStatusDot(int i, int i2, Composer composer, Modifier modifier, boolean z) {
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-317249356);
        int i3 = i | 6;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 54;
        } else if ((i & 48) == 0) {
            i3 |= gapComposer.changed(z) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                z = false;
            }
            if (z) {
                gapComposer.startReplaceGroup(66051835);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.icon.inverse;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(66053436);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.icon.standard;
                gapComposer.end(false);
            }
            long j2 = j;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            m3802PulsingStatusDotKTwxG1Y(432, j2, gapComposer, companion, "on-break-pulse");
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ClockedInStatusDotKt$$ExternalSyntheticLambda0(modifier, z, i, i2);
        }
    }

    /* renamed from: PulsingStatusDot-KTwxG1Y, reason: not valid java name */
    public static final void m3802PulsingStatusDotKTwxG1Y(int i, long j, Composer composer, Modifier modifier, String str) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2062446982);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            InfiniteTransition rememberInfiniteTransition = ArcSplineKt.rememberInfiniteTransition(str, gapComposer, 0);
            CubicBezierEasing cubicBezierEasing = EasingFunctionsKt.EaseOut;
            TweenSpec tween$default = AnimatableKt.tween$default(1200, 0, cubicBezierEasing, 2);
            RepeatMode repeatMode = RepeatMode.Restart;
            InfiniteTransition.TransitionAnimationState animateFloat = ArcSplineKt.animateFloat(rememberInfiniteTransition, 1.0f, 2.0f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(tween$default, repeatMode, 4), "pulse-scale", gapComposer, 29112, 0);
            InfiniteTransition.TransitionAnimationState animateFloat2 = ArcSplineKt.animateFloat(rememberInfiniteTransition, 0.75f, RecyclerView.DECELERATION_RATE, AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.tween$default(1200, 0, cubicBezierEasing, 2), repeatMode, 4), "pulse-alpha", gapComposer, 29112, 0);
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(modifier, 12.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m285size3ABfNKs);
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion, 6.0f);
            boolean changed = gapComposer.changed(animateFloat) | gapComposer.changed(animateFloat2);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CheckboxKt$$ExternalSyntheticLambda6(animateFloat, animateFloat2, 5);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier graphicsLayer = ColorKt.graphicsLayer(m285size3ABfNKs2, (Function1) rememberedValue);
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(graphicsLayer, j, roundedCornerShape), gapComposer, 0);
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(companion, 12.0f), Color.m675copywmQWz5c$default(0.3f, j, 14), roundedCornerShape), gapComposer, 0);
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(companion, 6.0f), j, roundedCornerShape), gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ClockedInStatusDotKt$$ExternalSyntheticLambda3(j, str, modifier, i);
        }
    }
}

package com.squareup.cash.taptopay.views.components;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.squareup.cash.R;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda28;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public abstract class TapToPayPaymentAnimationKt {
    public static final void TapToPayPaymentAnimation(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(983078481);
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            RawAnimationRes rawAnimationRes = ImageKt.isSystemInDarkTheme(gapComposer) ? new RawAnimationRes(R.raw.ttp_dark_top_and_bottom_v01, R.raw.ttp_dark_sides_v01) : new RawAnimationRes(R.raw.ttp_light_top_and_bottom_v01, R.raw.ttp_light_sides_v01);
            LottieCompositionResult rememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m1524boximpl(LottieCompositionSpec.RawRes.m1525constructorimpl(rawAnimationRes.topAndBottom)), null, null, null, null, null, gapComposer, 0, 62);
            LottieCompositionResult rememberLottieComposition2 = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m1524boximpl(LottieCompositionSpec.RawRes.m1525constructorimpl(rawAnimationRes.side)), null, null, null, null, null, gapComposer, 0, 62);
            BiasAlignment biasAlignment = Alignment.Companion.TopStart;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            LottieComposition lottieComposition = (LottieComposition) rememberLottieComposition.getValue();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1 = ContentScale.Companion.FillBounds;
            LottieAnimationKt.LottieAnimation(lottieComposition, fillMaxSize, false, false, null, RecyclerView.DECELERATION_RATE, Integer.MAX_VALUE, false, false, false, false, null, false, false, null, null, contentScale$Companion$Fit$1, false, false, null, false, null, gapComposer, 1572912, 1572864, 0, 4128700);
            LottieComposition lottieComposition2 = (LottieComposition) rememberLottieComposition2.getValue();
            Modifier fillMaxHeight = SizeKt.fillMaxHeight(companion, 1.0f);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            LottieAnimationKt.LottieAnimation(lottieComposition2, boxScopeInstance.align(fillMaxHeight, biasAlignment), false, false, null, RecyclerView.DECELERATION_RATE, Integer.MAX_VALUE, false, false, false, false, null, false, false, null, null, contentScale$Companion$Fit$1, false, false, null, false, null, gapComposer, 1572864, 1572864, 0, 4128700);
            LottieComposition lottieComposition3 = (LottieComposition) rememberLottieComposition2.getValue();
            Modifier fillMaxHeight2 = SizeKt.fillMaxHeight(companion, 1.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda28(27);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LottieAnimationKt.LottieAnimation(lottieComposition3, boxScopeInstance.align(ColorKt.graphicsLayer(fillMaxHeight2, (Function1) rememberedValue), Alignment.Companion.TopEnd), false, false, null, RecyclerView.DECELERATION_RATE, Integer.MAX_VALUE, false, false, false, false, null, false, false, null, null, contentScale$Companion$Fit$1, false, false, null, false, null, gapComposer, 1572864, 1572864, 0, 4128700);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier, i, 22);
        }
    }
}

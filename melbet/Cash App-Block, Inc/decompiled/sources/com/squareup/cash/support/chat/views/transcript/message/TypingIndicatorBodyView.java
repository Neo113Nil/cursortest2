package com.squareup.cash.support.chat.views.transcript.message;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$TypingIndicatorBodyViewModel;

/* loaded from: classes7.dex */
public final class TypingIndicatorBodyView extends AbstractComposeView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ParcelableSnapshotMutableState viewModel$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypingIndicatorBodyView(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.viewModel$delegate = Updater.mutableStateOf$default(new BodyViewModel$TypingIndicatorBodyViewModel(false));
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(786738281);
        int i2 = (gapComposer.changed(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(505266100, new TypingIndicatorBodyView$$ExternalSyntheticLambda0(this), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TypingIndicatorBodyView$$ExternalSyntheticLambda0(this, i, 1);
        }
    }

    public final void LottieTypingIndicator(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1404384553);
        int i2 = i & 1;
        if (gapComposer.shouldExecute(i2, i2 != 0)) {
            LottieCompositionResult rememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m1524boximpl(LottieCompositionSpec.RawRes.m1525constructorimpl(ImageKt.isSystemInDarkTheme(gapComposer) ? R.raw.typing_indicator_dark : R.raw.typing_indicator_light)), null, null, null, null, null, gapComposer, 0, 62);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(companion, 72.0f, 44.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m178borderxT4_qwU(m287sizeVpY3zN4, 1.0f, colors.semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), 16.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            LottieAnimationKt.LottieAnimation((LottieComposition) rememberLottieComposition.getValue(), SizeKt.fillMaxSize(companion, 1.0f), false, false, null, RecyclerView.DECELERATION_RATE, Integer.MAX_VALUE, false, false, false, false, null, false, false, null, null, null, false, false, null, false, null, gapComposer, 1572912, 0, 0, 4194236);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TypingIndicatorBodyView$$ExternalSyntheticLambda0(this, i, 2);
        }
    }
}

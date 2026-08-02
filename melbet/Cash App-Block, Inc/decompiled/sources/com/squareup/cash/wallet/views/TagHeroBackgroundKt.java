package com.squareup.cash.wallet.views;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;

/* loaded from: classes6.dex */
public abstract class TagHeroBackgroundKt {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long TAG_BACKGROUND_TRANSFORM_ORIGIN = ColorKt.TransformOrigin(0.5f, RecyclerView.DECELERATION_RATE);

    public static final void TagHeroBackground(Image image, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        String m;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1369040769);
        int i2 = (gapComposer.changedInstance(image) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            if (image == null) {
                gapComposer.startReplaceGroup(84205075);
                gapComposer.end(false);
                m = null;
            } else {
                m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer, 1388189614, image, gapComposer, false);
            }
            modifier2 = modifier;
            CrossfadeKt.Crossfade(m, modifier2, (FiniteAnimationSpec) null, (String) null, UtilsKt.f745lambda$1460260093, gapComposer, (i2 & 112) | 24576, 12);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TagHeroBackgroundKt$$ExternalSyntheticLambda1(i, 0, modifier2, image);
        }
    }
}

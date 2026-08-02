package com.valentinilk.shimmer;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import com.valentinilk.shimmer.ShimmerBounds;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public abstract class ShimmerKt {
    public static final Shimmer rememberShimmer(ShimmerBounds shimmerBounds, ShimmerTheme shimmerTheme, Composer composer, int i) {
        if ((i & 2) != 0) {
            shimmerTheme = (ShimmerTheme) ((GapComposer) composer).consume(ShimmerThemeKt.LocalShimmerTheme);
        }
        shimmerTheme.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        float mo236toPx0680j_4 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(400.0f);
        boolean changed = gapComposer.changed(shimmerTheme);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changed || rememberedValue == neverEqualPolicy) {
            ShimmerEffect shimmerEffect = new ShimmerEffect(shimmerTheme.animationSpec, shimmerTheme.blendMode, shimmerTheme.rotation, shimmerTheme.shaderColors, shimmerTheme.shaderColorStops, mo236toPx0680j_4);
            gapComposer.updateRememberedValue(shimmerEffect);
            rememberedValue = shimmerEffect;
        }
        ShimmerEffect shimmerEffect2 = (ShimmerEffect) rememberedValue;
        boolean changedInstance = gapComposer.changedInstance(shimmerEffect2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Rect rect = null;
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new HazeSourceNode$launchPreDraw$1(shimmerEffect2, null, 9);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, shimmerEffect2, (Function2) rememberedValue2);
        if (shimmerBounds.equals(ShimmerBounds.Custom.INSTANCE)) {
            gapComposer.startReplaceGroup(741788154);
            gapComposer.end(false);
            rect = Rect.Zero;
        } else if (shimmerBounds.equals(ShimmerBounds.View.INSTANCE)) {
            gapComposer.startReplaceGroup(1520631015);
            gapComposer.end(false);
        } else {
            if (!shimmerBounds.equals(ShimmerBounds.Window.INSTANCE)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 741786390, false);
            }
            gapComposer.startReplaceGroup(741790476);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                Rect rect2 = new Rect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, displayMetrics.widthPixels, displayMetrics.heightPixels);
                gapComposer.updateRememberedValue(rect2);
                rememberedValue3 = rect2;
            }
            rect = (Rect) rememberedValue3;
            gapComposer.end(false);
        }
        boolean changed2 = gapComposer.changed(shimmerTheme) | gapComposer.changed(shimmerEffect2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new Shimmer(shimmerTheme, shimmerEffect2, rect);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Shimmer shimmer = (Shimmer) rememberedValue4;
        shimmer.boundsFlow.setValue(rect);
        return shimmer;
    }

    public static final Modifier shimmer(Modifier modifier, Shimmer shimmer, Composer composer, int i) {
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
        ShimmerTheme shimmerTheme = shimmer.theme;
        float mo236toPx0680j_4 = density.mo236toPx0680j_4(400.0f);
        float f = shimmerTheme.rotation;
        boolean changed = gapComposer.changed(mo236toPx0680j_4) | gapComposer.changed(f);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changed || rememberedValue == neverEqualPolicy) {
            rememberedValue = new ShimmerArea(mo236toPx0680j_4, f);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        ShimmerArea shimmerArea = (ShimmerArea) rememberedValue;
        boolean changedInstance = gapComposer.changedInstance(shimmer) | gapComposer.changedInstance(shimmerArea);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new ShimmerModifierKt$shimmer$1$1(shimmer, shimmerArea, null, 0);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(shimmerArea, shimmer, (Function2) rememberedValue2, gapComposer);
        ShimmerEffect shimmerEffect = shimmer.effect;
        shimmerArea.getClass();
        shimmerEffect.getClass();
        ShimmerElement shimmerElement = new ShimmerElement();
        shimmerElement.area = shimmerArea;
        shimmerElement.effect = shimmerEffect;
        return modifier.then(shimmerElement);
    }
}

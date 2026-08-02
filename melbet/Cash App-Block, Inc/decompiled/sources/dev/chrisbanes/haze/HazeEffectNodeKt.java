package dev.chrisbanes.haze;

import android.os.Build;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public abstract class HazeEffectNodeKt {
    public static final Lazy renderEffectCache$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new HazeStyleKt$$ExternalSyntheticLambda0(6));

    /* renamed from: calculateInputScaleFactor-3ABfNKs$default, reason: not valid java name */
    public static float m4109calculateInputScaleFactor3ABfNKs$default(HazeEffectNode hazeEffectNode) {
        float resolveBlurRadius = resolveBlurRadius(hazeEffectNode);
        HazeInputScale$None hazeInputScale$None = hazeEffectNode.inputScale;
        if (Intrinsics.areEqual(hazeInputScale$None, HazeInputScale$None.INSTANCE)) {
            return 1.0f;
        }
        if (Intrinsics.areEqual(hazeInputScale$None, HazeInputScale$Auto.INSTANCE)) {
            return Dp.m1036compareTo0680j_4(resolveBlurRadius, 7.0f) < 0 ? 1.0f : 0.3334f;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return RecyclerView.DECELERATION_RATE;
    }

    public static final boolean resolveBlurEnabled(HazeEffectNode hazeEffectNode) {
        HazeState hazeState = hazeEffectNode.state;
        if (hazeState != null) {
            return ((Boolean) hazeState.blurEnabled$delegate.getValue()).booleanValue();
        }
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = HazeDefaults.blurredEdgeTreatment;
        return Build.VERSION.SDK_INT >= 31;
    }

    public static final float resolveBlurRadius(HazeEffectNode hazeEffectNode) {
        float f = hazeEffectNode.blurRadius;
        if (Float.isNaN(f)) {
            f = hazeEffectNode.style.blurRadius;
        }
        return !Float.isNaN(f) ? f : hazeEffectNode.compositionLocalStyle.blurRadius;
    }

    public static final float resolveNoiseFactor(HazeEffectNode hazeEffectNode) {
        float f = hazeEffectNode.noiseFactor;
        if (RecyclerView.DECELERATION_RATE > f || f > 1.0f) {
            f = hazeEffectNode.style.noiseFactor;
        }
        return (RecyclerView.DECELERATION_RATE > f || f > 1.0f) ? hazeEffectNode.compositionLocalStyle.noiseFactor : f;
    }

    public static final List resolveTints(HazeEffectNode hazeEffectNode) {
        hazeEffectNode.tints.getClass();
        List list = hazeEffectNode.style.tints;
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            return list;
        }
        List list2 = hazeEffectNode.compositionLocalStyle.tints;
        List list3 = list2.isEmpty() ? null : list2;
        return list3 == null ? EmptyList.INSTANCE : list3;
    }
}

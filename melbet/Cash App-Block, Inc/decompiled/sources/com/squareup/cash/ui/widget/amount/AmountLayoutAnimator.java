package com.squareup.cash.ui.widget.amount;

import android.graphics.Canvas;
import android.text.TextPaint;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes7.dex */
public final class AmountLayoutAnimator {
    public static final CubicBezierEasing EASE_FAST_OUT;
    public static final CubicBezierEasing EASE_IN_HEAVY;
    public static final CubicBezierEasing EASE_OUT_HEAVY;
    public static final TweenSpec POSITION_SPEC;
    public static final TweenSpec TEXT_SCALE_SPEC;
    public boolean initialized;
    public AmountModel lastModel;
    public float lastWidth;
    public TextPaint scratchPaint;
    public final SnapshotStateMap activeDigits = new SnapshotStateMap();
    public final SnapshotStateMap exitingDigits = new SnapshotStateMap();
    public Animatable textScale = AnimatableKt.Animatable(1.0f, 0.01f);

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.3f, RecyclerView.DECELERATION_RATE, 0.9f, 1.0f);
        EASE_IN_HEAVY = new CubicBezierEasing(0.3f, RecyclerView.DECELERATION_RATE, 0.8f, 1.0f);
        CubicBezierEasing cubicBezierEasing2 = new CubicBezierEasing(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.9f, 1.0f);
        EASE_FAST_OUT = cubicBezierEasing2;
        EASE_OUT_HEAVY = new CubicBezierEasing(0.3f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
        POSITION_SPEC = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 0, cubicBezierEasing, 2);
        TEXT_SCALE_SPEC = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 0, cubicBezierEasing2, 2);
    }

    public static void drawDigits(Map map, Canvas canvas, TextPaint textPaint, TextPaint textPaint2, float f, float f2) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            AnimatedDigitState animatedDigitState = (AnimatedDigitState) ((Map.Entry) it.next()).getValue();
            float floatValue = ((Number) animatedDigitState.left.getValue()).floatValue();
            float floatValue2 = ((Number) animatedDigitState.width.getValue()).floatValue();
            float floatValue3 = ((Number) animatedDigitState.scale.getValue()).floatValue();
            textPaint.setAlpha((int) (((Number) animatedDigitState.opacity.getValue()).floatValue() * 255.0f));
            textPaint.setTextSize(textPaint2.getTextSize() * f * floatValue3);
            canvas.drawText(animatedDigitState.displayText, floatValue + (((1.0f - floatValue3) * floatValue2) / 2.0f), f2, textPaint);
        }
    }

    public final void initLayout(ArrayList arrayList, float f) {
        SnapshotStateMap snapshotStateMap = this.activeDigits;
        snapshotStateMap.clear();
        this.exitingDigits.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Digit digit = (Digit) pair.first;
            RawDigitLayout rawDigitLayout = (RawDigitLayout) pair.second;
            snapshotStateMap.put(digit, new AnimatedDigitState(digit.toString(), rawDigitLayout.left, rawDigitLayout.width, 1.0f, rawDigitLayout.opacity));
        }
        this.textScale = AnimatableKt.Animatable(f, 0.01f);
        this.initialized = true;
    }
}

package com.squareup.cash.ui.widget.amount;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;

/* loaded from: classes7.dex */
public final class AnimatedDigitState {
    public final String displayText;
    public final Animatable left;
    public final Animatable opacity;
    public final Animatable scale;
    public final Animatable width;

    public AnimatedDigitState(String str, float f, float f2, float f3, float f4) {
        str.getClass();
        this.displayText = str;
        this.left = AnimatableKt.Animatable(f, 0.01f);
        this.width = AnimatableKt.Animatable(f2, 0.01f);
        this.scale = AnimatableKt.Animatable(f3, 0.01f);
        this.opacity = AnimatableKt.Animatable(f4, 0.01f);
    }
}

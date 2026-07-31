package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ShadowSpan extends CharacterStyle {

    @NotNull
    private final ShadowData shadow;

    public ShadowSpan(@NotNull ShadowData shadow) {
        Intrinsics.checkNotNullParameter(shadow, "shadow");
        this.shadow = shadow;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@Nullable TextPaint textPaint) {
        ShadowData shadowData = this.shadow;
        if (textPaint != null) {
            textPaint.setShadowLayer(shadowData.getRadius(), shadowData.getOffsetX(), shadowData.getOffsetY(), shadowData.getColor());
        }
    }
}

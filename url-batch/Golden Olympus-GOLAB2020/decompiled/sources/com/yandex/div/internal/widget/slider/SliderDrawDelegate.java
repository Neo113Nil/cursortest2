package com.yandex.div.internal.widget.slider;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.yandex.div.internal.widget.slider.shapes.TextDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class SliderDrawDelegate {
    private int viewportHeight;
    private int viewportWidth;

    private final int calculateBottom(Drawable drawable) {
        return getCenterY() + (drawable.getIntrinsicHeight() / 2);
    }

    private final int calculateTop(Drawable drawable) {
        return getCenterY() - (drawable.getIntrinsicHeight() / 2);
    }

    private final int getCenterY() {
        return this.viewportHeight / 2;
    }

    public final void drawInactiveTrack(@NotNull Canvas canvas, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (drawable == null) {
            return;
        }
        drawable.setBounds(0, calculateTop(drawable), this.viewportWidth, calculateBottom(drawable));
        drawable.draw(canvas);
    }

    public final void drawOnPosition(@NotNull Canvas canvas, @Nullable Drawable drawable, int i4) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i4 - intrinsicWidth, calculateTop(drawable), i4 + intrinsicWidth, calculateBottom(drawable));
        drawable.draw(canvas);
    }

    public final void drawThumb(@NotNull Canvas canvas, int i4, @Nullable Drawable drawable, int i5, @Nullable TextDrawable textDrawable) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        drawOnPosition(canvas, drawable, i4);
        if (textDrawable != null) {
            textDrawable.setText(String.valueOf(i5));
            drawOnPosition(canvas, textDrawable, i4);
        }
    }

    public final void drawTrackPart(@NotNull Canvas canvas, @Nullable Drawable drawable, int i4, int i5) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i4, calculateTop(drawable), i5, calculateBottom(drawable));
        drawable.draw(canvas);
    }

    public final void onMeasure(int i4, int i5) {
        this.viewportWidth = i4;
        this.viewportHeight = i5;
    }
}

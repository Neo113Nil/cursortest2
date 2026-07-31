package com.yandex.div.internal.widget.slider.shapes;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.yandex.div.core.view2.divs.TextViewExtensionsKt;
import com.yandex.div.internal.widget.slider.SliderTextStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class TextDrawDelegate {
    private float halfTextHeight;
    private float halfTextWidth;

    @Nullable
    private String text;

    @NotNull
    private final Paint textPaint;

    @NotNull
    private final Rect textRect;

    @NotNull
    private final SliderTextStyle textStyle;

    public TextDrawDelegate(@NotNull SliderTextStyle textStyle) {
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        this.textStyle = textStyle;
        this.textRect = new Rect();
        Paint paint = new Paint(1);
        paint.setTextSize(textStyle.getFontSize());
        paint.setLetterSpacing(textStyle.getSpacing());
        paint.setColor(textStyle.getTextColor());
        paint.setTypeface(textStyle.getFontWeight());
        paint.setStyle(Paint.Style.FILL);
        if (TextViewExtensionsKt.getSupportFontVariations()) {
            paint.setFontVariationSettings(textStyle.getFontVariations());
        }
        this.textPaint = paint;
    }

    public final void draw(@NotNull Canvas canvas, float f4, float f5) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        String str = this.text;
        if (str != null) {
            canvas.drawText(str, (f4 - this.halfTextWidth) + this.textStyle.getOffsetX(), f5 + this.halfTextHeight + this.textStyle.getOffsetY(), this.textPaint);
        }
    }

    public final void setText(@Nullable String str) {
        this.text = str;
        this.textPaint.getTextBounds(str, 0, str != null ? str.length() : 0, this.textRect);
        this.halfTextWidth = this.textPaint.measureText(this.text) / 2.0f;
        this.halfTextHeight = this.textRect.height() / 2.0f;
    }
}

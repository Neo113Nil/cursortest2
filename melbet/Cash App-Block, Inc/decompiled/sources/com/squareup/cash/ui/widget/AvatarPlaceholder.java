package com.squareup.cash.ui.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;

/* loaded from: classes7.dex */
public final class AvatarPlaceholder extends Drawable {
    public final RectF bounds;
    public final Drawable defaultDrawable;
    public final int defaultFillColor;
    public final RectF fillBounds;
    public final Paint fillPaint;
    public String initial = "";
    public float initialHeight;
    public float initialWidth;
    public final TextPaint textPaint;

    public AvatarPlaceholder(int i, int i2, int i3, Typeface typeface, Drawable drawable) {
        this.defaultFillColor = i;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.defaultDrawable = mutate;
            mutate.setTint(i2);
        } else {
            this.defaultDrawable = null;
        }
        this.bounds = new RectF();
        this.fillBounds = new RectF();
        Paint paint = new Paint(1);
        this.fillPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        textPaint.setTypeface(typeface);
        textPaint.setColor(i2);
        textPaint.setTextSize(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        canvas.drawOval(this.fillBounds, this.fillPaint);
        if (this.initial.length() <= 0) {
            Drawable drawable = this.defaultDrawable;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        RectF rectF = this.bounds;
        float width = rectF.width();
        float height = rectF.height();
        canvas.drawText(this.initial, (width / 2.0f) - (this.initialWidth / 2.0f), (this.initialHeight / 2.0f) + (height / 2.0f), this.textPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    public final void setAccentColor(Integer num) {
        this.fillPaint.setColor(num != null ? num.intValue() : this.defaultFillColor);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        RectF rectF = this.bounds;
        rectF.set(i, i2, i3, i4);
        this.fillBounds.set(rectF);
        Drawable drawable = this.defaultDrawable;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

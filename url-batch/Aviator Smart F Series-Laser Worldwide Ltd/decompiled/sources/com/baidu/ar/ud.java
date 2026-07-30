package com.baidu.ar;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public class ud extends ReplacementSpan {

    /* renamed from: a, reason: collision with root package name */
    public int f3415a;

    public ud(int i8) {
        this.f3415a = i8;
    }

    public final TextPaint a(Paint paint) {
        TextPaint textPaint = new TextPaint(paint);
        int i8 = this.f3415a;
        if (i8 != -1) {
            textPaint.setTextSize(i8 * textPaint.density);
        }
        return textPaint;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i8, int i9, float f8, int i10, int i11, int i12, Paint paint) {
        TextPaint a8 = a(paint);
        Paint.FontMetricsInt fontMetricsInt = a8.getFontMetricsInt();
        canvas.drawText(charSequence, i8, i9, f8, i11 - (((((fontMetricsInt.ascent + i11) + i11) + fontMetricsInt.descent) / 2) - ((i10 + i12) / 2)), a8);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i8, int i9, Paint.FontMetricsInt fontMetricsInt) {
        return (int) a(paint).measureText(charSequence, i8, i9);
    }
}

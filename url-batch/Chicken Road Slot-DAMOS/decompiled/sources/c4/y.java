package c4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y extends ReplacementSpan {

    /* renamed from: e, reason: collision with root package name */
    public final x f1799e;

    /* renamed from: s, reason: collision with root package name */
    public TextPaint f1802s;

    /* renamed from: d, reason: collision with root package name */
    public final Paint.FontMetricsInt f1798d = new Paint.FontMetricsInt();

    /* renamed from: i, reason: collision with root package name */
    public short f1800i = -1;

    /* renamed from: r, reason: collision with root package name */
    public float f1801r = 1.0f;

    public y(x xVar) {
        i7.a.A(xVar, "rasterizer cannot be null");
        this.f1799e = xVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f3, int i11, int i12, int i13, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i3, i10, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f1802s;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f1802s = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f3, i11, f3 + this.f1800i, i13, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        k.a().getClass();
        float f10 = i12;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        x xVar = this.f1799e;
        c6.n nVar = xVar.f1796b;
        Typeface typeface = (Typeface) nVar.f1836r;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) nVar.f1834e, xVar.f1795a * 2, 2, f3, f10, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f1798d;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        x xVar = this.f1799e;
        this.f1801r = abs / (xVar.b().a(14) != 0 ? ((ByteBuffer) r8.f3619r).getShort(r1 + r8.f3616d) : (short) 0);
        d4.a b10 = xVar.b();
        int a9 = b10.a(14);
        if (a9 != 0) {
            ((ByteBuffer) b10.f3619r).getShort(a9 + b10.f3616d);
        }
        short s3 = (short) ((xVar.b().a(12) != 0 ? ((ByteBuffer) r5.f3619r).getShort(r7 + r5.f3616d) : (short) 0) * this.f1801r);
        this.f1800i = s3;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }
}

package U;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class y extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final x f1126b;

    /* renamed from: e, reason: collision with root package name */
    public TextPaint f1128e;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f1125a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f1127c = -1;
    public float d = 1.0f;

    public y(x xVar) {
        H1.d.j(xVar, "rasterizer cannot be null");
        this.f1126b = xVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f1128e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f1128e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint2);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
            }
            if (paint2 instanceof TextPaint) {
                textPaint = (TextPaint) paint2;
            }
        } else if (paint2 instanceof TextPaint) {
            textPaint = (TextPaint) paint2;
        }
        if (textPaint != null && textPaint.bgColor != 0) {
            int color = textPaint.getColor();
            Paint.Style style = textPaint.getStyle();
            textPaint.setColor(textPaint.bgColor);
            textPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f2, i3, f2 + this.f1127c, i5, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        j.a().getClass();
        float f3 = i4;
        if (textPaint != null) {
            paint2 = textPaint;
        }
        x xVar = this.f1126b;
        T0.m mVar = xVar.f1123b;
        Typeface typeface = (Typeface) mVar.d;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) mVar.f1074b, xVar.f1122a * 2, 2, f2, f3, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f1125a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        x xVar = this.f1126b;
        this.d = abs / (xVar.c().a(14) != 0 ? ((ByteBuffer) r8.d).getShort(r1 + r8.f568a) : (short) 0);
        V.a c2 = xVar.c();
        int a2 = c2.a(14);
        if (a2 != 0) {
            ((ByteBuffer) c2.d).getShort(a2 + c2.f568a);
        }
        short s2 = (short) ((xVar.c().a(12) != 0 ? ((ByteBuffer) r5.d).getShort(r7 + r5.f568a) : (short) 0) * this.d);
        this.f1127c = s2;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s2;
    }
}

package k1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import l1.C0820a;

/* loaded from: classes.dex */
public final class r extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final q f7413b;

    /* renamed from: e, reason: collision with root package name */
    public TextPaint f7416e;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f7412a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f7414c = -1;

    /* renamed from: d, reason: collision with root package name */
    public float f7415d = 1.0f;

    public r(q qVar) {
        M1.a.p(qVar, "rasterizer cannot be null");
        this.f7413b = qVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i4, float f4, int i5, int i6, int i7, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i2, i4, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f7416e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f7416e = textPaint2;
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
            canvas.drawRect(f4, i5, f4 + this.f7414c, i7, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        h.a().getClass();
        float f5 = i6;
        if (textPaint != null) {
            paint2 = textPaint;
        }
        q qVar = this.f7413b;
        Y0.b bVar = qVar.f7410b;
        Typeface typeface = (Typeface) bVar.f4389e;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) bVar.f4391j, qVar.f7409a * 2, 2, f4, f5, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i4, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f7412a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        q qVar = this.f7413b;
        this.f7415d = abs / (qVar.c().b(14) != 0 ? ((ByteBuffer) r8.f838j).getShort(r1 + r8.f835d) : (short) 0);
        C0820a c4 = qVar.c();
        int b4 = c4.b(14);
        if (b4 != 0) {
            ((ByteBuffer) c4.f838j).getShort(b4 + c4.f835d);
        }
        short s4 = (short) ((qVar.c().b(12) != 0 ? ((ByteBuffer) r5.f838j).getShort(r7 + r5.f835d) : (short) 0) * this.f7415d);
        this.f7414c = s4;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s4;
    }
}

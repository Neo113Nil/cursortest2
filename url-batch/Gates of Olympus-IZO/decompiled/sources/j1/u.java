package j1;

import a.AbstractC0157a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import k1.C0526a;

/* loaded from: classes.dex */
public final class u extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final t f5293b;

    /* renamed from: e, reason: collision with root package name */
    public TextPaint f5296e;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f5292a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f5294c = -1;

    /* renamed from: d, reason: collision with root package name */
    public float f5295d = 1.0f;

    public u(t tVar) {
        AbstractC0157a.p(tVar, "rasterizer cannot be null");
        this.f5293b = tVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i4, float f3, int i5, int i6, int i7, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i3, i4, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f5296e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f5296e = textPaint2;
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
            canvas.drawRect(f3, i5, f3 + this.f5294c, i7, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        C0518i.a().getClass();
        float f4 = i6;
        if (textPaint != null) {
            paint2 = textPaint;
        }
        t tVar = this.f5293b;
        A2.k kVar = tVar.f5290b;
        Typeface typeface = (Typeface) kVar.f111e;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) kVar.f109c, tVar.f5289a * 2, 2, f3, f4, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f5292a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        t tVar = this.f5293b;
        this.f5295d = abs / (tVar.c().a(14) != 0 ? ((ByteBuffer) r8.f2874g).getShort(r1 + r8.f2871d) : (short) 0);
        C0526a c3 = tVar.c();
        int a3 = c3.a(14);
        if (a3 != 0) {
            ((ByteBuffer) c3.f2874g).getShort(a3 + c3.f2871d);
        }
        short s3 = (short) ((tVar.c().a(12) != 0 ? ((ByteBuffer) r5.f2874g).getShort(r7 + r5.f2871d) : (short) 0) * this.f5295d);
        this.f5294c = s3;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }
}

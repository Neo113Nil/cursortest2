package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a0 extends ReplacementSpan {

    /* renamed from: g, reason: collision with root package name */
    public final z f314g;

    /* renamed from: j, reason: collision with root package name */
    public TextPaint f316j;

    /* renamed from: f, reason: collision with root package name */
    public final Paint.FontMetricsInt f313f = new Paint.FontMetricsInt();

    /* renamed from: h, reason: collision with root package name */
    public short f315h = -1;
    public float i = 1.0f;

    public a0(z zVar) {
        h.a.m(zVar, "rasterizer cannot be null");
        this.f314g = zVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i4, float f2, int i5, int i6, int i7, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i4, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f316j;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f316j = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
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
            canvas.drawRect(f2, i5, f2 + this.f315h, i7, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        l.a().getClass();
        float f4 = i6;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        z zVar = this.f314g;
        a0.j jVar = zVar.f371b;
        Typeface typeface = (Typeface) jVar.i;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) jVar.f101g, zVar.f370a * 2, 2, f2, f4, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i4, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f313f;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        z zVar = this.f314g;
        this.i = abs / (zVar.b().a(14) != 0 ? ((ByteBuffer) r8.d).getShort(r1 + r8.f2710a) : (short) 0);
        v0.a b4 = zVar.b();
        int a2 = b4.a(14);
        if (a2 != 0) {
            ((ByteBuffer) b4.d).getShort(a2 + b4.f2710a);
        }
        short s3 = (short) ((zVar.b().a(12) != 0 ? ((ByteBuffer) r5.d).getShort(r7 + r5.f2710a) : (short) 0) * this.i);
        this.f315h = s3;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }
}

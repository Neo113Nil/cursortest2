package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a0 extends ReplacementSpan {

    /* renamed from: g, reason: collision with root package name */
    public final z f438g;

    /* renamed from: j, reason: collision with root package name */
    public TextPaint f439j;

    /* renamed from: f, reason: collision with root package name */
    public final Paint.FontMetricsInt f437f = new Paint.FontMetricsInt();
    public short h = -1;
    public float i = 1.0f;

    public a0(z zVar) {
        b4.l.h(zVar, "rasterizer cannot be null");
        this.f438g = zVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i4, float f5, int i5, int i6, int i7, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i4, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f439j;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f439j = textPaint2;
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
            canvas.drawRect(f5, i5, f5 + this.h, i7, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        l.a().getClass();
        float f6 = i6;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        z zVar = this.f438g;
        a0.k kVar = zVar.f488b;
        Typeface typeface = (Typeface) kVar.i;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) kVar.f98g, zVar.f487a * 2, 2, f5, f6, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i4, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f437f;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        z zVar = this.f438g;
        this.i = abs / (zVar.b().a(14) != 0 ? ((ByteBuffer) r8.d).getShort(r1 + r8.f2771a) : (short) 0);
        w0.a b2 = zVar.b();
        int a5 = b2.a(14);
        if (a5 != 0) {
            ((ByteBuffer) b2.d).getShort(a5 + b2.f2771a);
        }
        short s3 = (short) ((zVar.b().a(12) != 0 ? ((ByteBuffer) r5.d).getShort(r7 + r5.f2771a) : (short) 0) * this.i);
        this.h = s3;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }
}

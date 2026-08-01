package T;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class A extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final z f800b;

    /* renamed from: e, reason: collision with root package name */
    public TextPaint f802e;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f799a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f801c = -1;
    public float d = 1.0f;

    public A(z zVar) {
        A.c.k(zVar, "rasterizer cannot be null");
        this.f800b = zVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f802e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f802e = textPaint2;
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
            canvas.drawRect(f2, i3, f2 + this.f801c, i5, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        k.a().getClass();
        float f3 = i4;
        if (textPaint != null) {
            paint2 = textPaint;
        }
        z zVar = this.f800b;
        w wVar = zVar.f853b;
        Typeface typeface = (Typeface) wVar.d;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) wVar.f846b, zVar.f852a * 2, 2, f2, f3, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f799a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        z zVar = this.f800b;
        this.d = abs / (zVar.c().a(14) != 0 ? ((ByteBuffer) r8.d).getShort(r1 + r8.f355a) : (short) 0);
        U.a c2 = zVar.c();
        int a2 = c2.a(14);
        if (a2 != 0) {
            ((ByteBuffer) c2.d).getShort(a2 + c2.f355a);
        }
        short s2 = (short) ((zVar.c().a(12) != 0 ? ((ByteBuffer) r5.d).getShort(r7 + r5.f355a) : (short) 0) * this.d);
        this.f801c = s2;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s2;
    }
}

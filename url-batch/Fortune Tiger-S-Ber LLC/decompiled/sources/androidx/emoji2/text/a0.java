package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a0 extends ReplacementSpan {
    public final z g;

    /* renamed from: j, reason: collision with root package name */
    public TextPaint f329j;

    /* renamed from: f, reason: collision with root package name */
    public final Paint.FontMetricsInt f327f = new Paint.FontMetricsInt();
    public short h = -1;

    /* renamed from: i, reason: collision with root package name */
    public float f328i = 1.0f;

    public a0(z zVar) {
        k3.d.h(zVar, "rasterizer cannot be null");
        this.g = zVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f4, int i6, int i7, int i8, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i4, i5, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f329j;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f329j = textPaint2;
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
            canvas.drawRect(f4, i6, f4 + this.h, i8, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        l.a().getClass();
        float f5 = i7;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        z zVar = this.g;
        w wVar = zVar.f374b;
        Typeface typeface = (Typeface) wVar.f369i;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) wVar.g, zVar.f373a * 2, 2, f4, f5, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f327f;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        z zVar = this.g;
        this.f328i = abs / (zVar.b().a(14) != 0 ? ((ByteBuffer) r8.f2795d).getShort(r1 + r8.f2793a) : (short) 0);
        s0.a b2 = zVar.b();
        int a4 = b2.a(14);
        if (a4 != 0) {
            ((ByteBuffer) b2.f2795d).getShort(a4 + b2.f2793a);
        }
        short s2 = (short) ((zVar.b().a(12) != 0 ? ((ByteBuffer) r5.f2795d).getShort(r7 + r5.f2793a) : (short) 0) * this.f328i);
        this.h = s2;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s2;
    }
}

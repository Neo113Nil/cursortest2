package m1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import n1.C0719a;

/* loaded from: classes.dex */
public final class v extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final u f6986b;

    /* renamed from: e, reason: collision with root package name */
    public TextPaint f6989e;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f6985a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f6987c = -1;

    /* renamed from: d, reason: collision with root package name */
    public float f6988d = 1.0f;

    public v(u uVar) {
        l0.c.m(uVar, "rasterizer cannot be null");
        this.f6986b = uVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i4, float f3, int i5, int i6, int i7, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i3, i4, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f6989e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f6989e = textPaint2;
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
            canvas.drawRect(f3, i5, f3 + this.f6987c, i7, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        i.a().getClass();
        float f4 = i6;
        if (textPaint != null) {
            paint2 = textPaint;
        }
        u uVar = this.f6986b;
        G1.g gVar = uVar.f6983b;
        Typeface typeface = (Typeface) gVar.f2096h;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) gVar.f2094f, uVar.f6982a * 2, 2, f3, f4, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f6985a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        u uVar = this.f6986b;
        this.f6988d = abs / (uVar.c().a(14) != 0 ? ((ByteBuffer) r8.f4353g).getShort(r1 + r8.f4350d) : (short) 0);
        C0719a c2 = uVar.c();
        int a3 = c2.a(14);
        if (a3 != 0) {
            ((ByteBuffer) c2.f4353g).getShort(a3 + c2.f4350d);
        }
        short s3 = (short) ((uVar.c().a(12) != 0 ? ((ByteBuffer) r5.f4353g).getShort(r7 + r5.f4350d) : (short) 0) * this.f6988d);
        this.f6987c = s3;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }
}

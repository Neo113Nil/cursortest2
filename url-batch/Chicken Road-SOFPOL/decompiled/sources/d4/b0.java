package d4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b0 extends ReplacementSpan {

    /* renamed from: e, reason: collision with root package name */
    public final a0 f2251e;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f2254h;

    /* renamed from: d, reason: collision with root package name */
    public final Paint.FontMetricsInt f2250d = new Paint.FontMetricsInt();

    /* renamed from: f, reason: collision with root package name */
    public short f2252f = -1;

    /* renamed from: g, reason: collision with root package name */
    public float f2253g = 1.0f;

    public b0(a0 a0Var) {
        h0.a.o(a0Var, "rasterizer cannot be null");
        this.f2251e = a0Var;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i8, float f6, int i9, int i10, int i11, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i8, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f2254h;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f2254h = textPaint2;
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
            canvas.drawRect(f6, i9, f6 + this.f2252f, i11, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        l.a().getClass();
        float f8 = i10;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        a0 a0Var = this.f2251e;
        c5.x xVar = a0Var.f2248b;
        Typeface typeface = (Typeface) xVar.f1740g;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) xVar.f1738e, a0Var.f2247a * 2, 2, f6, f8, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i8, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f2250d;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        a0 a0Var = this.f2251e;
        this.f2253g = abs / (a0Var.b().a(14) != 0 ? ((ByteBuffer) r8.f2491g).getShort(r1 + r8.f2488d) : (short) 0);
        e4.a b8 = a0Var.b();
        int a8 = b8.a(14);
        if (a8 != 0) {
            ((ByteBuffer) b8.f2491g).getShort(a8 + b8.f2488d);
        }
        short s5 = (short) ((a0Var.b().a(12) != 0 ? ((ByteBuffer) r5.f2491g).getShort(r7 + r5.f2488d) : (short) 0) * this.f2253g);
        this.f2252f = s5;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s5;
    }
}

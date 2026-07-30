package l3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class w extends ReplacementSpan {

    /* renamed from: g, reason: collision with root package name */
    public final v f5941g;

    /* renamed from: j, reason: collision with root package name */
    public TextPaint f5944j;

    /* renamed from: f, reason: collision with root package name */
    public final Paint.FontMetricsInt f5940f = new Paint.FontMetricsInt();

    /* renamed from: h, reason: collision with root package name */
    public short f5942h = -1;

    /* renamed from: i, reason: collision with root package name */
    public float f5943i = 1.0f;

    public w(v vVar) {
        a.a.m(vVar, "rasterizer cannot be null");
        this.f5941g = vVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i8, float f9, int i9, int i10, int i11, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i7, i8, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f5944j;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f5944j = textPaint2;
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
            canvas.drawRect(f9, i9, f9 + this.f5942h, i11, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        k.a().getClass();
        float f10 = i10;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        v vVar = this.f5941g;
        g3.k kVar = vVar.f5938b;
        Typeface typeface = (Typeface) kVar.f4163j;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) kVar.f4161h, vVar.f5937a * 2, 2, f9, f10, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f5940f;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        v vVar = this.f5941g;
        this.f5943i = abs / (vVar.b().a(14) != 0 ? ((ByteBuffer) r8.f3416i).getShort(r1 + r8.f3413f) : (short) 0);
        m3.a b9 = vVar.b();
        int a3 = b9.a(14);
        if (a3 != 0) {
            ((ByteBuffer) b9.f3416i).getShort(a3 + b9.f3413f);
        }
        short s5 = (short) ((vVar.b().a(12) != 0 ? ((ByteBuffer) r5.f3416i).getShort(r7 + r5.f3413f) : (short) 0) * this.f5943i);
        this.f5942h = s5;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s5;
    }
}

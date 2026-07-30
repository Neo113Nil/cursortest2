package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ym2 extends ReplacementSpan {
    public final xm2 OPXfSBeufaJ8;
    public TextPaint x50lh2ztY7Y5;
    public final Paint.FontMetricsInt rtx2ld2ELZv4 = new Paint.FontMetricsInt();
    public short wdg6QnbFHrFF = -1;
    public float dgRBjINgWbAK = 1.0f;

    public ym2(xm2 xm2Var) {
        ki0.RfyTYNmI9Srp(xm2Var, "rasterizer cannot be null");
        this.OPXfSBeufaJ8 = xm2Var;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.x50lh2ztY7Y5;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.x50lh2ztY7Y5 = textPaint2;
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
            canvas.drawRect(f, i3, f + this.wdg6QnbFHrFF, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        x40.PxuCJdSBwIXG().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        xm2 xm2Var = this.OPXfSBeufaJ8;
        e0 e0Var = xm2Var.lS5Rgt96tfkO;
        Typeface typeface = (Typeface) e0Var.x50lh2ztY7Y5;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) e0Var.wdg6QnbFHrFF, xm2Var.PxuCJdSBwIXG * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.rtx2ld2ELZv4;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        xm2 xm2Var = this.OPXfSBeufaJ8;
        this.dgRBjINgWbAK = abs / (xm2Var.lS5Rgt96tfkO().PxuCJdSBwIXG(14) != 0 ? ((ByteBuffer) r8.dgRBjINgWbAK).getShort(r1 + r8.rtx2ld2ELZv4) : (short) 0);
        z51 lS5Rgt96tfkO = xm2Var.lS5Rgt96tfkO();
        int PxuCJdSBwIXG = lS5Rgt96tfkO.PxuCJdSBwIXG(14);
        if (PxuCJdSBwIXG != 0) {
            ((ByteBuffer) lS5Rgt96tfkO.dgRBjINgWbAK).getShort(PxuCJdSBwIXG + lS5Rgt96tfkO.rtx2ld2ELZv4);
        }
        short s = (short) ((xm2Var.lS5Rgt96tfkO().PxuCJdSBwIXG(12) != 0 ? ((ByteBuffer) r5.dgRBjINgWbAK).getShort(r7 + r5.rtx2ld2ELZv4) : (short) 0) * this.dgRBjINgWbAK);
        this.wdg6QnbFHrFF = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}

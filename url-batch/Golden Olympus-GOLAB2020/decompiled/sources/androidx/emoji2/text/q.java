package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class q extends j {

    /* renamed from: h, reason: collision with root package name */
    private static Paint f12218h;

    /* renamed from: g, reason: collision with root package name */
    private TextPaint f12219g;

    public q(p pVar) {
        super(pVar);
    }

    private TextPaint c(CharSequence charSequence, int i4, int i5, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i4, i5, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f12219g;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f12219g = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    characterStyle.updateDrawState(textPaint);
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    private static Paint e() {
        if (f12218h == null) {
            TextPaint textPaint = new TextPaint();
            f12218h = textPaint;
            textPaint.setColor(f.c().d());
            f12218h.setStyle(Paint.Style.FILL);
        }
        return f12218h;
    }

    void d(Canvas canvas, TextPaint textPaint, float f4, float f5, float f6, float f7) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f4, f6, f5, f7, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f4, int i6, int i7, int i8, Paint paint) {
        TextPaint c4 = c(charSequence, i4, i5, paint);
        if (c4 != null && c4.bgColor != 0) {
            d(canvas, c4, f4, f4 + b(), i6, i8);
        }
        Paint paint2 = c4;
        if (f.c().j()) {
            canvas.drawRect(f4, i6, f4 + b(), i8, e());
        }
        p a4 = a();
        float f5 = i7;
        if (paint2 == null) {
            paint2 = paint;
        }
        a4.a(canvas, f4, f5, paint2);
    }
}

package U;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class u extends ReplacementSpan {

    /* renamed from: e, reason: collision with root package name */
    public final n f2707e;

    /* renamed from: d, reason: collision with root package name */
    public final Paint.FontMetricsInt f2706d = new Paint.FontMetricsInt();

    /* renamed from: i, reason: collision with root package name */
    public float f2708i = 1.0f;

    public u(n nVar) {
        AbstractC1053a.j(nVar, "metadata cannot be null");
        this.f2707e = nVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i5, float f7, int i7, int i8, int i9, Paint paint) {
        j.a().getClass();
        n nVar = this.f2707e;
        P0.i iVar = nVar.f2680b;
        Typeface typeface = (Typeface) iVar.f2203d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) iVar.f2201b, nVar.f2679a * 2, 2, f7, i8, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i5, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f2706d;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        n nVar = this.f2707e;
        this.f2708i = abs / (nVar.b().a(14) != 0 ? ((ByteBuffer) r8.f1145l).getShort(r1 + r8.f1142d) : (short) 0);
        V.a b7 = nVar.b();
        int a7 = b7.a(14);
        if (a7 != 0) {
            ((ByteBuffer) b7.f1145l).getShort(a7 + b7.f1142d);
        }
        short s7 = (short) ((nVar.b().a(12) != 0 ? ((ByteBuffer) r5.f1145l).getShort(r7 + r5.f1142d) : (short) 0) * this.f2708i);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s7;
    }
}

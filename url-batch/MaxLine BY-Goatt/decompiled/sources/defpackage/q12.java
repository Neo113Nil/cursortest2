package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q12 extends ReplacementSpan {
    public Paint.FontMetricsInt m;
    public int n;
    public int o;
    public boolean p;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.m;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.f("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.p) {
            i21.b("PlaceholderSpan is not laid out yet.");
        }
        return this.o;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.p = true;
        paint.getTextSize();
        this.m = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            i21.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.n = (int) Math.ceil(0.0d);
        this.o = (int) Math.ceil(0.0d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.p) {
            i21.b("PlaceholderSpan is not laid out yet.");
        }
        return this.n;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}

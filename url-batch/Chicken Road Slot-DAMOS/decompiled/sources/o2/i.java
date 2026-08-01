package o2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* renamed from: d, reason: collision with root package name */
    public Paint.FontMetricsInt f7352d;

    /* renamed from: e, reason: collision with root package name */
    public int f7353e;

    /* renamed from: i, reason: collision with root package name */
    public int f7354i;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7355r;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f7352d;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.f("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.f7355r) {
            r2.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f7354i;
    }

    public final int c() {
        if (!this.f7355r) {
            r2.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f7353e;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        this.f7355r = true;
        paint.getTextSize();
        this.f7352d = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            r2.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f7353e = (int) Math.ceil(0.0f);
        this.f7354i = (int) Math.ceil(0.0f);
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
        return c();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f3, int i11, int i12, int i13, Paint paint) {
    }
}

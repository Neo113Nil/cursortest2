package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class im1 extends ReplacementSpan {
    public static final hm1 Companion = new hm1();
    public int OPXfSBeufaJ8;
    public boolean dgRBjINgWbAK;
    public Paint.FontMetricsInt rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;

    public final Paint.FontMetricsInt PxuCJdSBwIXG() {
        Paint.FontMetricsInt fontMetricsInt = this.rtx2ld2ELZv4;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        cs0.tmVwIGCQF4zR("fontMetrics");
        throw null;
    }

    public final int TSizfFm2Yiuu() {
        if (!this.dgRBjINgWbAK) {
            fp0.lS5Rgt96tfkO("PlaceholderSpan is not laid out yet.");
        }
        return this.OPXfSBeufaJ8;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.dgRBjINgWbAK = true;
        paint.getTextSize();
        this.rtx2ld2ELZv4 = paint.getFontMetricsInt();
        if (PxuCJdSBwIXG().descent <= PxuCJdSBwIXG().ascent) {
            fp0.PxuCJdSBwIXG("Invalid fontMetrics: line height can not be negative.");
        }
        this.OPXfSBeufaJ8 = (int) Math.ceil(0.0d);
        this.wdg6QnbFHrFF = (int) Math.ceil(0.0d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = PxuCJdSBwIXG().ascent;
            fontMetricsInt.descent = PxuCJdSBwIXG().descent;
            fontMetricsInt.leading = PxuCJdSBwIXG().leading;
            if (fontMetricsInt.ascent > (-lS5Rgt96tfkO())) {
                fontMetricsInt.ascent = -lS5Rgt96tfkO();
            }
            fontMetricsInt.top = Math.min(PxuCJdSBwIXG().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(PxuCJdSBwIXG().bottom, fontMetricsInt.descent);
        }
        return TSizfFm2Yiuu();
    }

    public final int lS5Rgt96tfkO() {
        if (!this.dgRBjINgWbAK) {
            fp0.lS5Rgt96tfkO("PlaceholderSpan is not laid out yet.");
        }
        return this.wdg6QnbFHrFF;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}

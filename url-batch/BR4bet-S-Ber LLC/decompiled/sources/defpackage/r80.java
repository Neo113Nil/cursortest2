package defpackage;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class r80 {
    public float c;
    public final WeakReference e;
    public p80 f;
    public final TextPaint a = new TextPaint(1);
    public final ta b = new ta(1, this);
    public boolean d = true;

    public r80(wa waVar) {
        this.e = new WeakReference(null);
        this.e = new WeakReference(waVar);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.c;
        }
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.c;
    }
}

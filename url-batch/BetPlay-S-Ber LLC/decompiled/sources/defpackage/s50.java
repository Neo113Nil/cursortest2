package defpackage;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class s50 {
    public float c;
    public final WeakReference e;
    public p50 f;
    public final TextPaint a = new TextPaint(1);
    public final da b = new da(1, this);
    public boolean d = true;

    public s50(ga gaVar) {
        this.e = new WeakReference(null);
        this.e = new WeakReference(gaVar);
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

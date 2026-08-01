package defpackage;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class qh0 {
    public float c;
    public final WeakReference e;
    public oh0 f;
    public final TextPaint a = new TextPaint(1);
    public final pb b = new pb(1, this);
    public boolean d = true;

    public qh0(sb sbVar) {
        this.e = new WeakReference(null);
        this.e = new WeakReference(sbVar);
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

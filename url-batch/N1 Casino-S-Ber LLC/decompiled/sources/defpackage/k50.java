package defpackage;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class k50 {
    public float c;
    public final WeakReference e;
    public i50 f;
    public final TextPaint a = new TextPaint(1);
    public final fa b = new fa(1, this);
    public boolean d = true;

    public k50(ia iaVar) {
        this.e = new WeakReference(null);
        this.e = new WeakReference(iaVar);
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

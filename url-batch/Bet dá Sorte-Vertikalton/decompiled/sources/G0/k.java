package G0;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public float f254c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f255e;

    /* renamed from: f, reason: collision with root package name */
    public J0.d f256f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f252a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final B0.b f253b = new B0.b(1, this);
    public boolean d = true;

    public k(B0.f fVar) {
        this.f255e = new WeakReference(null);
        this.f255e = new WeakReference(fVar);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.f254c;
        }
        TextPaint textPaint = this.f252a;
        this.f254c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.f254c;
    }
}

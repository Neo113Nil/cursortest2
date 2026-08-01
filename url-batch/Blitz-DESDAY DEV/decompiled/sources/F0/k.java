package F0;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public float f313c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f314e;

    /* renamed from: f, reason: collision with root package name */
    public I0.d f315f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f311a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final A0.b f312b = new A0.b(1, this);
    public boolean d = true;

    public k(A0.f fVar) {
        this.f314e = new WeakReference(null);
        this.f314e = new WeakReference(fVar);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.f313c;
        }
        TextPaint textPaint = this.f311a;
        this.f313c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.f313c;
    }
}

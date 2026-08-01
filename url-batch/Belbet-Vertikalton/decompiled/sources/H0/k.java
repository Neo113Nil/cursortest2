package H0;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public float f534c;
    public final WeakReference e;

    /* renamed from: f, reason: collision with root package name */
    public K0.d f536f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f532a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final C0.b f533b = new C0.b(1, this);

    /* renamed from: d, reason: collision with root package name */
    public boolean f535d = true;

    public k(C0.f fVar) {
        this.e = new WeakReference(null);
        this.e = new WeakReference(fVar);
    }

    public final float a(String str) {
        if (!this.f535d) {
            return this.f534c;
        }
        TextPaint textPaint = this.f532a;
        this.f534c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f535d = false;
        return this.f534c;
    }
}

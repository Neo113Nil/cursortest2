package i2;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public float f2059c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f2060e;

    /* renamed from: f, reason: collision with root package name */
    public l2.d f2061f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f2057a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final a2.b f2058b = new a2.b(1, this);
    public boolean d = true;

    public m(a2.f fVar) {
        this.f2060e = new WeakReference(null);
        this.f2060e = new WeakReference(fVar);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.f2059c;
        }
        TextPaint textPaint = this.f2057a;
        this.f2059c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.f2059c;
    }
}

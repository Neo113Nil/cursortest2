package r5;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public float f6673c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f6675e;

    /* renamed from: f, reason: collision with root package name */
    public t5.d f6676f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f6671a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final n5.b f6672b = new n5.b(1, this);

    /* renamed from: d, reason: collision with root package name */
    public boolean f6674d = true;

    public i(n5.f fVar) {
        this.f6675e = new WeakReference(null);
        this.f6675e = new WeakReference(fVar);
    }

    public final float a(String str) {
        if (!this.f6674d) {
            return this.f6673c;
        }
        TextPaint textPaint = this.f6671a;
        this.f6673c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f6674d = false;
        return this.f6673c;
    }
}

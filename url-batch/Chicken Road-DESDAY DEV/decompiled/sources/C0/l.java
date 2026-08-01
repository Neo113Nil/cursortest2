package C0;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public float f155c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f156e;

    /* renamed from: f, reason: collision with root package name */
    public F0.d f157f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f153a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final j f154b = new j(0, this);
    public boolean d = true;

    public l(x0.e eVar) {
        this.f156e = new WeakReference(null);
        this.f156e = new WeakReference(eVar);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.f155c;
        }
        TextPaint textPaint = this.f153a;
        this.f155c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.f155c;
    }
}

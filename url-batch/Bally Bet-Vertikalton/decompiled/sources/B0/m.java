package B0;

import android.text.TextPaint;
import java.lang.ref.WeakReference;
import w0.C0335e;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public float f134c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f135e;

    /* renamed from: f, reason: collision with root package name */
    public E0.d f136f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f132a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final k f133b = new k(0, this);
    public boolean d = true;

    public m(C0335e c0335e) {
        this.f135e = new WeakReference(null);
        this.f135e = new WeakReference(c0335e);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.f134c;
        }
        TextPaint textPaint = this.f132a;
        this.f134c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.f134c;
    }
}

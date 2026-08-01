package I0;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public float f340c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f341e;

    /* renamed from: f, reason: collision with root package name */
    public L0.d f342f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f338a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final D0.b f339b = new D0.b(1, this);
    public boolean d = true;

    public i(D0.f fVar) {
        this.f341e = new WeakReference(null);
        this.f341e = new WeakReference(fVar);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.f340c;
        }
        TextPaint textPaint = this.f338a;
        this.f340c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.f340c;
    }
}

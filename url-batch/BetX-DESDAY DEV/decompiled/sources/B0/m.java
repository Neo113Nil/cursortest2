package B0;

import android.text.TextPaint;
import java.lang.ref.WeakReference;
import w0.C0362e;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public float f142c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f144e;

    /* renamed from: f, reason: collision with root package name */
    public E0.d f145f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f140a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final k f141b = new k(0, this);

    /* renamed from: d, reason: collision with root package name */
    public boolean f143d = true;

    public m(C0362e c0362e) {
        this.f144e = new WeakReference(null);
        this.f144e = new WeakReference(c0362e);
    }

    public final float a(String str) {
        if (!this.f143d) {
            return this.f142c;
        }
        TextPaint textPaint = this.f140a;
        this.f142c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f143d = false;
        return this.f142c;
    }
}

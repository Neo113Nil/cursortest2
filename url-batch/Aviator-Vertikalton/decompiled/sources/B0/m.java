package B0;

import android.text.TextPaint;
import java.lang.ref.WeakReference;
import w0.C0360e;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public float f143c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f145e;

    /* renamed from: f, reason: collision with root package name */
    public E0.d f146f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f141a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final k f142b = new k(0, this);

    /* renamed from: d, reason: collision with root package name */
    public boolean f144d = true;

    public m(C0360e c0360e) {
        this.f145e = new WeakReference(null);
        this.f145e = new WeakReference(c0360e);
    }

    public final float a(String str) {
        if (!this.f144d) {
            return this.f143c;
        }
        TextPaint textPaint = this.f141a;
        this.f143c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f144d = false;
        return this.f143c;
    }
}

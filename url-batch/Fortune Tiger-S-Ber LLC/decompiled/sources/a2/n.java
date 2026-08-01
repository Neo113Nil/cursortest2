package a2;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class n {
    public float c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f61e;

    /* renamed from: f, reason: collision with root package name */
    public d2.d f62f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f58a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final l f59b = new l(0, this);

    /* renamed from: d, reason: collision with root package name */
    public boolean f60d = true;

    public n(u1.e eVar) {
        this.f61e = new WeakReference(null);
        this.f61e = new WeakReference(eVar);
    }

    public final float a(String str) {
        if (!this.f60d) {
            return this.c;
        }
        TextPaint textPaint = this.f58a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f60d = false;
        return this.c;
    }
}

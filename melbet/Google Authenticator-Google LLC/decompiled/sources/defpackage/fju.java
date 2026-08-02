package defpackage;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fju {
    public final TextPaint a = new TextPaint(1);
    public final fmp b = new fjs(this);
    public boolean c = true;
    public WeakReference d;
    public fmo e;
    private float f;

    public fju(fjt fjtVar) {
        this.d = new WeakReference(null);
        this.d = new WeakReference(fjtVar);
    }

    public final float a(String str) {
        if (!this.c) {
            return this.f;
        }
        this.f = str == null ? 0.0f : this.a.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(this.a.getFontMetrics().ascent);
        }
        this.c = false;
        return this.f;
    }
}

package n2;

import android.text.TextPaint;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final k f5332a = new k(false);

    public static final void a(TextPaint textPaint, float f6) {
        if (Float.isNaN(f6)) {
            return;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f6 * 255));
    }
}

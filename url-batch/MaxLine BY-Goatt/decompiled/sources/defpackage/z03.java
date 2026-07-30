package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class z03 {
    public static final ThreadLocal a = new ThreadLocal();

    public static Typeface a(Typeface typeface, iq0 iq0Var, Context context) {
        if (typeface == null) {
            return null;
        }
        if (iq0Var.a.isEmpty()) {
            return typeface;
        }
        ThreadLocal threadLocal = a;
        Paint paint = (Paint) threadLocal.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(t8.h(iq0Var, context));
        return paint.getTypeface();
    }
}

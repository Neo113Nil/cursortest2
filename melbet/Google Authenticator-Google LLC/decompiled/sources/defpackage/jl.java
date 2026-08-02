package defpackage;

import android.R;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jl {
    private static final int[] b = {R.attr.state_checked};
    private static final int[] c = new int[0];
    public static final Rect a = new Rect();

    public static Rect a(Drawable drawable) {
        Insets opticalInsets;
        int i;
        int i2;
        int i3;
        int i4;
        if (Build.VERSION.SDK_INT >= 29) {
            opticalInsets = drawable.getOpticalInsets();
            i = opticalInsets.left;
            i2 = opticalInsets.top;
            i3 = opticalInsets.right;
            i4 = opticalInsets.bottom;
            return new Rect(i, i2, i3, i4);
        }
        Drawable k = pj.k(drawable);
        boolean z = jk.a;
        if (Build.VERSION.SDK_INT < 29 && jk.a) {
            try {
                Object invoke = jk.b.invoke(k, null);
                if (invoke != null) {
                    return new Rect(jk.c.getInt(invoke), jk.d.getInt(invoke), jk.e.getInt(invoke), jk.f.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return a;
    }

    public static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        if (Build.VERSION.SDK_INT < 29 || Build.VERSION.SDK_INT >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(b);
        } else {
            drawable.setState(c);
        }
        drawable.setState(state);
    }
}

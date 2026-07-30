package n;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* renamed from: n.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0731q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f6868a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f6869b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f6870c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i2 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f6868a);
        } else {
            drawable.setState(f6869b);
        }
        drawable.setState(state);
    }

    public static Rect b(Drawable drawable) {
        int i2;
        int i5;
        int i7;
        int i8;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            Insets a7 = AbstractC0729p0.a(drawable);
            i2 = a7.left;
            i5 = a7.top;
            i7 = a7.right;
            i8 = a7.bottom;
            return new Rect(i2, i5, i7, i8);
        }
        if (i9 >= 29) {
            boolean z7 = AbstractC0727o0.f6853a;
        } else if (AbstractC0727o0.f6853a) {
            try {
                Object invoke = AbstractC0727o0.f6854b.invoke(drawable, null);
                if (invoke != null) {
                    return new Rect(AbstractC0727o0.f6855c.getInt(invoke), AbstractC0727o0.f6856d.getInt(invoke), AbstractC0727o0.f6857e.getInt(invoke), AbstractC0727o0.f6858f.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f6870c;
    }

    public static PorterDuff.Mode c(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}

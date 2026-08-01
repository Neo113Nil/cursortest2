package m;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* renamed from: m.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0234q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3169a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3170b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f3171c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f3169a);
        } else {
            drawable.setState(f3170b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            Insets a2 = AbstractC0232p0.a(drawable);
            i = a2.left;
            i2 = a2.top;
            i3 = a2.right;
            i4 = a2.bottom;
            return new Rect(i, i2, i3, i4);
        }
        boolean z2 = drawable instanceof E.d;
        Object obj = drawable;
        if (z2) {
            ((E.e) ((E.d) drawable)).getClass();
            obj = null;
        }
        if (i5 >= 29) {
            boolean z3 = AbstractC0230o0.f3153a;
        } else if (AbstractC0230o0.f3153a) {
            try {
                Object invoke = AbstractC0230o0.f3154b.invoke(obj, null);
                if (invoke != null) {
                    return new Rect(AbstractC0230o0.f3155c.getInt(invoke), AbstractC0230o0.d.getInt(invoke), AbstractC0230o0.f3156e.getInt(invoke), AbstractC0230o0.f3157f.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f3171c;
    }

    public static PorterDuff.Mode c(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
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

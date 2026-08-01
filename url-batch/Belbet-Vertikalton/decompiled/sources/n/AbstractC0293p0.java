package n;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* renamed from: n.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0293p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3690a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3691b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f3692c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f3690a);
        } else {
            drawable.setState(f3691b);
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
            Insets a2 = AbstractC0291o0.a(drawable);
            i = a2.left;
            i2 = a2.top;
            i3 = a2.right;
            i4 = a2.bottom;
            return new Rect(i, i2, i3, i4);
        }
        boolean z2 = drawable instanceof F.d;
        Object obj = drawable;
        if (z2) {
            ((F.e) ((F.d) drawable)).getClass();
            obj = null;
        }
        if (i5 >= 29) {
            boolean z3 = AbstractC0289n0.f3678a;
        } else if (AbstractC0289n0.f3678a) {
            try {
                Object invoke = AbstractC0289n0.f3679b.invoke(obj, null);
                if (invoke != null) {
                    return new Rect(AbstractC0289n0.f3680c.getInt(invoke), AbstractC0289n0.f3681d.getInt(invoke), AbstractC0289n0.e.getInt(invoke), AbstractC0289n0.f3682f.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f3692c;
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

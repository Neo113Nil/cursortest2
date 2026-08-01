package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class in0 extends bd0 {
    public static boolean d = true;
    public static boolean e = true;
    public static boolean f = true;
    public static boolean g = true;

    public void k(View view, int i, int i2, int i3, int i4) {
        if (f) {
            try {
                gn0.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }

    public void l(View view, int i) {
        if (Build.VERSION.SDK_INT != 28) {
            if (g) {
                try {
                    hn0.a(view, i);
                    return;
                } catch (NoSuchMethodError unused) {
                    g = false;
                    return;
                }
            }
            return;
        }
        if (!bd0.c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                bd0.b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            bd0.c = true;
        }
        Field field = bd0.b;
        if (field != null) {
            try {
                bd0.b.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    public void m(View view, Matrix matrix) {
        if (d) {
            try {
                fn0.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    public void n(ViewGroup viewGroup, Matrix matrix) {
        if (e) {
            try {
                fn0.c(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
    }
}

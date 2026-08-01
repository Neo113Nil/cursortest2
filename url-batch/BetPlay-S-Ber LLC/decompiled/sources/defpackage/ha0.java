package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class ha0 extends j8 {
    public static boolean k = true;
    public static boolean l = true;
    public static boolean m = true;
    public static boolean n = true;

    public void Z(View view, int i, int i2, int i3, int i4) {
        if (m) {
            try {
                fa0.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                m = false;
            }
        }
    }

    public void a0(View view, int i) {
        if (Build.VERSION.SDK_INT != 28) {
            if (n) {
                try {
                    ga0.a(view, i);
                    return;
                } catch (NoSuchMethodError unused) {
                    n = false;
                    return;
                }
            }
            return;
        }
        if (!j8.j) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                j8.i = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            j8.j = true;
        }
        Field field = j8.i;
        if (field != null) {
            try {
                j8.i.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    public void b0(View view, Matrix matrix) {
        if (k) {
            try {
                ea0.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                k = false;
            }
        }
    }

    public void c0(ViewGroup viewGroup, Matrix matrix) {
        if (l) {
            try {
                ea0.c(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                l = false;
            }
        }
    }
}

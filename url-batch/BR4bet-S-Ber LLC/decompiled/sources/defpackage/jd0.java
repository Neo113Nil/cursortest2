package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class jd0 extends b9 {
    public static boolean A = true;
    public static boolean x = true;
    public static boolean y = true;
    public static boolean z = true;

    public void X(View view, int i, int i2, int i3, int i4) {
        if (z) {
            try {
                hd0.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                z = false;
            }
        }
    }

    public void Y(View view, int i) {
        if (Build.VERSION.SDK_INT != 28) {
            if (A) {
                try {
                    id0.a(view, i);
                    return;
                } catch (NoSuchMethodError unused) {
                    A = false;
                    return;
                }
            }
            return;
        }
        if (!b9.w) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                b9.v = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            b9.w = true;
        }
        Field field = b9.v;
        if (field != null) {
            try {
                b9.v.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    public void Z(View view, Matrix matrix) {
        if (x) {
            try {
                gd0.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                x = false;
            }
        }
    }

    public void a0(ViewGroup viewGroup, Matrix matrix) {
        if (y) {
            try {
                gd0.c(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                y = false;
            }
        }
    }
}

package k0;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
abstract class M {

    /* renamed from: a, reason: collision with root package name */
    private static Field f40877a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f40878b;

    M() {
    }

    public abstract void a(View view);

    public abstract float b(View view);

    public abstract void c(View view);

    public abstract void d(View view, int i4, int i5, int i6, int i7);

    public abstract void e(View view, float f4);

    public void f(View view, int i4) {
        if (!f40878b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f40877a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f40878b = true;
        }
        Field field = f40877a;
        if (field != null) {
            try {
                f40877a.setInt(view, i4 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void g(View view, Matrix matrix);

    public abstract void h(View view, Matrix matrix);
}

package d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import j.S;
import java.util.WeakHashMap;
import s.AbstractC0292c;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2037a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f2038b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2039c = new Object();

    public static void a(Context context, int i2, ColorStateList colorStateList) {
        synchronized (f2039c) {
            try {
                WeakHashMap weakHashMap = f2038b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(context);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(context, sparseArray);
                }
                sparseArray.append(i2, new C0172a(colorStateList, context.getResources().getConfiguration()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ColorStateList b(Context context, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0172a c0172a;
        ColorStateList colorStateList3;
        if (Build.VERSION.SDK_INT >= 23) {
            colorStateList3 = context.getColorStateList(i2);
            return colorStateList3;
        }
        synchronized (f2039c) {
            try {
                SparseArray sparseArray = (SparseArray) f2038b.get(context);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (c0172a = (C0172a) sparseArray.get(i2)) != null) {
                    if (c0172a.f2036b.equals(context.getResources().getConfiguration())) {
                        colorStateList2 = c0172a.f2035a;
                    } else {
                        sparseArray.remove(i2);
                    }
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        Resources resources = context.getResources();
        ThreadLocal threadLocal = f2037a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            Resources resources2 = context.getResources();
            try {
                colorStateList = AbstractC0292c.a(resources2, resources2.getXml(i2), context.getTheme());
            } catch (Exception e2) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList == null) {
            return i1.a.n(context, i2);
        }
        a(context, i2, colorStateList);
        return colorStateList;
    }

    public static Drawable c(Context context, int i2) {
        return S.d().f(context, i2);
    }
}

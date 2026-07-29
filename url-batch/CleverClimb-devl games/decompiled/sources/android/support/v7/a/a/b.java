package android.support.v7.a.a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatDrawableManager;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* compiled from: AppCompatResources.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f1559a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<Context, SparseArray<a>> f1560b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f1561c = new Object();

    public static ColorStateList a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d2 = d(context, i);
        if (d2 != null) {
            return d2;
        }
        ColorStateList c2 = c(context, i);
        if (c2 != null) {
            a(context, i, c2);
            return c2;
        }
        return ContextCompat.getColorStateList(context, i);
    }

    public static Drawable b(Context context, int i) {
        return AppCompatDrawableManager.get().getDrawable(context, i);
    }

    private static ColorStateList c(Context context, int i) {
        if (e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return android.support.v7.a.a.a.a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    private static ColorStateList d(Context context, int i) {
        a aVar;
        synchronized (f1561c) {
            SparseArray<a> sparseArray = f1560b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (aVar = sparseArray.get(i)) != null) {
                if (aVar.f1563b.equals(context.getResources().getConfiguration())) {
                    return aVar.f1562a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    private static void a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f1561c) {
            SparseArray<a> sparseArray = f1560b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f1560b.put(context, sparseArray);
            }
            sparseArray.append(i, new a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    private static boolean e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue a2 = a();
        resources.getValue(i, a2, true);
        return a2.type >= 28 && a2.type <= 31;
    }

    private static TypedValue a() {
        TypedValue typedValue = f1559a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f1559a.set(typedValue2);
        return typedValue2;
    }

    /* compiled from: AppCompatResources.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final ColorStateList f1562a;

        /* renamed from: b, reason: collision with root package name */
        final Configuration f1563b;

        a(ColorStateList colorStateList, Configuration configuration) {
            this.f1562a = colorStateList;
            this.f1563b = configuration;
        }
    }
}

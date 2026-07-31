package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
abstract class x {

    /* renamed from: a, reason: collision with root package name */
    private static Field f10202a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f10203b;

    /* renamed from: c, reason: collision with root package name */
    private static Class f10204c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f10205d;

    /* renamed from: e, reason: collision with root package name */
    private static Field f10206e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f10207f;

    /* renamed from: g, reason: collision with root package name */
    private static Field f10208g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f10209h;

    static void a(Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        b(resources);
    }

    private static void b(Resources resources) {
        Object obj;
        if (!f10209h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f10208g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e4);
            }
            f10209h = true;
        }
        Field field = f10208g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e5) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e5);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f10203b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f10202a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e6) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e6);
            }
            f10203b = true;
        }
        Field field2 = f10202a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e7) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e7);
            }
        }
        if (obj2 != null) {
            c(obj2);
        }
    }

    private static void c(Object obj) {
        LongSparseArray longSparseArray;
        if (!f10205d) {
            try {
                f10204c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e4) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e4);
            }
            f10205d = true;
        }
        Class cls = f10204c;
        if (cls == null) {
            return;
        }
        if (!f10207f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f10206e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e5);
            }
            f10207f = true;
        }
        Field field = f10206e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e6) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e6);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}

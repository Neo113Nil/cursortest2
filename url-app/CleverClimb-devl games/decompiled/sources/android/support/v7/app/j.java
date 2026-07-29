package android.support.v7.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* compiled from: ResourcesFlusher.java */
/* loaded from: classes.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private static Field f1650a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f1651b;

    /* renamed from: c, reason: collision with root package name */
    private static Class f1652c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f1653d;
    private static Field e;
    private static boolean f;
    private static Field g;
    private static boolean h;

    static boolean a(Resources resources) {
        if (Build.VERSION.SDK_INT >= 24) {
            return d(resources);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return c(resources);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return b(resources);
        }
        return false;
    }

    private static boolean b(Resources resources) {
        Map map;
        if (!f1651b) {
            try {
                f1650a = Resources.class.getDeclaredField("mDrawableCache");
                f1650a.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f1651b = true;
        }
        if (f1650a == null) {
            return false;
        }
        try {
            map = (Map) f1650a.get(resources);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            map = null;
        }
        if (map == null) {
            return false;
        }
        map.clear();
        return true;
    }

    private static boolean c(Resources resources) {
        Object obj;
        if (!f1651b) {
            try {
                f1650a = Resources.class.getDeclaredField("mDrawableCache");
                f1650a.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f1651b = true;
        }
        if (f1650a != null) {
            try {
                obj = f1650a.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
            return obj == null && obj != null && a(obj);
        }
        obj = null;
        if (obj == null) {
            return false;
        }
    }

    private static boolean d(Resources resources) {
        Object obj;
        Object obj2;
        if (!h) {
            try {
                g = Resources.class.getDeclaredField("mResourcesImpl");
                g.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            h = true;
        }
        if (g == null) {
            return false;
        }
        try {
            obj = g.get(resources);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
            obj = null;
        }
        if (obj == null) {
            return false;
        }
        if (!f1651b) {
            try {
                f1650a = obj.getClass().getDeclaredField("mDrawableCache");
                f1650a.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
            }
            f1651b = true;
        }
        if (f1650a != null) {
            try {
                obj2 = f1650a.get(obj);
            } catch (IllegalAccessException e5) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
            }
            return obj2 == null && a(obj2);
        }
        obj2 = null;
        if (obj2 == null) {
        }
    }

    private static boolean a(Object obj) {
        LongSparseArray longSparseArray;
        if (!f1653d) {
            try {
                f1652c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f1653d = true;
        }
        if (f1652c == null) {
            return false;
        }
        if (!f) {
            try {
                e = f1652c.getDeclaredField("mUnthemedEntries");
                e.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f = true;
        }
        if (e == null) {
            return false;
        }
        try {
            longSparseArray = (LongSparseArray) e.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
            longSparseArray = null;
        }
        if (longSparseArray == null) {
            return false;
        }
        longSparseArray.clear();
        return true;
    }
}

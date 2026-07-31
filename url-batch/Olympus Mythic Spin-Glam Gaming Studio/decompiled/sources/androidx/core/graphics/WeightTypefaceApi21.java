package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi
@SuppressLint({"SoonBlockedPrivateApi"})
@RestrictTo
/* loaded from: classes13.dex */
final class WeightTypefaceApi21 {
    private static final Constructor sConstructor;
    private static final Method sNativeCreateFromTypeface;
    private static final Method sNativeCreateWeightAlias;
    private static final Field sNativeInstance;
    private static final Object sWeightCacheLock;
    private static final LongSparseArray sWeightTypefaceCache;

    static {
        Field field;
        Constructor constructor;
        Method method;
        Method method2;
        try {
            field = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            method = Typeface.class.getDeclaredMethod("nativeCreateFromTypeface", cls, cls2);
            method.setAccessible(true);
            method2 = Typeface.class.getDeclaredMethod("nativeCreateWeightAlias", cls, cls2);
            method2.setAccessible(true);
            constructor = Typeface.class.getDeclaredConstructor(cls);
            constructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e) {
            Log.e("WeightTypeface", e.getClass().getName(), e);
            field = null;
            constructor = null;
            method = null;
            method2 = null;
        }
        sNativeInstance = field;
        sNativeCreateFromTypeface = method;
        sNativeCreateWeightAlias = method2;
        sConstructor = constructor;
        sWeightTypefaceCache = new LongSparseArray(3);
        sWeightCacheLock = new Object();
    }

    private static boolean isPrivateApiAvailable() {
        return sNativeInstance != null;
    }

    static Typeface createWeightStyle(Typeface typeface, int i, boolean z) {
        Typeface create;
        if (!isPrivateApiAvailable()) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (sWeightCacheLock) {
            try {
                long nativeInstance = getNativeInstance(typeface);
                LongSparseArray longSparseArray = sWeightTypefaceCache;
                SparseArray sparseArray = (SparseArray) longSparseArray.get(nativeInstance);
                if (sparseArray == null) {
                    sparseArray = new SparseArray(4);
                    longSparseArray.put(nativeInstance, sparseArray);
                } else {
                    Typeface typeface2 = (Typeface) sparseArray.get(i2);
                    if (typeface2 != null) {
                        return typeface2;
                    }
                }
                if (z == typeface.isItalic()) {
                    create = create(nativeCreateWeightAlias(nativeInstance, i));
                } else {
                    create = create(nativeCreateFromTypefaceWithExactStyle(nativeInstance, i, z));
                }
                sparseArray.put(i2, create);
                return create;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static long getNativeInstance(Typeface typeface) {
        try {
            return sNativeInstance.getLong(typeface);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static long nativeCreateFromTypefaceWithExactStyle(long j, int i, boolean z) {
        try {
            Long l = (Long) sNativeCreateFromTypeface.invoke(null, Long.valueOf(j), Integer.valueOf(z ? 2 : 0));
            l.longValue();
            return ((Long) sNativeCreateWeightAlias.invoke(null, l, Integer.valueOf(i))).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static long nativeCreateWeightAlias(long j, int i) {
        try {
            return ((Long) sNativeCreateWeightAlias.invoke(null, Long.valueOf(j), Integer.valueOf(i))).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Typeface create(long j) {
        try {
            return (Typeface) sConstructor.newInstance(Long.valueOf(j));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }
}

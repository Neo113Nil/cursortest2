package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.d;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import z.g;

/* loaded from: classes.dex */
class e extends i {

    /* renamed from: b, reason: collision with root package name */
    private static final Class f11803b;

    /* renamed from: c, reason: collision with root package name */
    private static final Constructor f11804c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f11805d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f11806e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi24Impl", e4.getClass().getName(), e4);
            cls = null;
            method = null;
            method2 = null;
        }
        f11804c = constructor;
        f11803b = cls;
        f11805d = method2;
        f11806e = method;
    }

    e() {
    }

    private static boolean h(Object obj, ByteBuffer byteBuffer, int i4, int i5, boolean z4) {
        try {
            return ((Boolean) f11805d.invoke(obj, byteBuffer, Integer.valueOf(i4), null, Integer.valueOf(i5), Boolean.valueOf(z4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f11803b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f11806e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean j() {
        Method method = f11805d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object k() {
        try {
            return f11804c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.i
    public Typeface a(Context context, d.c cVar, Resources resources, int i4) {
        Object k4 = k();
        if (k4 == null) {
            return null;
        }
        for (d.C0093d c0093d : cVar.a()) {
            ByteBuffer b4 = j.b(context, resources, c0093d.b());
            if (b4 == null || !h(k4, b4, c0093d.c(), c0093d.e(), c0093d.f())) {
                return null;
            }
        }
        return i(k4);
    }

    @Override // androidx.core.graphics.i
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i4) {
        Object k4 = k();
        if (k4 == null) {
            return null;
        }
        androidx.collection.g gVar = new androidx.collection.g();
        for (g.b bVar : bVarArr) {
            Uri d4 = bVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(d4);
            if (byteBuffer == null) {
                byteBuffer = j.f(context, cancellationSignal, d4);
                gVar.put(d4, byteBuffer);
            }
            if (byteBuffer == null || !h(k4, byteBuffer, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface i5 = i(k4);
        if (i5 == null) {
            return null;
        }
        return Typeface.create(i5, i4);
    }
}

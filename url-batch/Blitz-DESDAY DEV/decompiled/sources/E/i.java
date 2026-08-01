package E;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import z1.l;

/* loaded from: classes.dex */
public class i extends z1.d {

    /* renamed from: l, reason: collision with root package name */
    public static Class f173l = null;

    /* renamed from: m, reason: collision with root package name */
    public static Constructor f174m = null;

    /* renamed from: n, reason: collision with root package name */
    public static Method f175n = null;

    /* renamed from: o, reason: collision with root package name */
    public static Method f176o = null;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f177p = false;

    /* renamed from: e, reason: collision with root package name */
    public final Class f178e;

    /* renamed from: f, reason: collision with root package name */
    public final Constructor f179f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f180g;
    public final Method h;
    public final Method i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f181j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f182k;

    public i() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = o0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = p0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e2.getClass().getName()), e2);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f178e = cls;
        this.f179f = constructor;
        this.f180g = method2;
        this.h = method3;
        this.i = method4;
        this.f181j = method5;
        this.f182k = method;
    }

    public static boolean i0(Object obj, String str, int i, boolean z2) {
        l0();
        try {
            return ((Boolean) f175n.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void l0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f177p) {
            return;
        }
        f177p = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f174m = constructor;
        f173l = cls;
        f175n = method2;
        f176o = method;
    }

    public static Method o0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void g0(Object obj) {
        try {
            this.f181j.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean h0(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f180g.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f178e, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f182k.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // z1.d
    public final Typeface k(Context context, D.g gVar, Resources resources, int i) {
        if (m0()) {
            Object n02 = n0();
            if (n02 == null) {
                return null;
            }
            for (D.h hVar : gVar.f123a) {
                if (!h0(context, n02, hVar.f124a, hVar.f127e, hVar.f125b, hVar.f126c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(hVar.d))) {
                    g0(n02);
                    return null;
                }
            }
            if (k0(n02)) {
                return j0(n02);
            }
            return null;
        }
        l0();
        try {
            Object newInstance = f174m.newInstance(null);
            for (D.h hVar2 : gVar.f123a) {
                File Q2 = l.Q(context);
                if (Q2 == null) {
                    return null;
                }
                try {
                    if (l.x(Q2, resources, hVar2.f128f) && i0(newInstance, Q2.getPath(), hVar2.f125b, hVar2.f126c)) {
                        Q2.delete();
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    Q2.delete();
                    throw th;
                }
                Q2.delete();
                return null;
            }
            l0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f173l, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f176o.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final boolean k0(Object obj) {
        try {
            return ((Boolean) this.i.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // z1.d
    public final Typeface l(Context context, J.j[] jVarArr, int i) {
        Typeface j02;
        boolean z2;
        if (jVarArr.length < 1) {
            return null;
        }
        if (!m0()) {
            J.j q2 = q(i, jVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(q2.f375a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(q2.f377c).setItalic(q2.d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (J.j jVar : jVarArr) {
            if (jVar.f378e == 0) {
                Uri uri = jVar.f375a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, l.b0(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object n02 = n0();
        if (n02 == null) {
            return null;
        }
        int length = jVarArr.length;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < length) {
            J.j jVar2 = jVarArr[i2];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(jVar2.f375a);
            if (byteBuffer != null) {
                try {
                    z2 = ((Boolean) this.h.invoke(n02, byteBuffer, Integer.valueOf(jVar2.f376b), null, Integer.valueOf(jVar2.f377c), Integer.valueOf(jVar2.d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    g0(n02);
                    return null;
                }
                z3 = true;
            }
            i2++;
            z3 = z3;
        }
        if (!z3) {
            g0(n02);
            return null;
        }
        if (k0(n02) && (j02 = j0(n02)) != null) {
            return Typeface.create(j02, i);
        }
        return null;
    }

    @Override // z1.d
    public final Typeface m(Context context, Resources resources, int i, String str, int i2) {
        if (!m0()) {
            return super.m(context, resources, i, str, i2);
        }
        Object n02 = n0();
        if (n02 == null) {
            return null;
        }
        if (!h0(context, n02, str, 0, -1, -1, null)) {
            g0(n02);
            return null;
        }
        if (k0(n02)) {
            return j0(n02);
        }
        return null;
    }

    public final boolean m0() {
        Method method = this.f180g;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object n0() {
        try {
            return this.f179f.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method p0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}

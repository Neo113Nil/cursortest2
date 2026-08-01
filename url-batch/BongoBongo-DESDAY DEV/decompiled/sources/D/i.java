package D;

import A1.m;
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

/* loaded from: classes.dex */
public class i extends m {

    /* renamed from: h, reason: collision with root package name */
    public static Class f125h = null;
    public static Constructor i = null;

    /* renamed from: j, reason: collision with root package name */
    public static Method f126j = null;

    /* renamed from: k, reason: collision with root package name */
    public static Method f127k = null;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f128l = false;

    /* renamed from: a, reason: collision with root package name */
    public final Class f129a;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f130b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f131c;
    public final Method d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f132e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f133f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f134g;

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
            method2 = y0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = z0(cls2);
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
        this.f129a = cls;
        this.f130b = constructor;
        this.f131c = method2;
        this.d = method3;
        this.f132e = method4;
        this.f133f = method5;
        this.f134g = method;
    }

    public static boolean s0(Object obj, String str, int i2, boolean z2) {
        v0();
        try {
            return ((Boolean) f126j.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void v0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f128l) {
            return;
        }
        f128l = true;
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
        i = constructor;
        f125h = cls;
        f126j = method2;
        f127k = method;
    }

    public static Method y0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // A1.m
    public final Typeface n(Context context, C.g gVar, Resources resources, int i2) {
        if (w0()) {
            Object x02 = x0();
            if (x02 == null) {
                return null;
            }
            for (C.h hVar : gVar.f76a) {
                if (!r0(context, x02, hVar.f77a, hVar.f80e, hVar.f78b, hVar.f79c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(hVar.d))) {
                    q0(x02);
                    return null;
                }
            }
            if (u0(x02)) {
                return t0(x02);
            }
            return null;
        }
        v0();
        try {
            Object newInstance = i.newInstance(null);
            for (C.h hVar2 : gVar.f76a) {
                File K2 = A1.d.K(context);
                if (K2 == null) {
                    return null;
                }
                try {
                    if (A1.d.t(K2, resources, hVar2.f81f) && s0(newInstance, K2.getPath(), hVar2.f78b, hVar2.f79c)) {
                        K2.delete();
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    K2.delete();
                    throw th;
                }
                K2.delete();
                return null;
            }
            v0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f125h, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f127k.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // A1.m
    public final Typeface o(Context context, I.j[] jVarArr, int i2) {
        Typeface t02;
        boolean z2;
        if (jVarArr.length < 1) {
            return null;
        }
        if (!w0()) {
            I.j q2 = q(i2, jVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(q2.f337a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(q2.f339c).setItalic(q2.d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (I.j jVar : jVarArr) {
            if (jVar.f340e == 0) {
                Uri uri = jVar.f337a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, A1.d.X(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object x02 = x0();
        if (x02 == null) {
            return null;
        }
        int length = jVarArr.length;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < length) {
            I.j jVar2 = jVarArr[i3];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(jVar2.f337a);
            if (byteBuffer != null) {
                try {
                    z2 = ((Boolean) this.d.invoke(x02, byteBuffer, Integer.valueOf(jVar2.f338b), null, Integer.valueOf(jVar2.f339c), Integer.valueOf(jVar2.d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    q0(x02);
                    return null;
                }
                z3 = true;
            }
            i3++;
            z3 = z3;
        }
        if (!z3) {
            q0(x02);
            return null;
        }
        if (u0(x02) && (t02 = t0(x02)) != null) {
            return Typeface.create(t02, i2);
        }
        return null;
    }

    @Override // A1.m
    public final Typeface p(Context context, Resources resources, int i2, String str, int i3) {
        if (!w0()) {
            return super.p(context, resources, i2, str, i3);
        }
        Object x02 = x0();
        if (x02 == null) {
            return null;
        }
        if (!r0(context, x02, str, 0, -1, -1, null)) {
            q0(x02);
            return null;
        }
        if (u0(x02)) {
            return t0(x02);
        }
        return null;
    }

    public final void q0(Object obj) {
        try {
            this.f133f.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean r0(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f131c.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface t0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f129a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f134g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean u0(Object obj) {
        try {
            return ((Boolean) this.f132e.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean w0() {
        Method method = this.f131c;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object x0() {
        try {
            return this.f130b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method z0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}

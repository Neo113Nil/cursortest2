package C;

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
import x1.l;

/* loaded from: classes.dex */
public class i extends l {
    public static Class h = null;
    public static Constructor i = null;

    /* renamed from: j, reason: collision with root package name */
    public static Method f70j = null;

    /* renamed from: k, reason: collision with root package name */
    public static Method f71k = null;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f72l = false;

    /* renamed from: a, reason: collision with root package name */
    public final Class f73a;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f74b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f75c;
    public final Method d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f76e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f77f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f78g;

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
            method2 = t0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = u0(cls2);
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
        this.f73a = cls;
        this.f74b = constructor;
        this.f75c = method2;
        this.d = method3;
        this.f76e = method4;
        this.f77f = method5;
        this.f78g = method;
    }

    public static boolean n0(Object obj, String str, int i2, boolean z2) {
        q0();
        try {
            return ((Boolean) f70j.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void q0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f72l) {
            return;
        }
        f72l = true;
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
        h = cls;
        f70j = method2;
        f71k = method;
    }

    public static Method t0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void l0(Object obj) {
        try {
            this.f77f.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean m0(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f75c.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface o0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f73a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f78g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean p0(Object obj) {
        try {
            return ((Boolean) this.f76e.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean r0() {
        Method method = this.f75c;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    @Override // x1.l
    public final Typeface s(Context context, B.g gVar, Resources resources, int i2) {
        if (r0()) {
            Object s02 = s0();
            if (s02 == null) {
                return null;
            }
            for (B.h hVar : gVar.f15a) {
                if (!m0(context, s02, hVar.f16a, hVar.f19e, hVar.f17b, hVar.f18c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(hVar.d))) {
                    l0(s02);
                    return null;
                }
            }
            if (p0(s02)) {
                return o0(s02);
            }
            return null;
        }
        q0();
        try {
            Object newInstance = i.newInstance(null);
            for (B.h hVar2 : gVar.f15a) {
                File D2 = x1.d.D(context);
                if (D2 == null) {
                    return null;
                }
                try {
                    if (x1.d.r(D2, resources, hVar2.f20f) && n0(newInstance, D2.getPath(), hVar2.f17b, hVar2.f18c)) {
                        D2.delete();
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    D2.delete();
                    throw th;
                }
                D2.delete();
                return null;
            }
            q0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) h, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f71k.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final Object s0() {
        try {
            return this.f74b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // x1.l
    public final Typeface t(Context context, H.k[] kVarArr, int i2) {
        Typeface o02;
        boolean z2;
        if (kVarArr.length < 1) {
            return null;
        }
        if (!r0()) {
            H.k v2 = v(i2, kVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(v2.f275a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(v2.f277c).setItalic(v2.d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (H.k kVar : kVarArr) {
            if (kVar.f278e == 0) {
                Uri uri = kVar.f275a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, x1.d.L(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object s02 = s0();
        if (s02 == null) {
            return null;
        }
        int length = kVarArr.length;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < length) {
            H.k kVar2 = kVarArr[i3];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(kVar2.f275a);
            if (byteBuffer != null) {
                try {
                    z2 = ((Boolean) this.d.invoke(s02, byteBuffer, Integer.valueOf(kVar2.f276b), null, Integer.valueOf(kVar2.f277c), Integer.valueOf(kVar2.d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    l0(s02);
                    return null;
                }
                z3 = true;
            }
            i3++;
            z3 = z3;
        }
        if (!z3) {
            l0(s02);
            return null;
        }
        if (p0(s02) && (o02 = o0(s02)) != null) {
            return Typeface.create(o02, i2);
        }
        return null;
    }

    @Override // x1.l
    public final Typeface u(Context context, Resources resources, int i2, String str, int i3) {
        if (!r0()) {
            return super.u(context, resources, i2, str, i3);
        }
        Object s02 = s0();
        if (s02 == null) {
            return null;
        }
        if (!m0(context, s02, str, 0, -1, -1, null)) {
            l0(s02);
            return null;
        }
        if (p0(s02)) {
            return o0(s02);
        }
        return null;
    }

    public Method u0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}

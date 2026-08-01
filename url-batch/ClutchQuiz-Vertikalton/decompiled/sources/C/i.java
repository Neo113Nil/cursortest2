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

/* loaded from: classes.dex */
public class i extends A.c {

    /* renamed from: l, reason: collision with root package name */
    public static Class f102l = null;

    /* renamed from: m, reason: collision with root package name */
    public static Constructor f103m = null;

    /* renamed from: n, reason: collision with root package name */
    public static Method f104n = null;

    /* renamed from: o, reason: collision with root package name */
    public static Method f105o = null;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f106p = false;

    /* renamed from: e, reason: collision with root package name */
    public final Class f107e;

    /* renamed from: f, reason: collision with root package name */
    public final Constructor f108f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f109g;
    public final Method h;
    public final Method i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f110j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f111k;

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
            method2 = U0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = V0(cls2);
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
        this.f107e = cls;
        this.f108f = constructor;
        this.f109g = method2;
        this.h = method3;
        this.i = method4;
        this.f110j = method5;
        this.f111k = method;
    }

    public static boolean O0(Object obj, String str, int i, boolean z2) {
        R0();
        try {
            return ((Boolean) f104n.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void R0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f106p) {
            return;
        }
        f106p = true;
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
        f103m = constructor;
        f102l = cls;
        f104n = method2;
        f105o = method;
    }

    public static Method U0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void M0(Object obj) {
        try {
            this.f110j.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean N0(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f109g.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface P0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f107e, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f111k.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean Q0(Object obj) {
        try {
            return ((Boolean) this.i.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean S0() {
        Method method = this.f109g;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object T0() {
        try {
            return this.f108f.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method V0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // A.c
    public final Typeface v(Context context, B.g gVar, Resources resources, int i) {
        if (S0()) {
            Object T02 = T0();
            if (T02 == null) {
                return null;
            }
            for (B.h hVar : gVar.f46a) {
                if (!N0(context, T02, hVar.f47a, hVar.f50e, hVar.f48b, hVar.f49c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(hVar.d))) {
                    M0(T02);
                    return null;
                }
            }
            if (Q0(T02)) {
                return P0(T02);
            }
            return null;
        }
        R0();
        try {
            Object newInstance = f103m.newInstance(null);
            for (B.h hVar2 : gVar.f46a) {
                File U2 = A.c.U(context);
                if (U2 == null) {
                    return null;
                }
                try {
                    if (A.c.s(U2, resources, hVar2.f51f) && O0(newInstance, U2.getPath(), hVar2.f48b, hVar2.f49c)) {
                        U2.delete();
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    U2.delete();
                    throw th;
                }
                U2.delete();
                return null;
            }
            R0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f102l, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f105o.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // A.c
    public final Typeface w(Context context, H.k[] kVarArr, int i) {
        Typeface P02;
        boolean z2;
        if (kVarArr.length < 1) {
            return null;
        }
        if (!S0()) {
            H.k C2 = C(i, kVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(C2.f237a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(C2.f239c).setItalic(C2.d).build();
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
            if (kVar.f240e == 0) {
                Uri uri = kVar.f237a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, A.c.l0(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object T02 = T0();
        if (T02 == null) {
            return null;
        }
        int length = kVarArr.length;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < length) {
            H.k kVar2 = kVarArr[i2];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(kVar2.f237a);
            if (byteBuffer != null) {
                try {
                    z2 = ((Boolean) this.h.invoke(T02, byteBuffer, Integer.valueOf(kVar2.f238b), null, Integer.valueOf(kVar2.f239c), Integer.valueOf(kVar2.d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    M0(T02);
                    return null;
                }
                z3 = true;
            }
            i2++;
            z3 = z3;
        }
        if (!z3) {
            M0(T02);
            return null;
        }
        if (Q0(T02) && (P02 = P0(T02)) != null) {
            return Typeface.create(P02, i);
        }
        return null;
    }

    @Override // A.c
    public final Typeface x(Context context, Resources resources, int i, String str, int i2) {
        if (!S0()) {
            return super.x(context, resources, i, str, i2);
        }
        Object T02 = T0();
        if (T02 == null) {
            return null;
        }
        if (!N0(context, T02, str, 0, -1, -1, null)) {
            M0(T02);
            return null;
        }
        if (Q0(T02)) {
            return P0(T02);
        }
        return null;
    }
}

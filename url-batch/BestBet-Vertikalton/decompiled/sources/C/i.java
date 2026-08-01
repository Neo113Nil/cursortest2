package C;

import H1.l;
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
public class i extends H1.d {

    /* renamed from: l, reason: collision with root package name */
    public static Class f76l = null;

    /* renamed from: m, reason: collision with root package name */
    public static Constructor f77m = null;

    /* renamed from: n, reason: collision with root package name */
    public static Method f78n = null;

    /* renamed from: o, reason: collision with root package name */
    public static Method f79o = null;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f80p = false;

    /* renamed from: e, reason: collision with root package name */
    public final Class f81e;

    /* renamed from: f, reason: collision with root package name */
    public final Constructor f82f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f83g;
    public final Method h;
    public final Method i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f84j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f85k;

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
            method2 = G0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = H0(cls2);
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
        this.f81e = cls;
        this.f82f = constructor;
        this.f83g = method2;
        this.h = method3;
        this.i = method4;
        this.f84j = method5;
        this.f85k = method;
    }

    public static boolean A0(Object obj, String str, int i, boolean z2) {
        D0();
        try {
            return ((Boolean) f78n.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void D0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f80p) {
            return;
        }
        f80p = true;
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
        f77m = constructor;
        f76l = cls;
        f78n = method2;
        f79o = method;
    }

    public static Method G0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Typeface B0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f81e, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f85k.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean C0(Object obj) {
        try {
            return ((Boolean) this.i.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean E0() {
        Method method = this.f83g;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object F0() {
        try {
            return this.f82f.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method H0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // H1.d
    public final Typeface r(Context context, B.g gVar, Resources resources, int i) {
        if (E0()) {
            Object F02 = F0();
            if (F02 == null) {
                return null;
            }
            for (B.h hVar : gVar.f34a) {
                if (!z0(context, F02, hVar.f35a, hVar.f38e, hVar.f36b, hVar.f37c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(hVar.d))) {
                    y0(F02);
                    return null;
                }
            }
            if (C0(F02)) {
                return B0(F02);
            }
            return null;
        }
        D0();
        try {
            Object newInstance = f77m.newInstance(null);
            for (B.h hVar2 : gVar.f34a) {
                File J2 = l.J(context);
                if (J2 == null) {
                    return null;
                }
                try {
                    if (l.s(J2, resources, hVar2.f39f) && A0(newInstance, J2.getPath(), hVar2.f36b, hVar2.f37c)) {
                        J2.delete();
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    J2.delete();
                    throw th;
                }
                J2.delete();
                return null;
            }
            D0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f76l, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f79o.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // H1.d
    public final Typeface s(Context context, H.j[] jVarArr, int i) {
        Typeface B02;
        boolean z2;
        if (jVarArr.length < 1) {
            return null;
        }
        if (!E0()) {
            H.j x2 = x(i, jVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(x2.f497a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(x2.f499c).setItalic(x2.d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (H.j jVar : jVarArr) {
            if (jVar.f500e == 0) {
                Uri uri = jVar.f497a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, l.U(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object F02 = F0();
        if (F02 == null) {
            return null;
        }
        int length = jVarArr.length;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < length) {
            H.j jVar2 = jVarArr[i2];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(jVar2.f497a);
            if (byteBuffer != null) {
                try {
                    z2 = ((Boolean) this.h.invoke(F02, byteBuffer, Integer.valueOf(jVar2.f498b), null, Integer.valueOf(jVar2.f499c), Integer.valueOf(jVar2.d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    y0(F02);
                    return null;
                }
                z3 = true;
            }
            i2++;
            z3 = z3;
        }
        if (!z3) {
            y0(F02);
            return null;
        }
        if (C0(F02) && (B02 = B0(F02)) != null) {
            return Typeface.create(B02, i);
        }
        return null;
    }

    @Override // H1.d
    public final Typeface t(Context context, Resources resources, int i, String str, int i2) {
        if (!E0()) {
            return super.t(context, resources, i, str, i2);
        }
        Object F02 = F0();
        if (F02 == null) {
            return null;
        }
        if (!z0(context, F02, str, 0, -1, -1, null)) {
            y0(F02);
            return null;
        }
        if (C0(F02)) {
            return B0(F02);
        }
        return null;
    }

    public final void y0(Object obj) {
        try {
            this.f84j.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean z0(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f83g.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}

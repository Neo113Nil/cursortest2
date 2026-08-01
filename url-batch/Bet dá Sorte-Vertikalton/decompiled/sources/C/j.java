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
public class j extends u1.l {

    /* renamed from: l, reason: collision with root package name */
    public static Class f153l = null;

    /* renamed from: m, reason: collision with root package name */
    public static Constructor f154m = null;

    /* renamed from: n, reason: collision with root package name */
    public static Method f155n = null;

    /* renamed from: o, reason: collision with root package name */
    public static Method f156o = null;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f157p = false;

    /* renamed from: e, reason: collision with root package name */
    public final Class f158e;

    /* renamed from: f, reason: collision with root package name */
    public final Constructor f159f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f160g;
    public final Method h;
    public final Method i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f161j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f162k;

    public j() {
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
            method2 = z0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = A0(cls2);
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
        this.f158e = cls;
        this.f159f = constructor;
        this.f160g = method2;
        this.h = method3;
        this.i = method4;
        this.f161j = method5;
        this.f162k = method;
    }

    public static boolean t0(Object obj, String str, int i, boolean z2) {
        w0();
        try {
            return ((Boolean) f155n.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void w0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f157p) {
            return;
        }
        f157p = true;
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
        f154m = constructor;
        f153l = cls;
        f155n = method2;
        f156o = method;
    }

    public static Method z0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method A0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // u1.l
    public final Typeface n(Context context, B.g gVar, Resources resources, int i) {
        if (x0()) {
            Object y02 = y0();
            if (y02 == null) {
                return null;
            }
            for (B.h hVar : gVar.f43a) {
                if (!s0(context, y02, hVar.f44a, hVar.f47e, hVar.f45b, hVar.f46c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(hVar.d))) {
                    r0(y02);
                    return null;
                }
            }
            if (v0(y02)) {
                return u0(y02);
            }
            return null;
        }
        w0();
        try {
            Object newInstance = f154m.newInstance(null);
            for (B.h hVar2 : gVar.f43a) {
                File H2 = u1.d.H(context);
                if (H2 == null) {
                    return null;
                }
                try {
                    if (u1.d.t(H2, resources, hVar2.f48f) && t0(newInstance, H2.getPath(), hVar2.f45b, hVar2.f46c)) {
                        H2.delete();
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    H2.delete();
                    throw th;
                }
                H2.delete();
                return null;
            }
            w0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f153l, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f156o.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // u1.l
    public final Typeface o(Context context, H.k[] kVarArr, int i) {
        Typeface u02;
        boolean z2;
        if (kVarArr.length < 1) {
            return null;
        }
        if (!x0()) {
            H.k s2 = s(i, kVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(s2.f291a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(s2.f293c).setItalic(s2.d).build();
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
            if (kVar.f294e == 0) {
                Uri uri = kVar.f291a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, u1.d.R(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object y02 = y0();
        if (y02 == null) {
            return null;
        }
        int length = kVarArr.length;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < length) {
            H.k kVar2 = kVarArr[i2];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(kVar2.f291a);
            if (byteBuffer != null) {
                try {
                    z2 = ((Boolean) this.h.invoke(y02, byteBuffer, Integer.valueOf(kVar2.f292b), null, Integer.valueOf(kVar2.f293c), Integer.valueOf(kVar2.d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    r0(y02);
                    return null;
                }
                z3 = true;
            }
            i2++;
            z3 = z3;
        }
        if (!z3) {
            r0(y02);
            return null;
        }
        if (v0(y02) && (u02 = u0(y02)) != null) {
            return Typeface.create(u02, i);
        }
        return null;
    }

    @Override // u1.l
    public final Typeface p(Context context, Resources resources, int i, String str, int i2) {
        if (!x0()) {
            return super.p(context, resources, i, str, i2);
        }
        Object y02 = y0();
        if (y02 == null) {
            return null;
        }
        if (!s0(context, y02, str, 0, -1, -1, null)) {
            r0(y02);
            return null;
        }
        if (v0(y02)) {
            return u0(y02);
        }
        return null;
    }

    public final void r0(Object obj) {
        try {
            this.f161j.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean s0(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f160g.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface u0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f158e, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f162k.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean v0(Object obj) {
        try {
            return ((Boolean) this.i.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean x0() {
        Method method = this.f160g;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object y0() {
        try {
            return this.f159f.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }
}

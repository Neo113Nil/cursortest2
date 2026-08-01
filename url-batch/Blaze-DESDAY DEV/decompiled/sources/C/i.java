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
import z1.l;

/* loaded from: classes.dex */
public class i extends z1.d {
    public static Class h = null;
    public static Constructor i = null;

    /* renamed from: j, reason: collision with root package name */
    public static Method f83j = null;

    /* renamed from: k, reason: collision with root package name */
    public static Method f84k = null;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f85l = false;

    /* renamed from: a, reason: collision with root package name */
    public final Class f86a;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f87b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f88c;
    public final Method d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f89e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f90f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f91g;

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
            method2 = D0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = E0(cls2);
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
        this.f86a = cls;
        this.f87b = constructor;
        this.f88c = method2;
        this.d = method3;
        this.f89e = method4;
        this.f90f = method5;
        this.f91g = method;
    }

    public static void A0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f85l) {
            return;
        }
        f85l = true;
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
        f83j = method2;
        f84k = method;
    }

    public static Method D0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static boolean x0(Object obj, String str, int i2, boolean z2) {
        A0();
        try {
            return ((Boolean) f83j.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // z1.d
    public final Typeface A(Context context, Resources resources, int i2, String str, int i3) {
        if (!B0()) {
            return super.A(context, resources, i2, str, i3);
        }
        Object C02 = C0();
        if (C02 == null) {
            return null;
        }
        if (!w0(context, C02, str, 0, -1, -1, null)) {
            v0(C02);
            return null;
        }
        if (z0(C02)) {
            return y0(C02);
        }
        return null;
    }

    public final boolean B0() {
        Method method = this.f88c;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object C0() {
        try {
            return this.f87b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method E0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public final void v0(Object obj) {
        try {
            this.f90f.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean w0(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f88c.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // z1.d
    public final Typeface y(Context context, B.g gVar, Resources resources, int i2) {
        if (B0()) {
            Object C02 = C0();
            if (C02 == null) {
                return null;
            }
            for (B.h hVar : gVar.f35a) {
                if (!w0(context, C02, hVar.f36a, hVar.f39e, hVar.f37b, hVar.f38c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(hVar.d))) {
                    v0(C02);
                    return null;
                }
            }
            if (z0(C02)) {
                return y0(C02);
            }
            return null;
        }
        A0();
        try {
            Object newInstance = i.newInstance(null);
            for (B.h hVar2 : gVar.f35a) {
                File A2 = l.A(context);
                if (A2 == null) {
                    return null;
                }
                try {
                    if (l.m(A2, resources, hVar2.f40f) && x0(newInstance, A2.getPath(), hVar2.f37b, hVar2.f38c)) {
                        A2.delete();
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    A2.delete();
                    throw th;
                }
                A2.delete();
                return null;
            }
            A0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) h, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f84k.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public Typeface y0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f86a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f91g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // z1.d
    public final Typeface z(Context context, H.k[] kVarArr, int i2) {
        Typeface y02;
        boolean z2;
        if (kVarArr.length < 1) {
            return null;
        }
        if (!B0()) {
            H.k B2 = B(i2, kVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(B2.f294a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(B2.f296c).setItalic(B2.d).build();
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
            if (kVar.f297e == 0) {
                Uri uri = kVar.f294a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, l.H(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object C02 = C0();
        if (C02 == null) {
            return null;
        }
        int length = kVarArr.length;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < length) {
            H.k kVar2 = kVarArr[i3];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(kVar2.f294a);
            if (byteBuffer != null) {
                try {
                    z2 = ((Boolean) this.d.invoke(C02, byteBuffer, Integer.valueOf(kVar2.f295b), null, Integer.valueOf(kVar2.f296c), Integer.valueOf(kVar2.d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    v0(C02);
                    return null;
                }
                z3 = true;
            }
            i3++;
            z3 = z3;
        }
        if (!z3) {
            v0(C02);
            return null;
        }
        if (z0(C02) && (y02 = y0(C02)) != null) {
            return Typeface.create(y02, i2);
        }
        return null;
    }

    public final boolean z0(Object obj) {
        try {
            return ((Boolean) this.f89e.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}

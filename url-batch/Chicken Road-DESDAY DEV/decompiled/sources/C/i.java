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
import u1.l;

/* loaded from: classes.dex */
public class i extends u1.d {
    public static Class h = null;
    public static Constructor i = null;

    /* renamed from: j, reason: collision with root package name */
    public static Method f69j = null;

    /* renamed from: k, reason: collision with root package name */
    public static Method f70k = null;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f71l = false;

    /* renamed from: a, reason: collision with root package name */
    public final Class f72a;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f73b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f74c;
    public final Method d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f75e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f76f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f77g;

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
            method2 = C0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = D0(cls2);
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
        this.f72a = cls;
        this.f73b = constructor;
        this.f74c = method2;
        this.d = method3;
        this.f75e = method4;
        this.f76f = method5;
        this.f77g = method;
    }

    public static Method C0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static boolean w0(Object obj, String str, int i2, boolean z2) {
        z0();
        try {
            return ((Boolean) f69j.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void z0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f71l) {
            return;
        }
        f71l = true;
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
        f69j = method2;
        f70k = method;
    }

    public final boolean A0() {
        Method method = this.f74c;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object B0() {
        try {
            return this.f73b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method D0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public final void u0(Object obj) {
        try {
            this.f76f.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean v0(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f74c.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // u1.d
    public final Typeface w(Context context, B.g gVar, Resources resources, int i2) {
        if (A0()) {
            Object B02 = B0();
            if (B02 == null) {
                return null;
            }
            for (B.h hVar : gVar.f17a) {
                if (!v0(context, B02, hVar.f18a, hVar.f21e, hVar.f19b, hVar.f20c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(hVar.d))) {
                    u0(B02);
                    return null;
                }
            }
            if (y0(B02)) {
                return x0(B02);
            }
            return null;
        }
        z0();
        try {
            Object newInstance = i.newInstance(null);
            for (B.h hVar2 : gVar.f17a) {
                File B2 = l.B(context);
                if (B2 == null) {
                    return null;
                }
                try {
                    if (l.p(B2, resources, hVar2.f22f) && w0(newInstance, B2.getPath(), hVar2.f19b, hVar2.f20c)) {
                        B2.delete();
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    B2.delete();
                    throw th;
                }
                B2.delete();
                return null;
            }
            z0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) h, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f70k.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // u1.d
    public final Typeface x(Context context, H.k[] kVarArr, int i2) {
        Typeface x02;
        boolean z2;
        if (kVarArr.length < 1) {
            return null;
        }
        if (!A0()) {
            H.k A2 = A(i2, kVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(A2.f222a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(A2.f224c).setItalic(A2.d).build();
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
            if (kVar.f225e == 0) {
                Uri uri = kVar.f222a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, l.J(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object B02 = B0();
        if (B02 == null) {
            return null;
        }
        int length = kVarArr.length;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < length) {
            H.k kVar2 = kVarArr[i3];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(kVar2.f222a);
            if (byteBuffer != null) {
                try {
                    z2 = ((Boolean) this.d.invoke(B02, byteBuffer, Integer.valueOf(kVar2.f223b), null, Integer.valueOf(kVar2.f224c), Integer.valueOf(kVar2.d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    u0(B02);
                    return null;
                }
                z3 = true;
            }
            i3++;
            z3 = z3;
        }
        if (!z3) {
            u0(B02);
            return null;
        }
        if (y0(B02) && (x02 = x0(B02)) != null) {
            return Typeface.create(x02, i2);
        }
        return null;
    }

    public Typeface x0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f72a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f77g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // u1.d
    public final Typeface y(Context context, Resources resources, int i2, String str, int i3) {
        if (!A0()) {
            return super.y(context, resources, i2, str, i3);
        }
        Object B02 = B0();
        if (B02 == null) {
            return null;
        }
        if (!v0(context, B02, str, 0, -1, -1, null)) {
            u0(B02);
            return null;
        }
        if (y0(B02)) {
            return x0(B02);
        }
        return null;
    }

    public final boolean y0(Object obj) {
        try {
            return ((Boolean) this.f75e.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}

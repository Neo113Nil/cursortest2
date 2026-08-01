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
import q1.l;

/* loaded from: classes.dex */
public class i extends l {

    /* renamed from: n, reason: collision with root package name */
    public static Class f166n = null;

    /* renamed from: o, reason: collision with root package name */
    public static Constructor f167o = null;

    /* renamed from: p, reason: collision with root package name */
    public static Method f168p = null;

    /* renamed from: q, reason: collision with root package name */
    public static Method f169q = null;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f170r = false;

    /* renamed from: g, reason: collision with root package name */
    public final Class f171g;
    public final Constructor h;
    public final Method i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f172j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f173k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f174l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f175m;

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
        this.f171g = cls;
        this.h = constructor;
        this.i = method2;
        this.f172j = method3;
        this.f173k = method4;
        this.f174l = method5;
        this.f175m = method;
    }

    public static Method C0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static boolean w0(Object obj, String str, int i, boolean z2) {
        z0();
        try {
            return ((Boolean) f168p.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void z0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f170r) {
            return;
        }
        f170r = true;
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
        f167o = constructor;
        f166n = cls;
        f168p = method2;
        f169q = method;
    }

    public final boolean A0() {
        Method method = this.i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object B0() {
        try {
            return this.h.newInstance(null);
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

    @Override // q1.l
    public final Typeface o(Context context, B.g gVar, Resources resources, int i) {
        if (A0()) {
            Object B02 = B0();
            if (B02 == null) {
                return null;
            }
            for (B.h hVar : gVar.f24a) {
                if (!v0(context, B02, hVar.f25a, hVar.f29e, hVar.f26b, hVar.f27c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(hVar.f28d))) {
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
            Object newInstance = f167o.newInstance(null);
            for (B.h hVar2 : gVar.f24a) {
                File F = q1.d.F(context);
                if (F == null) {
                    return null;
                }
                try {
                    if (q1.d.o(F, resources, hVar2.f30f) && w0(newInstance, F.getPath(), hVar2.f26b, hVar2.f27c)) {
                        F.delete();
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    F.delete();
                    throw th;
                }
                F.delete();
                return null;
            }
            z0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f166n, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f169q.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // q1.l
    public final Typeface p(Context context, H.k[] kVarArr, int i) {
        Typeface x0;
        boolean z2;
        if (kVarArr.length < 1) {
            return null;
        }
        if (!A0()) {
            H.k t2 = t(i, kVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(t2.f242a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(t2.f244c).setItalic(t2.f245d).build();
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
            if (kVar.f246e == 0) {
                Uri uri = kVar.f242a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, q1.d.Q(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object B02 = B0();
        if (B02 == null) {
            return null;
        }
        int length = kVarArr.length;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < length) {
            H.k kVar2 = kVarArr[i2];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(kVar2.f242a);
            if (byteBuffer != null) {
                try {
                    z2 = ((Boolean) this.f172j.invoke(B02, byteBuffer, Integer.valueOf(kVar2.f243b), null, Integer.valueOf(kVar2.f244c), Integer.valueOf(kVar2.f245d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    u0(B02);
                    return null;
                }
                z3 = true;
            }
            i2++;
            z3 = z3;
        }
        if (!z3) {
            u0(B02);
            return null;
        }
        if (y0(B02) && (x0 = x0(B02)) != null) {
            return Typeface.create(x0, i);
        }
        return null;
    }

    @Override // q1.l
    public final Typeface q(Context context, Resources resources, int i, String str, int i2) {
        if (!A0()) {
            return super.q(context, resources, i, str, i2);
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

    public final void u0(Object obj) {
        try {
            this.f174l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean v0(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface x0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f171g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f175m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean y0(Object obj) {
        try {
            return ((Boolean) this.f173k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}

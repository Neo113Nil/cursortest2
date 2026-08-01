package E;

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
public class h extends H1.d {
    public static Class i = null;
    public static Constructor j = null;

    /* renamed from: k, reason: collision with root package name */
    public static Method f288k = null;

    /* renamed from: l, reason: collision with root package name */
    public static Method f289l = null;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f290m = false;

    /* renamed from: b, reason: collision with root package name */
    public final Class f291b;

    /* renamed from: c, reason: collision with root package name */
    public final Constructor f292c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f293d;
    public final Method e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f294f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f295g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f296h;

    public h() {
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
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f291b = cls;
        this.f292c = constructor;
        this.f293d = method2;
        this.e = method3;
        this.f294f = method4;
        this.f295g = method5;
        this.f296h = method;
    }

    public static boolean n0(Object obj, String str, int i2, boolean z2) {
        q0();
        try {
            return ((Boolean) f288k.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void q0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f290m) {
            return;
        }
        f290m = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        j = constructor;
        i = cls;
        f288k = method2;
        f289l = method;
    }

    public static Method t0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void l0(Object obj) {
        try {
            this.f295g.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean m0(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f293d.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface o0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f291b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f296h.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean p0(Object obj) {
        try {
            return ((Boolean) this.f294f.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean r0() {
        Method method = this.f293d;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    @Override // H1.d
    public final Typeface s(Context context, D.g gVar, Resources resources, int i2) {
        if (r0()) {
            Object s0 = s0();
            if (s0 == null) {
                return null;
            }
            for (D.h hVar : gVar.f171a) {
                if (!m0(context, s0, hVar.f172a, hVar.e, hVar.f173b, hVar.f174c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(hVar.f175d))) {
                    l0(s0);
                    return null;
                }
            }
            if (p0(s0)) {
                return o0(s0);
            }
            return null;
        }
        q0();
        try {
            Object newInstance = j.newInstance(null);
            for (D.h hVar2 : gVar.f171a) {
                File z2 = l.z(context);
                if (z2 == null) {
                    return null;
                }
                try {
                    if (l.p(z2, resources, hVar2.f176f) && n0(newInstance, z2.getPath(), hVar2.f173b, hVar2.f174c)) {
                        z2.delete();
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    z2.delete();
                    throw th;
                }
                z2.delete();
                return null;
            }
            q0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) i, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f289l.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final Object s0() {
        try {
            return this.f292c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // H1.d
    public final Typeface t(Context context, J.i[] iVarArr, int i2) {
        Typeface o0;
        boolean z2;
        if (iVarArr.length < 1) {
            return null;
        }
        if (!r0()) {
            J.i y2 = y(i2, iVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(y2.f641a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(y2.f643c).setItalic(y2.f644d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (J.i iVar : iVarArr) {
            if (iVar.e == 0) {
                Uri uri = iVar.f641a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, l.J(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object s0 = s0();
        if (s0 == null) {
            return null;
        }
        int length = iVarArr.length;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < length) {
            J.i iVar2 = iVarArr[i3];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(iVar2.f641a);
            if (byteBuffer != null) {
                try {
                    z2 = ((Boolean) this.e.invoke(s0, byteBuffer, Integer.valueOf(iVar2.f642b), null, Integer.valueOf(iVar2.f643c), Integer.valueOf(iVar2.f644d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    l0(s0);
                    return null;
                }
                z3 = true;
            }
            i3++;
            z3 = z3;
        }
        if (!z3) {
            l0(s0);
            return null;
        }
        if (p0(s0) && (o0 = o0(s0)) != null) {
            return Typeface.create(o0, i2);
        }
        return null;
    }

    @Override // H1.d
    public final Typeface u(Context context, Resources resources, int i2, String str, int i3) {
        if (!r0()) {
            return super.u(context, resources, i2, str, i3);
        }
        Object s0 = s0();
        if (s0 == null) {
            return null;
        }
        if (!m0(context, s0, str, 0, -1, -1, null)) {
            l0(s0);
            return null;
        }
        if (p0(s0)) {
            return o0(s0);
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

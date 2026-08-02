package t;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import s.C0295f;
import s.C0296g;
import u0.AbstractC0310a;
import x.C0329h;

/* loaded from: classes.dex */
public class h extends f {

    /* renamed from: n, reason: collision with root package name */
    public final Class f3454n;

    /* renamed from: o, reason: collision with root package name */
    public final Constructor f3455o;

    /* renamed from: p, reason: collision with root package name */
    public final Method f3456p;

    /* renamed from: q, reason: collision with root package name */
    public final Method f3457q;

    /* renamed from: r, reason: collision with root package name */
    public final Method f3458r;

    /* renamed from: s, reason: collision with root package name */
    public final Method f3459s;

    /* renamed from: t, reason: collision with root package name */
    public final Method f3460t;

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
            method2 = W(cls2);
            Class<?> cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = X(cls2);
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
        this.f3454n = cls;
        this.f3455o = constructor;
        this.f3456p = method2;
        this.f3457q = method3;
        this.f3458r = method4;
        this.f3459s = method5;
        this.f3460t = method;
    }

    public static Method W(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void Q(Object obj) {
        try {
            this.f3459s.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean R(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f3456p.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface S(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f3454n, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3460t.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean T(Object obj) {
        try {
            return ((Boolean) this.f3458r.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean U() {
        Method method = this.f3456p;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object V() {
        try {
            return this.f3455o.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method X(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // t.f, i1.a
    public final Typeface c(Context context, C0295f c0295f, Resources resources, int i2) {
        if (!U()) {
            return super.c(context, c0295f, resources, i2);
        }
        Object V2 = V();
        if (V2 == null) {
            return null;
        }
        for (C0296g c0296g : c0295f.f3405a) {
            if (!R(context, V2, c0296g.f3406a, c0296g.f3410e, c0296g.f3407b, c0296g.f3408c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0296g.f3409d))) {
                Q(V2);
                return null;
            }
        }
        if (T(V2)) {
            return S(V2);
        }
        return null;
    }

    @Override // t.f, i1.a
    public final Typeface d(Context context, C0329h[] c0329hArr, int i2) {
        Typeface S2;
        boolean z2;
        if (c0329hArr.length < 1) {
            return null;
        }
        if (!U()) {
            C0329h l2 = l(c0329hArr, i2);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(l2.f3583a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(l2.f3585c).setItalic(l2.f3586d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (C0329h c0329h : c0329hArr) {
            if (c0329h.f3587e == 0) {
                Uri uri = c0329h.f3583a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, AbstractC0310a.e(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object V2 = V();
        if (V2 == null) {
            return null;
        }
        boolean z3 = false;
        for (C0329h c0329h2 : c0329hArr) {
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(c0329h2.f3583a);
            if (byteBuffer != null) {
                try {
                    z2 = ((Boolean) this.f3457q.invoke(V2, byteBuffer, Integer.valueOf(c0329h2.f3584b), null, Integer.valueOf(c0329h2.f3585c), Integer.valueOf(c0329h2.f3586d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    Q(V2);
                    return null;
                }
                z3 = true;
            }
        }
        if (!z3) {
            Q(V2);
            return null;
        }
        if (T(V2) && (S2 = S(V2)) != null) {
            return Typeface.create(S2, i2);
        }
        return null;
    }

    @Override // i1.a
    public final Typeface f(Context context, Resources resources, int i2, String str, int i3) {
        if (!U()) {
            return super.f(context, resources, i2, str, i3);
        }
        Object V2 = V();
        if (V2 == null) {
            return null;
        }
        if (!R(context, V2, str, 0, -1, -1, null)) {
            Q(V2);
            return null;
        }
        if (T(V2)) {
            return S(V2);
        }
        return null;
    }
}

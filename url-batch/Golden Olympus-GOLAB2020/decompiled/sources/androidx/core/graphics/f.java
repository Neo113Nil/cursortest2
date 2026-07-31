package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.d;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import z.g;

/* loaded from: classes.dex */
public class f extends d {

    /* renamed from: g, reason: collision with root package name */
    protected final Class f11807g;

    /* renamed from: h, reason: collision with root package name */
    protected final Constructor f11808h;

    /* renamed from: i, reason: collision with root package name */
    protected final Method f11809i;

    /* renamed from: j, reason: collision with root package name */
    protected final Method f11810j;

    /* renamed from: k, reason: collision with root package name */
    protected final Method f11811k;

    /* renamed from: l, reason: collision with root package name */
    protected final Method f11812l;

    /* renamed from: m, reason: collision with root package name */
    protected final Method f11813m;

    public f() {
        Class cls;
        Constructor constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = v();
            constructor = w(cls);
            method = s(cls);
            method2 = t(cls);
            method3 = x(cls);
            method4 = r(cls);
            method5 = u(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e4.getClass().getName(), e4);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f11807g = cls;
        this.f11808h = constructor;
        this.f11809i = method;
        this.f11810j = method2;
        this.f11811k = method3;
        this.f11812l = method4;
        this.f11813m = method5;
    }

    private Object l() {
        try {
            return this.f11808h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void m(Object obj) {
        try {
            this.f11812l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean n(Context context, Object obj, String str, int i4, int i5, int i6, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f11809i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(Object obj, ByteBuffer byteBuffer, int i4, int i5, int i6) {
        try {
            return ((Boolean) this.f11810j.invoke(obj, byteBuffer, Integer.valueOf(i4), null, Integer.valueOf(i5), Integer.valueOf(i6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p(Object obj) {
        try {
            return ((Boolean) this.f11811k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean q() {
        if (this.f11809i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f11809i != null;
    }

    @Override // androidx.core.graphics.d, androidx.core.graphics.i
    public Typeface a(Context context, d.c cVar, Resources resources, int i4) {
        if (!q()) {
            return super.a(context, cVar, resources, i4);
        }
        Object l4 = l();
        if (l4 == null) {
            return null;
        }
        d.C0093d[] a4 = cVar.a();
        int length = a4.length;
        int i5 = 0;
        while (i5 < length) {
            d.C0093d c0093d = a4[i5];
            Context context2 = context;
            if (!n(context2, l4, c0093d.a(), c0093d.c(), c0093d.e(), c0093d.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0093d.d()))) {
                m(l4);
                return null;
            }
            i5++;
            context = context2;
        }
        if (p(l4)) {
            return i(l4);
        }
        return null;
    }

    @Override // androidx.core.graphics.d, androidx.core.graphics.i
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i4) {
        Typeface i5;
        Object obj;
        if (bVarArr.length < 1) {
            return null;
        }
        if (q()) {
            Map h4 = j.h(context, bVarArr, cancellationSignal);
            Object l4 = l();
            if (l4 == null) {
                return null;
            }
            int length = bVarArr.length;
            int i6 = 0;
            boolean z4 = false;
            while (i6 < length) {
                g.b bVar = bVarArr[i6];
                ByteBuffer byteBuffer = (ByteBuffer) h4.get(bVar.d());
                if (byteBuffer == null) {
                    obj = l4;
                } else {
                    boolean o4 = o(l4, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0);
                    obj = l4;
                    if (!o4) {
                        m(obj);
                        return null;
                    }
                    z4 = true;
                }
                i6++;
                l4 = obj;
                z4 = z4;
            }
            Object obj2 = l4;
            if (!z4) {
                m(obj2);
                return null;
            }
            if (p(obj2) && (i5 = i(obj2)) != null) {
                return Typeface.create(i5, i4);
            }
            return null;
        }
        g.b g4 = g(bVarArr, i4);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(g4.d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(g4.e()).setItalic(g4.f()).build();
                openFileDescriptor.close();
                return build;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.i
    public Typeface d(Context context, Resources resources, int i4, String str, int i5) {
        if (!q()) {
            return super.d(context, resources, i4, str, i5);
        }
        Object l4 = l();
        if (l4 == null) {
            return null;
        }
        if (!n(context, l4, str, 0, -1, -1, null)) {
            m(l4);
            return null;
        }
        if (p(l4)) {
            return i(l4);
        }
        return null;
    }

    protected Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f11807g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f11813m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method r(Class cls) {
        return cls.getMethod("abortCreation", null);
    }

    protected Method s(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    protected Method t(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method u(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class v() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor w(Class cls) {
        return cls.getConstructor(null);
    }

    protected Method x(Class cls) {
        return cls.getMethod("freeze", null);
    }
}

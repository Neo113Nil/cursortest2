package X0;

import a.AbstractC0235a;
import a1.C0243b;
import android.content.Context;
import android.content.res.AssetManager;
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

/* loaded from: classes.dex */
public class i extends g {

    /* renamed from: g, reason: collision with root package name */
    public final Class f4633g;

    /* renamed from: h, reason: collision with root package name */
    public final Constructor f4634h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f4635i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f4636j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f4637k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f4638l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f4639m;

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
            method2 = z0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = A0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e3.getClass().getName()), e3);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f4633g = cls;
        this.f4634h = constructor;
        this.f4635i = method2;
        this.f4636j = method3;
        this.f4637k = method4;
        this.f4638l = method5;
        this.f4639m = method;
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

    @Override // X0.g, O2.l
    public final Typeface U(Context context, C0243b[] c0243bArr) {
        Object obj;
        boolean z3;
        Typeface y02;
        boolean z4;
        if (c0243bArr.length < 1) {
            return null;
        }
        Method method = this.f4635i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            C0243b a02 = a0(c0243bArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(a02.f4738a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(a02.f4740c).setItalic(a02.f4741d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (C0243b c0243b : c0243bArr) {
            if (c0243b.f4742e == 0) {
                Uri uri = c0243b.f4738a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, AbstractC0235a.E(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        try {
            obj = this.f4634h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        int length = c0243bArr.length;
        int i3 = 0;
        boolean z5 = false;
        while (i3 < length) {
            C0243b c0243b2 = c0243bArr[i3];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(c0243b2.f4738a);
            if (byteBuffer != null) {
                try {
                    z4 = ((Boolean) this.f4636j.invoke(obj, byteBuffer, Integer.valueOf(c0243b2.f4739b), null, Integer.valueOf(c0243b2.f4740c), Integer.valueOf(c0243b2.f4741d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused3) {
                    z4 = false;
                }
                if (!z4) {
                    x0(obj);
                    return null;
                }
                z5 = true;
            }
            i3++;
            z5 = z5;
        }
        if (!z5) {
            x0(obj);
            return null;
        }
        try {
            z3 = ((Boolean) this.f4637k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused4) {
            z3 = false;
        }
        if (z3 && (y02 = y0(obj)) != null) {
            return Typeface.create(y02, 0);
        }
        return null;
    }

    public final void x0(Object obj) {
        try {
            this.f4638l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public Typeface y0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f4633g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f4639m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}

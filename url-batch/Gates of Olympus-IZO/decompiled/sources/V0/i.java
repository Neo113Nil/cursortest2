package V0;

import M1.B;
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

    /* renamed from: b, reason: collision with root package name */
    public final Class f3359b;

    /* renamed from: c, reason: collision with root package name */
    public final Constructor f3360c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f3361d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f3362e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f3363f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f3364g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f3365h;

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
            method2 = b0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = c0(cls2);
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
        this.f3359b = cls;
        this.f3360c = constructor;
        this.f3361d = method2;
        this.f3362e = method3;
        this.f3363f = method4;
        this.f3364g = method5;
        this.f3365h = method;
    }

    public static Method b0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void Z(Object obj) {
        try {
            this.f3364g.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public Typeface a0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f3359b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3365h.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method c0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // V0.g, a.AbstractC0157a
    public final Typeface s(Context context, Y0.b[] bVarArr) {
        Object obj;
        boolean z3;
        Typeface a02;
        boolean z4;
        if (bVarArr.length < 1) {
            return null;
        }
        Method method = this.f3361d;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            Y0.b z5 = z(bVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(z5.f3409a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(z5.f3411c).setItalic(z5.f3412d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (Y0.b bVar : bVarArr) {
            if (bVar.f3413e == 0) {
                Uri uri = bVar.f3409a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, B.J(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        try {
            obj = this.f3360c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        int length = bVarArr.length;
        int i3 = 0;
        boolean z6 = false;
        while (i3 < length) {
            Y0.b bVar2 = bVarArr[i3];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(bVar2.f3409a);
            if (byteBuffer != null) {
                try {
                    z4 = ((Boolean) this.f3362e.invoke(obj, byteBuffer, Integer.valueOf(bVar2.f3410b), null, Integer.valueOf(bVar2.f3411c), Integer.valueOf(bVar2.f3412d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused3) {
                    z4 = false;
                }
                if (!z4) {
                    Z(obj);
                    return null;
                }
                z6 = true;
            }
            i3++;
            z6 = z6;
        }
        if (!z6) {
            Z(obj);
            return null;
        }
        try {
            z3 = ((Boolean) this.f3363f.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused4) {
            z3 = false;
        }
        if (z3 && (a02 = a0(obj)) != null) {
            return Typeface.create(a02, 0);
        }
        return null;
    }
}

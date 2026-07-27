package V0;

import a.AbstractC0345a;
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
public class g extends AbstractC0345a {

    /* renamed from: i, reason: collision with root package name */
    public final Class f4149i;

    /* renamed from: j, reason: collision with root package name */
    public final Constructor f4150j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f4151k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f4152l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f4153m;

    /* renamed from: n, reason: collision with root package name */
    public final Method f4154n;

    /* renamed from: o, reason: collision with root package name */
    public final Method f4155o;

    public g() {
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
            method2 = S(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = T(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e4.getClass().getName()), e4);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f4149i = cls;
        this.f4150j = constructor;
        this.f4151k = method2;
        this.f4152l = method3;
        this.f4153m = method4;
        this.f4154n = method5;
        this.f4155o = method;
    }

    public static Method S(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void Q(Object obj) {
        try {
            this.f4154n.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public Typeface R(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f4149i, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f4155o.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method T(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // a.AbstractC0345a
    public final Typeface m(Context context, Y0.c[] cVarArr) {
        Object obj;
        boolean z4;
        Typeface R3;
        boolean z5;
        if (cVarArr.length < 1) {
            return null;
        }
        Method method = this.f4151k;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            Y0.c r2 = r(cVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(r2.f4393a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(r2.f4395c).setItalic(r2.f4396d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (Y0.c cVar : cVarArr) {
            if (cVar.f4397e == 0) {
                Uri uri = cVar.f4393a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, j0.c.E(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        try {
            obj = this.f4150j.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        int length = cVarArr.length;
        int i2 = 0;
        boolean z6 = false;
        while (i2 < length) {
            Y0.c cVar2 = cVarArr[i2];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(cVar2.f4393a);
            if (byteBuffer != null) {
                try {
                    z5 = ((Boolean) this.f4152l.invoke(obj, byteBuffer, Integer.valueOf(cVar2.f4394b), null, Integer.valueOf(cVar2.f4395c), Integer.valueOf(cVar2.f4396d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused3) {
                    z5 = false;
                }
                if (!z5) {
                    Q(obj);
                    return null;
                }
                z6 = true;
            }
            i2++;
            z6 = z6;
        }
        if (!z6) {
            Q(obj);
            return null;
        }
        try {
            z4 = ((Boolean) this.f4153m.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused4) {
            z4 = false;
        }
        if (z4 && (R3 = R(obj)) != null) {
            return Typeface.create(R3, 0);
        }
        return null;
    }
}

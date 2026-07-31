package V0;

import M1.B;
import a.AbstractC0157a;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import j.C0480F;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends AbstractC0157a {

    /* renamed from: b, reason: collision with root package name */
    public static final Class f3355b;

    /* renamed from: c, reason: collision with root package name */
    public static final Constructor f3356c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f3357d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f3358e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi24Impl", e3.getClass().getName(), e3);
            cls = null;
            method = null;
            method2 = null;
        }
        f3356c = constructor;
        f3355b = cls;
        f3357d = method2;
        f3358e = method;
    }

    @Override // a.AbstractC0157a
    public final Typeface s(Context context, Y0.b[] bVarArr) {
        Object obj;
        Typeface typeface;
        boolean z3;
        try {
            obj = f3356c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        C0480F c0480f = new C0480F();
        for (Y0.b bVar : bVarArr) {
            Uri uri = bVar.f3409a;
            Object obj2 = (ByteBuffer) c0480f.get(uri);
            if (obj2 == null) {
                obj2 = B.J(context, uri);
                c0480f.put(uri, obj2);
            }
            if (obj2 == null) {
                return null;
            }
            try {
                z3 = ((Boolean) f3357d.invoke(obj, obj2, Integer.valueOf(bVar.f3410b), null, Integer.valueOf(bVar.f3411c), Boolean.valueOf(bVar.f3412d))).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                z3 = false;
            }
            if (!z3) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance((Class<?>) f3355b, 1);
            Array.set(newInstance, 0, obj);
            typeface = (Typeface) f3358e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, 0);
    }
}

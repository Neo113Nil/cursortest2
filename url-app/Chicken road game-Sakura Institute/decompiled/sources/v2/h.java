package v2;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import i.g0;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import u3.q;
import u3.r;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends q {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f9108a;

    /* renamed from: b, reason: collision with root package name */
    public static final Constructor f9109b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f9110c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f9111d;

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
        } catch (ClassNotFoundException | NoSuchMethodException e9) {
            Log.e("TypefaceCompatApi24Impl", e9.getClass().getName(), e9);
            cls = null;
            method = null;
            method2 = null;
        }
        f9109b = constructor;
        f9108a = cls;
        f9110c = method2;
        f9111d = method;
    }

    @Override // u3.q
    public final Typeface e(Context context, y2.b[] bVarArr) {
        Object obj;
        Typeface typeface;
        boolean z8;
        try {
            obj = f9109b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            g0 g0Var = new g0(0);
            int length = bVarArr.length;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    y2.b bVar = bVarArr[i7];
                    Uri uri = bVar.f9891a;
                    Object obj2 = (ByteBuffer) g0Var.get(uri);
                    if (obj2 == null) {
                        obj2 = r.k(context, uri);
                        g0Var.put(uri, obj2);
                    }
                    if (obj2 == null) {
                        break;
                    }
                    try {
                        z8 = ((Boolean) f9110c.invoke(obj, obj2, Integer.valueOf(bVar.f9892b), null, Integer.valueOf(bVar.f9893c), Boolean.valueOf(bVar.f9894d))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z8 = false;
                    }
                    if (!z8) {
                        break;
                    }
                    i7++;
                } else {
                    try {
                        Object newInstance = Array.newInstance((Class<?>) f9108a, 1);
                        Array.set(newInstance, 0, obj);
                        typeface = (Typeface) f9111d.invoke(null, newInstance);
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        typeface = null;
                    }
                    if (typeface != null) {
                        return Typeface.create(typeface, 0);
                    }
                }
            }
        }
        return null;
    }
}

package X0;

import O2.l;
import a.AbstractC0235a;
import a1.C0243b;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import j.C0524F;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends l {

    /* renamed from: g, reason: collision with root package name */
    public static final Class f4629g;

    /* renamed from: h, reason: collision with root package name */
    public static final Constructor f4630h;

    /* renamed from: i, reason: collision with root package name */
    public static final Method f4631i;

    /* renamed from: j, reason: collision with root package name */
    public static final Method f4632j;

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
        f4630h = constructor;
        f4629g = cls;
        f4631i = method2;
        f4632j = method;
    }

    @Override // O2.l
    public final Typeface U(Context context, C0243b[] c0243bArr) {
        Object obj;
        Typeface typeface;
        boolean z3;
        try {
            obj = f4630h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        C0524F c0524f = new C0524F();
        for (C0243b c0243b : c0243bArr) {
            Uri uri = c0243b.f4738a;
            Object obj2 = (ByteBuffer) c0524f.get(uri);
            if (obj2 == null) {
                obj2 = AbstractC0235a.E(context, uri);
                c0524f.put(uri, obj2);
            }
            if (obj2 == null) {
                return null;
            }
            try {
                z3 = ((Boolean) f4631i.invoke(obj, obj2, Integer.valueOf(c0243b.f4739b), null, Integer.valueOf(c0243b.f4740c), Boolean.valueOf(c0243b.f4741d))).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                z3 = false;
            }
            if (!z3) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance((Class<?>) f4629g, 1);
            Array.set(newInstance, 0, obj);
            typeface = (Typeface) f4632j.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, 0);
    }
}

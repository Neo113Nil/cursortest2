package v2;

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
import u3.r;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class i extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Class f9112a;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f9113b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f9114c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f9115d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f9116e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f9117f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f9118g;

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
            method2 = n(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = o(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e9) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e9.getClass().getName()), e9);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f9112a = cls;
        this.f9113b = constructor;
        this.f9114c = method2;
        this.f9115d = method3;
        this.f9116e = method4;
        this.f9117f = method5;
        this.f9118g = method;
    }

    public static Method n(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // v2.g, u3.q
    public final Typeface e(Context context, y2.b[] bVarArr) {
        Object obj;
        boolean z8;
        Typeface m8;
        boolean z9;
        if (bVarArr.length >= 1) {
            Method method = this.f9114c;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (y2.b bVar : bVarArr) {
                        if (bVar.f9895e == 0) {
                            Uri uri = bVar.f9891a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, r.k(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.f9113b.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = bVarArr.length;
                        int i7 = 0;
                        boolean z10 = false;
                        while (true) {
                            Method method2 = this.f9117f;
                            if (i7 < length) {
                                y2.b bVar2 = bVarArr[i7];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(bVar2.f9891a);
                                if (byteBuffer != null) {
                                    try {
                                        z9 = ((Boolean) this.f9115d.invoke(obj, byteBuffer, Integer.valueOf(bVar2.f9892b), null, Integer.valueOf(bVar2.f9893c), Integer.valueOf(bVar2.f9894d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z9 = false;
                                    }
                                    if (!z9) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z10 = true;
                                }
                                i7++;
                                z10 = z10;
                            } else if (z10) {
                                try {
                                    z8 = ((Boolean) this.f9116e.invoke(obj, null)).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused3) {
                                    z8 = false;
                                }
                                if (z8 && (m8 = m(obj)) != null) {
                                    return Typeface.create(m8, 0);
                                }
                            } else {
                                method2.invoke(obj, null);
                            }
                        }
                    }
                } else {
                    y2.b g9 = g(bVarArr);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(g9.f9891a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(g9.f9893c).setItalic(g9.f9894d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused4) {
            }
        }
        return null;
    }

    public Typeface m(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f9112a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f9118g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method o(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}

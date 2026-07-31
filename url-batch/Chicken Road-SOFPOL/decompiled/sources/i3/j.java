package i3;

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

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class j extends h {

    /* renamed from: g, reason: collision with root package name */
    public final Class f3440g;

    /* renamed from: h, reason: collision with root package name */
    public final Constructor f3441h;
    public final Method i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f3442j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f3443k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f3444l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f3445m;

    public j() {
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
            method2 = c0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = d0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e8.getClass().getName()), e8);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f3440g = cls;
        this.f3441h = constructor;
        this.i = method2;
        this.f3442j = method3;
        this.f3443k = method4;
        this.f3444l = method5;
        this.f3445m = method;
    }

    public static Method c0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean Z(Context context, Object obj, String str, int i, int i8, int i9, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i8), Integer.valueOf(i9), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface a0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f3440g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3445m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean b0(Object obj) {
        try {
            return ((Boolean) this.f3443k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method d0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // i3.h, h0.a
    public final Typeface s(Context context, h3.e eVar, Resources resources, int i) {
        Object obj;
        Method method = this.i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.s(context, eVar, resources, i);
        }
        try {
            obj = this.f3441h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            h3.f[] fVarArr = eVar.f3131a;
            int length = fVarArr.length;
            int i8 = 0;
            while (true) {
                if (i8 < length) {
                    h3.f fVar = fVarArr[i8];
                    Context context2 = context;
                    if (Z(context2, obj, fVar.f3132a, fVar.f3136e, fVar.f3133b, fVar.f3134c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.f3135d))) {
                        i8++;
                        context = context2;
                    } else {
                        try {
                            this.f3444l.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (b0(obj)) {
                    return a0(obj);
                }
            }
        }
        return null;
    }

    @Override // i3.h, h0.a
    public final Typeface t(Context context, n3.h[] hVarArr, int i) {
        Object obj;
        Typeface a02;
        boolean z3;
        if (hVarArr.length >= 1) {
            Method method = this.i;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (n3.h hVar : hVarArr) {
                        if (hVar.f5364f == 0) {
                            Uri uri = hVar.f5359a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, m.a.H(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.f3441h.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = hVarArr.length;
                        int i8 = 0;
                        boolean z7 = false;
                        while (true) {
                            Method method2 = this.f3444l;
                            if (i8 < length) {
                                n3.h hVar2 = hVarArr[i8];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(hVar2.f5359a);
                                if (byteBuffer != null) {
                                    try {
                                        z3 = ((Boolean) this.f3442j.invoke(obj, byteBuffer, Integer.valueOf(hVar2.f5360b), null, Integer.valueOf(hVar2.f5361c), Integer.valueOf(hVar2.f5362d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z3 = false;
                                    }
                                    if (!z3) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z7 = true;
                                }
                                i8++;
                                z7 = z7;
                            } else if (!z7) {
                                method2.invoke(obj, null);
                            } else if (b0(obj) && (a02 = a0(obj)) != null) {
                                return Typeface.create(a02, i);
                            }
                        }
                    }
                } else {
                    n3.h z8 = z(hVarArr, i);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(z8.f5359a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(z8.f5361c).setItalic(z8.f5362d).build();
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
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // h0.a
    public final Typeface w(Context context, Resources resources, int i, String str, int i8) {
        Object obj;
        Method method = this.i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.w(context, resources, i, str, i8);
        }
        try {
            obj = this.f3441h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!Z(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.f3444l.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (b0(obj)) {
                return a0(obj);
            }
        }
        return null;
    }
}

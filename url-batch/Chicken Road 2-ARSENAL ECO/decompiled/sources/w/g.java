package w;

import A.k;
import a1.AbstractC0223a;
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
import v.C0698c;
import v.C0699d;

/* loaded from: classes.dex */
public class g extends e {

    /* renamed from: j, reason: collision with root package name */
    public final Class f6142j;

    /* renamed from: k, reason: collision with root package name */
    public final Constructor f6143k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f6144l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f6145m;

    /* renamed from: n, reason: collision with root package name */
    public final Method f6146n;

    /* renamed from: o, reason: collision with root package name */
    public final Method f6147o;

    /* renamed from: p, reason: collision with root package name */
    public final Method f6148p;

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
            method2 = X(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = Y(cls2);
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
        this.f6142j = cls;
        this.f6143k = constructor;
        this.f6144l = method2;
        this.f6145m = method3;
        this.f6146n = method4;
        this.f6147o = method5;
        this.f6148p = method;
    }

    public static Method X(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean U(Context context, Object obj, String str, int i7, int i8, int i9, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f6144l.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface V(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f6142j, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f6148p.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean W(Object obj) {
        try {
            return ((Boolean) this.f6146n.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method Y(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // w.e, a.AbstractC0219a
    public final Typeface g(Context context, C0698c c0698c, Resources resources, int i7) {
        Object obj;
        Method method = this.f6144l;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.g(context, c0698c, resources, i7);
        }
        try {
            obj = this.f6143k.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            C0699d[] c0699dArr = c0698c.f6041a;
            int length = c0699dArr.length;
            int i8 = 0;
            while (true) {
                if (i8 < length) {
                    C0699d c0699d = c0699dArr[i8];
                    Context context2 = context;
                    if (U(context2, obj, c0699d.f6042a, c0699d.f6046e, c0699d.f6043b, c0699d.f6044c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0699d.f6045d))) {
                        i8++;
                        context = context2;
                    } else {
                        try {
                            this.f6147o.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (W(obj)) {
                    return V(obj);
                }
            }
        }
        return null;
    }

    @Override // w.e, a.AbstractC0219a
    public final Typeface h(Context context, k[] kVarArr, int i7) {
        Object obj;
        Typeface V6;
        boolean z5;
        if (kVarArr.length >= 1) {
            Method method = this.f6144l;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (k kVar : kVarArr) {
                        if (kVar.f32e == 0) {
                            Uri uri = kVar.f28a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, AbstractC0223a.C(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.f6143k.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = kVarArr.length;
                        int i8 = 0;
                        boolean z6 = false;
                        while (true) {
                            Method method2 = this.f6147o;
                            if (i8 < length) {
                                k kVar2 = kVarArr[i8];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(kVar2.f28a);
                                if (byteBuffer != null) {
                                    try {
                                        z5 = ((Boolean) this.f6145m.invoke(obj, byteBuffer, Integer.valueOf(kVar2.f29b), null, Integer.valueOf(kVar2.f30c), Integer.valueOf(kVar2.f31d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z5 = false;
                                    }
                                    if (!z5) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z6 = true;
                                }
                                i8++;
                                z6 = z6;
                            } else if (!z6) {
                                method2.invoke(obj, null);
                            } else if (W(obj) && (V6 = V(obj)) != null) {
                                return Typeface.create(V6, i7);
                            }
                        }
                    }
                } else {
                    k o7 = o(kVarArr, i7);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(o7.f28a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(o7.f30c).setItalic(o7.f31d).build();
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

    @Override // a.AbstractC0219a
    public final Typeface j(Context context, Resources resources, int i7, String str, int i8) {
        Object obj;
        Method method = this.f6144l;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.j(context, resources, i7, str, i8);
        }
        try {
            obj = this.f6143k.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!U(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.f6147o.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (W(obj)) {
                return V(obj);
            }
        }
        return null;
    }
}

package f0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import b4.l;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class g extends b4.d {

    /* renamed from: v, reason: collision with root package name */
    public static Class f1423v = null;

    /* renamed from: w, reason: collision with root package name */
    public static Constructor f1424w = null;

    /* renamed from: x, reason: collision with root package name */
    public static Method f1425x = null;

    /* renamed from: y, reason: collision with root package name */
    public static Method f1426y = null;

    /* renamed from: z, reason: collision with root package name */
    public static boolean f1427z = false;

    /* renamed from: o, reason: collision with root package name */
    public final Class f1428o;

    /* renamed from: p, reason: collision with root package name */
    public final Constructor f1429p;

    /* renamed from: q, reason: collision with root package name */
    public final Method f1430q;

    /* renamed from: r, reason: collision with root package name */
    public final Method f1431r;

    /* renamed from: s, reason: collision with root package name */
    public final Method f1432s;

    /* renamed from: t, reason: collision with root package name */
    public final Method f1433t;

    /* renamed from: u, reason: collision with root package name */
    public final Method f1434u;

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
            method2 = e0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = f0(cls2);
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
        this.f1428o = cls;
        this.f1429p = constructor;
        this.f1430q = method2;
        this.f1431r = method3;
        this.f1432s = method4;
        this.f1433t = method5;
        this.f1434u = method;
    }

    public static boolean a0(Object obj, String str, int i, boolean z4) {
        d0();
        try {
            return ((Boolean) f1425x.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static void d0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f1427z) {
            return;
        }
        f1427z = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi21Impl", e4.getClass().getName(), e4);
            method = null;
            cls = null;
            method2 = null;
        }
        f1424w = constructor;
        f1423v = cls;
        f1425x = method2;
        f1426y = method;
    }

    public static Method e0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean Z(Context context, Object obj, String str, int i, int i4, int i5, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1430q.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i5), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface b0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f1428o, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1434u.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean c0(Object obj) {
        try {
            return ((Boolean) this.f1432s.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method f0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // b4.d
    public final Typeface o(Context context, e0.f fVar, Resources resources, int i) {
        Object obj;
        Method method = this.f1430q;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.f1429p.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                e0.g[] gVarArr = fVar.f1323a;
                int length = gVarArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        e0.g gVar = gVarArr[i4];
                        Context context2 = context;
                        if (Z(context2, obj, gVar.f1324a, gVar.f1327e, gVar.f1325b, gVar.f1326c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.d))) {
                            i4++;
                            context = context2;
                        } else {
                            try {
                                this.f1433t.invoke(obj, null);
                                break;
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                    } else if (c0(obj)) {
                        return b0(obj);
                    }
                }
            }
            return null;
        }
        d0();
        try {
            Object newInstance = f1424w.newInstance(null);
            for (e0.g gVar2 : fVar.f1323a) {
                File G = l.G(context);
                if (G == null) {
                    return null;
                }
                try {
                    if (l.k(G, resources, gVar2.f1328f) && a0(newInstance, G.getPath(), gVar2.f1325b, gVar2.f1326c)) {
                        G.delete();
                    }
                } catch (RuntimeException unused3) {
                } catch (Throwable th) {
                    G.delete();
                    throw th;
                }
                G.delete();
                return null;
            }
            d0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f1423v, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f1426y.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // b4.d
    public final Typeface p(Context context, k0.i[] iVarArr, int i) {
        Object obj;
        Typeface b02;
        boolean z4;
        if (iVarArr.length >= 1) {
            Method method = this.f1430q;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (k0.i iVar : iVarArr) {
                        if (iVar.f2302f == 0) {
                            Uri uri = iVar.f2298a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, l.R(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.f1429p.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = iVarArr.length;
                        int i4 = 0;
                        boolean z5 = false;
                        while (true) {
                            Method method2 = this.f1433t;
                            if (i4 < length) {
                                k0.i iVar2 = iVarArr[i4];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(iVar2.f2298a);
                                if (byteBuffer != null) {
                                    try {
                                        z4 = ((Boolean) this.f1431r.invoke(obj, byteBuffer, Integer.valueOf(iVar2.f2299b), null, Integer.valueOf(iVar2.f2300c), Integer.valueOf(iVar2.d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z4 = false;
                                    }
                                    if (!z4) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z5 = true;
                                }
                                i4++;
                                z5 = z5;
                            } else if (!z5) {
                                method2.invoke(obj, null);
                            } else if (c0(obj) && (b02 = b0(obj)) != null) {
                                return Typeface.create(b02, i);
                            }
                        }
                    }
                } else {
                    int i5 = (i & 1) == 0 ? 400 : 700;
                    boolean z6 = (i & 2) != 0;
                    k0.i iVar3 = null;
                    int i6 = Integer.MAX_VALUE;
                    for (k0.i iVar4 : iVarArr) {
                        int abs = (Math.abs(iVar4.f2300c - i5) * 2) + (iVar4.d == z6 ? 0 : 1);
                        if (iVar3 == null || i6 > abs) {
                            iVar3 = iVar4;
                            i6 = abs;
                        }
                    }
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(iVar3.f2298a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(iVar3.f2300c).setItalic(iVar3.d).build();
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

    @Override // b4.d
    public final Typeface r(Context context, Resources resources, int i, String str, int i4) {
        Object obj;
        Method method = this.f1430q;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.r(context, resources, i, str, i4);
        }
        try {
            obj = this.f1429p.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!Z(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.f1433t.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (c0(obj)) {
                return b0(obj);
            }
        }
        return null;
    }
}

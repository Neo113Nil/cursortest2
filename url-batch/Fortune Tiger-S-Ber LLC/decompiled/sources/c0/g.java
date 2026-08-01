package c0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
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
import k3.m;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class g extends k3.d {

    /* renamed from: m, reason: collision with root package name */
    public static Class f986m = null;

    /* renamed from: n, reason: collision with root package name */
    public static Constructor f987n = null;

    /* renamed from: o, reason: collision with root package name */
    public static Method f988o = null;

    /* renamed from: p, reason: collision with root package name */
    public static Method f989p = null;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f990q = false;

    /* renamed from: f, reason: collision with root package name */
    public final Class f991f;
    public final Constructor g;
    public final Method h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f992i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f993j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f994k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f995l;

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
            method2 = q0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = r0(cls2);
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
        this.f991f = cls;
        this.g = constructor;
        this.h = method2;
        this.f992i = method3;
        this.f993j = method4;
        this.f994k = method5;
        this.f995l = method;
    }

    public static boolean m0(Object obj, String str, int i4, boolean z3) {
        p0();
        try {
            return ((Boolean) f988o.invoke(obj, str, Integer.valueOf(i4), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static void p0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f990q) {
            return;
        }
        f990q = true;
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
        f987n = constructor;
        f986m = cls;
        f988o = method2;
        f989p = method;
    }

    public static Method q0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean l0(Context context, Object obj, String str, int i4, int i5, int i6, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface n0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f991f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f995l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean o0(Object obj) {
        try {
            return ((Boolean) this.f993j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // k3.d
    public final Typeface q(Context context, b0.f fVar, Resources resources, int i4) {
        Object obj;
        Method method = this.h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.g.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                b0.g[] gVarArr = fVar.f701a;
                int length = gVarArr.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        b0.g gVar = gVarArr[i5];
                        Context context2 = context;
                        if (l0(context2, obj, gVar.f702a, gVar.f705e, gVar.f703b, gVar.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f704d))) {
                            i5++;
                            context = context2;
                        } else {
                            try {
                                this.f994k.invoke(obj, null);
                                break;
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                    } else if (o0(obj)) {
                        return n0(obj);
                    }
                }
            }
            return null;
        }
        p0();
        try {
            Object newInstance = f987n.newInstance(null);
            for (b0.g gVar2 : fVar.f701a) {
                File z3 = m.z(context);
                if (z3 == null) {
                    return null;
                }
                try {
                    if (m.m(z3, resources, gVar2.f706f) && m0(newInstance, z3.getPath(), gVar2.f703b, gVar2.c)) {
                        z3.delete();
                    }
                } catch (RuntimeException unused3) {
                } catch (Throwable th) {
                    z3.delete();
                    throw th;
                }
                z3.delete();
                return null;
            }
            p0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f986m, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f989p.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // k3.d
    public final Typeface r(Context context, h0.i[] iVarArr, int i4) {
        Object obj;
        Typeface n02;
        boolean z3;
        if (iVarArr.length >= 1) {
            Method method = this.h;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (h0.i iVar : iVarArr) {
                        if (iVar.f1997e == 0) {
                            Uri uri = iVar.f1994a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, m.H(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.g.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = iVarArr.length;
                        int i5 = 0;
                        boolean z4 = false;
                        while (true) {
                            Method method2 = this.f994k;
                            if (i5 < length) {
                                h0.i iVar2 = iVarArr[i5];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(iVar2.f1994a);
                                if (byteBuffer != null) {
                                    try {
                                        z3 = ((Boolean) this.f992i.invoke(obj, byteBuffer, Integer.valueOf(iVar2.f1995b), null, Integer.valueOf(iVar2.c), Integer.valueOf(iVar2.f1996d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z3 = false;
                                    }
                                    if (!z3) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z4 = true;
                                }
                                i5++;
                                z4 = z4;
                            } else if (!z4) {
                                method2.invoke(obj, null);
                            } else if (o0(obj) && (n02 = n0(obj)) != null) {
                                return Typeface.create(n02, i4);
                            }
                        }
                    }
                } else {
                    h0.i z5 = z(iVarArr, i4);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(z5.f1994a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(z5.c).setItalic(z5.f1996d).build();
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

    public Method r0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // k3.d
    public final Typeface t(Context context, Resources resources, int i4, String str, int i5) {
        Object obj;
        Method method = this.h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.t(context, resources, i4, str, i5);
        }
        try {
            obj = this.g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!l0(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.f994k.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (o0(obj)) {
                return n0(obj);
            }
        }
        return null;
    }
}

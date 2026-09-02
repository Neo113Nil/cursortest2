package f0;

import a.y;
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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class j extends h {

    /* renamed from: s, reason: collision with root package name */
    public final Class f1284s;

    /* renamed from: t, reason: collision with root package name */
    public final Constructor f1285t;

    /* renamed from: u, reason: collision with root package name */
    public final Method f1286u;

    /* renamed from: v, reason: collision with root package name */
    public final Method f1287v;

    /* renamed from: w, reason: collision with root package name */
    public final Method f1288w;

    /* renamed from: x, reason: collision with root package name */
    public final Method f1289x;

    /* renamed from: y, reason: collision with root package name */
    public final Method f1290y;

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
            method2 = b0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = c0(cls2);
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
        this.f1284s = cls;
        this.f1285t = constructor;
        this.f1286u = method2;
        this.f1287v = method3;
        this.f1288w = method4;
        this.f1289x = method5;
        this.f1290y = method;
    }

    public static Method b0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean Y(Context context, Object obj, String str, int i, int i4, int i5, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1286u.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i5), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface Z(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f1284s, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1290y.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean a0(Object obj) {
        try {
            return ((Boolean) this.f1288w.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method c0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // f0.h, a.y
    public final Typeface r(Context context, e0.f fVar, Resources resources, int i) {
        Object obj;
        Method method = this.f1286u;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.r(context, fVar, resources, i);
        }
        try {
            obj = this.f1285t.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            e0.g[] gVarArr = fVar.f1141a;
            int length = gVarArr.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    e0.g gVar = gVarArr[i4];
                    Context context2 = context;
                    if (Y(context2, obj, gVar.f1142a, gVar.f1145e, gVar.f1143b, gVar.f1144c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.d))) {
                        i4++;
                        context = context2;
                    } else {
                        try {
                            this.f1289x.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (a0(obj)) {
                    return Z(obj);
                }
            }
        }
        return null;
    }

    @Override // f0.h, a.y
    public final Typeface s(Context context, k0.i[] iVarArr, int i) {
        Object obj;
        Typeface Z;
        boolean z3;
        if (iVarArr.length >= 1) {
            Method method = this.f1286u;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (k0.i iVar : iVarArr) {
                        if (iVar.f2154f == 0) {
                            Uri uri = iVar.f2150a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, y.K(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.f1285t.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = iVarArr.length;
                        int i4 = 0;
                        boolean z4 = false;
                        while (true) {
                            Method method2 = this.f1289x;
                            if (i4 < length) {
                                k0.i iVar2 = iVarArr[i4];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(iVar2.f2150a);
                                if (byteBuffer != null) {
                                    try {
                                        z3 = ((Boolean) this.f1287v.invoke(obj, byteBuffer, Integer.valueOf(iVar2.f2151b), null, Integer.valueOf(iVar2.f2152c), Integer.valueOf(iVar2.d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z3 = false;
                                    }
                                    if (!z3) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z4 = true;
                                }
                                i4++;
                                z4 = z4;
                            } else if (!z4) {
                                method2.invoke(obj, null);
                            } else if (a0(obj) && (Z = Z(obj)) != null) {
                                return Typeface.create(Z, i);
                            }
                        }
                    }
                } else {
                    k0.i y3 = y(iVarArr, i);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(y3.f2150a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(y3.f2152c).setItalic(y3.d).build();
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

    @Override // a.y
    public final Typeface v(Context context, Resources resources, int i, String str, int i4) {
        Object obj;
        Method method = this.f1286u;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.v(context, resources, i, str, i4);
        }
        try {
            obj = this.f1285t.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!Y(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.f1289x.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (a0(obj)) {
                return Z(obj);
            }
        }
        return null;
    }
}

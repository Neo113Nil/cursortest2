package defpackage;

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
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class oa0 extends xf {
    public static boolean A = false;
    public static Class w;
    public static Constructor x;
    public static Method y;
    public static Method z;
    public final Class p;
    public final Constructor q;
    public final Method r;
    public final Method s;
    public final Method t;
    public final Method u;
    public final Method v;

    public oa0() {
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
            method2 = U(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = V(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.p = cls;
        this.q = constructor;
        this.r = method2;
        this.s = method3;
        this.t = method4;
        this.u = method5;
        this.v = method;
    }

    public static boolean Q(Object obj, String str, int i, boolean z2) {
        T();
        try {
            return ((Boolean) y.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void T() {
        Method method;
        Class<?> cls;
        Method method2;
        if (A) {
            return;
        }
        A = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        x = constructor;
        w = cls;
        y = method2;
        z = method;
    }

    public static Method U(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean P(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.r.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface R(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.p, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.v.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean S(Object obj) {
        try {
            return ((Boolean) this.t.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method V(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.xf
    public final Typeface k(Context context, em emVar, Resources resources, int i) {
        Object obj;
        InputStream inputStream;
        fm[] fmVarArr = emVar.a;
        Method method = this.r;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        int i2 = 0;
        if (method == null) {
            T();
            try {
                Object newInstance = x.newInstance(null);
                for (fm fmVar : fmVarArr) {
                    File D = kr.D(context);
                    if (D != null) {
                        try {
                            try {
                                inputStream = resources.openRawResource(fmVar.f);
                                try {
                                    boolean p = kr.p(D, inputStream);
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (!p) {
                                        D.delete();
                                        return null;
                                    }
                                    if (!Q(newInstance, D.getPath(), fmVar.b, fmVar.c)) {
                                        D.delete();
                                        return null;
                                    }
                                    D.delete();
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    if (inputStream == null) {
                                        throw th2;
                                    }
                                    try {
                                        inputStream.close();
                                        throw th2;
                                    } catch (IOException unused2) {
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStream = null;
                            }
                        } catch (RuntimeException unused3) {
                            D.delete();
                            return null;
                        } catch (Throwable th4) {
                            D.delete();
                            throw th4;
                        }
                    }
                }
                T();
                try {
                    Object newInstance2 = Array.newInstance((Class<?>) w, 1);
                    Array.set(newInstance2, 0, newInstance);
                    return (Typeface) z.invoke(null, newInstance2);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
        try {
            obj = this.q.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused4) {
            obj = null;
        }
        if (obj != null) {
            int length = fmVarArr.length;
            while (true) {
                if (i2 < length) {
                    fm fmVar2 = fmVarArr[i2];
                    oa0 oa0Var = this;
                    Context context2 = context;
                    if (oa0Var.P(context2, obj, fmVar2.a, fmVar2.e, fmVar2.b, fmVar2.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fmVar2.d))) {
                        i2++;
                        this = oa0Var;
                        context = context2;
                    } else {
                        try {
                            oa0Var.u.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused5) {
                        }
                    }
                } else {
                    oa0 oa0Var2 = this;
                    if (oa0Var2.S(obj)) {
                        return oa0Var2.R(obj);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.xf
    public final Typeface l(Context context, hm[] hmVarArr, int i) {
        Object obj;
        Typeface R;
        boolean z2;
        if (hmVarArr.length >= 1) {
            Method method = this.r;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (hm hmVar : hmVarArr) {
                        if (hmVar.f == 0) {
                            Uri uri = hmVar.a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, kr.K(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.q.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = hmVarArr.length;
                        int i2 = 0;
                        boolean z3 = false;
                        while (true) {
                            Method method2 = this.u;
                            if (i2 < length) {
                                hm hmVar2 = hmVarArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(hmVar2.a);
                                if (byteBuffer != null) {
                                    try {
                                        z2 = ((Boolean) this.s.invoke(obj, byteBuffer, Integer.valueOf(hmVar2.b), null, Integer.valueOf(hmVar2.c), Integer.valueOf(hmVar2.d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z2 = false;
                                    }
                                    if (!z2) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z3 = true;
                                }
                                i2++;
                                z3 = z3;
                            } else if (!z3) {
                                method2.invoke(obj, null);
                            } else if (S(obj) && (R = R(obj)) != null) {
                                return Typeface.create(R, i);
                            }
                        }
                    }
                } else {
                    int i3 = (i & 1) == 0 ? 400 : 700;
                    boolean z4 = (i & 2) != 0;
                    int i4 = Integer.MAX_VALUE;
                    hm hmVar3 = null;
                    for (hm hmVar4 : hmVarArr) {
                        int abs = (Math.abs(hmVar4.c - i3) * 2) + (hmVar4.d == z4 ? 0 : 1);
                        if (hmVar3 == null || i4 > abs) {
                            hmVar3 = hmVar4;
                            i4 = abs;
                        }
                    }
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(hmVar3.a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(hmVar3.c).setItalic(hmVar3.d).build();
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

    @Override // defpackage.xf
    public final Typeface n(Context context, Resources resources, int i, String str) {
        Object obj;
        InputStream inputStream;
        Method method = this.r;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.q.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                if (!P(context, obj, str, 0, -1, -1, null)) {
                    try {
                        this.u.invoke(obj, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (S(obj)) {
                    return R(obj);
                }
            }
        } else {
            File D = kr.D(context);
            try {
                if (D != null) {
                    try {
                        inputStream = resources.openRawResource(i);
                        try {
                            boolean p = kr.p(D, inputStream);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (!p) {
                                D.delete();
                                return null;
                            }
                            Typeface createFromFile = Typeface.createFromFile(D.getPath());
                            D.delete();
                            return createFromFile;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (inputStream == null) {
                                throw th2;
                            }
                            try {
                                inputStream.close();
                                throw th2;
                            } catch (IOException unused4) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = null;
                    }
                }
            } catch (RuntimeException unused5) {
                D.delete();
                return null;
            } catch (Throwable th4) {
                D.delete();
                throw th4;
            }
        }
        return null;
    }
}

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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class o70 extends op {
    public static Class v = null;
    public static Constructor w = null;
    public static Method x = null;
    public static Method y = null;
    public static boolean z = false;
    public final Class o;
    public final Constructor p;
    public final Method q;
    public final Method r;
    public final Method s;
    public final Method t;
    public final Method u;

    public o70() {
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
            method2 = j0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = k0(cls2);
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
        this.o = cls;
        this.p = constructor;
        this.q = method2;
        this.r = method3;
        this.s = method4;
        this.t = method5;
        this.u = method;
    }

    public static boolean f0(Object obj, String str, int i, boolean z2) {
        i0();
        try {
            return ((Boolean) x.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void i0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (z) {
            return;
        }
        z = true;
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
        w = constructor;
        v = cls;
        x = method2;
        y = method;
    }

    public static Method j0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean e0(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.q.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface g0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.o, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.u.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean h0(Object obj) {
        try {
            return ((Boolean) this.s.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method k0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.op
    public final Typeface o(Context context, vj vjVar, Resources resources, int i) {
        Object obj;
        InputStream inputStream;
        wj[] wjVarArr = vjVar.a;
        Method method = this.q;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        int i2 = 0;
        if (method == null) {
            i0();
            try {
                Object newInstance = w.newInstance(null);
                for (wj wjVar : wjVarArr) {
                    File K = vw.K(context);
                    if (K != null) {
                        try {
                            try {
                                inputStream = resources.openRawResource(wjVar.f);
                                try {
                                    boolean t = vw.t(K, inputStream);
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (!t) {
                                        K.delete();
                                        return null;
                                    }
                                    if (!f0(newInstance, K.getPath(), wjVar.b, wjVar.c)) {
                                        K.delete();
                                        return null;
                                    }
                                    K.delete();
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
                            K.delete();
                            return null;
                        } catch (Throwable th4) {
                            K.delete();
                            throw th4;
                        }
                    }
                }
                i0();
                try {
                    Object newInstance2 = Array.newInstance((Class<?>) v, 1);
                    Array.set(newInstance2, 0, newInstance);
                    return (Typeface) y.invoke(null, newInstance2);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
        try {
            obj = this.p.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused4) {
            obj = null;
        }
        if (obj != null) {
            int length = wjVarArr.length;
            while (true) {
                if (i2 < length) {
                    wj wjVar2 = wjVarArr[i2];
                    o70 o70Var = this;
                    Context context2 = context;
                    if (o70Var.e0(context2, obj, wjVar2.a, wjVar2.e, wjVar2.b, wjVar2.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(wjVar2.d))) {
                        i2++;
                        this = o70Var;
                        context = context2;
                    } else {
                        try {
                            o70Var.t.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused5) {
                        }
                    }
                } else {
                    o70 o70Var2 = this;
                    if (o70Var2.h0(obj)) {
                        return o70Var2.g0(obj);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.op
    public final Typeface p(Context context, yj[] yjVarArr, int i) {
        Object obj;
        Typeface g0;
        boolean z2;
        if (yjVarArr.length >= 1) {
            Method method = this.q;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (yj yjVar : yjVarArr) {
                        if (yjVar.f == 0) {
                            Uri uri = yjVar.a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, vw.Y(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.p.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = yjVarArr.length;
                        int i2 = 0;
                        boolean z3 = false;
                        while (true) {
                            Method method2 = this.t;
                            if (i2 < length) {
                                yj yjVar2 = yjVarArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(yjVar2.a);
                                if (byteBuffer != null) {
                                    try {
                                        z2 = ((Boolean) this.r.invoke(obj, byteBuffer, Integer.valueOf(yjVar2.b), null, Integer.valueOf(yjVar2.c), Integer.valueOf(yjVar2.d ? 1 : 0))).booleanValue();
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
                            } else if (h0(obj) && (g0 = g0(obj)) != null) {
                                return Typeface.create(g0, i);
                            }
                        }
                    }
                } else {
                    int i3 = (i & 1) == 0 ? 400 : 700;
                    boolean z4 = (i & 2) != 0;
                    int i4 = Integer.MAX_VALUE;
                    yj yjVar3 = null;
                    for (yj yjVar4 : yjVarArr) {
                        int abs = (Math.abs(yjVar4.c - i3) * 2) + (yjVar4.d == z4 ? 0 : 1);
                        if (yjVar3 == null || i4 > abs) {
                            yjVar3 = yjVar4;
                            i4 = abs;
                        }
                    }
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(yjVar3.a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(yjVar3.c).setItalic(yjVar3.d).build();
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

    @Override // defpackage.op
    public final Typeface r(Context context, Resources resources, int i, String str) {
        Object obj;
        InputStream inputStream;
        Method method = this.q;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.p.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                if (!e0(context, obj, str, 0, -1, -1, null)) {
                    try {
                        this.t.invoke(obj, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (h0(obj)) {
                    return g0(obj);
                }
            }
        } else {
            File K = vw.K(context);
            try {
                if (K != null) {
                    try {
                        inputStream = resources.openRawResource(i);
                        try {
                            boolean t = vw.t(K, inputStream);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (!t) {
                                K.delete();
                                return null;
                            }
                            Typeface createFromFile = Typeface.createFromFile(K.getPath());
                            K.delete();
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
                K.delete();
                return null;
            } catch (Throwable th4) {
                K.delete();
                throw th4;
            }
        }
        return null;
    }
}

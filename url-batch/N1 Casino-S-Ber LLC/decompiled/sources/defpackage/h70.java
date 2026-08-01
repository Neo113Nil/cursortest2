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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class h70 extends e70 {
    public static Class p = null;
    public static Constructor q = null;
    public static Method r = null;
    public static Method s = null;
    public static boolean t = false;
    public final Class i;
    public final Constructor j;
    public final Method k;
    public final Method l;
    public final Method m;
    public final Method n;
    public final Method o;

    public h70() {
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
            method2 = g0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = h0(cls2);
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
        this.i = cls;
        this.j = constructor;
        this.k = method2;
        this.l = method3;
        this.m = method4;
        this.n = method5;
        this.o = method;
    }

    public static boolean c0(Object obj, String str, int i, boolean z) {
        f0();
        try {
            return ((Boolean) r.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void f0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (t) {
            return;
        }
        t = true;
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
        q = constructor;
        p = cls;
        r = method2;
        s = method;
    }

    public static Method g0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean b0(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.k.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface d0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.i, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.o.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean e0(Object obj) {
        try {
            return ((Boolean) this.m.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method h0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.e70
    public final Typeface m(Context context, ak akVar, Resources resources, int i) {
        Object obj;
        InputStream inputStream;
        bk[] bkVarArr = akVar.a;
        Method method = this.k;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        int i2 = 0;
        if (method == null) {
            f0();
            try {
                Object newInstance = q.newInstance(null);
                for (bk bkVar : bkVarArr) {
                    File I = o8.I(context);
                    if (I != null) {
                        try {
                            try {
                                inputStream = resources.openRawResource(bkVar.f);
                                try {
                                    boolean q2 = o8.q(I, inputStream);
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (!q2) {
                                        I.delete();
                                        return null;
                                    }
                                    if (!c0(newInstance, I.getPath(), bkVar.b, bkVar.c)) {
                                        I.delete();
                                        return null;
                                    }
                                    I.delete();
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
                            I.delete();
                            return null;
                        } catch (Throwable th4) {
                            I.delete();
                            throw th4;
                        }
                    }
                }
                f0();
                try {
                    Object newInstance2 = Array.newInstance((Class<?>) p, 1);
                    Array.set(newInstance2, 0, newInstance);
                    return (Typeface) s.invoke(null, newInstance2);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
        try {
            obj = this.j.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused4) {
            obj = null;
        }
        if (obj != null) {
            int length = bkVarArr.length;
            while (true) {
                if (i2 < length) {
                    bk bkVar2 = bkVarArr[i2];
                    h70 h70Var = this;
                    Context context2 = context;
                    if (h70Var.b0(context2, obj, bkVar2.a, bkVar2.e, bkVar2.b, bkVar2.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(bkVar2.d))) {
                        i2++;
                        this = h70Var;
                        context = context2;
                    } else {
                        try {
                            h70Var.n.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused5) {
                        }
                    }
                } else {
                    h70 h70Var2 = this;
                    if (h70Var2.e0(obj)) {
                        return h70Var2.d0(obj);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.e70
    public final Typeface n(Context context, dk[] dkVarArr, int i) {
        Object obj;
        Typeface d0;
        boolean z;
        if (dkVarArr.length >= 1) {
            Method method = this.k;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (dk dkVar : dkVarArr) {
                        if (dkVar.f == 0) {
                            Uri uri = dkVar.a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, o8.V(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.j.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = dkVarArr.length;
                        int i2 = 0;
                        boolean z2 = false;
                        while (true) {
                            Method method2 = this.n;
                            if (i2 < length) {
                                dk dkVar2 = dkVarArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(dkVar2.a);
                                if (byteBuffer != null) {
                                    try {
                                        z = ((Boolean) this.l.invoke(obj, byteBuffer, Integer.valueOf(dkVar2.b), null, Integer.valueOf(dkVar2.c), Integer.valueOf(dkVar2.d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z = false;
                                    }
                                    if (!z) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z2 = true;
                                }
                                i2++;
                                z2 = z2;
                            } else if (!z2) {
                                method2.invoke(obj, null);
                            } else if (e0(obj) && (d0 = d0(obj)) != null) {
                                return Typeface.create(d0, i);
                            }
                        }
                    }
                } else {
                    int i3 = (i & 1) == 0 ? 400 : 700;
                    boolean z3 = (i & 2) != 0;
                    int i4 = Integer.MAX_VALUE;
                    dk dkVar3 = null;
                    for (dk dkVar4 : dkVarArr) {
                        int abs = (Math.abs(dkVar4.c - i3) * 2) + (dkVar4.d == z3 ? 0 : 1);
                        if (dkVar3 == null || i4 > abs) {
                            dkVar3 = dkVar4;
                            i4 = abs;
                        }
                    }
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(dkVar3.a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(dkVar3.c).setItalic(dkVar3.d).build();
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

    @Override // defpackage.e70
    public final Typeface p(Context context, Resources resources, int i, String str) {
        Object obj;
        InputStream inputStream;
        Method method = this.k;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.j.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                if (!b0(context, obj, str, 0, -1, -1, null)) {
                    try {
                        this.n.invoke(obj, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (e0(obj)) {
                    return d0(obj);
                }
            }
        } else {
            File I = o8.I(context);
            try {
                if (I != null) {
                    try {
                        inputStream = resources.openRawResource(i);
                        try {
                            boolean q2 = o8.q(I, inputStream);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (!q2) {
                                I.delete();
                                return null;
                            }
                            Typeface createFromFile = Typeface.createFromFile(I.getPath());
                            I.delete();
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
                I.delete();
                return null;
            } catch (Throwable th4) {
                I.delete();
                throw th4;
            }
        }
        return null;
    }
}

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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class jk0 extends ud0 {
    public static Class h = null;
    public static Constructor i = null;
    public static Method j = null;
    public static Method k = null;
    public static boolean l = false;
    public final Class a;
    public final Constructor b;
    public final Method c;
    public final Method d;
    public final Method e;
    public final Method f;
    public final Method g;

    public jk0() {
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
            method2 = K(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = L(cls2);
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
        this.a = cls;
        this.b = constructor;
        this.c = method2;
        this.d = method3;
        this.e = method4;
        this.f = method5;
        this.g = method;
    }

    public static boolean G(Object obj, String str, int i2, boolean z) {
        J();
        try {
            return ((Boolean) j.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static void J() {
        Method method;
        Class<?> cls;
        Method method2;
        if (l) {
            return;
        }
        l = true;
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
        i = constructor;
        h = cls;
        j = method2;
        k = method;
    }

    public static Method K(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean F(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.c.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface H(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean I(Object obj) {
        try {
            return ((Boolean) this.e.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method L(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.ud0
    public final Typeface e(Context context, kp kpVar, Resources resources, int i2) {
        Object obj;
        InputStream inputStream;
        lp[] lpVarArr = kpVar.a;
        Method method = this.c;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        int i3 = 0;
        if (method == null) {
            J();
            try {
                Object newInstance = i.newInstance(null);
                for (lp lpVar : lpVarArr) {
                    File h2 = zb0.h(context);
                    if (h2 != null) {
                        try {
                            try {
                                inputStream = resources.openRawResource(lpVar.f);
                                try {
                                    boolean f = zb0.f(h2, inputStream);
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (!f) {
                                        h2.delete();
                                        return null;
                                    }
                                    if (!G(newInstance, h2.getPath(), lpVar.b, lpVar.c)) {
                                        h2.delete();
                                        return null;
                                    }
                                    h2.delete();
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
                            h2.delete();
                            return null;
                        } catch (Throwable th4) {
                            h2.delete();
                            throw th4;
                        }
                    }
                }
                J();
                try {
                    Object newInstance2 = Array.newInstance((Class<?>) h, 1);
                    Array.set(newInstance2, 0, newInstance);
                    return (Typeface) k.invoke(null, newInstance2);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
        try {
            obj = this.b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused4) {
            obj = null;
        }
        if (obj != null) {
            int length = lpVarArr.length;
            while (true) {
                if (i3 < length) {
                    lp lpVar2 = lpVarArr[i3];
                    jk0 jk0Var = this;
                    Context context2 = context;
                    if (jk0Var.F(context2, obj, lpVar2.a, lpVar2.e, lpVar2.b, lpVar2.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(lpVar2.d))) {
                        i3++;
                        this = jk0Var;
                        context = context2;
                    } else {
                        try {
                            jk0Var.f.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused5) {
                        }
                    }
                } else {
                    jk0 jk0Var2 = this;
                    if (jk0Var2.I(obj)) {
                        return jk0Var2.H(obj);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.ud0
    public final Typeface f(Context context, np[] npVarArr, int i2) {
        Object obj;
        Typeface H;
        boolean z;
        if (npVarArr.length >= 1) {
            Method method = this.c;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (np npVar : npVarArr) {
                        if (npVar.f == 0) {
                            Uri uri = npVar.a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, zb0.k(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.b.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = npVarArr.length;
                        int i3 = 0;
                        boolean z2 = false;
                        while (true) {
                            Method method2 = this.f;
                            if (i3 < length) {
                                np npVar2 = npVarArr[i3];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(npVar2.a);
                                if (byteBuffer != null) {
                                    try {
                                        z = ((Boolean) this.d.invoke(obj, byteBuffer, Integer.valueOf(npVar2.b), null, Integer.valueOf(npVar2.c), Integer.valueOf(npVar2.d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z = false;
                                    }
                                    if (!z) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z2 = true;
                                }
                                i3++;
                                z2 = z2;
                            } else if (!z2) {
                                method2.invoke(obj, null);
                            } else if (I(obj) && (H = H(obj)) != null) {
                                return Typeface.create(H, i2);
                            }
                        }
                    }
                } else {
                    int i4 = (i2 & 1) == 0 ? 400 : 700;
                    boolean z3 = (i2 & 2) != 0;
                    int i5 = Integer.MAX_VALUE;
                    np npVar3 = null;
                    for (np npVar4 : npVarArr) {
                        int abs = (Math.abs(npVar4.c - i4) * 2) + (npVar4.d == z3 ? 0 : 1);
                        if (npVar3 == null || i5 > abs) {
                            npVar3 = npVar4;
                            i5 = abs;
                        }
                    }
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(npVar3.a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(npVar3.c).setItalic(npVar3.d).build();
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

    @Override // defpackage.ud0
    public final Typeface h(Context context, Resources resources, int i2, String str) {
        Object obj;
        InputStream inputStream;
        Method method = this.c;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                obj = this.b.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                obj = null;
            }
            if (obj != null) {
                if (!F(context, obj, str, 0, -1, -1, null)) {
                    try {
                        this.f.invoke(obj, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (I(obj)) {
                    return H(obj);
                }
            }
        } else {
            File h2 = zb0.h(context);
            try {
                if (h2 != null) {
                    try {
                        inputStream = resources.openRawResource(i2);
                        try {
                            boolean f = zb0.f(h2, inputStream);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (!f) {
                                h2.delete();
                                return null;
                            }
                            Typeface createFromFile = Typeface.createFromFile(h2.getPath());
                            h2.delete();
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
                h2.delete();
                return null;
            } catch (Throwable th4) {
                h2.delete();
                throw th4;
            }
        }
        return null;
    }
}

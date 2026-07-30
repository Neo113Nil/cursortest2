package defpackage;

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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class a13 extends x03 {
    public final Class f;
    public final Constructor g;
    public final Method h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;

    public a13() {
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
            method2 = v(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = w(cls2);
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
        this.f = cls;
        this.g = constructor;
        this.h = method2;
        this.i = method3;
        this.j = method4;
        this.k = method5;
        this.l = method;
    }

    public static Method v(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // defpackage.x03, defpackage.th2
    public final Typeface d(Context context, zp0 zp0Var, Resources resources, int i) {
        Object obj;
        Method method = this.h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.d(context, zp0Var, resources, i);
        }
        try {
            obj = this.g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            aq0[] aq0VarArr = zp0Var.a;
            int length = aq0VarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    aq0 aq0Var = aq0VarArr[i2];
                    String str = aq0Var.a;
                    int i3 = aq0Var.e;
                    int i4 = aq0Var.b;
                    boolean z = aq0Var.c;
                    FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(aq0Var.d);
                    a13 a13Var = this;
                    Context context2 = context;
                    if (a13Var.s(context2, obj, str, i3, i4, z ? 1 : 0, fromFontVariationSettings)) {
                        i2++;
                        this = a13Var;
                        context = context2;
                    } else {
                        try {
                            a13Var.k.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else {
                    a13 a13Var2 = this;
                    if (a13Var2.u(obj)) {
                        return a13Var2.t(obj);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.x03, defpackage.th2
    public final Typeface e(Context context, mq0[] mq0VarArr, int i) {
        Object obj;
        Typeface t;
        boolean z;
        if (mq0VarArr.length >= 1) {
            Method method = this.h;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (mq0 mq0Var : mq0VarArr) {
                        if (mq0Var.f == 0) {
                            Uri uri = mq0Var.a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, yh2.m(context, uri));
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
                        int length = mq0VarArr.length;
                        int i2 = 0;
                        boolean z2 = false;
                        while (true) {
                            Method method2 = this.k;
                            if (i2 < length) {
                                mq0 mq0Var2 = mq0VarArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(mq0Var2.a);
                                if (byteBuffer != null) {
                                    try {
                                        z = ((Boolean) this.i.invoke(obj, byteBuffer, Integer.valueOf(mq0Var2.b), null, Integer.valueOf(mq0Var2.c), Integer.valueOf(mq0Var2.d ? 1 : 0))).booleanValue();
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
                            } else if (u(obj) && (t = t(obj)) != null) {
                                return Typeface.create(t, i);
                            }
                        }
                    }
                } else {
                    mq0 i3 = th2.i(mq0VarArr, i);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(i3.a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(i3.c).setItalic(i3.d).build();
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

    @Override // defpackage.th2
    public final Typeface g(Context context, Resources resources, int i, String str, int i2) {
        Object obj;
        Method method = this.h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.g(context, resources, i, str, i2);
        }
        try {
            obj = this.g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!s(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.k.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (u(obj)) {
                return t(obj);
            }
        }
        return null;
    }

    public final boolean s(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface t(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean u(Object obj) {
        try {
            return ((Boolean) this.j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method w(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}

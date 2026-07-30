package B;

import a.AbstractC0169a;
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

/* loaded from: classes.dex */
public class j extends h {

    /* renamed from: g, reason: collision with root package name */
    public final Class f165g;

    /* renamed from: h, reason: collision with root package name */
    public final Constructor f166h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f167i;
    public final Method j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f168k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f169l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f170m;

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
            method2 = Y(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = Z(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e7.getClass().getName()), e7);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f165g = cls;
        this.f166h = constructor;
        this.f167i = method2;
        this.j = method3;
        this.f168k = method4;
        this.f169l = method5;
        this.f170m = method;
    }

    public static Method Y(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean V(Context context, Object obj, String str, int i2, int i5, int i7, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f167i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i7), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface W(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f165g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f170m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean X(Object obj) {
        try {
            return ((Boolean) this.f168k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method Z(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // B.h, V6.b
    public final Typeface o(Context context, A.e eVar, Resources resources, int i2) {
        Object obj;
        Method method = this.f167i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.o(context, eVar, resources, i2);
        }
        try {
            obj = this.f166h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            A.f[] fVarArr = eVar.f14a;
            int length = fVarArr.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    A.f fVar = fVarArr[i5];
                    Context context2 = context;
                    if (V(context2, obj, fVar.f15a, fVar.f19e, fVar.f16b, fVar.f17c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.f18d))) {
                        i5++;
                        context = context2;
                    } else {
                        try {
                            this.f169l.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (X(obj)) {
                    return W(obj);
                }
            }
        }
        return null;
    }

    @Override // B.h, V6.b
    public final Typeface p(Context context, F.k[] kVarArr, int i2) {
        Object obj;
        Typeface W4;
        boolean z7;
        if (kVarArr.length >= 1) {
            Method method = this.f167i;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (F.k kVar : kVarArr) {
                        if (kVar.f749f == 0) {
                            Uri uri = kVar.f744a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, AbstractC0169a.s(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.f166h.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = kVarArr.length;
                        int i5 = 0;
                        boolean z8 = false;
                        while (true) {
                            Method method2 = this.f169l;
                            if (i5 < length) {
                                F.k kVar2 = kVarArr[i5];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(kVar2.f744a);
                                if (byteBuffer != null) {
                                    try {
                                        z7 = ((Boolean) this.j.invoke(obj, byteBuffer, Integer.valueOf(kVar2.f745b), null, Integer.valueOf(kVar2.f746c), Integer.valueOf(kVar2.f747d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z7 = false;
                                    }
                                    if (!z7) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z8 = true;
                                }
                                i5++;
                                z8 = z8;
                            } else if (!z8) {
                                method2.invoke(obj, null);
                            } else if (X(obj) && (W4 = W(obj)) != null) {
                                return Typeface.create(W4, i2);
                            }
                        }
                    }
                } else {
                    F.k A7 = V6.b.A(kVarArr, i2);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(A7.f744a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(A7.f746c).setItalic(A7.f747d).build();
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

    @Override // V6.b
    public final Typeface r(Context context, Resources resources, int i2, String str, int i5) {
        Object obj;
        Method method = this.f167i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.r(context, resources, i2, str, i5);
        }
        try {
            obj = this.f166h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!V(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.f169l.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (X(obj)) {
                return W(obj);
            }
        }
        return null;
    }
}

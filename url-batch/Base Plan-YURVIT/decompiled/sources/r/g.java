package r;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.datastore.preferences.protobuf.k0;
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
public class g extends e {

    /* renamed from: j, reason: collision with root package name */
    public final Class f2976j;

    /* renamed from: k, reason: collision with root package name */
    public final Constructor f2977k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f2978l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f2979m;

    /* renamed from: n, reason: collision with root package name */
    public final Method f2980n;

    /* renamed from: o, reason: collision with root package name */
    public final Method f2981o;

    /* renamed from: p, reason: collision with root package name */
    public final Method f2982p;

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
            method2 = R(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = S(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e2.getClass().getName()), e2);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f2976j = cls;
        this.f2977k = constructor;
        this.f2978l = method2;
        this.f2979m = method3;
        this.f2980n = method4;
        this.f2981o = method5;
        this.f2982p = method;
    }

    public static Method R(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean O(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2978l.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface P(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f2976j, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2982p.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean Q(Object obj) {
        try {
            return ((Boolean) this.f2980n.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method S(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // r.e, androidx.datastore.preferences.protobuf.k0
    public final Typeface k(Context context, q.c cVar, Resources resources, int i2) {
        Object obj;
        Method method = this.f2978l;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.k(context, cVar, resources, i2);
        }
        try {
            obj = this.f2977k.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            q.d[] dVarArr = cVar.f2945a;
            int length = dVarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    q.d dVar = dVarArr[i3];
                    Context context2 = context;
                    if (O(context2, obj, dVar.f2946a, dVar.f2950e, dVar.f2947b, dVar.f2948c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.f2949d))) {
                        i3++;
                        context = context2;
                    } else {
                        try {
                            this.f2981o.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (Q(obj)) {
                    return P(obj);
                }
            }
        }
        return null;
    }

    @Override // r.e, androidx.datastore.preferences.protobuf.k0
    public final Typeface l(Context context, v.g[] gVarArr, int i2) {
        Object obj;
        Typeface P2;
        boolean z2;
        if (gVarArr.length >= 1) {
            Method method = this.f2978l;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (v.g gVar : gVarArr) {
                        if (gVar.f3077e == 0) {
                            Uri uri = gVar.f3073a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, k0.w(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.f2977k.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = gVarArr.length;
                        int i3 = 0;
                        boolean z3 = false;
                        while (true) {
                            Method method2 = this.f2981o;
                            if (i3 < length) {
                                v.g gVar2 = gVarArr[i3];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(gVar2.f3073a);
                                if (byteBuffer != null) {
                                    try {
                                        z2 = ((Boolean) this.f2979m.invoke(obj, byteBuffer, Integer.valueOf(gVar2.f3074b), null, Integer.valueOf(gVar2.f3075c), Integer.valueOf(gVar2.f3076d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z2 = false;
                                    }
                                    if (!z2) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z3 = true;
                                }
                                i3++;
                                z3 = z3;
                            } else if (!z3) {
                                method2.invoke(obj, null);
                            } else if (Q(obj) && (P2 = P(obj)) != null) {
                                return Typeface.create(P2, i2);
                            }
                        }
                    }
                } else {
                    v.g r2 = r(gVarArr, i2);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(r2.f3073a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(r2.f3075c).setItalic(r2.f3076d).build();
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

    @Override // androidx.datastore.preferences.protobuf.k0
    public final Typeface n(Context context, Resources resources, int i2, String str, int i3) {
        Object obj;
        Method method = this.f2978l;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.n(context, resources, i2, str, i3);
        }
        try {
            obj = this.f2977k.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!O(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.f2981o.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (Q(obj)) {
                return P(obj);
            }
        }
        return null;
    }
}

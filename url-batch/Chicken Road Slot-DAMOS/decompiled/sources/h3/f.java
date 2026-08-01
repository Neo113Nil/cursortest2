package h3;

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

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class f extends d {

    /* renamed from: f, reason: collision with root package name */
    public final Class f4459f;
    public final Constructor g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f4460h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f4461i;
    public final Method j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f4462k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f4463l;

    public f() {
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
            method2 = n0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = o0(cls2);
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
        this.f4459f = cls;
        this.g = constructor;
        this.f4460h = method2;
        this.f4461i = method3;
        this.j = method4;
        this.f4462k = method5;
        this.f4463l = method;
    }

    public static Method n0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean k0(Context context, Object obj, String str, int i3, int i10, int i11, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f4460h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i3), Integer.valueOf(i10), Integer.valueOf(i11), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface l0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f4459f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f4463l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // h3.d, a.a
    public final Typeface m(Context context, g3.e eVar, Resources resources, int i3) {
        Object obj;
        Method method = this.f4460h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.m(context, eVar, resources, i3);
        }
        try {
            obj = this.g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            g3.f[] fVarArr = eVar.f4241a;
            int length = fVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    g3.f fVar = fVarArr[i10];
                    Context context2 = context;
                    if (k0(context2, obj, fVar.f4242a, fVar.f4246e, fVar.f4243b, fVar.f4244c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fVar.f4245d))) {
                        i10++;
                        context = context2;
                    } else {
                        try {
                            this.f4462k.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (m0(obj)) {
                    return l0(obj);
                }
            }
        }
        return null;
    }

    public final boolean m0(Object obj) {
        try {
            return ((Boolean) this.j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // h3.d, a.a
    public final Typeface n(Context context, l3.h[] hVarArr, int i3) {
        Object obj;
        Typeface l02;
        boolean z10;
        if (hVarArr.length >= 1) {
            Method method = this.f4460h;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (l3.h hVar : hVarArr) {
                        if (hVar.f5858f == 0) {
                            Uri uri = hVar.f5853a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, c6.f.R(context, uri));
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
                        int length = hVarArr.length;
                        int i10 = 0;
                        boolean z11 = false;
                        while (true) {
                            Method method2 = this.f4462k;
                            if (i10 < length) {
                                l3.h hVar2 = hVarArr[i10];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(hVar2.f5853a);
                                if (byteBuffer != null) {
                                    try {
                                        z10 = ((Boolean) this.f4461i.invoke(obj, byteBuffer, Integer.valueOf(hVar2.f5854b), null, Integer.valueOf(hVar2.f5855c), Integer.valueOf(hVar2.f5856d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z10 = false;
                                    }
                                    if (!z10) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z11 = true;
                                }
                                i10++;
                                z11 = z11;
                            } else if (!z11) {
                                method2.invoke(obj, null);
                            } else if (m0(obj) && (l02 = l0(obj)) != null) {
                                return Typeface.create(l02, i3);
                            }
                        }
                    }
                } else {
                    l3.h s3 = a.a.s(hVarArr, i3);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(s3.f5853a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(s3.f5855c).setItalic(s3.f5856d).build();
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

    public Method o0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // a.a
    public final Typeface p(Context context, Resources resources, int i3, String str, int i10) {
        Object obj;
        Method method = this.f4460h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.p(context, resources, i3, str, i10);
        }
        try {
            obj = this.g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!k0(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.f4462k.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (m0(obj)) {
                return l0(obj);
            }
        }
        return null;
    }
}

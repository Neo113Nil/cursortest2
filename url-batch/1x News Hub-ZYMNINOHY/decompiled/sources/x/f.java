package x;

import B.k;
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
import w.C1231b;

/* loaded from: classes.dex */
public class f extends d {

    /* renamed from: h, reason: collision with root package name */
    public final Class f10708h;

    /* renamed from: i, reason: collision with root package name */
    public final Constructor f10709i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f10710j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f10711k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f10712l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f10713m;

    /* renamed from: n, reason: collision with root package name */
    public final Method f10714n;

    public f() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = g0(cls);
            Class cls2 = Integer.TYPE;
            method3 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = h0(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e3.getClass().getName()), e3);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f10708h = cls;
        this.f10709i = constructor;
        this.f10710j = method2;
        this.f10711k = method3;
        this.f10712l = method4;
        this.f10713m = method;
        this.f10714n = method5;
    }

    public static Method g0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void b0(Object obj) {
        try {
            this.f10713m.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean c0(Context context, Object obj, String str, int i3, int i4, int i5, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f10710j.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface d0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f10708h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f10714n.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean e0(Object obj) {
        try {
            return ((Boolean) this.f10712l.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object f0() {
        try {
            return this.f10709i.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method h0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // x.d, android.support.v4.media.session.a
    public final Typeface l(Context context, C1231b c1231b, Resources resources, int i3) {
        Method method = this.f10710j;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.l(context, c1231b, resources, i3);
        }
        Object f02 = f0();
        if (f02 != null) {
            w.c[] cVarArr = c1231b.f10616a;
            int length = cVarArr.length;
            int i4 = 0;
            while (i4 < length) {
                w.c cVar = cVarArr[i4];
                String str = cVar.f10617a;
                FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(cVar.f10620d);
                Context context2 = context;
                if (!c0(context2, f02, str, cVar.f10621e, cVar.f10618b, cVar.f10619c ? 1 : 0, fromFontVariationSettings)) {
                    b0(f02);
                    return null;
                }
                i4++;
                context = context2;
            }
            if (e0(f02)) {
                return d0(f02);
            }
        }
        return null;
    }

    @Override // x.d, android.support.v4.media.session.a
    public final Typeface m(Context context, k[] kVarArr, int i3) {
        Typeface d02;
        boolean z;
        if (kVarArr.length >= 1) {
            Method method = this.f10710j;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap hashMap = new HashMap();
                for (k kVar : kVarArr) {
                    if (kVar.f == 0) {
                        Uri uri = kVar.f103a;
                        if (!hashMap.containsKey(uri)) {
                            hashMap.put(uri, C2.b.B(context, uri));
                        }
                    }
                }
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                Object f02 = f0();
                if (f02 != null) {
                    int length = kVarArr.length;
                    int i4 = 0;
                    boolean z2 = false;
                    while (i4 < length) {
                        k kVar2 = kVarArr[i4];
                        ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(kVar2.f103a);
                        if (byteBuffer != null) {
                            try {
                                z = ((Boolean) this.f10711k.invoke(f02, byteBuffer, Integer.valueOf(kVar2.f104b), null, Integer.valueOf(kVar2.f105c), Integer.valueOf(kVar2.f106d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                z = false;
                            }
                            if (!z) {
                                b0(f02);
                                return null;
                            }
                            z2 = true;
                        }
                        i4++;
                        z2 = z2;
                    }
                    if (!z2) {
                        b0(f02);
                        return null;
                    }
                    if (e0(f02) && (d02 = d0(f02)) != null) {
                        return Typeface.create(d02, i3);
                    }
                }
            } else {
                k w3 = w(kVarArr, i3);
                try {
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(w3.f103a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(w3.f105c).setItalic(w3.f106d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }

    @Override // android.support.v4.media.session.a
    public final Typeface p(Context context, Resources resources, int i3, String str, int i4) {
        Method method = this.f10710j;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.p(context, resources, i3, str, i4);
        }
        Object f02 = f0();
        if (f02 != null) {
            if (!c0(context, f02, str, 0, -1, -1, null)) {
                b0(f02);
                return null;
            }
            if (e0(f02)) {
                return d0(f02);
            }
        }
        return null;
    }
}

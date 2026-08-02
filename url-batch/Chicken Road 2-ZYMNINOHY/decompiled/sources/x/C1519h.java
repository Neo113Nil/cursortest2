package x;

import B.l;
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
import w.C1482b;
import w.C1483c;

/* renamed from: x.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1519h extends C1517f {

    /* renamed from: h, reason: collision with root package name */
    public final Class f15971h;

    /* renamed from: i, reason: collision with root package name */
    public final Constructor f15972i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f15973j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f15974k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f15975l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f15976m;
    public final Method n;

    public C1519h() {
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
            method2 = M(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = N(cls2);
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
        this.f15971h = cls;
        this.f15972i = constructor;
        this.f15973j = method2;
        this.f15974k = method3;
        this.f15975l = method4;
        this.f15976m = method5;
        this.n = method;
    }

    public static Method M(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean J(Context context, Object obj, String str, int i4, int i5, int i6, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f15973j.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface K(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f15971h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.n.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean L(Object obj) {
        try {
            return ((Boolean) this.f15975l.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method N(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // x.C1517f, O3.l
    public final Typeface i(Context context, C1482b c1482b, Resources resources, int i4) {
        Object obj;
        Method method = this.f15973j;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.i(context, c1482b, resources, i4);
        }
        try {
            obj = this.f15972i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            C1483c[] c1483cArr = c1482b.f15725a;
            int length = c1483cArr.length;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    C1483c c1483c = c1483cArr[i5];
                    Context context2 = context;
                    if (J(context2, obj, c1483c.f15726a, c1483c.f15730e, c1483c.f15727b, c1483c.f15728c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c1483c.f15729d))) {
                        i5++;
                        context = context2;
                    } else {
                        try {
                            this.f15976m.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (L(obj)) {
                    return K(obj);
                }
            }
        }
        return null;
    }

    @Override // x.C1517f, O3.l
    public final Typeface j(Context context, l[] lVarArr, int i4) {
        Object obj;
        Typeface K2;
        boolean z;
        if (lVarArr.length >= 1) {
            Method method = this.f15973j;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (l lVar : lVarArr) {
                        if (lVar.f183f == 0) {
                            Uri uri = lVar.f178a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, U.i.r(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.f15972i.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = lVarArr.length;
                        int i5 = 0;
                        boolean z4 = false;
                        while (true) {
                            Method method2 = this.f15976m;
                            if (i5 < length) {
                                l lVar2 = lVarArr[i5];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(lVar2.f178a);
                                if (byteBuffer != null) {
                                    try {
                                        z = ((Boolean) this.f15974k.invoke(obj, byteBuffer, Integer.valueOf(lVar2.f179b), null, Integer.valueOf(lVar2.f180c), Integer.valueOf(lVar2.f181d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z = false;
                                    }
                                    if (!z) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z4 = true;
                                }
                                i5++;
                                z4 = z4;
                            } else if (!z4) {
                                method2.invoke(obj, null);
                            } else if (L(obj) && (K2 = K(obj)) != null) {
                                return Typeface.create(K2, i4);
                            }
                        }
                    }
                } else {
                    l q4 = q(lVarArr, i4);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(q4.f178a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(q4.f180c).setItalic(q4.f181d).build();
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

    @Override // O3.l
    public final Typeface m(Context context, Resources resources, int i4, String str, int i5) {
        Object obj;
        Method method = this.f15973j;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.m(context, resources, i4, str, i5);
        }
        try {
            obj = this.f15972i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!J(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.f15976m.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (L(obj)) {
                return K(obj);
            }
        }
        return null;
    }
}

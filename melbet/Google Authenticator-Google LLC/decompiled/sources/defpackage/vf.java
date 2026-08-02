package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import j$.nio.channels.DesugarChannels;
import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vf extends ve {
    protected final Class a;
    protected final Constructor b;
    protected final Method c;
    protected final Method d;
    protected final Method e;
    protected final Method f;
    protected final Method g;

    public vf() {
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
            Class<?> cls3 = Integer.TYPE;
            method2 = cls2.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, Boolean.TYPE, cls3, cls3, cls3, FontVariationAxis[].class);
            Class<?> cls4 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls4, FontVariationAxis[].class, cls4, cls4);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = e(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(String.valueOf(e.getClass().getName())), e);
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

    private final Object h() {
        try {
            return this.b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private final void i(Object obj) {
        try {
            this.f.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private final boolean j(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.c.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private final boolean k(Object obj) {
        try {
            return ((Boolean) this.e.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private final boolean l() {
        Method method = this.c;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    @Override // defpackage.ve, defpackage.vl
    public final Typeface a(Context context, wh[] whVarArr, int i) {
        Typeface c;
        MappedByteBuffer mappedByteBuffer;
        ParcelFileDescriptor openFileDescriptor;
        Typeface.Builder weight;
        Typeface.Builder italic;
        Typeface build;
        if (whVarArr.length <= 0) {
            return null;
        }
        if (l()) {
            HashMap hashMap = new HashMap();
            for (wh whVar : whVarArr) {
                if (whVar.e == 0) {
                    Object obj = whVar.f;
                    if (hashMap.containsKey(obj)) {
                        continue;
                    } else {
                        try {
                            openFileDescriptor = context.getContentResolver().openFileDescriptor((Uri) obj, "r", null);
                        } catch (IOException unused) {
                        }
                        if (openFileDescriptor != null) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                                try {
                                    FileChannel convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                                    mappedByteBuffer = convertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, convertMaybeLegacyFileChannelFromLibrary.size());
                                    fileInputStream.close();
                                    openFileDescriptor.close();
                                    hashMap.put(obj, mappedByteBuffer);
                                } finally {
                                }
                            } finally {
                            }
                        }
                        mappedByteBuffer = null;
                        hashMap.put(obj, mappedByteBuffer);
                    }
                }
            }
            Map unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap);
            Object h = h();
            if (h == null) {
                return null;
            }
            int length = whVarArr.length;
            int i2 = 0;
            boolean z = false;
            while (i2 < length) {
                wh whVar2 = whVarArr[i2];
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(whVar2.f);
                if (byteBuffer != null) {
                    if (!((Boolean) this.d.invoke(h, byteBuffer, Integer.valueOf(whVar2.a), null, Integer.valueOf(whVar2.b), Integer.valueOf(whVar2.c ? 1 : 0))).booleanValue()) {
                        i(h);
                        return null;
                    }
                    z = true;
                }
                i2++;
                z = z;
            }
            if (!z) {
                i(h);
                return null;
            }
            if (k(h) && (c = c(h)) != null) {
                return Typeface.create(c, i);
            }
            return null;
        }
        wh f = f(whVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor2 = context.getContentResolver().openFileDescriptor((Uri) f.f, "r", null);
            if (openFileDescriptor2 == null) {
                return null;
            }
            try {
                weight = new Typeface.Builder(openFileDescriptor2.getFileDescriptor()).setWeight(f.b);
                italic = weight.setItalic(f.c);
                build = italic.build();
                openFileDescriptor2.close();
                return build;
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    @Override // defpackage.ve, defpackage.vl
    public final Typeface b(Context context, brn brnVar, Resources resources, int i) {
        FontVariationAxis[] fromFontVariationSettings;
        if (!l()) {
            return super.b(context, brnVar, resources, i);
        }
        Object h = h();
        if (h != null) {
            wh[] whVarArr = (wh[]) brnVar.a;
            int length = whVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                wh whVar = whVarArr[i2];
                Object obj = whVar.f;
                int i3 = whVar.a;
                int i4 = whVar.b;
                boolean z = whVar.c;
                fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(whVar.d);
                String str = (String) obj;
                vf vfVar = this;
                Context context2 = context;
                if (!vfVar.j(context2, h, str, i3, i4, z ? 1 : 0, fromFontVariationSettings)) {
                    vfVar.i(h);
                    return null;
                }
                i2++;
                this = vfVar;
                context = context2;
            }
            vf vfVar2 = this;
            if (vfVar2.k(h)) {
                return vfVar2.c(h);
            }
        }
        return null;
    }

    protected Typeface c(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.vl
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        if (!l()) {
            return super.d(context, resources, i, str, i2);
        }
        Object h = h();
        if (h != null) {
            if (!j(context, h, str, 0, -1, -1, null)) {
                i(h);
                return null;
            }
            if (k(h)) {
                return c(h);
            }
        }
        return null;
    }

    protected Method e(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}

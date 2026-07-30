package B;

import a.AbstractC0169a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import u.C0939j;

/* loaded from: classes.dex */
public final class i extends V6.b {

    /* renamed from: b, reason: collision with root package name */
    public static final Class f161b;

    /* renamed from: c, reason: collision with root package name */
    public static final Constructor f162c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f163d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f164e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi24Impl", e7.getClass().getName(), e7);
            cls = null;
            method = null;
            method2 = null;
        }
        f162c = constructor;
        f161b = cls;
        f163d = method2;
        f164e = method;
    }

    public static boolean T(Object obj, ByteBuffer byteBuffer, int i2, int i5, boolean z7) {
        try {
            return ((Boolean) f163d.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i5), Boolean.valueOf(z7))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface U(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f161b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f164e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // V6.b
    public final Typeface o(Context context, A.e eVar, Resources resources, int i2) {
        Object obj;
        int i5;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f162c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (A.f fVar : eVar.f14a) {
                int i7 = fVar.f20f;
                File l7 = AbstractC0169a.l(context);
                if (l7 != null) {
                    try {
                        if (AbstractC0169a.e(l7, resources, i7)) {
                            try {
                                fileInputStream = new FileInputStream(l7);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i5 = (mappedByteBuffer != null && T(obj, mappedByteBuffer, fVar.f19e, fVar.f16b, fVar.f17c)) ? i5 + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        l7.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return U(obj);
        }
        return null;
    }

    @Override // V6.b
    public final Typeface p(Context context, F.k[] kVarArr, int i2) {
        Object obj;
        try {
            obj = f162c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i5 = 0;
            C0939j c0939j = new C0939j(0);
            int length = kVarArr.length;
            while (true) {
                if (i5 < length) {
                    F.k kVar = kVarArr[i5];
                    Uri uri = kVar.f744a;
                    ByteBuffer byteBuffer = (ByteBuffer) c0939j.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = AbstractC0169a.s(context, uri);
                        c0939j.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !T(obj, byteBuffer, kVar.f745b, kVar.f746c, kVar.f747d)) {
                        break;
                    }
                    i5++;
                } else {
                    Typeface U4 = U(obj);
                    if (U4 != null) {
                        return Typeface.create(U4, i2);
                    }
                }
            }
        }
        return null;
    }
}

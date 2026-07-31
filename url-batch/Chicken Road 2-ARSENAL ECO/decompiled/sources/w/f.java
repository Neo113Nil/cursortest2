package w;

import A.k;
import a.AbstractC0219a;
import a1.AbstractC0223a;
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
import q.C0591k;
import v.C0698c;
import v.C0699d;

/* loaded from: classes.dex */
public final class f extends AbstractC0219a {

    /* renamed from: e, reason: collision with root package name */
    public static final Class f6138e;

    /* renamed from: f, reason: collision with root package name */
    public static final Constructor f6139f;

    /* renamed from: g, reason: collision with root package name */
    public static final Method f6140g;

    /* renamed from: h, reason: collision with root package name */
    public static final Method f6141h;

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
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi24Impl", e4.getClass().getName(), e4);
            cls = null;
            method = null;
            method2 = null;
        }
        f6139f = constructor;
        f6138e = cls;
        f6140g = method2;
        f6141h = method;
    }

    public static boolean S(Object obj, ByteBuffer byteBuffer, int i7, int i8, boolean z5) {
        try {
            return ((Boolean) f6140g.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i8), Boolean.valueOf(z5))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface T(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f6138e, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f6141h.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // a.AbstractC0219a
    public final Typeface g(Context context, C0698c c0698c, Resources resources, int i7) {
        Object obj;
        int i8;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f6139f.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (C0699d c0699d : c0698c.f6041a) {
                int i9 = c0699d.f6047f;
                File z5 = AbstractC0223a.z(context);
                if (z5 != null) {
                    try {
                        if (AbstractC0223a.o(z5, resources, i9)) {
                            try {
                                fileInputStream = new FileInputStream(z5);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i8 = (mappedByteBuffer != null && S(obj, mappedByteBuffer, c0699d.f6046e, c0699d.f6043b, c0699d.f6044c)) ? i8 + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        z5.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return T(obj);
        }
        return null;
    }

    @Override // a.AbstractC0219a
    public final Typeface h(Context context, k[] kVarArr, int i7) {
        Object obj;
        try {
            obj = f6139f.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            C0591k c0591k = new C0591k();
            int length = kVarArr.length;
            int i8 = 0;
            while (true) {
                if (i8 < length) {
                    k kVar = kVarArr[i8];
                    Uri uri = kVar.f28a;
                    ByteBuffer byteBuffer = (ByteBuffer) c0591k.getOrDefault(uri, null);
                    if (byteBuffer == null) {
                        byteBuffer = AbstractC0223a.C(context, uri);
                        c0591k.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !S(obj, byteBuffer, kVar.f29b, kVar.f30c, kVar.f31d)) {
                        break;
                    }
                    i8++;
                } else {
                    Typeface T6 = T(obj);
                    if (T6 != null) {
                        return Typeface.create(T6, i7);
                    }
                }
            }
        }
        return null;
    }
}

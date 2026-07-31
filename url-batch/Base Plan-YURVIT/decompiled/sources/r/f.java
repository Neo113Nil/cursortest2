package r;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import androidx.datastore.preferences.protobuf.k0;
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

/* loaded from: classes.dex */
public final class f extends k0 {

    /* renamed from: e, reason: collision with root package name */
    public static final Class f2972e;

    /* renamed from: f, reason: collision with root package name */
    public static final Constructor f2973f;

    /* renamed from: g, reason: collision with root package name */
    public static final Method f2974g;

    /* renamed from: h, reason: collision with root package name */
    public static final Method f2975h;

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
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f2973f = constructor;
        f2972e = cls;
        f2974g = method2;
        f2975h = method;
    }

    public static boolean M(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z2) {
        try {
            return ((Boolean) f2974g.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface N(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f2972e, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2975h.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final Typeface k(Context context, q.c cVar, Resources resources, int i2) {
        Object obj;
        int i3;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f2973f.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (q.d dVar : cVar.f2945a) {
                int i4 = dVar.f2951f;
                File u2 = k0.u(context);
                if (u2 != null) {
                    try {
                        if (k0.i(u2, resources, i4)) {
                            try {
                                fileInputStream = new FileInputStream(u2);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i3 = (mappedByteBuffer != null && M(obj, mappedByteBuffer, dVar.f2950e, dVar.f2947b, dVar.f2948c)) ? i3 + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        u2.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return N(obj);
        }
        return null;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public final Typeface l(Context context, v.g[] gVarArr, int i2) {
        Object obj;
        try {
            obj = f2973f.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            m.i iVar = new m.i();
            int length = gVarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    v.g gVar = gVarArr[i3];
                    Uri uri = gVar.f3073a;
                    ByteBuffer byteBuffer = (ByteBuffer) iVar.getOrDefault(uri, null);
                    if (byteBuffer == null) {
                        byteBuffer = k0.w(context, uri);
                        iVar.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !M(obj, byteBuffer, gVar.f3074b, gVar.f3075c, gVar.f3076d)) {
                        break;
                    }
                    i3++;
                } else {
                    Typeface N2 = N(obj);
                    if (N2 != null) {
                        return Typeface.create(N2, i2);
                    }
                }
            }
        }
        return null;
    }
}

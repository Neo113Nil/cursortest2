package x;

import O3.l;
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
import w.C1482b;
import w.C1483c;

/* renamed from: x.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1518g extends l {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f15967c;

    /* renamed from: d, reason: collision with root package name */
    public static final Constructor f15968d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f15969e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f15970f;

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
        f15968d = constructor;
        f15967c = cls;
        f15969e = method2;
        f15970f = method;
    }

    public static boolean H(Object obj, ByteBuffer byteBuffer, int i4, int i5, boolean z) {
        try {
            return ((Boolean) f15969e.invoke(obj, byteBuffer, Integer.valueOf(i4), null, Integer.valueOf(i5), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface I(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f15967c, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f15970f.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // O3.l
    public final Typeface i(Context context, C1482b c1482b, Resources resources, int i4) {
        Object obj;
        int i5;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f15968d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (C1483c c1483c : c1482b.f15725a) {
                int i6 = c1483c.f15731f;
                File k4 = U.i.k(context);
                if (k4 != null) {
                    try {
                        if (U.i.e(k4, resources, i6)) {
                            try {
                                fileInputStream = new FileInputStream(k4);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i5 = (mappedByteBuffer != null && H(obj, mappedByteBuffer, c1483c.f15730e, c1483c.f15727b, c1483c.f15728c)) ? i5 + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        k4.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return I(obj);
        }
        return null;
    }

    @Override // O3.l
    public final Typeface j(Context context, B.l[] lVarArr, int i4) {
        Object obj;
        try {
            obj = f15968d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i5 = 0;
            p.j jVar = new p.j(0);
            int length = lVarArr.length;
            while (true) {
                if (i5 < length) {
                    B.l lVar = lVarArr[i5];
                    Uri uri = lVar.f178a;
                    ByteBuffer byteBuffer = (ByteBuffer) jVar.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = U.i.r(context, uri);
                        jVar.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !H(obj, byteBuffer, lVar.f179b, lVar.f180c, lVar.f181d)) {
                        break;
                    }
                    i5++;
                } else {
                    Typeface I4 = I(obj);
                    if (I4 != null) {
                        return Typeface.create(I4, i4);
                    }
                }
            }
        }
        return null;
    }
}

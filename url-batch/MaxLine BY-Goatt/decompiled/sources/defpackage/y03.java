package defpackage;

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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class y03 extends th2 {
    public static final Class a;
    public static final Constructor b;
    public static final Method c;
    public static final Method d;

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
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    public static boolean q(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface r(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.th2
    public final Typeface d(Context context, zp0 zp0Var, Resources resources, int i) {
        Object obj;
        int i2;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (aq0 aq0Var : zp0Var.a) {
                int i3 = aq0Var.f;
                File k = yh2.k(context);
                if (k != null) {
                    try {
                        if (yh2.g(k, resources, i3)) {
                            try {
                                fileInputStream = new FileInputStream(k);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i2 = (mappedByteBuffer != null && q(obj, mappedByteBuffer, aq0Var.e, aq0Var.b, aq0Var.c)) ? i2 + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        k.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return r(obj);
        }
        return null;
    }

    @Override // defpackage.th2
    public final Typeface e(Context context, mq0[] mq0VarArr, int i) {
        Object obj;
        try {
            obj = b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i2 = 0;
            fl2 fl2Var = new fl2(0);
            int length = mq0VarArr.length;
            while (true) {
                if (i2 < length) {
                    mq0 mq0Var = mq0VarArr[i2];
                    Uri uri = mq0Var.a;
                    ByteBuffer byteBuffer = (ByteBuffer) fl2Var.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = yh2.m(context, uri);
                        fl2Var.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !q(obj, byteBuffer, mq0Var.b, mq0Var.c, mq0Var.d)) {
                        break;
                    }
                    i2++;
                } else {
                    Typeface r = r(obj);
                    if (r != null) {
                        return Typeface.create(r, i);
                    }
                }
            }
        }
        return null;
    }
}

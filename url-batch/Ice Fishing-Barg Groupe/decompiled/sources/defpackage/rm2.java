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

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rm2 extends vi0 {
    public static final Method RAsUl2FVSrh6;
    public static final Class Y1f8riQaR6yg;
    public static final Method a92UlCVFR9N8;
    public static final Constructor e9gEMXR7LXtO;

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
        e9gEMXR7LXtO = constructor;
        Y1f8riQaR6yg = cls;
        a92UlCVFR9N8 = method2;
        RAsUl2FVSrh6 = method;
    }

    public static Typeface jJwa0q7P5wHq(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) Y1f8riQaR6yg, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) RAsUl2FVSrh6.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean qudtW7lwm99e(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) a92UlCVFR9N8.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // defpackage.vi0
    public final Typeface dgRBjINgWbAK(Context context, jc0 jc0Var, Resources resources) {
        Object obj;
        int i;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = e9gEMXR7LXtO.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (kc0 kc0Var : jc0Var.PxuCJdSBwIXG) {
                int i2 = kc0Var.a92UlCVFR9N8;
                File ozEBbv0hFTAB = xi0.ozEBbv0hFTAB(context);
                if (ozEBbv0hFTAB != null) {
                    try {
                        if (xi0.XL4ISE6Oc65B(ozEBbv0hFTAB, resources, i2)) {
                            try {
                                fileInputStream = new FileInputStream(ozEBbv0hFTAB);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i = (mappedByteBuffer != null && qudtW7lwm99e(obj, mappedByteBuffer, kc0Var.e9gEMXR7LXtO, kc0Var.lS5Rgt96tfkO, kc0Var.TSizfFm2Yiuu)) ? i + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        ozEBbv0hFTAB.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return jJwa0q7P5wHq(obj);
        }
        return null;
    }

    @Override // defpackage.vi0
    public final Typeface x50lh2ztY7Y5(Context context, zc0[] zc0VarArr) {
        Object obj;
        try {
            obj = e9gEMXR7LXtO.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            t52 t52Var = new t52(0);
            int length = zc0VarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    zc0 zc0Var = zc0VarArr[i];
                    Uri uri = zc0Var.PxuCJdSBwIXG;
                    ByteBuffer byteBuffer = (ByteBuffer) t52Var.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = xi0.Pf0ThKz3j5YS(context, uri);
                        t52Var.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !qudtW7lwm99e(obj, byteBuffer, zc0Var.lS5Rgt96tfkO, zc0Var.TSizfFm2Yiuu, zc0Var.Y1f8riQaR6yg)) {
                        break;
                    }
                    i++;
                } else {
                    Typeface jJwa0q7P5wHq = jJwa0q7P5wHq(obj);
                    if (jJwa0q7P5wHq != null) {
                        return Typeface.create(jJwa0q7P5wHq, 0);
                    }
                }
            }
        }
        return null;
    }
}

package i3;

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
import o.t0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i extends h0.a {

    /* renamed from: b, reason: collision with root package name */
    public static final Class f3436b;

    /* renamed from: c, reason: collision with root package name */
    public static final Constructor f3437c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f3438d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f3439e;

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
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi24Impl", e8.getClass().getName(), e8);
            cls = null;
            method = null;
            method2 = null;
        }
        f3437c = constructor;
        f3436b = cls;
        f3438d = method2;
        f3439e = method;
    }

    public static boolean X(Object obj, ByteBuffer byteBuffer, int i, int i8, boolean z3) {
        try {
            return ((Boolean) f3438d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i8), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface Y(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f3436b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3439e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // h0.a
    public final Typeface s(Context context, h3.e eVar, Resources resources, int i) {
        Object obj;
        int i8;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f3437c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (h3.f fVar : eVar.f3131a) {
                int i9 = fVar.f3137f;
                File D = m.a.D(context);
                if (D != null) {
                    try {
                        if (m.a.l(D, resources, i9)) {
                            try {
                                fileInputStream = new FileInputStream(D);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i8 = (mappedByteBuffer != null && X(obj, mappedByteBuffer, fVar.f3136e, fVar.f3133b, fVar.f3134c)) ? i8 + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        D.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return Y(obj);
        }
        return null;
    }

    @Override // h0.a
    public final Typeface t(Context context, n3.h[] hVarArr, int i) {
        Object obj;
        try {
            obj = f3437c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i8 = 0;
            t0 t0Var = new t0(0);
            int length = hVarArr.length;
            while (true) {
                if (i8 < length) {
                    n3.h hVar = hVarArr[i8];
                    Uri uri = hVar.f5359a;
                    ByteBuffer byteBuffer = (ByteBuffer) t0Var.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = m.a.H(context, uri);
                        t0Var.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !X(obj, byteBuffer, hVar.f5360b, hVar.f5361c, hVar.f5362d)) {
                        break;
                    }
                    i8++;
                } else {
                    Typeface Y = Y(obj);
                    if (Y != null) {
                        return Typeface.create(Y, i);
                    }
                }
            }
        }
        return null;
    }
}

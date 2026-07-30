package p;

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

/* loaded from: classes.dex */
public final class f extends o.g {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f2819a;

    /* renamed from: b, reason: collision with root package name */
    public static final Constructor f2820b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f2821c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f2822d;

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
        f2820b = constructor;
        f2819a = cls;
        f2821c = method2;
        f2822d = method;
    }

    public static boolean B(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z2) {
        try {
            return ((Boolean) f2821c.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface C(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f2819a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2822d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[SYNTHETIC] */
    @Override // o.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface g(Context context, o.c cVar, Resources resources, int i2) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f2820b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (o.d dVar : cVar.f2792a) {
            int i3 = dVar.f2798f;
            File q2 = o.g.q(context);
            if (q2 != null) {
                try {
                    if (o.g.d(q2, resources, i3)) {
                        try {
                            fileInputStream = new FileInputStream(q2);
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            if (mappedByteBuffer != null) {
                                return null;
                            }
                            if (!B(obj, mappedByteBuffer, dVar.f2797e, dVar.f2794b, dVar.f2795c)) {
                                return null;
                            }
                        } finally {
                        }
                    }
                } finally {
                    q2.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
            }
        }
        return C(obj);
    }

    @Override // o.g
    public final Typeface h(Context context, t.h[] hVarArr, int i2) {
        Object obj;
        try {
            obj = f2820b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        k.i iVar = new k.i();
        for (t.h hVar : hVarArr) {
            Uri uri = hVar.f2983a;
            ByteBuffer byteBuffer = (ByteBuffer) iVar.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = o.g.v(context, uri);
                iVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (!B(obj, byteBuffer, hVar.f2984b, hVar.f2985c, hVar.f2986d)) {
                return null;
            }
        }
        Typeface C2 = C(obj);
        if (C2 == null) {
            return null;
        }
        return Typeface.create(C2, i2);
    }
}

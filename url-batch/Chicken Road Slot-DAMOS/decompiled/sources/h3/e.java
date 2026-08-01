package h3;

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
import s.r0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends a.a {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f4455a;

    /* renamed from: b, reason: collision with root package name */
    public static final Constructor f4456b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f4457c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f4458d;

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
        f4456b = constructor;
        f4455a = cls;
        f4457c = method2;
        f4458d = method;
    }

    public static boolean i0(Object obj, ByteBuffer byteBuffer, int i3, int i10, boolean z10) {
        try {
            return ((Boolean) f4457c.invoke(obj, byteBuffer, Integer.valueOf(i3), null, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface j0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f4455a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f4458d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // a.a
    public final Typeface m(Context context, g3.e eVar, Resources resources, int i3) {
        Object obj;
        int i10;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f4456b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (g3.f fVar : eVar.f4241a) {
                int i11 = fVar.f4247f;
                File J = c6.f.J(context);
                if (J != null) {
                    try {
                        if (c6.f.q(J, resources, i11)) {
                            try {
                                fileInputStream = new FileInputStream(J);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i10 = (mappedByteBuffer != null && i0(obj, mappedByteBuffer, fVar.f4246e, fVar.f4243b, fVar.f4244c)) ? i10 + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        J.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return j0(obj);
        }
        return null;
    }

    @Override // a.a
    public final Typeface n(Context context, l3.h[] hVarArr, int i3) {
        Object obj;
        try {
            obj = f4456b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i10 = 0;
            r0 r0Var = new r0(0);
            int length = hVarArr.length;
            while (true) {
                if (i10 < length) {
                    l3.h hVar = hVarArr[i10];
                    Uri uri = hVar.f5853a;
                    ByteBuffer byteBuffer = (ByteBuffer) r0Var.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = c6.f.R(context, uri);
                        r0Var.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !i0(obj, byteBuffer, hVar.f5854b, hVar.f5855c, hVar.f5856d)) {
                        break;
                    }
                    i10++;
                } else {
                    Typeface j02 = j0(obj);
                    if (j02 != null) {
                        return Typeface.create(j02, i3);
                    }
                }
            }
        }
        return null;
    }
}

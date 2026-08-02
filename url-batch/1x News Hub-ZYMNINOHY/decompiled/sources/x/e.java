package x;

import B.k;
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
import p.C1174j;
import w.C1231b;

/* loaded from: classes.dex */
public final class e extends android.support.v4.media.session.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f10705c;

    /* renamed from: d, reason: collision with root package name */
    public static final Constructor f10706d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f10707e;
    public static final Method f;

    static {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi24Impl", e3.getClass().getName(), e3);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
        }
        f10706d = constructor;
        f10705c = cls;
        f10707e = method;
        f = method2;
    }

    public static boolean Z(Object obj, ByteBuffer byteBuffer, int i3, int i4, boolean z) {
        try {
            return ((Boolean) f10707e.invoke(obj, byteBuffer, Integer.valueOf(i3), null, Integer.valueOf(i4), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface a0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f10705c, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[SYNTHETIC] */
    @Override // android.support.v4.media.session.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface l(Context context, C1231b c1231b, Resources resources, int i3) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f10706d.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (w.c cVar : c1231b.f10616a) {
                int i4 = cVar.f;
                File t3 = C2.b.t(context);
                if (t3 != null) {
                    try {
                        if (C2.b.g(t3, resources, i4)) {
                            try {
                                fileInputStream = new FileInputStream(t3);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (mappedByteBuffer == null) {
                                    if (Z(obj, mappedByteBuffer, cVar.f10621e, cVar.f10618b, cVar.f10619c)) {
                                    }
                                }
                            } finally {
                            }
                        }
                    } finally {
                        t3.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer == null) {
                }
            }
            return a0(obj);
        }
        return null;
    }

    @Override // android.support.v4.media.session.a
    public final Typeface m(Context context, k[] kVarArr, int i3) {
        Object obj;
        int i4 = 0;
        try {
            obj = f10706d.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            C1174j c1174j = new C1174j(0);
            int length = kVarArr.length;
            while (true) {
                if (i4 >= length) {
                    Typeface a02 = a0(obj);
                    if (a02 != null) {
                        return Typeface.create(a02, i3);
                    }
                } else {
                    k kVar = kVarArr[i4];
                    Uri uri = kVar.f103a;
                    ByteBuffer byteBuffer = (ByteBuffer) c1174j.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = C2.b.B(context, uri);
                        c1174j.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null) {
                        break;
                    }
                    if (!Z(obj, byteBuffer, kVar.f104b, kVar.f105c, kVar.f106d)) {
                        break;
                    }
                    i4++;
                }
            }
        }
        return null;
    }
}

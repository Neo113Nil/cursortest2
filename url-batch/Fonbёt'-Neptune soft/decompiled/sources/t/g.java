package t;

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
import n.C0276i;
import s.C0295f;
import s.C0296g;
import u0.AbstractC0310a;
import x.C0329h;

/* loaded from: classes.dex */
public final class g extends i1.a {

    /* renamed from: i, reason: collision with root package name */
    public static final Class f3450i;

    /* renamed from: j, reason: collision with root package name */
    public static final Constructor f3451j;

    /* renamed from: k, reason: collision with root package name */
    public static final Method f3452k;

    /* renamed from: l, reason: collision with root package name */
    public static final Method f3453l;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f3451j = constructor;
        f3450i = cls;
        f3452k = method2;
        f3453l = method;
    }

    public static boolean O(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z2) {
        try {
            return ((Boolean) f3452k.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface P(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f3450i, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3453l.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[SYNTHETIC] */
    @Override // i1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface c(Context context, C0295f c0295f, Resources resources, int i2) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f3451j.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (C0296g c0296g : c0295f.f3405a) {
            int i3 = c0296g.f3411f;
            File d2 = AbstractC0310a.d(context);
            if (d2 != null) {
                try {
                    if (AbstractC0310a.b(d2, resources, i3)) {
                        try {
                            fileInputStream = new FileInputStream(d2);
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
                            if (!O(obj, mappedByteBuffer, c0296g.f3410e, c0296g.f3407b, c0296g.f3408c)) {
                                return null;
                            }
                        } finally {
                        }
                    }
                } finally {
                    d2.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
            }
        }
        return P(obj);
    }

    @Override // i1.a
    public final Typeface d(Context context, C0329h[] c0329hArr, int i2) {
        Object obj;
        try {
            obj = f3451j.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        C0276i c0276i = new C0276i();
        for (C0329h c0329h : c0329hArr) {
            Uri uri = c0329h.f3583a;
            ByteBuffer byteBuffer = (ByteBuffer) c0276i.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = AbstractC0310a.e(context, uri);
                c0276i.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (!O(obj, byteBuffer, c0329h.f3584b, c0329h.f3585c, c0329h.f3586d)) {
                return null;
            }
        }
        Typeface P2 = P(obj);
        if (P2 == null) {
            return null;
        }
        return Typeface.create(P2, i2);
    }
}

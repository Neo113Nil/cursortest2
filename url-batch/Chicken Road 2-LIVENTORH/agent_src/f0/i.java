package f0;

import a.y;
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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class i extends y {

    /* renamed from: n, reason: collision with root package name */
    public static final Class f1280n;

    /* renamed from: o, reason: collision with root package name */
    public static final Constructor f1281o;

    /* renamed from: p, reason: collision with root package name */
    public static final Method f1282p;

    /* renamed from: q, reason: collision with root package name */
    public static final Method f1283q;

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
        f1281o = constructor;
        f1280n = cls;
        f1282p = method2;
        f1283q = method;
    }

    public static boolean W(Object obj, ByteBuffer byteBuffer, int i, int i4, boolean z3) {
        try {
            return ((Boolean) f1282p.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i4), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface X(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f1280n, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f1283q.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // a.y
    public final Typeface r(Context context, e0.f fVar, Resources resources, int i) {
        Object obj;
        int i4;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f1281o.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (e0.g gVar : fVar.f1141a) {
                int i5 = gVar.f1146f;
                File G = y.G(context);
                if (G != null) {
                    try {
                        if (y.o(G, resources, i5)) {
                            try {
                                fileInputStream = new FileInputStream(G);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i4 = (mappedByteBuffer != null && W(obj, mappedByteBuffer, gVar.f1145e, gVar.f1143b, gVar.f1144c)) ? i4 + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        G.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return X(obj);
        }
        return null;
    }

    @Override // a.y
    public final Typeface s(Context context, k0.i[] iVarArr, int i) {
        Object obj;
        try {
            obj = f1281o.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i4 = 0;
            q.j jVar = new q.j(0);
            int length = iVarArr.length;
            while (true) {
                if (i4 < length) {
                    k0.i iVar = iVarArr[i4];
                    Uri uri = iVar.f2150a;
                    ByteBuffer byteBuffer = (ByteBuffer) jVar.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = y.K(context, uri);
                        jVar.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !W(obj, byteBuffer, iVar.f2151b, iVar.f2152c, iVar.d)) {
                        break;
                    }
                    i4++;
                } else {
                    Typeface X = X(obj);
                    if (X != null) {
                        return Typeface.create(X, i);
                    }
                }
            }
        }
        return null;
    }
}

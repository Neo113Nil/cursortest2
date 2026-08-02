package x;

import O3.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import w.C1482b;
import w.C1483c;

/* renamed from: x.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1517f extends l {

    /* renamed from: c, reason: collision with root package name */
    public static Class f15962c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Constructor f15963d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f15964e = null;

    /* renamed from: f, reason: collision with root package name */
    public static Method f15965f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f15966g = false;

    public static boolean H(Object obj, String str, int i4, boolean z) {
        I();
        try {
            return ((Boolean) f15964e.invoke(obj, str, Integer.valueOf(i4), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static void I() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f15966g) {
            return;
        }
        f15966g = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi21Impl", e4.getClass().getName(), e4);
            method = null;
            cls = null;
            method2 = null;
        }
        f15963d = constructor;
        f15962c = cls;
        f15964e = method2;
        f15965f = method;
    }

    @Override // O3.l
    public Typeface i(Context context, C1482b c1482b, Resources resources, int i4) {
        I();
        try {
            Object newInstance = f15963d.newInstance(null);
            for (C1483c c1483c : c1482b.f15725a) {
                File k4 = U.i.k(context);
                if (k4 == null) {
                    return null;
                }
                try {
                    if (!U.i.e(k4, resources, c1483c.f15731f)) {
                        return null;
                    }
                    if (!H(newInstance, k4.getPath(), c1483c.f15727b, c1483c.f15728c)) {
                        return null;
                    }
                    k4.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    k4.delete();
                }
            }
            I();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f15962c, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f15965f.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // O3.l
    public Typeface j(Context context, B.l[] lVarArr, int i4) {
        File file;
        String readlink;
        if (lVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(q(lVarArr, i4).f178a, "r", null);
                if (openFileDescriptor != null) {
                    try {
                        try {
                            readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    try {
                        if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                            file = new File(readlink);
                            if (file != null && file.canRead()) {
                                Typeface createFromFile = Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile;
                            }
                            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            Typeface l4 = l(context, fileInputStream);
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return l4;
                        }
                        Typeface l42 = l(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return l42;
                    } finally {
                    }
                    file = null;
                    if (file != null) {
                        Typeface createFromFile2 = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile2;
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}

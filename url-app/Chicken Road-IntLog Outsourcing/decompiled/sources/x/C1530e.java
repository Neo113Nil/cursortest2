package x;

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
import u1.AbstractC1477a;
import w.C1501c;
import w.C1502d;

/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1530e extends AbstractC1477a {

    /* renamed from: c, reason: collision with root package name */
    public static Class f12238c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Constructor f12239d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f12240e = null;

    /* renamed from: f, reason: collision with root package name */
    public static Method f12241f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f12242g = false;

    public static boolean E(String str, boolean z, int i2, Object obj) {
        F();
        try {
            return ((Boolean) f12240e.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static void F() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f12242g) {
            return;
        }
        f12242g = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi21Impl", e3.getClass().getName(), e3);
            method = null;
            cls = null;
            method2 = null;
        }
        f12239d = constructor;
        f12238c = cls;
        f12240e = method2;
        f12241f = method;
    }

    @Override // u1.AbstractC1477a
    public Typeface f(Context context, C1501c c1501c, Resources resources, int i2) {
        F();
        try {
            Object newInstance = f12239d.newInstance(null);
            for (C1502d c1502d : c1501c.f12097a) {
                File x5 = B0.f.x(context);
                if (x5 == null) {
                    return null;
                }
                try {
                    if (!B0.f.n(x5, resources, c1502d.f12103f)) {
                        return null;
                    }
                    if (!E(x5.getPath(), c1502d.f12100c, c1502d.f12099b, newInstance)) {
                        return null;
                    }
                    x5.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    x5.delete();
                }
            }
            F();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f12238c, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f12241f.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override // u1.AbstractC1477a
    public Typeface g(Context context, B.i[] iVarArr, int i2) {
        File file;
        String readlink;
        if (iVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(o(iVarArr, i2).f124a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
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
                        Typeface h3 = h(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return h3;
                    }
                    Typeface h32 = h(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return h32;
                } finally {
                }
                file = null;
                if (file != null) {
                    Typeface createFromFile2 = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile2;
                }
                FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}

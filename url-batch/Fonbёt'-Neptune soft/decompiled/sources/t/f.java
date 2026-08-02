package t;

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
import s.C0295f;
import s.C0296g;
import u0.AbstractC0310a;
import x.C0329h;

/* loaded from: classes.dex */
public class f extends i1.a {

    /* renamed from: i, reason: collision with root package name */
    public static Class f3445i = null;

    /* renamed from: j, reason: collision with root package name */
    public static Constructor f3446j = null;

    /* renamed from: k, reason: collision with root package name */
    public static Method f3447k = null;

    /* renamed from: l, reason: collision with root package name */
    public static Method f3448l = null;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f3449m = false;

    public static boolean O(Object obj, String str, int i2, boolean z2) {
        P();
        try {
            return ((Boolean) f3447k.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void P() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f3449m) {
            return;
        }
        f3449m = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f3446j = constructor;
        f3445i = cls;
        f3447k = method2;
        f3448l = method;
    }

    @Override // i1.a
    public Typeface c(Context context, C0295f c0295f, Resources resources, int i2) {
        P();
        try {
            Object newInstance = f3446j.newInstance(null);
            for (C0296g c0296g : c0295f.f3405a) {
                File d2 = AbstractC0310a.d(context);
                if (d2 == null) {
                    return null;
                }
                try {
                    if (!AbstractC0310a.b(d2, resources, c0296g.f3411f)) {
                        return null;
                    }
                    if (!O(newInstance, d2.getPath(), c0296g.f3407b, c0296g.f3408c)) {
                        return null;
                    }
                    d2.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d2.delete();
                }
            }
            P();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f3445i, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f3448l.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // i1.a
    public Typeface d(Context context, C0329h[] c0329hArr, int i2) {
        File file;
        String readlink;
        if (c0329hArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(l(c0329hArr, i2).f3583a, "r", null);
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
                        Typeface e2 = e(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return e2;
                    }
                    Typeface e22 = e(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return e22;
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

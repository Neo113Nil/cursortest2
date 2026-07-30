package p;

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

/* loaded from: classes.dex */
public class e extends o.g {

    /* renamed from: a, reason: collision with root package name */
    public static Class f2814a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Constructor f2815b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Method f2816c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f2817d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f2818e = false;

    public static boolean B(Object obj, String str, int i2, boolean z2) {
        C();
        try {
            return ((Boolean) f2816c.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void C() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2818e) {
            return;
        }
        f2818e = true;
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
        f2815b = constructor;
        f2814a = cls;
        f2816c = method2;
        f2817d = method;
    }

    @Override // o.g
    public Typeface g(Context context, o.c cVar, Resources resources, int i2) {
        C();
        try {
            Object newInstance = f2815b.newInstance(null);
            for (o.d dVar : cVar.f2792a) {
                File q2 = o.g.q(context);
                if (q2 == null) {
                    return null;
                }
                try {
                    if (!o.g.d(q2, resources, dVar.f2798f)) {
                        return null;
                    }
                    if (!B(newInstance, q2.getPath(), dVar.f2794b, dVar.f2795c)) {
                        return null;
                    }
                    q2.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    q2.delete();
                }
            }
            C();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f2814a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f2817d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // o.g
    public Typeface h(Context context, t.h[] hVarArr, int i2) {
        File file;
        String readlink;
        if (hVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(l(hVarArr, i2).f2983a, "r", null);
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
                        Typeface i3 = i(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return i3;
                    }
                    Typeface i32 = i(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return i32;
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

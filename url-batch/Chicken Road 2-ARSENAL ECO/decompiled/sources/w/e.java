package w;

import A.k;
import a.AbstractC0219a;
import a1.AbstractC0223a;
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
import v.C0698c;
import v.C0699d;

/* loaded from: classes.dex */
public class e extends AbstractC0219a {

    /* renamed from: e, reason: collision with root package name */
    public static Class f6133e = null;

    /* renamed from: f, reason: collision with root package name */
    public static Constructor f6134f = null;

    /* renamed from: g, reason: collision with root package name */
    public static Method f6135g = null;

    /* renamed from: h, reason: collision with root package name */
    public static Method f6136h = null;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f6137i = false;

    public static boolean S(Object obj, String str, int i7, boolean z5) {
        T();
        try {
            return ((Boolean) f6135g.invoke(obj, str, Integer.valueOf(i7), Boolean.valueOf(z5))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static void T() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f6137i) {
            return;
        }
        f6137i = true;
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
        f6134f = constructor;
        f6133e = cls;
        f6135g = method2;
        f6136h = method;
    }

    @Override // a.AbstractC0219a
    public Typeface g(Context context, C0698c c0698c, Resources resources, int i7) {
        T();
        try {
            Object newInstance = f6134f.newInstance(null);
            for (C0699d c0699d : c0698c.f6041a) {
                File z5 = AbstractC0223a.z(context);
                if (z5 == null) {
                    return null;
                }
                try {
                    if (!AbstractC0223a.o(z5, resources, c0699d.f6047f)) {
                        return null;
                    }
                    if (!S(newInstance, z5.getPath(), c0699d.f6043b, c0699d.f6044c)) {
                        return null;
                    }
                    z5.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    z5.delete();
                }
            }
            T();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f6133e, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f6136h.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // a.AbstractC0219a
    public Typeface h(Context context, k[] kVarArr, int i7) {
        File file;
        String readlink;
        if (kVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(o(kVarArr, i7).f28a, "r", null);
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
                            Typeface i8 = i(context, fileInputStream);
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return i8;
                        }
                        Typeface i82 = i(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return i82;
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

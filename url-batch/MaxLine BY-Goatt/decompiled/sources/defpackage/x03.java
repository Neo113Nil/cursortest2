package defpackage;

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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class x03 extends th2 {
    public static Class a = null;
    public static Constructor b = null;
    public static Method c = null;
    public static Method d = null;
    public static boolean e = false;

    public static boolean q(Object obj, String str, int i, boolean z) {
        r();
        try {
            return ((Boolean) c.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void r() {
        Method method;
        Class<?> cls;
        Method method2;
        if (e) {
            return;
        }
        e = true;
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
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    @Override // defpackage.th2
    public Typeface d(Context context, zp0 zp0Var, Resources resources, int i) {
        r();
        try {
            Object newInstance = b.newInstance(null);
            for (aq0 aq0Var : zp0Var.a) {
                File k = yh2.k(context);
                if (k == null) {
                    return null;
                }
                try {
                    if (!yh2.g(k, resources, aq0Var.f)) {
                        return null;
                    }
                    if (!q(newInstance, k.getPath(), aq0Var.b, aq0Var.c)) {
                        return null;
                    }
                    k.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    k.delete();
                }
            }
            r();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.th2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface e(Context context, mq0[] mq0VarArr, int i) {
        File file;
        File k;
        Typeface createFromFile;
        String readlink;
        if (mq0VarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(th2.i(mq0VarArr, i).a, "r", null);
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
                                Typeface createFromFile2 = Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile2;
                            }
                            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            k = yh2.k(context);
                            if (k != null) {
                                try {
                                } catch (RuntimeException unused2) {
                                } catch (Throwable th) {
                                    k.delete();
                                    throw th;
                                }
                                if (yh2.h(k, fileInputStream)) {
                                    createFromFile = Typeface.createFromFile(k.getPath());
                                    k.delete();
                                    fileInputStream.close();
                                    openFileDescriptor.close();
                                    return createFromFile;
                                }
                                k.delete();
                            }
                            createFromFile = null;
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        k = yh2.k(context);
                        if (k != null) {
                        }
                        createFromFile = null;
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return createFromFile;
                    } finally {
                    }
                    file = null;
                    if (file != null) {
                        Typeface createFromFile22 = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile22;
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }
}

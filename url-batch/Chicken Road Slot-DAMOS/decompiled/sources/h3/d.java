package h3;

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

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class d extends a.a {

    /* renamed from: a, reason: collision with root package name */
    public static Class f4450a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Constructor f4451b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Method f4452c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f4453d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f4454e = false;

    public static boolean i0(Object obj, String str, int i3, boolean z10) {
        j0();
        try {
            return ((Boolean) f4452c.invoke(obj, str, Integer.valueOf(i3), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void j0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f4454e) {
            return;
        }
        f4454e = true;
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
        f4451b = constructor;
        f4450a = cls;
        f4452c = method2;
        f4453d = method;
    }

    @Override // a.a
    public Typeface m(Context context, g3.e eVar, Resources resources, int i3) {
        j0();
        try {
            Object newInstance = f4451b.newInstance(null);
            for (g3.f fVar : eVar.f4241a) {
                File J = c6.f.J(context);
                if (J == null) {
                    return null;
                }
                try {
                    if (!c6.f.q(J, resources, fVar.f4247f)) {
                        return null;
                    }
                    if (!i0(newInstance, J.getPath(), fVar.f4243b, fVar.f4244c)) {
                        return null;
                    }
                    J.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    J.delete();
                }
            }
            j0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f4450a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f4453d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface n(Context context, l3.h[] hVarArr, int i3) {
        File file;
        File J;
        Typeface createFromFile;
        String readlink;
        if (hVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(a.a.s(hVarArr, i3).f5853a, "r", null);
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
                            J = c6.f.J(context);
                            if (J != null) {
                                try {
                                } catch (RuntimeException unused2) {
                                } catch (Throwable th) {
                                    J.delete();
                                    throw th;
                                }
                                if (c6.f.r(J, fileInputStream)) {
                                    createFromFile = Typeface.createFromFile(J.getPath());
                                    J.delete();
                                    fileInputStream.close();
                                    openFileDescriptor.close();
                                    return createFromFile;
                                }
                                J.delete();
                            }
                            createFromFile = null;
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        J = c6.f.J(context);
                        if (J != null) {
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

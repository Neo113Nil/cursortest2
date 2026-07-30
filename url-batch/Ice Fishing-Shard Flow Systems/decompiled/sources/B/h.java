package B;

import a.AbstractC0169a;
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
public class h extends V6.b {

    /* renamed from: b, reason: collision with root package name */
    public static Class f156b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Constructor f157c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f158d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f159e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f160f = false;

    public static boolean T(Object obj, String str, int i2, boolean z7) {
        U();
        try {
            return ((Boolean) f158d.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z7))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static void U() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f160f) {
            return;
        }
        f160f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi21Impl", e7.getClass().getName(), e7);
            method = null;
            cls = null;
            method2 = null;
        }
        f157c = constructor;
        f156b = cls;
        f158d = method2;
        f159e = method;
    }

    @Override // V6.b
    public Typeface o(Context context, A.e eVar, Resources resources, int i2) {
        U();
        try {
            Object newInstance = f157c.newInstance(null);
            for (A.f fVar : eVar.f14a) {
                File l7 = AbstractC0169a.l(context);
                if (l7 == null) {
                    return null;
                }
                try {
                    if (!AbstractC0169a.e(l7, resources, fVar.f20f)) {
                        return null;
                    }
                    if (!T(newInstance, l7.getPath(), fVar.f16b, fVar.f17c)) {
                        return null;
                    }
                    l7.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    l7.delete();
                }
            }
            U();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f156b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f159e.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e7) {
                throw new RuntimeException(e7);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // V6.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface p(Context context, F.k[] kVarArr, int i2) {
        File file;
        File l7;
        Typeface createFromFile;
        String readlink;
        if (kVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(V6.b.A(kVarArr, i2).f744a, "r", null);
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
                            l7 = AbstractC0169a.l(context);
                            if (l7 != null) {
                                try {
                                } catch (RuntimeException unused2) {
                                } catch (Throwable th) {
                                    l7.delete();
                                    throw th;
                                }
                                if (AbstractC0169a.f(l7, fileInputStream)) {
                                    createFromFile = Typeface.createFromFile(l7.getPath());
                                    l7.delete();
                                    fileInputStream.close();
                                    openFileDescriptor.close();
                                    return createFromFile;
                                }
                                l7.delete();
                            }
                            createFromFile = null;
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        l7 = AbstractC0169a.l(context);
                        if (l7 != null) {
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

package i3;

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

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class h extends h0.a {

    /* renamed from: b, reason: collision with root package name */
    public static Class f3431b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Constructor f3432c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f3433d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f3434e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3435f = false;

    public static boolean X(Object obj, String str, int i, boolean z3) {
        Y();
        try {
            return ((Boolean) f3433d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static void Y() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f3435f) {
            return;
        }
        f3435f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi21Impl", e8.getClass().getName(), e8);
            method = null;
            cls = null;
            method2 = null;
        }
        f3432c = constructor;
        f3431b = cls;
        f3433d = method2;
        f3434e = method;
    }

    @Override // h0.a
    public Typeface s(Context context, h3.e eVar, Resources resources, int i) {
        Y();
        try {
            Object newInstance = f3432c.newInstance(null);
            for (h3.f fVar : eVar.f3131a) {
                File D = m.a.D(context);
                if (D == null) {
                    return null;
                }
                try {
                    if (!m.a.l(D, resources, fVar.f3137f)) {
                        return null;
                    }
                    if (!X(newInstance, D.getPath(), fVar.f3133b, fVar.f3134c)) {
                        return null;
                    }
                    D.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    D.delete();
                }
            }
            Y();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f3431b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f3434e.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e8) {
                throw new RuntimeException(e8);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override // h0.a
    public Typeface t(Context context, n3.h[] hVarArr, int i) {
        File file;
        String readlink;
        if (hVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(z(hVarArr, i).f5359a, "r", null);
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
                            Typeface v7 = v(context, fileInputStream);
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return v7;
                        }
                        Typeface v72 = v(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return v72;
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

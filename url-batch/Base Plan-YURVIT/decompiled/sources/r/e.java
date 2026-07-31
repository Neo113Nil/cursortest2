package r;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.datastore.preferences.protobuf.k0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class e extends k0 {

    /* renamed from: e, reason: collision with root package name */
    public static Class f2967e = null;

    /* renamed from: f, reason: collision with root package name */
    public static Constructor f2968f = null;

    /* renamed from: g, reason: collision with root package name */
    public static Method f2969g = null;

    /* renamed from: h, reason: collision with root package name */
    public static Method f2970h = null;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f2971i = false;

    public static boolean M(Object obj, String str, int i2, boolean z2) {
        N();
        try {
            return ((Boolean) f2969g.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void N() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2971i) {
            return;
        }
        f2971i = true;
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
        f2968f = constructor;
        f2967e = cls;
        f2969g = method2;
        f2970h = method;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public Typeface k(Context context, q.c cVar, Resources resources, int i2) {
        N();
        try {
            Object newInstance = f2968f.newInstance(null);
            for (q.d dVar : cVar.f2945a) {
                File u2 = k0.u(context);
                if (u2 == null) {
                    return null;
                }
                try {
                    if (!k0.i(u2, resources, dVar.f2951f)) {
                        return null;
                    }
                    if (!M(newInstance, u2.getPath(), dVar.f2947b, dVar.f2948c)) {
                        return null;
                    }
                    u2.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    u2.delete();
                }
            }
            N();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f2967e, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f2970h.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public Typeface l(Context context, v.g[] gVarArr, int i2) {
        File file;
        String readlink;
        if (gVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(r(gVarArr, i2).f3073a, "r", null);
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
                            Typeface m2 = m(context, fileInputStream);
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return m2;
                        }
                        Typeface m22 = m(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return m22;
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

package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import z.g;

/* loaded from: classes.dex */
class d extends i {

    /* renamed from: b, reason: collision with root package name */
    private static Class f11774b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Constructor f11775c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Method f11776d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Method f11777e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f11778f = false;

    d() {
    }

    private static boolean h(Object obj, String str, int i4, boolean z4) {
        k();
        try {
            return ((Boolean) f11776d.invoke(obj, str, Integer.valueOf(i4), Boolean.valueOf(z4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static Typeface i(Object obj) {
        k();
        try {
            Object newInstance = Array.newInstance((Class<?>) f11774b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f11777e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    private File j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void k() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f11778f) {
            return;
        }
        f11778f = true;
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
        f11775c = constructor;
        f11774b = cls;
        f11776d = method2;
        f11777e = method;
    }

    private static Object l() {
        k();
        try {
            return f11775c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // androidx.core.graphics.i
    public Typeface a(Context context, d.c cVar, Resources resources, int i4) {
        Object l4 = l();
        for (d.C0093d c0093d : cVar.a()) {
            File e4 = j.e(context);
            if (e4 == null) {
                return null;
            }
            try {
                if (!j.c(e4, resources, c0093d.b())) {
                    return null;
                }
                if (!h(l4, e4.getPath(), c0093d.e(), c0093d.f())) {
                    return null;
                }
                e4.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e4.delete();
            }
        }
        return i(l4);
    }

    @Override // androidx.core.graphics.i
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i4) {
        FileInputStream fileInputStream;
        Typeface c4;
        if (bVarArr.length < 1) {
            return null;
        }
        g.b g4 = g(bVarArr, i4);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(g4.d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File j4 = j(openFileDescriptor);
                try {
                    if (j4 != null && j4.canRead()) {
                        c4 = Typeface.createFromFile(j4);
                        openFileDescriptor.close();
                        return c4;
                    }
                    c4 = super.c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return c4;
                } finally {
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
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

/* compiled from: PG */
/* loaded from: classes2.dex */
class ve extends vl {
    private static Class a = null;
    private static Constructor b = null;
    private static Method c = null;
    private static Method d = null;
    private static boolean e = false;

    private static Object e() {
        h();
        try {
            return b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void h() {
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

    private static final File i(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    @Override // defpackage.vl
    public Typeface a(Context context, wh[] whVarArr, int i) {
        FileInputStream fileInputStream;
        Typeface m;
        if (whVarArr.length <= 0) {
            return null;
        }
        wh f = f(whVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor((Uri) f.f, "r", null);
            if (openFileDescriptor == null) {
                return null;
            }
            try {
                File i2 = i(openFileDescriptor);
                try {
                    if (i2 != null && i2.canRead()) {
                        m = Typeface.createFromFile(i2);
                        openFileDescriptor.close();
                        return m;
                    }
                    m = super.m(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return m;
                } finally {
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // defpackage.vl
    public Typeface b(Context context, brn brnVar, Resources resources, int i) {
        Object obj = brnVar.a;
        Object e2 = e();
        for (wh whVar : (wh[]) obj) {
            File l = pj.l(context);
            if (l != null) {
                try {
                    if (pj.n(l, resources, whVar.e)) {
                        String path = l.getPath();
                        int i2 = whVar.b;
                        boolean z = whVar.c;
                        h();
                        try {
                            if (((Boolean) c.invoke(e2, path, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue()) {
                                l.delete();
                            }
                        } catch (IllegalAccessException | InvocationTargetException e3) {
                            throw new RuntimeException(e3);
                        }
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    l.delete();
                    throw th;
                }
                l.delete();
            }
            return null;
        }
        h();
        try {
            Object newInstance = Array.newInstance((Class<?>) a, 1);
            Array.set(newInstance, 0, e2);
            try {
                return (Typeface) d.invoke(null, newInstance);
            } catch (InvocationTargetException e4) {
                e = e4;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e5) {
            e = e5;
        }
    }
}

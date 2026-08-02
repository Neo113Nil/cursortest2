package x;

import B.k;
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
import w.C1231b;

/* loaded from: classes.dex */
public class d extends android.support.v4.media.session.a {

    /* renamed from: c, reason: collision with root package name */
    public static Class f10701c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Constructor f10702d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f10703e = null;
    public static Method f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f10704g = false;

    public static boolean Z(Object obj, String str, int i3, boolean z) {
        a0();
        try {
            return ((Boolean) f10703e.invoke(obj, str, Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static void a0() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f10704g) {
            return;
        }
        f10704g = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi21Impl", e3.getClass().getName(), e3);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f10702d = constructor;
        f10701c = cls;
        f10703e = method2;
        f = method;
    }

    @Override // android.support.v4.media.session.a
    public Typeface l(Context context, C1231b c1231b, Resources resources, int i3) {
        a0();
        try {
            Object newInstance = f10702d.newInstance(new Object[0]);
            for (w.c cVar : c1231b.f10616a) {
                File t3 = C2.b.t(context);
                if (t3 == null) {
                    return null;
                }
                try {
                    if (!C2.b.g(t3, resources, cVar.f)) {
                        return null;
                    }
                    if (!Z(newInstance, t3.getPath(), cVar.f10618b, cVar.f10619c)) {
                        return null;
                    }
                    t3.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    t3.delete();
                }
            }
            a0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f10701c, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // android.support.v4.media.session.a
    public Typeface m(Context context, k[] kVarArr, int i3) {
        File file;
        String readlink;
        if (kVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(w(kVarArr, i3).f103a, "r", null);
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
                            Typeface o = o(context, fileInputStream);
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return o;
                        }
                        Typeface o3 = o(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return o3;
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

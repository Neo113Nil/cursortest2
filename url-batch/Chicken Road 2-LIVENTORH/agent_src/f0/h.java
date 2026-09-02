package f0;

import a.y;
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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class h extends y {

    /* renamed from: n, reason: collision with root package name */
    public static Class f1275n = null;

    /* renamed from: o, reason: collision with root package name */
    public static Constructor f1276o = null;

    /* renamed from: p, reason: collision with root package name */
    public static Method f1277p = null;

    /* renamed from: q, reason: collision with root package name */
    public static Method f1278q = null;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f1279r = false;

    public static boolean W(Object obj, String str, int i, boolean z3) {
        X();
        try {
            return ((Boolean) f1277p.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static void X() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f1279r) {
            return;
        }
        f1279r = true;
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
        f1276o = constructor;
        f1275n = cls;
        f1277p = method2;
        f1278q = method;
    }

    @Override // a.y
    public Typeface r(Context context, e0.f fVar, Resources resources, int i) {
        X();
        try {
            Object newInstance = f1276o.newInstance(null);
            for (e0.g gVar : fVar.f1141a) {
                File G = y.G(context);
                if (G == null) {
                    return null;
                }
                try {
                    if (!y.o(G, resources, gVar.f1146f)) {
                        return null;
                    }
                    if (!W(newInstance, G.getPath(), gVar.f1143b, gVar.f1144c)) {
                        return null;
                    }
                    G.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    G.delete();
                }
            }
            X();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f1275n, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f1278q.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // a.y
    public Typeface s(Context context, k0.i[] iVarArr, int i) {
        File file;
        String readlink;
        if (iVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(y(iVarArr, i).f2150a, "r", null);
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
                            Typeface u3 = u(context, fileInputStream);
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return u3;
                        }
                        Typeface u32 = u(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return u32;
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

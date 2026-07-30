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

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class qm2 extends vi0 {
    public static Method RAsUl2FVSrh6 = null;
    public static Class Y1f8riQaR6yg = null;
    public static Method a92UlCVFR9N8 = null;
    public static Constructor e9gEMXR7LXtO = null;
    public static boolean rtx2ld2ELZv4 = false;

    public static void jJwa0q7P5wHq() {
        Method method;
        Class<?> cls;
        Method method2;
        if (rtx2ld2ELZv4) {
            return;
        }
        rtx2ld2ELZv4 = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        e9gEMXR7LXtO = constructor;
        Y1f8riQaR6yg = cls;
        a92UlCVFR9N8 = method2;
        RAsUl2FVSrh6 = method;
    }

    public static boolean qudtW7lwm99e(Object obj, String str, int i, boolean z) {
        jJwa0q7P5wHq();
        try {
            return ((Boolean) a92UlCVFR9N8.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.vi0
    public Typeface dgRBjINgWbAK(Context context, jc0 jc0Var, Resources resources) {
        jJwa0q7P5wHq();
        try {
            Object newInstance = e9gEMXR7LXtO.newInstance(null);
            for (kc0 kc0Var : jc0Var.PxuCJdSBwIXG) {
                File ozEBbv0hFTAB = xi0.ozEBbv0hFTAB(context);
                if (ozEBbv0hFTAB == null) {
                    return null;
                }
                try {
                    if (!xi0.XL4ISE6Oc65B(ozEBbv0hFTAB, resources, kc0Var.a92UlCVFR9N8)) {
                        return null;
                    }
                    if (!qudtW7lwm99e(newInstance, ozEBbv0hFTAB.getPath(), kc0Var.lS5Rgt96tfkO, kc0Var.TSizfFm2Yiuu)) {
                        return null;
                    }
                    ozEBbv0hFTAB.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    ozEBbv0hFTAB.delete();
                }
            }
            jJwa0q7P5wHq();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) Y1f8riQaR6yg, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) RAsUl2FVSrh6.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.vi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface x50lh2ztY7Y5(Context context, zc0[] zc0VarArr) {
        File file;
        File ozEBbv0hFTAB;
        Typeface createFromFile;
        String readlink;
        if (zc0VarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(vi0.RfyTYNmI9Srp(zc0VarArr).PxuCJdSBwIXG, "r", null);
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
                            ozEBbv0hFTAB = xi0.ozEBbv0hFTAB(context);
                            if (ozEBbv0hFTAB != null) {
                                try {
                                } catch (RuntimeException unused2) {
                                } catch (Throwable th) {
                                    ozEBbv0hFTAB.delete();
                                    throw th;
                                }
                                if (xi0.RfyTYNmI9Srp(ozEBbv0hFTAB, fileInputStream)) {
                                    createFromFile = Typeface.createFromFile(ozEBbv0hFTAB.getPath());
                                    ozEBbv0hFTAB.delete();
                                    fileInputStream.close();
                                    openFileDescriptor.close();
                                    return createFromFile;
                                }
                                ozEBbv0hFTAB.delete();
                            }
                            createFromFile = null;
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        ozEBbv0hFTAB = xi0.ozEBbv0hFTAB(context);
                        if (ozEBbv0hFTAB != null) {
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

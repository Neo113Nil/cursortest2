package com.baidu.location.c.c;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import java.io.File;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class b implements a {
    public static int a(Object obj, String str) {
        Method declaredMethod = obj.getClass().getDeclaredMethod(str, null);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return ((Integer) declaredMethod.invoke(obj, null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String b(Context context) {
        String path;
        if (Build.VERSION.SDK_INT <= 28) {
            try {
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            if (Environment.getExternalStorageState().equals("mounted")) {
                path = Environment.getExternalStorageDirectory().getPath();
                if (path == null && Build.VERSION.SDK_INT > 28 && context != null) {
                    try {
                        path = context.getExternalFilesDir(Environment.DIRECTORY_MOVIES).getAbsolutePath();
                    } catch (Exception unused) {
                        path = null;
                    }
                }
                if (path != null) {
                    try {
                        File file = new File(path + "/baidu/tempdata");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                    } catch (Exception e9) {
                        e9.printStackTrace();
                        return null;
                    }
                }
                return path;
            }
        }
        path = null;
        if (path == null) {
            path = context.getExternalFilesDir(Environment.DIRECTORY_MOVIES).getAbsolutePath();
        }
        if (path != null) {
        }
        return path;
    }

    public static String a(Context context) {
        String b8 = b(context);
        if (b8 == null) {
            return null;
        }
        return b8 + "/baidu/tempdata";
    }

    public static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable th) {
            if (a.f4999a) {
                th.printStackTrace();
            }
            return false;
        }
    }
}

package com.baidu.mshield.x0.c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import java.io.File;
import java.util.List;

/* loaded from: classes2.dex */
public class b {
    public static int a(Context context, String str, List<String> list) {
        try {
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
        }
        if (c(context, str)) {
            return 0;
        }
        if (list != null && list.size() != 0) {
            boolean z7 = false;
            for (int i8 = 0; i8 < list.size(); i8++) {
                String str2 = list.get(i8);
                if (!TextUtils.isEmpty(str2)) {
                    File file = new File(str2);
                    if (file.exists()) {
                        PackageInfo b8 = b(context, str);
                        if (b8 != null && b8.firstInstallTime >= file.lastModified()) {
                            return 0;
                        }
                        z7 = true;
                    } else {
                        continue;
                    }
                }
            }
            return !z7 ? 2 : 1;
        }
        return 1;
    }

    public static PackageInfo b(Context context, String str) {
        try {
            return com.baidu.mshield.b.e.c.a(context, str, 0);
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return null;
        }
    }

    public static boolean c(Context context, String str) {
        try {
            String parent = context.getExternalFilesDir(null).getParentFile().getParent();
            StringBuilder sb = new StringBuilder();
            sb.append(parent);
            sb.append(File.separator);
            sb.append(str);
            return new File(sb.toString()).exists();
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
            return false;
        }
    }

    public static String[] a(Context context, String str) {
        String[] strArr = {"", "", ""};
        try {
            String parent = context.getExternalFilesDir(null).getParentFile().getParent();
            StringBuilder sb = new StringBuilder();
            sb.append(parent);
            String str2 = File.separator;
            sb.append(str2);
            sb.append(str);
            File file = new File(sb.toString());
            if (file.exists()) {
                strArr[0] = file.getAbsolutePath();
            }
            File file2 = new File(parent + str2 + str + str2 + "files");
            if (file2.exists()) {
                strArr[1] = file2.getAbsolutePath();
            }
            File file3 = new File(parent + str2 + str + str2 + "cache");
            if (file3.exists()) {
                strArr[2] = file3.getAbsolutePath();
            }
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.a(th);
        }
        return strArr;
    }
}

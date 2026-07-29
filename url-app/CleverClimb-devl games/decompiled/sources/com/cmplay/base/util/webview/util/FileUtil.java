package com.cmplay.base.util.webview.util;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;

/* loaded from: classes.dex */
public class FileUtil {
    public static String openFileInFilesDir(Context context, String str, String str2) {
        String str3;
        if ("mounted".equals(Environment.getExternalStorageState())) {
            str3 = getExternalStorageDirectoryx(context) + str;
            if (TextUtils.isEmpty(str3)) {
                str3 = context.getFilesDir().toString() + str;
            }
        } else {
            str3 = context.getFilesDir().toString() + str;
        }
        File file = new File(str3);
        if (!file.exists()) {
            file.mkdir();
        }
        return str3;
    }

    public static String getExternalStorageDirectoryx(Context context) {
        try {
            if (Environment.getExternalStorageDirectory() == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder(Environment.getExternalStorageDirectory().getPath());
            sb.append("/Android/data/");
            sb.append(context.getPackageName());
            sb.append("/files");
            File file = new File(Environment.getExternalStorageDirectory(), sb.toString());
            if (!file.exists()) {
                file.mkdirs();
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static File getExternalFilesRootDir(Context context) {
        try {
            return context.getExternalFilesDir(null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            return null;
        } catch (NullPointerException unused2) {
            return null;
        } catch (SecurityException unused3) {
            return null;
        }
    }

    public static String getUrlFileName(String str) {
        return str.substring(str.charAt(str.lastIndexOf("/")), str.length());
    }

    public static boolean isExistsUrlFile(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(getUrlFileName(str2));
        return new File(sb.toString()).exists();
    }

    public static String getUrlFilePath(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str + getUrlFileName(str2);
    }

    public static String getUrlFileType(String str) {
        return str.substring(str.charAt(str.lastIndexOf(".")), str.length());
    }
}

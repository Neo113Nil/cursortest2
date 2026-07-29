package com.xsj.crasheye;

import com.xsj.crasheye.util.Utils;
import java.io.File;
import java.io.FileFilter;

/* loaded from: classes2.dex */
public class CrasheyeFileFilter implements FileFilter {
    public static final String BREADCRUMBSFILE = ".breadcrumbs";
    public static final String CUSTOMFILE = ".custom";
    public static final String MINIDUMP_ANALYZED_FILE = ".analyzed";
    public static final String MONOSTACKFILE = ".monostack";
    public static final String NATIVESEPARATOR = "^@%*#~^";
    private static final String PREFIX = "CrasheyeSavedData-1-";
    public static final String RAWNATIVEFILE = ".dmp";
    public static final String SESIONFIX = "session-CrasheyeSavedData-";
    public static final String SPLITSTRING = "\\^";
    public static final String SYSTEMLOGFILE = ".log";
    private static final String VERSION = "1";
    public static final String NATIVEPREFIX = "native-CrasheyeSavedData-1-";
    public static final String POSTFIX = ".json";
    public static final String NativeErrorFile = String.valueOf(Properties.FILES_PATH) + "/" + NATIVEPREFIX + String.valueOf(System.currentTimeMillis()) + POSTFIX;
    private static String FILECOUNT = "1";
    private static CrasheyeFileFilter fileFilterSingleton = null;

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        if (file.getName().startsWith(PREFIX) && file.getName().endsWith(POSTFIX)) {
            return true;
        }
        return file.getName().startsWith(SESIONFIX) && file.getName().endsWith(POSTFIX);
    }

    public static String createNewFile() {
        return String.valueOf(Properties.FILES_PATH) + "/" + PREFIX + String.valueOf(System.currentTimeMillis()) + POSTFIX;
    }

    public static void SetFileCount(int i) {
        FILECOUNT = String.valueOf(i);
    }

    public static String createSessionNewFile() {
        return String.valueOf(Properties.FILES_PATH) + "/" + (SESIONFIX + FILECOUNT + "-") + String.valueOf(System.currentTimeMillis()) + POSTFIX;
    }

    public static CrasheyeFileFilter getInstance() {
        if (fileFilterSingleton == null) {
            fileFilterSingleton = new CrasheyeFileFilter();
        }
        return fileFilterSingleton;
    }

    public static void DeleteNativeFile() {
        Utils.deleteFile(NativeErrorFile);
    }
}

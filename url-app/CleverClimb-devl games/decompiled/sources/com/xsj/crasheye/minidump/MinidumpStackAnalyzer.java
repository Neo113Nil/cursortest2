package com.xsj.crasheye.minidump;

import com.xsj.crasheye.CrasheyeFileFilter;
import com.xsj.crasheye.log.Logger;
import java.io.File;

/* loaded from: classes2.dex */
public class MinidumpStackAnalyzer {
    private static boolean sLibraryLoaded;

    public native int analyzer(String str, String str2);

    static {
        try {
            System.loadLibrary("crasheye_stack_analyze");
            sLibraryLoaded = true;
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
            sLibraryLoaded = false;
        }
    }

    public File analyze(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("file can't be null or not exists");
        }
        String absolutePath = file.getAbsolutePath();
        String str = String.valueOf(absolutePath) + CrasheyeFileFilter.MINIDUMP_ANALYZED_FILE;
        if (analyze(absolutePath, str)) {
            return new File(str);
        }
        return null;
    }

    public boolean analyze(String str, String str2) {
        if (!sLibraryLoaded) {
            Logger.logError("minidump_stack_analyze so not loaded");
            return false;
        }
        Logger.logInfo("analyze minidump file: " + str + " -> " + str2);
        try {
            return analyzer(str, str2) == 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}

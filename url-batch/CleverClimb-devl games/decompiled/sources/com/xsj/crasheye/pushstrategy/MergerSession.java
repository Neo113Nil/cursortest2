package com.xsj.crasheye.pushstrategy;

import com.xsj.crasheye.ActionEvent;
import com.xsj.crasheye.CrasheyeFileFilter;
import com.xsj.crasheye.Properties;
import com.xsj.crasheye.util.Utils;
import java.io.File;
import java.io.FileFilter;

/* loaded from: classes2.dex */
public class MergerSession {
    private static int sessionFileCount;

    public static void MergerSessionFiles() {
        File[] listFiles = new File(Properties.FILES_PATH).listFiles(new FileFilter() { // from class: com.xsj.crasheye.pushstrategy.MergerSession.1
            @Override // java.io.FileFilter
            public boolean accept(File file) {
                return file.getName().startsWith(CrasheyeFileFilter.SESIONFIX) && file.getName().endsWith(CrasheyeFileFilter.POSTFIX);
            }
        });
        if (listFiles != null && listFiles.length > 1) {
            for (File file : listFiles) {
                int GetSessionCountByFileName = GetSessionCountByFileName(file.getName());
                if (DeleteOldSessionFiles(file) && GetSessionCountByFileName > 0) {
                    sessionFileCount += GetSessionCountByFileName;
                }
            }
            if (sessionFileCount <= 0) {
                return;
            }
            BuildMergerSession(sessionFileCount);
        }
    }

    public static int GetSessionCountByFileName(String str) {
        try {
            return Integer.valueOf(str.split("-")[2]).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    private static void BuildMergerSession(int i) {
        Properties.sessionCount = i;
        String jsonLine = ActionEvent.createPing().toJsonLine();
        CrasheyeFileFilter.SetFileCount(i);
        Utils.writeFile(CrasheyeFileFilter.createSessionNewFile(), jsonLine);
    }

    private static boolean DeleteOldSessionFiles(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (!file.exists() || !file.isFile()) {
                return false;
            }
            file.delete();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}

package com.liulishuo.filedownloader.util;

import android.annotation.SuppressLint;
import android.content.Context;
import com.liulishuo.filedownloader.a0;
import com.liulishuo.filedownloader.exception.PathConflictException;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.File;

/* loaded from: classes4.dex */
public class c {

    @SuppressLint({"StaticFieldLeak"})
    private static Context APP_CONTEXT;

    public interface a {
        int determineConnectionCount(int i8, String str, String str2, long j8);
    }

    public interface b {
        com.liulishuo.filedownloader.connection.b create(String str);
    }

    /* renamed from: com.liulishuo.filedownloader.util.c$c, reason: collision with other inner class name */
    public interface InterfaceC0298c {
        com.liulishuo.filedownloader.database.a customMake();
    }

    public interface d {
        int generateId(String str, String str2, boolean z7);

        int transOldId(int i8, String str, String str2, boolean z7);
    }

    public interface e {
        com.liulishuo.filedownloader.stream.a create(File file);

        boolean supportSeek();
    }

    public static Context getAppContext() {
        return APP_CONTEXT;
    }

    public static void holdContext(Context context) {
        APP_CONTEXT = context;
    }

    public static boolean inspectAndInflowConflictPath(int i8, long j8, String str, String str2, a0 a0Var) {
        int findRunningTaskIdBySameTempPath;
        if (str2 == null || str == null || (findRunningTaskIdBySameTempPath = a0Var.findRunningTaskIdBySameTempPath(str, i8)) == 0) {
            return false;
        }
        com.liulishuo.filedownloader.message.c.getImpl().inflow(com.liulishuo.filedownloader.message.d.catchException(i8, j8, new PathConflictException(findRunningTaskIdBySameTempPath, str, str2)));
        return true;
    }

    public static boolean inspectAndInflowDownloaded(int i8, String str, boolean z7, boolean z8) {
        if (!z7 && str != null) {
            File file = new File(str);
            if (file.exists()) {
                com.liulishuo.filedownloader.message.c.getImpl().inflow(com.liulishuo.filedownloader.message.d.catchCanReusedOldFile(i8, file, z8));
                return true;
            }
        }
        return false;
    }

    public static boolean inspectAndInflowDownloading(int i8, FileDownloadModel fileDownloadModel, a0 a0Var, boolean z7) {
        if (!a0Var.isDownloading(fileDownloadModel)) {
            return false;
        }
        com.liulishuo.filedownloader.message.c.getImpl().inflow(com.liulishuo.filedownloader.message.d.catchWarn(i8, fileDownloadModel.getSoFar(), fileDownloadModel.getTotal(), z7));
        return true;
    }
}

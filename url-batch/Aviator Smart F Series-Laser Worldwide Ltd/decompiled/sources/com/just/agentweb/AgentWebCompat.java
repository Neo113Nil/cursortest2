package com.just.agentweb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class AgentWebCompat {
    private static void createFile(File file, boolean z7) {
        if (z7) {
            try {
                if (file.exists()) {
                    return;
                }
                file.createNewFile();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f4 A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:6:0x0007, B:9:0x002a, B:11:0x0030, B:12:0x0038, B:14:0x0068, B:15:0x0079, B:16:0x00e7, B:17:0x00ea, B:18:0x00ee, B:20:0x00f4, B:23:0x0105, B:29:0x007e, B:31:0x00c0), top: B:5:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void setDataDirectorySuffix(Context context) {
        File dataDir;
        StringBuilder sb;
        Iterator it;
        if (Build.VERSION.SDK_INT < 28) {
            return;
        }
        try {
            HashSet hashSet = new HashSet();
            dataDir = context.getDataDir();
            String absolutePath = dataDir.getAbsolutePath();
            String currentProcessName = ProcessUtils.getCurrentProcessName(context);
            if (!TextUtils.equals(context.getPackageName(), currentProcessName)) {
                if (TextUtils.isEmpty(currentProcessName)) {
                    currentProcessName = context.getPackageName();
                }
                WebView.setDataDirectorySuffix(currentProcessName);
                String str = "_" + currentProcessName;
                hashSet.add(absolutePath + "/app_webview" + str + "/webview_data.lock");
                if (RomUtils.isHuawei()) {
                    sb = new StringBuilder();
                    sb.append(absolutePath);
                    sb.append("/app_hws_webview");
                    sb.append(str);
                    sb.append("/webview_data.lock");
                    hashSet.add(sb.toString());
                }
                it = hashSet.iterator();
                while (it.hasNext()) {
                    File file = new File((String) it.next());
                    if (file.exists()) {
                        tryLockOrRecreateFile(file);
                        return;
                    }
                }
                return;
            }
            String str2 = "_" + currentProcessName;
            hashSet.add(absolutePath + "/app_webview/webview_data.lock");
            hashSet.add(absolutePath + "/app_webview" + str2 + "/webview_data.lock");
            if (RomUtils.isHuawei()) {
                hashSet.add(absolutePath + "/app_hws_webview/webview_data.lock");
                sb = new StringBuilder();
                sb.append(absolutePath);
                sb.append("/app_hws_webview");
                sb.append(str2);
                sb.append("/webview_data.lock");
                hashSet.add(sb.toString());
            }
            it = hashSet.iterator();
            while (it.hasNext()) {
            }
            return;
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        e8.printStackTrace();
    }

    private static void tryLockOrRecreateFile(File file) {
        try {
            FileLock tryLock = new RandomAccessFile(file, "rw").getChannel().tryLock();
            if (tryLock != null) {
                tryLock.close();
            } else {
                createFile(file, file.delete());
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            createFile(file, file.exists() ? file.delete() : false);
        }
    }
}

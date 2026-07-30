package com.baidu.xclient.gdid.b;

import android.content.Context;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import cn.hutool.core.util.l;
import com.baidu.xclient.gdid.e;
import com.baidu.xclient.gdid.k.d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.UUID;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static String f10718a;

    public static String a(Context context) {
        try {
        } catch (Throwable th) {
            d.a(th);
            f10718a = "";
        }
        if (!TextUtils.isEmpty(f10718a)) {
            return f10718a;
        }
        String b8 = b(context);
        f10718a = b8;
        if (TextUtils.isEmpty(b8)) {
            String c8 = c(context);
            f10718a = c8;
            if (TextUtils.isEmpty(c8)) {
                f10718a = e.e().q();
            }
        }
        if (TextUtils.isEmpty(f10718a)) {
            String a8 = com.baidu.mshield.b.f.e.a(UUID.randomUUID().toString());
            f10718a = a8;
            String str = new String(Base64.encode(com.baidu.xclient.gdid.a.a(a8.getBytes(l.UTF_8), com.baidu.mshield.b.f.a.a(16)), 10), l.UTF_8);
            e.e().c(str);
            a(context, str);
            b(context, str);
        } else {
            f10718a = new String(com.baidu.xclient.gdid.a.b(Base64.decode(f10718a, 10), com.baidu.mshield.b.f.a.a(16)), l.UTF_8);
        }
        return f10718a;
    }

    public static String b(Context context) {
        try {
            return com.baidu.mshield.b.e.a.a(context, "setting_gdidv", false);
        } catch (Throwable th) {
            d.a(th);
            return null;
        }
    }

    public static String c(Context context) {
        try {
            if (context.checkPermission("android.permission.READ_EXTERNAL_STORAGE", Process.myPid(), Process.myUid()) == -1) {
                return "";
            }
            File a8 = com.baidu.mshield.b.e.a.a(context, Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "backups/.gdidv");
            if (a8 == null) {
                return null;
            }
            FileReader fileReader = new FileReader(a8);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    fileReader.close();
                    return sb.toString();
                }
                sb.append(readLine);
            }
        } catch (Throwable th) {
            d.a(th);
            return null;
        }
    }

    public static void a(Context context, String str) {
        try {
            if (!TextUtils.isEmpty(str) && context.checkPermission("android.permission.WRITE_SETTINGS", Process.myPid(), Process.myUid()) == 0) {
                com.baidu.mshield.b.e.a.a(context, "setting_gdidv", str);
            }
        } catch (Throwable th) {
            d.a(th);
        }
    }

    public static void b(Context context, String str) {
        Throwable th;
        FileChannel fileChannel;
        FileOutputStream fileOutputStream;
        try {
            if (TextUtils.isEmpty(str) || context.checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", Process.myPid(), Process.myUid()) == -1) {
                return;
            }
            FileLock fileLock = null;
            try {
                try {
                    File a8 = com.baidu.mshield.b.e.a.a(context, Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "backups/.gdidv");
                    if (a8 != null) {
                        File parentFile = a8.getParentFile();
                        if (!parentFile.exists()) {
                            parentFile.mkdir();
                        }
                        if (!a8.exists()) {
                            a8.createNewFile();
                        }
                        byte[] bytes = str.getBytes();
                        fileOutputStream = new FileOutputStream(a8);
                        try {
                            fileChannel = fileOutputStream.getChannel();
                            try {
                                fileLock = fileChannel.tryLock();
                                if (fileLock != null && fileLock.isValid()) {
                                    fileOutputStream.write(bytes);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    d.a(th);
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    if (fileChannel != null) {
                                        fileChannel.close();
                                    }
                                    if (fileOutputStream == null) {
                                        return;
                                    }
                                    fileOutputStream.close();
                                } finally {
                                    if (fileLock != null) {
                                        try {
                                        } catch (Throwable th3) {
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            fileChannel = null;
                        }
                    } else {
                        fileChannel = null;
                        fileOutputStream = null;
                    }
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    if (fileOutputStream == null) {
                        return;
                    }
                } catch (Throwable th5) {
                    d.a(th5);
                    return;
                }
            } catch (Throwable th6) {
                th = th6;
                fileChannel = null;
                fileOutputStream = null;
            }
            fileOutputStream.close();
        } catch (Throwable th7) {
            d.a(th7);
        }
    }
}

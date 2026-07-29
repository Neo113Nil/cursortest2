package com.umeng.commonsdk.framework;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: UMFrUtils.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8968a = "last_successful_build_time";

    /* renamed from: b, reason: collision with root package name */
    private static Object f8969b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static String f8970c = "envelope";

    /* renamed from: d, reason: collision with root package name */
    private static String f8971d = null;
    private static Object e = new Object();

    public static String a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || runningAppProcesses.size() <= 0) {
                return "";
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return "";
        } catch (Throwable th) {
            com.umeng.commonsdk.proguard.b.a(context.getApplicationContext(), th);
            return "";
        }
    }

    private static boolean a(Context context, String str) {
        if (context == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() != 0) {
                    return false;
                }
            } catch (Throwable th) {
                com.umeng.commonsdk.proguard.b.a(applicationContext, th);
                return false;
            }
        } else {
            try {
                if (applicationContext.getPackageManager().checkPermission(str, applicationContext.getPackageName()) != 0) {
                    return false;
                }
            } catch (Throwable th2) {
                com.umeng.commonsdk.proguard.b.a(applicationContext, th2);
                return false;
            }
        }
        return true;
    }

    public static boolean b(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        try {
            if (!a(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isConnectedOrConnecting();
        } catch (Throwable th) {
            com.umeng.commonsdk.proguard.b.a(context.getApplicationContext(), th);
            return false;
        }
    }

    public static int c(Context context) {
        File file;
        String[] list;
        if (context == null) {
            return 0;
        }
        try {
            file = new File(h(context));
        } catch (Throwable th) {
            com.umeng.commonsdk.proguard.b.a(context, th);
        }
        synchronized (e) {
            if (!file.isDirectory() || (list = file.list()) == null) {
                return 0;
            }
            return list.length;
        }
    }

    private static long a(long j, long j2) {
        return (j < j2 ? j2 - j : j - j2) / 86400000;
    }

    public static void d(final Context context) {
        File file = new File(h(context));
        synchronized (e) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 100) {
                Arrays.sort(listFiles, new Comparator<File>() { // from class: com.umeng.commonsdk.framework.b.1
                    @Override // java.util.Comparator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public int compare(File file2, File file3) {
                        String name = file2.getName();
                        String name2 = file3.getName();
                        String c2 = b.c(name);
                        String c3 = b.c(name2);
                        if (TextUtils.isEmpty(c2) || TextUtils.isEmpty(c3)) {
                            return 1;
                        }
                        try {
                            long longValue = Long.valueOf(c2).longValue() - Long.valueOf(c3).longValue();
                            if (longValue > 0) {
                                return 1;
                            }
                            return longValue == 0 ? 0 : -1;
                        } catch (NumberFormatException e2) {
                            com.umeng.commonsdk.proguard.b.a(context, e2);
                            return 1;
                        }
                    }
                });
                if (listFiles.length > 100) {
                    try {
                        com.umeng.commonsdk.statistics.common.d.b("--->>> biger than 10");
                        for (int i = 0; i < listFiles.length - 100; i++) {
                            if (!listFiles[i].delete()) {
                                com.umeng.commonsdk.statistics.common.d.b("--->>> remove [" + i + "] file fail.");
                            }
                        }
                    } catch (Throwable th) {
                        com.umeng.commonsdk.proguard.b.a(context, th);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(String str) {
        Context appContext = UMModuleRegister.getAppContext();
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int indexOf = str.indexOf(95) + 1;
        try {
            return str.substring(indexOf, str.indexOf(95, indexOf));
        } catch (IndexOutOfBoundsException e2) {
            com.umeng.commonsdk.proguard.b.a(appContext, e2);
            return "";
        }
    }

    public static File e(final Context context) {
        if (context == null) {
            return null;
        }
        File file = new File(h(context));
        synchronized (e) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                Arrays.sort(listFiles, new Comparator<File>() { // from class: com.umeng.commonsdk.framework.b.2
                    @Override // java.util.Comparator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public int compare(File file2, File file3) {
                        String name = file2.getName();
                        String name2 = file3.getName();
                        String c2 = b.c(name);
                        String c3 = b.c(name2);
                        if (TextUtils.isEmpty(c2) || TextUtils.isEmpty(c3)) {
                            return 1;
                        }
                        try {
                            long longValue = Long.valueOf(c2).longValue() - Long.valueOf(c3).longValue();
                            if (longValue > 0) {
                                return 1;
                            }
                            return longValue == 0 ? 0 : -1;
                        } catch (NumberFormatException e2) {
                            com.umeng.commonsdk.proguard.b.a(context, e2);
                            return 1;
                        }
                    }
                });
                return listFiles[0];
            }
            return null;
        }
    }

    public static void f(Context context) {
        String g;
        if (context == null) {
            return;
        }
        try {
            g = g(context);
        } catch (Throwable th) {
            com.umeng.commonsdk.proguard.b.a(context, th);
        }
        if (TextUtils.isEmpty(g) || g.equals(f8970c)) {
            return;
        }
        File file = new File(context.getFilesDir().getAbsolutePath() + "/." + g);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                try {
                    if (file.isDirectory()) {
                        file.delete();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    com.umeng.commonsdk.proguard.b.a(context, th2);
                    return;
                }
            }
            try {
                String h = h(context);
                for (int i = 0; i < listFiles.length; i++) {
                    listFiles[i].renameTo(new File(h + "/" + listFiles[i].getName()));
                }
                if (file.isDirectory()) {
                    file.delete();
                    return;
                }
                return;
            } catch (Throwable th3) {
                com.umeng.commonsdk.proguard.b.a(context, th3);
                return;
            }
            com.umeng.commonsdk.proguard.b.a(context, th);
        }
    }

    public static String g(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                com.umeng.commonsdk.statistics.common.d.b("--->>> getEnvelopeDir: can't get process name, use default envelope directory.");
                return f8970c;
            }
            if (runningAppProcesses.size() == 0) {
                return f8970c;
            }
            try {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == Process.myPid()) {
                        String replace = runningAppProcessInfo.processName.replace(':', '_');
                        com.umeng.commonsdk.statistics.common.d.b("--->>> getEnvelopeDir: use current process name as envelope directory.");
                        return replace;
                    }
                }
            } catch (Throwable th) {
                com.umeng.commonsdk.proguard.b.a(context, th);
            }
        }
        return f8970c;
    }

    public static String h(Context context) {
        String str;
        synchronized (e) {
            try {
                if (f8971d == null) {
                    f8971d = context.getFilesDir().getAbsolutePath() + "/." + f8970c;
                }
                File file = new File(f8971d);
                if (!file.exists() && !file.mkdir()) {
                    com.umeng.commonsdk.statistics.common.d.b("--->>> Create Envelope Directory failed!!!");
                }
            } catch (Throwable th) {
                com.umeng.commonsdk.proguard.b.a(context, th);
            }
            str = f8971d;
        }
        return str;
    }

    public static long i(Context context) {
        long j;
        synchronized (f8969b) {
            j = PreferenceWrapper.getDefault(context).getLong(f8968a, 0L);
        }
        return j;
    }

    private static void j(Context context) {
        synchronized (f8969b) {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            sharedPreferences.edit().putLong(f8968a, System.currentTimeMillis()).commit();
        }
    }

    public static int a(Context context, String str, byte[] bArr) {
        FileOutputStream fileOutputStream;
        if (bArr == null) {
            return 101;
        }
        File file = new File(h(context) + "/" + str);
        synchronized (e) {
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                if (com.umeng.commonsdk.statistics.internal.a.a(context).a(str)) {
                    j(context);
                }
                return 0;
            } catch (IOException e3) {
                e = e3;
                fileOutputStream2 = fileOutputStream;
                com.umeng.commonsdk.proguard.b.a(context, e);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Throwable th2) {
                        com.umeng.commonsdk.proguard.b.a(context, th2);
                    }
                }
                return 101;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Throwable th4) {
                        com.umeng.commonsdk.proguard.b.a(context, th4);
                    }
                }
                throw th;
            }
        }
    }

    public static boolean a(File file) {
        Context appContext = UMModuleRegister.getAppContext();
        synchronized (e) {
            try {
                if (file != null) {
                    try {
                        if (file.exists()) {
                            return file.delete();
                        }
                    } catch (Throwable th) {
                        com.umeng.commonsdk.proguard.b.a(appContext, th);
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5 */
    public static byte[] a(String str) throws IOException {
        IOException e2;
        byte[] bArr;
        Context appContext = UMModuleRegister.getAppContext();
        synchronized (e) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                FileChannel channel = new RandomAccessFile(str, "r").getChannel();
                try {
                    MappedByteBuffer load = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size()).load();
                    System.out.println(load.isLoaded());
                    bArr = new byte[(int) channel.size()];
                    if (load.remaining() > 0) {
                        load.get(bArr, 0, load.remaining());
                    }
                    try {
                        channel.close();
                    } catch (Throwable th2) {
                        com.umeng.commonsdk.proguard.b.a(appContext, th2);
                    }
                } catch (IOException e3) {
                    e2 = e3;
                    com.umeng.commonsdk.proguard.b.a(appContext, e2);
                    throw e2;
                }
            } catch (IOException e4) {
                e2 = e4;
            } catch (Throwable th3) {
                th = th3;
                str = 0;
                try {
                    str.close();
                } catch (Throwable th4) {
                    com.umeng.commonsdk.proguard.b.a(appContext, th4);
                }
                throw th;
            }
        }
        return bArr;
    }

    public static boolean a(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        File[] listFiles;
        String str = "a";
        if (uMBusinessType == UMLogDataProtocol.UMBusinessType.U_DPLUS) {
            str = com.umeng.commonsdk.proguard.d.am;
        } else if (uMBusinessType == UMLogDataProtocol.UMBusinessType.U_INTERNAL) {
            str = com.umeng.commonsdk.proguard.d.aq;
        }
        File file = new File(h(context));
        synchronized (e) {
            try {
                try {
                    listFiles = file.listFiles();
                } catch (Throwable th) {
                    com.umeng.commonsdk.proguard.b.a(context, th);
                }
                if (listFiles != null && listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        if (file2.getName().startsWith(str)) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            } finally {
            }
        }
    }
}

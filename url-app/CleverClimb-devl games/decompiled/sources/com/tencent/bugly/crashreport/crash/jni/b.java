package com.tencent.bugly.crashreport.crash.jni;

import android.content.Context;
import android.support.v4.os.EnvironmentCompat;
import com.facebook.ads.AudienceNetworkActivity;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static String f8692a;

    private static Map<String, Integer> c(String str) {
        if (str == null) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            for (String str2 : str.split(",")) {
                String[] split = str2.split(":");
                if (split.length != 2) {
                    x.e("error format at %s", str2);
                    return null;
                }
                hashMap.put(split[0], Integer.valueOf(Integer.parseInt(split[1])));
            }
            return hashMap;
        } catch (Exception e) {
            x.e("error format intStateStr %s", str);
            e.printStackTrace();
            return null;
        }
    }

    protected static String a(String str) {
        if (str == null) {
            return "";
        }
        String[] split = str.split("\n");
        if (split == null || split.length == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            if (!str2.contains("java.lang.Thread.getStackTrace(")) {
                sb.append(str2);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    private static CrashDetailBean a(Context context, Map<String, String> map, NativeExceptionHandler nativeExceptionHandler) {
        String str;
        String str2;
        HashMap hashMap;
        if (map == null) {
            return null;
        }
        if (com.tencent.bugly.crashreport.common.info.a.a(context) == null) {
            x.e("abnormal com info not created", new Object[0]);
            return null;
        }
        String str3 = map.get("intStateStr");
        if (str3 == null || str3.trim().length() <= 0) {
            x.e("no intStateStr", new Object[0]);
            return null;
        }
        Map<String, Integer> c2 = c(str3);
        if (c2 == null) {
            x.e("parse intSateMap fail", Integer.valueOf(map.size()));
            return null;
        }
        try {
            c2.get("sino").intValue();
            c2.get("sud").intValue();
            String str4 = map.get("soVersion");
            if (str4 == null) {
                x.e("error format at version", new Object[0]);
                return null;
            }
            String str5 = map.get("errorAddr");
            if (str5 == null) {
                str5 = EnvironmentCompat.MEDIA_UNKNOWN;
            }
            String str6 = str5;
            String str7 = map.get("codeMsg");
            if (str7 == null) {
                str7 = EnvironmentCompat.MEDIA_UNKNOWN;
            }
            String str8 = map.get("tombPath");
            if (str8 == null) {
                str8 = EnvironmentCompat.MEDIA_UNKNOWN;
            }
            String str9 = str8;
            String str10 = map.get("signalName");
            if (str10 == null) {
                str10 = EnvironmentCompat.MEDIA_UNKNOWN;
            }
            map.get("errnoMsg");
            String str11 = map.get("stack");
            if (str11 == null) {
                str11 = EnvironmentCompat.MEDIA_UNKNOWN;
            }
            String str12 = map.get("jstack");
            if (str12 != null) {
                str11 = str11 + "java:\n" + str12;
            }
            Integer num = c2.get("sico");
            if (num == null || num.intValue() <= 0) {
                str = str7;
                str2 = str10;
            } else {
                str2 = str10 + "(" + str7 + ")";
                str = "KERNEL";
            }
            String str13 = map.get("nativeLog");
            byte[] a2 = (str13 == null || str13.isEmpty()) ? null : z.a((File) null, str13, "BuglyNativeLog.txt");
            String str14 = map.get("sendingProcess");
            if (str14 == null) {
                str14 = EnvironmentCompat.MEDIA_UNKNOWN;
            }
            Integer num2 = c2.get("spd");
            if (num2 != null) {
                str14 = str14 + "(" + num2 + ")";
            }
            String str15 = str14;
            String str16 = map.get("threadName");
            if (str16 == null) {
                str16 = EnvironmentCompat.MEDIA_UNKNOWN;
            }
            Integer num3 = c2.get("et");
            if (num3 != null) {
                str16 = str16 + "(" + num3 + ")";
            }
            String str17 = str16;
            String str18 = map.get("processName");
            if (str18 == null) {
                str18 = EnvironmentCompat.MEDIA_UNKNOWN;
            }
            Integer num4 = c2.get("ep");
            if (num4 != null) {
                str18 = str18 + "(" + num4 + ")";
            }
            String str19 = map.get("key-value");
            if (str19 != null) {
                HashMap hashMap2 = new HashMap();
                String[] split = str19.split("\n");
                int length = split.length;
                int i = 0;
                while (i < length) {
                    String[] split2 = split[i].split("=");
                    String[] strArr = split;
                    if (split2.length == 2) {
                        hashMap2.put(split2[0], split2[1]);
                    }
                    i++;
                    split = strArr;
                }
                hashMap = hashMap2;
            } else {
                hashMap = null;
            }
            CrashDetailBean packageCrashDatas = nativeExceptionHandler.packageCrashDatas(str18, str17, (c2.get("ets").intValue() * 1000) + (c2.get("etms").intValue() / 1000), str2, str6, a(str11), str, str15, str9, map.get("sysLogPath"), str4, a2, hashMap, false);
            if (packageCrashDatas != null) {
                String str20 = map.get("userId");
                if (str20 != null) {
                    x.c("[Native record info] userId: %s", str20);
                    packageCrashDatas.m = str20;
                }
                String str21 = map.get("sysLog");
                if (str21 != null) {
                    packageCrashDatas.w = str21;
                }
                String str22 = map.get("appVersion");
                if (str22 != null) {
                    x.c("[Native record info] appVersion: %s", str22);
                    packageCrashDatas.f = str22;
                }
                String str23 = map.get("isAppForeground");
                if (str23 != null) {
                    x.c("[Native record info] isAppForeground: %s", str23);
                    packageCrashDatas.M = str23.equalsIgnoreCase("true");
                }
                String str24 = map.get("launchTime");
                if (str24 != null) {
                    x.c("[Native record info] launchTime: %s", str24);
                    try {
                        packageCrashDatas.L = Long.parseLong(str24);
                    } catch (NumberFormatException e) {
                        if (!x.a(e)) {
                            e.printStackTrace();
                        }
                    }
                }
                packageCrashDatas.y = null;
                packageCrashDatas.k = true;
            }
            return packageCrashDatas;
        } catch (Throwable th) {
            x.e("error format", new Object[0]);
            th.printStackTrace();
            return null;
        }
    }

    private static String a(BufferedInputStream bufferedInputStream) throws IOException {
        if (bufferedInputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedInputStream.read();
            if (read == -1) {
                return null;
            }
            if (read == 0) {
                return sb.toString();
            }
            sb.append((char) read);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    public static CrashDetailBean a(Context context, String str, NativeExceptionHandler nativeExceptionHandler) {
        BufferedInputStream bufferedInputStream;
        String str2;
        String a2;
        if (context == null || str == null || nativeExceptionHandler == null) {
            x.e("get eup record file args error", new Object[0]);
            return null;
        }
        File file = new File(str, "rqd_record.eup");
        if (file.exists()) {
            ?? canRead = file.canRead();
            try {
                if (canRead != 0) {
                    try {
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        try {
                            String a3 = a(bufferedInputStream);
                            if (a3 != null && a3.equals("NATIVE_RQD_REPORT")) {
                                HashMap hashMap = new HashMap();
                                loop0: while (true) {
                                    str2 = null;
                                    while (true) {
                                        a2 = a(bufferedInputStream);
                                        if (a2 == null) {
                                            break loop0;
                                        }
                                        if (str2 == null) {
                                            str2 = a2;
                                        }
                                    }
                                    hashMap.put(str2, a2);
                                }
                                if (str2 != null) {
                                    x.e("record not pair! drop! %s", str2);
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                    return null;
                                }
                                CrashDetailBean a4 = a(context, hashMap, nativeExceptionHandler);
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                                return a4;
                            }
                            x.e("record read fail! %s", a3);
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                            return null;
                        } catch (IOException e4) {
                            e = e4;
                            e.printStackTrace();
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e5) {
                                    e5.printStackTrace();
                                }
                            }
                            return null;
                        }
                    } catch (IOException e6) {
                        e = e6;
                        bufferedInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        canRead = 0;
                        if (canRead != 0) {
                            try {
                                canRead.close();
                            } catch (IOException e7) {
                                e7.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0074, code lost:
    
        com.tencent.bugly.proguard.x.a(r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String b(String str, String str2) {
        BufferedReader a2 = z.a(str, "reg_record.txt");
        if (a2 == null) {
            return null;
        }
        try {
            try {
                StringBuilder sb = new StringBuilder();
                String readLine = a2.readLine();
                if (readLine != null && readLine.startsWith(str2)) {
                    int i = 0;
                    int i2 = 18;
                    int i3 = 0;
                    while (true) {
                        String readLine2 = a2.readLine();
                        if (readLine2 == null) {
                            break;
                        }
                        if (i % 4 == 0) {
                            if (i > 0) {
                                sb.append("\n");
                            }
                            sb.append("  ");
                        } else {
                            if (readLine2.length() > 16) {
                                i2 = 28;
                            }
                            sb.append("                ".substring(0, i2 - i3));
                        }
                        i3 = readLine2.length();
                        sb.append(readLine2);
                        i++;
                    }
                    sb.append("\n");
                    String sb2 = sb.toString();
                    if (a2 != null) {
                        try {
                            a2.close();
                        } catch (Exception e) {
                            x.a(e);
                        }
                    }
                    return sb2;
                }
                return null;
            } catch (Throwable th) {
                x.a(th);
                if (a2 != null) {
                    try {
                        a2.close();
                    } catch (Exception e2) {
                        x.a(e2);
                    }
                }
                return null;
            }
        } catch (Throwable th2) {
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Exception e3) {
                    x.a(e3);
                }
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        com.tencent.bugly.proguard.x.a(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String c(String str, String str2) {
        BufferedReader a2 = z.a(str, "map_record.txt");
        if (a2 == null) {
            return null;
        }
        try {
            try {
                StringBuilder sb = new StringBuilder();
                String readLine = a2.readLine();
                if (readLine != null && readLine.startsWith(str2)) {
                    while (true) {
                        String readLine2 = a2.readLine();
                        if (readLine2 == null) {
                            break;
                        }
                        sb.append("  ");
                        sb.append(readLine2);
                        sb.append("\n");
                    }
                    String sb2 = sb.toString();
                    if (a2 != null) {
                        try {
                            a2.close();
                        } catch (Exception e) {
                            x.a(e);
                        }
                    }
                    return sb2;
                }
                return null;
            } catch (Throwable th) {
                x.a(th);
                if (a2 != null) {
                    try {
                        a2.close();
                    } catch (Exception e2) {
                        x.a(e2);
                    }
                }
                return null;
            }
        } catch (Throwable th2) {
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Exception e3) {
                    x.a(e3);
                }
            }
            throw th2;
        }
    }

    public static String a(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String b2 = b(str, str2);
        if (b2 != null && !b2.isEmpty()) {
            sb.append("Register infos:\n");
            sb.append(b2);
        }
        String c2 = c(str, str2);
        if (c2 != null && !c2.isEmpty()) {
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append("System SO infos:\n");
            sb.append(c2);
        }
        return sb.toString();
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        File file = new File(str, "backup_record.txt");
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        return null;
    }

    public static void a(boolean z, String str) {
        File[] listFiles;
        if (str != null) {
            File file = new File(str, "rqd_record.eup");
            if (file.exists() && file.canWrite()) {
                file.delete();
                x.c("delete record file %s", file.getAbsoluteFile());
            }
            File file2 = new File(str, "reg_record.txt");
            if (file2.exists() && file2.canWrite()) {
                file2.delete();
                x.c("delete record file %s", file2.getAbsoluteFile());
            }
            File file3 = new File(str, "map_record.txt");
            if (file3.exists() && file3.canWrite()) {
                file3.delete();
                x.c("delete record file %s", file3.getAbsoluteFile());
            }
            File file4 = new File(str, "backup_record.txt");
            if (file4.exists() && file4.canWrite()) {
                file4.delete();
                x.c("delete record file %s", file4.getAbsoluteFile());
            }
            if (f8692a != null) {
                File file5 = new File(f8692a);
                if (file5.exists() && file5.canWrite()) {
                    file5.delete();
                    x.c("delete record file %s", file5.getAbsoluteFile());
                }
            }
            if (z) {
                File file6 = new File(str);
                if (file6.canRead() && file6.isDirectory() && (listFiles = file6.listFiles()) != null) {
                    for (File file7 : listFiles) {
                        if (file7.canRead() && file7.canWrite() && file7.length() == 0) {
                            file7.delete();
                            x.c("delete invalid record file %s", file7.getAbsoluteFile());
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static String a(String str, int i, String str2) {
        BufferedReader bufferedReader;
        String sb;
        if (str == null || i <= 0) {
            return null;
        }
        File file = new File(str);
        if (!file.exists() || !file.canRead()) {
            return null;
        }
        f8692a = str;
        ?? r2 = "Read system log from native record file(length: %s bytes): %s";
        x.a("Read system log from native record file(length: %s bytes): %s", Long.valueOf(file.length()), file.getAbsolutePath());
        try {
            if (str2 == null) {
                sb = z.a(new File(str));
            } else {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), AudienceNetworkActivity.WEBVIEW_ENCODING));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            if (Pattern.compile(str2 + "[ ]*:").matcher(readLine).find()) {
                                sb2.append(readLine);
                                sb2.append("\n");
                            }
                        } catch (Throwable th) {
                            th = th;
                            x.a(th);
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception e) {
                                    x.a(e);
                                }
                            }
                            return null;
                        }
                    }
                    sb = sb2.toString();
                    try {
                        bufferedReader.close();
                    } catch (Exception e2) {
                        x.a(e2);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = null;
                }
            }
            return (sb == null || sb.length() <= i) ? sb : sb.substring(sb.length() - i);
        } catch (Throwable th3) {
            th = th3;
        }
    }
}

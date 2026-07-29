package com.tencent.bugly.crashreport.common.info;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.support.v4.os.EnvironmentCompat;
import android.telephony.TelephonyManager;
import com.tapjoy.TapjoyConstants;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static String f8602a;

    /* renamed from: b, reason: collision with root package name */
    private static String f8603b;

    public static String a() {
        try {
            return Build.MODEL;
        } catch (Throwable th) {
            if (x.a(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    public static String b() {
        try {
            return Build.VERSION.RELEASE;
        } catch (Throwable th) {
            if (x.a(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    public static int c() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (Throwable th) {
            if (x.a(th)) {
                return -1;
            }
            th.printStackTrace();
            return -1;
        }
    }

    public static String a(Context context) {
        String str;
        if (context == null) {
            return null;
        }
        if (!AppInfo.a(context, "android.permission.READ_PHONE_STATE")) {
            x.d("no READ_PHONE_STATE permission to get IMEI", new Object[0]);
            return null;
        }
        try {
            str = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
            if (str == null) {
                return str;
            }
            try {
                return str.toLowerCase();
            } catch (Throwable unused) {
                x.a("Failed to get IMEI.", new Object[0]);
                return str;
            }
        } catch (Throwable unused2) {
            str = null;
        }
    }

    public static String b(Context context) {
        String str;
        if (context == null) {
            return null;
        }
        if (!AppInfo.a(context, "android.permission.READ_PHONE_STATE")) {
            x.d("no READ_PHONE_STATE permission to get IMSI", new Object[0]);
            return null;
        }
        try {
            str = ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
            if (str == null) {
                return str;
            }
            try {
                return str.toLowerCase();
            } catch (Throwable unused) {
                x.a("Failed to get IMSI.", new Object[0]);
                return str;
            }
        } catch (Throwable unused2) {
            str = null;
        }
    }

    public static String c(Context context) {
        String str = "fail";
        if (context == null) {
            return "fail";
        }
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
            if (string == null) {
                return "null";
            }
            try {
                return string.toLowerCase();
            } catch (Throwable th) {
                str = string;
                th = th;
                if (x.a(th)) {
                    return str;
                }
                x.a("Failed to get Android ID.", new Object[0]);
                return str;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String d(Context context) {
        WifiInfo connectionInfo;
        String str = "fail";
        if (context == null) {
            return "fail";
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI);
            if (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
                return "fail";
            }
            String macAddress = connectionInfo.getMacAddress();
            if (macAddress == null) {
                return "null";
            }
            try {
                return macAddress.toLowerCase();
            } catch (Throwable th) {
                str = macAddress;
                th = th;
                if (x.a(th)) {
                    return str;
                }
                th.printStackTrace();
                return str;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean o() {
        try {
            return Environment.getExternalStorageState().equals("mounted");
        } catch (Throwable th) {
            if (x.a(th)) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String p() {
        FileReader fileReader;
        Throwable th;
        BufferedReader bufferedReader;
        String str;
        try {
            fileReader = new FileReader("/system/build.prop");
            try {
                bufferedReader = new BufferedReader(fileReader, 2048);
                while (true) {
                    try {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                str = null;
                                break;
                            }
                            String[] split = readLine.split("=", 2);
                            if (split.length == 2) {
                                if (split[0].equals("ro.product.cpu.abilist")) {
                                    str = split[1];
                                    break;
                                }
                                if (split[0].equals("ro.product.cpu.abi")) {
                                    str = split[1];
                                    break;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (!x.a(th)) {
                                th.printStackTrace();
                            }
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e) {
                                    if (!x.a(e)) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (IOException e2) {
                                    if (!x.a(e2)) {
                                        e2.printStackTrace();
                                    }
                                }
                            }
                            return null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                if (!x.a(e3)) {
                                    e3.printStackTrace();
                                }
                            }
                        }
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (IOException e4) {
                                if (!x.a(e4)) {
                                    e4.printStackTrace();
                                }
                            }
                        }
                        throw th;
                    }
                }
                if (str != null) {
                    str = str.split(",")[0];
                }
                try {
                    bufferedReader.close();
                } catch (IOException e5) {
                    if (!x.a(e5)) {
                        e5.printStackTrace();
                    }
                }
                try {
                    fileReader.close();
                } catch (IOException e6) {
                    if (!x.a(e6)) {
                        e6.printStackTrace();
                    }
                }
                return str;
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
                if (bufferedReader != null) {
                }
                if (fileReader != null) {
                }
                throw th;
            }
        } catch (Throwable th5) {
            fileReader = null;
            th = th5;
            bufferedReader = null;
        }
    }

    public static String a(boolean z) {
        String str = null;
        if (z) {
            try {
                str = p();
            } catch (Throwable th) {
                if (x.a(th)) {
                    return "fail";
                }
                th.printStackTrace();
                return "fail";
            }
        }
        if (str == null) {
            str = System.getProperty("os.arch");
        }
        return str;
    }

    public static long d() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return -1L;
        }
    }

    public static long e() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return -1L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.BufferedReader] */
    public static long f() {
        FileReader fileReader;
        Throwable th;
        Throwable th2;
        BufferedReader bufferedReader;
        ?? r0 = "/proc/meminfo";
        try {
            try {
                fileReader = new FileReader("/proc/meminfo");
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            fileReader = null;
            th = th4;
            r0 = 0;
        }
        try {
            bufferedReader = new BufferedReader(fileReader, 2048);
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    long parseLong = Long.parseLong(readLine.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) << 10;
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        if (!x.a(e)) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        fileReader.close();
                    } catch (IOException e2) {
                        if (!x.a(e2)) {
                            e2.printStackTrace();
                        }
                    }
                    return parseLong;
                }
                try {
                    bufferedReader.close();
                } catch (IOException e3) {
                    if (!x.a(e3)) {
                        e3.printStackTrace();
                    }
                }
                try {
                    fileReader.close();
                    return -1L;
                } catch (IOException e4) {
                    if (x.a(e4)) {
                        return -1L;
                    }
                    e4.printStackTrace();
                    return -1L;
                }
            } catch (Throwable th5) {
                th2 = th5;
                if (!x.a(th2)) {
                    th2.printStackTrace();
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e5) {
                        if (!x.a(e5)) {
                            e5.printStackTrace();
                        }
                    }
                }
                if (fileReader == null) {
                    return -2L;
                }
                try {
                    fileReader.close();
                    return -2L;
                } catch (IOException e6) {
                    if (x.a(e6)) {
                        return -2L;
                    }
                    e6.printStackTrace();
                    return -2L;
                }
            }
        } catch (Throwable th6) {
            th2 = th6;
            bufferedReader = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long g() {
        FileReader fileReader;
        Throwable th;
        BufferedReader bufferedReader;
        Throwable th2;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                bufferedReader = new BufferedReader(fileReader, 2048);
                try {
                    try {
                        bufferedReader.readLine();
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e) {
                                if (!x.a(e)) {
                                    e.printStackTrace();
                                }
                            }
                            try {
                                fileReader.close();
                            } catch (IOException e2) {
                                if (!x.a(e2)) {
                                    e2.printStackTrace();
                                }
                            }
                            return -1L;
                        }
                        long parseLong = (Long.parseLong(readLine.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) << 10) + 0;
                        String readLine2 = bufferedReader.readLine();
                        if (readLine2 == null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                if (!x.a(e3)) {
                                    e3.printStackTrace();
                                }
                            }
                            try {
                                fileReader.close();
                            } catch (IOException e4) {
                                if (!x.a(e4)) {
                                    e4.printStackTrace();
                                }
                            }
                            return -1L;
                        }
                        long parseLong2 = parseLong + (Long.parseLong(readLine2.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) << 10);
                        String readLine3 = bufferedReader.readLine();
                        if (readLine3 == null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e5) {
                                if (!x.a(e5)) {
                                    e5.printStackTrace();
                                }
                            }
                            try {
                                fileReader.close();
                            } catch (IOException e6) {
                                if (!x.a(e6)) {
                                    e6.printStackTrace();
                                }
                            }
                            return -1L;
                        }
                        long parseLong3 = parseLong2 + (Long.parseLong(readLine3.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) << 10);
                        try {
                            bufferedReader.close();
                        } catch (IOException e7) {
                            if (!x.a(e7)) {
                                e7.printStackTrace();
                            }
                        }
                        try {
                            fileReader.close();
                        } catch (IOException e8) {
                            if (!x.a(e8)) {
                                e8.printStackTrace();
                            }
                        }
                        return parseLong3;
                    } catch (Throwable th3) {
                        th = th3;
                        if (!x.a(th)) {
                            th.printStackTrace();
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e9) {
                                if (!x.a(e9)) {
                                    e9.printStackTrace();
                                }
                            }
                        }
                        if (fileReader == null) {
                            return -2L;
                        }
                        try {
                            fileReader.close();
                            return -2L;
                        } catch (IOException e10) {
                            if (x.a(e10)) {
                                return -2L;
                            }
                            e10.printStackTrace();
                            return -2L;
                        }
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e11) {
                            if (!x.a(e11)) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (IOException e12) {
                            if (!x.a(e12)) {
                                e12.printStackTrace();
                            }
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th5) {
                th2 = th5;
                bufferedReader = null;
                if (bufferedReader != null) {
                }
                if (fileReader != null) {
                }
                throw th2;
            }
        } catch (Throwable th6) {
            fileReader = null;
            th = th6;
            bufferedReader = null;
        }
    }

    public static long h() {
        if (!o()) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable th) {
            if (x.a(th)) {
                return -2L;
            }
            th.printStackTrace();
            return -2L;
        }
    }

    public static long i() {
        if (!o()) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable th) {
            if (x.a(th)) {
                return -2L;
            }
            th.printStackTrace();
            return -2L;
        }
    }

    public static String j() {
        try {
            return Locale.getDefault().getCountry();
        } catch (Throwable th) {
            if (x.a(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    public static String k() {
        try {
            return Build.BRAND;
        } catch (Throwable th) {
            if (x.a(th)) {
                return "fail";
            }
            th.printStackTrace();
            return "fail";
        }
    }

    public static String e(Context context) {
        NetworkInfo activeNetworkInfo;
        TelephonyManager telephonyManager;
        String str = EnvironmentCompat.MEDIA_UNKNOWN;
        try {
            activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e) {
            if (!x.a(e)) {
                e.printStackTrace();
            }
        }
        if (activeNetworkInfo == null) {
            return null;
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        if (activeNetworkInfo.getType() == 0 && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            int networkType = telephonyManager.getNetworkType();
            switch (networkType) {
                case 1:
                    return "GPRS";
                case 2:
                    return "EDGE";
                case 3:
                    return "UMTS";
                case 4:
                    return "CDMA";
                case 5:
                    return "EVDO_0";
                case 6:
                    return "EVDO_A";
                case 7:
                    return "1xRTT";
                case 8:
                    return "HSDPA";
                case 9:
                    return "HSUPA";
                case 10:
                    return "HSPA";
                case 11:
                    return "iDen";
                case 12:
                    return "EVDO_B";
                case 13:
                    return "LTE";
                case 14:
                    return "eHRPD";
                case 15:
                    return "HSPA+";
                default:
                    str = "MOBILE(" + networkType + ")";
                    break;
            }
        }
        return str;
    }

    public static String f(Context context) {
        String a2 = z.a(context, "ro.miui.ui.version.name");
        if (!z.a(a2) && !a2.equals("fail")) {
            return "XiaoMi/MIUI/" + a2;
        }
        String a3 = z.a(context, "ro.build.version.emui");
        if (!z.a(a3) && !a3.equals("fail")) {
            return "HuaWei/EMOTION/" + a3;
        }
        String a4 = z.a(context, "ro.lenovo.series");
        if (!z.a(a4) && !a4.equals("fail")) {
            return "Lenovo/VIBE/" + z.a(context, "ro.build.version.incremental");
        }
        String a5 = z.a(context, "ro.build.nubia.rom.name");
        if (!z.a(a5) && !a5.equals("fail")) {
            return "Zte/NUBIA/" + a5 + "_" + z.a(context, "ro.build.nubia.rom.code");
        }
        String a6 = z.a(context, "ro.meizu.product.model");
        if (!z.a(a6) && !a6.equals("fail")) {
            return "Meizu/FLYME/" + z.a(context, "ro.build.display.id");
        }
        String a7 = z.a(context, "ro.build.version.opporom");
        if (!z.a(a7) && !a7.equals("fail")) {
            return "Oppo/COLOROS/" + a7;
        }
        String a8 = z.a(context, "ro.vivo.os.build.display.id");
        if (!z.a(a8) && !a8.equals("fail")) {
            return "vivo/FUNTOUCH/" + a8;
        }
        String a9 = z.a(context, "ro.aa.romver");
        if (!z.a(a9) && !a9.equals("fail")) {
            return "htc/" + a9 + "/" + z.a(context, "ro.build.description");
        }
        String a10 = z.a(context, "ro.lewa.version");
        if (!z.a(a10) && !a10.equals("fail")) {
            return "tcl/" + a10 + "/" + z.a(context, "ro.build.display.id");
        }
        String a11 = z.a(context, "ro.gn.gnromvernumber");
        if (!z.a(a11) && !a11.equals("fail")) {
            return "amigo/" + a11 + "/" + z.a(context, "ro.build.display.id");
        }
        String a12 = z.a(context, "ro.build.tyd.kbstyle_version");
        if (!z.a(a12) && !a12.equals("fail")) {
            return "dido/" + a12;
        }
        return z.a(context, "ro.build.fingerprint") + "/" + z.a(context, "ro.build.rom.id");
    }

    public static String g(Context context) {
        return z.a(context, "ro.board.platform");
    }

    public static boolean h(Context context) {
        boolean z;
        try {
            z = new File("/system/app/Superuser.apk").exists();
        } catch (Throwable th) {
            if (!x.b(th)) {
                th.printStackTrace();
            }
            z = false;
        }
        Boolean bool = null;
        ArrayList<String> a2 = z.a(context, new String[]{"/system/bin/sh", "-c", "type su"});
        if (a2 != null && a2.size() > 0) {
            Iterator<String> it = a2.iterator();
            while (it.hasNext()) {
                String next = it.next();
                x.c(next, new Object[0]);
                if (next.contains("not found")) {
                    bool = false;
                }
            }
            if (bool == null) {
                bool = true;
            }
        }
        return (Build.TAGS != null && Build.TAGS.contains("test-keys")) || z || Boolean.valueOf(bool == null ? false : bool.booleanValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String l() {
        BufferedReader bufferedReader;
        Throwable th;
        BufferedReader bufferedReader2;
        try {
            StringBuilder sb = new StringBuilder();
            if (new File("/sys/block/mmcblk0/device/type").exists()) {
                bufferedReader = new BufferedReader(new FileReader("/sys/block/mmcblk0/device/type"));
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    }
                    bufferedReader.close();
                } catch (Throwable unused) {
                    if (bufferedReader != null) {
                    }
                    return null;
                }
            } else {
                bufferedReader = null;
            }
            sb.append(",");
            if (new File("/sys/block/mmcblk0/device/name").exists()) {
                bufferedReader2 = new BufferedReader(new FileReader("/sys/block/mmcblk0/device/name"));
                try {
                    String readLine2 = bufferedReader2.readLine();
                    if (readLine2 != null) {
                        sb.append(readLine2);
                    }
                    bufferedReader2.close();
                    bufferedReader = bufferedReader2;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                            x.a(e);
                        }
                    }
                    throw th;
                }
            }
            sb.append(",");
            if (new File("/sys/block/mmcblk0/device/cid").exists()) {
                bufferedReader2 = new BufferedReader(new FileReader("/sys/block/mmcblk0/device/cid"));
                String readLine3 = bufferedReader2.readLine();
                if (readLine3 != null) {
                    sb.append(readLine3);
                }
                bufferedReader = bufferedReader2;
            }
            String sb2 = sb.toString();
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e2) {
                    x.a(e2);
                }
            }
            return sb2;
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
    }

    public static String i(Context context) {
        StringBuilder sb = new StringBuilder();
        String a2 = z.a(context, "ro.genymotion.version");
        if (a2 != null) {
            sb.append("ro.genymotion.version");
            sb.append("|");
            sb.append(a2);
            sb.append("\n");
        }
        String a3 = z.a(context, "androVM.vbox_dpi");
        if (a3 != null) {
            sb.append("androVM.vbox_dpi");
            sb.append("|");
            sb.append(a3);
            sb.append("\n");
        }
        String a4 = z.a(context, "qemu.sf.fake_camera");
        if (a4 != null) {
            sb.append("qemu.sf.fake_camera");
            sb.append("|");
            sb.append(a4);
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String j(Context context) {
        BufferedReader bufferedReader;
        Throwable th;
        Throwable th2;
        String readLine;
        StringBuilder sb = new StringBuilder();
        if (f8602a == null) {
            f8602a = z.a(context, "ro.secure");
        }
        if (f8602a != null) {
            sb.append("ro.secure");
            sb.append("|");
            sb.append(f8602a);
            sb.append("\n");
        }
        if (f8603b == null) {
            f8603b = z.a(context, "ro.debuggable");
        }
        if (f8603b != null) {
            sb.append("ro.debuggable");
            sb.append("|");
            sb.append(f8603b);
            sb.append("\n");
        }
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/self/status"));
            do {
                try {
                    try {
                        readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        x.a(th);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e) {
                                x.a(e);
                            }
                        }
                        return sb.toString();
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e2) {
                            x.a(e2);
                        }
                    }
                    throw th2;
                }
            } while (!readLine.startsWith("TracerPid:"));
            if (readLine != null) {
                String trim = readLine.substring(10).trim();
                sb.append("tracer_pid");
                sb.append("|");
                sb.append(trim);
            }
            String sb2 = sb.toString();
            try {
                bufferedReader.close();
            } catch (IOException e3) {
                x.a(e3);
            }
            return sb2;
        } catch (Throwable th5) {
            bufferedReader = null;
            th = th5;
        }
    }

    public static String m() {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            try {
                if (new File("/sys/class/power_supply/ac/online").exists()) {
                    bufferedReader = new BufferedReader(new FileReader("/sys/class/power_supply/ac/online"));
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            sb.append("ac_online");
                            sb.append("|");
                            sb.append(readLine);
                        }
                        bufferedReader.close();
                        bufferedReader2 = bufferedReader;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e) {
                                x.a(e);
                            }
                        }
                        throw th;
                    }
                }
                sb.append("\n");
                if (new File("/sys/class/power_supply/usb/online").exists()) {
                    BufferedReader bufferedReader3 = new BufferedReader(new FileReader("/sys/class/power_supply/usb/online"));
                    String readLine2 = bufferedReader3.readLine();
                    if (readLine2 != null) {
                        sb.append("usb_online");
                        sb.append("|");
                        sb.append(readLine2);
                    }
                    bufferedReader3.close();
                    bufferedReader2 = bufferedReader3;
                }
                sb.append("\n");
                if (new File("/sys/class/power_supply/battery/capacity").exists()) {
                    bufferedReader = new BufferedReader(new FileReader("/sys/class/power_supply/battery/capacity"));
                    String readLine3 = bufferedReader.readLine();
                    if (readLine3 != null) {
                        sb.append("battery_capacity");
                        sb.append("|");
                        sb.append(readLine3);
                    }
                    bufferedReader.close();
                    bufferedReader2 = bufferedReader;
                }
            } catch (IOException e2) {
                x.a(e2);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (bufferedReader2 != null) {
            bufferedReader2.close();
        }
        return sb.toString();
    }

    public static String k(Context context) {
        StringBuilder sb = new StringBuilder();
        String a2 = z.a(context, "gsm.sim.state");
        if (a2 != null) {
            sb.append("gsm.sim.state");
            sb.append("|");
            sb.append(a2);
        }
        sb.append("\n");
        String a3 = z.a(context, "gsm.sim.state2");
        if (a3 != null) {
            sb.append("gsm.sim.state2");
            sb.append("|");
            sb.append(a3);
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0030 -> B:12:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long n() {
        BufferedReader bufferedReader;
        Throwable th;
        float f = 0.0f;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader("/proc/uptime"));
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            f = (System.currentTimeMillis() / 1000) - Float.parseFloat(readLine.split(" ")[0]);
                        }
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th = th2;
                        x.a(th);
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return (long) f;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (0 != 0) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e) {
                            x.a(e);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                bufferedReader = null;
                th = th4;
            }
        } catch (IOException e2) {
            x.a(e2);
        }
        return (long) f;
    }
}

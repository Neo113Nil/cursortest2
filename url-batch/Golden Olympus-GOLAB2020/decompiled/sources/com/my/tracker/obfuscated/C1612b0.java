package com.my.tracker.obfuscated;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.my.tracker.obfuscated.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1612b0 {

    /* renamed from: a, reason: collision with root package name */
    private C1607a0 f21138a;

    /* renamed from: com.my.tracker.obfuscated.b0$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final int f21139a = a() ? 1 : 0;

        /* JADX WARN: Can't wrap try/catch for region: R(7:54|(2:58|59)|(2:57|50)|46|47|49|50) */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x009b, code lost:
        
            r3 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(java.lang.String.format(java.util.Locale.US, "/proc/%d/mounts", java.lang.Integer.valueOf(android.os.Process.myPid())))));
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00be, code lost:
        
            r0 = new java.lang.String[]{"/sbin/.magisk/", "/sbin/.core/mirror", "/sbin/.core/img", "/sbin/.core/db-0/magisk.db"};
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00ca, code lost:
        
            r4 = r3.readLine();
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x00ce, code lost:
        
            if (r4 == null) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x00d0, code lost:
        
            r5 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x00d2, code lost:
        
            if (r5 >= 4) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x00da, code lost:
        
            if (r4.contains(r0[r5]) == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x00e0, code lost:
        
            r5 = r5 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x00dc, code lost:
        
            r3.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x00e5, code lost:
        
            r3.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x00f9, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x00eb, code lost:
        
            r5 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x00f4, code lost:
        
            if (r5 != null) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x00f6, code lost:
        
            r5.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x00e3, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x00e9, code lost:
        
            r5 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x00ee, code lost:
        
            if (r5 != null) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x00f3, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x00f0, code lost:
        
            r5.close();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static boolean a() {
            int i4;
            Process process;
            BufferedReader bufferedReader;
            StringBuilder sb;
            String str = Build.TAGS;
            if (str != null && str.contains("test-keys")) {
                return true;
            }
            String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
            for (int i5 = 0; i5 < 10; i5++) {
                if (new File(strArr[i5]).exists()) {
                    return true;
                }
            }
            String[] strArr2 = {"/system/xbin/which su", "/system/bin/which su", "which su"};
            Runtime runtime = Runtime.getRuntime();
            while (true) {
                BufferedReader bufferedReader2 = null;
                try {
                    if (i4 < 3) {
                        try {
                            process = runtime.exec(strArr2[i4]);
                            try {
                                bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                                try {
                                    sb = new StringBuilder();
                                    while (true) {
                                        String readLine = bufferedReader.readLine();
                                        if (readLine == null) {
                                            break;
                                        }
                                        sb.append(readLine);
                                    }
                                    process.destroy();
                                } catch (Throwable unused) {
                                    bufferedReader2 = bufferedReader;
                                    if (bufferedReader2 != null) {
                                        try {
                                            bufferedReader2.close();
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    i4 = process == null ? i4 + 1 : 0;
                                    process.destroy();
                                }
                            } catch (Throwable unused3) {
                            }
                        } catch (Throwable unused4) {
                            process = null;
                        }
                        if (!TextUtils.isEmpty(sb.toString())) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused5) {
                            }
                            try {
                                process.destroy();
                            } catch (Throwable unused6) {
                            }
                            return true;
                        }
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused7) {
                        }
                        process.destroy();
                    } else {
                        try {
                            break;
                        } catch (Exception unused8) {
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                } catch (Throwable unused9) {
                }
            }
            return true;
        }
    }

    private static Point b(Context context) {
        Display display;
        try {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
                return null;
            }
            Point point = new Point();
            display.getRealSize(point);
            return point;
        } catch (Throwable th) {
            AbstractC1708y2.a("DeviceParamsDataProvider: collecting screen size exception: ", th);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:69|(2:70|71)|72|73|74|75|(3:76|77|78)|(3:79|80|81)|82|83) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:9|11|12|(1:142)(3:16|17|18)|(1:(2:20|21))|(12:23|24|25|26|27|28|29|30|31|32|33|(12:35|36|37|(1:39)(1:121)|40|41|42|43|(1:45)(1:119)|46|47|(20:49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|(15:69|70|71|72|73|74|75|76|77|78|79|80|81|82|83)(12:97|73|74|75|76|77|78|79|80|81|82|83))(12:116|58|59|60|61|62|63|64|65|66|67|(0)(0)))(6:126|43|(0)(0)|46|47|(0)(0)))|136|25|26|27|28|29|30|31|32|33|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:9|11|12|(1:142)(3:16|17|18)|(2:20|21)|(12:23|24|25|26|27|28|29|30|31|32|33|(12:35|36|37|(1:39)(1:121)|40|41|42|43|(1:45)(1:119)|46|47|(20:49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|(15:69|70|71|72|73|74|75|76|77|78|79|80|81|82|83)(12:97|73|74|75|76|77|78|79|80|81|82|83))(12:116|58|59|60|61|62|63|64|65|66|67|(0)(0)))(6:126|43|(0)(0)|46|47|(0)(0)))|136|25|26|27|28|29|30|31|32|33|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0093, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0094, code lost:
    
        com.my.tracker.obfuscated.AbstractC1708y2.a("DeviceParamsDataProvider: collecting app lang exception: ", r0);
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x007c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x007d, code lost:
    
        com.my.tracker.obfuscated.AbstractC1708y2.a("DeviceParamsDataProvider: collecting packageName exception: ", r0);
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0184, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0185, code lost:
    
        com.my.tracker.obfuscated.AbstractC1708y2.a("DeviceParamsDataProvider: collecting lang exception: ", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0 A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #14 {all -> 0x00b9, blocks: (B:33:0x009a, B:35:0x00a0), top: B:32:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3 A[Catch: all -> 0x00fd, TRY_LEAVE, TryCatch #16 {all -> 0x00fd, blocks: (B:47:0x00d9, B:49:0x00e3), top: B:46:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015c A[Catch: all -> 0x016d, TRY_LEAVE, TryCatch #7 {all -> 0x016d, blocks: (B:67:0x0156, B:69:0x015c), top: B:66:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0171  */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [int] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1607a0 a(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Point b4;
        int i4;
        int i5;
        float f4;
        float f5;
        int i6;
        float f6;
        int i7;
        float f7;
        float f8;
        String str11;
        int i8;
        long j4;
        long j5;
        ?? r32;
        int i9;
        File filesDir;
        DisplayMetrics displayMetrics;
        PackageInfo a4;
        TelephonyManager telephonyManager;
        String str12 = "";
        C1607a0 c1607a0 = this.f21138a;
        if (c1607a0 != null) {
            return c1607a0;
        }
        AbstractC1708y2.a("DeviceParamsDataProvider: collect application info...");
        String str13 = Build.DEVICE;
        String str14 = Build.MANUFACTURER;
        String str15 = Build.MODEL;
        String str16 = Build.VERSION.RELEASE;
        try {
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
        } catch (Throwable th) {
            th = th;
            str = "";
            str2 = str;
        }
        if (telephonyManager != null) {
            str = telephonyManager.getNetworkOperatorName();
            try {
                String networkOperator = telephonyManager.getNetworkOperator();
                if (TextUtils.isEmpty(networkOperator) || networkOperator.length() <= 3) {
                    str3 = networkOperator;
                    str2 = "";
                } else {
                    str3 = networkOperator.substring(3);
                    try {
                        str2 = networkOperator.substring(0, 3);
                    } catch (Throwable th2) {
                        th = th2;
                        str2 = "";
                        AbstractC1708y2.a("DeviceParamsDataProvider: collecting telephony exception: ", th);
                        str4 = "";
                        str5 = str;
                        str7 = str2;
                        str6 = str3;
                        String str17 = context.getPackageName();
                        String str18 = context.getResources().getConfiguration().locale.getLanguage();
                        a4 = AbstractC1689u.a(context);
                        if (a4 == null) {
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                str2 = "";
                str3 = str2;
                AbstractC1708y2.a("DeviceParamsDataProvider: collecting telephony exception: ", th);
                str4 = "";
                str5 = str;
                str7 = str2;
                str6 = str3;
                String str172 = context.getPackageName();
                String str182 = context.getResources().getConfiguration().locale.getLanguage();
                a4 = AbstractC1689u.a(context);
                if (a4 == null) {
                }
            }
            try {
                try {
                } catch (Throwable th4) {
                    th = th4;
                    AbstractC1708y2.a("DeviceParamsDataProvider: collecting telephony exception: ", th);
                    str4 = "";
                    str5 = str;
                    str7 = str2;
                    str6 = str3;
                    String str1722 = context.getPackageName();
                    String str1822 = context.getResources().getConfiguration().locale.getLanguage();
                    a4 = AbstractC1689u.a(context);
                    if (a4 == null) {
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                str8 = "";
            }
            if (telephonyManager.getSimState() == 5) {
                str4 = telephonyManager.getSimOperator();
                str5 = str;
                str7 = str2;
                str6 = str3;
                String str17222 = context.getPackageName();
                String str18222 = context.getResources().getConfiguration().locale.getLanguage();
                a4 = AbstractC1689u.a(context);
                if (a4 == null) {
                    str8 = a4.versionName;
                    try {
                        str9 = Long.toString(Build.VERSION.SDK_INT < 28 ? a4.versionCode : a4.getLongVersionCode());
                    } catch (Throwable th6) {
                        th = th6;
                        AbstractC1708y2.a("DeviceParamsDataProvider: collecting app package info exception: ", th);
                        str9 = "";
                        str10 = str8;
                        b4 = b(context);
                        if (b4 != null) {
                        }
                        displayMetrics = context.getResources().getDisplayMetrics();
                        if (displayMetrics != null) {
                        }
                    }
                    str10 = str8;
                    b4 = b(context);
                    if (b4 != null) {
                        int i10 = b4.x;
                        i5 = b4.y;
                        i4 = i10;
                    } else {
                        i4 = -1;
                        i5 = -1;
                    }
                    try {
                        displayMetrics = context.getResources().getDisplayMetrics();
                    } catch (Throwable th7) {
                        th = th7;
                        f4 = Float.NaN;
                        f5 = Float.NaN;
                        i6 = -1;
                    }
                    if (displayMetrics != null) {
                        i6 = displayMetrics.densityDpi;
                        try {
                            f4 = displayMetrics.density;
                            try {
                                f5 = displayMetrics.xdpi;
                                try {
                                    f7 = displayMetrics.ydpi;
                                    f6 = f5;
                                    i7 = i6;
                                } catch (Throwable th8) {
                                    th = th8;
                                    AbstractC1708y2.a("DeviceParamsDataProvider: collecting display metrics exception: ", th);
                                    f6 = f5;
                                    i7 = i6;
                                    f7 = Float.NaN;
                                    f8 = f4;
                                    TimeZone timeZone = TimeZone.getDefault();
                                    str11 = timeZone.getDisplayName(false, 0) + " " + timeZone.getID();
                                    i8 = a.f21139a;
                                    long j6 = -1;
                                    filesDir = context.getFilesDir();
                                    if (filesDir != null) {
                                    }
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                f5 = Float.NaN;
                                AbstractC1708y2.a("DeviceParamsDataProvider: collecting display metrics exception: ", th);
                                f6 = f5;
                                i7 = i6;
                                f7 = Float.NaN;
                                f8 = f4;
                                TimeZone timeZone2 = TimeZone.getDefault();
                                str11 = timeZone2.getDisplayName(false, 0) + " " + timeZone2.getID();
                                i8 = a.f21139a;
                                long j62 = -1;
                                filesDir = context.getFilesDir();
                                if (filesDir != null) {
                                }
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            f4 = Float.NaN;
                        }
                        f8 = f4;
                        try {
                            TimeZone timeZone22 = TimeZone.getDefault();
                            str11 = timeZone22.getDisplayName(false, 0) + " " + timeZone22.getID();
                        } catch (Throwable th11) {
                            AbstractC1708y2.a("DeviceParamsDataProvider: collecting timezone exception: ", th11);
                            str11 = "";
                        }
                        try {
                            i8 = a.f21139a;
                        } catch (Throwable th12) {
                            AbstractC1708y2.a("DeviceParamsDataProvider: collecting isRooted exception: ", th12);
                            i8 = -1;
                        }
                        long j622 = -1;
                        try {
                            filesDir = context.getFilesDir();
                        } catch (Throwable th13) {
                            th = th13;
                            j4 = -1;
                        }
                        if (filesDir != null) {
                            j5 = -1;
                            str12 = Locale.getDefault().getLanguage();
                            String str19 = str12;
                            r32 = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
                            i9 = ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType();
                            C1607a0 c1607a02 = new C1607a0(3, AbstractC1620c3.a(context), str13, str16, str17222, str9, str10, str14, str15, str19, str18222, str7, str6, str5, str4, str11, i4, i5, i7, f8, f6, f7, i8, j622, j5, r32, i9);
                            AbstractC1708y2.a("DeviceParamsDataProvider: collected");
                            this.f21138a = c1607a02;
                            return c1607a02;
                        }
                        j4 = filesDir.getTotalSpace();
                        try {
                            j622 = filesDir.getFreeSpace();
                        } catch (Throwable th14) {
                            th = th14;
                            AbstractC1708y2.a("DeviceParamsDataProvider: collecting disk info exception: ", th);
                            long j7 = j4;
                            j5 = j622;
                            j622 = j7;
                            str12 = Locale.getDefault().getLanguage();
                            String str192 = str12;
                            r32 = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
                            i9 = ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType();
                            C1607a0 c1607a022 = new C1607a0(3, AbstractC1620c3.a(context), str13, str16, str17222, str9, str10, str14, str15, str192, str18222, str7, str6, str5, str4, str11, i4, i5, i7, f8, f6, f7, i8, j622, j5, r32, i9);
                            AbstractC1708y2.a("DeviceParamsDataProvider: collected");
                            this.f21138a = c1607a022;
                            return c1607a022;
                        }
                        long j72 = j4;
                        j5 = j622;
                        j622 = j72;
                        str12 = Locale.getDefault().getLanguage();
                        String str1922 = str12;
                        try {
                            r32 = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen");
                        } catch (Throwable th15) {
                            AbstractC1708y2.a("DeviceParamsDataProvider: collecting touchscreen info exception: ", th15);
                            r32 = -1;
                        }
                        try {
                            i9 = ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType();
                        } catch (Throwable th16) {
                            AbstractC1708y2.a("DeviceParamsDataProvider: collecting ui mode info exception: ", th16);
                            i9 = -1;
                        }
                        C1607a0 c1607a0222 = new C1607a0(3, AbstractC1620c3.a(context), str13, str16, str17222, str9, str10, str14, str15, str1922, str18222, str7, str6, str5, str4, str11, i4, i5, i7, f8, f6, f7, i8, j622, j5, r32, i9);
                        AbstractC1708y2.a("DeviceParamsDataProvider: collected");
                        this.f21138a = c1607a0222;
                        return c1607a0222;
                    }
                    f8 = Float.NaN;
                    i7 = -1;
                    f6 = Float.NaN;
                    f7 = Float.NaN;
                    TimeZone timeZone222 = TimeZone.getDefault();
                    str11 = timeZone222.getDisplayName(false, 0) + " " + timeZone222.getID();
                    i8 = a.f21139a;
                    long j6222 = -1;
                    filesDir = context.getFilesDir();
                    if (filesDir != null) {
                    }
                } else {
                    str9 = "";
                    str10 = str9;
                    b4 = b(context);
                    if (b4 != null) {
                    }
                    displayMetrics = context.getResources().getDisplayMetrics();
                    if (displayMetrics != null) {
                    }
                }
            }
            str4 = "";
            str5 = str;
            str7 = str2;
            str6 = str3;
            String str172222 = context.getPackageName();
            String str182222 = context.getResources().getConfiguration().locale.getLanguage();
            a4 = AbstractC1689u.a(context);
            if (a4 == null) {
            }
        } else {
            str7 = "";
            str6 = str7;
            str5 = str6;
            str4 = str5;
            String str1722222 = context.getPackageName();
            String str1822222 = context.getResources().getConfiguration().locale.getLanguage();
            a4 = AbstractC1689u.a(context);
            if (a4 == null) {
            }
        }
    }
}

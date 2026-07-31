package com.startapp.sdk.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class fe {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0219 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(Context context) {
        boolean z;
        String str;
        Process process;
        boolean z2;
        boolean z3;
        String str2;
        int i;
        boolean z4;
        boolean z5;
        boolean z6;
        int i2;
        int i3;
        int i4;
        boolean z7;
        char c;
        PackageManager packageManager = context.getPackageManager();
        boolean z8 = true;
        if (!de.a(packageManager, ee.f229a)) {
            char c2 = 6;
            int i5 = 0;
            char c3 = 3;
            int i6 = 4;
            if (!(de.a(packageManager, new String[]{"com.noshufou.android.su", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.zachspong.temprootremovejb", "com.ramdroid.appquarantine"}) ? true : de.a(packageManager, ee.b)) && !de.a("su") && !de.a("busybox")) {
                HashMap hashMap = new HashMap();
                hashMap.put("ro.debuggable", "1");
                hashMap.put("ro.secure", CommonUrlParts.Values.FALSE_INTEGER);
                String[] strArr = new String[0];
                try {
                    strArr = new Scanner(Runtime.getRuntime().exec("getprop").getInputStream()).useDelimiter("\\A").next().split("\n");
                } catch (IOException | NoSuchElementException unused) {
                }
                boolean z9 = false;
                for (String str3 : strArr) {
                    for (String str4 : hashMap.keySet()) {
                        char c4 = c2;
                        if (str3.contains(str4)) {
                            z7 = z8;
                            c = c3;
                            if (str3.contains("[" + ((String) hashMap.get(str4)) + "]")) {
                                c2 = c4;
                                z8 = z7;
                                z9 = z8;
                                c3 = c;
                            }
                        } else {
                            z7 = z8;
                            c = c3;
                        }
                        c2 = c4;
                        z8 = z7;
                        c3 = c;
                    }
                }
                char c5 = c2;
                z = z8;
                char c6 = c3;
                if (!z9) {
                    String[] strArr2 = new String[0];
                    try {
                        strArr2 = new Scanner(Runtime.getRuntime().exec("mount").getInputStream()).useDelimiter("\\A").next().split("\n");
                    } catch (IOException | NoSuchElementException unused2) {
                    }
                    int length = strArr2.length;
                    int i7 = 0;
                    boolean z10 = false;
                    while (true) {
                        int i8 = 7;
                        if (i7 >= length) {
                            break;
                        }
                        String[] split = strArr2[i7].split(" ");
                        if (split.length >= i6) {
                            String str5 = split[z ? 1 : 0];
                            String str6 = split[c6];
                            String[] strArr3 = ee.d;
                            int i9 = i5;
                            z10 = z10;
                            while (i9 < i8) {
                                if (str5.equalsIgnoreCase(strArr3[i9])) {
                                    String[] split2 = str6.split(StringUtils.COMMA);
                                    int length2 = split2.length;
                                    i2 = i8;
                                    int i10 = i5;
                                    while (true) {
                                        i3 = i5;
                                        if (i10 >= length2) {
                                            break;
                                        }
                                        i4 = i6;
                                        if (split2[i10].equalsIgnoreCase("rw")) {
                                            z10 = z ? 1 : 0;
                                            break;
                                        }
                                        i10++;
                                        i5 = i3;
                                        i6 = i4;
                                    }
                                } else {
                                    i2 = i8;
                                    i3 = i5;
                                }
                                i4 = i6;
                                i9++;
                                i8 = i2;
                                i5 = i3;
                                i6 = i4;
                                z10 = z10;
                            }
                        }
                        i7++;
                        i5 = i5;
                        i6 = i6;
                        z10 = z10;
                    }
                    boolean z11 = i5;
                    int i11 = i6;
                    if (!z10 && ((str = Build.TAGS) == null || !str.contains("test-keys"))) {
                        Process process2 = null;
                        try {
                            Runtime runtime = Runtime.getRuntime();
                            String[] strArr4 = new String[2];
                            strArr4[z11 ? 1 : 0] = "which";
                            strArr4[z ? 1 : 0] = "su";
                            process = runtime.exec(strArr4);
                        } catch (Throwable unused3) {
                            process = null;
                        }
                        try {
                        } catch (Throwable unused4) {
                            if (process == null) {
                                z2 = z11 ? 1 : 0;
                                if (!z2) {
                                }
                                return z;
                            }
                            z3 = z11 ? 1 : 0;
                            process.destroy();
                            z2 = z3;
                            if (!z2) {
                            }
                            return z;
                        }
                        if (new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null) {
                            z3 = z ? 1 : 0;
                            process.destroy();
                            z2 = z3;
                            if (!z2 && !de.a("magisk") && ((str2 = Build.TAGS) == null || !str2.contains("test-keys"))) {
                                String[] strArr5 = new String[10];
                                strArr5[z11 ? 1 : 0] = "/system/app/Superuser.apk";
                                strArr5[z ? 1 : 0] = "/sbin/su";
                                strArr5[2] = "/system/bin/su";
                                strArr5[c6] = "/system/xbin/su";
                                strArr5[i11] = "/data/local/xbin/su";
                                strArr5[5] = "/data/local/bin/su";
                                strArr5[c5] = "/system/sd/xbin/su";
                                strArr5[7] = "/system/bin/failsafe/su";
                                strArr5[8] = "/data/local/su";
                                strArr5[9] = "/su/bin/su";
                                i = z11 ? 1 : 0;
                                while (true) {
                                    if (i < 10) {
                                        try {
                                            Runtime runtime2 = Runtime.getRuntime();
                                            String[] strArr6 = new String[2];
                                            strArr6[z11 ? 1 : 0] = "/system/xbin/which";
                                            strArr6[z ? 1 : 0] = "su";
                                            process2 = runtime2.exec(strArr6);
                                        } catch (Throwable unused5) {
                                            if (process2 == null) {
                                                z4 = z11 ? 1 : 0;
                                            }
                                        }
                                        if (new BufferedReader(new InputStreamReader(process2.getInputStream())).readLine() != null) {
                                            z5 = z ? 1 : 0;
                                            process2.destroy();
                                            z4 = z5;
                                            if (!z4) {
                                                try {
                                                    z6 = new File("/system/app/Superuser.apk").exists();
                                                } catch (Throwable unused6) {
                                                    z6 = z11 ? 1 : 0;
                                                }
                                                if (!z6) {
                                                    return z11;
                                                }
                                            }
                                        }
                                        z5 = z11 ? 1 : 0;
                                        process2.destroy();
                                        z4 = z5;
                                        if (!z4) {
                                        }
                                    } else {
                                        if (new File(strArr5[i]).exists()) {
                                            break;
                                        }
                                        i++;
                                    }
                                }
                            }
                        }
                        z3 = z11 ? 1 : 0;
                        process.destroy();
                        z2 = z3;
                        if (!z2) {
                            String[] strArr52 = new String[10];
                            strArr52[z11 ? 1 : 0] = "/system/app/Superuser.apk";
                            strArr52[z ? 1 : 0] = "/sbin/su";
                            strArr52[2] = "/system/bin/su";
                            strArr52[c6] = "/system/xbin/su";
                            strArr52[i11] = "/data/local/xbin/su";
                            strArr52[5] = "/data/local/bin/su";
                            strArr52[c5] = "/system/sd/xbin/su";
                            strArr52[7] = "/system/bin/failsafe/su";
                            strArr52[8] = "/data/local/su";
                            strArr52[9] = "/su/bin/su";
                            i = z11 ? 1 : 0;
                            while (true) {
                                if (i < 10) {
                                }
                                i++;
                            }
                        }
                    }
                }
                return z;
            }
        }
        z = true;
        return z;
    }
}

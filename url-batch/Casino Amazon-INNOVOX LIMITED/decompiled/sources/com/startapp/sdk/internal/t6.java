package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.onesignal.otel.config.OtelConfigRemoteOneSignal;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class t6 {
    public static final String[] c = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};
    public static final String[] d = {"goldfish"};
    public static final String[] e = {"/dev/socket/qemud", "/dev/qemu_pipe"};
    public static final String[] f = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};
    public static final String[] g = {"fstab.andy", "ueventd.andy.rc"};
    public static final String[] h = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc", "/BigNoxGameHD", "/YSLauncher"};
    public static final yd[] i = {new yd("init.svc.qemud", null), new yd("init.svc.qemu-props", null), new yd("qemu.hw.mainkeys", null), new yd("qemu.sf.fake_camera", null), new yd("qemu.sf.lcd_density", null), new yd("ro.bootloader", "unknown"), new yd("ro.bootmode", "unknown"), new yd("ro.hardware", "goldfish"), new yd("ro.kernel.android.qemud", null), new yd("ro.kernel.qemu.gles", null), new yd("ro.kernel.qemu", "1"), new yd("ro.product.device", "generic"), new yd("ro.product.model", OtelConfigRemoteOneSignal.OTEL_PATH), new yd("ro.product.name", OtelConfigRemoteOneSignal.OTEL_PATH), new yd("ro.serialno", null), new yd("ro.build.description", "72656C656173652D6B657973"), new yd("ro.build.fingerprint", "3A757365722F72656C656173652D6B657973"), new yd("net.eth0.dns1", null), new yd("rild.libpath", "2F73797374656D2F6C69622F6C69627265666572656E63652D72696C2E736F"), new yd("ro.radio.use-ppp", null), new yd("gsm.version.baseband", null), new yd("ro.build.tags", "72656C656173652D6B65"), new yd("ro.build.display.id", "746573742D"), new yd("init.svc.console", null)};
    public static t6 j;
    public static Boolean k;

    /* renamed from: a, reason: collision with root package name */
    public final Context f435a;
    public final ArrayList b;

    public t6(Context context) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.f435a = context;
        arrayList.add("com.google.android.launcher.layouts.genymotion");
        arrayList.add("com.bluestacks");
        arrayList.add("com.bignox.app");
        arrayList.add("com.vphone.launcher");
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(Context context) {
        boolean z;
        String str;
        BufferedReader bufferedReader;
        if (k == null) {
            if (j == null) {
                Context a2 = t0.a(context);
                if (a2 != null) {
                    context = a2;
                }
                j = new t6(context);
            }
            t6 t6Var = j;
            t6Var.getClass();
            String str2 = Build.FINGERPRINT;
            boolean z2 = false;
            if (!str2.startsWith("generic")) {
                String str3 = Build.MODEL;
                if (!str3.contains("google_sdk")) {
                    Locale locale = Locale.ROOT;
                    if (!str3.toLowerCase(locale).contains("droid4x") && !str3.contains("Emulator") && !str3.contains("Android SDK built for") && !Build.MANUFACTURER.contains("Genymotion")) {
                        String str4 = Build.HARDWARE;
                        if (!str4.equals("goldfish") && !str4.equals("vbox86")) {
                            String str5 = Build.PRODUCT;
                            if (!str5.equals(OtelConfigRemoteOneSignal.OTEL_PATH) && !str5.equals("google_sdk") && !str5.equals("sdk_x86") && !str5.equals("vbox86p") && !Build.BOARD.toLowerCase(locale).contains("nox") && !Build.BOOTLOADER.toLowerCase(locale).contains("nox") && !str4.toLowerCase(locale).contains("nox") && !str5.toLowerCase(locale).contains("nox") && !str2.startsWith("unknown") && !str2.contains("Andy") && !str2.contains("ttVM_Hdragon") && !str2.contains("vbox86p") && !str4.contains("ttVM_x86") && !str3.equals(OtelConfigRemoteOneSignal.OTEL_PATH) && !str3.contains("Droid4X") && !str3.contains("TiantianVM") && !str3.contains("Andy") && (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic"))) {
                                z = false;
                                if (!z) {
                                    if (!t6Var.a(c, "Geny") && !t6Var.a(g, "Andy") && !t6Var.a(h, "Nox")) {
                                        File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
                                        int i2 = 0;
                                        while (true) {
                                            BufferedReader bufferedReader2 = null;
                                            if (i2 >= 2) {
                                                break;
                                            }
                                            File file = fileArr[i2];
                                            if (file.exists() && file.canRead()) {
                                                char[] cArr = new char[1024];
                                                StringBuilder sb = new StringBuilder();
                                                try {
                                                    bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                                                    while (true) {
                                                        try {
                                                            int read = bufferedReader.read(cArr);
                                                            if (read != -1) {
                                                                sb.append(cArr, 0, read);
                                                            } else {
                                                                try {
                                                                    break;
                                                                } catch (IOException unused) {
                                                                }
                                                            }
                                                        } catch (Exception unused2) {
                                                            if (bufferedReader != null) {
                                                                try {
                                                                    bufferedReader.close();
                                                                } catch (IOException unused3) {
                                                                }
                                                            }
                                                            if (!t6Var.a(e, "Pipes")) {
                                                            }
                                                            z = true;
                                                            if (z) {
                                                            }
                                                            k = Boolean.valueOf(z2);
                                                            return k.booleanValue();
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            bufferedReader2 = bufferedReader;
                                                            if (bufferedReader2 != null) {
                                                                try {
                                                                    bufferedReader2.close();
                                                                } catch (IOException unused4) {
                                                                }
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    bufferedReader.close();
                                                    if (sb.toString().contains(d[0])) {
                                                        break;
                                                    }
                                                } catch (Exception unused5) {
                                                    bufferedReader = null;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                            }
                                            i2++;
                                        }
                                        if (!t6Var.a(e, "Pipes")) {
                                            try {
                                                if (t6Var.f435a.checkSelfPermission("android.permission.INTERNET") == 0) {
                                                    String[] strArr = {"/system/bin/netcfg"};
                                                    StringBuilder sb2 = new StringBuilder();
                                                    try {
                                                        ProcessBuilder processBuilder = new ProcessBuilder(strArr);
                                                        processBuilder.directory(new File("/system/bin/"));
                                                        processBuilder.redirectErrorStream(true);
                                                        InputStream inputStream = processBuilder.start().getInputStream();
                                                        byte[] bArr = new byte[1024];
                                                        while (inputStream.read(bArr) != -1) {
                                                            sb2.append(new String(bArr));
                                                        }
                                                        inputStream.close();
                                                    } catch (Exception unused6) {
                                                    }
                                                    String sb3 = sb2.toString();
                                                    if (!TextUtils.isEmpty(sb3)) {
                                                        for (String str6 : sb3.split("\n")) {
                                                            if ((str6.contains("wlan0") || str6.contains("tunl0") || str6.contains("eth0")) && str6.contains("10.0.2.15")) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Throwable unused7) {
                                            }
                                            yd[] ydVarArr = i;
                                            int i3 = 0;
                                            for (int i4 = 0; i4 < 24; i4++) {
                                                yd ydVar = ydVarArr[i4];
                                                Context context2 = t6Var.f435a;
                                                String str7 = ydVar.f510a;
                                                try {
                                                    Class<?> loadClass = context2.getClassLoader().loadClass("android.os.".concat("SystemProperties"));
                                                    str = (String) loadClass.getMethod("get", String.class).invoke(loadClass, str7);
                                                } catch (Exception unused8) {
                                                    str = null;
                                                }
                                                String str8 = ydVar.b;
                                                if (str8 == null && str != null) {
                                                    i3++;
                                                }
                                                if (str8 != null && str != null && str.contains(str8)) {
                                                    i3++;
                                                }
                                            }
                                            if (i3 < 5 || !t6Var.a(f, "X86")) {
                                                z = false;
                                            }
                                        }
                                    }
                                    z = true;
                                }
                                if (z) {
                                    z2 = z;
                                } else if (!t6Var.b.isEmpty()) {
                                    PackageManager packageManager = t6Var.f435a.getPackageManager();
                                    ArrayList arrayList = t6Var.b;
                                    int size = arrayList.size();
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= size) {
                                            break;
                                        }
                                        Object obj = arrayList.get(i5);
                                        i5++;
                                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage((String) obj);
                                        if (launchIntentForPackage != null && !packageManager.queryIntentActivities(launchIntentForPackage, 65536).isEmpty()) {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                }
                                k = Boolean.valueOf(z2);
                            }
                        }
                    }
                }
            }
            z = true;
            if (!z) {
            }
            if (z) {
            }
            k = Boolean.valueOf(z2);
        }
        return k.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[LOOP:0: B:2:0x0003->B:14:0x0049, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String[] strArr, String str) {
        File file;
        for (String str2 : strArr) {
            if (this.f435a.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 && str2.contains("/") && str.equals("Nox")) {
                file = new File(Environment.getExternalStorageDirectory() + str2);
                if (!file.exists()) {
                    return true;
                }
            }
            file = new File(str2);
            if (!file.exists()) {
            }
        }
        return false;
    }
}

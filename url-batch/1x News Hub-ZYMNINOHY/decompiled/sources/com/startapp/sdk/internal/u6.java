package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class u6 {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f4508c = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f4509d = {"goldfish"};

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f4510e = {"/dev/socket/qemud", "/dev/qemu_pipe"};
    public static final String[] f = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f4511g = {"fstab.andy", "ueventd.andy.rc"};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f4512h = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc", "/BigNoxGameHD", "/YSLauncher"};

    /* renamed from: i, reason: collision with root package name */
    public static final pe[] f4513i = {new pe("init.svc.qemud", null), new pe("init.svc.qemu-props", null), new pe("qemu.hw.mainkeys", null), new pe("qemu.sf.fake_camera", null), new pe("qemu.sf.lcd_density", null), new pe("ro.bootloader", CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE), new pe("ro.bootmode", CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE), new pe("ro.hardware", "goldfish"), new pe("ro.kernel.android.qemud", null), new pe("ro.kernel.qemu.gles", null), new pe("ro.kernel.qemu", "1"), new pe("ro.product.device", "generic"), new pe("ro.product.model", "sdk"), new pe("ro.product.name", "sdk"), new pe("ro.serialno", null), new pe("ro.build.description", "72656C656173652D6B657973"), new pe("ro.build.fingerprint", "3A757365722F72656C656173652D6B657973"), new pe("net.eth0.dns1", null), new pe("rild.libpath", "2F73797374656D2F6C69622F6C69627265666572656E63652D72696C2E736F"), new pe("ro.radio.use-ppp", null), new pe("gsm.version.baseband", null), new pe("ro.build.tags", "72656C656173652D6B65"), new pe("ro.build.display.id", "746573742D"), new pe("init.svc.console", null)};

    /* renamed from: j, reason: collision with root package name */
    public static u6 f4514j;

    /* renamed from: k, reason: collision with root package name */
    public static Boolean f4515k;

    /* renamed from: a, reason: collision with root package name */
    public final Context f4516a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4517b;

    public u6(Context context) {
        ArrayList arrayList = new ArrayList();
        this.f4517b = arrayList;
        this.f4516a = context;
        arrayList.add("com.google.android.launcher.layouts.genymotion");
        arrayList.add("com.bluestacks");
        arrayList.add("com.bignox.app");
        arrayList.add("com.vphone.launcher");
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(Context context) {
        boolean z;
        String str;
        BufferedReader bufferedReader;
        boolean z2 = true;
        if (f4515k == null) {
            if (f4514j == null) {
                Context a3 = w0.a(context);
                if (a3 != null) {
                    context = a3;
                }
                f4514j = new u6(context);
            }
            u6 u6Var = f4514j;
            u6Var.getClass();
            String str2 = Build.FINGERPRINT;
            if (!str2.startsWith("generic")) {
                String str3 = Build.MODEL;
                if (!str3.contains("google_sdk")) {
                    Locale locale = Locale.ROOT;
                    if (!str3.toLowerCase(locale).contains("droid4x") && !str3.contains("Emulator") && !str3.contains("Android SDK built for") && !Build.MANUFACTURER.contains("Genymotion")) {
                        String str4 = Build.HARDWARE;
                        if (!str4.equals("goldfish") && !str4.equals("vbox86")) {
                            String str5 = Build.PRODUCT;
                            if (!str5.equals("sdk") && !str5.equals("google_sdk") && !str5.equals("sdk_x86") && !str5.equals("vbox86p") && !Build.BOARD.toLowerCase(locale).contains("nox") && !Build.BOOTLOADER.toLowerCase(locale).contains("nox") && !str4.toLowerCase(locale).contains("nox") && !str5.toLowerCase(locale).contains("nox") && !str2.startsWith(CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE) && !str2.contains("Andy") && !str2.contains("ttVM_Hdragon") && !str2.contains("vbox86p") && !str4.contains("ttVM_x86") && !str3.equals("sdk") && !str3.contains("Droid4X") && !str3.contains("TiantianVM") && !str3.contains("Andy") && (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic"))) {
                                z = false;
                                if (!z) {
                                    if (!u6Var.a(f4508c, "Geny") && !u6Var.a(f4511g, "Andy") && !u6Var.a(f4512h, "Nox")) {
                                        File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
                                        int i3 = 0;
                                        while (true) {
                                            BufferedReader bufferedReader2 = null;
                                            if (i3 >= 2) {
                                                break;
                                            }
                                            File file = fileArr[i3];
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
                                                            if (!u6Var.a(f4510e, "Pipes")) {
                                                                try {
                                                                    if (u6Var.f4516a.checkSelfPermission("android.permission.INTERNET") == 0) {
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
                                                                        } catch (Exception unused4) {
                                                                        }
                                                                        String sb3 = sb2.toString();
                                                                        if (!TextUtils.isEmpty(sb3)) {
                                                                            for (String str6 : sb3.split(IOUtils.LINE_SEPARATOR_UNIX)) {
                                                                                if ((str6.contains("wlan0") || str6.contains("tunl0") || str6.contains("eth0")) && str6.contains("10.0.2.15")) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (Throwable unused5) {
                                                                }
                                                                pe[] peVarArr = f4513i;
                                                                int i4 = 0;
                                                                for (int i5 = 0; i5 < 24; i5++) {
                                                                    pe peVar = peVarArr[i5];
                                                                    Context context2 = u6Var.f4516a;
                                                                    String str7 = peVar.f4311a;
                                                                    try {
                                                                        Class<?> loadClass = context2.getClassLoader().loadClass("android.os.".concat("SystemProperties"));
                                                                        str = (String) loadClass.getMethod("get", String.class).invoke(loadClass, str7);
                                                                    } catch (Exception unused6) {
                                                                        str = null;
                                                                    }
                                                                    String str8 = peVar.f4312b;
                                                                    if (str8 == null && str != null) {
                                                                        i4++;
                                                                    }
                                                                    if (str8 != null && str != null && str.contains(str8)) {
                                                                        i4++;
                                                                    }
                                                                }
                                                                if (i4 < 5 || !u6Var.a(f, "X86")) {
                                                                    z = false;
                                                                    if (z) {
                                                                    }
                                                                    f4515k = Boolean.valueOf(z2);
                                                                    return f4515k.booleanValue();
                                                                }
                                                            }
                                                            z = true;
                                                            if (z) {
                                                            }
                                                            f4515k = Boolean.valueOf(z2);
                                                            return f4515k.booleanValue();
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            bufferedReader2 = bufferedReader;
                                                            if (bufferedReader2 != null) {
                                                                try {
                                                                    bufferedReader2.close();
                                                                } catch (IOException unused7) {
                                                                }
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    bufferedReader.close();
                                                    if (sb.toString().contains(f4509d[0])) {
                                                        break;
                                                    }
                                                } catch (Exception unused8) {
                                                    bufferedReader = null;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                            }
                                            i3++;
                                        }
                                    }
                                    z = true;
                                }
                                if (z) {
                                    if (!u6Var.f4517b.isEmpty()) {
                                        PackageManager packageManager = u6Var.f4516a.getPackageManager();
                                        Iterator it = u6Var.f4517b.iterator();
                                        while (it.hasNext()) {
                                            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage((String) it.next());
                                            if (launchIntentForPackage != null && !packageManager.queryIntentActivities(launchIntentForPackage, 65536).isEmpty()) {
                                                break;
                                            }
                                        }
                                    }
                                    z2 = false;
                                } else {
                                    z2 = z;
                                }
                                f4515k = Boolean.valueOf(z2);
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
            f4515k = Boolean.valueOf(z2);
        }
        return f4515k.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[LOOP:0: B:2:0x0003->B:14:0x0047, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String[] strArr, String str) {
        File file;
        for (String str2 : strArr) {
            if (this.f4516a.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 && str2.contains("/") && str.equals("Nox")) {
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

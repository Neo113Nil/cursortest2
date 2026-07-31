package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import com.ironsource.b9;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.zk;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFf1hSDK {
    private static AFf1hSDK getMonetizationNetwork;
    private final Map<String, String> getCurrencyIso4217Code = new HashMap<String, String>() { // from class: com.appsflyer.internal.AFf1hSDK.1
        {
            put("aa", "ro.arch");
            put(ImpressionData.IMPRESSION_DATA_KEY_ABTEST, "ro.chipname");
            put("ac", "ro.dalvik.vm.native.bridge");
            put("ad", "persist.sys.nativebridge");
            put("ae", "ro.enable.native.bridge.exec");
            put("af", "dalvik.vm.isa.x86.features");
            put("ag", "dalvik.vm.isa.x86.variant");
            put("ah", "ro.zygote");
            put("ai", "ro.allow.mock.location");
            put("aj", "ro.dalvik.vm.isa.arm");
            put("ak", "dalvik.vm.isa.arm.features");
            put("al", "dalvik.vm.isa.arm.variant");
            put("am", "dalvik.vm.isa.arm64.features");
            put("an", "dalvik.vm.isa.arm64.variant");
            put("ao", "vzw.os.rooted");
            put(zk.f20552c, "ro.build.user");
            put("aq", "ro.kernel.qemu");
            put("ar", "ro.hardware");
            put("as", "ro.product.cpu.abi");
            put("at", "ro.product.cpu.abilist");
            put("au", "ro.product.cpu.abilist32");
            put("av", "ro.product.cpu.abilist64");
        }
    };

    enum AFa1uSDK {
        XPOSED("xps"),
        FRIDA("frd");

        String getRevenue;

        AFa1uSDK(String str) {
            this.getRevenue = str;
        }
    }

    enum AFa1vSDK {
        HOOKING("hk"),
        DEBUGGABLE("dbg");

        String AFAdRevenueData;

        AFa1vSDK(String str) {
            this.AFAdRevenueData = str;
        }
    }

    private AFf1hSDK() {
    }

    private AFg1dSDK AFAdRevenueData(Context context) {
        AFg1dSDK aFg1dSDK = new AFg1dSDK();
        try {
            aFg1dSDK.getCurrencyIso4217Code(AFa1vSDK.HOOKING.AFAdRevenueData, getRevenue());
            aFg1dSDK.getCurrencyIso4217Code(AFa1vSDK.DEBUGGABLE.AFAdRevenueData, Boolean.valueOf(getMonetizationNetwork(context)));
            return aFg1dSDK;
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("failed to perform analysis checks", th);
            return aFg1dSDK;
        }
    }

    public static AFf1hSDK getMediationNetwork() {
        if (getMonetizationNetwork == null) {
            getMonetizationNetwork = new AFf1hSDK();
        }
        return getMonetizationNetwork;
    }

    private static boolean getMonetizationNetwork(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    private static String getRevenue() {
        StringBuilder sb = new StringBuilder();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            int i4 = 0;
            int i5 = 0;
            while (it.hasNext()) {
                for (StackTraceElement stackTraceElement : it.next().getValue()) {
                    if (stackTraceElement.toString().contains("de.robv.android.xposed") && i5 <= 2) {
                        i5++;
                        sb.append(AFa1uSDK.XPOSED.getRevenue);
                        if (stackTraceElement.getMethodName().equals(b9.h.f15466Z)) {
                            sb.append("+a");
                        }
                        if (stackTraceElement.getMethodName().equals("handleHookedMethod")) {
                            sb.append("+h");
                        }
                        sb.append(";");
                    }
                    if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                        i4++;
                    }
                }
            }
            if (i4 > 1) {
                sb.append("mz;");
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("hooking check error", th);
        }
        try {
            StringBuilder sb2 = new StringBuilder("/proc/");
            sb2.append(Process.myPid());
            sb2.append("/maps");
            if (getRevenue(sb2.toString(), "frida")) {
                sb.append(AFa1uSDK.FRIDA.getRevenue);
                if (Build.VERSION.SDK_INT < 29 && getRevenue("/proc/net/tcp", "69A2")) {
                    sb.append("+prt");
                }
            }
        } catch (Exception e4) {
            AFLogger.afErrorLogForExcManagerOnly("frida detection error", e4);
            sb.append(e4.getMessage().toLowerCase(Locale.getDefault()));
        }
        sb.append(";");
        return sb.toString();
    }

    public final Object getCurrencyIso4217Code(Context context, String str) {
        String str2 = null;
        if (str != null) {
            try {
                if (!getMediationNetwork(str)) {
                }
                AFg1dSDK aFg1dSDK = new AFg1dSDK();
                aFg1dSDK.getCurrencyIso4217Code("pr", AFAdRevenueData());
                aFg1dSDK.getCurrencyIso4217Code("an", AFAdRevenueData(context));
                return aFg1dSDK;
            } catch (Exception e4) {
                AFLogger.afErrorLogForExcManagerOnly("could not get anti fraud data", e4);
                return str2;
            }
        }
        str2 = "invalid timestamp";
        AFg1dSDK aFg1dSDK2 = new AFg1dSDK();
        aFg1dSDK2.getCurrencyIso4217Code("pr", AFAdRevenueData());
        aFg1dSDK2.getCurrencyIso4217Code("an", AFAdRevenueData(context));
        return aFg1dSDK2;
    }

    private static String getMonetizationNetwork(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e4) {
            AFLogger.afErrorLogForExcManagerOnly("error in props rfl", e4);
            return null;
        }
    }

    private static boolean getMediationNetwork(String str) {
        return str.matches("\\d+");
    }

    private AFg1dSDK AFAdRevenueData() {
        AFg1dSDK aFg1dSDK = new AFg1dSDK();
        try {
            for (Map.Entry<String, String> entry : this.getCurrencyIso4217Code.entrySet()) {
                String monetizationNetwork = getMonetizationNetwork(entry.getValue());
                if (monetizationNetwork != null && !monetizationNetwork.equals("")) {
                    aFg1dSDK.getCurrencyIso4217Code(entry.getKey(), monetizationNetwork);
                }
            }
        } catch (Exception e4) {
            AFLogger.afErrorLogForExcManagerOnly("failed to create props", e4);
        }
        return aFg1dSDK;
    }

    private static boolean getRevenue(String str, String str2) {
        String readLine;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, Charset.defaultCharset()));
            String lowerCase = str2.toLowerCase(Locale.getDefault());
            do {
                readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    fileInputStream.close();
                    return false;
                }
            } while (!new HashSet(Arrays.asList(readLine.toLowerCase(Locale.getDefault()).split("[\\s.,\\]\\-:/_\\[]"))).contains(lowerCase));
            bufferedReader.close();
            fileInputStream.close();
            return true;
        } catch (FileNotFoundException e4) {
            AFLogger.afErrorLogForExcManagerOnly("FNF", e4);
            throw new Exception("FNF");
        } catch (IOException e5) {
            AFLogger.afErrorLogForExcManagerOnly("IOF", e5);
            throw new Exception("IOF");
        } catch (Exception e6) {
            AFLogger.afErrorLogForExcManagerOnly("GF", e6);
            throw new Exception("GF");
        }
    }
}

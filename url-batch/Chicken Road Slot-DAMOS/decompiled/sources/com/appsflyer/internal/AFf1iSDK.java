package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
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

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFf1iSDK {
    private static AFf1iSDK getRevenue;
    private final Map<String, String> getCurrencyIso4217Code = new HashMap<String, String>() { // from class: com.appsflyer.internal.AFf1iSDK.3
        {
            put("aa", "ro.arch");
            put("ab", "ro.chipname");
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
            put("ap", "ro.build.user");
            put("aq", "ro.kernel.qemu");
            put("ar", "ro.hardware");
            put("as", "ro.product.cpu.abi");
            put("at", "ro.product.cpu.abilist");
            put("au", "ro.product.cpu.abilist32");
            put("av", "ro.product.cpu.abilist64");
        }
    };

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public enum AFa1uSDK {
        XPOSED("xps"),
        FRIDA("frd");

        String getMonetizationNetwork;

        AFa1uSDK(String str) {
            this.getMonetizationNetwork = str;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public enum AFa1ySDK {
        HOOKING("hk"),
        DEBUGGABLE("dbg");

        String getMonetizationNetwork;

        AFa1ySDK(String str) {
            this.getMonetizationNetwork = str;
        }
    }

    private AFf1iSDK() {
    }

    private static String AFAdRevenueData(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e2) {
            AFLogger.afErrorLogForExcManagerOnly("error in props rfl", e2);
            return null;
        }
    }

    public static AFf1iSDK getCurrencyIso4217Code() {
        if (getRevenue == null) {
            getRevenue = new AFf1iSDK();
        }
        return getRevenue;
    }

    private AFg1gSDK getMediationNetwork() {
        AFg1gSDK aFg1gSDK = new AFg1gSDK();
        try {
            for (Map.Entry<String, String> entry : this.getCurrencyIso4217Code.entrySet()) {
                String AFAdRevenueData = AFAdRevenueData(entry.getValue());
                if (AFAdRevenueData != null && !AFAdRevenueData.equals("")) {
                    aFg1gSDK.getMonetizationNetwork(entry.getKey(), AFAdRevenueData);
                }
            }
            return aFg1gSDK;
        } catch (Exception e2) {
            AFLogger.afErrorLogForExcManagerOnly("failed to create props", e2);
            return aFg1gSDK;
        }
    }

    private static boolean getMonetizationNetwork(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    private static String getRevenue() {
        StringBuilder sb2 = new StringBuilder();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            int i3 = 0;
            int i10 = 0;
            while (it.hasNext()) {
                for (StackTraceElement stackTraceElement : it.next().getValue()) {
                    if (stackTraceElement.toString().contains("de.robv.android.xposed") && i10 <= 2) {
                        i10++;
                        sb2.append(AFa1uSDK.XPOSED.getMonetizationNetwork);
                        if (stackTraceElement.getMethodName().equals("main")) {
                            sb2.append("+a");
                        }
                        if (stackTraceElement.getMethodName().equals("handleHookedMethod")) {
                            sb2.append("+h");
                        }
                        sb2.append(";");
                    }
                    if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                        i3++;
                    }
                }
            }
            if (i3 > 1) {
                sb2.append("mz;");
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("hooking check error", th);
        }
        try {
            StringBuilder sb3 = new StringBuilder("/proc/");
            sb3.append(Process.myPid());
            sb3.append("/maps");
            if (getRevenue(sb3.toString(), "frida")) {
                sb2.append(AFa1uSDK.FRIDA.getMonetizationNetwork);
                if (Build.VERSION.SDK_INT < 29 && getRevenue("/proc/net/tcp", "69A2")) {
                    sb2.append("+prt");
                }
            }
        } catch (Exception e2) {
            AFLogger.afErrorLogForExcManagerOnly("frida detection error", e2);
            sb2.append(e2.getMessage().toLowerCase(Locale.getDefault()));
        }
        sb2.append(";");
        return sb2.toString();
    }

    private static boolean getMonetizationNetwork(String str) {
        return str.matches("\\d+");
    }

    private AFg1gSDK getMediationNetwork(Context context) {
        AFg1gSDK aFg1gSDK = new AFg1gSDK();
        try {
            aFg1gSDK.getMonetizationNetwork(AFa1ySDK.HOOKING.getMonetizationNetwork, getRevenue());
            aFg1gSDK.getMonetizationNetwork(AFa1ySDK.DEBUGGABLE.getMonetizationNetwork, Boolean.valueOf(getMonetizationNetwork(context)));
            return aFg1gSDK;
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("failed to perform analysis checks", th);
            return aFg1gSDK;
        }
    }

    public final Object getRevenue(Context context, String str) {
        String str2 = null;
        if (str != null) {
            try {
                if (!getMonetizationNetwork(str)) {
                }
                AFg1gSDK aFg1gSDK = new AFg1gSDK();
                aFg1gSDK.getMonetizationNetwork("pr", getMediationNetwork());
                aFg1gSDK.getMonetizationNetwork("an", getMediationNetwork(context));
                return aFg1gSDK;
            } catch (Exception e2) {
                AFLogger.afErrorLogForExcManagerOnly("could not get anti fraud data", e2);
                return str2;
            }
        }
        str2 = "invalid timestamp";
        AFg1gSDK aFg1gSDK2 = new AFg1gSDK();
        aFg1gSDK2.getMonetizationNetwork("pr", getMediationNetwork());
        aFg1gSDK2.getMonetizationNetwork("an", getMediationNetwork(context));
        return aFg1gSDK2;
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
        } catch (FileNotFoundException e2) {
            AFLogger.afErrorLogForExcManagerOnly("FNF", e2);
            throw new Exception("FNF");
        } catch (IOException e9) {
            AFLogger.afErrorLogForExcManagerOnly("IOF", e9);
            throw new Exception("IOF");
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("GF", e10);
            throw new Exception("GF");
        }
    }
}

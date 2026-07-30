package com.artillery.ctc.uitls;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import com.baidu.ar.constants.HttpConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.UUID;
import w0.a;
import y.d;

@Keep
/* loaded from: classes.dex */
public final class DeviceUtils {
    private static final String KEY_UDID = "KEY_UDID";
    private static volatile String udid;

    private DeviceUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static String[] getABIs() {
        return Build.SUPPORTED_ABIS;
    }

    @SuppressLint({"HardwareIds"})
    public static String getAndroidID() {
        String string = Settings.Secure.getString(d.a().getContentResolver(), "android_id");
        return ("9774d56d682e549c".equals(string) || string == null) ? "" : string;
    }

    private static InetAddress getInetAddress() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement.isUp()) {
                    Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        if (!nextElement2.isLoopbackAddress() && nextElement2.getHostAddress().indexOf(58) < 0) {
                            return nextElement2;
                        }
                    }
                }
            }
            return null;
        } catch (SocketException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    private static String getMacAddressByInetAddress() {
        NetworkInterface byInetAddress;
        byte[] hardwareAddress;
        try {
            InetAddress inetAddress = getInetAddress();
            if (inetAddress == null || (byInetAddress = NetworkInterface.getByInetAddress(inetAddress)) == null || (hardwareAddress = byInetAddress.getHardwareAddress()) == null || hardwareAddress.length <= 0) {
                return "02:00:00:00:00:00";
            }
            StringBuilder sb = new StringBuilder();
            for (byte b8 : hardwareAddress) {
                sb.append(String.format("%02x:", Byte.valueOf(b8)));
            }
            return sb.substring(0, sb.length() - 1);
        } catch (Exception e8) {
            e8.printStackTrace();
            return "02:00:00:00:00:00";
        }
    }

    private static String getMacAddressByNetworkInterface() {
        byte[] hardwareAddress;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement != null && nextElement.getName().equalsIgnoreCase("wlan0") && (hardwareAddress = nextElement.getHardwareAddress()) != null && hardwareAddress.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    for (byte b8 : hardwareAddress) {
                        sb.append(String.format("%02x:", Byte.valueOf(b8)));
                    }
                    return sb.substring(0, sb.length() - 1);
                }
            }
            return "02:00:00:00:00:00";
        } catch (Exception e8) {
            e8.printStackTrace();
            return "02:00:00:00:00:00";
        }
    }

    @RequiresPermission("android.permission.ACCESS_WIFI_STATE")
    private static String getMacAddressByWifiInfo() {
        WifiInfo connectionInfo;
        try {
            WifiManager wifiManager = (WifiManager) d.a().getApplicationContext().getSystemService("wifi");
            if (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
                return "02:00:00:00:00:00";
            }
            String macAddress = connectionInfo.getMacAddress();
            return !TextUtils.isEmpty(macAddress) ? macAddress : "02:00:00:00:00:00";
        } catch (Exception e8) {
            e8.printStackTrace();
            return "02:00:00:00:00:00";
        }
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String getModel() {
        String str = Build.MODEL;
        return str != null ? str.trim().replaceAll(a.BLANK_REGEX, "") : "";
    }

    public static int getSDKVersionCode() {
        return Build.VERSION.SDK_INT;
    }

    public static String getSDKVersionName() {
        return Build.VERSION.RELEASE;
    }

    private static String getUdid(String str, String str2) {
        if (str2.equals("")) {
            return str + UUID.randomUUID().toString().replace("-", "");
        }
        return str + UUID.nameUUIDFromBytes(str2.getBytes()).toString().replace("-", "");
    }

    public static String getUniqueDeviceId() {
        return getUniqueDeviceId("", true);
    }

    private static String getUniqueDeviceIdReal(String str) {
        try {
            String androidID = getAndroidID();
            if (!TextUtils.isEmpty(androidID)) {
                return saveUdid(str + 2, androidID);
            }
        } catch (Exception unused) {
        }
        return saveUdid(str + 9, "");
    }

    private static boolean getWifiEnabled() {
        WifiManager wifiManager = (WifiManager) d.a().getSystemService("wifi");
        if (wifiManager == null) {
            return false;
        }
        return wifiManager.isWifiEnabled();
    }

    @RequiresApi(api = 17)
    public static boolean isAdbEnabled() {
        return Settings.Secure.getInt(d.a().getContentResolver(), "adb_enabled", 0) > 0;
    }

    private static boolean isAddressNotInExcepts(String str, String... strArr) {
        if (TextUtils.isEmpty(str) || "02:00:00:00:00:00".equals(str)) {
            return false;
        }
        if (strArr != null && strArr.length != 0) {
            for (String str2 : strArr) {
                if (str2 != null && str2.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    @RequiresApi(api = 17)
    public static boolean isDevelopmentSettingsEnabled() {
        return Settings.Global.getInt(d.a().getContentResolver(), "development_settings_enabled", 0) > 0;
    }

    public static boolean isDeviceRooted() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/sbin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/xbin/", "/data/local/bin/", "/data/local/", "/system/sbin/", "/usr/bin/", "/vendor/bin/"};
        for (int i8 = 0; i8 < 11; i8++) {
            if (new File(strArr[i8] + "su").exists()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEmulator() {
        String str;
        String str2 = Build.FINGERPRINT;
        if (!str2.startsWith("generic") && !str2.toLowerCase().contains("vbox") && !str2.toLowerCase().contains("test-keys")) {
            String str3 = Build.MODEL;
            if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT))) {
                TelephonyManager telephonyManager = (TelephonyManager) d.a().getSystemService("phone");
                if (telephonyManager == null || (str = telephonyManager.getNetworkOperatorName()) == null) {
                    str = "";
                }
                if (str.toLowerCase().equals(HttpConstants.OS_TYPE_VALUE)) {
                    return true;
                }
                Intent intent = new Intent();
                intent.setData(Uri.parse("tel:123456"));
                intent.setAction("android.intent.action.DIAL");
                return intent.resolveActivity(d.a().getPackageManager()) == null || isEmulatorByCpu();
            }
        }
        return true;
    }

    private static boolean isEmulatorByCpu() {
        String readCpuInfo = readCpuInfo();
        return readCpuInfo.contains("intel") || readCpuInfo.contains("amd");
    }

    public static boolean isTablet() {
        return (Resources.getSystem().getConfiguration().screenLayout & 15) >= 3;
    }

    private static String readCpuInfo() {
        try {
            Process start = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start();
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(start.getInputStream(), "utf-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return sb.toString().toLowerCase();
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            return "";
        }
    }

    private static String saveUdid(String str, String str2) {
        udid = getUdid(str, str2);
        SPUtils.getInstance("Utils").put(KEY_UDID, udid);
        return udid;
    }

    @RequiresPermission("android.permission.CHANGE_WIFI_STATE")
    private static void setWifiEnabled(boolean z7) {
        WifiManager wifiManager = (WifiManager) d.a().getSystemService("wifi");
        if (wifiManager == null || z7 == wifiManager.isWifiEnabled()) {
            return;
        }
        wifiManager.setWifiEnabled(z7);
    }

    public static String getUniqueDeviceId(String str) {
        return getUniqueDeviceId(str, true);
    }

    public static String getUniqueDeviceId(boolean z7) {
        return getUniqueDeviceId("", z7);
    }

    public static String getUniqueDeviceId(String str, boolean z7) {
        if (!z7) {
            return getUniqueDeviceIdReal(str);
        }
        if (udid == null) {
            synchronized (DeviceUtils.class) {
                try {
                    if (udid == null) {
                        String string = SPUtils.getInstance("Utils").getString(KEY_UDID, null);
                        if (string == null) {
                            return getUniqueDeviceIdReal(str);
                        }
                        udid = string;
                        return udid;
                    }
                } finally {
                }
            }
        }
        return udid;
    }
}

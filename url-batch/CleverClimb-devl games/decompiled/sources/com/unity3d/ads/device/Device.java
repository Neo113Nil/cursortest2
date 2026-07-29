package com.unity3d.ads.device;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import com.applovin.sdk.AppLovinEventTypes;
import com.tapjoy.TapjoyConstants;
import com.umeng.commonsdk.proguard.d;
import com.unity3d.ads.log.DeviceLog;
import com.unity3d.ads.misc.Utilities;
import com.unity3d.ads.properties.ClientProperties;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class Device {

    public enum MemoryInfoType {
        TOTAL_MEMORY,
        FREE_MEMORY
    }

    public static int getApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    public static String getOsVersion() {
        return Build.VERSION.RELEASE;
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String getModel() {
        return Build.MODEL;
    }

    public static int getScreenLayout() {
        if (ClientProperties.getApplicationContext() != null) {
            return ClientProperties.getApplicationContext().getResources().getConfiguration().screenLayout;
        }
        return -1;
    }

    @SuppressLint({"DefaultLocale"})
    public static String getAndroidId() {
        try {
            return Settings.Secure.getString(ClientProperties.getApplicationContext().getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
        } catch (Exception e) {
            DeviceLog.exception("Problems fetching androidId", e);
            return null;
        }
    }

    public static String getAdvertisingTrackingId() {
        return AdvertisingId.getAdvertisingTrackingId();
    }

    public static boolean isLimitAdTrackingEnabled() {
        return AdvertisingId.getLimitedAdTracking();
    }

    public static boolean isUsingWifi() {
        ConnectivityManager connectivityManager;
        if (ClientProperties.getApplicationContext() == null || (connectivityManager = (ConnectivityManager) ClientProperties.getApplicationContext().getSystemService("connectivity")) == null) {
            return false;
        }
        TelephonyManager telephonyManager = (TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && connectivityManager.getBackgroundDataSetting() && connectivityManager.getActiveNetworkInfo().isConnected() && telephonyManager != null && activeNetworkInfo.getType() == 1 && activeNetworkInfo.isConnected();
    }

    public static int getNetworkType() {
        if (ClientProperties.getApplicationContext() != null) {
            return ((TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkType();
        }
        return -1;
    }

    public static boolean getNetworkMetered() {
        ConnectivityManager connectivityManager;
        if (ClientProperties.getApplicationContext() == null || Build.VERSION.SDK_INT < 16 || (connectivityManager = (ConnectivityManager) ClientProperties.getApplicationContext().getSystemService("connectivity")) == null) {
            return false;
        }
        return connectivityManager.isActiveNetworkMetered();
    }

    public static String getNetworkOperator() {
        return ClientProperties.getApplicationContext() != null ? ((TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkOperator() : "";
    }

    public static String getNetworkOperatorName() {
        return ClientProperties.getApplicationContext() != null ? ((TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkOperatorName() : "";
    }

    public static int getScreenDensity() {
        if (ClientProperties.getApplicationContext() != null) {
            return ClientProperties.getApplicationContext().getResources().getDisplayMetrics().densityDpi;
        }
        return -1;
    }

    public static int getScreenWidth() {
        if (ClientProperties.getApplicationContext() != null) {
            return ClientProperties.getApplicationContext().getResources().getDisplayMetrics().widthPixels;
        }
        return -1;
    }

    public static int getScreenHeight() {
        if (ClientProperties.getApplicationContext() != null) {
            return ClientProperties.getApplicationContext().getResources().getDisplayMetrics().heightPixels;
        }
        return -1;
    }

    public static boolean isActiveNetworkConnected() {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        return (ClientProperties.getApplicationContext() == null || (connectivityManager = (ConnectivityManager) ClientProperties.getApplicationContext().getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    public static boolean isAppInstalled(String str) {
        if (ClientProperties.getApplicationContext() != null) {
            try {
                PackageInfo packageInfo = ClientProperties.getApplicationContext().getPackageManager().getPackageInfo(str, 0);
                if (packageInfo != null && packageInfo.packageName != null) {
                    if (str.equals(packageInfo.packageName)) {
                        return true;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }
        return false;
    }

    public static List<Map<String, Object>> getInstalledPackages(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (ClientProperties.getApplicationContext() != null) {
            PackageManager packageManager = ClientProperties.getApplicationContext().getPackageManager();
            for (PackageInfo packageInfo : packageManager.getInstalledPackages(0)) {
                HashMap hashMap = new HashMap();
                if (z) {
                    hashMap.put("name", Utilities.Sha256(packageInfo.packageName));
                } else {
                    hashMap.put("name", packageInfo.packageName);
                }
                if (packageInfo.firstInstallTime > 0) {
                    hashMap.put("time", Long.valueOf(packageInfo.firstInstallTime));
                }
                String installerPackageName = packageManager.getInstallerPackageName(packageInfo.packageName);
                if (installerPackageName != null && !installerPackageName.isEmpty()) {
                    hashMap.put(TapjoyConstants.TJC_INSTALLER, installerPackageName);
                }
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    public static String getUniqueEventId() {
        return UUID.randomUUID().toString();
    }

    public static boolean isWiredHeadsetOn() {
        if (ClientProperties.getApplicationContext() != null) {
            return ((AudioManager) ClientProperties.getApplicationContext().getSystemService("audio")).isWiredHeadsetOn();
        }
        return false;
    }

    public static String getSystemProperty(String str, String str2) {
        if (str2 != null) {
            return System.getProperty(str, str2);
        }
        return System.getProperty(str);
    }

    public static int getRingerMode() {
        if (ClientProperties.getApplicationContext() == null) {
            return -1;
        }
        AudioManager audioManager = (AudioManager) ClientProperties.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            return audioManager.getRingerMode();
        }
        return -2;
    }

    public static int getStreamVolume(int i) {
        if (ClientProperties.getApplicationContext() == null) {
            return -1;
        }
        AudioManager audioManager = (AudioManager) ClientProperties.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            return audioManager.getStreamVolume(i);
        }
        return -2;
    }

    public static int getStreamMaxVolume(int i) {
        if (ClientProperties.getApplicationContext() == null) {
            return -1;
        }
        AudioManager audioManager = (AudioManager) ClientProperties.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            return audioManager.getStreamMaxVolume(i);
        }
        return -2;
    }

    public static int getScreenBrightness() {
        if (ClientProperties.getApplicationContext() != null) {
            return Settings.System.getInt(ClientProperties.getApplicationContext().getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }

    public static long getFreeSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return Math.round(file.getFreeSpace() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
    }

    public static long getTotalSpace(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return Math.round(file.getTotalSpace() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
    }

    public static float getBatteryLevel() {
        Intent registerReceiver;
        if (ClientProperties.getApplicationContext() == null || (registerReceiver = ClientProperties.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return -1.0f;
        }
        return registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) / registerReceiver.getIntExtra("scale", -1);
    }

    public static int getBatteryStatus() {
        Intent registerReceiver;
        if (ClientProperties.getApplicationContext() == null || (registerReceiver = ClientProperties.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return -1;
        }
        return registerReceiver.getIntExtra("status", -1);
    }

    public static long getTotalMemory() {
        return getMemoryInfo(MemoryInfoType.TOTAL_MEMORY);
    }

    public static long getFreeMemory() {
        return getMemoryInfo(MemoryInfoType.FREE_MEMORY);
    }

    private static long getMemoryInfo(MemoryInfoType memoryInfoType) {
        int i;
        switch (memoryInfoType) {
            case TOTAL_MEMORY:
                i = 1;
                break;
            case FREE_MEMORY:
                i = 2;
                break;
            default:
                i = -1;
                break;
        }
        RandomAccessFile randomAccessFile = null;
        String str = null;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                RandomAccessFile randomAccessFile3 = new RandomAccessFile("/proc/meminfo", "r");
                for (int i2 = 0; i2 < i; i2++) {
                    try {
                        str = randomAccessFile3.readLine();
                    } catch (IOException e) {
                        e = e;
                        randomAccessFile = randomAccessFile3;
                        DeviceLog.exception("Error while reading memory info: " + memoryInfoType, e);
                        try {
                            randomAccessFile.close();
                            return -1L;
                        } catch (IOException e2) {
                            DeviceLog.exception("Error closing RandomAccessFile", e2);
                            return -1L;
                        }
                    } catch (Throwable th) {
                        th = th;
                        randomAccessFile2 = randomAccessFile3;
                        try {
                            randomAccessFile2.close();
                        } catch (IOException e3) {
                            DeviceLog.exception("Error closing RandomAccessFile", e3);
                        }
                        throw th;
                    }
                }
                long memoryValueFromString = getMemoryValueFromString(str);
                try {
                    randomAccessFile3.close();
                } catch (IOException e4) {
                    DeviceLog.exception("Error closing RandomAccessFile", e4);
                }
                return memoryValueFromString;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }

    private static long getMemoryValueFromString(String str) {
        if (str == null) {
            return -1L;
        }
        Matcher matcher = Pattern.compile("(\\d+)").matcher(str);
        String str2 = "";
        while (matcher.find()) {
            str2 = matcher.group(1);
        }
        return Long.parseLong(str2);
    }

    public static boolean isRooted() {
        try {
            return searchPathForBinary("su");
        } catch (Exception e) {
            DeviceLog.exception("Rooted check failed", e);
            return false;
        }
    }

    public static Boolean isAdbEnabled() {
        if (getApiLevel() < 17) {
            return oldAdbStatus();
        }
        return newAdbStatus();
    }

    private static Boolean oldAdbStatus() {
        try {
            boolean z = true;
            if (1 != Settings.Secure.getInt(ClientProperties.getApplicationContext().getContentResolver(), "adb_enabled", 0)) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Exception e) {
            DeviceLog.exception("Problems fetching adb enabled status", e);
            return null;
        }
    }

    @TargetApi(17)
    private static Boolean newAdbStatus() {
        try {
            boolean z = true;
            if (1 != Settings.Global.getInt(ClientProperties.getApplicationContext().getContentResolver(), "adb_enabled", 0)) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Exception e) {
            DeviceLog.exception("Problems fetching adb enabled status", e);
            return null;
        }
    }

    private static boolean searchPathForBinary(String str) {
        File[] listFiles;
        for (String str2 : System.getenv("PATH").split(":")) {
            File file = new File(str2);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.getName().equals(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String getGLVersion() {
        ActivityManager activityManager;
        ConfigurationInfo deviceConfigurationInfo;
        if (ClientProperties.getApplicationContext() == null || (activityManager = (ActivityManager) ClientProperties.getApplicationContext().getSystemService("activity")) == null || (deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo()) == null) {
            return null;
        }
        return deviceConfigurationInfo.getGlEsVersion();
    }

    public static String getApkDigest() throws Exception {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(new File(ClientProperties.getApplicationContext().getPackageCodePath()));
            try {
                String Sha256 = Utilities.Sha256(fileInputStream2);
                try {
                    fileInputStream2.close();
                } catch (IOException unused) {
                }
                return Sha256;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String getCertificateFingerprint() {
        try {
            Signature[] signatureArr = ClientProperties.getApplicationContext().getPackageManager().getPackageInfo(ClientProperties.getApplicationContext().getPackageName(), 64).signatures;
            if (signatureArr == null || signatureArr.length < 1) {
                return null;
            }
            return Utilities.toHexString(MessageDigest.getInstance("SHA-1").digest(((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getEncoded()));
        } catch (Exception e) {
            DeviceLog.exception("Exception when signing certificate fingerprint", e);
            return null;
        }
    }

    public static String getBoard() {
        return Build.BOARD;
    }

    public static String getBootloader() {
        return Build.BOOTLOADER;
    }

    public static String getBrand() {
        return Build.BRAND;
    }

    public static String getDevice() {
        return Build.DEVICE;
    }

    public static String getHardware() {
        return Build.HARDWARE;
    }

    public static String getHost() {
        return Build.HOST;
    }

    public static String getProduct() {
        return Build.PRODUCT;
    }

    public static String getFingerprint() {
        return Build.FINGERPRINT;
    }

    public static ArrayList<String> getSupportedAbis() {
        if (getApiLevel() < 21) {
            return getOldAbiList();
        }
        return getNewAbiList();
    }

    public static List<Sensor> getSensorList() {
        if (ClientProperties.getApplicationContext() != null) {
            return ((SensorManager) ClientProperties.getApplicationContext().getSystemService(d.aa)).getSensorList(-1);
        }
        return null;
    }

    public static boolean isUSBConnected() {
        Intent registerReceiver;
        if (ClientProperties.getApplicationContext() == null || (registerReceiver = ClientProperties.getApplicationContext().registerReceiver(null, new IntentFilter("android.hardware.usb.action.USB_STATE"))) == null) {
            return false;
        }
        return registerReceiver.getBooleanExtra("connected", false);
    }

    public static long getCPUCount() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static long getUptime() {
        return SystemClock.uptimeMillis();
    }

    public static long getElapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    public static String getBuildId() {
        return Build.ID;
    }

    public static String getBuildVersionIncremental() {
        return Build.VERSION.INCREMENTAL;
    }

    private static ArrayList<String> getOldAbiList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(Build.CPU_ABI);
        arrayList.add(Build.CPU_ABI2);
        return arrayList;
    }

    @TargetApi(21)
    private static ArrayList<String> getNewAbiList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(Build.SUPPORTED_ABIS));
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:2|3)|(5:5|6|7|8|9)|10|11|13|14|15|16|17|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|2|3|(5:5|6|7|8|9)|10|11|13|14|15|16|17|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:(5:5|6|7|8|9)|10|11|13|14|15|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        r2 = r1;
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        com.unity3d.ads.log.DeviceLog.exception("Error while reading processor info: ", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        com.unity3d.ads.log.DeviceLog.exception("Error closing RandomAccessFile", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0069, code lost:
    
        com.unity3d.ads.log.DeviceLog.exception("Error closing RandomAccessFile", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005e, code lost:
    
        r2 = e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map<String, String> getProcessInfo() {
        RandomAccessFile randomAccessFile;
        HashMap hashMap = new HashMap();
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile("/proc/self/stat", "r");
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            try {
                hashMap.put("stat", randomAccessFile.readLine());
                try {
                    randomAccessFile.close();
                } catch (IOException e2) {
                    DeviceLog.exception("Error closing RandomAccessFile", e2);
                }
                randomAccessFile2 = randomAccessFile;
            } catch (IOException e3) {
                e = e3;
                randomAccessFile2 = randomAccessFile;
                DeviceLog.exception("Error while reading processor info: ", e);
                try {
                    randomAccessFile2.close();
                } catch (IOException e4) {
                    DeviceLog.exception("Error closing RandomAccessFile", e4);
                }
                RandomAccessFile randomAccessFile3 = new RandomAccessFile("/proc/uptime", "r");
                hashMap.put("uptime", randomAccessFile3.readLine());
                randomAccessFile3.close();
                return hashMap;
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile2 = randomAccessFile;
                try {
                    randomAccessFile2.close();
                } catch (IOException e5) {
                    DeviceLog.exception("Error closing RandomAccessFile", e5);
                }
                throw th;
            }
            RandomAccessFile randomAccessFile32 = new RandomAccessFile("/proc/uptime", "r");
            hashMap.put("uptime", randomAccessFile32.readLine());
            randomAccessFile32.close();
            return hashMap;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}

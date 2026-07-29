package com.umeng.commonsdk.statistics.common;

import android.content.Context;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.tapjoy.TapjoyConstants;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Properties;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes2.dex */
public class DeviceConfig {
    public static final int DEFAULT_TIMEZONE = 8;
    private static final String KEY_EMUI_VERSION_CODE = "ro.build.hw_emui_api_level";
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    protected static final String LOG_TAG = "com.umeng.commonsdk.statistics.common.DeviceConfig";
    public static final String MOBILE_NETWORK = "2G/3G";
    public static final String UNKNOW = "";
    public static final String WIFI = "Wi-Fi";

    public static String getImei(Context context) {
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null || !checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                return null;
            }
            return telephonyManager.getDeviceId();
        } catch (Exception e) {
            if (!AnalyticsConstants.UM_DEBUG) {
                return null;
            }
            MLog.w("No IMEI.", e);
            return null;
        }
    }

    public static String getImeiNew(Context context) {
        String deviceId;
        String str = null;
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null || !checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    Method method = telephonyManager.getClass().getMethod("getImei", new Class[0]);
                    method.setAccessible(true);
                    str = (String) method.invoke(telephonyManager, new Object[0]);
                } catch (Exception unused) {
                }
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
                deviceId = telephonyManager.getDeviceId();
            } else {
                deviceId = telephonyManager.getDeviceId();
            }
            return deviceId;
        } catch (Exception e) {
            if (!AnalyticsConstants.UM_DEBUG) {
                return null;
            }
            MLog.w("No IMEI.", e);
            return null;
        }
    }

    public static String getAndroidId(Context context) {
        if (context != null) {
            try {
                return Settings.Secure.getString(context.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
            } catch (Exception unused) {
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.w("can't read android id");
                }
            }
        }
        return null;
    }

    public static String getSerial() {
        if (Build.VERSION.SDK_INT < 9) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Class<?> cls = Class.forName("android.os.Build");
                return (String) cls.getMethod("getSerial", new Class[0]).invoke(cls, new Object[0]);
            } catch (Throwable unused) {
                return null;
            }
        }
        return Build.SERIAL;
    }

    public static String getAppVersionCode(Context context) {
        return UMUtils.getAppVersionCode(context);
    }

    public static String getAppVersionName(Context context) {
        return UMUtils.getAppVersionName(context);
    }

    public static boolean checkPermission(Context context, String str) {
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() != 0) {
                    return false;
                }
            } catch (Throwable unused) {
                return false;
            }
        } else if (context.getPackageManager().checkPermission(str, context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }

    public static String[] getGPU(GL10 gl10) {
        try {
            return new String[]{gl10.glGetString(7936), gl10.glGetString(7937)};
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.e(LOG_TAG, "Could not read gpu infor:", th);
            }
            return new String[0];
        }
    }

    private static String getMacByJavaAPI() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if ("wlan0".equals(nextElement.getName()) || "eth0".equals(nextElement.getName())) {
                    byte[] hardwareAddress = nextElement.getHardwareAddress();
                    if (hardwareAddress != null && hardwareAddress.length != 0) {
                        StringBuilder sb = new StringBuilder();
                        for (byte b2 : hardwareAddress) {
                            sb.append(String.format("%02X:", Byte.valueOf(b2)));
                        }
                        if (sb.length() > 0) {
                            sb.deleteCharAt(sb.length() - 1);
                        }
                        return sb.toString().toLowerCase(Locale.getDefault());
                    }
                    return null;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static String getMacShell() {
        String reaMac;
        try {
            for (String str : new String[]{"/sys/class/net/wlan0/address", "/sys/class/net/eth0/address", "/sys/devices/virtual/net/wlan0/address"}) {
                try {
                    reaMac = reaMac(str);
                } catch (Throwable th) {
                    if (AnalyticsConstants.UM_DEBUG) {
                        MLog.e(LOG_TAG, "open file  Failed", th);
                    }
                }
                if (reaMac != null) {
                    return reaMac;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String reaMac(String str) {
        BufferedReader bufferedReader;
        try {
            FileReader fileReader = new FileReader(str);
            try {
                bufferedReader = new BufferedReader(fileReader, 1024);
                try {
                    String readLine = bufferedReader.readLine();
                    try {
                        fileReader.close();
                    } catch (Throwable unused) {
                    }
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused2) {
                    }
                    return readLine;
                } catch (Throwable th) {
                    th = th;
                    try {
                        fileReader.close();
                    } catch (Throwable unused3) {
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                            throw th;
                        } catch (Throwable unused4) {
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (Throwable unused5) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getCPU() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String readLine;
        String str = null;
        try {
            fileReader = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(fileReader, 1024);
                readLine = bufferedReader.readLine();
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException e) {
            e = e;
        }
        try {
            bufferedReader.close();
            fileReader.close();
            str = readLine;
        } catch (FileNotFoundException e2) {
            e = e2;
            str = readLine;
            MLog.e(LOG_TAG, "Could not open file /proc/cpuinfo", e);
            if (str != null) {
            }
        } catch (Throwable th2) {
            th = th2;
            str = readLine;
            MLog.e(LOG_TAG, "Could not read from file /proc/cpuinfo", th);
            if (str != null) {
            }
        }
        return str != null ? str.substring(str.indexOf(58) + 1).trim() : "";
    }

    public static String getDeviceId(Context context) {
        if (AnalyticsConstants.getDeviceType() == 2) {
            return getDeviceIdForBox(context);
        }
        return getDeviceIdForGeneral(context);
    }

    public static String getDeviceIdUmengMD5(Context context) {
        return HelperUtils.getUmengMD5(getDeviceId(context));
    }

    public static String getMCCMNC(Context context) {
        if (context == null || getImsi(context) == null) {
            return null;
        }
        int i = context.getResources().getConfiguration().mcc;
        int i2 = context.getResources().getConfiguration().mnc;
        if (i == 0) {
            return null;
        }
        String valueOf = String.valueOf(i2);
        if (i2 < 10) {
            valueOf = String.format("%02d", Integer.valueOf(i2));
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.valueOf(i));
        stringBuffer.append(valueOf);
        return stringBuffer.toString();
    }

    public static String getImsi(Context context) {
        if (context == null) {
            return null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (checkPermission(context, "android.permission.READ_PHONE_STATE")) {
            return telephonyManager.getSubscriberId();
        }
        return null;
    }

    public static String getRegisteredOperator(Context context) {
        if (context == null) {
            return null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (checkPermission(context, "android.permission.READ_PHONE_STATE")) {
            return telephonyManager.getNetworkOperator();
        }
        return null;
    }

    public static String getNetworkOperatorName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return (!checkPermission(context, "android.permission.READ_PHONE_STATE") || telephonyManager == null) ? "" : telephonyManager.getNetworkOperatorName();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getDisplayResolution(Context context) {
        if (context == null) {
            return "";
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            return String.valueOf(displayMetrics.heightPixels) + "*" + String.valueOf(i);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String[] getNetworkAccessMode(Context context) {
        String[] strArr = {"", ""};
        if (context == null) {
            return strArr;
        }
        if (!checkPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            strArr[0] = "";
            return strArr;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            strArr[0] = "";
            return strArr;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && networkInfo.getState() == NetworkInfo.State.CONNECTED) {
            strArr[0] = "Wi-Fi";
            return strArr;
        }
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
        if (networkInfo2 != null && networkInfo2.getState() == NetworkInfo.State.CONNECTED) {
            strArr[0] = "2G/3G";
            strArr[1] = networkInfo2.getSubtypeName();
            return strArr;
        }
        return strArr;
    }

    public static boolean isWiFiAvailable(Context context) {
        if (context == null) {
            return false;
        }
        return "Wi-Fi".equals(getNetworkAccessMode(context)[0]);
    }

    public static boolean isOnline(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return false;
        }
        try {
            if (checkPermission(context, "android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                return activeNetworkInfo.isConnectedOrConnecting();
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static int getTimeZone(Context context) {
        if (context == null) {
            return 8;
        }
        try {
            Calendar calendar = Calendar.getInstance(getLocale(context));
            if (calendar != null) {
                return calendar.getTimeZone().getRawOffset() / 3600000;
            }
        } catch (Throwable th) {
            MLog.i(LOG_TAG, "error in getTimeZone", th);
        }
        return 8;
    }

    public static boolean isChineseAera(Context context) {
        if (context == null) {
            return false;
        }
        String imprintProperty = UMEnvelopeBuild.imprintProperty(context, com.umeng.commonsdk.proguard.d.N, "");
        if (!TextUtils.isEmpty(imprintProperty)) {
            return imprintProperty.equals("cn");
        }
        if (getImsi(context) == null) {
            String str = getLocaleInfo(context)[0];
            if (!TextUtils.isEmpty(str) && str.equalsIgnoreCase("cn")) {
                return true;
            }
        } else {
            int i = context.getResources().getConfiguration().mcc;
            if (i == 460 || i == 461) {
                return true;
            }
            if (i == 0) {
                String str2 = getLocaleInfo(context)[0];
                if (!TextUtils.isEmpty(str2) && str2.equalsIgnoreCase("cn")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String[] getLocaleInfo(Context context) {
        String[] strArr = {"Unknown", "Unknown"};
        if (context == null) {
            return strArr;
        }
        try {
            Locale locale = getLocale(context);
            if (locale != null) {
                strArr[0] = locale.getCountry();
                strArr[1] = locale.getLanguage();
            }
            if (TextUtils.isEmpty(strArr[0])) {
                strArr[0] = "Unknown";
            }
            if (TextUtils.isEmpty(strArr[1])) {
                strArr[1] = "Unknown";
            }
            return strArr;
        } catch (Throwable th) {
            MLog.e(LOG_TAG, "error in getLocaleInfo", th);
            return strArr;
        }
    }

    private static Locale getLocale(Context context) {
        Locale locale;
        if (context == null) {
            return Locale.getDefault();
        }
        try {
            Configuration configuration = new Configuration();
            configuration.setToDefaults();
            Settings.System.getConfiguration(context.getContentResolver(), configuration);
            locale = configuration.locale;
        } catch (Throwable unused) {
            MLog.e(LOG_TAG, "fail to read user config locale");
            locale = null;
        }
        return locale == null ? Locale.getDefault() : locale;
    }

    public static String getMac(Context context) {
        String macByJavaAPI;
        if (context == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT < 23) {
            return getMacBySystemInterface(context);
        }
        if (Build.VERSION.SDK_INT == 23) {
            macByJavaAPI = getMacByJavaAPI();
            if (TextUtils.isEmpty(macByJavaAPI)) {
                if (AnalyticsConstants.CHECK_DEVICE) {
                    return getMacShell();
                }
                return getMacBySystemInterface(context);
            }
        } else {
            macByJavaAPI = getMacByJavaAPI();
            if (TextUtils.isEmpty(macByJavaAPI)) {
                return getMacBySystemInterface(context);
            }
        }
        return macByJavaAPI;
    }

    private static String getMacBySystemInterface(Context context) {
        if (context == null) {
            return "";
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI);
            if (checkPermission(context, "android.permission.ACCESS_WIFI_STATE")) {
                return wifiManager.getConnectionInfo().getMacAddress();
            }
            if (!AnalyticsConstants.UM_DEBUG) {
                return "";
            }
            MLog.w(LOG_TAG, "Could not get mac address.[no permission android.permission.ACCESS_WIFI_STATE");
            return "";
        } catch (Throwable th) {
            if (!AnalyticsConstants.UM_DEBUG) {
                return "";
            }
            MLog.w(LOG_TAG, "Could not get mac address." + th.toString());
            return "";
        }
    }

    public static int[] getResolutionArray(Context context) {
        int i;
        int i2;
        if (context == null) {
            return null;
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            if ((context.getApplicationInfo().flags & 8192) == 0) {
                i = reflectMetrics(displayMetrics, "noncompatWidthPixels");
                i2 = reflectMetrics(displayMetrics, "noncompatHeightPixels");
            } else {
                i = -1;
                i2 = -1;
            }
            if (i == -1 || i2 == -1) {
                i = displayMetrics.widthPixels;
                i2 = displayMetrics.heightPixels;
            }
            int[] iArr = new int[2];
            if (i > i2) {
                iArr[0] = i2;
                iArr[1] = i;
            } else {
                iArr[0] = i;
                iArr[1] = i2;
            }
            return iArr;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.e(LOG_TAG, "read resolution fail", th);
            }
            return null;
        }
    }

    private static int reflectMetrics(Object obj, String str) {
        try {
            Field declaredField = DisplayMetrics.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.getInt(obj);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String getPackageName(Context context) {
        if (context == null) {
            return null;
        }
        return context.getPackageName();
    }

    public static String getAppSHA1Key(Context context) {
        try {
            return byte2HexFormatted(MessageDigest.getInstance(AndroidUtilsLight.DIGEST_ALGORITHM_SHA1).digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(getPackageName(context), 64).signatures[0].toByteArray()))).getEncoded()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getAppHashKey(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(getPackageName(context), 64).signatures;
            if (signatureArr.length <= 0) {
                return null;
            }
            Signature signature = signatureArr[0];
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(signature.toByteArray());
            return Base64.encodeToString(messageDigest.digest(), 0).trim();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getAppMD5Signature(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return byte2HexFormatted(MessageDigest.getInstance("MD5").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(getPackageName(context), 64).signatures[0].toByteArray()))).getEncoded()));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String byte2HexFormatted(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0" + hexString;
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase(Locale.getDefault()));
            if (i < bArr.length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }

    public static String getApplicationLable(Context context) {
        return context == null ? "" : context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
    }

    public static String getAppName(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.i(LOG_TAG, th);
            }
            return null;
        }
    }

    public static String getDeviceIdForGeneral(Context context) {
        if (context == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT < 23) {
            String imei = getIMEI(context);
            if (!TextUtils.isEmpty(imei)) {
                return imei;
            }
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.w(LOG_TAG, "No IMEI.");
            }
            String macBySystemInterface = getMacBySystemInterface(context);
            if (!TextUtils.isEmpty(macBySystemInterface)) {
                return macBySystemInterface;
            }
            String string = Settings.Secure.getString(context.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.i(LOG_TAG, "getDeviceId, ANDROID_ID: " + string);
            }
            return TextUtils.isEmpty(string) ? getSerialNo() : string;
        }
        if (Build.VERSION.SDK_INT == 23) {
            String imei2 = getIMEI(context);
            if (!TextUtils.isEmpty(imei2)) {
                return imei2;
            }
            String macByJavaAPI = getMacByJavaAPI();
            if (TextUtils.isEmpty(macByJavaAPI)) {
                if (AnalyticsConstants.CHECK_DEVICE) {
                    macByJavaAPI = getMacShell();
                } else {
                    macByJavaAPI = getMacBySystemInterface(context);
                }
            }
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.i(LOG_TAG, "getDeviceId, MAC: " + macByJavaAPI);
            }
            if (!TextUtils.isEmpty(macByJavaAPI)) {
                return macByJavaAPI;
            }
            String string2 = Settings.Secure.getString(context.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.i(LOG_TAG, "getDeviceId, ANDROID_ID: " + string2);
            }
            return TextUtils.isEmpty(string2) ? getSerialNo() : string2;
        }
        String imei3 = getIMEI(context);
        if (!TextUtils.isEmpty(imei3)) {
            return imei3;
        }
        String serialNo = getSerialNo();
        if (!TextUtils.isEmpty(serialNo)) {
            return serialNo;
        }
        String string3 = Settings.Secure.getString(context.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
        if (AnalyticsConstants.UM_DEBUG) {
            MLog.i(LOG_TAG, "getDeviceId, ANDROID_ID: " + string3);
        }
        if (!TextUtils.isEmpty(string3)) {
            return string3;
        }
        String macByJavaAPI2 = getMacByJavaAPI();
        if (!TextUtils.isEmpty(macByJavaAPI2)) {
            return macByJavaAPI2;
        }
        String macBySystemInterface2 = getMacBySystemInterface(context);
        if (!AnalyticsConstants.UM_DEBUG) {
            return macBySystemInterface2;
        }
        MLog.i(LOG_TAG, "getDeviceId, MAC: " + macBySystemInterface2);
        return macBySystemInterface2;
    }

    public static String getDeviceIdForBox(Context context) {
        if (context == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT < 23) {
            String string = Settings.Secure.getString(context.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.i(LOG_TAG, "getDeviceId, ANDROID_ID: " + string);
            }
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            String macBySystemInterface = getMacBySystemInterface(context);
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.i(LOG_TAG, "getDeviceId, MAC: " + macBySystemInterface);
            }
            if (!TextUtils.isEmpty(macBySystemInterface)) {
                return macBySystemInterface;
            }
            String serialNo = getSerialNo();
            return TextUtils.isEmpty(serialNo) ? getIMEI(context) : serialNo;
        }
        if (Build.VERSION.SDK_INT == 23) {
            String string2 = Settings.Secure.getString(context.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.i(LOG_TAG, "getDeviceId, ANDROID_ID: " + string2);
            }
            if (!TextUtils.isEmpty(string2)) {
                return string2;
            }
            String macByJavaAPI = getMacByJavaAPI();
            if (TextUtils.isEmpty(macByJavaAPI)) {
                if (AnalyticsConstants.CHECK_DEVICE) {
                    macByJavaAPI = getMacShell();
                } else {
                    macByJavaAPI = getMacBySystemInterface(context);
                }
            }
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.i(LOG_TAG, "getDeviceId, MAC: " + macByJavaAPI);
            }
            if (!TextUtils.isEmpty(macByJavaAPI)) {
                return macByJavaAPI;
            }
            String serialNo2 = getSerialNo();
            return TextUtils.isEmpty(serialNo2) ? getIMEI(context) : serialNo2;
        }
        String string3 = Settings.Secure.getString(context.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
        if (AnalyticsConstants.UM_DEBUG) {
            MLog.i(LOG_TAG, "getDeviceId: ANDROID_ID: " + string3);
        }
        if (!TextUtils.isEmpty(string3)) {
            return string3;
        }
        String serialNo3 = getSerialNo();
        if (!TextUtils.isEmpty(serialNo3)) {
            return serialNo3;
        }
        String imei = getIMEI(context);
        if (!TextUtils.isEmpty(imei)) {
            return imei;
        }
        String macByJavaAPI2 = getMacByJavaAPI();
        if (!TextUtils.isEmpty(macByJavaAPI2)) {
            return macByJavaAPI2;
        }
        String macBySystemInterface2 = getMacBySystemInterface(context);
        if (!AnalyticsConstants.UM_DEBUG) {
            return macBySystemInterface2;
        }
        MLog.i(LOG_TAG, "getDeviceId, MAC: " + macBySystemInterface2);
        return macBySystemInterface2;
    }

    private static String getIMEI(Context context) {
        TelephonyManager telephonyManager;
        Throwable th;
        String str;
        if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
            return "";
        }
        try {
        } catch (Throwable th2) {
            th = th2;
            str = "";
        }
        if (!checkPermission(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        str = telephonyManager.getDeviceId();
        try {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.i(LOG_TAG, "getDeviceId, IMEI: " + str);
            }
        } catch (Throwable th3) {
            th = th3;
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.w(LOG_TAG, "No IMEI.", th);
            }
            return str;
        }
        return str;
    }

    private static String getSerialNo() {
        String str = "";
        if (Build.VERSION.SDK_INT >= 9) {
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    Class<?> cls = Class.forName("android.os.Build");
                    str = (String) cls.getMethod("getSerial", new Class[0]).invoke(cls, new Object[0]);
                } catch (Throwable unused) {
                }
            } else {
                str = Build.SERIAL;
            }
        }
        if (AnalyticsConstants.UM_DEBUG) {
            MLog.i(LOG_TAG, "getDeviceId, serial no: " + str);
        }
        return str;
    }

    public static String getSubOSName(Context context) {
        Properties buildProp = getBuildProp();
        try {
            String property = buildProp.getProperty(KEY_MIUI_VERSION_NAME);
            return TextUtils.isEmpty(property) ? isFlyMe() ? "Flyme" : isEmui(buildProp) ? "Emui" : !TextUtils.isEmpty(getYunOSVersion(buildProp)) ? "YunOS" : property : "MIUI";
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getSubOSVersion(Context context) {
        String yunOSVersion;
        Properties buildProp = getBuildProp();
        try {
            String property = buildProp.getProperty(KEY_MIUI_VERSION_NAME);
            if (TextUtils.isEmpty(property)) {
                try {
                    if (isFlyMe()) {
                        yunOSVersion = getFlymeVersion(buildProp);
                    } else if (isEmui(buildProp)) {
                        yunOSVersion = getEmuiVersion(buildProp);
                    } else {
                        yunOSVersion = getYunOSVersion(buildProp);
                    }
                    return yunOSVersion;
                } catch (Throwable unused) {
                }
            }
            return property;
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static String getYunOSVersion(Properties properties) {
        String property = properties.getProperty("ro.yunos.version");
        if (TextUtils.isEmpty(property)) {
            return null;
        }
        return property;
    }

    private static String getFlymeVersion(Properties properties) {
        try {
            String lowerCase = properties.getProperty("ro.build.display.id").toLowerCase(Locale.getDefault());
            if (lowerCase.contains("flyme os")) {
                return lowerCase.split(" ")[2];
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String getEmuiVersion(Properties properties) {
        try {
            return properties.getProperty(KEY_EMUI_VERSION_CODE, null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Properties getBuildProp() {
        FileInputStream fileInputStream;
        Properties properties = new Properties();
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
        }
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (Throwable th) {
            th = th;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (Throwable unused3) {
                }
            }
            throw th;
        }
        return properties;
    }

    private static boolean isFlyMe() {
        try {
            Build.class.getMethod("hasSmartBar", new Class[0]);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean isEmui(Properties properties) {
        try {
            return properties.getProperty(KEY_EMUI_VERSION_CODE, null) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String getDeviceType(Context context) {
        if (context == null) {
            return "Phone";
        }
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3 ? "Tablet" : "Phone";
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0057 -> B:22:0x0058). Please report as a decompilation issue!!! */
    public static String getDBencryptID(Context context) {
        String str = null;
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null && checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                    str = telephonyManager.getDeviceId();
                }
                if (TextUtils.isEmpty(str)) {
                    String string = Settings.Secure.getString(context.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
                    if (TextUtils.isEmpty(string) && Build.VERSION.SDK_INT >= 9) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            Class<?> cls = Class.forName("android.os.Build");
                            str = (String) cls.getMethod("getSerial", new Class[0]).invoke(cls, new Object[0]);
                        } else {
                            str = Build.SERIAL;
                        }
                    }
                    str = string;
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }
}

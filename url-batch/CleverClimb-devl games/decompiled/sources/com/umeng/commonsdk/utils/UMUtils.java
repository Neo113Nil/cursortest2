package com.umeng.commonsdk.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import com.cmplay.base.util.ipc.a;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.tapjoy.TapjoyConstants;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.proguard.b;
import com.umeng.commonsdk.proguard.d;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.MLog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes2.dex */
public class UMUtils {
    public static final int DEFAULT_TIMEZONE = 8;
    private static final String KEY_APP_KEY = "appkey";
    private static final String KEY_CHANNEL = "channel";
    private static final String KEY_LAST_APP_KEY = "last_appkey";
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    private static final String KEY_SHARED_PREFERENCES_NAME = "umeng_common_config";
    public static final String MOBILE_NETWORK = "2G/3G";
    private static final String SD_PERMISSION = "android.permission.WRITE_EXTERNAL_STORAGE";
    private static final String TAG = "UMUtils";
    public static final String UNKNOW = "";
    public static final String WIFI = "Wi-Fi";
    private static final Pattern pattern = Pattern.compile("UTDID\">([^<]+)");

    public static void setLastAppkey(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("umeng_common_config", 0);
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(KEY_LAST_APP_KEY, str).commit();
            }
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "set last app key e is " + e);
            }
            b.a(context, e);
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "set last app key e is " + th);
            }
            b.a(context, th);
        }
    }

    public static String getLastAppkey(Context context) {
        if (context == null) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("umeng_common_config", 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getString(KEY_LAST_APP_KEY, null);
            }
            return null;
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get last app key e is " + e);
            }
            b.a(context, e);
            return null;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get last app key e is " + th);
            }
            b.a(context, th);
            return null;
        }
    }

    public static synchronized void setAppkey(Context context, String str) {
        synchronized (UMUtils.class) {
            if (context != null) {
                if (str != null) {
                    try {
                        try {
                            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("umeng_common_config", 0);
                            if (sharedPreferences != null) {
                                sharedPreferences.edit().putString("appkey", str).commit();
                            }
                        } catch (Throwable th) {
                            if (AnalyticsConstants.UM_DEBUG) {
                                Log.e(TAG, "set app key e is " + th);
                            }
                            b.a(context, th);
                        }
                    } catch (Exception e) {
                        if (AnalyticsConstants.UM_DEBUG) {
                            Log.e(TAG, "set app key e is " + e);
                        }
                        b.a(context, e);
                    }
                }
            }
        }
    }

    public static synchronized String getAppkey(Context context) {
        synchronized (UMUtils.class) {
            if (context == null) {
                return null;
            }
            try {
                SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("umeng_common_config", 0);
                if (sharedPreferences == null) {
                    return null;
                }
                return sharedPreferences.getString("appkey", null);
            } catch (Exception e) {
                if (AnalyticsConstants.UM_DEBUG) {
                    Log.e(TAG, "get app key e is " + e);
                }
                b.a(context, e);
                return null;
            } catch (Throwable th) {
                if (AnalyticsConstants.UM_DEBUG) {
                    Log.e(TAG, "get app key e is " + th);
                }
                b.a(context, th);
                return null;
            }
        }
    }

    public static void setChannel(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("umeng_common_config", 0);
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("channel", str).commit();
            }
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "set channel e is " + e);
            }
            b.a(context, e);
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "set channel e is " + th);
            }
            b.a(context, th);
        }
    }

    public static String getChannel(Context context) {
        if (context == null) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("umeng_common_config", 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getString("channel", null);
            }
            return null;
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get channel e is " + e);
            }
            b.a(context, e);
            return null;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get channel e is " + th);
            }
            b.a(context, th);
            return null;
        }
    }

    public static String getUTDID(Context context) {
        if (context == null) {
            return null;
        }
        try {
            try {
                try {
                    return (String) Class.forName("com.ut.device.UTDevice").getMethod("getUtdid", Context.class).invoke(null, context.getApplicationContext());
                } catch (Exception e) {
                    if (AnalyticsConstants.UM_DEBUG) {
                        Log.e(TAG, "get utiid e is " + e);
                    }
                    return null;
                }
            } catch (Exception unused) {
                return readUTDId(context);
            }
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get utiid e is " + th);
            }
            return null;
        }
    }

    private static String readUTDId(Context context) {
        File file;
        if (context == null || (file = getFile(context)) == null || !file.exists()) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                return parseId(readStreamToString(fileInputStream));
            } finally {
                safeClose(fileInputStream);
            }
        } catch (Exception unused) {
            return null;
        }
    }

    private static void safeClose(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    private static String parseId(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private static String readStreamToString(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        char[] cArr = new char[1024];
        StringWriter stringWriter = new StringWriter();
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (-1 != read) {
                stringWriter.write(cArr, 0, read);
            } else {
                return stringWriter.toString();
            }
        }
    }

    private static File getFile(Context context) {
        if (context != null && checkPermission(context, SD_PERMISSION) && Environment.getExternalStorageState().equals("mounted")) {
            try {
                return new File(Environment.getExternalStorageDirectory().getCanonicalPath(), ".UTSystemConfig/Global/Alvin2.xml");
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String[] getGPU(GL10 gl10) {
        try {
            return new String[]{gl10.glGetString(7936), gl10.glGetString(7937)};
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "Could not read gpu infor, e is " + e);
            }
            return new String[0];
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "Could not read gpu infor, e is " + th);
            }
            return new String[0];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0060 A[Catch: Throwable -> 0x003f, Exception -> 0x0041, TryCatch #6 {Exception -> 0x0041, Throwable -> 0x003f, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x0013, B:11:0x0060, B:19:0x0044, B:21:0x0048, B:24:0x0024, B:26:0x0028), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getCPU() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String readLine;
        String str = null;
        try {
            try {
                fileReader = new FileReader("/proc/cpuinfo");
                try {
                    bufferedReader = new BufferedReader(fileReader, 1024);
                    readLine = bufferedReader.readLine();
                } catch (IOException e) {
                    e = e;
                }
            } catch (FileNotFoundException e2) {
                e = e2;
            }
            try {
                bufferedReader.close();
                fileReader.close();
                str = readLine;
            } catch (FileNotFoundException e3) {
                e = e3;
                str = readLine;
                if (AnalyticsConstants.UM_DEBUG) {
                    Log.e(TAG, "Could not read from file /proc/cpuinfo, e is " + e);
                }
                if (str != null) {
                }
            } catch (IOException e4) {
                e = e4;
                str = readLine;
                if (AnalyticsConstants.UM_DEBUG) {
                    Log.e(TAG, "Could not read from file /proc/cpuinfo, e is " + e);
                }
                if (str != null) {
                }
            }
            return str != null ? str.substring(str.indexOf(58) + 1).trim() : "";
        } catch (Exception e5) {
            if (!AnalyticsConstants.UM_DEBUG) {
                return "";
            }
            Log.e(TAG, "get cpu e is " + e5);
            return "";
        } catch (Throwable th) {
            if (!AnalyticsConstants.UM_DEBUG) {
                return "";
            }
            Log.e(TAG, "get cpu e is " + th);
            return "";
        }
    }

    public static String getImsi(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                return telephonyManager.getSubscriberId();
            }
            return null;
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get imei e is " + e);
            }
            b.a(context, e);
            return null;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get imei e is " + th);
            }
            b.a(context, th);
            return null;
        }
    }

    public static String getRegisteredOperator(Context context) {
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                return telephonyManager.getNetworkOperator();
            }
            return null;
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get registered operator e is " + e);
            }
            b.a(context, e);
            return null;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get registered operator e is " + th);
            }
            b.a(context, th);
            return null;
        }
    }

    public static String getNetworkOperatorName(Context context) {
        if (context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return (checkPermission(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) ? telephonyManager.getNetworkOperatorName() : "";
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get network operator e is " + e);
            }
            b.a(context, e);
            return "";
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get network operator e is " + th);
            }
            b.a(context, th);
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
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get display resolution e is " + e);
            }
            b.a(context, e);
            return "";
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get display resolution e is " + th);
            }
            b.a(context, th);
            return "";
        }
    }

    public static String[] getNetworkAccessMode(Context context) {
        String[] strArr = {"", ""};
        if (context == null) {
            return strArr;
        }
        try {
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get network access mode e is " + e);
            }
            b.a(context, e);
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get network access mode e is " + th);
            }
            b.a(context, th);
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

    public static boolean isSdCardWrittenable() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static Locale getLocale(Context context) {
        Locale locale;
        if (context == null) {
            return null;
        }
        try {
            try {
                Configuration configuration = new Configuration();
                configuration.setToDefaults();
                Settings.System.getConfiguration(context.getContentResolver(), configuration);
                locale = configuration.locale;
            } catch (Exception e) {
                try {
                    if (AnalyticsConstants.UM_DEBUG) {
                        Log.e(TAG, "fail to read user config locale, e is " + e);
                    }
                    locale = null;
                } catch (Exception e2) {
                    if (AnalyticsConstants.UM_DEBUG) {
                        Log.e(TAG, "get locale e is " + e2);
                    }
                    b.a(context, e2);
                    return null;
                }
            }
            return locale == null ? Locale.getDefault() : locale;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get locale e is " + th);
            }
            b.a(context, th);
            return null;
        }
    }

    public static String getMac(Context context) {
        if (context == null) {
            return null;
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI);
            if (checkPermission(context, "android.permission.ACCESS_WIFI_STATE")) {
                return wifiManager.getConnectionInfo().getMacAddress();
            }
            if (!AnalyticsConstants.UM_DEBUG) {
                return "";
            }
            Log.e(TAG, "Could not get mac address.[no permission android.permission.ACCESS_WIFI_STATE");
            return "";
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get mac e is " + e);
            }
            b.a(context, e);
            return null;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get mac e is " + th);
            }
            b.a(context, th);
            return null;
        }
    }

    public static String getOperator(Context context) {
        if (context == null) {
            return "Unknown";
        }
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get get operator e is " + e);
            }
            b.a(context, e);
            return "Unknown";
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get get operator e is " + th);
            }
            b.a(context, th);
            return "Unknown";
        }
    }

    public static String getSubOSName(Context context) {
        String str;
        if (context == null) {
            return null;
        }
        try {
            try {
                Properties buildProp = getBuildProp();
                try {
                    String property = buildProp.getProperty(KEY_MIUI_VERSION_NAME);
                    if (!TextUtils.isEmpty(property)) {
                        str = "MIUI";
                    } else if (isFlyMe()) {
                        str = "Flyme";
                    } else {
                        if (TextUtils.isEmpty(getYunOSVersion(buildProp))) {
                            return property;
                        }
                        str = "YunOS";
                    }
                    return str;
                } catch (Exception e) {
                    b.a(context, e);
                    return null;
                }
            } catch (Throwable th) {
                if (AnalyticsConstants.UM_DEBUG) {
                    Log.e(TAG, "get sub os name e is " + th);
                }
                b.a(context, th);
                return null;
            }
        } catch (Exception e2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get sub os name e is " + e2);
            }
            b.a(context, e2);
            return null;
        }
    }

    public static String getSubOSVersion(Context context) {
        String yunOSVersion;
        if (context == null) {
            return null;
        }
        try {
            try {
                Properties buildProp = getBuildProp();
                try {
                    String property = buildProp.getProperty(KEY_MIUI_VERSION_NAME);
                    if (TextUtils.isEmpty(property)) {
                        try {
                            if (isFlyMe()) {
                                yunOSVersion = getFlymeVersion(buildProp);
                            } else {
                                yunOSVersion = getYunOSVersion(buildProp);
                            }
                            return yunOSVersion;
                        } catch (Exception unused) {
                        }
                    }
                    return property;
                } catch (Exception e) {
                    b.a(context, e);
                    return null;
                }
            } catch (Throwable th) {
                if (AnalyticsConstants.UM_DEBUG) {
                    Log.e(TAG, "get sub os version e is " + th);
                }
                b.a(context, th);
                return null;
            }
        } catch (Exception e2) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get sub os version e is " + e2);
            }
            b.a(context, e2);
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
        } catch (Exception unused) {
            return null;
        }
    }

    public static Properties getBuildProp() {
        FileInputStream fileInputStream;
        Properties properties = new Properties();
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException unused3) {
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            return properties;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException unused4) {
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
        } catch (Exception unused) {
            return false;
        }
    }

    public static String getDeviceType(Context context) {
        if (context == null) {
            return "Phone";
        }
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3 ? "Tablet" : "Phone";
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get device type e is " + e);
            }
            b.a(context, e);
            return null;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get device type e is " + th);
            }
            b.a(context, th);
            return null;
        }
    }

    public static String getAppVersionCode(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception e) {
            if (!AnalyticsConstants.UM_DEBUG) {
                return "";
            }
            Log.e(TAG, "get app version code e is " + e);
            return "";
        } catch (Throwable th) {
            if (!AnalyticsConstants.UM_DEBUG) {
                return "";
            }
            Log.e(TAG, "get app version code e is " + th);
            return "";
        }
    }

    public static String getAppVersinoCode(Context context, String str) {
        if (context == null || str == null) {
            return "";
        }
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(str, 0).versionCode);
        } catch (Exception e) {
            if (!AnalyticsConstants.UM_DEBUG) {
                return "";
            }
            Log.e(TAG, "get app version code e is " + e);
            return "";
        } catch (Throwable th) {
            if (!AnalyticsConstants.UM_DEBUG) {
                return "";
            }
            Log.e(TAG, "get app version code e is " + th);
            return "";
        }
    }

    public static String getAppVersionName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            if (!AnalyticsConstants.UM_DEBUG) {
                return "";
            }
            Log.e(TAG, "get app version name e is " + e);
            return "";
        } catch (Throwable th) {
            if (!AnalyticsConstants.UM_DEBUG) {
                return "";
            }
            Log.e(TAG, "get app version name e is " + th);
            return "";
        }
    }

    public static String getAppVersionName(Context context, String str) {
        if (context == null || str == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get app version name e is " + e);
            }
            b.a(context, e);
            return "";
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get app version name e is " + th);
            }
            b.a(context, th);
            return "";
        }
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
            } catch (Exception e) {
                b.a(context, e);
                return false;
            }
        } else if (context.getPackageManager().checkPermission(str, context.getPackageName()) != 0) {
            return false;
        }
        return true;
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
            sb.append(hexString.toUpperCase());
            if (i < bArr.length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }

    public static boolean isDebug(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception e) {
            b.a(context, e);
            return false;
        }
    }

    public static String getAppName(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get app name e is " + e);
            }
            b.a(context, e);
            return null;
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get app name e is " + th);
            }
            b.a(context, th);
            return null;
        }
    }

    public static String MD5(String str) {
        if (str == null) {
            return null;
        }
        try {
            try {
                try {
                    byte[] bytes = str.getBytes();
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.reset();
                    messageDigest.update(bytes);
                    byte[] digest = messageDigest.digest();
                    StringBuffer stringBuffer = new StringBuffer();
                    for (byte b2 : digest) {
                        stringBuffer.append(String.format("%02X", Byte.valueOf(b2)));
                    }
                    return stringBuffer.toString();
                } catch (Exception unused) {
                    return str.replaceAll("[^[a-z][A-Z][0-9][.][_]]", "");
                }
            } catch (Throwable th) {
                if (AnalyticsConstants.UM_DEBUG) {
                    Log.e(TAG, "MD5 e is " + th);
                }
                return null;
            }
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "MD5 e is " + e);
            }
            return null;
        }
    }

    public static String getFileMD5(File file) {
        try {
            try {
                byte[] bArr = new byte[1024];
                try {
                    if (!file.isFile()) {
                        return "";
                    }
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    FileInputStream fileInputStream = new FileInputStream(file);
                    while (true) {
                        int read = fileInputStream.read(bArr, 0, 1024);
                        if (read != -1) {
                            messageDigest.update(bArr, 0, read);
                        } else {
                            fileInputStream.close();
                            return String.format("%1$032x", new BigInteger(1, messageDigest.digest()));
                        }
                    }
                } catch (Exception unused) {
                    return null;
                }
            } catch (Throwable th) {
                if (AnalyticsConstants.UM_DEBUG) {
                    Log.e(TAG, "get file MD5 e is " + th);
                }
                return null;
            }
        } catch (Exception e) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "get file MD5 e is " + e);
            }
            return null;
        }
    }

    public static String encryptBySHA1(String str) {
        try {
            try {
                byte[] bytes = str.getBytes();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance(AndroidUtilsLight.DIGEST_ALGORITHM_SHA1);
                    messageDigest.update(bytes);
                    return bytes2Hex(messageDigest.digest());
                } catch (Exception unused) {
                    return null;
                }
            } catch (Exception e) {
                if (AnalyticsConstants.UM_DEBUG) {
                    Log.e(TAG, "encrypt by SHA1 e is " + e);
                }
                return null;
            }
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                Log.e(TAG, "encrypt by SHA1 e is " + th);
            }
            return null;
        }
    }

    private static String bytes2Hex(byte[] bArr) {
        String str = "";
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                str = str + "0";
            }
            str = str + hexString;
        }
        return str;
    }

    public static String getUMId(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return UMEnvelopeBuild.imprintProperty(context.getApplicationContext(), d.f, null);
        } catch (Exception e) {
            b.a(context, e);
            return null;
        }
    }

    public static String getDeviceToken(Context context) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            Class<?> cls = Class.forName("com.umeng.message.MessageSharedPrefs");
            if (cls == null || (method = cls.getMethod(a.FORCE_STATIC_METHOD, Context.class)) == null || (invoke = method.invoke(cls, applicationContext)) == null || (method2 = cls.getMethod("getDeviceToken", new Class[0])) == null || (invoke2 = method2.invoke(invoke, new Object[0])) == null || !(invoke2 instanceof String)) {
                return null;
            }
            return (String) invoke2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getAppkeyByXML(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null) {
                return null;
            }
            String string = applicationInfo.metaData.getString("UMENG_APPKEY");
            if (string != null) {
                return string.trim();
            }
            MLog.e(AnalyticsConstants.LOG_TAG, "getAppkey failed. the applicationinfo is null!");
            return null;
        } catch (Throwable th) {
            MLog.e(AnalyticsConstants.LOG_TAG, "Could not read UMENG_APPKEY meta-data from AndroidManifest.xml.", th);
            return null;
        }
    }

    public static String getChannelByXML(Context context) {
        Object obj;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null || (obj = applicationInfo.metaData.get("UMENG_CHANNEL")) == null) {
                return null;
            }
            String obj2 = obj.toString();
            if (obj2 != null) {
                return obj2.trim();
            }
            if (!AnalyticsConstants.UM_DEBUG) {
                return null;
            }
            MLog.i(AnalyticsConstants.LOG_TAG, "Could not read UMENG_CHANNEL meta-data from AndroidManifest.xml.");
            return null;
        } catch (Throwable th) {
            MLog.e(AnalyticsConstants.LOG_TAG, "Could not read UMENG_CHANNEL meta-data from AndroidManifest.xml.", th);
            return null;
        }
    }

    public static boolean checkPath(String str) {
        try {
            return Class.forName(str) != null;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean checkAndroidManifest(Context context, String str) {
        try {
            context.getApplicationContext().getPackageManager().getActivityInfo(new ComponentName(context.getApplicationContext().getPackageName(), str), 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean checkIntentFilterData(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(Uri.parse("tencent" + str + ":"));
        List<ResolveInfo> queryIntentActivities = context.getApplicationContext().getPackageManager().queryIntentActivities(intent, 64);
        if (queryIntentActivities.size() <= 0) {
            return false;
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            if (resolveInfo.activityInfo != null && resolveInfo.activityInfo.packageName.equals(context.getApplicationContext().getPackageName())) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkResource(Context context, String str, String str2) {
        return context.getApplicationContext().getResources().getIdentifier(str, str2, context.getApplicationContext().getPackageName()) > 0;
    }

    public static boolean checkMetaData(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationContext().getPackageManager().getApplicationInfo(context.getApplicationContext().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData.get(str) != null;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static String getAppMD5Signature(Context context) {
        String appMD5Signature = DeviceConfig.getAppMD5Signature(context);
        return !TextUtils.isEmpty(appMD5Signature) ? appMD5Signature.replace(":", "").toLowerCase() : appMD5Signature;
    }

    public static String getAppSHA1Key(Context context) {
        return DeviceConfig.getAppSHA1Key(context);
    }

    public static String getAppHashKey(Context context) {
        return DeviceConfig.getAppHashKey(context);
    }

    public static int getTargetSdkVersion(Context context) {
        return context.getApplicationInfo().targetSdkVersion;
    }

    public static boolean isMainProgress(Context context) {
        try {
            String a2 = com.umeng.commonsdk.framework.b.a(context);
            String packageName = context.getApplicationContext().getPackageName();
            if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(packageName)) {
                return false;
            }
            return a2.equals(packageName);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isApplication(Context context) {
        try {
            String name = context.getClass().getSuperclass().getName();
            if (TextUtils.isEmpty(name)) {
                return false;
            }
            return name.equals("android.app.Application");
        } catch (Exception unused) {
            return false;
        }
    }
}

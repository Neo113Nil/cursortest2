package com.blankj.utilcode.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.blankj.utilcode.util.z0;
import com.google.android.exoplayer2.C;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class d {

    public static class a {
        private Drawable icon;
        private boolean isSystem;
        private String name;
        private String packageName;
        private String packagePath;
        private int versionCode;
        private String versionName;

        public a(String str, String str2, Drawable drawable, String str3, String str4, int i8, boolean z7) {
            setName(str2);
            setIcon(drawable);
            setPackageName(str);
            setPackagePath(str3);
            setVersionName(str4);
            setVersionCode(i8);
            setSystem(z7);
        }

        public Drawable getIcon() {
            return this.icon;
        }

        public String getName() {
            return this.name;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public String getPackagePath() {
            return this.packagePath;
        }

        public int getVersionCode() {
            return this.versionCode;
        }

        public String getVersionName() {
            return this.versionName;
        }

        public boolean isSystem() {
            return this.isSystem;
        }

        public void setIcon(Drawable drawable) {
            this.icon = drawable;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPackageName(String str) {
            this.packageName = str;
        }

        public void setPackagePath(String str) {
            this.packagePath = str;
        }

        public void setSystem(boolean z7) {
            this.isSystem = z7;
        }

        public void setVersionCode(int i8) {
            this.versionCode = i8;
        }

        public void setVersionName(String str) {
            this.versionName = str;
        }

        @NonNull
        public String toString() {
            return "{\n    pkg name: " + getPackageName() + "\n    app icon: " + getIcon() + "\n    app name: " + getName() + "\n    app path: " + getPackagePath() + "\n    app v name: " + getVersionName() + "\n    app v code: " + getVersionCode() + "\n    is system: " + isSystem() + "\n}";
        }
    }

    private d() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void exitApp() {
        c1.finishAllActivities();
        System.exit(0);
    }

    @Nullable
    public static a getApkInfo(File file) {
        if (file != null && file.isFile() && file.exists()) {
            return getApkInfo(file.getAbsolutePath());
        }
        return null;
    }

    @Nullable
    public static Drawable getAppIcon() {
        return getAppIcon(z0.getApp().getPackageName());
    }

    public static int getAppIconId() {
        return getAppIconId(z0.getApp().getPackageName());
    }

    @Nullable
    public static a getAppInfo() {
        return getAppInfo(z0.getApp().getPackageName());
    }

    @NonNull
    public static String getAppName() {
        return getAppName(z0.getApp().getPackageName());
    }

    @NonNull
    public static String getAppPackageName() {
        return z0.getApp().getPackageName();
    }

    @NonNull
    public static String getAppPath() {
        return getAppPath(z0.getApp().getPackageName());
    }

    @Nullable
    public static Signature[] getAppSignatures() {
        return getAppSignatures(z0.getApp().getPackageName());
    }

    private static List<String> getAppSignaturesHash(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (c1.isSpace(str)) {
            return arrayList;
        }
        Signature[] appSignatures = getAppSignatures(str);
        if (appSignatures != null && appSignatures.length > 0) {
            for (Signature signature : appSignatures) {
                arrayList.add(c1.bytes2HexString(c1.hashTemplate(signature.toByteArray(), str2)).replaceAll("(?<=[0-9A-F]{2})[0-9A-F]{2}", ":$0"));
            }
        }
        return arrayList;
    }

    @NonNull
    public static List<String> getAppSignaturesMD5() {
        return getAppSignaturesMD5(z0.getApp().getPackageName());
    }

    @NonNull
    public static List<String> getAppSignaturesSHA1() {
        return getAppSignaturesSHA1(z0.getApp().getPackageName());
    }

    @NonNull
    public static List<String> getAppSignaturesSHA256() {
        return getAppSignaturesSHA256(z0.getApp().getPackageName());
    }

    public static int getAppUid() {
        return getAppUid(z0.getApp().getPackageName());
    }

    public static int getAppVersionCode() {
        return getAppVersionCode(z0.getApp().getPackageName());
    }

    @NonNull
    public static String getAppVersionName() {
        return getAppVersionName(z0.getApp().getPackageName());
    }

    @NonNull
    public static List<a> getAppsInfo() {
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = z0.getApp().getPackageManager();
        if (packageManager == null) {
            return arrayList;
        }
        Iterator<PackageInfo> it = packageManager.getInstalledPackages(0).iterator();
        while (it.hasNext()) {
            a bean = getBean(packageManager, it.next());
            if (bean != null) {
                arrayList.add(bean);
            }
        }
        return arrayList;
    }

    private static a getBean(PackageManager packageManager, PackageInfo packageInfo) {
        if (packageInfo == null) {
            return null;
        }
        String str = packageInfo.versionName;
        int i8 = packageInfo.versionCode;
        String str2 = packageInfo.packageName;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo == null) {
            return new a(str2, "", null, "", str, i8, false);
        }
        return new a(str2, applicationInfo.loadLabel(packageManager).toString(), applicationInfo.loadIcon(packageManager), applicationInfo.sourceDir, str, i8, (applicationInfo.flags & 1) != 0);
    }

    public static void installApp(String str) {
        installApp(c1.getFileByPath(str));
    }

    public static boolean isAppDebug() {
        return isAppDebug(z0.getApp().getPackageName());
    }

    public static boolean isAppForeground() {
        return c1.isAppForeground();
    }

    public static boolean isAppInstalled(String str) {
        if (c1.isSpace(str)) {
            return false;
        }
        try {
            return z0.getApp().getPackageManager().getApplicationInfo(str, 0).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean isAppRoot() {
        return c1.execCmd("echo root", true).result == 0;
    }

    public static boolean isAppRunning(String str) {
        ActivityManager activityManager;
        ComponentName componentName;
        ComponentName componentName2;
        if (!c1.isSpace(str) && (activityManager = (ActivityManager) z0.getApp().getSystemService("activity")) != null) {
            List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(Integer.MAX_VALUE);
            if (runningTasks != null && runningTasks.size() > 0) {
                for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
                    componentName = runningTaskInfo.baseActivity;
                    if (componentName != null) {
                        componentName2 = runningTaskInfo.baseActivity;
                        if (str.equals(componentName2.getPackageName())) {
                            return true;
                        }
                    }
                }
            }
            List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(Integer.MAX_VALUE);
            if (runningServices != null && runningServices.size() > 0) {
                Iterator<ActivityManager.RunningServiceInfo> it = runningServices.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().service.getPackageName())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isAppSystem() {
        return isAppSystem(z0.getApp().getPackageName());
    }

    public static boolean isAppUpgraded() {
        try {
            return z0.getApp().getPackageManager().getPackageInfo(getAppPackageName(), 0).firstInstallTime != z0.getApp().getPackageManager().getPackageInfo(getAppPackageName(), 0).lastUpdateTime;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isFirstTimeInstall() {
        try {
            return z0.getApp().getPackageManager().getPackageInfo(getAppPackageName(), 0).firstInstallTime == z0.getApp().getPackageManager().getPackageInfo(getAppPackageName(), 0).lastUpdateTime;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isFirstTimeInstalled() {
        try {
            PackageInfo packageInfo = z0.getApp().getPackageManager().getPackageInfo(z0.getApp().getPackageName(), 0);
            return packageInfo.firstInstallTime == packageInfo.lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return true;
        }
    }

    public static void launchApp(String str) {
        if (c1.isSpace(str)) {
            return;
        }
        Intent launchAppIntent = c1.getLaunchAppIntent(str);
        if (launchAppIntent == null) {
            Log.e("AppUtils", "Didn't exist launcher activity.");
        } else {
            z0.getApp().startActivity(launchAppIntent);
        }
    }

    public static void launchAppDetailsSettings() {
        launchAppDetailsSettings(z0.getApp().getPackageName());
    }

    public static void registerAppStatusChangedListener(@NonNull z0.c cVar) {
        c1.addOnAppStatusChangedListener(cVar);
    }

    public static void relaunchApp() {
        relaunchApp(false);
    }

    public static void uninstallApp(String str) {
        if (c1.isSpace(str)) {
            return;
        }
        z0.getApp().startActivity(c1.getUninstallAppIntent(str));
    }

    public static void unregisterAppStatusChangedListener(@NonNull z0.c cVar) {
        c1.removeOnAppStatusChangedListener(cVar);
    }

    @Nullable
    public static Drawable getAppIcon(String str) {
        if (c1.isSpace(str)) {
            return null;
        }
        try {
            PackageManager packageManager = z0.getApp().getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.applicationInfo.loadIcon(packageManager);
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static int getAppIconId(String str) {
        if (c1.isSpace(str)) {
            return 0;
        }
        try {
            PackageInfo packageInfo = z0.getApp().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return 0;
            }
            return packageInfo.applicationInfo.icon;
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return 0;
        }
    }

    @Nullable
    public static a getAppInfo(String str) {
        try {
            PackageManager packageManager = z0.getApp().getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return getBean(packageManager, packageManager.getPackageInfo(str, 0));
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    @NonNull
    public static String getAppName(String str) {
        if (c1.isSpace(str)) {
            return "";
        }
        try {
            PackageManager packageManager = z0.getApp().getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            return packageInfo == null ? "" : packageInfo.applicationInfo.loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return "";
        }
    }

    @NonNull
    public static String getAppPath(String str) {
        if (c1.isSpace(str)) {
            return "";
        }
        try {
            PackageInfo packageInfo = z0.getApp().getPackageManager().getPackageInfo(str, 0);
            return packageInfo == null ? "" : packageInfo.applicationInfo.sourceDir;
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return "";
        }
    }

    @Nullable
    public static Signature[] getAppSignatures(String str) {
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] apkContentsSigners;
        if (c1.isSpace(str)) {
            return null;
        }
        try {
            PackageManager packageManager = z0.getApp().getPackageManager();
            if (Build.VERSION.SDK_INT < 28) {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
                if (packageInfo == null) {
                    return null;
                }
                return packageInfo.signatures;
            }
            PackageInfo packageInfo2 = packageManager.getPackageInfo(str, C.BUFFER_FLAG_FIRST_SAMPLE);
            if (packageInfo2 == null) {
                return null;
            }
            signingInfo = packageInfo2.signingInfo;
            hasMultipleSigners = signingInfo.hasMultipleSigners();
            if (hasMultipleSigners) {
                apkContentsSigners = signingInfo.getApkContentsSigners();
                return apkContentsSigners;
            }
            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            return signingCertificateHistory;
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    @NonNull
    public static List<String> getAppSignaturesMD5(String str) {
        return getAppSignaturesHash(str, "MD5");
    }

    @NonNull
    public static List<String> getAppSignaturesSHA1(String str) {
        return getAppSignaturesHash(str, "SHA1");
    }

    @NonNull
    public static List<String> getAppSignaturesSHA256(String str) {
        return getAppSignaturesHash(str, "SHA256");
    }

    public static int getAppUid(String str) {
        try {
            return z0.getApp().getPackageManager().getApplicationInfo(str, 0).uid;
        } catch (Exception e8) {
            e8.printStackTrace();
            return -1;
        }
    }

    public static int getAppVersionCode(String str) {
        if (c1.isSpace(str)) {
            return -1;
        }
        try {
            PackageInfo packageInfo = z0.getApp().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return -1;
            }
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return -1;
        }
    }

    @NonNull
    public static String getAppVersionName(String str) {
        if (c1.isSpace(str)) {
            return "";
        }
        try {
            PackageInfo packageInfo = z0.getApp().getPackageManager().getPackageInfo(str, 0);
            return packageInfo == null ? "" : packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public static void installApp(File file) {
        Intent installAppIntent = c1.getInstallAppIntent(file);
        if (installAppIntent == null) {
            return;
        }
        z0.getApp().startActivity(installAppIntent);
    }

    public static boolean isAppDebug(String str) {
        if (c1.isSpace(str)) {
            return false;
        }
        try {
            return (z0.getApp().getPackageManager().getApplicationInfo(str, 0).flags & 2) != 0;
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public static boolean isAppForeground(@NonNull String str) {
        return !c1.isSpace(str) && str.equals(c1.getForegroundProcessName());
    }

    public static boolean isAppSystem(String str) {
        if (c1.isSpace(str)) {
            return false;
        }
        try {
            return (z0.getApp().getPackageManager().getApplicationInfo(str, 0).flags & 1) != 0;
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    public static void launchAppDetailsSettings(String str) {
        if (c1.isSpace(str)) {
            return;
        }
        Intent launchAppDetailsSettingsIntent = c1.getLaunchAppDetailsSettingsIntent(str, true);
        if (c1.isIntentAvailable(launchAppDetailsSettingsIntent)) {
            z0.getApp().startActivity(launchAppDetailsSettingsIntent);
        }
    }

    public static void relaunchApp(boolean z7) {
        Intent launchAppIntent = c1.getLaunchAppIntent(z0.getApp().getPackageName());
        if (launchAppIntent == null) {
            Log.e("AppUtils", "Didn't exist launcher activity.");
            return;
        }
        launchAppIntent.addFlags(335577088);
        z0.getApp().startActivity(launchAppIntent);
        if (z7) {
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
    }

    @Nullable
    public static a getApkInfo(String str) {
        PackageManager packageManager;
        PackageInfo packageArchiveInfo;
        if (c1.isSpace(str) || (packageManager = z0.getApp().getPackageManager()) == null || (packageArchiveInfo = packageManager.getPackageArchiveInfo(str, 0)) == null) {
            return null;
        }
        ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
        applicationInfo.sourceDir = str;
        applicationInfo.publicSourceDir = str;
        return getBean(packageManager, packageArchiveInfo);
    }

    public static void installApp(Uri uri) {
        Intent installAppIntent = c1.getInstallAppIntent(uri);
        if (installAppIntent == null) {
            return;
        }
        z0.getApp().startActivity(installAppIntent);
    }

    public static void launchAppDetailsSettings(Activity activity, int i8) {
        launchAppDetailsSettings(activity, i8, z0.getApp().getPackageName());
    }

    public static void launchAppDetailsSettings(Activity activity, int i8, String str) {
        if (activity == null || c1.isSpace(str)) {
            return;
        }
        Intent launchAppDetailsSettingsIntent = c1.getLaunchAppDetailsSettingsIntent(str, false);
        if (c1.isIntentAvailable(launchAppDetailsSettingsIntent)) {
            activity.startActivityForResult(launchAppDetailsSettingsIntent, i8);
        }
    }

    @Nullable
    public static Signature[] getAppSignatures(File file) {
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] apkContentsSigners;
        if (file == null) {
            return null;
        }
        PackageManager packageManager = z0.getApp().getPackageManager();
        if (Build.VERSION.SDK_INT >= 28) {
            PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(file.getAbsolutePath(), C.BUFFER_FLAG_FIRST_SAMPLE);
            if (packageArchiveInfo == null) {
                return null;
            }
            signingInfo = packageArchiveInfo.signingInfo;
            hasMultipleSigners = signingInfo.hasMultipleSigners();
            if (hasMultipleSigners) {
                apkContentsSigners = signingInfo.getApkContentsSigners();
                return apkContentsSigners;
            }
            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            return signingCertificateHistory;
        }
        PackageInfo packageArchiveInfo2 = packageManager.getPackageArchiveInfo(file.getAbsolutePath(), 64);
        if (packageArchiveInfo2 == null) {
            return null;
        }
        return packageArchiveInfo2.signatures;
    }
}

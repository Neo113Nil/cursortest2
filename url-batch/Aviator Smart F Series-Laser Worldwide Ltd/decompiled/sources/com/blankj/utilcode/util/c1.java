package com.blankj.utilcode.util;

import android.app.Activity;
import android.app.Application;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.StringRes;
import com.blankj.utilcode.util.h0;
import com.blankj.utilcode.util.t0;
import com.blankj.utilcode.util.z0;
import com.google.gson.Gson;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class c1 {

    static final class a {
        private LinkedHashMap<String, String> mFirst = new LinkedHashMap<>();
        private LinkedHashMap<String, String> mLast = new LinkedHashMap<>();
        private String mName;

        a(String str) {
            this.mName = str;
        }

        private void append2Host(Map<String, String> map, Map<String, String> map2) {
            if (map2 == null || map2.isEmpty()) {
                return;
            }
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                append2Host(map, entry.getKey(), entry.getValue());
            }
        }

        void addFirst(String str, String str2) {
            append2Host(this.mFirst, str, str2);
        }

        void append(Map<String, String> map) {
            append2Host(this.mLast, map);
        }

        public String getAppended() {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : this.mLast.entrySet()) {
                sb.append(entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
                sb.append("\n");
            }
            return sb.toString();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = "************* " + this.mName + " Head ****************\n";
            sb.append(str);
            for (Map.Entry<String, String> entry : this.mFirst.entrySet()) {
                sb.append(entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
                sb.append("\n");
            }
            sb.append("Rom Info           : ");
            sb.append(o0.getRomInfo());
            sb.append("\n");
            sb.append("Device Manufacturer: ");
            sb.append(Build.MANUFACTURER);
            sb.append("\n");
            sb.append("Device Model       : ");
            sb.append(Build.MODEL);
            sb.append("\n");
            sb.append("Android Version    : ");
            sb.append(Build.VERSION.RELEASE);
            sb.append("\n");
            sb.append("Android SDK        : ");
            sb.append(Build.VERSION.SDK_INT);
            sb.append("\n");
            sb.append("App VersionName    : ");
            sb.append(d.getAppVersionName());
            sb.append("\n");
            sb.append("App VersionCode    : ");
            sb.append(d.getAppVersionCode());
            sb.append("\n");
            sb.append(getAppended());
            sb.append(str);
            sb.append("\n");
            return sb.toString();
        }

        void append(String str, String str2) {
            append2Host(this.mLast, str, str2);
        }

        private void append2Host(Map<String, String> map, String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            int length = 19 - str.length();
            if (length > 0) {
                str = str + "                   ".substring(0, length);
            }
            map.put(str, str2);
        }
    }

    c1() {
    }

    static void addActivityLifecycleCallbacks(z0.a aVar) {
        b1.INSTANCE.addActivityLifecycleCallbacks(aVar);
    }

    static void addOnAppStatusChangedListener(z0.c cVar) {
        b1.INSTANCE.addOnAppStatusChangedListener(cVar);
    }

    static byte[] base64Decode(byte[] bArr) {
        return j.base64Decode(bArr);
    }

    static byte[] base64Encode(byte[] bArr) {
        return j.base64Encode(bArr);
    }

    static byte[] bitmap2Bytes(Bitmap bitmap) {
        return ImageUtils.bitmap2Bytes(bitmap);
    }

    static Drawable bitmap2Drawable(Bitmap bitmap) {
        return ImageUtils.bitmap2Drawable(bitmap);
    }

    static String byte2FitMemorySize(long j8) {
        return g.byte2FitMemorySize(j8);
    }

    static Bitmap bytes2Bitmap(byte[] bArr) {
        return ImageUtils.bytes2Bitmap(bArr);
    }

    static Drawable bytes2Drawable(byte[] bArr) {
        return ImageUtils.bytes2Drawable(bArr);
    }

    static String bytes2HexString(byte[] bArr) {
        return g.bytes2HexString(bArr);
    }

    static JSONArray bytes2JSONArray(byte[] bArr) {
        return g.bytes2JSONArray(bArr);
    }

    static JSONObject bytes2JSONObject(byte[] bArr) {
        return g.bytes2JSONObject(bArr);
    }

    static Object bytes2Object(byte[] bArr) {
        return g.bytes2Object(bArr);
    }

    static <T> T bytes2Parcelable(byte[] bArr, Parcelable.Creator<T> creator) {
        return (T) g.bytes2Parcelable(bArr, creator);
    }

    static String bytes2String(byte[] bArr) {
        return g.bytes2String(bArr);
    }

    static boolean createFileByDeleteOldFile(File file) {
        return m.createFileByDeleteOldFile(file);
    }

    static boolean createOrExistsDir(File file) {
        return m.createOrExistsDir(file);
    }

    static boolean createOrExistsFile(File file) {
        return m.createOrExistsFile(file);
    }

    static boolean deleteAllInDir(File file) {
        return m.deleteAllInDir(file);
    }

    static <T> z0.d doAsync(z0.d dVar) {
        ThreadUtils.getCachedPool().execute(dVar);
        return dVar;
    }

    static int dp2px(float f8) {
        return u0.dp2px(f8);
    }

    static Bitmap drawable2Bitmap(Drawable drawable) {
        return ImageUtils.drawable2Bitmap(drawable);
    }

    static byte[] drawable2Bytes(Drawable drawable) {
        return ImageUtils.drawable2Bytes(drawable);
    }

    static boolean equals(CharSequence charSequence, CharSequence charSequence2) {
        return v0.equals(charSequence, charSequence2);
    }

    static t0.b execCmd(String str, boolean z7) {
        return t0.execCmd(str, z7);
    }

    static Uri file2Uri(File file) {
        return y0.file2Uri(file);
    }

    static void finishAllActivities() {
        com.blankj.utilcode.util.a.finishAllActivities();
    }

    static void fixSoftInputLeaks(Activity activity) {
        KeyboardUtils.fixSoftInputLeaks(activity);
    }

    static String format(@Nullable String str, Object... objArr) {
        return v0.format(str, objArr);
    }

    static String formatJson(String str) {
        return p.formatJson(str);
    }

    static <T> T fromJson(String str, Type type) {
        return (T) n.fromJson(str, type);
    }

    static Activity getActivityByContext(Context context) {
        return com.blankj.utilcode.util.a.getActivityByContext(context);
    }

    static List<Activity> getActivityList() {
        return b1.INSTANCE.getActivityList();
    }

    static int getAppScreenWidth() {
        return r0.getAppScreenWidth();
    }

    static Application getApplicationByReflect() {
        return b1.INSTANCE.getApplicationByReflect();
    }

    @RequiresPermission("android.permission.CALL_PHONE")
    static Intent getCallIntent(String str) {
        return o.getCallIntent(str);
    }

    static String getCurrentProcessName() {
        return n0.getCurrentProcessName();
    }

    static Intent getDialIntent(String str) {
        return o.getDialIntent(str);
    }

    static File getFileByPath(String str) {
        return m.getFileByPath(str);
    }

    static String getForegroundProcessName() {
        return n0.getForegroundProcessName();
    }

    static long getFsAvailableSize(String str) {
        return m.getFsAvailableSize(str);
    }

    static long getFsTotalSize(String str) {
        return m.getFsTotalSize(str);
    }

    static String getFullStackTrace(Throwable th) {
        return w0.getFullStackTrace(th);
    }

    static Gson getGson4LogUtils() {
        return n.getGson4LogUtils();
    }

    static Intent getInstallAppIntent(File file) {
        return o.getInstallAppIntent(file);
    }

    static Intent getLaunchAppDetailsSettingsIntent(String str, boolean z7) {
        return o.getLaunchAppDetailsSettingsIntent(str, z7);
    }

    static Intent getLaunchAppIntent(String str) {
        return o.getLaunchAppIntent(str);
    }

    static String getLauncherActivity(String str) {
        return com.blankj.utilcode.util.a.getLauncherActivity(str);
    }

    static int getNavBarHeight() {
        return f.getNavBarHeight();
    }

    static Notification getNotification(h0.a aVar, z0.b bVar) {
        return h0.getNotification(aVar, bVar);
    }

    static Intent getSendSmsIntent(String str, String str2) {
        return o.getSendSmsIntent(str, str2);
    }

    static q0 getSpUtils4Utils() {
        return q0.getInstance("Utils");
    }

    static int getStatusBarHeight() {
        return f.getStatusBarHeight();
    }

    static String getString(@StringRes int i8) {
        return v0.getString(i8);
    }

    static Activity getTopActivity() {
        return b1.INSTANCE.getTopActivity();
    }

    static Intent getUninstallAppIntent(String str) {
        return o.getUninstallAppIntent(str);
    }

    static byte[] hashTemplate(byte[] bArr, String str) {
        return k.hashTemplate(bArr, str);
    }

    static byte[] hexString2Bytes(String str) {
        return g.hexString2Bytes(str);
    }

    static void init(Application application) {
        b1.INSTANCE.init(application);
    }

    static ByteArrayOutputStream input2OutputStream(InputStream inputStream) {
        return g.input2OutputStream(inputStream);
    }

    static byte[] inputStream2Bytes(InputStream inputStream) {
        return g.inputStream2Bytes(inputStream);
    }

    static List<String> inputStream2Lines(InputStream inputStream, String str) {
        return g.inputStream2Lines(inputStream, str);
    }

    static boolean isActivityAlive(Activity activity) {
        return com.blankj.utilcode.util.a.isActivityAlive(activity);
    }

    static boolean isAppDebug() {
        return d.isAppDebug();
    }

    static boolean isAppForeground() {
        return b1.INSTANCE.isAppForeground();
    }

    static boolean isAppInstalled(String str) {
        return d.isAppInstalled(str);
    }

    static boolean isAppRunning(@NonNull String str) {
        return d.isAppRunning(str);
    }

    static boolean isFileExists(File file) {
        return m.isFileExists(file);
    }

    static boolean isGranted(String... strArr) {
        return PermissionUtils.isGranted(strArr);
    }

    @RequiresApi(api = 23)
    static boolean isGrantedDrawOverlays() {
        return PermissionUtils.isGrantedDrawOverlays();
    }

    static boolean isIntentAvailable(Intent intent) {
        return o.isIntentAvailable(intent);
    }

    static boolean isLayoutRtl() {
        return d1.isLayoutRtl();
    }

    static boolean isMainProcess() {
        return n0.isMainProcess();
    }

    static boolean isSDCardEnableByEnvironment() {
        return p0.isSDCardEnableByEnvironment();
    }

    static boolean isSamsung() {
        return o0.isSamsung();
    }

    static boolean isServiceRunning(String str) {
        return s0.isServiceRunning(str);
    }

    static boolean isSpace(String str) {
        return v0.isSpace(str);
    }

    static boolean isValid(@NonNull View view, long j8) {
        return h.isValid(view, j8);
    }

    static byte[] jsonArray2Bytes(JSONArray jSONArray) {
        return g.jsonArray2Bytes(jSONArray);
    }

    static byte[] jsonObject2Bytes(JSONObject jSONObject) {
        return g.jsonObject2Bytes(jSONObject);
    }

    static View layoutId2View(@LayoutRes int i8) {
        return d1.layoutId2View(i8);
    }

    static String millis2FitTimeSpan(long j8, int i8) {
        return x0.millis2FitTimeSpan(j8, i8);
    }

    static void notifySystemToScan(File file) {
        m.notifySystemToScan(file);
    }

    static byte[] parcelable2Bytes(Parcelable parcelable) {
        return g.parcelable2Bytes(parcelable);
    }

    static void preLoad() {
        preLoad(b.getPreLoadRunnable());
    }

    static int px2dp(float f8) {
        return u0.px2dp(f8);
    }

    static int px2sp(float f8) {
        return u0.px2sp(f8);
    }

    static byte[] readFile2Bytes(File file) {
        return l.readFile2BytesByChannel(file);
    }

    static void relaunchApp() {
        d.relaunchApp();
    }

    static void removeActivityLifecycleCallbacks(z0.a aVar) {
        b1.INSTANCE.removeActivityLifecycleCallbacks(aVar);
    }

    static void removeOnAppStatusChangedListener(z0.c cVar) {
        b1.INSTANCE.removeOnAppStatusChangedListener(cVar);
    }

    static void runOnUiThread(Runnable runnable) {
        ThreadUtils.runOnUiThread(runnable);
    }

    static void runOnUiThreadDelayed(Runnable runnable, long j8) {
        ThreadUtils.runOnUiThreadDelayed(runnable, j8);
    }

    static byte[] serializable2Bytes(Serializable serializable) {
        return g.serializable2Bytes(serializable);
    }

    static int sp2px(float f8) {
        return u0.sp2px(f8);
    }

    static void startHomeActivity() {
        com.blankj.utilcode.util.a.startHomeActivity();
    }

    static byte[] string2Bytes(String str) {
        return g.string2Bytes(str);
    }

    static String toJson(Object obj) {
        return n.toJson(obj);
    }

    static void toastCancel() {
        ToastUtils.cancel();
    }

    static void toastShowShort(CharSequence charSequence) {
        ToastUtils.showShort(charSequence);
    }

    static void unInit(Application application) {
        b1.INSTANCE.unInit(application);
    }

    static File uri2File(Uri uri) {
        return y0.uri2File(uri);
    }

    static Bitmap view2Bitmap(View view) {
        return ImageUtils.view2Bitmap(view);
    }

    static boolean writeFileFromBytes(File file, byte[] bArr) {
        return l.writeFileFromBytesByChannel(file, bArr, true);
    }

    static boolean writeFileFromIS(String str, InputStream inputStream) {
        return l.writeFileFromIS(str, inputStream);
    }

    static boolean writeFileFromString(String str, String str2, boolean z7) {
        return l.writeFileFromString(str, str2, z7);
    }

    static void addActivityLifecycleCallbacks(Activity activity, z0.a aVar) {
        b1.INSTANCE.addActivityLifecycleCallbacks(activity, aVar);
    }

    static byte[] bitmap2Bytes(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i8) {
        return ImageUtils.bitmap2Bytes(bitmap, compressFormat, i8);
    }

    static byte[] drawable2Bytes(Drawable drawable, Bitmap.CompressFormat compressFormat, int i8) {
        return ImageUtils.drawable2Bytes(drawable, compressFormat, i8);
    }

    static Intent getInstallAppIntent(Uri uri) {
        return o.getInstallAppIntent(uri);
    }

    static String getString(@StringRes int i8, Object... objArr) {
        return v0.getString(i8, objArr);
    }

    private static void preLoad(Runnable... runnableArr) {
        for (Runnable runnable : runnableArr) {
            ThreadUtils.getCachedPool().execute(runnable);
        }
    }

    static void removeActivityLifecycleCallbacks(Activity activity) {
        b1.INSTANCE.removeActivityLifecycleCallbacks(activity);
    }

    static void removeActivityLifecycleCallbacks(Activity activity, z0.a aVar) {
        b1.INSTANCE.removeActivityLifecycleCallbacks(activity, aVar);
    }
}

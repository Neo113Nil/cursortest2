package sqip.internal;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.File;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010/\u001a\u00020\f2\u0006\u0010\u0002\u001a\u0002002\u0006\u00101\u001a\u00020 H\u0002J\u0010\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020 H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0015\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u0017\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001eR\u0011\u0010&\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u000eR\u001a\u0010(\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u001a\u0010+\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\"\"\u0004\b-\u0010.¨\u00064"}, d2 = {"Lsqip/internal/ApkInfo;", "", "context", "Landroid/app/Application;", "(Landroid/app/Application;)V", "apkSize", "", "getApkSize", "()J", "setApkSize", "(J)V", "debuggable", "", "getDebuggable", "()Z", "setDebuggable", "(Z)V", "hasFlutter", "getHasFlutter", "hasFlutterPlugin", "getHasFlutterPlugin", "hasReactNative", "getHasReactNative", "hasReactNativePlugin", "getHasReactNativePlugin", "minSdkVersion", "", "getMinSdkVersion", "()I", "setMinSdkVersion", "(I)V", "packageName", "", "getPackageName", "()Ljava/lang/String;", "targetSdkVersion", "getTargetSdkVersion", "setTargetSdkVersion", "usesAndroidX", "getUsesAndroidX", "versionCode", "getVersionCode", "setVersionCode", "versionName", "getVersionName", "setVersionName", "(Ljava/lang/String;)V", "containsNativeLibrary", "Landroid/content/Context;", "libraryName", "hasClass", "className", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApkInfo {
    private long apkSize;
    private boolean debuggable;
    private final boolean hasFlutter;
    private final boolean hasFlutterPlugin;
    private final boolean hasReactNative;
    private final boolean hasReactNativePlugin;
    private int minSdkVersion;
    private final String packageName;
    private int targetSdkVersion;
    private final boolean usesAndroidX;
    private int versionCode;
    private String versionName;

    public ApkInfo(Application application) {
        application.getClass();
        String packageName = application.getPackageName();
        packageName.getClass();
        this.packageName = packageName;
        String str = "unknown";
        this.versionName = "unknown";
        this.versionCode = -1;
        this.targetSdkVersion = -1;
        this.minSdkVersion = -1;
        this.apkSize = -1L;
        this.hasFlutter = hasClass("io.flutter.plugin.common.PluginRegistry");
        this.hasFlutterPlugin = hasClass("sqip.flutter.SquareInAppPaymentsFlutterPlugin");
        this.hasReactNative = containsNativeLibrary(application, "libreactnativejni.so");
        this.hasReactNativePlugin = hasClass("sqip.react.CardEntryModule");
        this.usesAndroidX = hasClass("androidx.activity.ComponentActivity");
        PackageManager packageManager = application.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            String str2 = packageInfo.versionName;
            if (str2 != null) {
                str = str2;
            }
            this.versionName = str;
            this.versionCode = packageInfo.versionCode;
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            applicationInfo.getClass();
            this.targetSdkVersion = applicationInfo.targetSdkVersion;
            this.minSdkVersion = applicationInfo.minSdkVersion;
            this.debuggable = (applicationInfo.flags & 2) == 2;
            this.apkSize = new File(applicationInfo.publicSourceDir).length();
        } catch (PackageManager.NameNotFoundException | SecurityException unused) {
        }
    }

    private final boolean containsNativeLibrary(Context context, String libraryName) {
        try {
            String[] list = new File(context.getApplicationInfo().nativeLibraryDir).list();
            list.getClass();
            return ArraysKt___ArraysKt.contains(list, libraryName);
        } catch (Exception unused) {
            return false;
        }
    }

    private final boolean hasClass(String className) {
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final long getApkSize() {
        return this.apkSize;
    }

    public final boolean getDebuggable() {
        return this.debuggable;
    }

    public final boolean getHasFlutter() {
        return this.hasFlutter;
    }

    public final boolean getHasFlutterPlugin() {
        return this.hasFlutterPlugin;
    }

    public final boolean getHasReactNative() {
        return this.hasReactNative;
    }

    public final boolean getHasReactNativePlugin() {
        return this.hasReactNativePlugin;
    }

    public final int getMinSdkVersion() {
        return this.minSdkVersion;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final int getTargetSdkVersion() {
        return this.targetSdkVersion;
    }

    public final boolean getUsesAndroidX() {
        return this.usesAndroidX;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public final void setApkSize(long j) {
        this.apkSize = j;
    }

    public final void setDebuggable(boolean z) {
        this.debuggable = z;
    }

    public final void setMinSdkVersion(int i) {
        this.minSdkVersion = i;
    }

    public final void setTargetSdkVersion(int i) {
        this.targetSdkVersion = i;
    }

    public final void setVersionCode(int i) {
        this.versionCode = i;
    }

    public final void setVersionName(String str) {
        str.getClass();
        this.versionName = str;
    }
}

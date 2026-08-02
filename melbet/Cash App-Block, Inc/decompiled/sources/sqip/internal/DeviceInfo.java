package sqip.internal;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Debug;
import android.provider.Settings;
import android.util.DisplayMetrics;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import sqip.internal.HttpModule;
import sqip.internal.nonce.DeviceInfoRequest;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 )2\u00020\u0001:\u0001)B1\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0003J\b\u0010\u0016\u001a\u00020\u0003H\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\u0010\u0010\u001c\u001a\n \u0014*\u0004\u0018\u00010\u00030\u0003H\u0002J\b\u0010\u001d\u001a\u00020\u0003H\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0012\u0010 \u001a\u00020\u001f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001fH\u0002J \u0010#\u001a\u0004\u0018\u00010\u001a*\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(H\u0002R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006*"}, d2 = {"Lsqip/internal/DeviceInfo;", "", "installerPackageName", "", "locale", "Ljavax/inject/Provider;", "Ljava/util/Locale;", "application", "Landroid/app/Application;", "squareDeviceId", "(Ljava/lang/String;Ljavax/inject/Provider;Landroid/app/Application;Ljava/lang/String;)V", "getApplication", "()Landroid/app/Application;", "getInstallerPackageName", "()Ljava/lang/String;", "getSquareDeviceId", "captureDeviceInfo", "Lsqip/internal/nonce/DeviceInfoRequest;", "displayMetrics", "Landroid/util/DisplayMetrics;", "kotlin.jvm.PlatformType", "getAndroidId", "getArchitecture", "getBatteryPercentage", "", "intent", "Landroid/content/Intent;", "getBatteryStatus", "getPackageName", "getTimeZone", "installedFromPlayStore", "", "isCharging", "isEmulator", "isRealDevice", "safeRegisterReceiver", "Landroid/content/Context;", "receiver", "Landroid/content/BroadcastReceiver;", "filter", "Landroid/content/IntentFilter;", "Companion", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceInfo {
    private static final List<String> VALID_INSTALLER_PACKAGES = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"com.android.packageinstaller", "com.google.android.packageinstaller", "com.android.vending"});
    private final Application application;
    private final String installerPackageName;
    private final Provider locale;
    private final String squareDeviceId;

    public DeviceInfo(@HttpModule.InstallerPackageName String str, Provider provider, Application application, @HttpModule.SquareDeviceId String str2) {
        str.getClass();
        provider.getClass();
        application.getClass();
        str2.getClass();
        this.installerPackageName = str;
        this.locale = provider;
        this.application = application;
        this.squareDeviceId = str2;
    }

    private final DisplayMetrics displayMetrics() {
        return this.application.getResources().getDisplayMetrics();
    }

    private final String getAndroidId() {
        String string2 = Settings.Secure.getString(this.application.getContentResolver(), "android_id");
        return string2 == null ? "null" : string2;
    }

    private final String getArchitecture() {
        String property = System.getProperty("os.arch");
        property.getClass();
        return property;
    }

    private final float getBatteryPercentage(Intent intent) {
        if (intent == null) {
            return -1.0f;
        }
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return -1.0f;
        }
        return intExtra / intExtra2;
    }

    private final Intent getBatteryStatus() {
        return safeRegisterReceiver(this.application, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    private final String getPackageName() {
        return this.application.getPackageName();
    }

    private final String getTimeZone() {
        String displayName = TimeZone.getDefault().getDisplayName((Locale) this.locale.get());
        displayName.getClass();
        return displayName;
    }

    private final boolean installedFromPlayStore() {
        return VALID_INSTALLER_PACKAGES.contains(this.installerPackageName);
    }

    private final boolean isCharging(Intent intent) {
        return (intent != null ? intent.getIntExtra("plugged", 0) : -1) > 0;
    }

    private final boolean isEmulator() {
        String str = Build.FINGERPRINT;
        str.getClass();
        if (StringsKt__StringsJVMKt.startsWith(str, "generic", false) || StringsKt__StringsJVMKt.startsWith(str, "unknown", false)) {
            return true;
        }
        String str2 = Build.MODEL;
        str2.getClass();
        if (StringsKt.contains((CharSequence) str2, (CharSequence) "google_sdk", false) || StringsKt.contains((CharSequence) str2, (CharSequence) "Emulator", false) || StringsKt.contains((CharSequence) str2, (CharSequence) "Android SDK built for x86", false)) {
            return true;
        }
        String str3 = Build.MANUFACTURER;
        str3.getClass();
        if (StringsKt.contains((CharSequence) str3, (CharSequence) "Genymotion", false)) {
            return true;
        }
        String str4 = Build.BRAND;
        str4.getClass();
        if (StringsKt__StringsJVMKt.startsWith(str4, "generic", false)) {
            String str5 = Build.DEVICE;
            str5.getClass();
            if (StringsKt__StringsJVMKt.startsWith(str5, "generic", false)) {
                return true;
            }
        }
        String str6 = Build.PRODUCT;
        if (str6.equals("google_sdk") || str6.equals("sdk_gphone64_arm64") || str6.equals("sdk_phone_arm64") || Build.DEVICE.equals("emu64a")) {
            return true;
        }
        String lowerCase = str6.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return (StringsKt.contains((CharSequence) lowerCase, (CharSequence) "hodor_", false) || StringsKt__StringsJVMKt.startsWith(lowerCase, "t2_", false) || StringsKt__StringsJVMKt.startsWith(lowerCase, "t3a", false) || StringsKt.contains((CharSequence) lowerCase, (CharSequence) "bran_", false)) && (StringsKt__StringsJVMKt.endsWith(lowerCase, "avd", false) || StringsKt__StringsJVMKt.endsWith(lowerCase, "cf", false));
    }

    private final boolean isRealDevice() {
        return !isEmulator();
    }

    private final Intent safeRegisterReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, 2) : context.registerReceiver(broadcastReceiver, intentFilter);
    }

    public final DeviceInfoRequest captureDeviceInfo() {
        DisplayMetrics displayMetrics = displayMetrics();
        Intent batteryStatus = getBatteryStatus();
        boolean isDebuggerConnected = Debug.isDebuggerConnected();
        boolean installedFromPlayStore = installedFromPlayStore();
        String str = Build.MANUFACTURER;
        str.getClass();
        String str2 = Build.MODEL;
        str2.getClass();
        String timeZone = getTimeZone();
        String locale = ((Locale) this.locale.get()).toString();
        locale.getClass();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int i3 = displayMetrics.densityDpi;
        boolean isCharging = isCharging(batteryStatus);
        float batteryPercentage = getBatteryPercentage(batteryStatus);
        String str3 = this.squareDeviceId;
        String packageName = getPackageName();
        packageName.getClass();
        return new DeviceInfoRequest("android", isDebuggerConnected, installedFromPlayStore, str, str2, timeZone, locale, i, i2, i3, isCharging, batteryPercentage, str3, packageName, isRealDevice(), this.installerPackageName, getAndroidId(), getArchitecture(), String.valueOf(Build.VERSION.SDK_INT));
    }

    public final Application getApplication() {
        return this.application;
    }

    public final String getInstallerPackageName() {
        return this.installerPackageName;
    }

    public final String getSquareDeviceId() {
        return this.squareDeviceId;
    }
}

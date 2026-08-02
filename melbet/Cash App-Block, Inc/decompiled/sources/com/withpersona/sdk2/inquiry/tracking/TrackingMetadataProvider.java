package com.withpersona.sdk2.inquiry.tracking;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.withpersona.sdk2.inquiry.device.EmulatorDeviceUtilsKt;
import com.withpersona.sdk2.inquiry.tracking.model.TrackingMetadata;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\u000fJ\u0006\u0010\u0013\u001a\u00020\u0014J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\rH\u0002J\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0002\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingMetadataProvider;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sdk", "", "sdkVersion", "appVersion", "appNamespace", "deviceModel", "isSimulator", "", "featureFlags", "", "setFeatureFlags", "", "flags", "collect", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "getConnectionType", "getCellularTechnology", "getThermalState", "getSystemAvailableMemoryMb", "", "getBatteryLevel", "()Ljava/lang/Double;", "getIsLowPowerMode", "getAppMemoryUsageMb", "", "()Ljava/lang/Long;", "getIsCharging", "()Ljava/lang/Boolean;", "getIsBackgrounded", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TrackingMetadataProvider {
    private final String appNamespace;
    private final String appVersion;
    private final Context context;
    private final String deviceModel;
    private volatile Map<String, Boolean> featureFlags;
    private final boolean isSimulator;
    private final String sdk;
    private final String sdkVersion;

    public TrackingMetadataProvider(Context context) {
        Object failure;
        context.getClass();
        this.context = context;
        this.sdk = "persona-android";
        this.sdkVersion = "2.43.0";
        try {
            Result.Companion companion = Result.Companion;
            failure = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        this.appVersion = (String) (failure instanceof Result.Failure ? null : failure);
        String packageName = this.context.getPackageName();
        packageName.getClass();
        this.appNamespace = packageName;
        this.deviceModel = Recorder$$ExternalSyntheticOutline2.m(Build.MANUFACTURER, " ", Build.MODEL);
        this.isSimulator = EmulatorDeviceUtilsKt.isDeviceEmulator();
    }

    private final Long getAppMemoryUsageMb() {
        Runtime runtime = Runtime.getRuntime();
        if (runtime == null) {
            return null;
        }
        return Long.valueOf((runtime.totalMemory() - runtime.freeMemory()) / 1048576);
    }

    private final Double getBatteryLevel() {
        int intProperty;
        Object systemService = this.context.getSystemService("batterymanager");
        BatteryManager batteryManager = systemService instanceof BatteryManager ? (BatteryManager) systemService : null;
        if (batteryManager != null && (intProperty = batteryManager.getIntProperty(4)) >= 0) {
            return Double.valueOf(intProperty / 100.0d);
        }
        return null;
    }

    private final String getCellularTechnology() {
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Object systemService = this.context.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager == null) {
            return null;
        }
        int dataNetworkType = telephonyManager.getDataNetworkType();
        if (dataNetworkType == 20) {
            return "5g";
        }
        switch (dataNetworkType) {
        }
        return null;
    }

    private final String getConnectionType() {
        Object systemService = this.context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return null;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return "offline";
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        return networkCapabilities == null ? "unknown" : networkCapabilities.hasTransport(1) ? "wifi" : networkCapabilities.hasTransport(0) ? "cellular" : "unknown";
    }

    private final boolean getIsBackgrounded() {
        ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.newInstance;
        return !ProcessLifecycleOwner.newInstance.registry.state.isAtLeast(Lifecycle.State.STARTED);
    }

    private final Boolean getIsCharging() {
        Object systemService = this.context.getSystemService("batterymanager");
        BatteryManager batteryManager = systemService instanceof BatteryManager ? (BatteryManager) systemService : null;
        if (batteryManager == null) {
            return null;
        }
        return Boolean.valueOf(batteryManager.isCharging());
    }

    private final boolean getIsLowPowerMode() {
        Object systemService = this.context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            return false;
        }
        return powerManager.isPowerSaveMode();
    }

    private final double getSystemAvailableMemoryMb() {
        Object systemService = this.context.getSystemService("activity");
        systemService.getClass();
        ((ActivityManager) systemService).getMemoryInfo(new ActivityManager.MemoryInfo());
        return r0.availMem / 1048576.0d;
    }

    private final String getThermalState() {
        Object systemService = this.context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            return null;
        }
        switch (powerManager.getCurrentThermalStatus()) {
        }
        return null;
    }

    public final TrackingMetadata collect() {
        Object failure;
        Object failure2;
        Object failure3;
        Object failure4;
        Object failure5;
        Object failure6;
        String str;
        Object failure7;
        Boolean bool;
        Object failure8;
        Boolean bool2;
        Object failure9;
        String str2;
        Object failure10;
        String str3 = this.sdk;
        String str4 = this.sdkVersion;
        String str5 = this.appVersion;
        String str6 = this.appNamespace;
        String str7 = this.deviceModel;
        Boolean valueOf = Boolean.valueOf(this.isSimulator);
        String str8 = Build.VERSION.RELEASE;
        try {
            Result.Companion companion = Result.Companion;
            failure = getConnectionType();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        String str9 = (String) failure;
        try {
            failure2 = getCellularTechnology();
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            failure2 = new Result.Failure(th2);
        }
        if (failure2 instanceof Result.Failure) {
            failure2 = null;
        }
        String str10 = (String) failure2;
        try {
            failure3 = getThermalState();
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.Companion;
            failure3 = new Result.Failure(th3);
        }
        if (failure3 instanceof Result.Failure) {
            failure3 = null;
        }
        String str11 = (String) failure3;
        try {
            failure4 = Double.valueOf(getSystemAvailableMemoryMb());
        } catch (Throwable th4) {
            Result.Companion companion5 = Result.Companion;
            failure4 = new Result.Failure(th4);
        }
        if (failure4 instanceof Result.Failure) {
            failure4 = null;
        }
        Double d = (Double) failure4;
        try {
            failure5 = getBatteryLevel();
        } catch (Throwable th5) {
            Result.Companion companion6 = Result.Companion;
            failure5 = new Result.Failure(th5);
        }
        if (failure5 instanceof Result.Failure) {
            failure5 = null;
        }
        Double d2 = (Double) failure5;
        try {
            failure6 = Boolean.valueOf(getIsLowPowerMode());
        } catch (Throwable th6) {
            Result.Companion companion7 = Result.Companion;
            failure6 = new Result.Failure(th6);
        }
        if (failure6 instanceof Result.Failure) {
            failure6 = null;
        }
        Boolean bool3 = (Boolean) failure6;
        Object obj = null;
        Long appMemoryUsageMb = getAppMemoryUsageMb();
        try {
            failure7 = getIsCharging();
            str = str4;
        } catch (Throwable th7) {
            Result.Companion companion8 = Result.Companion;
            str = str4;
            failure7 = new Result.Failure(th7);
        }
        if (failure7 instanceof Result.Failure) {
            failure7 = null;
        }
        Boolean bool4 = (Boolean) failure7;
        try {
            failure8 = Boolean.valueOf(getIsBackgrounded());
            bool = bool4;
        } catch (Throwable th8) {
            Result.Companion companion9 = Result.Companion;
            bool = bool4;
            failure8 = new Result.Failure(th8);
        }
        if (failure8 instanceof Result.Failure) {
            failure8 = null;
        }
        Boolean bool5 = (Boolean) failure8;
        try {
            failure9 = Locale.getDefault().toString();
            bool2 = bool5;
        } catch (Throwable th9) {
            Result.Companion companion10 = Result.Companion;
            bool2 = bool5;
            failure9 = new Result.Failure(th9);
        }
        if (failure9 instanceof Result.Failure) {
            failure9 = null;
        }
        String str12 = (String) failure9;
        try {
            failure10 = TimeZone.getDefault().getID();
            str2 = str12;
        } catch (Throwable th10) {
            Result.Companion companion11 = Result.Companion;
            str2 = str12;
            failure10 = new Result.Failure(th10);
        }
        if (!(failure10 instanceof Result.Failure)) {
            obj = failure10;
        }
        return new TrackingMetadata(str3, str, str5, str6, str7, valueOf, str8, str9, str10, str11, d, d2, bool3, appMemoryUsageMb, bool, bool2, str2, (String) obj, this.featureFlags);
    }

    public final void setFeatureFlags(Map<String, Boolean> flags) {
        flags.getClass();
        this.featureFlags = flags;
    }
}

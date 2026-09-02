package c3;

import java.util.List;
import o5.InterfaceC0564d;

/* loaded from: classes.dex */
public interface f {
    String getApiBaseUrl();

    String getAppId();

    String getAppIdForHeaders();

    String getAppPackageId();

    String getAppState();

    String getAppVersion();

    String getCrashStoragePath();

    String getCurrentThreadName();

    String getDeviceManufacturer();

    String getDeviceModel();

    List getEnabledFeatureFlags();

    Object getInstallId(InterfaceC0564d interfaceC0564d);

    long getMinFileAgeForReadMillis();

    String getOnesignalId();

    String getOsBuildId();

    String getOsName();

    String getOsVersion();

    long getProcessUptime();

    String getPushSubscriptionId();

    String getRemoteLogLevel();

    String getSdkBase();

    String getSdkBaseVersion();

    String getSdkWrapper();

    String getSdkWrapperVersion();

    boolean isOtelExporterLoggingEnabled();
}

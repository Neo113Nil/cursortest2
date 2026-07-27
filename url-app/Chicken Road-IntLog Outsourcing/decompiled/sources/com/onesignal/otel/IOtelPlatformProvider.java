package com.onesignal.otel;

import g4.C0471p;
import java.util.List;
import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public interface IOtelPlatformProvider {

    public static final class DefaultImpls {
        public static List<String> getEnabledFeatureFlags(IOtelPlatformProvider iOtelPlatformProvider) {
            return C0471p.f5750a;
        }
    }

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

    List<String> getEnabledFeatureFlags();

    Object getInstallId(InterfaceC1218d interfaceC1218d);

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

    boolean isRemoteLoggingEnabled();
}

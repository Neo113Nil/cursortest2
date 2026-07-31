package com.onesignal.otel;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* compiled from: IOtelPlatformProvider.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001b\bf\u0018\u00002\u00020\u0001J\u000e\u0010:\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010;R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0012\u0010\u0014\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005R\u0012\u0010\u0016\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001eR\u0012\u0010\u001f\u001a\u00020\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001eR\u0012\u0010 \u001a\u00020!X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0005R\u0012\u0010&\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0005R\u0012\u0010(\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0005R\u0012\u0010*\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0005R\u0012\u0010,\u001a\u00020!X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010#R\u0014\u0010.\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0005R\u0014\u00100\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0005R\u0012\u00102\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0005R\u0012\u00104\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0005R\u0014\u00106\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0005R\u0014\u00108\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0005¨\u0006<"}, d2 = {"Lcom/onesignal/otel/IOtelPlatformProvider;", "", "apiBaseUrl", "", "getApiBaseUrl", "()Ljava/lang/String;", "appId", "getAppId", "appIdForHeaders", "getAppIdForHeaders", "appPackageId", "getAppPackageId", "appState", "getAppState", "appVersion", "getAppVersion", "crashStoragePath", "getCrashStoragePath", "currentThreadName", "getCurrentThreadName", "deviceManufacturer", "getDeviceManufacturer", "deviceModel", "getDeviceModel", "enabledFeatureFlags", "", "getEnabledFeatureFlags", "()Ljava/util/List;", "isOtelExporterLoggingEnabled", "", "()Z", "isRemoteLoggingEnabled", "minFileAgeForReadMillis", "", "getMinFileAgeForReadMillis", "()J", "onesignalId", "getOnesignalId", "osBuildId", "getOsBuildId", "osName", "getOsName", "osVersion", "getOsVersion", "processUptime", "getProcessUptime", "pushSubscriptionId", "getPushSubscriptionId", "remoteLogLevel", "getRemoteLogLevel", "sdkBase", "getSdkBase", "sdkBaseVersion", "getSdkBaseVersion", "sdkWrapper", "getSdkWrapper", "sdkWrapperVersion", "getSdkWrapperVersion", "getInstallId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface IOtelPlatformProvider {
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

    Object getInstallId(Continuation<? super String> continuation);

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

    /* compiled from: IOtelPlatformProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static List<String> getEnabledFeatureFlags(IOtelPlatformProvider iOtelPlatformProvider) {
            return CollectionsKt.emptyList();
        }
    }
}

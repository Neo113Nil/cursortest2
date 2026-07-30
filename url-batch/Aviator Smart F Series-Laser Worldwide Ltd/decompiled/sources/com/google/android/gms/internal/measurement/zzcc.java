package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* loaded from: classes3.dex */
public interface zzcc extends IInterface {
    void beginAdUnitExposure(String str, long j8);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j8);

    void endAdUnitExposure(String str, long j8);

    void generateEventId(zzcf zzcfVar);

    void getAppInstanceId(zzcf zzcfVar);

    void getCachedAppInstanceId(zzcf zzcfVar);

    void getConditionalUserProperties(String str, String str2, zzcf zzcfVar);

    void getCurrentScreenClass(zzcf zzcfVar);

    void getCurrentScreenName(zzcf zzcfVar);

    void getGmpAppId(zzcf zzcfVar);

    void getMaxUserProperties(String str, zzcf zzcfVar);

    void getSessionId(zzcf zzcfVar);

    void getTestFlag(zzcf zzcfVar, int i8);

    void getUserProperties(String str, String str2, boolean z7, zzcf zzcfVar);

    void initForTests(Map map);

    void initialize(IObjectWrapper iObjectWrapper, zzcl zzclVar, long j8);

    void isDataCollectionEnabled(zzcf zzcfVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j8);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcf zzcfVar, long j8);

    void logHealthData(int i8, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3);

    void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j8);

    void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j8);

    void onActivityPaused(IObjectWrapper iObjectWrapper, long j8);

    void onActivityResumed(IObjectWrapper iObjectWrapper, long j8);

    void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcf zzcfVar, long j8);

    void onActivityStarted(IObjectWrapper iObjectWrapper, long j8);

    void onActivityStopped(IObjectWrapper iObjectWrapper, long j8);

    void performAction(Bundle bundle, zzcf zzcfVar, long j8);

    void registerOnMeasurementEventListener(zzci zzciVar);

    void resetAnalyticsData(long j8);

    void setConditionalUserProperty(Bundle bundle, long j8);

    void setConsent(Bundle bundle, long j8);

    void setConsentThirdParty(Bundle bundle, long j8);

    void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j8);

    void setDataCollectionEnabled(boolean z7);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzci zzciVar);

    void setInstanceIdProvider(zzck zzckVar);

    void setMeasurementEnabled(boolean z7, long j8);

    void setMinimumSessionDuration(long j8);

    void setSessionTimeoutDuration(long j8);

    void setUserId(String str, long j8);

    void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z7, long j8);

    void unregisterOnMeasurementEventListener(zzci zzciVar);
}

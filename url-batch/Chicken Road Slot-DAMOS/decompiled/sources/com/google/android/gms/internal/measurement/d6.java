package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface d6 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(f6 f6Var);

    void getAppInstanceId(f6 f6Var);

    void getCachedAppInstanceId(f6 f6Var);

    void getConditionalUserProperties(String str, String str2, f6 f6Var);

    void getCurrentScreenClass(f6 f6Var);

    void getCurrentScreenName(f6 f6Var);

    void getGmpAppId(f6 f6Var);

    void getMaxUserProperties(String str, f6 f6Var);

    void getSessionId(f6 f6Var);

    void getTestFlag(f6 f6Var, int i3);

    void getUserProperties(String str, String str2, boolean z10, f6 f6Var);

    void initForTests(Map map);

    void initialize(j7.a aVar, n6 n6Var, long j);

    void initializeWithElapsedTime(j7.a aVar, n6 n6Var, long j, long j3);

    void isDataCollectionEnabled(f6 f6Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, f6 f6Var, long j);

    void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j, long j3);

    void logHealthData(int i3, String str, j7.a aVar, j7.a aVar2, j7.a aVar3);

    void onActivityCreated(j7.a aVar, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(p6 p6Var, Bundle bundle, long j);

    void onActivityDestroyed(j7.a aVar, long j);

    void onActivityDestroyedByScionActivityInfo(p6 p6Var, long j);

    void onActivityPaused(j7.a aVar, long j);

    void onActivityPausedByScionActivityInfo(p6 p6Var, long j);

    void onActivityResumed(j7.a aVar, long j);

    void onActivityResumedByScionActivityInfo(p6 p6Var, long j);

    void onActivitySaveInstanceState(j7.a aVar, f6 f6Var, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(p6 p6Var, f6 f6Var, long j);

    void onActivityStarted(j7.a aVar, long j);

    void onActivityStartedByScionActivityInfo(p6 p6Var, long j);

    void onActivityStopped(j7.a aVar, long j);

    void onActivityStoppedByScionActivityInfo(p6 p6Var, long j);

    void performAction(Bundle bundle, f6 f6Var, long j);

    void registerOnMeasurementEventListener(j6 j6Var);

    void resetAnalyticsData(long j);

    void resetAnalyticsDataWithElapsedTime(long j, long j3);

    void retrieveAndUploadBatches(h6 h6Var);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(j7.a aVar, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(p6 p6Var, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(j6 j6Var);

    void setInstanceIdProvider(m6 m6Var);

    void setMeasurementEnabled(boolean z10, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, j7.a aVar, boolean z10, long j);

    void unregisterOnMeasurementEventListener(j6 j6Var);
}

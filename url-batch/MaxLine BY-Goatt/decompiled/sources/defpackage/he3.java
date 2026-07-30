package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface he3 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(je3 je3Var);

    void getAppInstanceId(je3 je3Var);

    void getCachedAppInstanceId(je3 je3Var);

    void getConditionalUserProperties(String str, String str2, je3 je3Var);

    void getCurrentScreenClass(je3 je3Var);

    void getCurrentScreenName(je3 je3Var);

    void getGmpAppId(je3 je3Var);

    void getMaxUserProperties(String str, je3 je3Var);

    void getSessionId(je3 je3Var);

    void getTestFlag(je3 je3Var, int i);

    void getUserProperties(String str, String str2, boolean z, je3 je3Var);

    void initForTests(Map map);

    void initialize(b01 b01Var, ye3 ye3Var, long j);

    void isDataCollectionEnabled(je3 je3Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, je3 je3Var, long j);

    void logHealthData(int i, String str, b01 b01Var, b01 b01Var2, b01 b01Var3);

    void onActivityCreated(b01 b01Var, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(ze3 ze3Var, Bundle bundle, long j);

    void onActivityDestroyed(b01 b01Var, long j);

    void onActivityDestroyedByScionActivityInfo(ze3 ze3Var, long j);

    void onActivityPaused(b01 b01Var, long j);

    void onActivityPausedByScionActivityInfo(ze3 ze3Var, long j);

    void onActivityResumed(b01 b01Var, long j);

    void onActivityResumedByScionActivityInfo(ze3 ze3Var, long j);

    void onActivitySaveInstanceState(b01 b01Var, je3 je3Var, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(ze3 ze3Var, je3 je3Var, long j);

    void onActivityStarted(b01 b01Var, long j);

    void onActivityStartedByScionActivityInfo(ze3 ze3Var, long j);

    void onActivityStopped(b01 b01Var, long j);

    void onActivityStoppedByScionActivityInfo(ze3 ze3Var, long j);

    void performAction(Bundle bundle, je3 je3Var, long j);

    void registerOnMeasurementEventListener(ve3 ve3Var);

    void resetAnalyticsData(long j);

    void retrieveAndUploadBatches(me3 me3Var);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(b01 b01Var, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(ze3 ze3Var, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(ve3 ve3Var);

    void setInstanceIdProvider(xe3 xe3Var);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, b01 b01Var, boolean z, long j);

    void unregisterOnMeasurementEventListener(ve3 ve3Var);
}

package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* loaded from: classes.dex */
public interface zzcv extends IInterface {
    void beginAdUnitExposure(String str, long j4);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j4);

    void endAdUnitExposure(String str, long j4);

    void generateEventId(zzcy zzcyVar);

    void getAppInstanceId(zzcy zzcyVar);

    void getCachedAppInstanceId(zzcy zzcyVar);

    void getConditionalUserProperties(String str, String str2, zzcy zzcyVar);

    void getCurrentScreenClass(zzcy zzcyVar);

    void getCurrentScreenName(zzcy zzcyVar);

    void getGmpAppId(zzcy zzcyVar);

    void getMaxUserProperties(String str, zzcy zzcyVar);

    void getSessionId(zzcy zzcyVar);

    void getTestFlag(zzcy zzcyVar, int i4);

    void getUserProperties(String str, String str2, boolean z4, zzcy zzcyVar);

    void initForTests(Map map);

    void initialize(IObjectWrapper iObjectWrapper, zzdh zzdhVar, long j4);

    void isDataCollectionEnabled(zzcy zzcyVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z4, boolean z5, long j4);

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcy zzcyVar, long j4);

    void logHealthData(int i4, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3);

    void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j4);

    void onActivityCreatedByScionActivityInfo(zzdj zzdjVar, Bundle bundle, long j4);

    void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j4);

    void onActivityDestroyedByScionActivityInfo(zzdj zzdjVar, long j4);

    void onActivityPaused(IObjectWrapper iObjectWrapper, long j4);

    void onActivityPausedByScionActivityInfo(zzdj zzdjVar, long j4);

    void onActivityResumed(IObjectWrapper iObjectWrapper, long j4);

    void onActivityResumedByScionActivityInfo(zzdj zzdjVar, long j4);

    void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcy zzcyVar, long j4);

    void onActivitySaveInstanceStateByScionActivityInfo(zzdj zzdjVar, zzcy zzcyVar, long j4);

    void onActivityStarted(IObjectWrapper iObjectWrapper, long j4);

    void onActivityStartedByScionActivityInfo(zzdj zzdjVar, long j4);

    void onActivityStopped(IObjectWrapper iObjectWrapper, long j4);

    void onActivityStoppedByScionActivityInfo(zzdj zzdjVar, long j4);

    void performAction(Bundle bundle, zzcy zzcyVar, long j4);

    void registerOnMeasurementEventListener(zzde zzdeVar);

    void resetAnalyticsData(long j4);

    void retrieveAndUploadBatches(zzdb zzdbVar);

    void setConditionalUserProperty(Bundle bundle, long j4);

    void setConsent(Bundle bundle, long j4);

    void setConsentThirdParty(Bundle bundle, long j4);

    void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j4);

    void setCurrentScreenByScionActivityInfo(zzdj zzdjVar, String str, String str2, long j4);

    void setDataCollectionEnabled(boolean z4);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(zzde zzdeVar);

    void setInstanceIdProvider(zzdg zzdgVar);

    void setMeasurementEnabled(boolean z4, long j4);

    void setMinimumSessionDuration(long j4);

    void setSessionTimeoutDuration(long j4);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j4);

    void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z4, long j4);

    void unregisterOnMeasurementEventListener(zzde zzdeVar);
}

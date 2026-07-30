package com.adjust.sdk;

import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageMediaPlayerSolarAurora7976 implements Runnable {
    public final /* synthetic */ SdkClickHandler PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyageMediaPlayerSolarAurora7976(SdkClickHandler sdkClickHandler) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = sdkClickHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        ILogger iLogger;
        SdkClickHandler sdkClickHandler = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        weakReference = sdkClickHandler.activityHandlerWeakRef;
        IActivityHandler iActivityHandler = (IActivityHandler) weakReference.get();
        SharedPreferencesManager defaultInstance = SharedPreferencesManager.getDefaultInstance(iActivityHandler.getContext());
        try {
            JSONArray rawReferrerArray = defaultInstance.getRawReferrerArray();
            boolean z = false;
            for (int i = 0; i < rawReferrerArray.length(); i++) {
                JSONArray jSONArray = rawReferrerArray.getJSONArray(i);
                if (jSONArray.optInt(2, -1) == 0) {
                    String optString = jSONArray.optString(0, null);
                    z = true;
                    long optLong = jSONArray.optLong(1, -1L);
                    jSONArray.put(2, 1);
                    sdkClickHandler.sendSdkClick(PackageFactory.buildReftagSdkClickPackage(optString, optLong, iActivityHandler.getActivityState(), iActivityHandler.getAdjustConfig(), iActivityHandler.getDeviceInfo(), iActivityHandler.getGlobalParameters(), iActivityHandler.getFirstSessionDelayManager(), iActivityHandler.getInternalState()));
                }
            }
            if (z) {
                defaultInstance.saveRawReferrerArray(rawReferrerArray);
            }
        } catch (JSONException e) {
            iLogger = sdkClickHandler.logger;
            iLogger.error("Send saved raw referrers error (%s)", e.getMessage());
        }
    }
}

package com.mopub.nativeads;

import android.content.Context;
import com.mopub.common.DataKeys;
import com.mopub.common.logging.MoPubLog;
import com.mopub.nativeads.CustomEventNative;
import com.mopub.nativeads.factories.CustomEventNativeFactory;
import com.mopub.network.AdResponse;
import java.util.Map;

/* loaded from: classes2.dex */
final class CustomEventNativeAdapter {
    private CustomEventNativeAdapter() {
    }

    public static void loadNativeAd(Context context, Map<String, Object> map, AdResponse adResponse, CustomEventNative.CustomEventNativeListener customEventNativeListener) {
        String customEventClassName = adResponse.getCustomEventClassName();
        MoPubLog.d("Attempting to invoke custom event: " + customEventClassName);
        try {
            CustomEventNative create = CustomEventNativeFactory.create(customEventClassName);
            if (adResponse.hasJson()) {
                map.put(DataKeys.JSON_BODY_KEY, adResponse.getJsonBody());
            }
            map.put(DataKeys.CLICK_TRACKING_URL_KEY, adResponse.getClickTrackingUrl());
            try {
                create.loadNativeAd(context, customEventNativeListener, map, adResponse.getServerExtras());
            } catch (Exception e) {
                MoPubLog.w("Loading custom event native threw an error.", e);
                customEventNativeListener.onNativeAdFailed(NativeErrorCode.NATIVE_ADAPTER_NOT_FOUND);
            }
        } catch (Exception unused) {
            MoPubLog.w("Failed to load Custom Event Native class: " + customEventClassName);
            customEventNativeListener.onNativeAdFailed(NativeErrorCode.NATIVE_ADAPTER_NOT_FOUND);
        }
    }
}

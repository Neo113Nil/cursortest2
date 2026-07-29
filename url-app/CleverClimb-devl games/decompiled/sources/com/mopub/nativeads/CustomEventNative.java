package com.mopub.nativeads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class CustomEventNative {

    public interface CustomEventNativeListener {
        void onNativeAdFailed(NativeErrorCode nativeErrorCode);

        void onNativeAdLoaded(BaseNativeAd baseNativeAd);
    }

    protected abstract void loadNativeAd(Context context, CustomEventNativeListener customEventNativeListener, Map<String, Object> map, Map<String, String> map2);
}

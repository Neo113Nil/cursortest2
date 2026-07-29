package com.mopub.nativeads;

import android.content.Context;
import com.mopub.common.AdFormat;
import com.mopub.common.Constants;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.DeviceUtils;
import com.mopub.common.util.ManifestUtils;
import com.mopub.mobileads.MoPubErrorCode;
import com.mopub.nativeads.CustomEventNative;
import com.mopub.network.AdRequest;
import com.mopub.network.AdResponse;
import com.mopub.network.MoPubNetworkError;
import com.mopub.network.Networking;
import com.mopub.volley.NetworkResponse;
import com.mopub.volley.VolleyError;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class MoPubNative {
    static final MoPubNativeNetworkListener EMPTY_NETWORK_LISTENER = new MoPubNativeNetworkListener() { // from class: com.mopub.nativeads.MoPubNative.1
        @Override // com.mopub.nativeads.MoPubNative.MoPubNativeNetworkListener
        public void onNativeFail(NativeErrorCode nativeErrorCode) {
        }

        @Override // com.mopub.nativeads.MoPubNative.MoPubNativeNetworkListener
        public void onNativeLoad(NativeAd nativeAd) {
            nativeAd.destroy();
        }
    };
    AdRendererRegistry mAdRendererRegistry;
    private final String mAdUnitId;
    private final WeakReference<Context> mContext;
    private Map<String, Object> mLocalExtras;
    private MoPubNativeNetworkListener mMoPubNativeNetworkListener;
    private AdRequest mNativeRequest;
    private final AdRequest.Listener mVolleyListener;

    public interface MoPubNativeNetworkListener {
        void onNativeFail(NativeErrorCode nativeErrorCode);

        void onNativeLoad(NativeAd nativeAd);
    }

    public MoPubNative(Context context, String str, MoPubNativeNetworkListener moPubNativeNetworkListener) {
        this(context, str, new AdRendererRegistry(), moPubNativeNetworkListener);
    }

    @VisibleForTesting
    public MoPubNative(Context context, String str, AdRendererRegistry adRendererRegistry, MoPubNativeNetworkListener moPubNativeNetworkListener) {
        this.mLocalExtras = new TreeMap();
        Preconditions.checkNotNull(context, "context may not be null.");
        Preconditions.checkNotNull(str, "AdUnitId may not be null.");
        Preconditions.checkNotNull(adRendererRegistry, "AdRendererRegistry may not be null.");
        Preconditions.checkNotNull(moPubNativeNetworkListener, "MoPubNativeNetworkListener may not be null.");
        ManifestUtils.checkNativeActivitiesDeclared(context);
        this.mContext = new WeakReference<>(context);
        this.mAdUnitId = str;
        this.mMoPubNativeNetworkListener = moPubNativeNetworkListener;
        this.mAdRendererRegistry = adRendererRegistry;
        this.mVolleyListener = new AdRequest.Listener() { // from class: com.mopub.nativeads.MoPubNative.2
            @Override // com.mopub.network.AdRequest.Listener
            public void onSuccess(AdResponse adResponse) {
                MoPubNative.this.onAdLoad(adResponse);
            }

            @Override // com.mopub.volley.Response.ErrorListener
            public void onErrorResponse(VolleyError volleyError) {
                MoPubNative.this.onAdError(volleyError);
            }
        };
    }

    public void registerAdRenderer(MoPubAdRenderer moPubAdRenderer) {
        this.mAdRendererRegistry.registerAdRenderer(moPubAdRenderer);
    }

    public void destroy() {
        this.mContext.clear();
        if (this.mNativeRequest != null) {
            this.mNativeRequest.cancel();
            this.mNativeRequest = null;
        }
        this.mMoPubNativeNetworkListener = EMPTY_NETWORK_LISTENER;
    }

    public void setLocalExtras(Map<String, Object> map) {
        if (map == null) {
            this.mLocalExtras = new TreeMap();
        } else {
            this.mLocalExtras = new TreeMap(map);
        }
    }

    public void makeRequest() {
        makeRequest((RequestParameters) null);
    }

    public void makeRequest(RequestParameters requestParameters) {
        makeRequest(requestParameters, null);
    }

    public void makeRequest(RequestParameters requestParameters, Integer num) {
        Context contextOrDestroy = getContextOrDestroy();
        if (contextOrDestroy == null) {
            return;
        }
        if (!DeviceUtils.isNetworkAvailable(contextOrDestroy)) {
            this.mMoPubNativeNetworkListener.onNativeFail(NativeErrorCode.CONNECTION_ERROR);
        } else {
            loadNativeAd(requestParameters, num);
        }
    }

    private void loadNativeAd(RequestParameters requestParameters, Integer num) {
        Context contextOrDestroy = getContextOrDestroy();
        if (contextOrDestroy == null) {
            return;
        }
        NativeUrlGenerator withRequest = new NativeUrlGenerator(contextOrDestroy).withAdUnitId(this.mAdUnitId).withRequest(requestParameters);
        if (num != null) {
            withRequest.withSequenceNumber(num.intValue());
        }
        String generateUrlString = withRequest.generateUrlString(Constants.HOST);
        if (generateUrlString != null) {
            MoPubLog.d("Loading ad from: " + generateUrlString);
        }
        requestNativeAd(generateUrlString);
    }

    void requestNativeAd(String str) {
        Context contextOrDestroy = getContextOrDestroy();
        if (contextOrDestroy == null) {
            return;
        }
        if (str == null) {
            this.mMoPubNativeNetworkListener.onNativeFail(NativeErrorCode.INVALID_REQUEST_URL);
        } else {
            this.mNativeRequest = new AdRequest(str, AdFormat.NATIVE, this.mAdUnitId, contextOrDestroy, this.mVolleyListener);
            Networking.getRequestQueue(contextOrDestroy).add(this.mNativeRequest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdLoad(final AdResponse adResponse) {
        Context contextOrDestroy = getContextOrDestroy();
        if (contextOrDestroy == null) {
            return;
        }
        CustomEventNativeAdapter.loadNativeAd(contextOrDestroy, this.mLocalExtras, adResponse, new CustomEventNative.CustomEventNativeListener() { // from class: com.mopub.nativeads.MoPubNative.3
            @Override // com.mopub.nativeads.CustomEventNative.CustomEventNativeListener
            public void onNativeAdLoaded(BaseNativeAd baseNativeAd) {
                Context contextOrDestroy2 = MoPubNative.this.getContextOrDestroy();
                if (contextOrDestroy2 == null) {
                    return;
                }
                MoPubAdRenderer rendererForAd = MoPubNative.this.mAdRendererRegistry.getRendererForAd(baseNativeAd);
                if (rendererForAd == null) {
                    onNativeAdFailed(NativeErrorCode.NATIVE_RENDERER_CONFIGURATION_ERROR);
                } else {
                    MoPubNative.this.mMoPubNativeNetworkListener.onNativeLoad(new NativeAd(contextOrDestroy2, adResponse.getImpressionTrackingUrl(), adResponse.getClickTrackingUrl(), MoPubNative.this.mAdUnitId, baseNativeAd, rendererForAd));
                }
            }

            @Override // com.mopub.nativeads.CustomEventNative.CustomEventNativeListener
            public void onNativeAdFailed(NativeErrorCode nativeErrorCode) {
                MoPubLog.v(String.format("Native Ad failed to load with error: %s.", nativeErrorCode));
                MoPubNative.this.requestNativeAd(adResponse.getFailoverUrl());
            }
        });
    }

    @VisibleForTesting
    void onAdError(VolleyError volleyError) {
        MoPubLog.d("Native ad request failed.", volleyError);
        if (volleyError instanceof MoPubNetworkError) {
            switch (((MoPubNetworkError) volleyError).getReason()) {
                case BAD_BODY:
                    this.mMoPubNativeNetworkListener.onNativeFail(NativeErrorCode.INVALID_RESPONSE);
                    break;
                case BAD_HEADER_DATA:
                    this.mMoPubNativeNetworkListener.onNativeFail(NativeErrorCode.INVALID_RESPONSE);
                    break;
                case WARMING_UP:
                    MoPubLog.c(MoPubErrorCode.WARMUP.toString());
                    this.mMoPubNativeNetworkListener.onNativeFail(NativeErrorCode.EMPTY_AD_RESPONSE);
                    break;
                case NO_FILL:
                    this.mMoPubNativeNetworkListener.onNativeFail(NativeErrorCode.EMPTY_AD_RESPONSE);
                    break;
                default:
                    this.mMoPubNativeNetworkListener.onNativeFail(NativeErrorCode.UNSPECIFIED);
                    break;
            }
            return;
        }
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse != null && networkResponse.statusCode >= 500 && networkResponse.statusCode < 600) {
            this.mMoPubNativeNetworkListener.onNativeFail(NativeErrorCode.SERVER_ERROR_RESPONSE_CODE);
        } else if (networkResponse == null && !DeviceUtils.isNetworkAvailable(this.mContext.get())) {
            MoPubLog.c(String.valueOf(MoPubErrorCode.NO_CONNECTION.toString()));
            this.mMoPubNativeNetworkListener.onNativeFail(NativeErrorCode.CONNECTION_ERROR);
        } else {
            this.mMoPubNativeNetworkListener.onNativeFail(NativeErrorCode.UNSPECIFIED);
        }
    }

    @VisibleForTesting
    Context getContextOrDestroy() {
        Context context = this.mContext.get();
        if (context == null) {
            destroy();
            MoPubLog.d("Weak reference to Context in MoPubNative became null. This instance of MoPubNative is destroyed and No more requests will be processed.");
        }
        return context;
    }

    @VisibleForTesting
    @Deprecated
    MoPubNativeNetworkListener getMoPubNativeNetworkListener() {
        return this.mMoPubNativeNetworkListener;
    }
}

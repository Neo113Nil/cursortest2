package com.mopub.nativeads;

import android.content.Context;
import android.os.Handler;
import com.mopub.common.Constants;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.DeviceUtils;
import com.mopub.mobileads.MoPubErrorCode;
import com.mopub.nativeads.MoPubNativeAdPositioning;
import com.mopub.nativeads.PositioningSource;
import com.mopub.network.MoPubNetworkError;
import com.mopub.network.Networking;
import com.mopub.volley.Response;
import com.mopub.volley.VolleyError;

/* loaded from: classes2.dex */
class ServerPositioningSource implements PositioningSource {
    private static final double DEFAULT_RETRY_TIME_MILLISECONDS = 1000.0d;
    private static final double EXPONENTIAL_BACKOFF_FACTOR = 2.0d;
    private static final int MAXIMUM_RETRY_TIME_MILLISECONDS = 300000;
    private final Context mContext;
    private PositioningSource.PositioningListener mListener;
    private PositioningRequest mRequest;
    private int mRetryCount;
    private String mRetryUrl;
    private int mMaximumRetryTimeMillis = MAXIMUM_RETRY_TIME_MILLISECONDS;
    private final Handler mRetryHandler = new Handler();
    private final Runnable mRetryRunnable = new Runnable() { // from class: com.mopub.nativeads.ServerPositioningSource.1
        @Override // java.lang.Runnable
        public void run() {
            ServerPositioningSource.this.requestPositioningInternal();
        }
    };
    private final Response.Listener<MoPubNativeAdPositioning.MoPubClientPositioning> mPositioningListener = new Response.Listener<MoPubNativeAdPositioning.MoPubClientPositioning>() { // from class: com.mopub.nativeads.ServerPositioningSource.2
        @Override // com.mopub.volley.Response.Listener
        public void onResponse(MoPubNativeAdPositioning.MoPubClientPositioning moPubClientPositioning) {
            ServerPositioningSource.this.handleSuccess(moPubClientPositioning);
        }
    };
    private final Response.ErrorListener mErrorListener = new Response.ErrorListener() { // from class: com.mopub.nativeads.ServerPositioningSource.3
        @Override // com.mopub.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            if (!(volleyError instanceof MoPubNetworkError) || ((MoPubNetworkError) volleyError).getReason().equals(MoPubNetworkError.Reason.WARMING_UP)) {
                MoPubLog.e("Failed to load positioning data", volleyError);
                if (volleyError.networkResponse == null && !DeviceUtils.isNetworkAvailable(ServerPositioningSource.this.mContext)) {
                    MoPubLog.c(String.valueOf(MoPubErrorCode.NO_CONNECTION.toString()));
                }
            }
            ServerPositioningSource.this.handleFailure();
        }
    };

    ServerPositioningSource(Context context) {
        this.mContext = context.getApplicationContext();
    }

    @Override // com.mopub.nativeads.PositioningSource
    public void loadPositions(String str, PositioningSource.PositioningListener positioningListener) {
        if (this.mRequest != null) {
            this.mRequest.cancel();
            this.mRequest = null;
        }
        if (this.mRetryCount > 0) {
            this.mRetryHandler.removeCallbacks(this.mRetryRunnable);
            this.mRetryCount = 0;
        }
        this.mListener = positioningListener;
        this.mRetryUrl = new PositioningUrlGenerator(this.mContext).withAdUnitId(str).generateUrlString(Constants.HOST);
        requestPositioningInternal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestPositioningInternal() {
        MoPubLog.d("Loading positioning from: " + this.mRetryUrl);
        this.mRequest = new PositioningRequest(this.mContext, this.mRetryUrl, this.mPositioningListener, this.mErrorListener);
        Networking.getRequestQueue(this.mContext).add(this.mRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSuccess(MoPubNativeAdPositioning.MoPubClientPositioning moPubClientPositioning) {
        if (this.mListener != null) {
            this.mListener.onLoad(moPubClientPositioning);
        }
        this.mListener = null;
        this.mRetryCount = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFailure() {
        int pow = (int) (Math.pow(EXPONENTIAL_BACKOFF_FACTOR, this.mRetryCount + 1) * DEFAULT_RETRY_TIME_MILLISECONDS);
        if (pow >= this.mMaximumRetryTimeMillis) {
            MoPubLog.d("Error downloading positioning information");
            if (this.mListener != null) {
                this.mListener.onFailed();
            }
            this.mListener = null;
            return;
        }
        this.mRetryCount++;
        this.mRetryHandler.postDelayed(this.mRetryRunnable, pow);
    }

    @VisibleForTesting
    @Deprecated
    void setMaximumRetryTimeMilliseconds(int i) {
        this.mMaximumRetryTimeMillis = i;
    }
}

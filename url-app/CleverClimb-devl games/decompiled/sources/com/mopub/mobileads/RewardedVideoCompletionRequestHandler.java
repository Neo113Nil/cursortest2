package com.mopub.mobileads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.app.NotificationManagerCompat;
import android.text.TextUtils;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.RewardedVideoCompletionRequest;
import com.mopub.network.Networking;
import com.mopub.volley.DefaultRetryPolicy;
import com.mopub.volley.RequestQueue;
import com.mopub.volley.VolleyError;

/* loaded from: classes2.dex */
public class RewardedVideoCompletionRequestHandler implements RewardedVideoCompletionRequest.RewardedVideoCompletionRequestListener {
    private static final String API_VERSION_KEY = "&v=";
    private static final String CUSTOMER_ID_KEY = "&customer_id=";
    private static final String CUSTOM_DATA_KEY = "&rcd=";
    private static final String CUSTOM_EVENT_CLASS_NAME_KEY = "&cec=";
    static final int MAX_RETRIES = 17;
    static final int REQUEST_TIMEOUT_DELAY = 1000;
    static final int[] RETRY_TIMES = {5000, 10000, 20000, 40000, 60000};
    private static final String REWARD_AMOUNT_KEY = "&rca=";
    private static final String REWARD_NAME_KEY = "&rcn=";
    private static final String SDK_VERSION_KEY = "&nv=";
    private final Context mContext;
    private final Handler mHandler;
    private final RequestQueue mRequestQueue;
    private int mRetryCount;
    private volatile boolean mShouldStop;
    private final String mUrl;

    RewardedVideoCompletionRequestHandler(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        this(context, str, str2, str3, str4, str5, str6, new Handler());
    }

    @VisibleForTesting
    RewardedVideoCompletionRequestHandler(Context context, String str, String str2, String str3, String str4, String str5, String str6, Handler handler) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(str3);
        Preconditions.checkNotNull(str4);
        Preconditions.checkNotNull(handler);
        this.mUrl = appendParameters(str, str2, str3, str4, str5, str6);
        this.mRetryCount = 0;
        this.mHandler = handler;
        this.mRequestQueue = Networking.getRequestQueue(context);
        this.mContext = context.getApplicationContext();
    }

    void makeRewardedVideoCompletionRequest() {
        if (this.mShouldStop) {
            this.mRequestQueue.cancelAll(this.mUrl);
            return;
        }
        RewardedVideoCompletionRequest rewardedVideoCompletionRequest = new RewardedVideoCompletionRequest(this.mContext, this.mUrl, new DefaultRetryPolicy(getTimeout(this.mRetryCount) + NotificationManagerCompat.IMPORTANCE_UNSPECIFIED, 0, 0.0f), this);
        rewardedVideoCompletionRequest.setTag(this.mUrl);
        this.mRequestQueue.add(rewardedVideoCompletionRequest);
        if (this.mRetryCount >= 17) {
            MoPubLog.d("Exceeded number of retries for rewarded video completion request.");
        } else {
            this.mHandler.postDelayed(new Runnable() { // from class: com.mopub.mobileads.RewardedVideoCompletionRequestHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    RewardedVideoCompletionRequestHandler.this.makeRewardedVideoCompletionRequest();
                }
            }, getTimeout(this.mRetryCount));
            this.mRetryCount++;
        }
    }

    @Override // com.mopub.mobileads.RewardedVideoCompletionRequest.RewardedVideoCompletionRequestListener
    public void onResponse(Integer num) {
        if (num != null) {
            if (num.intValue() < 500 || num.intValue() >= 600) {
                this.mShouldStop = true;
            }
        }
    }

    @Override // com.mopub.volley.Response.ErrorListener
    public void onErrorResponse(VolleyError volleyError) {
        if (volleyError == null || volleyError.networkResponse == null) {
            return;
        }
        if (volleyError.networkResponse.statusCode < 500 || volleyError.networkResponse.statusCode >= 600) {
            this.mShouldStop = true;
        }
    }

    public static void makeRewardedVideoCompletionRequest(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        if (context == null || TextUtils.isEmpty(str) || str3 == null || str4 == null) {
            return;
        }
        new RewardedVideoCompletionRequestHandler(context, str, str2, str3, str4, str5, str6).makeRewardedVideoCompletionRequest();
    }

    static int getTimeout(int i) {
        if (i >= 0 && i < RETRY_TIMES.length) {
            return RETRY_TIMES[i];
        }
        return RETRY_TIMES[RETRY_TIMES.length - 1];
    }

    private static String appendParameters(String str, String str2, String str3, String str4, String str5, String str6) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(str3);
        Preconditions.checkNotNull(str4);
        StringBuilder sb = new StringBuilder(str);
        sb.append(CUSTOMER_ID_KEY);
        sb.append(str2 == null ? "" : Uri.encode(str2));
        sb.append(REWARD_NAME_KEY);
        sb.append(Uri.encode(str3));
        sb.append(REWARD_AMOUNT_KEY);
        sb.append(Uri.encode(str4));
        sb.append(SDK_VERSION_KEY);
        sb.append(Uri.encode("5.0.0"));
        sb.append(API_VERSION_KEY);
        sb.append(1);
        sb.append(CUSTOM_EVENT_CLASS_NAME_KEY);
        sb.append(str5 == null ? "" : Uri.encode(str5));
        if (!TextUtils.isEmpty(str6)) {
            sb.append(CUSTOM_DATA_KEY);
            sb.append(Uri.encode(str6));
        }
        return sb.toString();
    }

    @VisibleForTesting
    @Deprecated
    boolean getShouldStop() {
        return this.mShouldStop;
    }

    @VisibleForTesting
    @Deprecated
    int getRetryCount() {
        return this.mRetryCount;
    }

    @VisibleForTesting
    @Deprecated
    void setRetryCount(int i) {
        this.mRetryCount = i;
    }
}

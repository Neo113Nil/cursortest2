package com.mopub.network;

import android.os.Handler;
import android.os.Looper;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.network.RequestManager.RequestFactory;
import com.mopub.volley.Request;

/* loaded from: classes2.dex */
public abstract class RequestManager<T extends RequestFactory> {
    protected BackoffPolicy mBackoffPolicy;
    protected Request<?> mCurrentRequest;
    protected Handler mHandler;
    protected T mRequestFactory;

    public interface RequestFactory {
    }

    abstract Request<?> createRequest();

    public RequestManager(Looper looper) {
        this.mHandler = new Handler(looper);
    }

    public boolean isAtCapacity() {
        return this.mCurrentRequest != null;
    }

    public void makeRequest(T t, BackoffPolicy backoffPolicy) {
        Preconditions.checkNotNull(t);
        Preconditions.checkNotNull(backoffPolicy);
        cancelRequest();
        this.mRequestFactory = t;
        this.mBackoffPolicy = backoffPolicy;
        makeRequestInternal();
    }

    public void cancelRequest() {
        MoPubRequestQueue requestQueue = Networking.getRequestQueue();
        if (requestQueue != null && this.mCurrentRequest != null) {
            requestQueue.cancel(this.mCurrentRequest);
        }
        clearRequest();
    }

    @VisibleForTesting
    void makeRequestInternal() {
        this.mCurrentRequest = createRequest();
        MoPubRequestQueue requestQueue = Networking.getRequestQueue();
        if (requestQueue == null) {
            MoPubLog.d("MoPubRequest queue is null. Clearing request.");
            clearRequest();
        } else if (this.mBackoffPolicy.getRetryCount() == 0) {
            requestQueue.add(this.mCurrentRequest);
        } else {
            requestQueue.addDelayedRequest(this.mCurrentRequest, this.mBackoffPolicy.getBackoffMs());
        }
    }

    @VisibleForTesting
    void clearRequest() {
        this.mCurrentRequest = null;
        this.mRequestFactory = null;
        this.mBackoffPolicy = null;
    }

    @VisibleForTesting
    @Deprecated
    Request<?> getCurrentRequest() {
        return this.mCurrentRequest;
    }
}

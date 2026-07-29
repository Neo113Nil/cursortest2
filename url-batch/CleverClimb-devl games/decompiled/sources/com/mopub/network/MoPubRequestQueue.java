package com.mopub.network;

import android.os.Handler;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.volley.Cache;
import com.mopub.volley.Network;
import com.mopub.volley.Request;
import com.mopub.volley.RequestQueue;
import com.mopub.volley.ResponseDelivery;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class MoPubRequestQueue extends RequestQueue {
    private static final int CAPACITY = 10;
    private final Map<Request<?>, DelayedRequestHelper> mDelayedRequests;

    MoPubRequestQueue(Cache cache, Network network, int i, ResponseDelivery responseDelivery) {
        super(cache, network, i, responseDelivery);
        this.mDelayedRequests = new HashMap(10);
    }

    MoPubRequestQueue(Cache cache, Network network, int i) {
        super(cache, network, i);
        this.mDelayedRequests = new HashMap(10);
    }

    MoPubRequestQueue(Cache cache, Network network) {
        super(cache, network);
        this.mDelayedRequests = new HashMap(10);
    }

    public void addDelayedRequest(Request<?> request, int i) {
        Preconditions.checkNotNull(request);
        addDelayedRequest(request, new DelayedRequestHelper(this, request, i));
    }

    @VisibleForTesting
    void addDelayedRequest(Request<?> request, DelayedRequestHelper delayedRequestHelper) {
        Preconditions.checkNotNull(delayedRequestHelper);
        if (this.mDelayedRequests.containsKey(request)) {
            cancel(request);
        }
        delayedRequestHelper.start();
        this.mDelayedRequests.put(request, delayedRequestHelper);
    }

    @Override // com.mopub.volley.RequestQueue
    public void cancelAll(RequestQueue.RequestFilter requestFilter) {
        Preconditions.checkNotNull(requestFilter);
        super.cancelAll(requestFilter);
        Iterator<Map.Entry<Request<?>, DelayedRequestHelper>> it = this.mDelayedRequests.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Request<?>, DelayedRequestHelper> next = it.next();
            if (requestFilter.apply(next.getKey())) {
                next.getKey().cancel();
                next.getValue().cancel();
                it.remove();
            }
        }
    }

    @Override // com.mopub.volley.RequestQueue
    public void cancelAll(final Object obj) {
        Preconditions.checkNotNull(obj);
        super.cancelAll(obj);
        cancelAll(new RequestQueue.RequestFilter() { // from class: com.mopub.network.MoPubRequestQueue.1
            @Override // com.mopub.volley.RequestQueue.RequestFilter
            public boolean apply(Request<?> request) {
                return request.getTag() == obj;
            }
        });
    }

    public void cancel(final Request<?> request) {
        Preconditions.checkNotNull(request);
        cancelAll(new RequestQueue.RequestFilter() { // from class: com.mopub.network.MoPubRequestQueue.2
            @Override // com.mopub.volley.RequestQueue.RequestFilter
            public boolean apply(Request<?> request2) {
                return request == request2;
            }
        });
    }

    class DelayedRequestHelper {
        final int mDelayMs;
        final Runnable mDelayedRunnable;
        final Handler mHandler;

        DelayedRequestHelper(MoPubRequestQueue moPubRequestQueue, Request<?> request, int i) {
            this(request, i, new Handler());
        }

        @VisibleForTesting
        DelayedRequestHelper(final Request<?> request, int i, Handler handler) {
            this.mDelayMs = i;
            this.mHandler = handler;
            this.mDelayedRunnable = new Runnable() { // from class: com.mopub.network.MoPubRequestQueue.DelayedRequestHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    MoPubRequestQueue.this.mDelayedRequests.remove(request);
                    MoPubRequestQueue.this.add(request);
                }
            };
        }

        void start() {
            this.mHandler.postDelayed(this.mDelayedRunnable, this.mDelayMs);
        }

        void cancel() {
            this.mHandler.removeCallbacks(this.mDelayedRunnable);
        }
    }

    @VisibleForTesting
    @Deprecated
    Map<Request<?>, DelayedRequestHelper> getDelayedRequests() {
        return this.mDelayedRequests;
    }
}

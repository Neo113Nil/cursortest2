package com.mopub.volley.toolbox;

import android.os.Handler;
import android.os.Looper;
import com.mopub.volley.Cache;
import com.mopub.volley.NetworkResponse;
import com.mopub.volley.Request;
import com.mopub.volley.Response;

/* loaded from: classes2.dex */
public class ClearCacheRequest extends Request<Object> {
    private final Cache mCache;
    private final Runnable mCallback;

    @Override // com.mopub.volley.Request
    protected void deliverResponse(Object obj) {
    }

    @Override // com.mopub.volley.Request
    protected Response<Object> parseNetworkResponse(NetworkResponse networkResponse) {
        return null;
    }

    public ClearCacheRequest(Cache cache, Runnable runnable) {
        super(0, null, null);
        this.mCache = cache;
        this.mCallback = runnable;
    }

    @Override // com.mopub.volley.Request
    public boolean isCanceled() {
        this.mCache.clear();
        if (this.mCallback == null) {
            return true;
        }
        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(this.mCallback);
        return true;
    }

    @Override // com.mopub.volley.Request
    public Request.Priority getPriority() {
        return Request.Priority.IMMEDIATE;
    }
}

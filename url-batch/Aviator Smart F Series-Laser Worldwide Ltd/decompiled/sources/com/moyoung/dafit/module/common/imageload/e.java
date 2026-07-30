package com.moyoung.dafit.module.common.imageload;

import android.content.Context;
import com.google.common.net.HttpHeaders;
import com.moyoung.dafit.module.common.utils.a0;
import com.orhanobut.logger.f;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public class e implements Interceptor {
    private static final long CACHE_PERIOD = 216000;
    private Context context;

    public e(Context context) {
        this.context = context;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        f.d("Intercept respone");
        Request request = chain.request();
        if (!a0.isNetworkConnected(this.context)) {
            request = request.newBuilder().cacheControl(CacheControl.FORCE_CACHE).build();
            f.i("no network", new Object[0]);
        }
        Response proceed = chain.proceed(request);
        if (!a0.isNetworkConnected(this.context)) {
            return proceed.newBuilder().header("Cache-Control", "public, only-if-cached, max-stale=216000").removeHeader(HttpHeaders.PRAGMA).build();
        }
        return proceed.newBuilder().header("Cache-Control", request.cacheControl().toString()).removeHeader(HttpHeaders.PRAGMA).build();
    }
}

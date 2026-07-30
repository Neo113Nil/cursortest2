package com.moyoung.dafit.module.common.network.provider;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public class c {
    public static final Interceptor REWRITE_RESPONSE_INTERCEPTOR = new Interceptor() { // from class: com.moyoung.dafit.module.common.network.provider.a
        @Override // okhttp3.Interceptor
        public final Response intercept(Interceptor.Chain chain) {
            Response lambda$static$0;
            lambda$static$0 = c.lambda$static$0(chain);
            return lambda$static$0;
        }
    };
    public static final Interceptor REWRITE_RESPONSE_INTERCEPTOR_OFFLINE = new Interceptor() { // from class: com.moyoung.dafit.module.common.network.provider.b
        @Override // okhttp3.Interceptor
        public final Response intercept(Interceptor.Chain chain) {
            Response lambda$static$1;
            lambda$static$1 = c.lambda$static$1(chain);
            return lambda$static$1;
        }
    };

    private static boolean isNetworkConnected(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isAvailable();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Response lambda$static$0(Interceptor.Chain chain) {
        Response proceed = chain.proceed(chain.request());
        String header = proceed.header("Cache-Control");
        if (header != null && !header.contains("no-store") && !header.contains("no-cache") && !header.contains("must-revalidate") && !header.contains("max-age=0")) {
            return proceed;
        }
        return proceed.newBuilder().header("Cache-Control", "public, only-if-cached, max-stale=157680000").build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Response lambda$static$1(Interceptor.Chain chain) {
        Request request = chain.request();
        Context context = com.moyoung.dafit.module.common.utils.d.get();
        if (context != null && !isNetworkConnected(context)) {
            request = request.newBuilder().cacheControl(CacheControl.FORCE_CACHE).build();
        }
        return chain.proceed(request);
    }
}

package com.my.lib;

import okhttp3.Interceptor;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.my.lib.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0421m implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        kotlin.jvm.internal.s.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        if (!(request.body() instanceof MultipartBody)) {
            return chain.proceed(request);
        }
        B.a("ContentLengthFixInterceptor.intercept");
        return chain.proceed(request.newBuilder().removeHeader("Content-Length").build());
    }
}

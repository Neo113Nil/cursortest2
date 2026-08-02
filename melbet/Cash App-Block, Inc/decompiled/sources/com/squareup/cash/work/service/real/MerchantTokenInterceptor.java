package com.squareup.cash.work.service.real;

import com.squareup.cash.work.service.api.SquareMerchantToken;
import kotlin.jvm.internal.Reflection;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* loaded from: classes4.dex */
public final class MerchantTokenInterceptor implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request = realInterceptorChain.request;
        request.getClass();
        SquareMerchantToken squareMerchantToken = (SquareMerchantToken) request.tag(Reflection.factory.getOrCreateKotlinClass(SquareMerchantToken.class));
        if (squareMerchantToken == null) {
            return realInterceptorChain.proceed(request);
        }
        Request.Builder newBuilder = request.newBuilder();
        newBuilder.addHeader("Square-Merchant-Token", squareMerchantToken.value);
        return realInterceptorChain.proceed(new Request(newBuilder));
    }
}

package com.squareup.cash.work.service.real;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;

/* loaded from: classes9.dex */
public final /* synthetic */ class RegisterNetworkingModule$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Lazy f$0;

    public /* synthetic */ RegisterNetworkingModule$$ExternalSyntheticLambda0(Lazy lazy, int i) {
        this.$r8$classId = i;
        this.f$0 = lazy;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Lazy lazy = this.f$0;
        switch (i) {
            case 0:
                OkHttpClient.Builder newBuilder = ((OkHttpClient) lazy.getValue()).newBuilder();
                newBuilder.cookieJar = new WorkCookieJar(0);
                return new OkHttpClient(newBuilder);
            default:
                OkHttpClient.Builder newBuilder2 = ((OkHttpClient) lazy.getValue()).newBuilder();
                newBuilder2.interceptors.add(0, new MerchantTokenInterceptor());
                return new OkHttpClient(newBuilder2);
        }
    }
}

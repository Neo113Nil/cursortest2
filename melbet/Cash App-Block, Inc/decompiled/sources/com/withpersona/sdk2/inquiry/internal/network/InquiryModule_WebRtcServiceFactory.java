package com.withpersona.sdk2.inquiry.internal.network;

import com.stripe.android.GooglePayConfig;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcService;
import dagger.internal.Factory;
import dagger.internal.Provider;
import retrofit2.Retrofit;

/* loaded from: classes9.dex */
public final class InquiryModule_WebRtcServiceFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final GooglePayConfig module;
    public final Provider webRtcRetrofitProvider;

    public /* synthetic */ InquiryModule_WebRtcServiceFactory(GooglePayConfig googlePayConfig, Provider provider, int i) {
        this.$r8$classId = i;
        this.module = googlePayConfig;
        this.webRtcRetrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Provider provider = this.webRtcRetrofitProvider;
        GooglePayConfig googlePayConfig = this.module;
        switch (i) {
            case 0:
                Retrofit retrofit = (Retrofit) provider.get();
                retrofit.getClass();
                Retrofit.Builder builder = new Retrofit.Builder(retrofit);
                builder.baseUrl(googlePayConfig.validPublishableKey);
                Object create = builder.build().create(WebRtcService.class);
                create.getClass();
                return (WebRtcService) create;
            default:
                Retrofit retrofit3 = (Retrofit) provider.get();
                retrofit3.getClass();
                Retrofit.Builder builder2 = new Retrofit.Builder(retrofit3);
                builder2.baseUrl(googlePayConfig.sdkVersion);
                Object create2 = builder2.build().create(FallbackModeService.class);
                create2.getClass();
                return (FallbackModeService) create2;
        }
    }
}

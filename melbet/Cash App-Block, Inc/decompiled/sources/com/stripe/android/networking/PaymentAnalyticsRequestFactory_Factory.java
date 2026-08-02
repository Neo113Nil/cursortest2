package com.stripe.android.networking;

import android.content.Context;
import com.squareup.moshi.Moshi;
import com.stripe.android.payments.core.authentication.NoOpIntentNextActionHandler;
import com.stripe.android.payments.core.authentication.VoucherNextActionHandler;
import com.stripe.android.payments.core.authentication.WebIntentNextActionHandler;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeApiController;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.StaticTemplateSession_Factory_Impl;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes8.dex */
public final class PaymentAnalyticsRequestFactory_Factory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider contextProvider;
    public final InstanceFactory defaultProductUsageTokensProvider;
    public final Provider publishableKeyProvider;

    public /* synthetic */ PaymentAnalyticsRequestFactory_Factory(Provider provider, Provider provider2, InstanceFactory instanceFactory, int i) {
        this.$r8$classId = i;
        this.contextProvider = provider;
        this.publishableKeyProvider = provider2;
        this.defaultProductUsageTokensProvider = instanceFactory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        InstanceFactory instanceFactory = this.defaultProductUsageTokensProvider;
        Provider provider = this.publishableKeyProvider;
        Provider provider2 = this.contextProvider;
        switch (i) {
            case 0:
                return new PaymentAnalyticsRequestFactory((Context) provider2.get(), (Function0) provider.get(), (Set) instanceFactory.instance);
            case 1:
                return new VoucherNextActionHandler((WebIntentNextActionHandler) provider2.get(), (NoOpIntentNextActionHandler) provider.get(), (Context) instanceFactory.instance);
            default:
                return new FallbackModeApiController((FallbackModeService) provider2.get(), (Moshi) provider.get(), (StaticTemplateSession_Factory_Impl) instanceFactory.instance);
        }
    }
}

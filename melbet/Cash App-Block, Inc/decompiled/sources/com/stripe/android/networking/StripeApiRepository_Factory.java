package com.stripe.android.networking;

import android.content.Context;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.withpersona.sdk2.camera.CameraPreview_Factory;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.inquiry.device.DeviceModule_AppSetIdHelperFactory;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags_Factory;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes8.dex */
public final class StripeApiRepository_Factory implements Factory {
    public final SelfieDirectionFeed_Factory analyticsRequestExecutorProvider;
    public final Provider appContextProvider;
    public final DeviceModule_AppSetIdHelperFactory loggerProvider;
    public final Provider paymentAnalyticsRequestFactoryProvider;
    public final Provider productUsageTokensProvider;
    public final Provider publishableKeyProvider;
    public final Provider requestSurfaceProvider;
    public final Provider workContextProvider;

    public StripeApiRepository_Factory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, SandboxFlags_Factory sandboxFlags_Factory, CameraPreview_Factory cameraPreview_Factory, InstanceFactory instanceFactory3, PaymentAnalyticsRequestFactory_Factory paymentAnalyticsRequestFactory_Factory, SelfieDirectionFeed_Factory selfieDirectionFeed_Factory, DeviceModule_AppSetIdHelperFactory deviceModule_AppSetIdHelperFactory) {
        this.appContextProvider = instanceFactory;
        this.publishableKeyProvider = instanceFactory2;
        this.requestSurfaceProvider = sandboxFlags_Factory;
        this.workContextProvider = cameraPreview_Factory;
        this.productUsageTokensProvider = instanceFactory3;
        this.paymentAnalyticsRequestFactoryProvider = paymentAnalyticsRequestFactory_Factory;
        this.analyticsRequestExecutorProvider = selfieDirectionFeed_Factory;
        this.loggerProvider = deviceModule_AppSetIdHelperFactory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new StripeApiRepository((Context) this.appContextProvider.get(), (Function0) this.publishableKeyProvider.get(), (RequestSurface) this.requestSurfaceProvider.get(), (CoroutineContext) this.workContextProvider.get(), (Set) this.productUsageTokensProvider.get(), (PaymentAnalyticsRequestFactory) this.paymentAnalyticsRequestFactoryProvider.get(), (DefaultAnalyticsRequestExecutor) this.analyticsRequestExecutorProvider.get(), (Logger$Companion$NOOP_LOGGER$1) this.loggerProvider.get());
    }
}

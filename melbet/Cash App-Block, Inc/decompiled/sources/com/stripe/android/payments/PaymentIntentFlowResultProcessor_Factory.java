package com.stripe.android.payments;

import android.content.Context;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.domain.LookupAccount_Factory;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import com.stripe.android.networking.StripeApiRepository_Factory;
import com.stripe.android.networking.StripeRepository;
import com.withpersona.sdk2.camera.CameraPreview_Factory;
import com.withpersona.sdk2.camera.CameraXController_Factory_Impl;
import com.withpersona.sdk2.camera.camera2.Camera2Controller_Factory_Impl;
import com.withpersona.sdk2.inquiry.device.DeviceModule_AppSetIdHelperFactory;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcRenderer;
import com.withpersona.sdk2.inquiry.internal.InquiryActivityModule_ContextFactory;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import java.util.Locale;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes8.dex */
public final class PaymentIntentFlowResultProcessor_Factory implements Factory {
    public final /* synthetic */ int $r8$classId = 1;
    public final Provider contextProvider;
    public final Provider loggerProvider;
    public final Provider publishableKeyProvider;
    public final Factory stripeRepositoryProvider;
    public final Provider workContextProvider;

    public PaymentIntentFlowResultProcessor_Factory(InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, Provider provider, Provider provider2) {
        this.contextProvider = inquiryActivityModule_ContextFactory;
        this.stripeRepositoryProvider = instanceFactory;
        this.loggerProvider = instanceFactory2;
        this.publishableKeyProvider = provider;
        this.workContextProvider = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Provider provider = this.workContextProvider;
        Provider provider2 = this.publishableKeyProvider;
        Provider provider3 = this.loggerProvider;
        Factory factory = this.stripeRepositoryProvider;
        Provider provider4 = this.contextProvider;
        switch (i) {
            case 0:
                return new PaymentIntentFlowResultProcessor((Context) provider4.get(), (Function0) provider2.get(), (StripeRepository) ((StripeApiRepository_Factory) factory).get(), (Logger$Companion$NOOP_LOGGER$1) ((DeviceModule_AppSetIdHelperFactory) provider3).get(), (CoroutineContext) provider.get());
            case 1:
                FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor = (FinancialConnectionsRequestExecutor) ((LookupAccount_Factory) factory).get();
                ApiRequest.Factory factory2 = (ApiRequest.Factory) provider4.get();
                ProvideApiRequestOptions provideApiRequestOptions = (ProvideApiRequestOptions) provider2.get();
                Locale locale = (Locale) provider.get();
                Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = (Logger$Companion$NOOP_LOGGER$1) provider3.get();
                factory2.getClass();
                provideApiRequestOptions.getClass();
                logger$Companion$NOOP_LOGGER$1.getClass();
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                Locale locale2 = locale;
                locale2.getClass();
                return new FinancialConnectionsManifestRepositoryImpl(financialConnectionsRequestExecutor, factory2, provideApiRequestOptions, locale2, logger$Companion$NOOP_LOGGER$1, null);
            default:
                return new WebRtcRenderer((Context) provider4.get(), (CameraXController_Factory_Impl) ((InstanceFactory) factory).instance, (Camera2Controller_Factory_Impl) ((InstanceFactory) provider3).instance, (NavigationStateManager) provider2.get(), (TrackingEventsLogger) provider.get());
        }
    }

    public PaymentIntentFlowResultProcessor_Factory(LookupAccount_Factory lookupAccount_Factory, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.stripeRepositoryProvider = lookupAccount_Factory;
        this.contextProvider = provider;
        this.publishableKeyProvider = provider2;
        this.workContextProvider = provider3;
        this.loggerProvider = provider4;
    }

    public PaymentIntentFlowResultProcessor_Factory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, StripeApiRepository_Factory stripeApiRepository_Factory, DeviceModule_AppSetIdHelperFactory deviceModule_AppSetIdHelperFactory, CameraPreview_Factory cameraPreview_Factory) {
        this.contextProvider = instanceFactory;
        this.publishableKeyProvider = instanceFactory2;
        this.stripeRepositoryProvider = stripeApiRepository_Factory;
        this.loggerProvider = deviceModule_AppSetIdHelperFactory;
        this.workContextProvider = cameraPreview_Factory;
    }
}

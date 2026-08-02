package com.stripe.android.financialconnections.domain;

import android.app.Application;
import android.content.Context;
import com.fillr.core.utilities.AppPreferenceStore;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.moshi.Moshi;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.frauddetection.DefaultFraudDetectionDataRepository;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry;
import com.stripe.android.payments.core.authentication.NoOpIntentNextActionHandler;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3DS2NextActionHandler;
import com.withpersona.sdk2.camera.CameraModule_CameraStatsManagerFactory;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.device.DeviceModule_AppSetIdHelperFactory;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker_Factory;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager_Factory;
import com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.internal.Environment;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.ApiController;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeModule_EnvironmentFactory;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow_Factory;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.MapFactory;
import dagger.internal.Provider;
import io.noties.markwon.MarkwonImpl;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.Json;

/* loaded from: classes8.dex */
public final class LookupAccount_Factory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider applicationProvider;
    public final Provider configurationProvider;
    public final Provider consumerSessionRepositoryProvider;
    public final Factory requestIntegrityTokenProvider;

    public /* synthetic */ LookupAccount_Factory(Factory factory, Factory factory2, Factory factory3, Provider provider, int i) {
        this.$r8$classId = i;
        this.applicationProvider = factory;
        this.configurationProvider = factory2;
        this.requestIntegrityTokenProvider = factory3;
        this.consumerSessionRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Provider provider = this.consumerSessionRepositoryProvider;
        Factory factory = this.requestIntegrityTokenProvider;
        Provider provider2 = this.configurationProvider;
        Provider provider3 = this.applicationProvider;
        switch (i) {
            case 0:
                return new LookupAccount((Application) provider3.get(), (RequestIntegrityToken) ((DeviceModule_AppSetIdHelperFactory) factory).get(), (FinancialConnectionsConsumerSessionRepositoryImpl) provider.get(), (FinancialConnectionsSheetConfiguration) provider2.get());
            case 1:
                return new GetOrFetchSync((FinancialConnectionsManifestRepositoryImpl) provider3.get(), (FinancialConnectionsSheetConfiguration) provider.get(), (String) provider2.get(), (AppPreferenceStore) ((CameraModule_CameraStatsManagerFactory) factory).get());
            case 2:
                return new FinancialConnectionsRequestExecutor((DefaultStripeNetworkClient) provider3.get(), (ToolbarTuckTargets) ((SelfieDirectionFeed_Factory) factory).get(), (Json) provider.get(), (Logger$Companion$NOOP_LOGGER$1) provider2.get());
            case 3:
                return new FinancialConnectionsRepositoryImpl((FinancialConnectionsRequestExecutor) provider3.get(), (ProvideApiRequestOptions) provider.get(), (DefaultFraudDetectionDataRepository) ((CameraModule_CameraStatsManagerFactory) factory).get(), (ApiRequest.Factory) provider2.get());
            case 4:
                return new DefaultPaymentNextActionHandlerRegistry((NoOpIntentNextActionHandler) provider3.get(), (Map) ((MapFactory) provider).get(), ((Boolean) ((InstanceFactory) provider2).instance).booleanValue(), (Context) ((InstanceFactory) factory).instance);
            case 5:
                return new Stripe3DS2NextActionHandler((PaymentAuthConfig) provider3.get(), ((Boolean) ((InstanceFactory) provider).instance).booleanValue(), (Function0) ((InstanceFactory) provider2).instance, (Set) ((InstanceFactory) factory).instance);
            case 6:
                return new IntegrationWorkflow((Context) provider3.get(), (NavigationStateManager) provider.get(), (IntegrationBrowserWorker.Factory) ((InstanceFactory) factory).instance, (TrackingEventsLogger) provider2.get());
            case 7:
                return new RealFallbackModeManager((FallbackMode) provider3.get(), (ApiController) ((FeatureFlagManager_Factory) provider2).get(), (Environment) ((FallbackModeModule_EnvironmentFactory) factory).get(), (Moshi) provider.get());
            default:
                return new PermissionRequestWorkflow((Context) provider3.get(), (MarkwonImpl) ((DocumentCameraWorker_Factory) provider2).get(), (DeviceFeatureRequestWorkflow) ((DeviceFeatureRequestWorkflow_Factory) factory).get(), (TrackingEventsLogger) provider.get());
        }
    }

    public /* synthetic */ LookupAccount_Factory(Factory factory, Factory factory2, Provider provider, Provider provider2, int i) {
        this.$r8$classId = i;
        this.applicationProvider = factory;
        this.requestIntegrityTokenProvider = factory2;
        this.consumerSessionRepositoryProvider = provider;
        this.configurationProvider = provider2;
    }

    public /* synthetic */ LookupAccount_Factory(Factory factory, Provider provider, Factory factory2, Provider provider2, int i) {
        this.$r8$classId = i;
        this.applicationProvider = factory;
        this.consumerSessionRepositoryProvider = provider;
        this.requestIntegrityTokenProvider = factory2;
        this.configurationProvider = provider2;
    }

    public /* synthetic */ LookupAccount_Factory(Provider provider, Factory factory, Provider provider2, Factory factory2, int i) {
        this.$r8$classId = i;
        this.applicationProvider = provider;
        this.consumerSessionRepositoryProvider = factory;
        this.configurationProvider = provider2;
        this.requestIntegrityTokenProvider = factory2;
    }
}

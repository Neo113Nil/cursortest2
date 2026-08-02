package io.appmetrica.analytics.billing.internal;

import c3.C0292d;
import d3.u;
import io.appmetrica.analytics.billing.impl.A;
import io.appmetrica.analytics.billing.impl.B;
import io.appmetrica.analytics.billing.impl.m;
import io.appmetrica.analytics.billing.impl.p;
import io.appmetrica.analytics.billing.impl.q;
import io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class BillingServiceModuleEntryPoint extends ModuleServiceEntryPoint<RemoteBillingConfig> {

    /* renamed from: a, reason: collision with root package name */
    private m f9524a;

    /* renamed from: b, reason: collision with root package name */
    private final q f9525b = new q(null, null, 3, null);

    /* renamed from: c, reason: collision with root package name */
    private final p f9526c = new p(null, 1, null);

    /* renamed from: d, reason: collision with root package name */
    private final BillingServiceModuleEntryPoint$configUpdateListener$1 f9527d = new RemoteConfigUpdateListener<RemoteBillingConfig>() { // from class: io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
        public void onRemoteConfigUpdated(ModuleRemoteConfig<RemoteBillingConfig> moduleRemoteConfig) {
            m mVar;
            mVar = BillingServiceModuleEntryPoint.this.f9524a;
            if (mVar != null) {
                RemoteBillingConfig featuresConfig = moduleRemoteConfig.getFeaturesConfig();
                mVar.a(featuresConfig != null ? new B(featuresConfig.getEnabled(), new A(featuresConfig.getConfig())) : null);
            }
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final String f9528e = "billing";

    /* renamed from: f, reason: collision with root package name */
    private final BillingServiceModuleEntryPoint$remoteConfigExtensionConfiguration$1 f9529f = new RemoteConfigExtensionConfiguration<RemoteBillingConfig>() { // from class: io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint$remoteConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Map<String, Integer> getBlocks() {
            return u.A(new C0292d("aic", 1));
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public List<String> getFeatures() {
            return d3.q.f8333a;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public JsonParser<RemoteBillingConfig> getJsonParser() {
            q qVar;
            qVar = BillingServiceModuleEntryPoint.this.f9525b;
            return qVar;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Converter<RemoteBillingConfig, byte[]> getProtobufConverter() {
            p pVar;
            pVar = BillingServiceModuleEntryPoint.this.f9526c;
            return pVar;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public RemoteConfigUpdateListener<RemoteBillingConfig> getRemoteConfigUpdateListener() {
            BillingServiceModuleEntryPoint$configUpdateListener$1 billingServiceModuleEntryPoint$configUpdateListener$1;
            billingServiceModuleEntryPoint$configUpdateListener$1 = BillingServiceModuleEntryPoint.this.f9527d;
            return billingServiceModuleEntryPoint$configUpdateListener$1;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public String getIdentifier() {
        return this.f9528e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public RemoteConfigExtensionConfiguration<RemoteBillingConfig> getRemoteConfigExtensionConfiguration() {
        return this.f9529f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<RemoteBillingConfig> moduleRemoteConfig) {
        RemoteBillingConfig featuresConfig = moduleRemoteConfig.getFeaturesConfig();
        m mVar = new m(serviceContext, featuresConfig != null ? new B(featuresConfig.getEnabled(), new A(featuresConfig.getConfig())) : null);
        serviceContext.getServiceModuleReporterComponentLifecycle().subscribe(mVar);
        this.f9524a = mVar;
    }
}

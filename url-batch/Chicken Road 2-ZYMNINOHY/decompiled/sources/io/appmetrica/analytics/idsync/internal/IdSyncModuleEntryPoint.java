package io.appmetrica.analytics.idsync.internal;

import a.AbstractC0124a;
import c3.C0292d;
import d3.u;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.idsync.impl.C0465c;
import io.appmetrica.analytics.idsync.impl.C0466d;
import io.appmetrica.analytics.idsync.impl.C0467e;
import io.appmetrica.analytics.idsync.impl.h;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class IdSyncModuleEntryPoint extends ModuleServiceEntryPoint<IdSyncConfig> implements RemoteConfigUpdateListener<IdSyncConfig> {

    /* renamed from: a, reason: collision with root package name */
    private final C0466d f9974a;

    /* renamed from: b, reason: collision with root package name */
    private final C0465c f9975b;

    /* renamed from: c, reason: collision with root package name */
    private h f9976c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9977d;

    /* renamed from: e, reason: collision with root package name */
    private final IdSyncModuleEntryPoint$remoteConfigExtensionConfiguration$1 f9978e;

    /* JADX WARN: Type inference failed for: r0v2, types: [io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint$remoteConfigExtensionConfiguration$1] */
    public IdSyncModuleEntryPoint() {
        C0467e c0467e = new C0467e();
        this.f9974a = new C0466d(c0467e);
        this.f9975b = new C0465c(c0467e);
        this.f9977d = "id-sync";
        this.f9978e = new RemoteConfigExtensionConfiguration<IdSyncConfig>() { // from class: io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint$remoteConfigExtensionConfiguration$1
            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public Map<String, Integer> getBlocks() {
                return u.A(new C0292d("is", 1));
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public List<String> getFeatures() {
                return AbstractC0124a.H("is");
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public JsonParser<IdSyncConfig> getJsonParser() {
                C0465c c0465c;
                c0465c = IdSyncModuleEntryPoint.this.f9975b;
                return c0465c;
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public Converter<IdSyncConfig, byte[]> getProtobufConverter() {
                C0466d c0466d;
                c0466d = IdSyncModuleEntryPoint.this.f9974a;
                return c0466d;
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public RemoteConfigUpdateListener<IdSyncConfig> getRemoteConfigUpdateListener() {
                return IdSyncModuleEntryPoint.this;
            }
        };
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public String getIdentifier() {
        return this.f9977d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public RemoteConfigExtensionConfiguration<IdSyncConfig> getRemoteConfigExtensionConfiguration() {
        return this.f9978e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<IdSyncConfig> moduleRemoteConfig) {
        synchronized (this) {
            if (this.f9976c == null) {
                h hVar = new h(serviceContext, moduleRemoteConfig.getIdentifiers());
                this.f9976c = hVar;
                IdSyncConfig featuresConfig = moduleRemoteConfig.getFeaturesConfig();
                if (featuresConfig != null) {
                    hVar.a(featuresConfig, moduleRemoteConfig.getIdentifiers());
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
    public synchronized void onRemoteConfigUpdated(ModuleRemoteConfig<IdSyncConfig> moduleRemoteConfig) {
        h hVar;
        IdSyncConfig featuresConfig = moduleRemoteConfig.getFeaturesConfig();
        if (featuresConfig != null && (hVar = this.f9976c) != null) {
            hVar.a(featuresConfig, moduleRemoteConfig.getIdentifiers());
        }
    }
}

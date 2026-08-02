package io.appmetrica.analytics.idsync.internal;

import a.AbstractC0129a;
import b2.C0190d;
import c2.q;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.idsync.impl.c;
import io.appmetrica.analytics.idsync.impl.d;
import io.appmetrica.analytics.idsync.impl.e;
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
    private final d f5690a;

    /* renamed from: b, reason: collision with root package name */
    private final c f5691b;

    /* renamed from: c, reason: collision with root package name */
    private h f5692c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5693d;

    /* renamed from: e, reason: collision with root package name */
    private final IdSyncModuleEntryPoint$remoteConfigExtensionConfiguration$1 f5694e;

    /* JADX WARN: Type inference failed for: r0v2, types: [io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint$remoteConfigExtensionConfiguration$1] */
    public IdSyncModuleEntryPoint() {
        e eVar = new e();
        this.f5690a = new d(eVar);
        this.f5691b = new c(eVar);
        this.f5693d = "id-sync";
        this.f5694e = new RemoteConfigExtensionConfiguration<IdSyncConfig>() { // from class: io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint$remoteConfigExtensionConfiguration$1
            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public Map<String, Integer> getBlocks() {
                return q.a0(new C0190d("is", 1));
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public List<String> getFeatures() {
                return AbstractC0129a.r("is");
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public JsonParser<IdSyncConfig> getJsonParser() {
                c cVar;
                cVar = IdSyncModuleEntryPoint.this.f5691b;
                return cVar;
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public Converter<IdSyncConfig, byte[]> getProtobufConverter() {
                d dVar;
                dVar = IdSyncModuleEntryPoint.this.f5690a;
                return dVar;
            }

            @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
            public RemoteConfigUpdateListener<IdSyncConfig> getRemoteConfigUpdateListener() {
                return IdSyncModuleEntryPoint.this;
            }
        };
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public String getIdentifier() {
        return this.f5693d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public RemoteConfigExtensionConfiguration<IdSyncConfig> getRemoteConfigExtensionConfiguration() {
        return this.f5694e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<IdSyncConfig> moduleRemoteConfig) {
        synchronized (this) {
            if (this.f5692c == null) {
                h hVar = new h(serviceContext);
                this.f5692c = hVar;
                IdSyncConfig featuresConfig = moduleRemoteConfig.getFeaturesConfig();
                if (featuresConfig != null) {
                    hVar.b(featuresConfig);
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
    public synchronized void onRemoteConfigUpdated(ModuleRemoteConfig<IdSyncConfig> moduleRemoteConfig) {
        h hVar;
        IdSyncConfig featuresConfig = moduleRemoteConfig.getFeaturesConfig();
        if (featuresConfig != null && (hVar = this.f5692c) != null) {
            hVar.b(featuresConfig);
        }
    }
}

package io.appmetrica.analytics.remotepermissions.internal;

import c3.C0292d;
import d3.q;
import d3.s;
import d3.u;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.remotepermissions.impl.a;
import io.appmetrica.analytics.remotepermissions.impl.b;
import io.appmetrica.analytics.remotepermissions.impl.d;
import io.appmetrica.analytics.remotepermissions.impl.e;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class RemotePermissionsModuleEntryPoint extends ModuleServiceEntryPoint<a> implements AskForPermissionStrategyModuleProvider, RemoteConfigUpdateListener<a> {

    /* renamed from: a, reason: collision with root package name */
    private final d f13398a = new d();

    /* renamed from: b, reason: collision with root package name */
    private final b f13399b = new b();

    /* renamed from: c, reason: collision with root package name */
    private final RemotePermissionsModuleEntryPoint f13400c = this;

    /* renamed from: d, reason: collision with root package name */
    private final e f13401d = new e();

    /* renamed from: e, reason: collision with root package name */
    private final String f13402e = "rp";

    /* renamed from: f, reason: collision with root package name */
    private final RemotePermissionsModuleEntryPoint$remoteConfigExtensionConfiguration$1 f13403f = new RemoteConfigExtensionConfiguration<a>() { // from class: io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint$remoteConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Map<String, Integer> getBlocks() {
            return u.A(new C0292d("permissions", 1));
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public List<String> getFeatures() {
            return q.f8333a;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public JsonParser<a> getJsonParser() {
            JsonParser<a> jsonParser;
            jsonParser = RemotePermissionsModuleEntryPoint.this.f13398a;
            return jsonParser;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Converter<a, byte[]> getProtobufConverter() {
            Converter<a, byte[]> converter;
            converter = RemotePermissionsModuleEntryPoint.this.f13399b;
            return converter;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public RemoteConfigUpdateListener<a> getRemoteConfigUpdateListener() {
            RemoteConfigUpdateListener<a> remoteConfigUpdateListener;
            remoteConfigUpdateListener = RemotePermissionsModuleEntryPoint.this.f13400c;
            return remoteConfigUpdateListener;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    public PermissionStrategy getAskForPermissionStrategy() {
        return this.f13401d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public String getIdentifier() {
        return this.f13402e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public RemoteConfigExtensionConfiguration<a> getRemoteConfigExtensionConfiguration() {
        return this.f13403f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<a> moduleRemoteConfig) {
        Set set;
        e eVar = this.f13401d;
        a featuresConfig = moduleRemoteConfig.getFeaturesConfig();
        if (featuresConfig == null || (set = featuresConfig.f13389a) == null) {
            set = s.f8335a;
        }
        synchronized (eVar) {
            eVar.f13395a = set;
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
    public void onRemoteConfigUpdated(ModuleRemoteConfig<a> moduleRemoteConfig) {
        Set set;
        e eVar = this.f13401d;
        a featuresConfig = moduleRemoteConfig.getFeaturesConfig();
        if (featuresConfig == null || (set = featuresConfig.f13389a) == null) {
            set = s.f8335a;
        }
        synchronized (eVar) {
            eVar.f13395a = set;
        }
    }
}

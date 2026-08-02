package io.appmetrica.analytics.screenshot.internal;

import a.AbstractC0129a;
import android.os.Bundle;
import b2.C0190d;
import c2.q;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.screenshot.impl.D;
import io.appmetrica.analytics.screenshot.impl.J;
import io.appmetrica.analytics.screenshot.impl.K;
import io.appmetrica.analytics.screenshot.impl.L;
import io.appmetrica.analytics.screenshot.impl.j0;
import io.appmetrica.analytics.screenshot.impl.m0;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ScreenshotServiceModuleEntryPoint extends ModuleServiceEntryPoint<J> {

    /* renamed from: a, reason: collision with root package name */
    private j0 f9088a;

    /* renamed from: b, reason: collision with root package name */
    private final m0 f9089b = new m0();

    /* renamed from: c, reason: collision with root package name */
    private final L f9090c = new L(null, null, 3, null);

    /* renamed from: d, reason: collision with root package name */
    private final K f9091d = new K(null, 1, null);

    /* renamed from: e, reason: collision with root package name */
    private final ScreenshotServiceModuleEntryPoint$configUpdateListener$1 f9092e = new RemoteConfigUpdateListener<J>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
        public void onRemoteConfigUpdated(ModuleRemoteConfig<J> moduleRemoteConfig) {
            ScreenshotServiceModuleEntryPoint screenshotServiceModuleEntryPoint = ScreenshotServiceModuleEntryPoint.this;
            J featuresConfig = moduleRemoteConfig.getFeaturesConfig();
            screenshotServiceModuleEntryPoint.f9088a = featuresConfig != null ? new j0(featuresConfig) : null;
        }
    };
    private final String f = "screenshot";

    /* renamed from: g, reason: collision with root package name */
    private final ScreenshotServiceModuleEntryPoint$remoteConfigExtensionConfiguration$1 f9093g = new RemoteConfigExtensionConfiguration<J>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint$remoteConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Map<String, Integer> getBlocks() {
            return q.a0(new C0190d("scr", 1));
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public List<String> getFeatures() {
            return AbstractC0129a.r("scr");
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public JsonParser<J> getJsonParser() {
            L l3;
            l3 = ScreenshotServiceModuleEntryPoint.this.f9090c;
            return l3;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public Converter<J, byte[]> getProtobufConverter() {
            K k3;
            k3 = ScreenshotServiceModuleEntryPoint.this.f9091d;
            return k3;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        public RemoteConfigUpdateListener<J> getRemoteConfigUpdateListener() {
            ScreenshotServiceModuleEntryPoint$configUpdateListener$1 screenshotServiceModuleEntryPoint$configUpdateListener$1;
            screenshotServiceModuleEntryPoint$configUpdateListener$1 = ScreenshotServiceModuleEntryPoint.this.f9092e;
            return screenshotServiceModuleEntryPoint$configUpdateListener$1;
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private final ScreenshotServiceModuleEntryPoint$clientConfigProvider$1 f9094h = new ClientConfigProvider() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint$clientConfigProvider$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider
        public Bundle getConfigBundleForClient() {
            m0 m0Var;
            j0 j0Var;
            m0Var = ScreenshotServiceModuleEntryPoint.this.f9089b;
            j0Var = ScreenshotServiceModuleEntryPoint.this.f9088a;
            m0Var.getClass();
            if (j0Var == null) {
                return null;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("config", new D(j0Var));
            return bundle;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public ClientConfigProvider getClientConfigProvider() {
        return this.f9094h;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public String getIdentifier() {
        return this.f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public RemoteConfigExtensionConfiguration<J> getRemoteConfigExtensionConfiguration() {
        return this.f9093g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(ServiceContext serviceContext, ModuleRemoteConfig<J> moduleRemoteConfig) {
        J featuresConfig = moduleRemoteConfig.getFeaturesConfig();
        this.f9088a = featuresConfig != null ? new j0(featuresConfig) : null;
    }
}

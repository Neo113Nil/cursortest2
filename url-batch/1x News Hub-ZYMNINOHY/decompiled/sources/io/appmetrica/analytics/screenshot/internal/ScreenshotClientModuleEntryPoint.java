package io.appmetrica.analytics.screenshot.internal;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.screenshot.impl.C1025h;
import io.appmetrica.analytics.screenshot.impl.C1029l;
import io.appmetrica.analytics.screenshot.impl.C1030m;
import io.appmetrica.analytics.screenshot.impl.C1039w;
import io.appmetrica.analytics.screenshot.impl.C1040x;
import io.appmetrica.analytics.screenshot.impl.D;
import io.appmetrica.analytics.screenshot.impl.F;
import io.appmetrica.analytics.screenshot.impl.I;
import io.appmetrica.analytics.screenshot.impl.T;
import io.appmetrica.analytics.screenshot.impl.V;
import java.util.Iterator;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class ScreenshotClientModuleEntryPoint extends ModuleClientEntryPoint<D> {

    /* renamed from: a, reason: collision with root package name */
    private C1029l f9081a;

    /* renamed from: d, reason: collision with root package name */
    private V f9084d;

    /* renamed from: b, reason: collision with root package name */
    private final C1025h f9082b = new C1025h();

    /* renamed from: c, reason: collision with root package name */
    private final ScreenshotClientModuleEntryPoint$configUpdateListener$1 f9083c = new ServiceConfigUpdateListener<D>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener
        public void onServiceConfigUpdated(ModuleServiceConfig<D> moduleServiceConfig) {
            C1029l c1029l;
            V v;
            V v3;
            C1029l c1029l2;
            ScreenshotClientModuleEntryPoint screenshotClientModuleEntryPoint = ScreenshotClientModuleEntryPoint.this;
            synchronized (screenshotClientModuleEntryPoint) {
                try {
                    D featuresConfig = moduleServiceConfig.getFeaturesConfig();
                    if (featuresConfig != null) {
                        boolean b3 = featuresConfig.b();
                        F a3 = featuresConfig.a();
                        c1029l = new C1029l(b3, a3 != null ? new C1030m(a3) : null);
                    } else {
                        c1029l = null;
                    }
                    screenshotClientModuleEntryPoint.f9081a = c1029l;
                    v = screenshotClientModuleEntryPoint.f9084d;
                    if (v != null) {
                        v3 = screenshotClientModuleEntryPoint.f9084d;
                        if (v3 == null) {
                            j.g("screenshotCaptorsController");
                            throw null;
                        }
                        c1029l2 = screenshotClientModuleEntryPoint.f9081a;
                        v3.a(c1029l2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final String f9085e = "screenshot";
    private final ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1 f = new ServiceConfigExtensionConfiguration<D>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        public BundleToServiceConfigConverter<D> getBundleConverter() {
            C1025h c1025h;
            c1025h = ScreenshotClientModuleEntryPoint.this.f9082b;
            return c1025h;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        public ServiceConfigUpdateListener<D> getServiceConfigUpdateListener() {
            ScreenshotClientModuleEntryPoint$configUpdateListener$1 screenshotClientModuleEntryPoint$configUpdateListener$1;
            screenshotClientModuleEntryPoint$configUpdateListener$1 = ScreenshotClientModuleEntryPoint.this.f9083c;
            return screenshotClientModuleEntryPoint$configUpdateListener$1;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public String getIdentifier() {
        return this.f9085e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public ServiceConfigExtensionConfiguration<D> getServiceConfigExtensionConfiguration() {
        return this.f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(ClientContext clientContext) {
        synchronized (this) {
            try {
                C1040x c1040x = new C1040x(clientContext);
                this.f9084d = new V(AndroidUtils.isApiAchieved(34) ? new C1039w(clientContext, c1040x) : new I(clientContext, c1040x));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void onActivated() {
        synchronized (this) {
            try {
                V v = this.f9084d;
                if (v != null) {
                    C1029l c1029l = this.f9081a;
                    Iterator it = v.f9011a.iterator();
                    while (it.hasNext()) {
                        ((T) it.next()).a();
                    }
                    v.a(c1029l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

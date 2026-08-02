package io.appmetrica.analytics.screenshot.internal;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.screenshot.impl.C1150h;
import io.appmetrica.analytics.screenshot.impl.C1154l;
import io.appmetrica.analytics.screenshot.impl.C1155m;
import io.appmetrica.analytics.screenshot.impl.C1164w;
import io.appmetrica.analytics.screenshot.impl.C1165x;
import io.appmetrica.analytics.screenshot.impl.D;
import io.appmetrica.analytics.screenshot.impl.F;
import io.appmetrica.analytics.screenshot.impl.I;
import io.appmetrica.analytics.screenshot.impl.T;
import io.appmetrica.analytics.screenshot.impl.V;
import java.util.Iterator;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class ScreenshotClientModuleEntryPoint extends ModuleClientEntryPoint<D> {

    /* renamed from: a, reason: collision with root package name */
    private C1154l f13511a;

    /* renamed from: d, reason: collision with root package name */
    private V f13514d;

    /* renamed from: b, reason: collision with root package name */
    private final C1150h f13512b = new C1150h();

    /* renamed from: c, reason: collision with root package name */
    private final ScreenshotClientModuleEntryPoint$configUpdateListener$1 f13513c = new ServiceConfigUpdateListener<D>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener
        public void onServiceConfigUpdated(ModuleServiceConfig<D> moduleServiceConfig) {
            C1154l c1154l;
            V v;
            V v4;
            C1154l c1154l2;
            ScreenshotClientModuleEntryPoint screenshotClientModuleEntryPoint = ScreenshotClientModuleEntryPoint.this;
            synchronized (screenshotClientModuleEntryPoint) {
                try {
                    D featuresConfig = moduleServiceConfig.getFeaturesConfig();
                    if (featuresConfig != null) {
                        boolean b4 = featuresConfig.b();
                        F a3 = featuresConfig.a();
                        c1154l = new C1154l(b4, a3 != null ? new C1155m(a3) : null);
                    } else {
                        c1154l = null;
                    }
                    screenshotClientModuleEntryPoint.f13511a = c1154l;
                    v = screenshotClientModuleEntryPoint.f13514d;
                    if (v != null) {
                        v4 = screenshotClientModuleEntryPoint.f13514d;
                        if (v4 == null) {
                            i.i("screenshotCaptorsController");
                            throw null;
                        }
                        c1154l2 = screenshotClientModuleEntryPoint.f13511a;
                        v4.a(c1154l2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final String f13515e = "screenshot";

    /* renamed from: f, reason: collision with root package name */
    private final ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1 f13516f = new ServiceConfigExtensionConfiguration<D>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        public BundleToServiceConfigConverter<D> getBundleConverter() {
            C1150h c1150h;
            c1150h = ScreenshotClientModuleEntryPoint.this.f13512b;
            return c1150h;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        public ServiceConfigUpdateListener<D> getServiceConfigUpdateListener() {
            ScreenshotClientModuleEntryPoint$configUpdateListener$1 screenshotClientModuleEntryPoint$configUpdateListener$1;
            screenshotClientModuleEntryPoint$configUpdateListener$1 = ScreenshotClientModuleEntryPoint.this.f13513c;
            return screenshotClientModuleEntryPoint$configUpdateListener$1;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public String getIdentifier() {
        return this.f13515e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public ServiceConfigExtensionConfiguration<D> getServiceConfigExtensionConfiguration() {
        return this.f13516f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(ClientContext clientContext) {
        synchronized (this) {
            try {
                C1165x c1165x = new C1165x(clientContext);
                this.f13514d = new V(AndroidUtils.isApiAchieved(34) ? new C1164w(clientContext, c1165x) : new I(clientContext, c1165x));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void onActivated() {
        synchronized (this) {
            try {
                V v = this.f13514d;
                if (v != null) {
                    C1154l c1154l = this.f13511a;
                    Iterator it = v.f13440a.iterator();
                    while (it.hasNext()) {
                        ((T) it.next()).a();
                    }
                    v.a(c1154l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

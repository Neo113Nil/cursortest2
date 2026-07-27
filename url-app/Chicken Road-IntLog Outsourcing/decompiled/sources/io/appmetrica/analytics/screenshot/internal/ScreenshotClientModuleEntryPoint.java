package io.appmetrica.analytics.screenshot.internal;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.screenshot.impl.C1176h;
import io.appmetrica.analytics.screenshot.impl.C1180l;
import io.appmetrica.analytics.screenshot.impl.C1181m;
import io.appmetrica.analytics.screenshot.impl.C1190w;
import io.appmetrica.analytics.screenshot.impl.C1191x;
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
    private C1180l f10062a;

    /* renamed from: d, reason: collision with root package name */
    private V f10065d;

    /* renamed from: b, reason: collision with root package name */
    private final C1176h f10063b = new C1176h();

    /* renamed from: c, reason: collision with root package name */
    private final ScreenshotClientModuleEntryPoint$configUpdateListener$1 f10064c = new ServiceConfigUpdateListener<D>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener
        public void onServiceConfigUpdated(ModuleServiceConfig<D> moduleServiceConfig) {
            C1180l c1180l;
            V v4;
            V v5;
            C1180l c1180l2;
            ScreenshotClientModuleEntryPoint screenshotClientModuleEntryPoint = ScreenshotClientModuleEntryPoint.this;
            synchronized (screenshotClientModuleEntryPoint) {
                try {
                    D featuresConfig = moduleServiceConfig.getFeaturesConfig();
                    if (featuresConfig != null) {
                        boolean b6 = featuresConfig.b();
                        F a6 = featuresConfig.a();
                        c1180l = new C1180l(b6, a6 != null ? new C1181m(a6) : null);
                    } else {
                        c1180l = null;
                    }
                    screenshotClientModuleEntryPoint.f10062a = c1180l;
                    v4 = screenshotClientModuleEntryPoint.f10065d;
                    if (v4 != null) {
                        v5 = screenshotClientModuleEntryPoint.f10065d;
                        if (v5 == null) {
                            i.l("screenshotCaptorsController");
                            throw null;
                        }
                        c1180l2 = screenshotClientModuleEntryPoint.f10062a;
                        v5.a(c1180l2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final String f10066e = "screenshot";

    /* renamed from: f, reason: collision with root package name */
    private final ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1 f10067f = new ServiceConfigExtensionConfiguration<D>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        public BundleToServiceConfigConverter<D> getBundleConverter() {
            C1176h c1176h;
            c1176h = ScreenshotClientModuleEntryPoint.this.f10063b;
            return c1176h;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        public ServiceConfigUpdateListener<D> getServiceConfigUpdateListener() {
            ScreenshotClientModuleEntryPoint$configUpdateListener$1 screenshotClientModuleEntryPoint$configUpdateListener$1;
            screenshotClientModuleEntryPoint$configUpdateListener$1 = ScreenshotClientModuleEntryPoint.this.f10064c;
            return screenshotClientModuleEntryPoint$configUpdateListener$1;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public String getIdentifier() {
        return this.f10066e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public ServiceConfigExtensionConfiguration<D> getServiceConfigExtensionConfiguration() {
        return this.f10067f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(ClientContext clientContext) {
        synchronized (this) {
            try {
                C1191x c1191x = new C1191x(clientContext);
                this.f10065d = new V(AndroidUtils.isApiAchieved(34) ? new C1190w(clientContext, c1191x) : new I(clientContext, c1191x));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void onActivated() {
        synchronized (this) {
            try {
                V v4 = this.f10065d;
                if (v4 != null) {
                    C1180l c1180l = this.f10062a;
                    Iterator it = v4.f9991a.iterator();
                    while (it.hasNext()) {
                        ((T) it.next()).a();
                    }
                    v4.a(c1180l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package io.appmetrica.analytics.screenshot.internal;

import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.screenshot.impl.B;
import io.appmetrica.analytics.screenshot.impl.C3158d;
import io.appmetrica.analytics.screenshot.impl.C3162h;
import io.appmetrica.analytics.screenshot.impl.C3165k;
import io.appmetrica.analytics.screenshot.impl.C3166l;
import io.appmetrica.analytics.screenshot.impl.C3174u;
import io.appmetrica.analytics.screenshot.impl.C3175v;
import io.appmetrica.analytics.screenshot.impl.D;
import io.appmetrica.analytics.screenshot.impl.P;
import io.appmetrica.analytics.screenshot.impl.S;
import io.appmetrica.analytics.screenshot.impl.d0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class ScreenshotClientModuleEntryPoint extends ModuleClientEntryPoint<B> {

    /* renamed from: a, reason: collision with root package name */
    private C3165k f40791a;

    /* renamed from: d, reason: collision with root package name */
    private S f40794d;

    /* renamed from: b, reason: collision with root package name */
    private final C3162h f40792b = new C3162h();

    /* renamed from: c, reason: collision with root package name */
    private final ScreenshotClientModuleEntryPoint$configUpdateListener$1 f40793c = new ServiceConfigUpdateListener<B>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener
        public void onServiceConfigUpdated(@NotNull ModuleServiceConfig<B> moduleServiceConfig) {
            C3165k c3165k;
            S s4;
            S s5;
            C3165k c3165k2;
            ScreenshotClientModuleEntryPoint screenshotClientModuleEntryPoint = ScreenshotClientModuleEntryPoint.this;
            synchronized (screenshotClientModuleEntryPoint) {
                try {
                    B featuresConfig = moduleServiceConfig.getFeaturesConfig();
                    S s6 = null;
                    if (featuresConfig != null) {
                        boolean b4 = featuresConfig.b();
                        D a4 = featuresConfig.a();
                        c3165k = new C3165k(b4, a4 != null ? new C3166l(a4) : null);
                    } else {
                        c3165k = null;
                    }
                    screenshotClientModuleEntryPoint.f40791a = c3165k;
                    s4 = screenshotClientModuleEntryPoint.f40794d;
                    if (s4 != null) {
                        s5 = screenshotClientModuleEntryPoint.f40794d;
                        if (s5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("screenshotCaptorsController");
                        } else {
                            s6 = s5;
                        }
                        c3165k2 = screenshotClientModuleEntryPoint.f40791a;
                        s6.a(c3165k2);
                    }
                    Unit unit = Unit.f41027a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final String f40795e = "screenshot";

    /* renamed from: f, reason: collision with root package name */
    private final ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1 f40796f = new ServiceConfigExtensionConfiguration<B>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        @NotNull
        public BundleToServiceConfigConverter<B> getBundleConverter() {
            C3162h c3162h;
            c3162h = ScreenshotClientModuleEntryPoint.this.f40792b;
            return c3162h;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        @NotNull
        public ServiceConfigUpdateListener<B> getServiceConfigUpdateListener() {
            ScreenshotClientModuleEntryPoint$configUpdateListener$1 screenshotClientModuleEntryPoint$configUpdateListener$1;
            screenshotClientModuleEntryPoint$configUpdateListener$1 = ScreenshotClientModuleEntryPoint.this.f40793c;
            return screenshotClientModuleEntryPoint$configUpdateListener$1;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    @NotNull
    public String getIdentifier() {
        return this.f40795e;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    @NotNull
    public ServiceConfigExtensionConfiguration<B> getServiceConfigExtensionConfiguration() {
        return this.f40796f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(@NotNull ClientContext clientContext) {
        synchronized (this) {
            C3175v c3175v = new C3175v(clientContext);
            this.f40794d = new S(CollectionsKt.listOf((Object[]) new P[]{new C3158d(clientContext, c3175v), new d0(clientContext, c3175v), new C3174u(clientContext, c3175v)}));
            Unit unit = Unit.f41027a;
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void onActivated() {
        synchronized (this) {
            try {
                S s4 = this.f40794d;
                if (s4 != null) {
                    C3165k c3165k = this.f40791a;
                    Iterator it = s4.f40719a.iterator();
                    while (it.hasNext()) {
                        ((P) it.next()).a();
                    }
                    s4.a(c3165k);
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

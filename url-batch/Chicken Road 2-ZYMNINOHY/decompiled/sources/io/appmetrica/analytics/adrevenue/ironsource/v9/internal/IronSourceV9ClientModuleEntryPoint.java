package io.appmetrica.analytics.adrevenue.ironsource.v9.internal;

import com.unity3d.mediation.LevelPlay;
import io.appmetrica.analytics.adrevenue.ironsource.v9.impl.c;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class IronSourceV9ClientModuleEntryPoint extends ModuleClientEntryPoint<Object> {

    /* renamed from: a, reason: collision with root package name */
    private ClientContext f9432a = null;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f9433b = new AtomicBoolean(false);

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public AdRevenueCollector getAdRevenueCollector() {
        return new a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public String getIdentifier() {
        return "ad-revenue-ironsource-v9";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(ClientContext clientContext) {
        this.f9432a = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void onActivated() {
        ClientContext clientContext;
        if (!ReflectionUtils.detectClassExists("com.unity3d.mediation.LevelPlay") || (clientContext = this.f9432a) == null) {
            return;
        }
        LevelPlay.addImpressionDataListener(new c(clientContext));
        this.f9433b.set(true);
    }
}

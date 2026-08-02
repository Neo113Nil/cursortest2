package io.appmetrica.analytics.coreutils.internal.services;

import c3.C0295g;
import c3.InterfaceC0291c;
import io.appmetrica.analytics.coreutils.impl.l;

/* loaded from: classes.dex */
public final class UtilityServiceProvider {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0291c f9766a = new C0295g(new l(this));

    /* renamed from: b, reason: collision with root package name */
    private final WaitForActivationDelayBarrier f9767b = new WaitForActivationDelayBarrier();

    public final WaitForActivationDelayBarrier getActivationBarrier() {
        return this.f9767b;
    }

    public final FirstExecutionConditionServiceImpl getFirstExecutionService() {
        return (FirstExecutionConditionServiceImpl) ((C0295g) this.f9766a).a();
    }

    public final void initAsync() {
        this.f9767b.activate();
    }

    public final void updateConfiguration(UtilityServiceConfiguration utilityServiceConfiguration) {
        getFirstExecutionService().updateConfig(utilityServiceConfiguration);
    }
}

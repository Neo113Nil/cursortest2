package io.appmetrica.analytics.coreutils.internal.services;

import b2.C0193g;
import b2.InterfaceC0189c;
import io.appmetrica.analytics.coreutils.impl.l;

/* loaded from: classes.dex */
public final class UtilityServiceProvider {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0189c f5512a = new C0193g(new l(this));

    /* renamed from: b, reason: collision with root package name */
    private final WaitForActivationDelayBarrier f5513b = new WaitForActivationDelayBarrier();

    public final WaitForActivationDelayBarrier getActivationBarrier() {
        return this.f5513b;
    }

    public final FirstExecutionConditionServiceImpl getFirstExecutionService() {
        return (FirstExecutionConditionServiceImpl) ((C0193g) this.f5512a).a();
    }

    public final void initAsync() {
        this.f5513b.activate();
    }

    public final void updateConfiguration(UtilityServiceConfiguration utilityServiceConfiguration) {
        getFirstExecutionService().updateConfig(utilityServiceConfiguration);
    }
}

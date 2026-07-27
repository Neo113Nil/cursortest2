package io.appmetrica.analytics.coreutils.internal.services;

import a.AbstractC0169a;
import f4.InterfaceC0428e;
import io.appmetrica.analytics.coreutils.impl.l;

/* loaded from: classes.dex */
public final class UtilityServiceProvider {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0428e f6277a = AbstractC0169a.A(new l(this));

    /* renamed from: b, reason: collision with root package name */
    private final WaitForActivationDelayBarrier f6278b = new WaitForActivationDelayBarrier();

    public final WaitForActivationDelayBarrier getActivationBarrier() {
        return this.f6278b;
    }

    public final FirstExecutionConditionServiceImpl getFirstExecutionService() {
        return (FirstExecutionConditionServiceImpl) this.f6277a.getValue();
    }

    public final void initAsync() {
        this.f6278b.activate();
    }

    public final void updateConfiguration(UtilityServiceConfiguration utilityServiceConfiguration) {
        getFirstExecutionService().updateConfig(utilityServiceConfiguration);
    }
}

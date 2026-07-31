package io.appmetrica.analytics.coreutils.internal.services;

import W1.h;
import W1.i;
import io.appmetrica.analytics.coreutils.impl.l;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class UtilityServiceProvider {

    /* renamed from: a, reason: collision with root package name */
    private final h f37051a = i.b(new l(this));

    /* renamed from: b, reason: collision with root package name */
    private final WaitForActivationDelayBarrier f37052b = new WaitForActivationDelayBarrier();

    @NotNull
    public final WaitForActivationDelayBarrier getActivationBarrier() {
        return this.f37052b;
    }

    @NotNull
    public final FirstExecutionConditionServiceImpl getFirstExecutionService() {
        return (FirstExecutionConditionServiceImpl) this.f37051a.getValue();
    }

    public final void initAsync() {
        this.f37052b.activate();
    }

    public final void updateConfiguration(@NotNull UtilityServiceConfiguration utilityServiceConfiguration) {
        getFirstExecutionService().updateConfig(utilityServiceConfiguration);
    }
}

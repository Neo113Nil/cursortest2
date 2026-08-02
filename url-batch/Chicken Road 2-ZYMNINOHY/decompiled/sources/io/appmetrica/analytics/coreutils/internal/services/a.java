package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;

/* loaded from: classes.dex */
public final class a implements ActivationBarrierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f9773a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WaitForActivationDelayBarrier.ActivationBarrierHelper f9774b;

    public a(WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, Runnable runnable) {
        this.f9774b = activationBarrierHelper;
        this.f9773a = runnable;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        this.f9774b.f9770a = true;
        this.f9773a.run();
    }
}

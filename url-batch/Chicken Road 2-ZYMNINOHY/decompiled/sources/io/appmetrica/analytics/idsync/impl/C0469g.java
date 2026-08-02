package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;

/* renamed from: io.appmetrica.analytics.idsync.impl.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0469g implements ActivationBarrierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f9914a;

    public C0469g(h hVar) {
        this.f9914a = hVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        C0468f c0468f = this.f9914a.f9921g;
        if (c0468f != null) {
            c0468f.run();
        } else {
            kotlin.jvm.internal.i.i("syncRunnable");
            throw null;
        }
    }
}

package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.idsync.impl.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0030g implements ActivationBarrierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f733a;

    public C0030g(h hVar) {
        this.f733a = hVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        C0029f c0029f = this.f733a.g;
        if (c0029f == null) {
            Intrinsics.throwUninitializedPropertyAccessException("syncRunnable");
            c0029f = null;
        }
        c0029f.run();
    }
}

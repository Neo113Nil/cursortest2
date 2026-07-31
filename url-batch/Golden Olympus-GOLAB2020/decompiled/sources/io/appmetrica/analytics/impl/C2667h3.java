package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.h3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2667h3 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProductInfo f39120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2693i3 f39121b;

    public C2667h3(C2693i3 c2693i3, ProductInfo productInfo) {
        this.f39121b = c2693i3;
        this.f39120a = productInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        ((C2953s5) this.f39121b.f39169a).a(C2773l6.a(new Tf(this.f39120a)));
    }
}

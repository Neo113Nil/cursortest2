package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* renamed from: io.appmetrica.analytics.screenshot.impl.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0709v implements T {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f1746a;
    public final U b;
    public volatile C0699k c;
    public final Z d;

    public C0709v(ClientContext clientContext, U u) {
        this.f1746a = clientContext;
        this.b = u;
        this.d = new Z(clientContext, new C0706s(this));
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C0701m c0701m) {
        this.c = c0701m != null ? c0701m.c : null;
        this.d.c = this.c;
    }

    public final String b() {
        return "ContentObserverScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f1746a.getActivityLifecycleRegistry().registerListener(new C0708u(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}

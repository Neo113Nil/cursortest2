package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* renamed from: io.appmetrica.analytics.screenshot.impl.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1038v implements T {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f9073a;

    /* renamed from: b, reason: collision with root package name */
    public final U f9074b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C1028k f9075c;

    /* renamed from: d, reason: collision with root package name */
    public final Z f9076d;

    public C1038v(ClientContext clientContext, U u3) {
        this.f9073a = clientContext;
        this.f9074b = u3;
        this.f9076d = new Z(clientContext, new C1035s(this));
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C1030m c1030m) {
        this.f9075c = c1030m != null ? c1030m.f9062c : null;
        this.f9076d.f9024c = this.f9075c;
    }

    public final String b() {
        return "ContentObserverScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f9073a.getActivityLifecycleRegistry().registerListener(new C1037u(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}

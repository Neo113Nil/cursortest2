package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* renamed from: io.appmetrica.analytics.screenshot.impl.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1163v implements T {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f13503a;

    /* renamed from: b, reason: collision with root package name */
    public final U f13504b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C1153k f13505c;

    /* renamed from: d, reason: collision with root package name */
    public final Z f13506d;

    public C1163v(ClientContext clientContext, U u4) {
        this.f13503a = clientContext;
        this.f13504b = u4;
        this.f13506d = new Z(clientContext, new C1160s(this));
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C1155m c1155m) {
        this.f13505c = c1155m != null ? c1155m.f13492c : null;
        this.f13506d.f13453c = this.f13505c;
    }

    public final String b() {
        return "ContentObserverScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f13503a.getActivityLifecycleRegistry().registerListener(new C1162u(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}

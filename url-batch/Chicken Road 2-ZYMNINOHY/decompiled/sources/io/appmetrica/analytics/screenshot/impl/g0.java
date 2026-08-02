package io.appmetrica.analytics.screenshot.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* loaded from: classes.dex */
public final class g0 implements T {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f13467a;

    /* renamed from: b, reason: collision with root package name */
    public final U f13468b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f13469c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f13470d;

    /* renamed from: e, reason: collision with root package name */
    public volatile C1156n f13471e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f13472f = new d0(this);

    public g0(ClientContext clientContext, U u4) {
        this.f13467a = clientContext;
        this.f13468b = u4;
        this.f13469c = clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler();
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C1155m c1155m) {
        this.f13471e = c1155m != null ? c1155m.f13491b : null;
    }

    public final String b() {
        return "ServiceScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f13467a.getActivityLifecycleRegistry().registerListener(new f0(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}

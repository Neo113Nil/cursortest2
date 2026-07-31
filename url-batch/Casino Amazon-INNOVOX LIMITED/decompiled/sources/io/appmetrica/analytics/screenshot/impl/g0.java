package io.appmetrica.analytics.screenshot.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* loaded from: classes3.dex */
public final class g0 implements T {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f1730a;
    public final U b;
    public final Handler c;
    public volatile boolean d;
    public volatile C0702n e;
    public final d0 f = new d0(this);

    public g0(ClientContext clientContext, U u) {
        this.f1730a = clientContext;
        this.b = u;
        this.c = clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler();
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C0701m c0701m) {
        this.e = c0701m != null ? c0701m.b : null;
    }

    public final String b() {
        return "ServiceScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f1730a.getActivityLifecycleRegistry().registerListener(new f0(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}

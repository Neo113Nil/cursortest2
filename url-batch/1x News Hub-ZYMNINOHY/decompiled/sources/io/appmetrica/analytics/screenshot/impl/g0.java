package io.appmetrica.analytics.screenshot.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* loaded from: classes.dex */
public final class g0 implements T {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f9038a;

    /* renamed from: b, reason: collision with root package name */
    public final U f9039b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f9040c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f9041d;

    /* renamed from: e, reason: collision with root package name */
    public volatile C1031n f9042e;
    public final d0 f = new d0(this);

    public g0(ClientContext clientContext, U u3) {
        this.f9038a = clientContext;
        this.f9039b = u3;
        this.f9040c = clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler();
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C1030m c1030m) {
        this.f9042e = c1030m != null ? c1030m.f9061b : null;
    }

    public final String b() {
        return "ServiceScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f9038a.getActivityLifecycleRegistry().registerListener(new f0(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}

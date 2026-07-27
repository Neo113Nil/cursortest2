package io.appmetrica.analytics.screenshot.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* loaded from: classes.dex */
public final class g0 implements T {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f10018a;

    /* renamed from: b, reason: collision with root package name */
    public final U f10019b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f10020c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f10021d;

    /* renamed from: e, reason: collision with root package name */
    public volatile C1182n f10022e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f10023f = new d0(this);

    public g0(ClientContext clientContext, U u5) {
        this.f10018a = clientContext;
        this.f10019b = u5;
        this.f10020c = clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler();
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C1181m c1181m) {
        this.f10022e = c1181m != null ? c1181m.f10042b : null;
    }

    public final String b() {
        return "ServiceScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f10018a.getActivityLifecycleRegistry().registerListener(new f0(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}

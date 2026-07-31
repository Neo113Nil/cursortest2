package io.appmetrica.analytics.screenshot.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class d0 implements P {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f40745a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f40746b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f40747c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f40748d;

    /* renamed from: e, reason: collision with root package name */
    public volatile C3167m f40749e;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f40750f = new a0(this);

    public d0(@NotNull ClientContext clientContext, @NotNull Q q4) {
        this.f40745a = clientContext;
        this.f40746b = q4;
        this.f40747c = clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler();
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a(@Nullable C3166l c3166l) {
        this.f40749e = c3166l != null ? c3166l.f40770b : null;
    }

    @NotNull
    public final String b() {
        return "ServiceScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a() {
        this.f40745a.getActivityLifecycleRegistry().registerListener(new c0(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}

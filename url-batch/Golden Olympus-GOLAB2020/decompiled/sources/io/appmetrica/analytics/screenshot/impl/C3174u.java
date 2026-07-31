package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.screenshot.impl.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3174u implements P {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f40782a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f40783b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C3164j f40784c;

    /* renamed from: d, reason: collision with root package name */
    public final W f40785d;

    public C3174u(@NotNull ClientContext clientContext, @NotNull Q q4) {
        this.f40782a = clientContext;
        this.f40783b = q4;
        this.f40785d = new W(clientContext, new r(this));
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a(@Nullable C3166l c3166l) {
        this.f40784c = c3166l != null ? c3166l.f40771c : null;
        this.f40785d.f40732c = this.f40784c;
    }

    @NotNull
    public final String b() {
        return "ContentObserverScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.P
    public final void a() {
        this.f40782a.getActivityLifecycleRegistry().registerListener(new C3173t(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}

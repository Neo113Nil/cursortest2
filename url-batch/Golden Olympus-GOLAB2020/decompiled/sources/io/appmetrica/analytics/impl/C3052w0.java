package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3052w0 implements Rc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3078x0 f39995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMetricaConfig f39996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PublicLogger f39997c;

    public C3052w0(C3078x0 c3078x0, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f39995a = c3078x0;
        this.f39996b = appMetricaConfig;
        this.f39997c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.Rc
    @NotNull
    public final Cc a() {
        C3078x0 c3078x0 = this.f39995a;
        return c3078x0.f40107g.a(this.f39996b, this.f39997c, c3078x0.f40109i.f38609g);
    }
}

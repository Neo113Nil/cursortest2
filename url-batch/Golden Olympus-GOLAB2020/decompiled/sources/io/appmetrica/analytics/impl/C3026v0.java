package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3026v0 implements Rc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3078x0 f39953a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMetricaConfig f39954b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PublicLogger f39955c;

    public C3026v0(C3078x0 c3078x0, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f39953a = c3078x0;
        this.f39954b = appMetricaConfig;
        this.f39955c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.Rc
    @NotNull
    public final Cc a() {
        C3078x0 c3078x0 = this.f39953a;
        return c3078x0.f40107g.b(this.f39954b, this.f39955c, c3078x0.f40109i.f38609g);
    }
}

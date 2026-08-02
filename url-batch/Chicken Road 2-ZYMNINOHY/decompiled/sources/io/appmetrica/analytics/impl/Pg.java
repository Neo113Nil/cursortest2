package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes.dex */
public class Pg extends AbstractCallableC1083xh {

    /* renamed from: e, reason: collision with root package name */
    public final C1031vh f10821e;

    public Pg(C0859p0 c0859p0, Zk zk, C1031vh c1031vh) {
        super(c0859p0, zk);
        this.f10821e = c1031vh;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC1083xh
    public final void a(Throwable th) {
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC1083xh
    public final void a(IAppMetricaService iAppMetricaService) {
        C1031vh c1031vh = this.f10821e;
        iAppMetricaService.reportData(c1031vh.f12895c, c1031vh.f12893a.d(c1031vh.f12897e.c()));
    }
}

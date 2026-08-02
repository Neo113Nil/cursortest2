package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes.dex */
public final class Nn extends AbstractCallableC1083xh {

    /* renamed from: e, reason: collision with root package name */
    public final int f10729e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f10730f;

    public Nn(C0859p0 c0859p0, Zk zk, int i4, Bundle bundle) {
        super(c0859p0, zk);
        this.f10729e = i4;
        this.f10730f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC1083xh
    public final void a(IAppMetricaService iAppMetricaService) {
        iAppMetricaService.reportData(this.f10729e, this.f10730f);
    }
}

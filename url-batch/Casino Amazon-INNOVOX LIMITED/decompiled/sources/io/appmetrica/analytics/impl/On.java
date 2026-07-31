package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes3.dex */
public final class On extends AbstractCallableC0657yh {
    public final int e;
    public final Bundle f;

    public On(C0416p0 c0416p0, InterfaceC0053al interfaceC0053al, int i, Bundle bundle) {
        super(c0416p0, interfaceC0053al);
        this.e = i;
        this.f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0657yh
    public final void a(IAppMetricaService iAppMetricaService) {
        iAppMetricaService.reportData(this.e, this.f);
    }
}

package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes3.dex */
public final class Fi extends AbstractCallableC0657yh {
    public final Cf e;

    public Fi(C0416p0 c0416p0, InterfaceC0053al interfaceC0053al, Cf cf) {
        super(c0416p0, interfaceC0053al);
        this.e = cf;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0657yh
    public final void a(IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        Cf cf = this.e;
        synchronized (cf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", cf);
        }
        iAppMetricaService.resumeUserSession(bundle);
    }
}

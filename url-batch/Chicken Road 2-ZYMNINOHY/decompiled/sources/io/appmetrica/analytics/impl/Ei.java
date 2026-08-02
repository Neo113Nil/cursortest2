package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes.dex */
public final class Ei extends AbstractCallableC1083xh {

    /* renamed from: e, reason: collision with root package name */
    public final Bf f10258e;

    public Ei(C0859p0 c0859p0, Zk zk, Bf bf) {
        super(c0859p0, zk);
        this.f10258e = bf;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC1083xh
    public final void a(IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        Bf bf = this.f10258e;
        synchronized (bf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", bf);
        }
        iAppMetricaService.resumeUserSession(bundle);
    }
}

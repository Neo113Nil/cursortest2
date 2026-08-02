package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes.dex */
public final class Ji extends Ch {

    /* renamed from: e, reason: collision with root package name */
    public final Gf f6214e;

    public Ji(C0737p0 c0737p0, InterfaceC0448dl interfaceC0448dl, Gf gf) {
        super(c0737p0, interfaceC0448dl);
        this.f6214e = gf;
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final void a(IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        Gf gf = this.f6214e;
        synchronized (gf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", gf);
        }
        iAppMetricaService.resumeUserSession(bundle);
    }
}

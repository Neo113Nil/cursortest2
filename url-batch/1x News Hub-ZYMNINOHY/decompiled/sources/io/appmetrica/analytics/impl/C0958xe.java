package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.xe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0958xe extends Ch {

    /* renamed from: e, reason: collision with root package name */
    public final Gf f8618e;

    public C0958xe(C0737p0 c0737p0, InterfaceC0448dl interfaceC0448dl, Gf gf) {
        super(c0737p0, interfaceC0448dl);
        this.f8618e = gf;
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final void a(IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        Gf gf = this.f8618e;
        synchronized (gf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", gf);
        }
        iAppMetricaService.pauseUserSession(bundle);
    }
}

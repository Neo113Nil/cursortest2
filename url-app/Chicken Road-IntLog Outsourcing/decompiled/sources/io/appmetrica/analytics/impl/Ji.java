package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes.dex */
public final class Ji extends Ch {

    /* renamed from: e, reason: collision with root package name */
    public final Gf f7017e;

    public Ji(C0888p0 c0888p0, InterfaceC0599dl interfaceC0599dl, Gf gf) {
        super(c0888p0, interfaceC0599dl);
        this.f7017e = gf;
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final void a(IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        Gf gf = this.f7017e;
        synchronized (gf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", gf);
        }
        iAppMetricaService.resumeUserSession(bundle);
    }
}

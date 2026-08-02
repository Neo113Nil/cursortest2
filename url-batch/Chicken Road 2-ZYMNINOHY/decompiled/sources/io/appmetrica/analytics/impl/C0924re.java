package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.re, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0924re extends AbstractCallableC1083xh {

    /* renamed from: e, reason: collision with root package name */
    public final Bf f12658e;

    public C0924re(C0859p0 c0859p0, Zk zk, Bf bf) {
        super(c0859p0, zk);
        this.f12658e = bf;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC1083xh
    public final void a(IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        Bf bf = this.f12658e;
        synchronized (bf) {
            bundle.putParcelable("PROCESS_CFG_OBJ", bf);
        }
        iAppMetricaService.pauseUserSession(bundle);
    }
}

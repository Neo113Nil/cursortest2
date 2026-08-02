package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes.dex */
public final class Pn extends Ch {

    /* renamed from: e, reason: collision with root package name */
    public final int f6476e;
    public final Bundle f;

    public Pn(C0737p0 c0737p0, InterfaceC0448dl interfaceC0448dl, int i3, Bundle bundle) {
        super(c0737p0, interfaceC0448dl);
        this.f6476e = i3;
        this.f = bundle;
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final void a(IAppMetricaService iAppMetricaService) {
        iAppMetricaService.reportData(this.f6476e, this.f);
    }
}

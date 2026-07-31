package io.appmetrica.analytics.internal;

import android.os.Bundle;
import io.appmetrica.analytics.impl.InterfaceC3079x1;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes3.dex */
public final class a extends IAppMetricaService.Stub {
    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void pauseUserSession(Bundle bundle) {
        InterfaceC3079x1 interfaceC3079x1;
        interfaceC3079x1 = AppMetricaService.f40412c;
        interfaceC3079x1.pauseUserSession(bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void reportData(int i4, Bundle bundle) {
        InterfaceC3079x1 interfaceC3079x1;
        interfaceC3079x1 = AppMetricaService.f40412c;
        interfaceC3079x1.reportData(i4, bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void resumeUserSession(Bundle bundle) {
        InterfaceC3079x1 interfaceC3079x1;
        interfaceC3079x1 = AppMetricaService.f40412c;
        interfaceC3079x1.resumeUserSession(bundle);
    }
}

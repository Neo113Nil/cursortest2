package io.appmetrica.analytics.internal;

import android.os.Bundle;
import io.appmetrica.analytics.impl.A1;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* loaded from: classes.dex */
public final class a extends IAppMetricaService.Stub {
    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void pauseUserSession(Bundle bundle) {
        A1 a12;
        a12 = AppMetricaService.f8717c;
        a12.pauseUserSession(bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void reportData(int i3, Bundle bundle) {
        A1 a12;
        a12 = AppMetricaService.f8717c;
        a12.reportData(i3, bundle);
    }

    @Override // io.appmetrica.analytics.internal.IAppMetricaService
    public final void resumeUserSession(Bundle bundle) {
        A1 a12;
        a12 = AppMetricaService.f8717c;
        a12.resumeUserSession(bundle);
    }
}

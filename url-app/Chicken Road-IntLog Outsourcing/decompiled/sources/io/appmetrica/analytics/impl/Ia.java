package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* loaded from: classes.dex */
public interface Ia {
    C0788l4 a();

    void a(AppMetricaConfig appMetricaConfig, InterfaceC0511ab interfaceC0511ab);

    Handler b();

    C0528b2 c();

    C0950rb d();

    ICommonExecutor getDefaultExecutor();
}

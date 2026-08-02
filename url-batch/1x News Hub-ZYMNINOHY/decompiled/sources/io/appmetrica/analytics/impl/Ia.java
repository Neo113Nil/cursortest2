package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* loaded from: classes.dex */
public interface Ia {
    C0637l4 a();

    void a(AppMetricaConfig appMetricaConfig, InterfaceC0360ab interfaceC0360ab);

    Handler b();

    C0377b2 c();

    C0799rb d();

    ICommonExecutor getDefaultExecutor();
}

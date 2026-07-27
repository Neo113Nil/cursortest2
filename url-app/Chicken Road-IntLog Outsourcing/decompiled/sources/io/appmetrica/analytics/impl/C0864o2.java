package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;

/* renamed from: io.appmetrica.analytics.impl.o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0864o2 {
    public static final boolean a(Throwable th) {
        return true;
    }

    public final Ma a(Context context, AppMetricaConfig appMetricaConfig, InterfaceC0511ab interfaceC0511ab) {
        return new Gh(new C0822mc(interfaceC0511ab, appMetricaConfig), new Vo(0), appMetricaConfig.crashTransformer, new T9(context));
    }
}

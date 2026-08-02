package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;

/* renamed from: io.appmetrica.analytics.impl.o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0713o2 {
    public static final boolean a(Throwable th) {
        return true;
    }

    public final Ma a(Context context, AppMetricaConfig appMetricaConfig, InterfaceC0360ab interfaceC0360ab) {
        return new Gh(new C0671mc(interfaceC0360ab, appMetricaConfig), new Y1.M(20), appMetricaConfig.crashTransformer, new T9(context));
    }
}

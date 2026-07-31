package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;

/* renamed from: io.appmetrica.analytics.impl.g2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0189g2 {
    public static final boolean a(Throwable th) {
        return true;
    }

    public final Ga a(Context context, AppMetricaConfig appMetricaConfig, Ua ua) {
        return new Ch(new C0199gc(ua, appMetricaConfig), new InterfaceC0270j6() { // from class: io.appmetrica.analytics.impl.g2$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.InterfaceC0270j6
            public final boolean a(Throwable th) {
                return C0189g2.a(th);
            }
        }, appMetricaConfig.crashTransformer, new N9(context));
    }
}

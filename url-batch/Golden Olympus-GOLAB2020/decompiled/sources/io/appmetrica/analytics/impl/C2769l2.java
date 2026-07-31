package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.l2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2769l2 {
    public static final boolean a(Throwable th) {
        return true;
    }

    @NotNull
    public final InterfaceC2488ab a(@NotNull Context context, @NotNull AppMetricaConfig appMetricaConfig, @NotNull InterfaceC2856ob interfaceC2856ob) {
        return new Oh(new Ac(interfaceC2856ob, appMetricaConfig), new E6() { // from class: io.appmetrica.analytics.impl.np
            @Override // io.appmetrica.analytics.impl.E6
            public final boolean a(Throwable th) {
                return C2769l2.a(th);
            }
        }, appMetricaConfig.crashTransformer, new C2674ha(context));
    }
}

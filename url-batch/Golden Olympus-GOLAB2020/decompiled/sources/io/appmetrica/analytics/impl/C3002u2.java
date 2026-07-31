package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.u2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3002u2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2867om fromModel(@NonNull BillingConfig billingConfig) {
        C2867om c2867om = new C2867om();
        c2867om.f39590a = billingConfig.sendFrequencySeconds;
        c2867om.f39591b = billingConfig.firstCollectingInappMaxAgeSeconds;
        return c2867om;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C2867om c2867om = (C2867om) obj;
        return new BillingConfig(c2867om.f39590a, c2867om.f39591b);
    }

    @NonNull
    public final BillingConfig a(@NonNull C2867om c2867om) {
        return new BillingConfig(c2867om.f39590a, c2867om.f39591b);
    }
}

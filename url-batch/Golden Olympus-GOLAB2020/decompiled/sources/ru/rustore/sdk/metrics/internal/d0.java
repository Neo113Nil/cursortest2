package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.metrics.MetricsEvent;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f43698a;

    /* renamed from: b, reason: collision with root package name */
    public final MetricsEvent f43699b;

    public d0(String uuid, MetricsEvent metricsEvent) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        this.f43698a = uuid;
        this.f43699b = metricsEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(d0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type ru.rustore.sdk.metrics.internal.domain.model.PersistentMetricsEvent");
        d0 d0Var = (d0) obj;
        return Intrinsics.areEqual(this.f43698a, d0Var.f43698a) && Intrinsics.areEqual(this.f43699b, d0Var.f43699b);
    }

    public final int hashCode() {
        return this.f43699b.hashCode() + (this.f43698a.hashCode() * 31);
    }
}

package ru.rustore.sdk.metrics.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f43716a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f43717b;

    public j0(String uuid, byte[] serializedMetricsEvent) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(serializedMetricsEvent, "serializedMetricsEvent");
        this.f43716a = uuid;
        this.f43717b = serializedMetricsEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(j0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type ru.rustore.sdk.metrics.internal.data.dto.PersistentMetricsEventDto");
        j0 j0Var = (j0) obj;
        return Intrinsics.areEqual(this.f43716a, j0Var.f43716a) && Arrays.equals(this.f43717b, j0Var.f43717b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f43717b) + (this.f43716a.hashCode() * 31);
    }
}

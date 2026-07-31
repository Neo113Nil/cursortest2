package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f43767a;

    public final boolean equals(Object obj) {
        return (obj instanceof u) && Intrinsics.areEqual(this.f43767a, ((u) obj).f43767a);
    }

    public final int hashCode() {
        return this.f43767a.hashCode();
    }

    public final String toString() {
        return "MetricsEventUuid(value=" + this.f43767a + ')';
    }
}

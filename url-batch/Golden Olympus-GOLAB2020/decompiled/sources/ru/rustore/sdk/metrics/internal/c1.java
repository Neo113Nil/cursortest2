package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f43696a;

    public final boolean equals(Object obj) {
        return (obj instanceof c1) && Intrinsics.areEqual(this.f43696a, ((c1) obj).f43696a);
    }

    public final int hashCode() {
        return this.f43696a.hashCode();
    }

    public final String toString() {
        return "VersionName(value=" + this.f43696a + ')';
    }
}

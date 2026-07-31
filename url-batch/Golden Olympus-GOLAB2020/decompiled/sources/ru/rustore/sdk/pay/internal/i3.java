package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f44298a;

    public final boolean equals(Object obj) {
        return (obj instanceof i3) && Intrinsics.areEqual(this.f44298a, ((i3) obj).f44298a);
    }

    public final int hashCode() {
        return this.f44298a.hashCode();
    }

    public final String toString() {
        return "CouponId(value=" + this.f44298a + ')';
    }
}

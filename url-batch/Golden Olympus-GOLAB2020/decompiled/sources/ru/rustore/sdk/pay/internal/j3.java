package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f44356a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f44357b;

    public j3(@NotNull String startDate, @NotNull String endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f44356a = startDate;
        this.f44357b = endDate;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj;
        return Intrinsics.areEqual(this.f44356a, j3Var.f44356a) && Intrinsics.areEqual(this.f44357b, j3Var.f44357b);
    }

    public final int hashCode() {
        return this.f44357b.hashCode() + (this.f44356a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CouponIntervalDto(startDate=");
        sb.append(this.f44356a);
        sb.append(", endDate=");
        return i1.a(sb, this.f44357b, ')');
    }
}

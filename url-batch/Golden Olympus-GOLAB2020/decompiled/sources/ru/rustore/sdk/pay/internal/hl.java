package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class hl {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f44291a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f44292b;

    public hl(@NotNull String expirationDate, @NotNull String period) {
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f44291a = expirationDate;
        this.f44292b = period;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl)) {
            return false;
        }
        hl hlVar = (hl) obj;
        return Intrinsics.areEqual(this.f44291a, hlVar.f44291a) && Intrinsics.areEqual(this.f44292b, hlVar.f44292b);
    }

    public final int hashCode() {
        return this.f44292b.hashCode() + (this.f44291a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionPurchaseInfoDto(expirationDate=");
        sb.append(this.f44291a);
        sb.append(", period=");
        return i1.a(sb, this.f44292b, ')');
    }
}

package ru.rustore.sdk.pay.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class SubscriptionInfo {

    @NotNull
    private final List<SubscriptionPeriod> periods;

    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionInfo(@NotNull List<? extends SubscriptionPeriod> periods) {
        Intrinsics.checkNotNullParameter(periods, "periods");
        this.periods = periods;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SubscriptionInfo) && Intrinsics.areEqual(this.periods, ((SubscriptionInfo) obj).periods);
    }

    @NotNull
    public final List<SubscriptionPeriod> getPeriods() {
        return this.periods;
    }

    public int hashCode() {
        return this.periods.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionInfo(");
        sb.append("periods=" + this.periods);
        sb.append(")");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}

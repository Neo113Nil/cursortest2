package ru.rustore.sdk.pay.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class GracePeriod implements SubscriptionPeriod {

    @NotNull
    private final String duration;

    public GracePeriod(@NotNull String duration) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.duration = duration;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GracePeriod) && Intrinsics.areEqual(this.duration, ((GracePeriod) obj).duration);
    }

    @NotNull
    public final String getDuration() {
        return this.duration;
    }

    public int hashCode() {
        return this.duration.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("GracePeriod(");
        sb.append("duration='" + this.duration + '\'');
        sb.append(")");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}

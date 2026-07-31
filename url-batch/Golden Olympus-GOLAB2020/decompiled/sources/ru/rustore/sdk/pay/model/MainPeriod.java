package ru.rustore.sdk.pay.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.internal.j1;

@Metadata
/* loaded from: classes3.dex */
public final class MainPeriod implements SubscriptionPeriod {

    @NotNull
    private final String currency;

    @NotNull
    private final String duration;
    private final int price;

    public MainPeriod(@NotNull String duration, @NotNull String currency, int i4) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.duration = duration;
        this.currency = currency;
        this.price = i4;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainPeriod)) {
            return false;
        }
        MainPeriod mainPeriod = (MainPeriod) obj;
        return Intrinsics.areEqual(this.duration, mainPeriod.duration) && Intrinsics.areEqual(this.currency, mainPeriod.currency) && this.price == mainPeriod.price;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getDuration() {
        return this.duration;
    }

    public final int getPrice() {
        return this.price;
    }

    public int hashCode() {
        return j1.a(this.currency, this.duration.hashCode() * 31, 31) + this.price;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MainPeriod(");
        sb.append("duration='" + this.duration + "', ");
        sb.append("currency='" + this.currency + "', ");
        StringBuilder sb2 = new StringBuilder("price=");
        sb2.append(this.price);
        sb.append(sb2.toString());
        sb.append(")");
        String sb3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}

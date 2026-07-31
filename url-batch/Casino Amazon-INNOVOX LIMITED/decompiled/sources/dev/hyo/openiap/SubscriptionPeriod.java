package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Ldev/hyo/openiap/SubscriptionPeriod;", "", "unit", "Ldev/hyo/openiap/SubscriptionPeriodUnit;", "value", "", "<init>", "(Ldev/hyo/openiap/SubscriptionPeriodUnit;I)V", "getUnit", "()Ldev/hyo/openiap/SubscriptionPeriodUnit;", "getValue", "()I", "toJson", "", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubscriptionPeriod {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SubscriptionPeriodUnit unit;
    private final int value;

    public static /* synthetic */ SubscriptionPeriod copy$default(SubscriptionPeriod subscriptionPeriod, SubscriptionPeriodUnit subscriptionPeriodUnit, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            subscriptionPeriodUnit = subscriptionPeriod.unit;
        }
        if ((i2 & 2) != 0) {
            i = subscriptionPeriod.value;
        }
        return subscriptionPeriod.copy(subscriptionPeriodUnit, i);
    }

    /* renamed from: component1, reason: from getter */
    public final SubscriptionPeriodUnit getUnit() {
        return this.unit;
    }

    /* renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final SubscriptionPeriod copy(SubscriptionPeriodUnit unit, int value) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return new SubscriptionPeriod(unit, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionPeriod)) {
            return false;
        }
        SubscriptionPeriod subscriptionPeriod = (SubscriptionPeriod) other;
        return this.unit == subscriptionPeriod.unit && this.value == subscriptionPeriod.value;
    }

    public int hashCode() {
        return (this.unit.hashCode() * 31) + Integer.hashCode(this.value);
    }

    public String toString() {
        return "SubscriptionPeriod(unit=" + this.unit + ", value=" + this.value + ")";
    }

    public SubscriptionPeriod(SubscriptionPeriodUnit unit, int i) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.unit = unit;
        this.value = i;
    }

    public final SubscriptionPeriodUnit getUnit() {
        return this.unit;
    }

    public final int getValue() {
        return this.value;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/SubscriptionPeriod$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/SubscriptionPeriod;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SubscriptionPeriod fromJson(Map<String, ? extends Object> json) {
            SubscriptionPeriodUnit subscriptionPeriodUnit;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("unit");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null || (subscriptionPeriodUnit = SubscriptionPeriodUnit.INSTANCE.fromJson(str)) == null) {
                subscriptionPeriodUnit = SubscriptionPeriodUnit.Day;
            }
            Object obj2 = json.get("value");
            Number number = obj2 instanceof Number ? (Number) obj2 : null;
            return new SubscriptionPeriod(subscriptionPeriodUnit, number != null ? number.intValue() : 0);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("__typename", "SubscriptionPeriod"), TuplesKt.to("unit", this.unit.toJson()), TuplesKt.to("value", Integer.valueOf(this.value)));
    }
}

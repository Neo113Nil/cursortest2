package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Ldev/hyo/openiap/SubscriptionPeriodValueIOS;", "", "unit", "Ldev/hyo/openiap/SubscriptionPeriodIOS;", "value", "", "<init>", "(Ldev/hyo/openiap/SubscriptionPeriodIOS;I)V", "getUnit", "()Ldev/hyo/openiap/SubscriptionPeriodIOS;", "getValue", "()I", "toJson", "", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubscriptionPeriodValueIOS {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SubscriptionPeriodIOS unit;
    private final int value;

    public static /* synthetic */ SubscriptionPeriodValueIOS copy$default(SubscriptionPeriodValueIOS subscriptionPeriodValueIOS, SubscriptionPeriodIOS subscriptionPeriodIOS, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            subscriptionPeriodIOS = subscriptionPeriodValueIOS.unit;
        }
        if ((i2 & 2) != 0) {
            i = subscriptionPeriodValueIOS.value;
        }
        return subscriptionPeriodValueIOS.copy(subscriptionPeriodIOS, i);
    }

    /* renamed from: component1, reason: from getter */
    public final SubscriptionPeriodIOS getUnit() {
        return this.unit;
    }

    /* renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final SubscriptionPeriodValueIOS copy(SubscriptionPeriodIOS unit, int value) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return new SubscriptionPeriodValueIOS(unit, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionPeriodValueIOS)) {
            return false;
        }
        SubscriptionPeriodValueIOS subscriptionPeriodValueIOS = (SubscriptionPeriodValueIOS) other;
        return this.unit == subscriptionPeriodValueIOS.unit && this.value == subscriptionPeriodValueIOS.value;
    }

    public int hashCode() {
        return (this.unit.hashCode() * 31) + Integer.hashCode(this.value);
    }

    public String toString() {
        return "SubscriptionPeriodValueIOS(unit=" + this.unit + ", value=" + this.value + ")";
    }

    public SubscriptionPeriodValueIOS(SubscriptionPeriodIOS unit, int i) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.unit = unit;
        this.value = i;
    }

    public final SubscriptionPeriodIOS getUnit() {
        return this.unit;
    }

    public final int getValue() {
        return this.value;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/SubscriptionPeriodValueIOS$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/SubscriptionPeriodValueIOS;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SubscriptionPeriodValueIOS fromJson(Map<String, ? extends Object> json) {
            SubscriptionPeriodIOS subscriptionPeriodIOS;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("unit");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null || (subscriptionPeriodIOS = SubscriptionPeriodIOS.INSTANCE.fromJson(str)) == null) {
                subscriptionPeriodIOS = SubscriptionPeriodIOS.Empty;
            }
            Object obj2 = json.get("value");
            Number number = obj2 instanceof Number ? (Number) obj2 : null;
            return new SubscriptionPeriodValueIOS(subscriptionPeriodIOS, number != null ? number.intValue() : 0);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("__typename", "SubscriptionPeriodValueIOS"), TuplesKt.to("unit", this.unit.toJson()), TuplesKt.to("value", Integer.valueOf(this.value)));
    }
}

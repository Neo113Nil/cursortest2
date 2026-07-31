package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Ldev/hyo/openiap/LimitedQuantityInfoAndroid;", "", "maximumQuantity", "", "remainingQuantity", "<init>", "(II)V", "getMaximumQuantity", "()I", "getRemainingQuantity", "toJson", "", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LimitedQuantityInfoAndroid {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int maximumQuantity;
    private final int remainingQuantity;

    public static /* synthetic */ LimitedQuantityInfoAndroid copy$default(LimitedQuantityInfoAndroid limitedQuantityInfoAndroid, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = limitedQuantityInfoAndroid.maximumQuantity;
        }
        if ((i3 & 2) != 0) {
            i2 = limitedQuantityInfoAndroid.remainingQuantity;
        }
        return limitedQuantityInfoAndroid.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMaximumQuantity() {
        return this.maximumQuantity;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRemainingQuantity() {
        return this.remainingQuantity;
    }

    public final LimitedQuantityInfoAndroid copy(int maximumQuantity, int remainingQuantity) {
        return new LimitedQuantityInfoAndroid(maximumQuantity, remainingQuantity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitedQuantityInfoAndroid)) {
            return false;
        }
        LimitedQuantityInfoAndroid limitedQuantityInfoAndroid = (LimitedQuantityInfoAndroid) other;
        return this.maximumQuantity == limitedQuantityInfoAndroid.maximumQuantity && this.remainingQuantity == limitedQuantityInfoAndroid.remainingQuantity;
    }

    public int hashCode() {
        return (Integer.hashCode(this.maximumQuantity) * 31) + Integer.hashCode(this.remainingQuantity);
    }

    public String toString() {
        return "LimitedQuantityInfoAndroid(maximumQuantity=" + this.maximumQuantity + ", remainingQuantity=" + this.remainingQuantity + ")";
    }

    public LimitedQuantityInfoAndroid(int i, int i2) {
        this.maximumQuantity = i;
        this.remainingQuantity = i2;
    }

    public final int getMaximumQuantity() {
        return this.maximumQuantity;
    }

    public final int getRemainingQuantity() {
        return this.remainingQuantity;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/LimitedQuantityInfoAndroid$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/LimitedQuantityInfoAndroid;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LimitedQuantityInfoAndroid fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("maximumQuantity");
            Number number = obj instanceof Number ? (Number) obj : null;
            int intValue = number != null ? number.intValue() : 0;
            Object obj2 = json.get("remainingQuantity");
            Number number2 = obj2 instanceof Number ? (Number) obj2 : null;
            return new LimitedQuantityInfoAndroid(intValue, number2 != null ? number2.intValue() : 0);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("__typename", "LimitedQuantityInfoAndroid"), TuplesKt.to("maximumQuantity", Integer.valueOf(this.maximumQuantity)), TuplesKt.to("remainingQuantity", Integer.valueOf(this.remainingQuantity)));
    }
}

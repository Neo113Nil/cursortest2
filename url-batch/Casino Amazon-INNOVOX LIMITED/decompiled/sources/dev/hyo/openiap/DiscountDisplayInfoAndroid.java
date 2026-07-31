package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Ldev/hyo/openiap/DiscountDisplayInfoAndroid;", "", "discountAmount", "Ldev/hyo/openiap/DiscountAmountAndroid;", "percentageDiscount", "", "<init>", "(Ldev/hyo/openiap/DiscountAmountAndroid;Ljava/lang/Integer;)V", "getDiscountAmount", "()Ldev/hyo/openiap/DiscountAmountAndroid;", "getPercentageDiscount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "toJson", "", "", "component1", "component2", "copy", "(Ldev/hyo/openiap/DiscountAmountAndroid;Ljava/lang/Integer;)Ldev/hyo/openiap/DiscountDisplayInfoAndroid;", "equals", "", "other", "hashCode", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DiscountDisplayInfoAndroid {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final DiscountAmountAndroid discountAmount;
    private final Integer percentageDiscount;

    /* JADX WARN: Multi-variable type inference failed */
    public DiscountDisplayInfoAndroid() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DiscountDisplayInfoAndroid copy$default(DiscountDisplayInfoAndroid discountDisplayInfoAndroid, DiscountAmountAndroid discountAmountAndroid, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            discountAmountAndroid = discountDisplayInfoAndroid.discountAmount;
        }
        if ((i & 2) != 0) {
            num = discountDisplayInfoAndroid.percentageDiscount;
        }
        return discountDisplayInfoAndroid.copy(discountAmountAndroid, num);
    }

    /* renamed from: component1, reason: from getter */
    public final DiscountAmountAndroid getDiscountAmount() {
        return this.discountAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getPercentageDiscount() {
        return this.percentageDiscount;
    }

    public final DiscountDisplayInfoAndroid copy(DiscountAmountAndroid discountAmount, Integer percentageDiscount) {
        return new DiscountDisplayInfoAndroid(discountAmount, percentageDiscount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscountDisplayInfoAndroid)) {
            return false;
        }
        DiscountDisplayInfoAndroid discountDisplayInfoAndroid = (DiscountDisplayInfoAndroid) other;
        return Intrinsics.areEqual(this.discountAmount, discountDisplayInfoAndroid.discountAmount) && Intrinsics.areEqual(this.percentageDiscount, discountDisplayInfoAndroid.percentageDiscount);
    }

    public int hashCode() {
        DiscountAmountAndroid discountAmountAndroid = this.discountAmount;
        int hashCode = (discountAmountAndroid == null ? 0 : discountAmountAndroid.hashCode()) * 31;
        Integer num = this.percentageDiscount;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "DiscountDisplayInfoAndroid(discountAmount=" + this.discountAmount + ", percentageDiscount=" + this.percentageDiscount + ")";
    }

    public DiscountDisplayInfoAndroid(DiscountAmountAndroid discountAmountAndroid, Integer num) {
        this.discountAmount = discountAmountAndroid;
        this.percentageDiscount = num;
    }

    public /* synthetic */ DiscountDisplayInfoAndroid(DiscountAmountAndroid discountAmountAndroid, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : discountAmountAndroid, (i & 2) != 0 ? null : num);
    }

    public final DiscountAmountAndroid getDiscountAmount() {
        return this.discountAmount;
    }

    public final Integer getPercentageDiscount() {
        return this.percentageDiscount;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/DiscountDisplayInfoAndroid$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/DiscountDisplayInfoAndroid;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DiscountDisplayInfoAndroid fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("discountAmount");
            Map<String, ? extends Object> map = obj instanceof Map ? (Map) obj : null;
            DiscountAmountAndroid fromJson = map != null ? DiscountAmountAndroid.INSTANCE.fromJson(map) : null;
            Object obj2 = json.get("percentageDiscount");
            Number number = obj2 instanceof Number ? (Number) obj2 : null;
            return new DiscountDisplayInfoAndroid(fromJson, number != null ? Integer.valueOf(number.intValue()) : null);
        }
    }

    public final Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.to("__typename", "DiscountDisplayInfoAndroid");
        DiscountAmountAndroid discountAmountAndroid = this.discountAmount;
        pairArr[1] = TuplesKt.to("discountAmount", discountAmountAndroid != null ? discountAmountAndroid.toJson() : null);
        pairArr[2] = TuplesKt.to("percentageDiscount", this.percentageDiscount);
        return MapsKt.mapOf(pairArr);
    }
}

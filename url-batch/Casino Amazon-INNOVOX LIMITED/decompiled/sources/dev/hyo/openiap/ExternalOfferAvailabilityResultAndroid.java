package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bJ\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0012"}, d2 = {"Ldev/hyo/openiap/ExternalOfferAvailabilityResultAndroid;", "", "isAvailable", "", "<init>", "(Z)V", "()Z", "toJson", "", "", "component1", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ExternalOfferAvailabilityResultAndroid {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isAvailable;

    public static /* synthetic */ ExternalOfferAvailabilityResultAndroid copy$default(ExternalOfferAvailabilityResultAndroid externalOfferAvailabilityResultAndroid, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = externalOfferAvailabilityResultAndroid.isAvailable;
        }
        return externalOfferAvailabilityResultAndroid.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    public final ExternalOfferAvailabilityResultAndroid copy(boolean isAvailable) {
        return new ExternalOfferAvailabilityResultAndroid(isAvailable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExternalOfferAvailabilityResultAndroid) && this.isAvailable == ((ExternalOfferAvailabilityResultAndroid) other).isAvailable;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isAvailable);
    }

    public String toString() {
        return "ExternalOfferAvailabilityResultAndroid(isAvailable=" + this.isAvailable + ")";
    }

    public ExternalOfferAvailabilityResultAndroid(boolean z) {
        this.isAvailable = z;
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/ExternalOfferAvailabilityResultAndroid$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/ExternalOfferAvailabilityResultAndroid;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ExternalOfferAvailabilityResultAndroid fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("isAvailable");
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            return new ExternalOfferAvailabilityResultAndroid(bool != null ? bool.booleanValue() : false);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("__typename", "ExternalOfferAvailabilityResultAndroid"), TuplesKt.to("isAvailable", Boolean.valueOf(this.isAvailable)));
    }
}

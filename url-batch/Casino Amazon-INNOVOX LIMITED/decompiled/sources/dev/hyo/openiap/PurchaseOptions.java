package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u000fHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u001b"}, d2 = {"Ldev/hyo/openiap/PurchaseOptions;", "", "alsoPublishToEventListenerIOS", "", "includeSuspendedAndroid", "onlyIncludeActiveItemsIOS", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAlsoPublishToEventListenerIOS", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIncludeSuspendedAndroid", "getOnlyIncludeActiveItemsIOS", "toJson", "", "", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Ldev/hyo/openiap/PurchaseOptions;", "equals", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PurchaseOptions {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean alsoPublishToEventListenerIOS;
    private final Boolean includeSuspendedAndroid;
    private final Boolean onlyIncludeActiveItemsIOS;

    public PurchaseOptions() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ PurchaseOptions copy$default(PurchaseOptions purchaseOptions, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = purchaseOptions.alsoPublishToEventListenerIOS;
        }
        if ((i & 2) != 0) {
            bool2 = purchaseOptions.includeSuspendedAndroid;
        }
        if ((i & 4) != 0) {
            bool3 = purchaseOptions.onlyIncludeActiveItemsIOS;
        }
        return purchaseOptions.copy(bool, bool2, bool3);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getAlsoPublishToEventListenerIOS() {
        return this.alsoPublishToEventListenerIOS;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIncludeSuspendedAndroid() {
        return this.includeSuspendedAndroid;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getOnlyIncludeActiveItemsIOS() {
        return this.onlyIncludeActiveItemsIOS;
    }

    public final PurchaseOptions copy(Boolean alsoPublishToEventListenerIOS, Boolean includeSuspendedAndroid, Boolean onlyIncludeActiveItemsIOS) {
        return new PurchaseOptions(alsoPublishToEventListenerIOS, includeSuspendedAndroid, onlyIncludeActiveItemsIOS);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseOptions)) {
            return false;
        }
        PurchaseOptions purchaseOptions = (PurchaseOptions) other;
        return Intrinsics.areEqual(this.alsoPublishToEventListenerIOS, purchaseOptions.alsoPublishToEventListenerIOS) && Intrinsics.areEqual(this.includeSuspendedAndroid, purchaseOptions.includeSuspendedAndroid) && Intrinsics.areEqual(this.onlyIncludeActiveItemsIOS, purchaseOptions.onlyIncludeActiveItemsIOS);
    }

    public int hashCode() {
        Boolean bool = this.alsoPublishToEventListenerIOS;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.includeSuspendedAndroid;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.onlyIncludeActiveItemsIOS;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        return "PurchaseOptions(alsoPublishToEventListenerIOS=" + this.alsoPublishToEventListenerIOS + ", includeSuspendedAndroid=" + this.includeSuspendedAndroid + ", onlyIncludeActiveItemsIOS=" + this.onlyIncludeActiveItemsIOS + ")";
    }

    public PurchaseOptions(Boolean bool, Boolean bool2, Boolean bool3) {
        this.alsoPublishToEventListenerIOS = bool;
        this.includeSuspendedAndroid = bool2;
        this.onlyIncludeActiveItemsIOS = bool3;
    }

    public /* synthetic */ PurchaseOptions(Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3);
    }

    public final Boolean getAlsoPublishToEventListenerIOS() {
        return this.alsoPublishToEventListenerIOS;
    }

    public final Boolean getIncludeSuspendedAndroid() {
        return this.includeSuspendedAndroid;
    }

    public final Boolean getOnlyIncludeActiveItemsIOS() {
        return this.onlyIncludeActiveItemsIOS;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/PurchaseOptions$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/PurchaseOptions;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PurchaseOptions fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("alsoPublishToEventListenerIOS");
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            Object obj2 = json.get("includeSuspendedAndroid");
            Boolean bool2 = obj2 instanceof Boolean ? (Boolean) obj2 : null;
            Object obj3 = json.get("onlyIncludeActiveItemsIOS");
            return new PurchaseOptions(bool, bool2, obj3 instanceof Boolean ? (Boolean) obj3 : null);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("alsoPublishToEventListenerIOS", this.alsoPublishToEventListenerIOS), TuplesKt.to("includeSuspendedAndroid", this.includeSuspendedAndroid), TuplesKt.to("onlyIncludeActiveItemsIOS", this.onlyIncludeActiveItemsIOS));
    }
}

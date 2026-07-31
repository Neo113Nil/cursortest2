package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Ldev/hyo/openiap/RequestVerifyPurchaseWithIapkitResult;", "", "isValid", "", "state", "Ldev/hyo/openiap/IapkitPurchaseState;", "store", "Ldev/hyo/openiap/IapStore;", "<init>", "(ZLdev/hyo/openiap/IapkitPurchaseState;Ldev/hyo/openiap/IapStore;)V", "()Z", "getState", "()Ldev/hyo/openiap/IapkitPurchaseState;", "getStore", "()Ldev/hyo/openiap/IapStore;", "toJson", "", "", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequestVerifyPurchaseWithIapkitResult {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isValid;
    private final IapkitPurchaseState state;
    private final IapStore store;

    public static /* synthetic */ RequestVerifyPurchaseWithIapkitResult copy$default(RequestVerifyPurchaseWithIapkitResult requestVerifyPurchaseWithIapkitResult, boolean z, IapkitPurchaseState iapkitPurchaseState, IapStore iapStore, int i, Object obj) {
        if ((i & 1) != 0) {
            z = requestVerifyPurchaseWithIapkitResult.isValid;
        }
        if ((i & 2) != 0) {
            iapkitPurchaseState = requestVerifyPurchaseWithIapkitResult.state;
        }
        if ((i & 4) != 0) {
            iapStore = requestVerifyPurchaseWithIapkitResult.store;
        }
        return requestVerifyPurchaseWithIapkitResult.copy(z, iapkitPurchaseState, iapStore);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    /* renamed from: component2, reason: from getter */
    public final IapkitPurchaseState getState() {
        return this.state;
    }

    /* renamed from: component3, reason: from getter */
    public final IapStore getStore() {
        return this.store;
    }

    public final RequestVerifyPurchaseWithIapkitResult copy(boolean isValid, IapkitPurchaseState state, IapStore store) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(store, "store");
        return new RequestVerifyPurchaseWithIapkitResult(isValid, state, store);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestVerifyPurchaseWithIapkitResult)) {
            return false;
        }
        RequestVerifyPurchaseWithIapkitResult requestVerifyPurchaseWithIapkitResult = (RequestVerifyPurchaseWithIapkitResult) other;
        return this.isValid == requestVerifyPurchaseWithIapkitResult.isValid && this.state == requestVerifyPurchaseWithIapkitResult.state && this.store == requestVerifyPurchaseWithIapkitResult.store;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isValid) * 31) + this.state.hashCode()) * 31) + this.store.hashCode();
    }

    public String toString() {
        return "RequestVerifyPurchaseWithIapkitResult(isValid=" + this.isValid + ", state=" + this.state + ", store=" + this.store + ")";
    }

    public RequestVerifyPurchaseWithIapkitResult(boolean z, IapkitPurchaseState state, IapStore store) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(store, "store");
        this.isValid = z;
        this.state = state;
        this.store = store;
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public final IapkitPurchaseState getState() {
        return this.state;
    }

    public final IapStore getStore() {
        return this.store;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/RequestVerifyPurchaseWithIapkitResult$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/RequestVerifyPurchaseWithIapkitResult;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RequestVerifyPurchaseWithIapkitResult fromJson(Map<String, ? extends Object> json) {
            IapkitPurchaseState iapkitPurchaseState;
            IapStore iapStore;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("isValid");
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Object obj2 = json.get("state");
            String str = obj2 instanceof String ? (String) obj2 : null;
            if (str == null || (iapkitPurchaseState = IapkitPurchaseState.INSTANCE.fromJson(str)) == null) {
                iapkitPurchaseState = IapkitPurchaseState.Entitled;
            }
            Object obj3 = json.get("store");
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            if (str2 == null || (iapStore = IapStore.INSTANCE.fromJson(str2)) == null) {
                iapStore = IapStore.Unknown;
            }
            return new RequestVerifyPurchaseWithIapkitResult(booleanValue, iapkitPurchaseState, iapStore);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("__typename", "RequestVerifyPurchaseWithIapkitResult"), TuplesKt.to("isValid", Boolean.valueOf(this.isValid)), TuplesKt.to("state", this.state.toJson()), TuplesKt.to("store", this.store.toJson()));
    }
}

package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Ldev/hyo/openiap/VerifyPurchaseWithProviderProps;", "", "iapkit", "Ldev/hyo/openiap/RequestVerifyPurchaseWithIapkitProps;", "provider", "Ldev/hyo/openiap/PurchaseVerificationProvider;", "<init>", "(Ldev/hyo/openiap/RequestVerifyPurchaseWithIapkitProps;Ldev/hyo/openiap/PurchaseVerificationProvider;)V", "getIapkit", "()Ldev/hyo/openiap/RequestVerifyPurchaseWithIapkitProps;", "getProvider", "()Ldev/hyo/openiap/PurchaseVerificationProvider;", "toJson", "", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VerifyPurchaseWithProviderProps {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RequestVerifyPurchaseWithIapkitProps iapkit;
    private final PurchaseVerificationProvider provider;

    public static /* synthetic */ VerifyPurchaseWithProviderProps copy$default(VerifyPurchaseWithProviderProps verifyPurchaseWithProviderProps, RequestVerifyPurchaseWithIapkitProps requestVerifyPurchaseWithIapkitProps, PurchaseVerificationProvider purchaseVerificationProvider, int i, Object obj) {
        if ((i & 1) != 0) {
            requestVerifyPurchaseWithIapkitProps = verifyPurchaseWithProviderProps.iapkit;
        }
        if ((i & 2) != 0) {
            purchaseVerificationProvider = verifyPurchaseWithProviderProps.provider;
        }
        return verifyPurchaseWithProviderProps.copy(requestVerifyPurchaseWithIapkitProps, purchaseVerificationProvider);
    }

    /* renamed from: component1, reason: from getter */
    public final RequestVerifyPurchaseWithIapkitProps getIapkit() {
        return this.iapkit;
    }

    /* renamed from: component2, reason: from getter */
    public final PurchaseVerificationProvider getProvider() {
        return this.provider;
    }

    public final VerifyPurchaseWithProviderProps copy(RequestVerifyPurchaseWithIapkitProps iapkit, PurchaseVerificationProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new VerifyPurchaseWithProviderProps(iapkit, provider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyPurchaseWithProviderProps)) {
            return false;
        }
        VerifyPurchaseWithProviderProps verifyPurchaseWithProviderProps = (VerifyPurchaseWithProviderProps) other;
        return Intrinsics.areEqual(this.iapkit, verifyPurchaseWithProviderProps.iapkit) && this.provider == verifyPurchaseWithProviderProps.provider;
    }

    public int hashCode() {
        RequestVerifyPurchaseWithIapkitProps requestVerifyPurchaseWithIapkitProps = this.iapkit;
        return ((requestVerifyPurchaseWithIapkitProps == null ? 0 : requestVerifyPurchaseWithIapkitProps.hashCode()) * 31) + this.provider.hashCode();
    }

    public String toString() {
        return "VerifyPurchaseWithProviderProps(iapkit=" + this.iapkit + ", provider=" + this.provider + ")";
    }

    public VerifyPurchaseWithProviderProps(RequestVerifyPurchaseWithIapkitProps requestVerifyPurchaseWithIapkitProps, PurchaseVerificationProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.iapkit = requestVerifyPurchaseWithIapkitProps;
        this.provider = provider;
    }

    public /* synthetic */ VerifyPurchaseWithProviderProps(RequestVerifyPurchaseWithIapkitProps requestVerifyPurchaseWithIapkitProps, PurchaseVerificationProvider purchaseVerificationProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : requestVerifyPurchaseWithIapkitProps, purchaseVerificationProvider);
    }

    public final RequestVerifyPurchaseWithIapkitProps getIapkit() {
        return this.iapkit;
    }

    public final PurchaseVerificationProvider getProvider() {
        return this.provider;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/VerifyPurchaseWithProviderProps$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/VerifyPurchaseWithProviderProps;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VerifyPurchaseWithProviderProps fromJson(Map<String, ? extends Object> json) {
            PurchaseVerificationProvider purchaseVerificationProvider;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("iapkit");
            Map<String, ? extends Object> map = obj instanceof Map ? (Map) obj : null;
            RequestVerifyPurchaseWithIapkitProps fromJson = map != null ? RequestVerifyPurchaseWithIapkitProps.INSTANCE.fromJson(map) : null;
            Object obj2 = json.get("provider");
            String str = obj2 instanceof String ? (String) obj2 : null;
            if (str == null || (purchaseVerificationProvider = PurchaseVerificationProvider.INSTANCE.fromJson(str)) == null) {
                purchaseVerificationProvider = PurchaseVerificationProvider.Iapkit;
            }
            return new VerifyPurchaseWithProviderProps(fromJson, purchaseVerificationProvider);
        }
    }

    public final Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[2];
        RequestVerifyPurchaseWithIapkitProps requestVerifyPurchaseWithIapkitProps = this.iapkit;
        pairArr[0] = TuplesKt.to("iapkit", requestVerifyPurchaseWithIapkitProps != null ? requestVerifyPurchaseWithIapkitProps.toJson() : null);
        pairArr[1] = TuplesKt.to("provider", this.provider.toJson());
        return MapsKt.mapOf(pairArr);
    }
}

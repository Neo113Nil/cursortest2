package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Ldev/hyo/openiap/RequestPurchaseResultPurchase;", "Ldev/hyo/openiap/RequestPurchaseResult;", "value", "Ldev/hyo/openiap/Purchase;", "<init>", "(Ldev/hyo/openiap/Purchase;)V", "getValue", "()Ldev/hyo/openiap/Purchase;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequestPurchaseResultPurchase implements RequestPurchaseResult {
    public static final int $stable = 8;
    private final Purchase value;

    public static /* synthetic */ RequestPurchaseResultPurchase copy$default(RequestPurchaseResultPurchase requestPurchaseResultPurchase, Purchase purchase, int i, Object obj) {
        if ((i & 1) != 0) {
            purchase = requestPurchaseResultPurchase.value;
        }
        return requestPurchaseResultPurchase.copy(purchase);
    }

    /* renamed from: component1, reason: from getter */
    public final Purchase getValue() {
        return this.value;
    }

    public final RequestPurchaseResultPurchase copy(Purchase value) {
        return new RequestPurchaseResultPurchase(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RequestPurchaseResultPurchase) && Intrinsics.areEqual(this.value, ((RequestPurchaseResultPurchase) other).value);
    }

    public int hashCode() {
        Purchase purchase = this.value;
        if (purchase == null) {
            return 0;
        }
        return purchase.hashCode();
    }

    public String toString() {
        return "RequestPurchaseResultPurchase(value=" + this.value + ")";
    }

    public RequestPurchaseResultPurchase(Purchase purchase) {
        this.value = purchase;
    }

    public final Purchase getValue() {
        return this.value;
    }
}

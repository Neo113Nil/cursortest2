package dev.hyo.openiap;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Ldev/hyo/openiap/RequestPurchaseResultPurchases;", "Ldev/hyo/openiap/RequestPurchaseResult;", "value", "", "Ldev/hyo/openiap/Purchase;", "<init>", "(Ljava/util/List;)V", "getValue", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequestPurchaseResultPurchases implements RequestPurchaseResult {
    public static final int $stable = 8;
    private final List<Purchase> value;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RequestPurchaseResultPurchases copy$default(RequestPurchaseResultPurchases requestPurchaseResultPurchases, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = requestPurchaseResultPurchases.value;
        }
        return requestPurchaseResultPurchases.copy(list);
    }

    public final List<Purchase> component1() {
        return this.value;
    }

    public final RequestPurchaseResultPurchases copy(List<? extends Purchase> value) {
        return new RequestPurchaseResultPurchases(value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RequestPurchaseResultPurchases) && Intrinsics.areEqual(this.value, ((RequestPurchaseResultPurchases) other).value);
    }

    public int hashCode() {
        List<Purchase> list = this.value;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "RequestPurchaseResultPurchases(value=" + this.value + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RequestPurchaseResultPurchases(List<? extends Purchase> list) {
        this.value = list;
    }

    public final List<Purchase> getValue() {
        return this.value;
    }
}

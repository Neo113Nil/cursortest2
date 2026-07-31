package dev.hyo.openiap.store;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenIapStore.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u000bHÆ\u0003JG\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006)"}, d2 = {"Ldev/hyo/openiap/store/IapStatus;", "", "loadings", "Ldev/hyo/openiap/store/LoadingStates;", "lastPurchaseResult", "Ldev/hyo/openiap/store/PurchaseResultData;", "lastError", "Ldev/hyo/openiap/store/ErrorData;", "currentOperation", "Ldev/hyo/openiap/store/IapOperation;", "operationHistory", "", "<init>", "(Ldev/hyo/openiap/store/LoadingStates;Ldev/hyo/openiap/store/PurchaseResultData;Ldev/hyo/openiap/store/ErrorData;Ldev/hyo/openiap/store/IapOperation;Ljava/util/List;)V", "getLoadings", "()Ldev/hyo/openiap/store/LoadingStates;", "getLastPurchaseResult", "()Ldev/hyo/openiap/store/PurchaseResultData;", "getLastError", "()Ldev/hyo/openiap/store/ErrorData;", "getCurrentOperation", "()Ldev/hyo/openiap/store/IapOperation;", "getOperationHistory", "()Ljava/util/List;", "isPurchasing", "", "productId", "", "isLoading", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IapStatus {
    public static final int $stable = 8;
    private final IapOperation currentOperation;
    private final ErrorData lastError;
    private final PurchaseResultData lastPurchaseResult;
    private final LoadingStates loadings;
    private final List<IapOperation> operationHistory;

    public IapStatus() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ IapStatus copy$default(IapStatus iapStatus, LoadingStates loadingStates, PurchaseResultData purchaseResultData, ErrorData errorData, IapOperation iapOperation, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            loadingStates = iapStatus.loadings;
        }
        if ((i & 2) != 0) {
            purchaseResultData = iapStatus.lastPurchaseResult;
        }
        if ((i & 4) != 0) {
            errorData = iapStatus.lastError;
        }
        if ((i & 8) != 0) {
            iapOperation = iapStatus.currentOperation;
        }
        if ((i & 16) != 0) {
            list = iapStatus.operationHistory;
        }
        List list2 = list;
        ErrorData errorData2 = errorData;
        return iapStatus.copy(loadingStates, purchaseResultData, errorData2, iapOperation, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final LoadingStates getLoadings() {
        return this.loadings;
    }

    /* renamed from: component2, reason: from getter */
    public final PurchaseResultData getLastPurchaseResult() {
        return this.lastPurchaseResult;
    }

    /* renamed from: component3, reason: from getter */
    public final ErrorData getLastError() {
        return this.lastError;
    }

    /* renamed from: component4, reason: from getter */
    public final IapOperation getCurrentOperation() {
        return this.currentOperation;
    }

    public final List<IapOperation> component5() {
        return this.operationHistory;
    }

    public final IapStatus copy(LoadingStates loadings, PurchaseResultData lastPurchaseResult, ErrorData lastError, IapOperation currentOperation, List<IapOperation> operationHistory) {
        Intrinsics.checkNotNullParameter(loadings, "loadings");
        Intrinsics.checkNotNullParameter(operationHistory, "operationHistory");
        return new IapStatus(loadings, lastPurchaseResult, lastError, currentOperation, operationHistory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IapStatus)) {
            return false;
        }
        IapStatus iapStatus = (IapStatus) other;
        return Intrinsics.areEqual(this.loadings, iapStatus.loadings) && Intrinsics.areEqual(this.lastPurchaseResult, iapStatus.lastPurchaseResult) && Intrinsics.areEqual(this.lastError, iapStatus.lastError) && Intrinsics.areEqual(this.currentOperation, iapStatus.currentOperation) && Intrinsics.areEqual(this.operationHistory, iapStatus.operationHistory);
    }

    public int hashCode() {
        int hashCode = this.loadings.hashCode() * 31;
        PurchaseResultData purchaseResultData = this.lastPurchaseResult;
        int hashCode2 = (hashCode + (purchaseResultData == null ? 0 : purchaseResultData.hashCode())) * 31;
        ErrorData errorData = this.lastError;
        int hashCode3 = (hashCode2 + (errorData == null ? 0 : errorData.hashCode())) * 31;
        IapOperation iapOperation = this.currentOperation;
        return ((hashCode3 + (iapOperation != null ? iapOperation.hashCode() : 0)) * 31) + this.operationHistory.hashCode();
    }

    public String toString() {
        return "IapStatus(loadings=" + this.loadings + ", lastPurchaseResult=" + this.lastPurchaseResult + ", lastError=" + this.lastError + ", currentOperation=" + this.currentOperation + ", operationHistory=" + this.operationHistory + ")";
    }

    public IapStatus(LoadingStates loadings, PurchaseResultData purchaseResultData, ErrorData errorData, IapOperation iapOperation, List<IapOperation> operationHistory) {
        Intrinsics.checkNotNullParameter(loadings, "loadings");
        Intrinsics.checkNotNullParameter(operationHistory, "operationHistory");
        this.loadings = loadings;
        this.lastPurchaseResult = purchaseResultData;
        this.lastError = errorData;
        this.currentOperation = iapOperation;
        this.operationHistory = operationHistory;
    }

    public /* synthetic */ IapStatus(LoadingStates loadingStates, PurchaseResultData purchaseResultData, ErrorData errorData, IapOperation iapOperation, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LoadingStates(false, false, false, null, 15, null) : loadingStates, (i & 2) != 0 ? null : purchaseResultData, (i & 4) != 0 ? null : errorData, (i & 8) != 0 ? null : iapOperation, (i & 16) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final LoadingStates getLoadings() {
        return this.loadings;
    }

    public final PurchaseResultData getLastPurchaseResult() {
        return this.lastPurchaseResult;
    }

    public final ErrorData getLastError() {
        return this.lastError;
    }

    public final IapOperation getCurrentOperation() {
        return this.currentOperation;
    }

    public final List<IapOperation> getOperationHistory() {
        return this.operationHistory;
    }

    public final boolean isPurchasing(String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return this.loadings.getPurchasing().contains(productId);
    }

    public final boolean isLoading() {
        return this.loadings.getInitConnection() || this.loadings.getFetchProducts() || this.loadings.getRestorePurchases() || !this.loadings.getPurchasing().isEmpty();
    }
}

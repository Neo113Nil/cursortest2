package dev.hyo.openiap.store;

import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenIapStore.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Ldev/hyo/openiap/store/IapOperation;", "", WebViewManager.EVENT_TYPE_KEY, "Ldev/hyo/openiap/store/IapOperationType;", "productId", "", "timestamp", "", "result", "Ldev/hyo/openiap/store/IapOperationResult;", "<init>", "(Ldev/hyo/openiap/store/IapOperationType;Ljava/lang/String;JLdev/hyo/openiap/store/IapOperationResult;)V", "getType", "()Ldev/hyo/openiap/store/IapOperationType;", "getProductId", "()Ljava/lang/String;", "getTimestamp", "()J", "getResult", "()Ldev/hyo/openiap/store/IapOperationResult;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IapOperation {
    public static final int $stable = 0;
    private final String productId;
    private final IapOperationResult result;
    private final long timestamp;
    private final IapOperationType type;

    public static /* synthetic */ IapOperation copy$default(IapOperation iapOperation, IapOperationType iapOperationType, String str, long j, IapOperationResult iapOperationResult, int i, Object obj) {
        if ((i & 1) != 0) {
            iapOperationType = iapOperation.type;
        }
        if ((i & 2) != 0) {
            str = iapOperation.productId;
        }
        if ((i & 4) != 0) {
            j = iapOperation.timestamp;
        }
        if ((i & 8) != 0) {
            iapOperationResult = iapOperation.result;
        }
        IapOperationResult iapOperationResult2 = iapOperationResult;
        return iapOperation.copy(iapOperationType, str, j, iapOperationResult2);
    }

    /* renamed from: component1, reason: from getter */
    public final IapOperationType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component4, reason: from getter */
    public final IapOperationResult getResult() {
        return this.result;
    }

    public final IapOperation copy(IapOperationType type, String productId, long timestamp, IapOperationResult result) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new IapOperation(type, productId, timestamp, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IapOperation)) {
            return false;
        }
        IapOperation iapOperation = (IapOperation) other;
        return this.type == iapOperation.type && Intrinsics.areEqual(this.productId, iapOperation.productId) && this.timestamp == iapOperation.timestamp && Intrinsics.areEqual(this.result, iapOperation.result);
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.productId;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.timestamp)) * 31;
        IapOperationResult iapOperationResult = this.result;
        return hashCode2 + (iapOperationResult != null ? iapOperationResult.hashCode() : 0);
    }

    public String toString() {
        return "IapOperation(type=" + this.type + ", productId=" + this.productId + ", timestamp=" + this.timestamp + ", result=" + this.result + ")";
    }

    public IapOperation(IapOperationType type, String str, long j, IapOperationResult iapOperationResult) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.productId = str;
        this.timestamp = j;
        this.result = iapOperationResult;
    }

    public final IapOperationType getType() {
        return this.type;
    }

    public final String getProductId() {
        return this.productId;
    }

    public /* synthetic */ IapOperation(IapOperationType iapOperationType, String str, long j, IapOperationResult iapOperationResult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iapOperationType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? System.currentTimeMillis() : j, (i & 8) != 0 ? null : iapOperationResult);
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final IapOperationResult getResult() {
        return this.result;
    }
}

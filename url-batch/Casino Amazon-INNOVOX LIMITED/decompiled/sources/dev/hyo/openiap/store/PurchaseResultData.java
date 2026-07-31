package dev.hyo.openiap.store;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenIapStore.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Ldev/hyo/openiap/store/PurchaseResultData;", "", "productId", "", "transactionId", "message", NotificationCompat.CATEGORY_STATUS, "Ldev/hyo/openiap/store/PurchaseResultStatus;", "code", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldev/hyo/openiap/store/PurchaseResultStatus;Ljava/lang/String;J)V", "getProductId", "()Ljava/lang/String;", "getTransactionId", "getMessage", "getStatus", "()Ldev/hyo/openiap/store/PurchaseResultStatus;", "getCode", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PurchaseResultData {
    public static final int $stable = 0;
    private final String code;
    private final String message;
    private final String productId;
    private final PurchaseResultStatus status;
    private final long timestamp;
    private final String transactionId;

    public static /* synthetic */ PurchaseResultData copy$default(PurchaseResultData purchaseResultData, String str, String str2, String str3, PurchaseResultStatus purchaseResultStatus, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = purchaseResultData.productId;
        }
        if ((i & 2) != 0) {
            str2 = purchaseResultData.transactionId;
        }
        if ((i & 4) != 0) {
            str3 = purchaseResultData.message;
        }
        if ((i & 8) != 0) {
            purchaseResultStatus = purchaseResultData.status;
        }
        if ((i & 16) != 0) {
            str4 = purchaseResultData.code;
        }
        if ((i & 32) != 0) {
            j = purchaseResultData.timestamp;
        }
        long j2 = j;
        String str5 = str4;
        String str6 = str3;
        return purchaseResultData.copy(str, str2, str6, purchaseResultStatus, str5, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component4, reason: from getter */
    public final PurchaseResultStatus getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component6, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final PurchaseResultData copy(String productId, String transactionId, String message, PurchaseResultStatus status, String code, long timestamp) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(status, "status");
        return new PurchaseResultData(productId, transactionId, message, status, code, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseResultData)) {
            return false;
        }
        PurchaseResultData purchaseResultData = (PurchaseResultData) other;
        return Intrinsics.areEqual(this.productId, purchaseResultData.productId) && Intrinsics.areEqual(this.transactionId, purchaseResultData.transactionId) && Intrinsics.areEqual(this.message, purchaseResultData.message) && this.status == purchaseResultData.status && Intrinsics.areEqual(this.code, purchaseResultData.code) && this.timestamp == purchaseResultData.timestamp;
    }

    public int hashCode() {
        String str = this.productId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.transactionId;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.message.hashCode()) * 31) + this.status.hashCode()) * 31;
        String str3 = this.code;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "PurchaseResultData(productId=" + this.productId + ", transactionId=" + this.transactionId + ", message=" + this.message + ", status=" + this.status + ", code=" + this.code + ", timestamp=" + this.timestamp + ")";
    }

    public PurchaseResultData(String str, String str2, String message, PurchaseResultStatus status, String str3, long j) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(status, "status");
        this.productId = str;
        this.transactionId = str2;
        this.message = message;
        this.status = status;
        this.code = str3;
        this.timestamp = j;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getMessage() {
        return this.message;
    }

    public /* synthetic */ PurchaseResultData(String str, String str2, String str3, PurchaseResultStatus purchaseResultStatus, String str4, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? PurchaseResultStatus.Success : purchaseResultStatus, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? System.currentTimeMillis() : j);
    }

    public final PurchaseResultStatus getStatus() {
        return this.status;
    }

    public final String getCode() {
        return this.code;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}

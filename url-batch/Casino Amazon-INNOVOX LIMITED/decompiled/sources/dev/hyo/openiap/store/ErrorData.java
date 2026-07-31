package dev.hyo.openiap.store;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenIapStore.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Ldev/hyo/openiap/store/ErrorData;", "", "code", "", "message", "productId", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getCode", "()Ljava/lang/String;", "getMessage", "getProductId", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ErrorData {
    public static final int $stable = 0;
    private final String code;
    private final String message;
    private final String productId;
    private final long timestamp;

    public static /* synthetic */ ErrorData copy$default(ErrorData errorData, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorData.code;
        }
        if ((i & 2) != 0) {
            str2 = errorData.message;
        }
        if ((i & 4) != 0) {
            str3 = errorData.productId;
        }
        if ((i & 8) != 0) {
            j = errorData.timestamp;
        }
        String str4 = str3;
        return errorData.copy(str, str2, str4, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final ErrorData copy(String code, String message, String productId, long timestamp) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        return new ErrorData(code, message, productId, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorData)) {
            return false;
        }
        ErrorData errorData = (ErrorData) other;
        return Intrinsics.areEqual(this.code, errorData.code) && Intrinsics.areEqual(this.message, errorData.message) && Intrinsics.areEqual(this.productId, errorData.productId) && this.timestamp == errorData.timestamp;
    }

    public int hashCode() {
        int hashCode = ((this.code.hashCode() * 31) + this.message.hashCode()) * 31;
        String str = this.productId;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "ErrorData(code=" + this.code + ", message=" + this.message + ", productId=" + this.productId + ", timestamp=" + this.timestamp + ")";
    }

    public ErrorData(String code, String message, String str, long j) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = code;
        this.message = message;
        this.productId = str;
        this.timestamp = j;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getProductId() {
        return this.productId;
    }

    public /* synthetic */ ErrorData(String str, String str2, String str3, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? System.currentTimeMillis() : j);
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}

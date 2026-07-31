package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001b"}, d2 = {"Ldev/hyo/openiap/PurchaseError;", "", "code", "Ldev/hyo/openiap/ErrorCode;", "message", "", "productId", "<init>", "(Ldev/hyo/openiap/ErrorCode;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ldev/hyo/openiap/ErrorCode;", "getMessage", "()Ljava/lang/String;", "getProductId", "toJson", "", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PurchaseError {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ErrorCode code;
    private final String message;
    private final String productId;

    public static /* synthetic */ PurchaseError copy$default(PurchaseError purchaseError, ErrorCode errorCode, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            errorCode = purchaseError.code;
        }
        if ((i & 2) != 0) {
            str = purchaseError.message;
        }
        if ((i & 4) != 0) {
            str2 = purchaseError.productId;
        }
        return purchaseError.copy(errorCode, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final ErrorCode getCode() {
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

    public final PurchaseError copy(ErrorCode code, String message, String productId) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        return new PurchaseError(code, message, productId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseError)) {
            return false;
        }
        PurchaseError purchaseError = (PurchaseError) other;
        return this.code == purchaseError.code && Intrinsics.areEqual(this.message, purchaseError.message) && Intrinsics.areEqual(this.productId, purchaseError.productId);
    }

    public int hashCode() {
        int hashCode = ((this.code.hashCode() * 31) + this.message.hashCode()) * 31;
        String str = this.productId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PurchaseError(code=" + this.code + ", message=" + this.message + ", productId=" + this.productId + ")";
    }

    public PurchaseError(ErrorCode code, String message, String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = code;
        this.message = message;
        this.productId = str;
    }

    public /* synthetic */ PurchaseError(ErrorCode errorCode, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorCode, str, (i & 4) != 0 ? null : str2);
    }

    public final ErrorCode getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getProductId() {
        return this.productId;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/PurchaseError$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/PurchaseError;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PurchaseError fromJson(Map<String, ? extends Object> json) {
            ErrorCode errorCode;
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("code");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null || (errorCode = ErrorCode.INSTANCE.fromJson(str)) == null) {
                errorCode = ErrorCode.Unknown;
            }
            Object obj2 = json.get("message");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 == null) {
                str2 = "";
            }
            Object obj3 = json.get("productId");
            return new PurchaseError(errorCode, str2, obj3 instanceof String ? (String) obj3 : null);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("__typename", "PurchaseError"), TuplesKt.to("code", this.code.toJson()), TuplesKt.to("message", this.message), TuplesKt.to("productId", this.productId));
    }
}

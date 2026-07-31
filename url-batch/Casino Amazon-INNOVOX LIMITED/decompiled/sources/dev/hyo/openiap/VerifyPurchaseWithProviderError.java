package dev.hyo.openiap;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Types.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Ldev/hyo/openiap/VerifyPurchaseWithProviderError;", "", "code", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMessage", "toJson", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VerifyPurchaseWithProviderError {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String code;
    private final String message;

    public static /* synthetic */ VerifyPurchaseWithProviderError copy$default(VerifyPurchaseWithProviderError verifyPurchaseWithProviderError, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyPurchaseWithProviderError.code;
        }
        if ((i & 2) != 0) {
            str2 = verifyPurchaseWithProviderError.message;
        }
        return verifyPurchaseWithProviderError.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final VerifyPurchaseWithProviderError copy(String code, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new VerifyPurchaseWithProviderError(code, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyPurchaseWithProviderError)) {
            return false;
        }
        VerifyPurchaseWithProviderError verifyPurchaseWithProviderError = (VerifyPurchaseWithProviderError) other;
        return Intrinsics.areEqual(this.code, verifyPurchaseWithProviderError.code) && Intrinsics.areEqual(this.message, verifyPurchaseWithProviderError.message);
    }

    public int hashCode() {
        String str = this.code;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "VerifyPurchaseWithProviderError(code=" + this.code + ", message=" + this.message + ")";
    }

    public VerifyPurchaseWithProviderError(String str, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = str;
        this.message = message;
    }

    public /* synthetic */ VerifyPurchaseWithProviderError(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    /* compiled from: Types.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¨\u0006\t"}, d2 = {"Ldev/hyo/openiap/VerifyPurchaseWithProviderError$Companion;", "", "<init>", "()V", "fromJson", "Ldev/hyo/openiap/VerifyPurchaseWithProviderError;", "json", "", "", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VerifyPurchaseWithProviderError fromJson(Map<String, ? extends Object> json) {
            Intrinsics.checkNotNullParameter(json, "json");
            Object obj = json.get("code");
            String str = obj instanceof String ? (String) obj : null;
            Object obj2 = json.get("message");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 == null) {
                str2 = "";
            }
            return new VerifyPurchaseWithProviderError(str, str2);
        }
    }

    public final Map<String, Object> toJson() {
        return MapsKt.mapOf(TuplesKt.to("__typename", "VerifyPurchaseWithProviderError"), TuplesKt.to("code", this.code), TuplesKt.to("message", this.message));
    }
}

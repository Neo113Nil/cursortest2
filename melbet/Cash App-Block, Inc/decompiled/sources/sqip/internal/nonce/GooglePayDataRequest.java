package sqip.internal.nonce;

import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lsqip/internal/nonce/GooglePayDataRequest;", "", "idempotency_key", "", "payment_method_token", "Lsqip/internal/nonce/GooglePayMethodToken;", "postal_code", "(Ljava/lang/String;Lsqip/internal/nonce/GooglePayMethodToken;Ljava/lang/String;)V", "getIdempotency_key", "()Ljava/lang/String;", "getPayment_method_token", "()Lsqip/internal/nonce/GooglePayMethodToken;", "getPostal_code", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "google-pay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GooglePayDataRequest {
    private final String idempotency_key;
    private final GooglePayMethodToken payment_method_token;
    private final String postal_code;

    public GooglePayDataRequest(String str, GooglePayMethodToken googlePayMethodToken, String str2) {
        str.getClass();
        googlePayMethodToken.getClass();
        this.idempotency_key = str;
        this.payment_method_token = googlePayMethodToken;
        this.postal_code = str2;
    }

    public static /* synthetic */ GooglePayDataRequest copy$default(GooglePayDataRequest googlePayDataRequest, String str, GooglePayMethodToken googlePayMethodToken, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = googlePayDataRequest.idempotency_key;
        }
        if ((i & 2) != 0) {
            googlePayMethodToken = googlePayDataRequest.payment_method_token;
        }
        if ((i & 4) != 0) {
            str2 = googlePayDataRequest.postal_code;
        }
        return googlePayDataRequest.copy(str, googlePayMethodToken, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIdempotency_key() {
        return this.idempotency_key;
    }

    /* renamed from: component2, reason: from getter */
    public final GooglePayMethodToken getPayment_method_token() {
        return this.payment_method_token;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPostal_code() {
        return this.postal_code;
    }

    public final GooglePayDataRequest copy(String idempotency_key, GooglePayMethodToken payment_method_token, String postal_code) {
        idempotency_key.getClass();
        payment_method_token.getClass();
        return new GooglePayDataRequest(idempotency_key, payment_method_token, postal_code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePayDataRequest)) {
            return false;
        }
        GooglePayDataRequest googlePayDataRequest = (GooglePayDataRequest) other;
        return Intrinsics.areEqual(this.idempotency_key, googlePayDataRequest.idempotency_key) && Intrinsics.areEqual(this.payment_method_token, googlePayDataRequest.payment_method_token) && Intrinsics.areEqual(this.postal_code, googlePayDataRequest.postal_code);
    }

    public final String getIdempotency_key() {
        return this.idempotency_key;
    }

    public final GooglePayMethodToken getPayment_method_token() {
        return this.payment_method_token;
    }

    public final String getPostal_code() {
        return this.postal_code;
    }

    public int hashCode() {
        int hashCode = (this.payment_method_token.hashCode() + (this.idempotency_key.hashCode() * 31)) * 31;
        String str = this.postal_code;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.idempotency_key;
        GooglePayMethodToken googlePayMethodToken = this.payment_method_token;
        String str2 = this.postal_code;
        StringBuilder sb = new StringBuilder("GooglePayDataRequest(idempotency_key=");
        sb.append(str);
        sb.append(", payment_method_token=");
        sb.append(googlePayMethodToken);
        sb.append(", postal_code=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, str2, ")");
    }
}

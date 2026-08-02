package sqip.internal.nonce;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsqip/internal/nonce/GooglePayMethodToken;", "", "tokenizationType", "", "token", "(Ljava/lang/String;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getTokenizationType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "google-pay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GooglePayMethodToken {
    private final String token;
    private final String tokenizationType;

    public GooglePayMethodToken(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.tokenizationType = str;
        this.token = str2;
    }

    public static /* synthetic */ GooglePayMethodToken copy$default(GooglePayMethodToken googlePayMethodToken, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = googlePayMethodToken.tokenizationType;
        }
        if ((i & 2) != 0) {
            str2 = googlePayMethodToken.token;
        }
        return googlePayMethodToken.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTokenizationType() {
        return this.tokenizationType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final GooglePayMethodToken copy(String tokenizationType, String token) {
        tokenizationType.getClass();
        token.getClass();
        return new GooglePayMethodToken(tokenizationType, token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePayMethodToken)) {
            return false;
        }
        GooglePayMethodToken googlePayMethodToken = (GooglePayMethodToken) other;
        return Intrinsics.areEqual(this.tokenizationType, googlePayMethodToken.tokenizationType) && Intrinsics.areEqual(this.token, googlePayMethodToken.token);
    }

    public final String getToken() {
        return this.token;
    }

    public final String getTokenizationType() {
        return this.tokenizationType;
    }

    public int hashCode() {
        return this.token.hashCode() + (this.tokenizationType.hashCode() * 31);
    }

    public String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("GooglePayMethodToken(tokenizationType=", this.tokenizationType, ", token=", this.token, ")");
    }

    public /* synthetic */ GooglePayMethodToken(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "PAYMENT_GATEWAY" : str, str2);
    }
}

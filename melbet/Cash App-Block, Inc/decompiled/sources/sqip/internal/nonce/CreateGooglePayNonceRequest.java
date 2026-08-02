package sqip.internal.nonce;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lsqip/internal/nonce/CreateGooglePayNonceRequest;", "", "client_id", "", "googlepay_data", "Lsqip/internal/nonce/GooglePayDataRequest;", "s", "Lsqip/internal/nonce/DeviceInfoRequest;", "(Ljava/lang/String;Lsqip/internal/nonce/GooglePayDataRequest;Lsqip/internal/nonce/DeviceInfoRequest;)V", "getClient_id", "()Ljava/lang/String;", "getGooglepay_data", "()Lsqip/internal/nonce/GooglePayDataRequest;", "getS", "()Lsqip/internal/nonce/DeviceInfoRequest;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "google-pay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CreateGooglePayNonceRequest {
    private final String client_id;
    private final GooglePayDataRequest googlepay_data;
    private final DeviceInfoRequest s;

    public CreateGooglePayNonceRequest(String str, GooglePayDataRequest googlePayDataRequest, DeviceInfoRequest deviceInfoRequest) {
        str.getClass();
        googlePayDataRequest.getClass();
        deviceInfoRequest.getClass();
        this.client_id = str;
        this.googlepay_data = googlePayDataRequest;
        this.s = deviceInfoRequest;
    }

    public static /* synthetic */ CreateGooglePayNonceRequest copy$default(CreateGooglePayNonceRequest createGooglePayNonceRequest, String str, GooglePayDataRequest googlePayDataRequest, DeviceInfoRequest deviceInfoRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createGooglePayNonceRequest.client_id;
        }
        if ((i & 2) != 0) {
            googlePayDataRequest = createGooglePayNonceRequest.googlepay_data;
        }
        if ((i & 4) != 0) {
            deviceInfoRequest = createGooglePayNonceRequest.s;
        }
        return createGooglePayNonceRequest.copy(str, googlePayDataRequest, deviceInfoRequest);
    }

    /* renamed from: component1, reason: from getter */
    public final String getClient_id() {
        return this.client_id;
    }

    /* renamed from: component2, reason: from getter */
    public final GooglePayDataRequest getGooglepay_data() {
        return this.googlepay_data;
    }

    /* renamed from: component3, reason: from getter */
    public final DeviceInfoRequest getS() {
        return this.s;
    }

    public final CreateGooglePayNonceRequest copy(String client_id, GooglePayDataRequest googlepay_data, DeviceInfoRequest s) {
        client_id.getClass();
        googlepay_data.getClass();
        s.getClass();
        return new CreateGooglePayNonceRequest(client_id, googlepay_data, s);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateGooglePayNonceRequest)) {
            return false;
        }
        CreateGooglePayNonceRequest createGooglePayNonceRequest = (CreateGooglePayNonceRequest) other;
        return Intrinsics.areEqual(this.client_id, createGooglePayNonceRequest.client_id) && Intrinsics.areEqual(this.googlepay_data, createGooglePayNonceRequest.googlepay_data) && Intrinsics.areEqual(this.s, createGooglePayNonceRequest.s);
    }

    public final String getClient_id() {
        return this.client_id;
    }

    public final GooglePayDataRequest getGooglepay_data() {
        return this.googlepay_data;
    }

    public final DeviceInfoRequest getS() {
        return this.s;
    }

    public int hashCode() {
        return this.s.hashCode() + ((this.googlepay_data.hashCode() + (this.client_id.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "CreateGooglePayNonceRequest(client_id=" + this.client_id + ", googlepay_data=" + this.googlepay_data + ", s=" + this.s + ")";
    }
}

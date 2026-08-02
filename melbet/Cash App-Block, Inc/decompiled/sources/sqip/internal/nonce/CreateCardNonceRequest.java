package sqip.internal.nonce;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lsqip/internal/nonce/CreateCardNonceRequest;", "", "client_id", "", "card_data", "Lsqip/internal/nonce/CardDataRequest;", "giftcard_data", "Lsqip/internal/nonce/GiftCardDataRequest;", "s", "Lsqip/internal/nonce/DeviceInfoRequest;", "(Ljava/lang/String;Lsqip/internal/nonce/CardDataRequest;Lsqip/internal/nonce/GiftCardDataRequest;Lsqip/internal/nonce/DeviceInfoRequest;)V", "getCard_data", "()Lsqip/internal/nonce/CardDataRequest;", "getClient_id", "()Ljava/lang/String;", "getGiftcard_data", "()Lsqip/internal/nonce/GiftCardDataRequest;", "getS", "()Lsqip/internal/nonce/DeviceInfoRequest;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CreateCardNonceRequest {
    private final CardDataRequest card_data;
    private final String client_id;
    private final GiftCardDataRequest giftcard_data;
    private final DeviceInfoRequest s;

    public CreateCardNonceRequest(String str, CardDataRequest cardDataRequest, GiftCardDataRequest giftCardDataRequest, DeviceInfoRequest deviceInfoRequest) {
        str.getClass();
        deviceInfoRequest.getClass();
        this.client_id = str;
        this.card_data = cardDataRequest;
        this.giftcard_data = giftCardDataRequest;
        this.s = deviceInfoRequest;
    }

    public static /* synthetic */ CreateCardNonceRequest copy$default(CreateCardNonceRequest createCardNonceRequest, String str, CardDataRequest cardDataRequest, GiftCardDataRequest giftCardDataRequest, DeviceInfoRequest deviceInfoRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createCardNonceRequest.client_id;
        }
        if ((i & 2) != 0) {
            cardDataRequest = createCardNonceRequest.card_data;
        }
        if ((i & 4) != 0) {
            giftCardDataRequest = createCardNonceRequest.giftcard_data;
        }
        if ((i & 8) != 0) {
            deviceInfoRequest = createCardNonceRequest.s;
        }
        return createCardNonceRequest.copy(str, cardDataRequest, giftCardDataRequest, deviceInfoRequest);
    }

    /* renamed from: component1, reason: from getter */
    public final String getClient_id() {
        return this.client_id;
    }

    /* renamed from: component2, reason: from getter */
    public final CardDataRequest getCard_data() {
        return this.card_data;
    }

    /* renamed from: component3, reason: from getter */
    public final GiftCardDataRequest getGiftcard_data() {
        return this.giftcard_data;
    }

    /* renamed from: component4, reason: from getter */
    public final DeviceInfoRequest getS() {
        return this.s;
    }

    public final CreateCardNonceRequest copy(String client_id, CardDataRequest card_data, GiftCardDataRequest giftcard_data, DeviceInfoRequest s) {
        client_id.getClass();
        s.getClass();
        return new CreateCardNonceRequest(client_id, card_data, giftcard_data, s);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateCardNonceRequest)) {
            return false;
        }
        CreateCardNonceRequest createCardNonceRequest = (CreateCardNonceRequest) other;
        return Intrinsics.areEqual(this.client_id, createCardNonceRequest.client_id) && Intrinsics.areEqual(this.card_data, createCardNonceRequest.card_data) && Intrinsics.areEqual(this.giftcard_data, createCardNonceRequest.giftcard_data) && Intrinsics.areEqual(this.s, createCardNonceRequest.s);
    }

    public final CardDataRequest getCard_data() {
        return this.card_data;
    }

    public final String getClient_id() {
        return this.client_id;
    }

    public final GiftCardDataRequest getGiftcard_data() {
        return this.giftcard_data;
    }

    public final DeviceInfoRequest getS() {
        return this.s;
    }

    public int hashCode() {
        int hashCode = this.client_id.hashCode() * 31;
        CardDataRequest cardDataRequest = this.card_data;
        int hashCode2 = (hashCode + (cardDataRequest == null ? 0 : cardDataRequest.hashCode())) * 31;
        GiftCardDataRequest giftCardDataRequest = this.giftcard_data;
        return this.s.hashCode() + ((hashCode2 + (giftCardDataRequest != null ? giftCardDataRequest.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "CreateCardNonceRequest(client_id=" + this.client_id + ", card_data=" + this.card_data + ", giftcard_data=" + this.giftcard_data + ", s=" + this.s + ")";
    }
}

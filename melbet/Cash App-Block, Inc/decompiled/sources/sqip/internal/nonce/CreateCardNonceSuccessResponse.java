package sqip.internal.nonce;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import sqip.internal.CardDataResponse;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lsqip/internal/nonce/CreateCardNonceSuccessResponse;", "", "card_nonce", "", "card", "Lsqip/internal/CardDataResponse;", "(Ljava/lang/String;Lsqip/internal/CardDataResponse;)V", "getCard", "()Lsqip/internal/CardDataResponse;", "getCard_nonce", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CreateCardNonceSuccessResponse {
    private final CardDataResponse card;
    private final String card_nonce;

    public CreateCardNonceSuccessResponse(String str, CardDataResponse cardDataResponse) {
        str.getClass();
        cardDataResponse.getClass();
        this.card_nonce = str;
        this.card = cardDataResponse;
    }

    public static /* synthetic */ CreateCardNonceSuccessResponse copy$default(CreateCardNonceSuccessResponse createCardNonceSuccessResponse, String str, CardDataResponse cardDataResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createCardNonceSuccessResponse.card_nonce;
        }
        if ((i & 2) != 0) {
            cardDataResponse = createCardNonceSuccessResponse.card;
        }
        return createCardNonceSuccessResponse.copy(str, cardDataResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCard_nonce() {
        return this.card_nonce;
    }

    /* renamed from: component2, reason: from getter */
    public final CardDataResponse getCard() {
        return this.card;
    }

    public final CreateCardNonceSuccessResponse copy(String card_nonce, CardDataResponse card) {
        card_nonce.getClass();
        card.getClass();
        return new CreateCardNonceSuccessResponse(card_nonce, card);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateCardNonceSuccessResponse)) {
            return false;
        }
        CreateCardNonceSuccessResponse createCardNonceSuccessResponse = (CreateCardNonceSuccessResponse) other;
        return Intrinsics.areEqual(this.card_nonce, createCardNonceSuccessResponse.card_nonce) && Intrinsics.areEqual(this.card, createCardNonceSuccessResponse.card);
    }

    public final CardDataResponse getCard() {
        return this.card;
    }

    public final String getCard_nonce() {
        return this.card_nonce;
    }

    public int hashCode() {
        return this.card.hashCode() + (this.card_nonce.hashCode() * 31);
    }

    public String toString() {
        return "CreateCardNonceSuccessResponse(card_nonce=" + this.card_nonce + ", card=" + this.card + ")";
    }
}

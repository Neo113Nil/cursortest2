package sqip.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import sqip.Card;
import sqip.CardDetails;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lsqip/internal/CardEntryResult;", "", "()V", "CardAndNonceResult", "RawResult", "Lsqip/internal/CardEntryResult$CardAndNonceResult;", "Lsqip/internal/CardEntryResult$RawResult;", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class CardEntryResult {

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lsqip/internal/CardEntryResult$CardAndNonceResult;", "Lsqip/internal/CardEntryResult;", "Lsqip/CardDetails;", "nonce", "", "card", "Lsqip/Card;", "(Ljava/lang/String;Lsqip/Card;)V", "getCard", "()Lsqip/Card;", "getNonce", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CardAndNonceResult extends CardEntryResult implements CardDetails {
        private final Card card;
        private final String nonce;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardAndNonceResult(String str, Card card) {
            super(null);
            str.getClass();
            card.getClass();
            this.nonce = str;
            this.card = card;
        }

        public static /* synthetic */ CardAndNonceResult copy$default(CardAndNonceResult cardAndNonceResult, String str, Card card, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cardAndNonceResult.nonce;
            }
            if ((i & 2) != 0) {
                card = cardAndNonceResult.card;
            }
            return cardAndNonceResult.copy(str, card);
        }

        /* renamed from: component1, reason: from getter */
        public final String getNonce() {
            return this.nonce;
        }

        /* renamed from: component2, reason: from getter */
        public final Card getCard() {
            return this.card;
        }

        public final CardAndNonceResult copy(String nonce, Card card) {
            nonce.getClass();
            card.getClass();
            return new CardAndNonceResult(nonce, card);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardAndNonceResult)) {
                return false;
            }
            CardAndNonceResult cardAndNonceResult = (CardAndNonceResult) other;
            return Intrinsics.areEqual(this.nonce, cardAndNonceResult.nonce) && Intrinsics.areEqual(this.card, cardAndNonceResult.card);
        }

        @Override // sqip.CardDetails
        public Card getCard() {
            return this.card;
        }

        @Override // sqip.CardDetails
        public String getNonce() {
            return this.nonce;
        }

        public int hashCode() {
            return this.card.hashCode() + (this.nonce.hashCode() * 31);
        }

        public String toString() {
            return "CardAndNonceResult(nonce=" + this.nonce + ", card=" + this.card + ")";
        }
    }

    public /* synthetic */ CardEntryResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lsqip/internal/CardEntryResult$RawResult;", "Lsqip/internal/CardEntryResult;", "()V", "cardNumber", "", "getCardNumber", "()Ljava/lang/String;", "RawCreditCardResult", "RawGiftCardResult", "Lsqip/internal/CardEntryResult$RawResult$RawCreditCardResult;", "Lsqip/internal/CardEntryResult$RawResult$RawGiftCardResult;", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class RawResult extends CardEntryResult {

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lsqip/internal/CardEntryResult$RawResult$RawCreditCardResult;", "Lsqip/internal/CardEntryResult$RawResult;", "cardNumber", "", "cvv", "expirationMonth", "", "expirationYear", "postCode", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getCardNumber", "()Ljava/lang/String;", "getCvv", "getExpirationMonth", "()I", "getExpirationYear", "getPostCode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RawCreditCardResult extends RawResult {
            private final String cardNumber;
            private final String cvv;
            private final int expirationMonth;
            private final int expirationYear;
            private final String postCode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RawCreditCardResult(String str, String str2, int i, int i2, String str3) {
                super(null);
                str.getClass();
                str2.getClass();
                this.cardNumber = str;
                this.cvv = str2;
                this.expirationMonth = i;
                this.expirationYear = i2;
                this.postCode = str3;
            }

            public static /* synthetic */ RawCreditCardResult copy$default(RawCreditCardResult rawCreditCardResult, String str, String str2, int i, int i2, String str3, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = rawCreditCardResult.cardNumber;
                }
                if ((i3 & 2) != 0) {
                    str2 = rawCreditCardResult.cvv;
                }
                if ((i3 & 4) != 0) {
                    i = rawCreditCardResult.expirationMonth;
                }
                if ((i3 & 8) != 0) {
                    i2 = rawCreditCardResult.expirationYear;
                }
                if ((i3 & 16) != 0) {
                    str3 = rawCreditCardResult.postCode;
                }
                String str4 = str3;
                int i4 = i;
                return rawCreditCardResult.copy(str, str2, i4, i2, str4);
            }

            /* renamed from: component1, reason: from getter */
            public final String getCardNumber() {
                return this.cardNumber;
            }

            /* renamed from: component2, reason: from getter */
            public final String getCvv() {
                return this.cvv;
            }

            /* renamed from: component3, reason: from getter */
            public final int getExpirationMonth() {
                return this.expirationMonth;
            }

            /* renamed from: component4, reason: from getter */
            public final int getExpirationYear() {
                return this.expirationYear;
            }

            /* renamed from: component5, reason: from getter */
            public final String getPostCode() {
                return this.postCode;
            }

            public final RawCreditCardResult copy(String cardNumber, String cvv, int expirationMonth, int expirationYear, String postCode) {
                cardNumber.getClass();
                cvv.getClass();
                return new RawCreditCardResult(cardNumber, cvv, expirationMonth, expirationYear, postCode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RawCreditCardResult)) {
                    return false;
                }
                RawCreditCardResult rawCreditCardResult = (RawCreditCardResult) other;
                return Intrinsics.areEqual(this.cardNumber, rawCreditCardResult.cardNumber) && Intrinsics.areEqual(this.cvv, rawCreditCardResult.cvv) && this.expirationMonth == rawCreditCardResult.expirationMonth && this.expirationYear == rawCreditCardResult.expirationYear && Intrinsics.areEqual(this.postCode, rawCreditCardResult.postCode);
            }

            @Override // sqip.internal.CardEntryResult.RawResult
            public String getCardNumber() {
                return this.cardNumber;
            }

            public final String getCvv() {
                return this.cvv;
            }

            public final int getExpirationMonth() {
                return this.expirationMonth;
            }

            public final int getExpirationYear() {
                return this.expirationYear;
            }

            public final String getPostCode() {
                return this.postCode;
            }

            public int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.expirationYear, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.expirationMonth, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.cardNumber.hashCode() * 31, 31, this.cvv), 31), 31);
                String str = this.postCode;
                return m + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                String str = this.cardNumber;
                String str2 = this.cvv;
                int i = this.expirationMonth;
                int i2 = this.expirationYear;
                String str3 = this.postCode;
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RawCreditCardResult(cardNumber=", str, ", cvv=", str2, ", expirationMonth=");
                Recorder$$ExternalSyntheticOutline1.m105m(i, i2, ", expirationYear=", ", postCode=", m);
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, str3, ")");
            }
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lsqip/internal/CardEntryResult$RawResult$RawGiftCardResult;", "Lsqip/internal/CardEntryResult$RawResult;", "cardNumber", "", "(Ljava/lang/String;)V", "getCardNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RawGiftCardResult extends RawResult {
            private final String cardNumber;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RawGiftCardResult(String str) {
                super(null);
                str.getClass();
                this.cardNumber = str;
            }

            public static /* synthetic */ RawGiftCardResult copy$default(RawGiftCardResult rawGiftCardResult, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = rawGiftCardResult.cardNumber;
                }
                return rawGiftCardResult.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getCardNumber() {
                return this.cardNumber;
            }

            public final RawGiftCardResult copy(String cardNumber) {
                cardNumber.getClass();
                return new RawGiftCardResult(cardNumber);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RawGiftCardResult) && Intrinsics.areEqual(this.cardNumber, ((RawGiftCardResult) other).cardNumber);
            }

            @Override // sqip.internal.CardEntryResult.RawResult
            public String getCardNumber() {
                return this.cardNumber;
            }

            public int hashCode() {
                return this.cardNumber.hashCode();
            }

            public String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RawGiftCardResult(cardNumber=", this.cardNumber, ")");
            }
        }

        private RawResult() {
            super(null);
        }

        public abstract String getCardNumber();

        public /* synthetic */ RawResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private CardEntryResult() {
    }
}

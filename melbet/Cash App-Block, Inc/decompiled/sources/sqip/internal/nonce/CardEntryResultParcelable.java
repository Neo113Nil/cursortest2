package sqip.internal.nonce;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Tags;
import sqip.Card;
import sqip.internal.CardEntryResult;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lsqip/internal/nonce/CardEntryResultParcelable;", "Landroid/os/Parcelable;", "result", "Lsqip/internal/CardEntryResult;", "(Lsqip/internal/CardEntryResult;)V", "getResult", "()Lsqip/internal/CardEntryResult;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "CREATOR", "ResultTypes", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CardEntryResultParcelable implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CardEntryResult result;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lsqip/internal/nonce/CardEntryResultParcelable$ResultTypes;", "", "(Ljava/lang/String;I)V", "CARD_AND_NONCE", "CREDIT_CARD", "GIFT_CARD", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResultTypes {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ResultTypes[] $VALUES;
        public static final ResultTypes CARD_AND_NONCE = new ResultTypes("CARD_AND_NONCE", 0);
        public static final ResultTypes CREDIT_CARD = new ResultTypes("CREDIT_CARD", 1);
        public static final ResultTypes GIFT_CARD = new ResultTypes("GIFT_CARD", 2);

        private static final /* synthetic */ ResultTypes[] $values() {
            return new ResultTypes[]{CARD_AND_NONCE, CREDIT_CARD, GIFT_CARD};
        }

        static {
            ResultTypes[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
        }

        private ResultTypes(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static ResultTypes valueOf(String str) {
            return (ResultTypes) Enum.valueOf(ResultTypes.class, str);
        }

        public static ResultTypes[] values() {
            return (ResultTypes[]) $VALUES.clone();
        }
    }

    public CardEntryResultParcelable(CardEntryResult cardEntryResult) {
        cardEntryResult.getClass();
        this.result = cardEntryResult;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final CardEntryResult getResult() {
        return this.result;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.getClass();
        CardEntryResult cardEntryResult = this.result;
        if (cardEntryResult instanceof CardEntryResult.CardAndNonceResult) {
            parcel.writeInt(ResultTypes.CARD_AND_NONCE.ordinal());
            CardEntryResult.CardAndNonceResult cardAndNonceResult = (CardEntryResult.CardAndNonceResult) this.result;
            parcel.writeString(cardAndNonceResult.getNonce());
            Card card = cardAndNonceResult.getCard();
            parcel.writeString(card.getBrand().name());
            parcel.writeString(card.getLastFourDigits());
            parcel.writeInt(card.getExpirationMonth());
            parcel.writeInt(card.getExpirationYear());
            parcel.writeString(card.getPostalCode());
            parcel.writeString(card.getType().name());
            parcel.writeString(card.getPrepaidType().name());
            return;
        }
        if (!(cardEntryResult instanceof CardEntryResult.RawResult.RawCreditCardResult)) {
            if (cardEntryResult instanceof CardEntryResult.RawResult.RawGiftCardResult) {
                parcel.writeInt(ResultTypes.GIFT_CARD.ordinal());
                parcel.writeString(((CardEntryResult.RawResult.RawGiftCardResult) this.result).getCardNumber());
                return;
            }
            return;
        }
        parcel.writeInt(ResultTypes.CREDIT_CARD.ordinal());
        CardEntryResult.RawResult.RawCreditCardResult rawCreditCardResult = (CardEntryResult.RawResult.RawCreditCardResult) this.result;
        parcel.writeString(rawCreditCardResult.getCardNumber());
        parcel.writeString(rawCreditCardResult.getCvv());
        parcel.writeInt(rawCreditCardResult.getExpirationMonth());
        parcel.writeInt(rawCreditCardResult.getExpirationYear());
        parcel.writeString(rawCreditCardResult.getPostCode());
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lsqip/internal/nonce/CardEntryResultParcelable$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lsqip/internal/nonce/CardEntryResultParcelable;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lsqip/internal/nonce/CardEntryResultParcelable;", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sqip.internal.nonce.CardEntryResultParcelable$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<CardEntryResultParcelable> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public CardEntryResultParcelable createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new CardEntryResultParcelable(CardEntryResultParcelableKt.readCardResult(parcel));
        }

        private Companion() {
        }

        @Override // android.os.Parcelable.Creator
        public CardEntryResultParcelable[] newArray(int size) {
            return new CardEntryResultParcelable[size];
        }
    }
}

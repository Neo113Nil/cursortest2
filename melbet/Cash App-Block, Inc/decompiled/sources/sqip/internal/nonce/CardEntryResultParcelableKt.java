package sqip.internal.nonce;

import android.os.Parcel;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import sqip.Card;
import sqip.internal.CardEntryResult;
import sqip.internal.nonce.CardEntryResultParcelable;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"readCardResult", "Lsqip/internal/CardEntryResult;", "Landroid/os/Parcel;", "card-entry_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CardEntryResultParcelableKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardEntryResultParcelable.ResultTypes.values().length];
            try {
                iArr[CardEntryResultParcelable.ResultTypes.CARD_AND_NONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardEntryResultParcelable.ResultTypes.CREDIT_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardEntryResultParcelable.ResultTypes.GIFT_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final CardEntryResult readCardResult(Parcel parcel) {
        parcel.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[((CardEntryResultParcelable.ResultTypes) CardEntryResultParcelable.ResultTypes.getEntries().get(parcel.readInt())).ordinal()];
        if (i != 1) {
            if (i == 2) {
                String readString = parcel.readString();
                readString.getClass();
                String readString2 = parcel.readString();
                readString2.getClass();
                return new CardEntryResult.RawResult.RawCreditCardResult(readString, readString2, parcel.readInt(), parcel.readInt(), parcel.readString());
            }
            if (i != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            String readString3 = parcel.readString();
            readString3.getClass();
            return new CardEntryResult.RawResult.RawGiftCardResult(readString3);
        }
        String readString4 = parcel.readString();
        readString4.getClass();
        String readString5 = parcel.readString();
        readString5.getClass();
        Card.Brand valueOf = Card.Brand.valueOf(readString5);
        String readString6 = parcel.readString();
        readString6.getClass();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        readString8.getClass();
        Card.Type valueOf2 = Card.Type.valueOf(readString8);
        String readString9 = parcel.readString();
        readString9.getClass();
        return new CardEntryResult.CardAndNonceResult(readString4, new Card(valueOf, readString6, readInt, readInt2, readString7, valueOf2, Card.PrepaidType.valueOf(readString9)));
    }
}

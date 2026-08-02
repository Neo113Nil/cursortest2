package sqip.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.Card$Brand;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Tags;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sqip.internal.CardEditorState;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 N2\u00020\u0001:\u0003NOPB\u009d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013¢\u0006\u0002\u0010\u0017J\u0006\u0010+\u001a\u00020\u0013J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\t\u0010.\u001a\u00020\u0011HÆ\u0003J\t\u0010/\u001a\u00020\u0013HÆ\u0003J\t\u00100\u001a\u00020\u0013HÆ\u0003J\t\u00101\u001a\u00020\u0013HÆ\u0003J\t\u00102\u001a\u00020\u0013HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00107\u001a\u00020\nHÆ\u0003J\t\u00108\u001a\u00020\fHÆ\u0003J\t\u00109\u001a\u00020\fHÆ\u0003J\t\u0010:\u001a\u00020\fHÆ\u0003J¡\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013HÆ\u0001J\b\u0010<\u001a\u00020\u0011H\u0016J\u0013\u0010=\u001a\u00020\u00132\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\u0006\u0010@\u001a\u00020\u0013J\u0018\u0010A\u001a\u00020\u00132\b\u0010B\u001a\u0004\u0018\u00010\u00002\u0006\u0010C\u001a\u00020\u0003J\t\u0010D\u001a\u00020\u0011HÖ\u0001J\u0006\u0010E\u001a\u00020\u0013J\b\u0010F\u001a\u00020\u0013H\u0002J\b\u0010G\u001a\u00020\u0013H\u0002J\t\u0010H\u001a\u00020\u0005HÖ\u0001J\u0018\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u0011H\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010!R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010!R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001d¨\u0006Q"}, d2 = {"Lsqip/internal/CardEditorState;", "Landroid/os/Parcelable;", "focusedField", "Lsqip/internal/CardEditorState$Field;", "cardNumber", "", "expirationDate", "cvv", "postal", "brand", "Lcom/squareup/Card$Brand;", "cardNumberCompletionStatus", "Lsqip/internal/CardEditorState$CompletionStatus;", "expirationCompletionStatus", "cvvCompletionStatus", "postalCompletionStatus", "cardNumberCursorPosition", "", "collectPostalCode", "", "isProcessingRequest", "collectOnlyGiftCard", "isMasked", "(Lsqip/internal/CardEditorState$Field;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/Card$Brand;Lsqip/internal/CardEditorState$CompletionStatus;Lsqip/internal/CardEditorState$CompletionStatus;Lsqip/internal/CardEditorState$CompletionStatus;Lsqip/internal/CardEditorState$CompletionStatus;IZZZZ)V", "getBrand", "()Lcom/squareup/Card$Brand;", "getCardNumber", "()Ljava/lang/String;", "getCardNumberCompletionStatus", "()Lsqip/internal/CardEditorState$CompletionStatus;", "getCardNumberCursorPosition", "()I", "getCollectOnlyGiftCard", "()Z", "getCollectPostalCode", "getCvv", "getCvvCompletionStatus", "getExpirationCompletionStatus", "getExpirationDate", "getFocusedField", "()Lsqip/internal/CardEditorState$Field;", "getPostal", "getPostalCompletionStatus", "allFieldsValid", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hasError", "hasNewError", "previousState", "field", "hashCode", "isFocusedFieldInErrorState", "isValidCreditCard", "isValidGiftCard", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "CompletionStatus", "Field", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CardEditorState implements Parcelable {
    private final Card$Brand brand;
    private final String cardNumber;
    private final CompletionStatus cardNumberCompletionStatus;
    private final int cardNumberCursorPosition;
    private final boolean collectOnlyGiftCard;
    private final boolean collectPostalCode;
    private final String cvv;
    private final CompletionStatus cvvCompletionStatus;
    private final CompletionStatus expirationCompletionStatus;
    private final String expirationDate;
    private final Field focusedField;
    private final boolean isMasked;
    private final boolean isProcessingRequest;
    private final String postal;
    private final CompletionStatus postalCompletionStatus;
    public static final Parcelable.Creator<CardEditorState> CREATOR = new Parcelable.Creator<CardEditorState>() { // from class: sqip.internal.CardEditorState$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        public CardEditorState createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            readString.getClass();
            CardEditorState.Field valueOf = CardEditorState.Field.valueOf(readString);
            String readString2 = parcel.readString();
            readString2.getClass();
            String readString3 = parcel.readString();
            readString3.getClass();
            String readString4 = parcel.readString();
            readString4.getClass();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            readString6.getClass();
            Card$Brand valueOf2 = Card$Brand.valueOf(readString6);
            String readString7 = parcel.readString();
            readString7.getClass();
            CardEditorState.CompletionStatus valueOf3 = CardEditorState.CompletionStatus.valueOf(readString7);
            String readString8 = parcel.readString();
            readString8.getClass();
            CardEditorState.CompletionStatus valueOf4 = CardEditorState.CompletionStatus.valueOf(readString8);
            String readString9 = parcel.readString();
            readString9.getClass();
            CardEditorState.CompletionStatus valueOf5 = CardEditorState.CompletionStatus.valueOf(readString9);
            String readString10 = parcel.readString();
            readString10.getClass();
            return new CardEditorState(valueOf, readString2, readString3, readString4, readString5, valueOf2, valueOf3, valueOf4, valueOf5, CardEditorState.CompletionStatus.valueOf(readString10), parcel.readInt(), parcel.readByte() == 1, parcel.readByte() == 1, parcel.readByte() == 1, false, 16384, null);
        }

        @Override // android.os.Parcelable.Creator
        public CardEditorState[] newArray(int size) {
            return new CardEditorState[size];
        }
    };

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lsqip/internal/CardEditorState$CompletionStatus;", "", "(Ljava/lang/String;I)V", "VALID", "ERROR", "INCOMPLETE", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CompletionStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CompletionStatus[] $VALUES;
        public static final CompletionStatus VALID = new CompletionStatus("VALID", 0);
        public static final CompletionStatus ERROR = new CompletionStatus("ERROR", 1);
        public static final CompletionStatus INCOMPLETE = new CompletionStatus("INCOMPLETE", 2);

        private static final /* synthetic */ CompletionStatus[] $values() {
            return new CompletionStatus[]{VALID, ERROR, INCOMPLETE};
        }

        static {
            CompletionStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
        }

        private CompletionStatus(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static CompletionStatus valueOf(String str) {
            return (CompletionStatus) Enum.valueOf(CompletionStatus.class, str);
        }

        public static CompletionStatus[] values() {
            return (CompletionStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lsqip/internal/CardEditorState$Field;", "", "(Ljava/lang/String;I)V", "CARD_NUMBER", "EXPIRATION", "CVV", "POSTAL", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Field {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Field[] $VALUES;
        public static final Field CARD_NUMBER = new Field("CARD_NUMBER", 0);
        public static final Field EXPIRATION = new Field("EXPIRATION", 1);
        public static final Field CVV = new Field("CVV", 2);
        public static final Field POSTAL = new Field("POSTAL", 3);

        private static final /* synthetic */ Field[] $values() {
            return new Field[]{CARD_NUMBER, EXPIRATION, CVV, POSTAL};
        }

        static {
            Field[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
        }

        private Field(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Field valueOf(String str) {
            return (Field) Enum.valueOf(Field.class, str);
        }

        public static Field[] values() {
            return (Field[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Field.values().length];
            try {
                iArr[Field.CARD_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Field.EXPIRATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Field.CVV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Field.POSTAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CardEditorState(Field field, String str, String str2, String str3, String str4, Card$Brand card$Brand, CompletionStatus completionStatus, CompletionStatus completionStatus2, CompletionStatus completionStatus3, CompletionStatus completionStatus4, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Field.CARD_NUMBER : field, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) == 0 ? str3 : "", (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? Card$Brand.UNKNOWN : card$Brand, (i2 & 64) != 0 ? CompletionStatus.INCOMPLETE : completionStatus, (i2 & 128) != 0 ? CompletionStatus.INCOMPLETE : completionStatus2, (i2 & 256) != 0 ? CompletionStatus.INCOMPLETE : completionStatus3, (i2 & 512) != 0 ? CompletionStatus.INCOMPLETE : completionStatus4, (i2 & 1024) != 0 ? 0 : i, (i2 & 2048) != 0 ? true : z, (i2 & 4096) != 0 ? false : z2, (i2 & PKIFailureInfo.certRevoked) != 0 ? false : z3, (i2 & 16384) != 0 ? false : z4);
    }

    private final boolean isValidCreditCard() {
        CompletionStatus completionStatus = this.cardNumberCompletionStatus;
        CompletionStatus completionStatus2 = CompletionStatus.VALID;
        if (completionStatus == completionStatus2 && this.expirationCompletionStatus == completionStatus2 && this.cvvCompletionStatus == completionStatus2) {
            return this.postalCompletionStatus == completionStatus2 || !this.collectPostalCode;
        }
        return false;
    }

    private final boolean isValidGiftCard() {
        return this.cardNumberCompletionStatus == CompletionStatus.VALID && this.brand == Card$Brand.SQUARE_GIFT_CARD_V2;
    }

    public final boolean allFieldsValid() {
        if (isValidCreditCard()) {
            return true;
        }
        return isValidGiftCard() && this.collectOnlyGiftCard;
    }

    /* renamed from: component1, reason: from getter */
    public final Field getFocusedField() {
        return this.focusedField;
    }

    /* renamed from: component10, reason: from getter */
    public final CompletionStatus getPostalCompletionStatus() {
        return this.postalCompletionStatus;
    }

    /* renamed from: component11, reason: from getter */
    public final int getCardNumberCursorPosition() {
        return this.cardNumberCursorPosition;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getCollectPostalCode() {
        return this.collectPostalCode;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsProcessingRequest() {
        return this.isProcessingRequest;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getCollectOnlyGiftCard() {
        return this.collectOnlyGiftCard;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsMasked() {
        return this.isMasked;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCvv() {
        return this.cvv;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPostal() {
        return this.postal;
    }

    /* renamed from: component6, reason: from getter */
    public final Card$Brand getBrand() {
        return this.brand;
    }

    /* renamed from: component7, reason: from getter */
    public final CompletionStatus getCardNumberCompletionStatus() {
        return this.cardNumberCompletionStatus;
    }

    /* renamed from: component8, reason: from getter */
    public final CompletionStatus getExpirationCompletionStatus() {
        return this.expirationCompletionStatus;
    }

    /* renamed from: component9, reason: from getter */
    public final CompletionStatus getCvvCompletionStatus() {
        return this.cvvCompletionStatus;
    }

    public final CardEditorState copy(Field focusedField, String cardNumber, String expirationDate, String cvv, String postal, Card$Brand brand, CompletionStatus cardNumberCompletionStatus, CompletionStatus expirationCompletionStatus, CompletionStatus cvvCompletionStatus, CompletionStatus postalCompletionStatus, int cardNumberCursorPosition, boolean collectPostalCode, boolean isProcessingRequest, boolean collectOnlyGiftCard, boolean isMasked) {
        focusedField.getClass();
        cardNumber.getClass();
        expirationDate.getClass();
        cvv.getClass();
        brand.getClass();
        cardNumberCompletionStatus.getClass();
        expirationCompletionStatus.getClass();
        cvvCompletionStatus.getClass();
        postalCompletionStatus.getClass();
        return new CardEditorState(focusedField, cardNumber, expirationDate, cvv, postal, brand, cardNumberCompletionStatus, expirationCompletionStatus, cvvCompletionStatus, postalCompletionStatus, cardNumberCursorPosition, collectPostalCode, isProcessingRequest, collectOnlyGiftCard, isMasked);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardEditorState)) {
            return false;
        }
        CardEditorState cardEditorState = (CardEditorState) other;
        return this.focusedField == cardEditorState.focusedField && Intrinsics.areEqual(this.cardNumber, cardEditorState.cardNumber) && Intrinsics.areEqual(this.expirationDate, cardEditorState.expirationDate) && Intrinsics.areEqual(this.cvv, cardEditorState.cvv) && Intrinsics.areEqual(this.postal, cardEditorState.postal) && this.brand == cardEditorState.brand && this.cardNumberCompletionStatus == cardEditorState.cardNumberCompletionStatus && this.expirationCompletionStatus == cardEditorState.expirationCompletionStatus && this.cvvCompletionStatus == cardEditorState.cvvCompletionStatus && this.postalCompletionStatus == cardEditorState.postalCompletionStatus && this.cardNumberCursorPosition == cardEditorState.cardNumberCursorPosition && this.collectPostalCode == cardEditorState.collectPostalCode && this.isProcessingRequest == cardEditorState.isProcessingRequest && this.collectOnlyGiftCard == cardEditorState.collectOnlyGiftCard && this.isMasked == cardEditorState.isMasked;
    }

    public final Card$Brand getBrand() {
        return this.brand;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final CompletionStatus getCardNumberCompletionStatus() {
        return this.cardNumberCompletionStatus;
    }

    public final int getCardNumberCursorPosition() {
        return this.cardNumberCursorPosition;
    }

    public final boolean getCollectOnlyGiftCard() {
        return this.collectOnlyGiftCard;
    }

    public final boolean getCollectPostalCode() {
        return this.collectPostalCode;
    }

    public final String getCvv() {
        return this.cvv;
    }

    public final CompletionStatus getCvvCompletionStatus() {
        return this.cvvCompletionStatus;
    }

    public final CompletionStatus getExpirationCompletionStatus() {
        return this.expirationCompletionStatus;
    }

    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public final Field getFocusedField() {
        return this.focusedField;
    }

    public final String getPostal() {
        return this.postal;
    }

    public final CompletionStatus getPostalCompletionStatus() {
        return this.postalCompletionStatus;
    }

    public final boolean hasError() {
        CompletionStatus completionStatus = this.cardNumberCompletionStatus;
        CompletionStatus completionStatus2 = CompletionStatus.ERROR;
        return completionStatus == completionStatus2 || this.expirationCompletionStatus == completionStatus2 || this.cvvCompletionStatus == completionStatus2 || this.postalCompletionStatus == completionStatus2;
    }

    public final boolean hasNewError(CardEditorState previousState, Field field) {
        field.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[field.ordinal()];
        if (i == 1) {
            CompletionStatus completionStatus = this.cardNumberCompletionStatus;
            CompletionStatus completionStatus2 = CompletionStatus.ERROR;
            if (completionStatus == completionStatus2) {
                if ((previousState != null ? previousState.cardNumberCompletionStatus : null) != completionStatus2) {
                    return true;
                }
            }
            return false;
        }
        if (i == 2) {
            CompletionStatus completionStatus3 = this.expirationCompletionStatus;
            CompletionStatus completionStatus4 = CompletionStatus.ERROR;
            if (completionStatus3 == completionStatus4) {
                if ((previousState != null ? previousState.expirationCompletionStatus : null) != completionStatus4) {
                    return true;
                }
            }
            return false;
        }
        if (i == 3) {
            CompletionStatus completionStatus5 = this.cvvCompletionStatus;
            CompletionStatus completionStatus6 = CompletionStatus.ERROR;
            if (completionStatus5 == completionStatus6) {
                if ((previousState != null ? previousState.cvvCompletionStatus : null) != completionStatus6) {
                    return true;
                }
            }
            return false;
        }
        if (i != 4) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return false;
        }
        CompletionStatus completionStatus7 = this.postalCompletionStatus;
        CompletionStatus completionStatus8 = CompletionStatus.ERROR;
        if (completionStatus7 == completionStatus8) {
            if ((previousState != null ? previousState.postalCompletionStatus : null) != completionStatus8) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.focusedField.hashCode() * 31, 31, this.cardNumber), 31, this.expirationDate), 31, this.cvv);
        String str = this.postal;
        return Boolean.hashCode(this.isMasked) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.cardNumberCursorPosition, (this.postalCompletionStatus.hashCode() + ((this.cvvCompletionStatus.hashCode() + ((this.expirationCompletionStatus.hashCode() + ((this.cardNumberCompletionStatus.hashCode() + ((this.brand.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31, this.collectPostalCode), 31, this.isProcessingRequest), 31, this.collectOnlyGiftCard);
    }

    public final boolean isFocusedFieldInErrorState() {
        Field field = this.focusedField;
        if (field == Field.CARD_NUMBER && this.cardNumberCompletionStatus == CompletionStatus.ERROR) {
            return true;
        }
        if (field == Field.EXPIRATION && this.expirationCompletionStatus == CompletionStatus.ERROR) {
            return true;
        }
        if (field == Field.CVV && this.cvvCompletionStatus == CompletionStatus.ERROR) {
            return true;
        }
        return field == Field.POSTAL && this.postalCompletionStatus == CompletionStatus.ERROR;
    }

    public final boolean isMasked() {
        return this.isMasked;
    }

    public final boolean isProcessingRequest() {
        return this.isProcessingRequest;
    }

    public String toString() {
        Field field = this.focusedField;
        String str = this.cardNumber;
        String str2 = this.expirationDate;
        String str3 = this.cvv;
        String str4 = this.postal;
        Card$Brand card$Brand = this.brand;
        CompletionStatus completionStatus = this.cardNumberCompletionStatus;
        CompletionStatus completionStatus2 = this.expirationCompletionStatus;
        CompletionStatus completionStatus3 = this.cvvCompletionStatus;
        CompletionStatus completionStatus4 = this.postalCompletionStatus;
        int i = this.cardNumberCursorPosition;
        boolean z = this.collectPostalCode;
        boolean z2 = this.isProcessingRequest;
        boolean z3 = this.collectOnlyGiftCard;
        boolean z4 = this.isMasked;
        StringBuilder sb = new StringBuilder("CardEditorState(focusedField=");
        sb.append(field);
        sb.append(", cardNumber=");
        sb.append(str);
        sb.append(", expirationDate=");
        Boxes$$ExternalSyntheticOutline1.m(sb, str2, ", cvv=", str3, ", postal=");
        sb.append(str4);
        sb.append(", brand=");
        sb.append(card$Brand);
        sb.append(", cardNumberCompletionStatus=");
        sb.append(completionStatus);
        sb.append(", expirationCompletionStatus=");
        sb.append(completionStatus2);
        sb.append(", cvvCompletionStatus=");
        sb.append(completionStatus3);
        sb.append(", postalCompletionStatus=");
        sb.append(completionStatus4);
        sb.append(", cardNumberCursorPosition=");
        sb.append(i);
        sb.append(", collectPostalCode=");
        sb.append(z);
        sb.append(", isProcessingRequest=");
        re$$ExternalSyntheticOutline0.m(sb, z2, ", collectOnlyGiftCard=", z3, ", isMasked=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, z4, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.focusedField.name());
        parcel.writeString(this.cardNumber);
        parcel.writeString(this.expirationDate);
        parcel.writeString(this.cvv);
        parcel.writeString(this.postal);
        parcel.writeString(this.brand.name());
        parcel.writeString(this.cardNumberCompletionStatus.name());
        parcel.writeString(this.expirationCompletionStatus.name());
        parcel.writeString(this.cvvCompletionStatus.name());
        parcel.writeString(this.postalCompletionStatus.name());
        parcel.writeInt(this.cardNumberCursorPosition);
        parcel.writeByte(this.collectPostalCode ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isProcessingRequest ? (byte) 1 : (byte) 0);
    }

    public CardEditorState(Field field, String str, String str2, String str3, String str4, Card$Brand card$Brand, CompletionStatus completionStatus, CompletionStatus completionStatus2, CompletionStatus completionStatus3, CompletionStatus completionStatus4, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        field.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        card$Brand.getClass();
        completionStatus.getClass();
        completionStatus2.getClass();
        completionStatus3.getClass();
        completionStatus4.getClass();
        this.focusedField = field;
        this.cardNumber = str;
        this.expirationDate = str2;
        this.cvv = str3;
        this.postal = str4;
        this.brand = card$Brand;
        this.cardNumberCompletionStatus = completionStatus;
        this.expirationCompletionStatus = completionStatus2;
        this.cvvCompletionStatus = completionStatus3;
        this.postalCompletionStatus = completionStatus4;
        this.cardNumberCursorPosition = i;
        this.collectPostalCode = z;
        this.isProcessingRequest = z2;
        this.collectOnlyGiftCard = z3;
        this.isMasked = z4;
    }

    public CardEditorState() {
        this(null, null, null, null, null, null, null, null, null, null, 0, false, false, false, false, IptcConstants.IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE, null);
    }
}

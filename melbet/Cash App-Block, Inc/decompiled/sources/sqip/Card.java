package sqip;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Tags;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0003()*BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JQ\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0007HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, d2 = {"Lsqip/Card;", "", "brand", "Lsqip/Card$Brand;", "lastFourDigits", "", "expirationMonth", "", "expirationYear", "postalCode", "type", "Lsqip/Card$Type;", "prepaidType", "Lsqip/Card$PrepaidType;", "(Lsqip/Card$Brand;Ljava/lang/String;IILjava/lang/String;Lsqip/Card$Type;Lsqip/Card$PrepaidType;)V", "getBrand", "()Lsqip/Card$Brand;", "getExpirationMonth", "()I", "getExpirationYear", "getLastFourDigits", "()Ljava/lang/String;", "getPostalCode", "getPrepaidType", "()Lsqip/Card$PrepaidType;", "getType", "()Lsqip/Card$Type;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "Brand", "PrepaidType", "Type", "nonce-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Card {
    private final Brand brand;
    private final int expirationMonth;
    private final int expirationYear;
    private final String lastFourDigits;
    private final String postalCode;
    private final PrepaidType prepaidType;
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lsqip/Card$Brand;", "", "(Ljava/lang/String;I)V", "OTHER_BRAND", "VISA", "MASTERCARD", "AMERICAN_EXPRESS", "DISCOVER", "DISCOVER_DINERS", "JCB", "CHINA_UNION_PAY", "SQUARE_GIFT_CARD", "nonce-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Brand {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Brand[] $VALUES;
        public static final Brand OTHER_BRAND = new Brand("OTHER_BRAND", 0);
        public static final Brand VISA = new Brand("VISA", 1);
        public static final Brand MASTERCARD = new Brand("MASTERCARD", 2);
        public static final Brand AMERICAN_EXPRESS = new Brand("AMERICAN_EXPRESS", 3);
        public static final Brand DISCOVER = new Brand("DISCOVER", 4);
        public static final Brand DISCOVER_DINERS = new Brand("DISCOVER_DINERS", 5);
        public static final Brand JCB = new Brand("JCB", 6);
        public static final Brand CHINA_UNION_PAY = new Brand("CHINA_UNION_PAY", 7);
        public static final Brand SQUARE_GIFT_CARD = new Brand("SQUARE_GIFT_CARD", 8);

        private static final /* synthetic */ Brand[] $values() {
            return new Brand[]{OTHER_BRAND, VISA, MASTERCARD, AMERICAN_EXPRESS, DISCOVER, DISCOVER_DINERS, JCB, CHINA_UNION_PAY, SQUARE_GIFT_CARD};
        }

        static {
            Brand[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
        }

        private Brand(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Brand valueOf(String str) {
            return (Brand) Enum.valueOf(Brand.class, str);
        }

        public static Brand[] values() {
            return (Brand[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lsqip/Card$PrepaidType;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "NOT_PREPAID", "PREPAID", "nonce-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PrepaidType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PrepaidType[] $VALUES;
        public static final PrepaidType UNKNOWN = new PrepaidType("UNKNOWN", 0);
        public static final PrepaidType NOT_PREPAID = new PrepaidType("NOT_PREPAID", 1);
        public static final PrepaidType PREPAID = new PrepaidType("PREPAID", 2);

        private static final /* synthetic */ PrepaidType[] $values() {
            return new PrepaidType[]{UNKNOWN, NOT_PREPAID, PREPAID};
        }

        static {
            PrepaidType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
        }

        private PrepaidType(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static PrepaidType valueOf(String str) {
            return (PrepaidType) Enum.valueOf(PrepaidType.class, str);
        }

        public static PrepaidType[] values() {
            return (PrepaidType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lsqip/Card$Type;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "CREDIT", "DEBIT", "nonce-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type UNKNOWN = new Type("UNKNOWN", 0);
        public static final Type CREDIT = new Type("CREDIT", 1);
        public static final Type DEBIT = new Type("DEBIT", 2);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{UNKNOWN, CREDIT, DEBIT};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
        }

        private Type(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public Card(Brand brand, String str, int i, int i2, String str2, Type type2, PrepaidType prepaidType) {
        brand.getClass();
        str.getClass();
        type2.getClass();
        prepaidType.getClass();
        this.brand = brand;
        this.lastFourDigits = str;
        this.expirationMonth = i;
        this.expirationYear = i2;
        this.postalCode = str2;
        this.type = type2;
        this.prepaidType = prepaidType;
    }

    public static /* synthetic */ Card copy$default(Card card, Brand brand, String str, int i, int i2, String str2, Type type2, PrepaidType prepaidType, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            brand = card.brand;
        }
        if ((i3 & 2) != 0) {
            str = card.lastFourDigits;
        }
        if ((i3 & 4) != 0) {
            i = card.expirationMonth;
        }
        if ((i3 & 8) != 0) {
            i2 = card.expirationYear;
        }
        if ((i3 & 16) != 0) {
            str2 = card.postalCode;
        }
        if ((i3 & 32) != 0) {
            type2 = card.type;
        }
        if ((i3 & 64) != 0) {
            prepaidType = card.prepaidType;
        }
        Type type3 = type2;
        PrepaidType prepaidType2 = prepaidType;
        String str3 = str2;
        int i4 = i;
        return card.copy(brand, str, i4, i2, str3, type3, prepaidType2);
    }

    /* renamed from: component1, reason: from getter */
    public final Brand getBrand() {
        return this.brand;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLastFourDigits() {
        return this.lastFourDigits;
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
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* renamed from: component6, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component7, reason: from getter */
    public final PrepaidType getPrepaidType() {
        return this.prepaidType;
    }

    public final Card copy(Brand brand, String lastFourDigits, int expirationMonth, int expirationYear, String postalCode, Type type2, PrepaidType prepaidType) {
        brand.getClass();
        lastFourDigits.getClass();
        type2.getClass();
        prepaidType.getClass();
        return new Card(brand, lastFourDigits, expirationMonth, expirationYear, postalCode, type2, prepaidType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Card)) {
            return false;
        }
        Card card = (Card) other;
        return this.brand == card.brand && Intrinsics.areEqual(this.lastFourDigits, card.lastFourDigits) && this.expirationMonth == card.expirationMonth && this.expirationYear == card.expirationYear && Intrinsics.areEqual(this.postalCode, card.postalCode) && this.type == card.type && this.prepaidType == card.prepaidType;
    }

    public final Brand getBrand() {
        return this.brand;
    }

    public final int getExpirationMonth() {
        return this.expirationMonth;
    }

    public final int getExpirationYear() {
        return this.expirationYear;
    }

    public final String getLastFourDigits() {
        return this.lastFourDigits;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final PrepaidType getPrepaidType() {
        return this.prepaidType;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.expirationYear, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.expirationMonth, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.brand.hashCode() * 31, 31, this.lastFourDigits), 31), 31);
        String str = this.postalCode;
        return this.prepaidType.hashCode() + ((this.type.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public String toString() {
        Brand brand = this.brand;
        String str = this.lastFourDigits;
        int i = this.expirationMonth;
        int i2 = this.expirationYear;
        String str2 = this.postalCode;
        Type type2 = this.type;
        PrepaidType prepaidType = this.prepaidType;
        StringBuilder sb = new StringBuilder("Card(brand=");
        sb.append(brand);
        sb.append(", lastFourDigits=");
        sb.append(str);
        sb.append(", expirationMonth=");
        Recorder$$ExternalSyntheticOutline1.m105m(i, i2, ", expirationYear=", ", postalCode=", sb);
        sb.append(str2);
        sb.append(", type=");
        sb.append(type2);
        sb.append(", prepaidType=");
        sb.append(prepaidType);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ Card(Brand brand, String str, int i, int i2, String str2, Type type2, PrepaidType prepaidType, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(brand, str, i, i2, str2, (i3 & 32) != 0 ? Type.UNKNOWN : type2, (i3 & 64) != 0 ? PrepaidType.UNKNOWN : prepaidType);
    }
}

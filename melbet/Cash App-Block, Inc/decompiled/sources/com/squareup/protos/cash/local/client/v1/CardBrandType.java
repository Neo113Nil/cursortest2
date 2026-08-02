package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/CardBrandType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CARD_BRAND_TYPE_UNSPECIFIED", "CARD_BRAND_TYPE_VISA", "CARD_BRAND_TYPE_MASTERCARD", "CARD_BRAND_TYPE_AMERICAN_EXPRESS", "CARD_BRAND_TYPE_DISCOVER", "CARD_BRAND_TYPE_DISCOVER_DINERS", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CardBrandType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CardBrandType[] $VALUES;
    public static final ProtoAdapter ADAPTER;
    public static final CardBrandType CARD_BRAND_TYPE_AMERICAN_EXPRESS;
    public static final CardBrandType CARD_BRAND_TYPE_DISCOVER;
    public static final CardBrandType CARD_BRAND_TYPE_DISCOVER_DINERS;
    public static final CardBrandType CARD_BRAND_TYPE_MASTERCARD;
    public static final CardBrandType CARD_BRAND_TYPE_UNSPECIFIED;
    public static final CardBrandType CARD_BRAND_TYPE_VISA;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ CardBrandType[] $values() {
        return new CardBrandType[]{CARD_BRAND_TYPE_UNSPECIFIED, CARD_BRAND_TYPE_VISA, CARD_BRAND_TYPE_MASTERCARD, CARD_BRAND_TYPE_AMERICAN_EXPRESS, CARD_BRAND_TYPE_DISCOVER, CARD_BRAND_TYPE_DISCOVER_DINERS};
    }

    static {
        final CardBrandType cardBrandType = new CardBrandType("CARD_BRAND_TYPE_UNSPECIFIED", 0, 0);
        CARD_BRAND_TYPE_UNSPECIFIED = cardBrandType;
        CARD_BRAND_TYPE_VISA = new CardBrandType("CARD_BRAND_TYPE_VISA", 1, 1);
        CARD_BRAND_TYPE_MASTERCARD = new CardBrandType("CARD_BRAND_TYPE_MASTERCARD", 2, 2);
        CARD_BRAND_TYPE_AMERICAN_EXPRESS = new CardBrandType("CARD_BRAND_TYPE_AMERICAN_EXPRESS", 3, 3);
        CARD_BRAND_TYPE_DISCOVER = new CardBrandType("CARD_BRAND_TYPE_DISCOVER", 4, 4);
        CARD_BRAND_TYPE_DISCOVER_DINERS = new CardBrandType("CARD_BRAND_TYPE_DISCOVER_DINERS", 5, 5);
        CardBrandType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CardBrandType.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, cardBrandType) { // from class: com.squareup.protos.cash.local.client.v1.CardBrandType$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public CardBrandType fromValue(int value) {
                return CardBrandType.INSTANCE.fromValue(value);
            }
        };
    }

    private CardBrandType(String str, int i, int i2) {
        this.value = i2;
    }

    public static final CardBrandType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CardBrandType valueOf(String str) {
        return (CardBrandType) Enum.valueOf(CardBrandType.class, str);
    }

    public static CardBrandType[] values() {
        return (CardBrandType[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/CardBrandType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/local/client/v1/CardBrandType;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CardBrandType fromValue(int value) {
            if (value == 0) {
                return CardBrandType.CARD_BRAND_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return CardBrandType.CARD_BRAND_TYPE_VISA;
            }
            if (value == 2) {
                return CardBrandType.CARD_BRAND_TYPE_MASTERCARD;
            }
            if (value == 3) {
                return CardBrandType.CARD_BRAND_TYPE_AMERICAN_EXPRESS;
            }
            if (value == 4) {
                return CardBrandType.CARD_BRAND_TYPE_DISCOVER;
            }
            if (value != 5) {
                return null;
            }
            return CardBrandType.CARD_BRAND_TYPE_DISCOVER_DINERS;
        }

        private Companion() {
        }
    }
}

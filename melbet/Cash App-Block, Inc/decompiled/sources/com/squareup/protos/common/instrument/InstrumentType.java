package com.squareup.protos.common.instrument;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b!\b\u0086\u0081\u0002\u0018\u0000 $2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001$B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006%"}, d2 = {"Lcom/squareup/protos/common/instrument/InstrumentType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", "VISA", "MASTER_CARD", "AMERICAN_EXPRESS", "DISCOVER", "DISCOVER_DINERS", "JCB", "BALANCE", "UNION_PAY", "SQUARE_GIFT_CARD_V2", "INTERAC", "SQUARE_CAPITAL_CARD", "PAYPAY", "AFTERPAY", "SQUARE_ACCOUNT_BALANCE", "AU_PAY", "MERPAY", "RAKUTEN_PAY", "D_BARAI", "WECHAT_PAY", "STORED_VALUE", "QUICPAY", "ID", "TRANSPORTATION_IC", "CASH_LOCAL", "LOCAL_CASH", "CARNET", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InstrumentType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InstrumentType[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final InstrumentType UNKNOWN = new InstrumentType("UNKNOWN", 0, 1);
    public static final InstrumentType VISA = new InstrumentType("VISA", 1, 2);
    public static final InstrumentType MASTER_CARD = new InstrumentType("MASTER_CARD", 2, 3);
    public static final InstrumentType AMERICAN_EXPRESS = new InstrumentType("AMERICAN_EXPRESS", 3, 4);
    public static final InstrumentType DISCOVER = new InstrumentType("DISCOVER", 4, 5);
    public static final InstrumentType DISCOVER_DINERS = new InstrumentType("DISCOVER_DINERS", 5, 6);
    public static final InstrumentType JCB = new InstrumentType("JCB", 6, 7);
    public static final InstrumentType BALANCE = new InstrumentType("BALANCE", 7, 8);
    public static final InstrumentType UNION_PAY = new InstrumentType("UNION_PAY", 8, 9);
    public static final InstrumentType SQUARE_GIFT_CARD_V2 = new InstrumentType("SQUARE_GIFT_CARD_V2", 9, 10);
    public static final InstrumentType INTERAC = new InstrumentType("INTERAC", 10, 11);
    public static final InstrumentType SQUARE_CAPITAL_CARD = new InstrumentType("SQUARE_CAPITAL_CARD", 11, 12);
    public static final InstrumentType PAYPAY = new InstrumentType("PAYPAY", 12, 18);
    public static final InstrumentType AFTERPAY = new InstrumentType("AFTERPAY", 13, 19);
    public static final InstrumentType SQUARE_ACCOUNT_BALANCE = new InstrumentType("SQUARE_ACCOUNT_BALANCE", 14, 20);
    public static final InstrumentType AU_PAY = new InstrumentType("AU_PAY", 15, 21);
    public static final InstrumentType MERPAY = new InstrumentType("MERPAY", 16, 22);
    public static final InstrumentType RAKUTEN_PAY = new InstrumentType("RAKUTEN_PAY", 17, 23);
    public static final InstrumentType D_BARAI = new InstrumentType("D_BARAI", 18, 24);
    public static final InstrumentType WECHAT_PAY = new InstrumentType("WECHAT_PAY", 19, 25);
    public static final InstrumentType STORED_VALUE = new InstrumentType("STORED_VALUE", 20, 26);
    public static final InstrumentType QUICPAY = new InstrumentType("QUICPAY", 21, 27);
    public static final InstrumentType ID = new InstrumentType("ID", 22, 28);
    public static final InstrumentType TRANSPORTATION_IC = new InstrumentType("TRANSPORTATION_IC", 23, 29);

    @Deprecated
    public static final InstrumentType CASH_LOCAL = new InstrumentType("CASH_LOCAL", 24, 30);
    public static final InstrumentType LOCAL_CASH = new InstrumentType("LOCAL_CASH", 25, 31);
    public static final InstrumentType CARNET = new InstrumentType("CARNET", 26, 32);

    private static final /* synthetic */ InstrumentType[] $values() {
        return new InstrumentType[]{UNKNOWN, VISA, MASTER_CARD, AMERICAN_EXPRESS, DISCOVER, DISCOVER_DINERS, JCB, BALANCE, UNION_PAY, SQUARE_GIFT_CARD_V2, INTERAC, SQUARE_CAPITAL_CARD, PAYPAY, AFTERPAY, SQUARE_ACCOUNT_BALANCE, AU_PAY, MERPAY, RAKUTEN_PAY, D_BARAI, WECHAT_PAY, STORED_VALUE, QUICPAY, ID, TRANSPORTATION_IC, CASH_LOCAL, LOCAL_CASH, CARNET};
    }

    static {
        InstrumentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InstrumentType.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.common.instrument.InstrumentType$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public InstrumentType fromValue(int value) {
                return InstrumentType.INSTANCE.fromValue(value);
            }
        };
    }

    private InstrumentType(String str, int i, int i2) {
        this.value = i2;
    }

    public static final InstrumentType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static InstrumentType valueOf(String str) {
        return (InstrumentType) Enum.valueOf(InstrumentType.class, str);
    }

    public static InstrumentType[] values() {
        return (InstrumentType[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/common/instrument/InstrumentType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/common/instrument/InstrumentType;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InstrumentType fromValue(int value) {
            switch (value) {
                case 1:
                    return InstrumentType.UNKNOWN;
                case 2:
                    return InstrumentType.VISA;
                case 3:
                    return InstrumentType.MASTER_CARD;
                case 4:
                    return InstrumentType.AMERICAN_EXPRESS;
                case 5:
                    return InstrumentType.DISCOVER;
                case 6:
                    return InstrumentType.DISCOVER_DINERS;
                case 7:
                    return InstrumentType.JCB;
                case 8:
                    return InstrumentType.BALANCE;
                case 9:
                    return InstrumentType.UNION_PAY;
                case 10:
                    return InstrumentType.SQUARE_GIFT_CARD_V2;
                case 11:
                    return InstrumentType.INTERAC;
                case 12:
                    return InstrumentType.SQUARE_CAPITAL_CARD;
                default:
                    switch (value) {
                        case 18:
                            return InstrumentType.PAYPAY;
                        case 19:
                            return InstrumentType.AFTERPAY;
                        case 20:
                            return InstrumentType.SQUARE_ACCOUNT_BALANCE;
                        case 21:
                            return InstrumentType.AU_PAY;
                        case 22:
                            return InstrumentType.MERPAY;
                        case 23:
                            return InstrumentType.RAKUTEN_PAY;
                        case 24:
                            return InstrumentType.D_BARAI;
                        case 25:
                            return InstrumentType.WECHAT_PAY;
                        case 26:
                            return InstrumentType.STORED_VALUE;
                        case 27:
                            return InstrumentType.QUICPAY;
                        case 28:
                            return InstrumentType.ID;
                        case 29:
                            return InstrumentType.TRANSPORTATION_IC;
                        case 30:
                            return InstrumentType.CASH_LOCAL;
                        case 31:
                            return InstrumentType.LOCAL_CASH;
                        case 32:
                            return InstrumentType.CARNET;
                        default:
                            return null;
                    }
            }
        }

        private Companion() {
        }
    }
}

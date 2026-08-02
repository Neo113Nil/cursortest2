package com.squareup.protos.franklin.api;

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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/CashInstrumentType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEBIT_CARD", "BANK_ACCOUNT", "CREDIT_CARD", "CASH_BALANCE", "LINE_OF_CREDIT", "APPLE_PAY", "GOOGLE_PAY", "EBT", "STABLECOIN_WALLET", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CashInstrumentType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CashInstrumentType[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final CashInstrumentType DEBIT_CARD = new CashInstrumentType("DEBIT_CARD", 0, 1);
    public static final CashInstrumentType BANK_ACCOUNT = new CashInstrumentType("BANK_ACCOUNT", 1, 2);
    public static final CashInstrumentType CREDIT_CARD = new CashInstrumentType("CREDIT_CARD", 2, 3);
    public static final CashInstrumentType CASH_BALANCE = new CashInstrumentType("CASH_BALANCE", 3, 4);
    public static final CashInstrumentType LINE_OF_CREDIT = new CashInstrumentType("LINE_OF_CREDIT", 4, 5);
    public static final CashInstrumentType APPLE_PAY = new CashInstrumentType("APPLE_PAY", 5, 7);
    public static final CashInstrumentType GOOGLE_PAY = new CashInstrumentType("GOOGLE_PAY", 6, 8);
    public static final CashInstrumentType EBT = new CashInstrumentType("EBT", 7, 9);
    public static final CashInstrumentType STABLECOIN_WALLET = new CashInstrumentType("STABLECOIN_WALLET", 8, 10);

    private static final /* synthetic */ CashInstrumentType[] $values() {
        return new CashInstrumentType[]{DEBIT_CARD, BANK_ACCOUNT, CREDIT_CARD, CASH_BALANCE, LINE_OF_CREDIT, APPLE_PAY, GOOGLE_PAY, EBT, STABLECOIN_WALLET};
    }

    static {
        CashInstrumentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CashInstrumentType.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.CashInstrumentType$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public CashInstrumentType fromValue(int value) {
                return CashInstrumentType.INSTANCE.fromValue(value);
            }
        };
    }

    private CashInstrumentType(String str, int i, int i2) {
        this.value = i2;
    }

    public static final CashInstrumentType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CashInstrumentType valueOf(String str) {
        return (CashInstrumentType) Enum.valueOf(CashInstrumentType.class, str);
    }

    public static CashInstrumentType[] values() {
        return (CashInstrumentType[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/CashInstrumentType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/CashInstrumentType;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CashInstrumentType fromValue(int value) {
            switch (value) {
                case 1:
                    return CashInstrumentType.DEBIT_CARD;
                case 2:
                    return CashInstrumentType.BANK_ACCOUNT;
                case 3:
                    return CashInstrumentType.CREDIT_CARD;
                case 4:
                    return CashInstrumentType.CASH_BALANCE;
                case 5:
                    return CashInstrumentType.LINE_OF_CREDIT;
                case 6:
                default:
                    return null;
                case 7:
                    return CashInstrumentType.APPLE_PAY;
                case 8:
                    return CashInstrumentType.GOOGLE_PAY;
                case 9:
                    return CashInstrumentType.EBT;
                case 10:
                    return CashInstrumentType.STABLECOIN_WALLET;
            }
        }

        private Companion() {
        }
    }
}

package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TransactionType;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "TRANSACTION_TYPE_UNSPECIFIED", "TRANSACTION_TYPE_P2P_PAYMENT", "TRANSACTION_TYPE_CASH_APP_PAY_PAYMENT", "TRANSACTION_TYPE_CASH_BALANCE_ADD_OR_WITHDRAWAL", "TRANSACTION_TYPE_ACH_DIRECT_DEPOSIT_OR_PAYMENT", "TRANSACTION_TYPE_WIRE_TRANSFER", "TRANSACTION_TYPE_MOBILE_CHECK_DEPOSIT", "TRANSACTION_TYPE_PAPER_CASH_DEPOSIT", "TRANSACTION_TYPE_INTERNATIONAL_REMITTANCE", "TRANSACTION_TYPE_CASH_CARD_SPEND", "TRANSACTION_TYPE_STOCKS_TRADE", "TRANSACTION_TYPE_STOCKS_DIVIDEND_PAYMENT", "TRANSACTION_TYPE_BITCOIN_TRANSFER", "TRANSACTION_TYPE_BITCOIN_LIGHTNING_TRANSFER", "TRANSACTION_TYPE_CRYPTOCURRENCY_TRADE", "TRANSACTION_TYPE_STABLECOIN_TRANSFER", "TRANSACTION_TYPE_SAVINGS_TRANSFER", "TRANSACTION_TYPE_SAVINGS_INTEREST_PAYMENT", "TRANSACTION_TYPE_OVERDRAFT_TRANSFER", "TRANSACTION_TYPE_BORROW_LOAN_TRANSFER", "TRANSACTION_TYPE_AFTERPAY_LOAN", "TRANSACTION_TYPE_MONEY_POOL_TRANSFER", "TRANSACTION_TYPE_SQUARE_TIP_PAYMENT", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TransactionType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransactionType[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TransactionType TRANSACTION_TYPE_ACH_DIRECT_DEPOSIT_OR_PAYMENT;
    public static final TransactionType TRANSACTION_TYPE_AFTERPAY_LOAN;
    public static final TransactionType TRANSACTION_TYPE_BITCOIN_LIGHTNING_TRANSFER;
    public static final TransactionType TRANSACTION_TYPE_BITCOIN_TRANSFER;
    public static final TransactionType TRANSACTION_TYPE_BORROW_LOAN_TRANSFER;
    public static final TransactionType TRANSACTION_TYPE_CASH_APP_PAY_PAYMENT;
    public static final TransactionType TRANSACTION_TYPE_CASH_BALANCE_ADD_OR_WITHDRAWAL;
    public static final TransactionType TRANSACTION_TYPE_CASH_CARD_SPEND;
    public static final TransactionType TRANSACTION_TYPE_CRYPTOCURRENCY_TRADE;
    public static final TransactionType TRANSACTION_TYPE_INTERNATIONAL_REMITTANCE;
    public static final TransactionType TRANSACTION_TYPE_MOBILE_CHECK_DEPOSIT;
    public static final TransactionType TRANSACTION_TYPE_MONEY_POOL_TRANSFER;
    public static final TransactionType TRANSACTION_TYPE_OVERDRAFT_TRANSFER;
    public static final TransactionType TRANSACTION_TYPE_P2P_PAYMENT;
    public static final TransactionType TRANSACTION_TYPE_PAPER_CASH_DEPOSIT;
    public static final TransactionType TRANSACTION_TYPE_SAVINGS_INTEREST_PAYMENT;
    public static final TransactionType TRANSACTION_TYPE_SAVINGS_TRANSFER;
    public static final TransactionType TRANSACTION_TYPE_SQUARE_TIP_PAYMENT;
    public static final TransactionType TRANSACTION_TYPE_STABLECOIN_TRANSFER;
    public static final TransactionType TRANSACTION_TYPE_STOCKS_DIVIDEND_PAYMENT;
    public static final TransactionType TRANSACTION_TYPE_STOCKS_TRADE;
    public static final TransactionType TRANSACTION_TYPE_UNSPECIFIED;
    public static final TransactionType TRANSACTION_TYPE_WIRE_TRANSFER;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TransactionType$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/TransactionType;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static TransactionType fromValue(int i) {
            switch (i) {
                case 0:
                    return TransactionType.TRANSACTION_TYPE_UNSPECIFIED;
                case 1:
                    return TransactionType.TRANSACTION_TYPE_P2P_PAYMENT;
                case 2:
                    return TransactionType.TRANSACTION_TYPE_CASH_APP_PAY_PAYMENT;
                case 3:
                    return TransactionType.TRANSACTION_TYPE_CASH_BALANCE_ADD_OR_WITHDRAWAL;
                case 4:
                    return TransactionType.TRANSACTION_TYPE_ACH_DIRECT_DEPOSIT_OR_PAYMENT;
                case 5:
                    return TransactionType.TRANSACTION_TYPE_WIRE_TRANSFER;
                case 6:
                    return TransactionType.TRANSACTION_TYPE_MOBILE_CHECK_DEPOSIT;
                case 7:
                    return TransactionType.TRANSACTION_TYPE_PAPER_CASH_DEPOSIT;
                case 8:
                    return TransactionType.TRANSACTION_TYPE_INTERNATIONAL_REMITTANCE;
                case 9:
                    return TransactionType.TRANSACTION_TYPE_CASH_CARD_SPEND;
                case 10:
                    return TransactionType.TRANSACTION_TYPE_STOCKS_TRADE;
                case 11:
                    return TransactionType.TRANSACTION_TYPE_STOCKS_DIVIDEND_PAYMENT;
                case 12:
                    return TransactionType.TRANSACTION_TYPE_BITCOIN_TRANSFER;
                case 13:
                    return TransactionType.TRANSACTION_TYPE_BITCOIN_LIGHTNING_TRANSFER;
                case 14:
                    return TransactionType.TRANSACTION_TYPE_CRYPTOCURRENCY_TRADE;
                case 15:
                    return TransactionType.TRANSACTION_TYPE_STABLECOIN_TRANSFER;
                case 16:
                    return TransactionType.TRANSACTION_TYPE_SAVINGS_TRANSFER;
                case 17:
                    return TransactionType.TRANSACTION_TYPE_SAVINGS_INTEREST_PAYMENT;
                case 18:
                    return TransactionType.TRANSACTION_TYPE_OVERDRAFT_TRANSFER;
                case 19:
                    return TransactionType.TRANSACTION_TYPE_BORROW_LOAN_TRANSFER;
                case 20:
                    return TransactionType.TRANSACTION_TYPE_AFTERPAY_LOAN;
                case 21:
                    return TransactionType.TRANSACTION_TYPE_MONEY_POOL_TRANSFER;
                case 22:
                    return TransactionType.TRANSACTION_TYPE_SQUARE_TIP_PAYMENT;
                default:
                    return null;
            }
        }
    }

    static {
        TransactionType transactionType = new TransactionType("TRANSACTION_TYPE_UNSPECIFIED", 0, 0);
        TRANSACTION_TYPE_UNSPECIFIED = transactionType;
        TransactionType transactionType2 = new TransactionType("TRANSACTION_TYPE_P2P_PAYMENT", 1, 1);
        TRANSACTION_TYPE_P2P_PAYMENT = transactionType2;
        TransactionType transactionType3 = new TransactionType("TRANSACTION_TYPE_CASH_APP_PAY_PAYMENT", 2, 2);
        TRANSACTION_TYPE_CASH_APP_PAY_PAYMENT = transactionType3;
        TransactionType transactionType4 = new TransactionType("TRANSACTION_TYPE_CASH_BALANCE_ADD_OR_WITHDRAWAL", 3, 3);
        TRANSACTION_TYPE_CASH_BALANCE_ADD_OR_WITHDRAWAL = transactionType4;
        TransactionType transactionType5 = new TransactionType("TRANSACTION_TYPE_ACH_DIRECT_DEPOSIT_OR_PAYMENT", 4, 4);
        TRANSACTION_TYPE_ACH_DIRECT_DEPOSIT_OR_PAYMENT = transactionType5;
        TransactionType transactionType6 = new TransactionType("TRANSACTION_TYPE_WIRE_TRANSFER", 5, 5);
        TRANSACTION_TYPE_WIRE_TRANSFER = transactionType6;
        TransactionType transactionType7 = new TransactionType("TRANSACTION_TYPE_MOBILE_CHECK_DEPOSIT", 6, 6);
        TRANSACTION_TYPE_MOBILE_CHECK_DEPOSIT = transactionType7;
        TransactionType transactionType8 = new TransactionType("TRANSACTION_TYPE_PAPER_CASH_DEPOSIT", 7, 7);
        TRANSACTION_TYPE_PAPER_CASH_DEPOSIT = transactionType8;
        TransactionType transactionType9 = new TransactionType("TRANSACTION_TYPE_INTERNATIONAL_REMITTANCE", 8, 8);
        TRANSACTION_TYPE_INTERNATIONAL_REMITTANCE = transactionType9;
        TransactionType transactionType10 = new TransactionType("TRANSACTION_TYPE_CASH_CARD_SPEND", 9, 9);
        TRANSACTION_TYPE_CASH_CARD_SPEND = transactionType10;
        TransactionType transactionType11 = new TransactionType("TRANSACTION_TYPE_STOCKS_TRADE", 10, 10);
        TRANSACTION_TYPE_STOCKS_TRADE = transactionType11;
        TransactionType transactionType12 = new TransactionType("TRANSACTION_TYPE_STOCKS_DIVIDEND_PAYMENT", 11, 11);
        TRANSACTION_TYPE_STOCKS_DIVIDEND_PAYMENT = transactionType12;
        TransactionType transactionType13 = new TransactionType("TRANSACTION_TYPE_BITCOIN_TRANSFER", 12, 12);
        TRANSACTION_TYPE_BITCOIN_TRANSFER = transactionType13;
        TransactionType transactionType14 = new TransactionType("TRANSACTION_TYPE_BITCOIN_LIGHTNING_TRANSFER", 13, 13);
        TRANSACTION_TYPE_BITCOIN_LIGHTNING_TRANSFER = transactionType14;
        TransactionType transactionType15 = new TransactionType("TRANSACTION_TYPE_CRYPTOCURRENCY_TRADE", 14, 14);
        TRANSACTION_TYPE_CRYPTOCURRENCY_TRADE = transactionType15;
        TransactionType transactionType16 = new TransactionType("TRANSACTION_TYPE_STABLECOIN_TRANSFER", 15, 15);
        TRANSACTION_TYPE_STABLECOIN_TRANSFER = transactionType16;
        TransactionType transactionType17 = new TransactionType("TRANSACTION_TYPE_SAVINGS_TRANSFER", 16, 16);
        TRANSACTION_TYPE_SAVINGS_TRANSFER = transactionType17;
        TransactionType transactionType18 = new TransactionType("TRANSACTION_TYPE_SAVINGS_INTEREST_PAYMENT", 17, 17);
        TRANSACTION_TYPE_SAVINGS_INTEREST_PAYMENT = transactionType18;
        TransactionType transactionType19 = new TransactionType("TRANSACTION_TYPE_OVERDRAFT_TRANSFER", 18, 18);
        TRANSACTION_TYPE_OVERDRAFT_TRANSFER = transactionType19;
        TransactionType transactionType20 = new TransactionType("TRANSACTION_TYPE_BORROW_LOAN_TRANSFER", 19, 19);
        TRANSACTION_TYPE_BORROW_LOAN_TRANSFER = transactionType20;
        TransactionType transactionType21 = new TransactionType("TRANSACTION_TYPE_AFTERPAY_LOAN", 20, 20);
        TRANSACTION_TYPE_AFTERPAY_LOAN = transactionType21;
        TransactionType transactionType22 = new TransactionType("TRANSACTION_TYPE_MONEY_POOL_TRANSFER", 21, 21);
        TRANSACTION_TYPE_MONEY_POOL_TRANSFER = transactionType22;
        TransactionType transactionType23 = new TransactionType("TRANSACTION_TYPE_SQUARE_TIP_PAYMENT", 22, 22);
        TRANSACTION_TYPE_SQUARE_TIP_PAYMENT = transactionType23;
        TransactionType[] transactionTypeArr = {transactionType, transactionType2, transactionType3, transactionType4, transactionType5, transactionType6, transactionType7, transactionType8, transactionType9, transactionType10, transactionType11, transactionType12, transactionType13, transactionType14, transactionType15, transactionType16, transactionType17, transactionType18, transactionType19, transactionType20, transactionType21, transactionType22, transactionType23};
        $VALUES = transactionTypeArr;
        $ENTRIES = new EnumEntriesList(transactionTypeArr);
        INSTANCE = new Companion();
        ADAPTER = new TransactionType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TransactionType.class), Syntax.PROTO_2, transactionType);
    }

    public TransactionType(String str, int i, int i2) {
        this.value = i2;
    }

    public static final TransactionType fromValue(int i) {
        INSTANCE.getClass();
        return Companion.fromValue(i);
    }

    public static TransactionType valueOf(String str) {
        return (TransactionType) Enum.valueOf(TransactionType.class, str);
    }

    public static TransactionType[] values() {
        return (TransactionType[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}

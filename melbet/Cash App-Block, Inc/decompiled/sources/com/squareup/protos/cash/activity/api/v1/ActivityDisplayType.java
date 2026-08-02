package com.squareup.protos.cash.activity.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b:\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<¨\u0006="}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityDisplayType;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "ADT_DEFAULT_DO_NOT_USE", "ADT_ACCOUNT_NOTIFICATIONS", "ADT_ATM_WITHDRAWAL", "ADT_AUTO_INVEST", "ADT_BANK_TRANSFER", "ADT_BILL_PAY", "ADT_BITCOIN_BUY", "ADT_BITCOIN_DEPOSIT", "ADT_BITCOIN_PAYMENT", "ADT_BITCOIN_RECURRING_BUY", "ADT_BITCOIN_ROUND_UP_BUY", "ADT_BITCOIN_SELL", "ADT_BITCOIN_WITHDRAWAL", "ADT_BORROW", "ADT_CASH_APP_LOCAL", "ADT_CASH_APP_PAY_DEPOSIT", "ADT_CASH_APP_PAY_PAYMENT", "ADT_CASH_APP_PAY_REFUND", "ADT_CASH_APP_PAYOUT", "ADT_CASH_CARD", "ADT_CHECK_DEPOSIT", "ADT_CUSTOMER_ADJUSTMENT", "ADT_DEPOSITS", "ADT_FAMILY", "ADT_GIFT_CARD_P2P", "ADT_INSTANT_PAY", "ADT_INVESTING", "ADT_LIGHTNING_DEPOSIT", "ADT_LIGHTNING_WITHDRAWAL", "ADT_LOYALTY_REWARDS", "ADT_OTHER", "ADT_OVERDRAFT", "ADT_P2P", "ADT_P2P_POOL", "ADT_PAPER_MONEY_DEPOSIT", "ADT_PAYCHECKS", "ADT_REFERRALS", "ADT_REMITTANCES", "ADT_SAVINGS_INTEREST_PAYMENT", "ADT_SAVINGS_INTERNAL_TRANSFER", "ADT_SAVINGS_ROUND_UP", "ADT_SAVINGS_SCHEDULED_TRANSFER", "ADT_STABLE_DEPOSIT", "ADT_STABLE_WITHDRAWAL", "ADT_STOCK_BUY", "ADT_STOCK_DIVIDENDS", "ADT_STOCK_P2P", "ADT_STOCK_ROUND_UP_BUY", "ADT_STOCK_SELL", "ADT_TAP_TO_PAY_PAYMENTS", "ADT_WIRE_TRANSFER", "ADT_WITHDRAWAL", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityDisplayType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ActivityDisplayType[] $VALUES;
    public static final ProtoAdapter ADAPTER;
    public static final ActivityDisplayType ADT_ACCOUNT_NOTIFICATIONS;
    public static final ActivityDisplayType ADT_ATM_WITHDRAWAL;
    public static final ActivityDisplayType ADT_AUTO_INVEST;
    public static final ActivityDisplayType ADT_BANK_TRANSFER;
    public static final ActivityDisplayType ADT_BILL_PAY;
    public static final ActivityDisplayType ADT_BITCOIN_BUY;
    public static final ActivityDisplayType ADT_BITCOIN_DEPOSIT;
    public static final ActivityDisplayType ADT_BITCOIN_PAYMENT;
    public static final ActivityDisplayType ADT_BITCOIN_RECURRING_BUY;
    public static final ActivityDisplayType ADT_BITCOIN_ROUND_UP_BUY;
    public static final ActivityDisplayType ADT_BITCOIN_SELL;
    public static final ActivityDisplayType ADT_BITCOIN_WITHDRAWAL;
    public static final ActivityDisplayType ADT_BORROW;
    public static final ActivityDisplayType ADT_CASH_APP_LOCAL;
    public static final ActivityDisplayType ADT_CASH_APP_PAYOUT;
    public static final ActivityDisplayType ADT_CASH_APP_PAY_DEPOSIT;
    public static final ActivityDisplayType ADT_CASH_APP_PAY_PAYMENT;
    public static final ActivityDisplayType ADT_CASH_APP_PAY_REFUND;
    public static final ActivityDisplayType ADT_CASH_CARD;
    public static final ActivityDisplayType ADT_CHECK_DEPOSIT;
    public static final ActivityDisplayType ADT_CUSTOMER_ADJUSTMENT;
    public static final ActivityDisplayType ADT_DEFAULT_DO_NOT_USE;
    public static final ActivityDisplayType ADT_DEPOSITS;
    public static final ActivityDisplayType ADT_FAMILY;
    public static final ActivityDisplayType ADT_GIFT_CARD_P2P;
    public static final ActivityDisplayType ADT_INSTANT_PAY;
    public static final ActivityDisplayType ADT_INVESTING;
    public static final ActivityDisplayType ADT_LIGHTNING_DEPOSIT;
    public static final ActivityDisplayType ADT_LIGHTNING_WITHDRAWAL;
    public static final ActivityDisplayType ADT_LOYALTY_REWARDS;
    public static final ActivityDisplayType ADT_OTHER;
    public static final ActivityDisplayType ADT_OVERDRAFT;
    public static final ActivityDisplayType ADT_P2P;
    public static final ActivityDisplayType ADT_P2P_POOL;
    public static final ActivityDisplayType ADT_PAPER_MONEY_DEPOSIT;
    public static final ActivityDisplayType ADT_PAYCHECKS;
    public static final ActivityDisplayType ADT_REFERRALS;
    public static final ActivityDisplayType ADT_REMITTANCES;
    public static final ActivityDisplayType ADT_SAVINGS_INTEREST_PAYMENT;
    public static final ActivityDisplayType ADT_SAVINGS_INTERNAL_TRANSFER;
    public static final ActivityDisplayType ADT_SAVINGS_ROUND_UP;
    public static final ActivityDisplayType ADT_SAVINGS_SCHEDULED_TRANSFER;
    public static final ActivityDisplayType ADT_STABLE_DEPOSIT;
    public static final ActivityDisplayType ADT_STABLE_WITHDRAWAL;
    public static final ActivityDisplayType ADT_STOCK_BUY;
    public static final ActivityDisplayType ADT_STOCK_DIVIDENDS;
    public static final ActivityDisplayType ADT_STOCK_P2P;
    public static final ActivityDisplayType ADT_STOCK_ROUND_UP_BUY;
    public static final ActivityDisplayType ADT_STOCK_SELL;
    public static final ActivityDisplayType ADT_TAP_TO_PAY_PAYMENTS;
    public static final ActivityDisplayType ADT_WIRE_TRANSFER;
    public static final ActivityDisplayType ADT_WITHDRAWAL;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityDisplayType$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityDisplayType;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static ActivityDisplayType fromValue(int i) {
            switch (i) {
                case 0:
                    return ActivityDisplayType.ADT_DEFAULT_DO_NOT_USE;
                case 1:
                    return ActivityDisplayType.ADT_ACCOUNT_NOTIFICATIONS;
                case 2:
                    return ActivityDisplayType.ADT_AUTO_INVEST;
                case 3:
                    return ActivityDisplayType.ADT_BANK_TRANSFER;
                case 4:
                    return ActivityDisplayType.ADT_BILL_PAY;
                case 5:
                    return ActivityDisplayType.ADT_BITCOIN_BUY;
                case 6:
                    return ActivityDisplayType.ADT_BITCOIN_DEPOSIT;
                case 7:
                    return ActivityDisplayType.ADT_BITCOIN_PAYMENT;
                case 8:
                    return ActivityDisplayType.ADT_BITCOIN_RECURRING_BUY;
                case 9:
                    return ActivityDisplayType.ADT_BITCOIN_SELL;
                case 10:
                    return ActivityDisplayType.ADT_BITCOIN_WITHDRAWAL;
                case 11:
                    return ActivityDisplayType.ADT_BORROW;
                case 12:
                    return ActivityDisplayType.ADT_CASH_APP_PAY_DEPOSIT;
                case 13:
                    return ActivityDisplayType.ADT_CASH_APP_PAY_PAYMENT;
                case 14:
                    return ActivityDisplayType.ADT_CASH_APP_PAY_REFUND;
                case 15:
                    return ActivityDisplayType.ADT_CASH_CARD;
                case 16:
                    return ActivityDisplayType.ADT_CHECK_DEPOSIT;
                case 17:
                    return ActivityDisplayType.ADT_DEPOSITS;
                case 18:
                    return ActivityDisplayType.ADT_FAMILY;
                case 19:
                    return ActivityDisplayType.ADT_GIFT_CARD_P2P;
                case 20:
                    return ActivityDisplayType.ADT_INSTANT_PAY;
                case 21:
                    return ActivityDisplayType.ADT_INVESTING;
                case 22:
                    return ActivityDisplayType.ADT_LIGHTNING_DEPOSIT;
                case 23:
                    return ActivityDisplayType.ADT_LIGHTNING_WITHDRAWAL;
                case 24:
                    return ActivityDisplayType.ADT_LOYALTY_REWARDS;
                case 25:
                    return ActivityDisplayType.ADT_OTHER;
                case 26:
                    return ActivityDisplayType.ADT_OVERDRAFT;
                case 27:
                    return ActivityDisplayType.ADT_P2P;
                case 28:
                    return ActivityDisplayType.ADT_PAPER_MONEY_DEPOSIT;
                case 29:
                    return ActivityDisplayType.ADT_REFERRALS;
                case 30:
                    return ActivityDisplayType.ADT_REMITTANCES;
                case 31:
                    return ActivityDisplayType.ADT_SAVINGS_INTEREST_PAYMENT;
                case 32:
                    return ActivityDisplayType.ADT_SAVINGS_INTERNAL_TRANSFER;
                case 33:
                    return ActivityDisplayType.ADT_STOCK_BUY;
                case 34:
                    return ActivityDisplayType.ADT_STOCK_DIVIDENDS;
                case 35:
                    return ActivityDisplayType.ADT_STOCK_P2P;
                case 36:
                    return ActivityDisplayType.ADT_TAP_TO_PAY_PAYMENTS;
                case 37:
                    return ActivityDisplayType.ADT_WIRE_TRANSFER;
                case 38:
                    return ActivityDisplayType.ADT_WITHDRAWAL;
                case 39:
                    return ActivityDisplayType.ADT_STABLE_WITHDRAWAL;
                case 40:
                    return ActivityDisplayType.ADT_STABLE_DEPOSIT;
                case 41:
                    return ActivityDisplayType.ADT_P2P_POOL;
                case 42:
                    return ActivityDisplayType.ADT_PAYCHECKS;
                case 43:
                    return ActivityDisplayType.ADT_CASH_APP_LOCAL;
                case 44:
                    return ActivityDisplayType.ADT_CUSTOMER_ADJUSTMENT;
                case 45:
                    return ActivityDisplayType.ADT_SAVINGS_SCHEDULED_TRANSFER;
                case 46:
                    return ActivityDisplayType.ADT_CASH_APP_PAYOUT;
                case 47:
                    return ActivityDisplayType.ADT_ATM_WITHDRAWAL;
                case 48:
                    return ActivityDisplayType.ADT_BITCOIN_ROUND_UP_BUY;
                case 49:
                    return ActivityDisplayType.ADT_STOCK_ROUND_UP_BUY;
                case 50:
                    return ActivityDisplayType.ADT_STOCK_SELL;
                case 51:
                    return ActivityDisplayType.ADT_SAVINGS_ROUND_UP;
                default:
                    return null;
            }
        }
    }

    static {
        ActivityDisplayType activityDisplayType = new ActivityDisplayType("ADT_DEFAULT_DO_NOT_USE", 0, 0);
        ADT_DEFAULT_DO_NOT_USE = activityDisplayType;
        ActivityDisplayType activityDisplayType2 = new ActivityDisplayType("ADT_ACCOUNT_NOTIFICATIONS", 1, 1);
        ADT_ACCOUNT_NOTIFICATIONS = activityDisplayType2;
        ActivityDisplayType activityDisplayType3 = new ActivityDisplayType("ADT_ATM_WITHDRAWAL", 2, 47);
        ADT_ATM_WITHDRAWAL = activityDisplayType3;
        ActivityDisplayType activityDisplayType4 = new ActivityDisplayType("ADT_AUTO_INVEST", 3, 2);
        ADT_AUTO_INVEST = activityDisplayType4;
        ActivityDisplayType activityDisplayType5 = new ActivityDisplayType("ADT_BANK_TRANSFER", 4, 3);
        ADT_BANK_TRANSFER = activityDisplayType5;
        ActivityDisplayType activityDisplayType6 = new ActivityDisplayType("ADT_BILL_PAY", 5, 4);
        ADT_BILL_PAY = activityDisplayType6;
        ActivityDisplayType activityDisplayType7 = new ActivityDisplayType("ADT_BITCOIN_BUY", 6, 5);
        ADT_BITCOIN_BUY = activityDisplayType7;
        ActivityDisplayType activityDisplayType8 = new ActivityDisplayType("ADT_BITCOIN_DEPOSIT", 7, 6);
        ADT_BITCOIN_DEPOSIT = activityDisplayType8;
        ActivityDisplayType activityDisplayType9 = new ActivityDisplayType("ADT_BITCOIN_PAYMENT", 8, 7);
        ADT_BITCOIN_PAYMENT = activityDisplayType9;
        ActivityDisplayType activityDisplayType10 = new ActivityDisplayType("ADT_BITCOIN_RECURRING_BUY", 9, 8);
        ADT_BITCOIN_RECURRING_BUY = activityDisplayType10;
        ActivityDisplayType activityDisplayType11 = new ActivityDisplayType("ADT_BITCOIN_ROUND_UP_BUY", 10, 48);
        ADT_BITCOIN_ROUND_UP_BUY = activityDisplayType11;
        ActivityDisplayType activityDisplayType12 = new ActivityDisplayType("ADT_BITCOIN_SELL", 11, 9);
        ADT_BITCOIN_SELL = activityDisplayType12;
        ActivityDisplayType activityDisplayType13 = new ActivityDisplayType("ADT_BITCOIN_WITHDRAWAL", 12, 10);
        ADT_BITCOIN_WITHDRAWAL = activityDisplayType13;
        ActivityDisplayType activityDisplayType14 = new ActivityDisplayType("ADT_BORROW", 13, 11);
        ADT_BORROW = activityDisplayType14;
        ActivityDisplayType activityDisplayType15 = new ActivityDisplayType("ADT_CASH_APP_LOCAL", 14, 43);
        ADT_CASH_APP_LOCAL = activityDisplayType15;
        ActivityDisplayType activityDisplayType16 = new ActivityDisplayType("ADT_CASH_APP_PAY_DEPOSIT", 15, 12);
        ADT_CASH_APP_PAY_DEPOSIT = activityDisplayType16;
        ActivityDisplayType activityDisplayType17 = new ActivityDisplayType("ADT_CASH_APP_PAY_PAYMENT", 16, 13);
        ADT_CASH_APP_PAY_PAYMENT = activityDisplayType17;
        ActivityDisplayType activityDisplayType18 = new ActivityDisplayType("ADT_CASH_APP_PAY_REFUND", 17, 14);
        ADT_CASH_APP_PAY_REFUND = activityDisplayType18;
        ActivityDisplayType activityDisplayType19 = new ActivityDisplayType("ADT_CASH_APP_PAYOUT", 18, 46);
        ADT_CASH_APP_PAYOUT = activityDisplayType19;
        ActivityDisplayType activityDisplayType20 = new ActivityDisplayType("ADT_CASH_CARD", 19, 15);
        ADT_CASH_CARD = activityDisplayType20;
        ActivityDisplayType activityDisplayType21 = new ActivityDisplayType("ADT_CHECK_DEPOSIT", 20, 16);
        ADT_CHECK_DEPOSIT = activityDisplayType21;
        ActivityDisplayType activityDisplayType22 = new ActivityDisplayType("ADT_CUSTOMER_ADJUSTMENT", 21, 44);
        ADT_CUSTOMER_ADJUSTMENT = activityDisplayType22;
        ActivityDisplayType activityDisplayType23 = new ActivityDisplayType("ADT_DEPOSITS", 22, 17);
        ADT_DEPOSITS = activityDisplayType23;
        ActivityDisplayType activityDisplayType24 = new ActivityDisplayType("ADT_FAMILY", 23, 18);
        ADT_FAMILY = activityDisplayType24;
        ActivityDisplayType activityDisplayType25 = new ActivityDisplayType("ADT_GIFT_CARD_P2P", 24, 19);
        ADT_GIFT_CARD_P2P = activityDisplayType25;
        ActivityDisplayType activityDisplayType26 = new ActivityDisplayType("ADT_INSTANT_PAY", 25, 20);
        ADT_INSTANT_PAY = activityDisplayType26;
        ActivityDisplayType activityDisplayType27 = new ActivityDisplayType("ADT_INVESTING", 26, 21);
        ADT_INVESTING = activityDisplayType27;
        ActivityDisplayType activityDisplayType28 = new ActivityDisplayType("ADT_LIGHTNING_DEPOSIT", 27, 22);
        ADT_LIGHTNING_DEPOSIT = activityDisplayType28;
        ActivityDisplayType activityDisplayType29 = new ActivityDisplayType("ADT_LIGHTNING_WITHDRAWAL", 28, 23);
        ADT_LIGHTNING_WITHDRAWAL = activityDisplayType29;
        ActivityDisplayType activityDisplayType30 = new ActivityDisplayType("ADT_LOYALTY_REWARDS", 29, 24);
        ADT_LOYALTY_REWARDS = activityDisplayType30;
        ActivityDisplayType activityDisplayType31 = new ActivityDisplayType("ADT_OTHER", 30, 25);
        ADT_OTHER = activityDisplayType31;
        ActivityDisplayType activityDisplayType32 = new ActivityDisplayType("ADT_OVERDRAFT", 31, 26);
        ADT_OVERDRAFT = activityDisplayType32;
        ActivityDisplayType activityDisplayType33 = new ActivityDisplayType("ADT_P2P", 32, 27);
        ADT_P2P = activityDisplayType33;
        ActivityDisplayType activityDisplayType34 = new ActivityDisplayType("ADT_P2P_POOL", 33, 41);
        ADT_P2P_POOL = activityDisplayType34;
        ActivityDisplayType activityDisplayType35 = new ActivityDisplayType("ADT_PAPER_MONEY_DEPOSIT", 34, 28);
        ADT_PAPER_MONEY_DEPOSIT = activityDisplayType35;
        ActivityDisplayType activityDisplayType36 = new ActivityDisplayType("ADT_PAYCHECKS", 35, 42);
        ADT_PAYCHECKS = activityDisplayType36;
        ActivityDisplayType activityDisplayType37 = new ActivityDisplayType("ADT_REFERRALS", 36, 29);
        ADT_REFERRALS = activityDisplayType37;
        ActivityDisplayType activityDisplayType38 = new ActivityDisplayType("ADT_REMITTANCES", 37, 30);
        ADT_REMITTANCES = activityDisplayType38;
        ActivityDisplayType activityDisplayType39 = new ActivityDisplayType("ADT_SAVINGS_INTEREST_PAYMENT", 38, 31);
        ADT_SAVINGS_INTEREST_PAYMENT = activityDisplayType39;
        ActivityDisplayType activityDisplayType40 = new ActivityDisplayType("ADT_SAVINGS_INTERNAL_TRANSFER", 39, 32);
        ADT_SAVINGS_INTERNAL_TRANSFER = activityDisplayType40;
        ActivityDisplayType activityDisplayType41 = new ActivityDisplayType("ADT_SAVINGS_ROUND_UP", 40, 51);
        ADT_SAVINGS_ROUND_UP = activityDisplayType41;
        ActivityDisplayType activityDisplayType42 = new ActivityDisplayType("ADT_SAVINGS_SCHEDULED_TRANSFER", 41, 45);
        ADT_SAVINGS_SCHEDULED_TRANSFER = activityDisplayType42;
        ActivityDisplayType activityDisplayType43 = new ActivityDisplayType("ADT_STABLE_DEPOSIT", 42, 40);
        ADT_STABLE_DEPOSIT = activityDisplayType43;
        ActivityDisplayType activityDisplayType44 = new ActivityDisplayType("ADT_STABLE_WITHDRAWAL", 43, 39);
        ADT_STABLE_WITHDRAWAL = activityDisplayType44;
        ActivityDisplayType activityDisplayType45 = new ActivityDisplayType("ADT_STOCK_BUY", 44, 33);
        ADT_STOCK_BUY = activityDisplayType45;
        ActivityDisplayType activityDisplayType46 = new ActivityDisplayType("ADT_STOCK_DIVIDENDS", 45, 34);
        ADT_STOCK_DIVIDENDS = activityDisplayType46;
        ActivityDisplayType activityDisplayType47 = new ActivityDisplayType("ADT_STOCK_P2P", 46, 35);
        ADT_STOCK_P2P = activityDisplayType47;
        ActivityDisplayType activityDisplayType48 = new ActivityDisplayType("ADT_STOCK_ROUND_UP_BUY", 47, 49);
        ADT_STOCK_ROUND_UP_BUY = activityDisplayType48;
        ActivityDisplayType activityDisplayType49 = new ActivityDisplayType("ADT_STOCK_SELL", 48, 50);
        ADT_STOCK_SELL = activityDisplayType49;
        ActivityDisplayType activityDisplayType50 = new ActivityDisplayType("ADT_TAP_TO_PAY_PAYMENTS", 49, 36);
        ADT_TAP_TO_PAY_PAYMENTS = activityDisplayType50;
        ActivityDisplayType activityDisplayType51 = new ActivityDisplayType("ADT_WIRE_TRANSFER", 50, 37);
        ADT_WIRE_TRANSFER = activityDisplayType51;
        ActivityDisplayType activityDisplayType52 = new ActivityDisplayType("ADT_WITHDRAWAL", 51, 38);
        ADT_WITHDRAWAL = activityDisplayType52;
        ActivityDisplayType[] activityDisplayTypeArr = {activityDisplayType, activityDisplayType2, activityDisplayType3, activityDisplayType4, activityDisplayType5, activityDisplayType6, activityDisplayType7, activityDisplayType8, activityDisplayType9, activityDisplayType10, activityDisplayType11, activityDisplayType12, activityDisplayType13, activityDisplayType14, activityDisplayType15, activityDisplayType16, activityDisplayType17, activityDisplayType18, activityDisplayType19, activityDisplayType20, activityDisplayType21, activityDisplayType22, activityDisplayType23, activityDisplayType24, activityDisplayType25, activityDisplayType26, activityDisplayType27, activityDisplayType28, activityDisplayType29, activityDisplayType30, activityDisplayType31, activityDisplayType32, activityDisplayType33, activityDisplayType34, activityDisplayType35, activityDisplayType36, activityDisplayType37, activityDisplayType38, activityDisplayType39, activityDisplayType40, activityDisplayType41, activityDisplayType42, activityDisplayType43, activityDisplayType44, activityDisplayType45, activityDisplayType46, activityDisplayType47, activityDisplayType48, activityDisplayType49, activityDisplayType50, activityDisplayType51, activityDisplayType52};
        $VALUES = activityDisplayTypeArr;
        $ENTRIES = new EnumEntriesList(activityDisplayTypeArr);
        INSTANCE = new Companion();
        ADAPTER = new ActivityDisplayType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ActivityDisplayType.class), Syntax.PROTO_2, activityDisplayType);
    }

    public ActivityDisplayType(String str, int i, int i2) {
        this.value = i2;
    }

    public static final ActivityDisplayType fromValue(int i) {
        INSTANCE.getClass();
        return Companion.fromValue(i);
    }

    public static ActivityDisplayType valueOf(String str) {
        return (ActivityDisplayType) Enum.valueOf(ActivityDisplayType.class, str);
    }

    public static ActivityDisplayType[] values() {
        return (ActivityDisplayType[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}

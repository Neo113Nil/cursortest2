package com.squareup.protos.cash.activity.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\bL\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bN¨\u0006O"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityItemType;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "DEFAULT_ACTIVITY_ITEM_TYPE_DO_NOT_USE", "CASH_IN", "CASH_OUT", "SAVINGS_INTERNAL_TRANSFER", "P2P_FIAT_PAYMENT", "COUPON_ACTIVITY", "REMITTANCE_PAYMENT", "CASH_CARD_TRANSACTION", "P2P_BTC_PAYMENT", "P2P_FRANKLIN_PAYMENT", "CRYPTO_EXCHANGE", "TTP_ACTIVITY", "PAYCHECKS", "SAVINGS_INTEREST_PAYMENT", "NEW_DEVICE_LOGIN", "P2P_INVEST_PAYMENT", "PENDING_REFERRAL", "PAY_WITH_CASH_PAYMENT", "PAY_WITH_CASH_REFUND", "SPONSORED_ACTIVITY", "PAPER_MONEY_DEPOSIT", "LOYALTY_ACTIVITY", "LIGHTNING_DEPOSIT_BTC", "LIGHTNING_WITHDRAWAL_BTC", "CHECK_DEPOSIT", "GIFT_CARD_PAYMENT", "CRYPTO_PAYROLL_PREFERENCE", "WITHDRAWAL_BTC", "WIRE_TRANSFER", "DEPOSIT_BTC", "AFTERPAY_SUMMARY", "C4B_ONBOARDING", "P2P_SHADOW_PAYMENT", "RECURRING_BUY_BTC", "OVERDRAFT_TRANSACTION", "LOAN_TRANSACTION", "SPONSORSHIP_FEATURE_INVITATION", "INSTANT_PAY_SETTLEMENT", "BANKING_TRANSACTION", "BILL_PAYMENT_PAYMENTUS", "CASH_APP_PAY_DEPOSITS", "CASH_APP_PAY_PAYMENT", "CASH_APP_PAY_REFUND", "CASH_APP_ORDER", "CASH_APP_PAYOUT", "INVESTING_AUTOMATION_EXECUTION", "INVESTMENT_CORPORATE_ACTION", "INVESTMENT_CORRECTION", "INVESTMENT_DIVIDEND", "INVESTMENT_ORDER", "INVESTING_LEDGER", "LEDGER", "LEDGER_REFERENCE", "LEDGER_ACTIVITY_REFERENCE", "LEDGER_EVENT_NO_ACTIVITY_ITEM", "LOCAL_CASHBACK", "LOCAL_ORDER", "SAVINGS_CASH_IN", "BANKING_TRANSACTION_V2", "SPONSOR_PAYMENT_APPROVAL", "STABLE_WITHDRAWAL_USDC", "STABLE_DEPOSIT_USDC", "P2P_POOL", "C4B_LISTING_PAYMENT_ACTIVITY", "CUSTOMER_ADJUSTMENT", "SAVINGS_SCHEDULED_AUTO_TRANSFER", "LIFTED_RESTRICTION_TRANSFER", "CASH_LITE_ONRAMP_CASH_IN", "CASH_LITE_OFFRAMP_CASH_OUT", "CASH_LITE_CARD_TRANSACTION", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityItemType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ActivityItemType[] $VALUES;
    public static final ProtoAdapter ADAPTER;
    public static final ActivityItemType AFTERPAY_SUMMARY;
    public static final ActivityItemType BANKING_TRANSACTION;
    public static final ActivityItemType BANKING_TRANSACTION_V2;
    public static final ActivityItemType BILL_PAYMENT_PAYMENTUS;
    public static final ActivityItemType C4B_LISTING_PAYMENT_ACTIVITY;
    public static final ActivityItemType C4B_ONBOARDING;
    public static final ActivityItemType CASH_APP_ORDER;
    public static final ActivityItemType CASH_APP_PAYOUT;
    public static final ActivityItemType CASH_APP_PAY_DEPOSITS;
    public static final ActivityItemType CASH_APP_PAY_PAYMENT;
    public static final ActivityItemType CASH_APP_PAY_REFUND;
    public static final ActivityItemType CASH_CARD_TRANSACTION;
    public static final ActivityItemType CASH_IN;
    public static final ActivityItemType CASH_LITE_CARD_TRANSACTION;
    public static final ActivityItemType CASH_LITE_OFFRAMP_CASH_OUT;
    public static final ActivityItemType CASH_LITE_ONRAMP_CASH_IN;
    public static final ActivityItemType CASH_OUT;
    public static final ActivityItemType CHECK_DEPOSIT;
    public static final ActivityItemType COUPON_ACTIVITY;
    public static final ActivityItemType CRYPTO_EXCHANGE;
    public static final ActivityItemType CRYPTO_PAYROLL_PREFERENCE;
    public static final ActivityItemType CUSTOMER_ADJUSTMENT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ActivityItemType DEFAULT_ACTIVITY_ITEM_TYPE_DO_NOT_USE;
    public static final ActivityItemType DEPOSIT_BTC;
    public static final ActivityItemType GIFT_CARD_PAYMENT;
    public static final ActivityItemType INSTANT_PAY_SETTLEMENT;
    public static final ActivityItemType INVESTING_AUTOMATION_EXECUTION;
    public static final ActivityItemType INVESTING_LEDGER;
    public static final ActivityItemType INVESTMENT_CORPORATE_ACTION;
    public static final ActivityItemType INVESTMENT_CORRECTION;
    public static final ActivityItemType INVESTMENT_DIVIDEND;
    public static final ActivityItemType INVESTMENT_ORDER;
    public static final ActivityItemType LEDGER;
    public static final ActivityItemType LEDGER_ACTIVITY_REFERENCE;
    public static final ActivityItemType LEDGER_EVENT_NO_ACTIVITY_ITEM;
    public static final ActivityItemType LEDGER_REFERENCE;
    public static final ActivityItemType LIFTED_RESTRICTION_TRANSFER;
    public static final ActivityItemType LIGHTNING_DEPOSIT_BTC;
    public static final ActivityItemType LIGHTNING_WITHDRAWAL_BTC;
    public static final ActivityItemType LOAN_TRANSACTION;
    public static final ActivityItemType LOCAL_CASHBACK;
    public static final ActivityItemType LOCAL_ORDER;
    public static final ActivityItemType LOYALTY_ACTIVITY;
    public static final ActivityItemType NEW_DEVICE_LOGIN;
    public static final ActivityItemType OVERDRAFT_TRANSACTION;
    public static final ActivityItemType P2P_BTC_PAYMENT;
    public static final ActivityItemType P2P_FIAT_PAYMENT;
    public static final ActivityItemType P2P_FRANKLIN_PAYMENT;
    public static final ActivityItemType P2P_INVEST_PAYMENT;
    public static final ActivityItemType P2P_POOL;
    public static final ActivityItemType P2P_SHADOW_PAYMENT;
    public static final ActivityItemType PAPER_MONEY_DEPOSIT;
    public static final ActivityItemType PAYCHECKS;

    @Deprecated
    public static final ActivityItemType PAY_WITH_CASH_PAYMENT;

    @Deprecated
    public static final ActivityItemType PAY_WITH_CASH_REFUND;
    public static final ActivityItemType PENDING_REFERRAL;
    public static final ActivityItemType RECURRING_BUY_BTC;
    public static final ActivityItemType REMITTANCE_PAYMENT;
    public static final ActivityItemType SAVINGS_CASH_IN;
    public static final ActivityItemType SAVINGS_INTEREST_PAYMENT;
    public static final ActivityItemType SAVINGS_INTERNAL_TRANSFER;
    public static final ActivityItemType SAVINGS_SCHEDULED_AUTO_TRANSFER;
    public static final ActivityItemType SPONSORED_ACTIVITY;
    public static final ActivityItemType SPONSORSHIP_FEATURE_INVITATION;
    public static final ActivityItemType SPONSOR_PAYMENT_APPROVAL;
    public static final ActivityItemType STABLE_DEPOSIT_USDC;
    public static final ActivityItemType STABLE_WITHDRAWAL_USDC;
    public static final ActivityItemType TTP_ACTIVITY;
    public static final ActivityItemType WIRE_TRANSFER;
    public static final ActivityItemType WITHDRAWAL_BTC;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityItemType$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityItemType;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static ActivityItemType fromValue(int i) {
            switch (i) {
                case 0:
                    return ActivityItemType.DEFAULT_ACTIVITY_ITEM_TYPE_DO_NOT_USE;
                case 1:
                    return ActivityItemType.CASH_IN;
                case 2:
                    return ActivityItemType.CASH_OUT;
                case 3:
                    return ActivityItemType.SAVINGS_INTERNAL_TRANSFER;
                case 4:
                    return ActivityItemType.P2P_FIAT_PAYMENT;
                case 5:
                    return ActivityItemType.COUPON_ACTIVITY;
                case 6:
                    return ActivityItemType.REMITTANCE_PAYMENT;
                case 7:
                    return ActivityItemType.CASH_CARD_TRANSACTION;
                case 8:
                case 21:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 54:
                case 55:
                case 76:
                case 77:
                default:
                    return null;
                case 9:
                    return ActivityItemType.P2P_BTC_PAYMENT;
                case 10:
                    return ActivityItemType.P2P_FRANKLIN_PAYMENT;
                case 11:
                    return ActivityItemType.CRYPTO_EXCHANGE;
                case 12:
                    return ActivityItemType.TTP_ACTIVITY;
                case 13:
                    return ActivityItemType.PAYCHECKS;
                case 14:
                    return ActivityItemType.SAVINGS_INTEREST_PAYMENT;
                case 15:
                    return ActivityItemType.NEW_DEVICE_LOGIN;
                case 16:
                    return ActivityItemType.P2P_INVEST_PAYMENT;
                case 17:
                    return ActivityItemType.INVESTING_AUTOMATION_EXECUTION;
                case 18:
                    return ActivityItemType.PENDING_REFERRAL;
                case 19:
                    return ActivityItemType.PAY_WITH_CASH_PAYMENT;
                case 20:
                    return ActivityItemType.PAY_WITH_CASH_REFUND;
                case 22:
                    return ActivityItemType.INVESTMENT_ORDER;
                case 23:
                    return ActivityItemType.SPONSORED_ACTIVITY;
                case 24:
                    return ActivityItemType.PAPER_MONEY_DEPOSIT;
                case 25:
                    return ActivityItemType.LOYALTY_ACTIVITY;
                case 26:
                    return ActivityItemType.LIGHTNING_DEPOSIT_BTC;
                case 27:
                    return ActivityItemType.LIGHTNING_WITHDRAWAL_BTC;
                case 28:
                    return ActivityItemType.INVESTMENT_DIVIDEND;
                case 29:
                    return ActivityItemType.CHECK_DEPOSIT;
                case 30:
                    return ActivityItemType.GIFT_CARD_PAYMENT;
                case 31:
                    return ActivityItemType.CRYPTO_PAYROLL_PREFERENCE;
                case 32:
                    return ActivityItemType.WITHDRAWAL_BTC;
                case 33:
                    return ActivityItemType.WIRE_TRANSFER;
                case 34:
                    return ActivityItemType.DEPOSIT_BTC;
                case 35:
                    return ActivityItemType.AFTERPAY_SUMMARY;
                case 36:
                    return ActivityItemType.C4B_ONBOARDING;
                case 37:
                    return ActivityItemType.P2P_SHADOW_PAYMENT;
                case 38:
                    return ActivityItemType.RECURRING_BUY_BTC;
                case 39:
                    return ActivityItemType.OVERDRAFT_TRANSACTION;
                case 40:
                    return ActivityItemType.LOAN_TRANSACTION;
                case 41:
                    return ActivityItemType.SPONSORSHIP_FEATURE_INVITATION;
                case 42:
                    return ActivityItemType.INSTANT_PAY_SETTLEMENT;
                case 43:
                    return ActivityItemType.INVESTMENT_CORPORATE_ACTION;
                case 53:
                    return ActivityItemType.BANKING_TRANSACTION;
                case 56:
                    return ActivityItemType.BILL_PAYMENT_PAYMENTUS;
                case 57:
                    return ActivityItemType.CASH_APP_PAY_DEPOSITS;
                case 58:
                    return ActivityItemType.INVESTMENT_CORRECTION;
                case 59:
                    return ActivityItemType.CASH_APP_PAY_PAYMENT;
                case 60:
                    return ActivityItemType.CASH_APP_PAY_REFUND;
                case 61:
                    return ActivityItemType.CASH_APP_ORDER;
                case 62:
                    return ActivityItemType.LEDGER;
                case 63:
                    return ActivityItemType.LEDGER_REFERENCE;
                case 64:
                    return ActivityItemType.LOCAL_CASHBACK;
                case 65:
                    return ActivityItemType.LOCAL_ORDER;
                case 66:
                    return ActivityItemType.SAVINGS_CASH_IN;
                case 67:
                    return ActivityItemType.INVESTING_LEDGER;
                case 68:
                    return ActivityItemType.BANKING_TRANSACTION_V2;
                case 69:
                    return ActivityItemType.LEDGER_ACTIVITY_REFERENCE;
                case 70:
                    return ActivityItemType.SPONSOR_PAYMENT_APPROVAL;
                case 71:
                    return ActivityItemType.STABLE_WITHDRAWAL_USDC;
                case 72:
                    return ActivityItemType.STABLE_DEPOSIT_USDC;
                case 73:
                    return ActivityItemType.P2P_POOL;
                case 74:
                    return ActivityItemType.LEDGER_EVENT_NO_ACTIVITY_ITEM;
                case 75:
                    return ActivityItemType.C4B_LISTING_PAYMENT_ACTIVITY;
                case 78:
                    return ActivityItemType.CUSTOMER_ADJUSTMENT;
                case 79:
                    return ActivityItemType.SAVINGS_SCHEDULED_AUTO_TRANSFER;
                case 80:
                    return ActivityItemType.CASH_APP_PAYOUT;
                case 81:
                    return ActivityItemType.LIFTED_RESTRICTION_TRANSFER;
                case 82:
                    return ActivityItemType.CASH_LITE_ONRAMP_CASH_IN;
                case 83:
                    return ActivityItemType.CASH_LITE_OFFRAMP_CASH_OUT;
                case 84:
                    return ActivityItemType.CASH_LITE_CARD_TRANSACTION;
            }
        }
    }

    static {
        ActivityItemType activityItemType = new ActivityItemType("DEFAULT_ACTIVITY_ITEM_TYPE_DO_NOT_USE", 0, 0);
        DEFAULT_ACTIVITY_ITEM_TYPE_DO_NOT_USE = activityItemType;
        ActivityItemType activityItemType2 = new ActivityItemType("CASH_IN", 1, 1);
        CASH_IN = activityItemType2;
        ActivityItemType activityItemType3 = new ActivityItemType("CASH_OUT", 2, 2);
        CASH_OUT = activityItemType3;
        ActivityItemType activityItemType4 = new ActivityItemType("SAVINGS_INTERNAL_TRANSFER", 3, 3);
        SAVINGS_INTERNAL_TRANSFER = activityItemType4;
        ActivityItemType activityItemType5 = new ActivityItemType("P2P_FIAT_PAYMENT", 4, 4);
        P2P_FIAT_PAYMENT = activityItemType5;
        ActivityItemType activityItemType6 = new ActivityItemType("COUPON_ACTIVITY", 5, 5);
        COUPON_ACTIVITY = activityItemType6;
        ActivityItemType activityItemType7 = new ActivityItemType("REMITTANCE_PAYMENT", 6, 6);
        REMITTANCE_PAYMENT = activityItemType7;
        ActivityItemType activityItemType8 = new ActivityItemType("CASH_CARD_TRANSACTION", 7, 7);
        CASH_CARD_TRANSACTION = activityItemType8;
        ActivityItemType activityItemType9 = new ActivityItemType("P2P_BTC_PAYMENT", 8, 9);
        P2P_BTC_PAYMENT = activityItemType9;
        ActivityItemType activityItemType10 = new ActivityItemType("P2P_FRANKLIN_PAYMENT", 9, 10);
        P2P_FRANKLIN_PAYMENT = activityItemType10;
        ActivityItemType activityItemType11 = new ActivityItemType("CRYPTO_EXCHANGE", 10, 11);
        CRYPTO_EXCHANGE = activityItemType11;
        ActivityItemType activityItemType12 = new ActivityItemType("TTP_ACTIVITY", 11, 12);
        TTP_ACTIVITY = activityItemType12;
        ActivityItemType activityItemType13 = new ActivityItemType("PAYCHECKS", 12, 13);
        PAYCHECKS = activityItemType13;
        ActivityItemType activityItemType14 = new ActivityItemType("SAVINGS_INTEREST_PAYMENT", 13, 14);
        SAVINGS_INTEREST_PAYMENT = activityItemType14;
        ActivityItemType activityItemType15 = new ActivityItemType("NEW_DEVICE_LOGIN", 14, 15);
        NEW_DEVICE_LOGIN = activityItemType15;
        ActivityItemType activityItemType16 = new ActivityItemType("P2P_INVEST_PAYMENT", 15, 16);
        P2P_INVEST_PAYMENT = activityItemType16;
        ActivityItemType activityItemType17 = new ActivityItemType("PENDING_REFERRAL", 16, 18);
        PENDING_REFERRAL = activityItemType17;
        ActivityItemType activityItemType18 = new ActivityItemType("PAY_WITH_CASH_PAYMENT", 17, 19);
        PAY_WITH_CASH_PAYMENT = activityItemType18;
        ActivityItemType activityItemType19 = new ActivityItemType("PAY_WITH_CASH_REFUND", 18, 20);
        PAY_WITH_CASH_REFUND = activityItemType19;
        ActivityItemType activityItemType20 = new ActivityItemType("SPONSORED_ACTIVITY", 19, 23);
        SPONSORED_ACTIVITY = activityItemType20;
        ActivityItemType activityItemType21 = new ActivityItemType("PAPER_MONEY_DEPOSIT", 20, 24);
        PAPER_MONEY_DEPOSIT = activityItemType21;
        ActivityItemType activityItemType22 = new ActivityItemType("LOYALTY_ACTIVITY", 21, 25);
        LOYALTY_ACTIVITY = activityItemType22;
        ActivityItemType activityItemType23 = new ActivityItemType("LIGHTNING_DEPOSIT_BTC", 22, 26);
        LIGHTNING_DEPOSIT_BTC = activityItemType23;
        ActivityItemType activityItemType24 = new ActivityItemType("LIGHTNING_WITHDRAWAL_BTC", 23, 27);
        LIGHTNING_WITHDRAWAL_BTC = activityItemType24;
        ActivityItemType activityItemType25 = new ActivityItemType("CHECK_DEPOSIT", 24, 29);
        CHECK_DEPOSIT = activityItemType25;
        ActivityItemType activityItemType26 = new ActivityItemType("GIFT_CARD_PAYMENT", 25, 30);
        GIFT_CARD_PAYMENT = activityItemType26;
        ActivityItemType activityItemType27 = new ActivityItemType("CRYPTO_PAYROLL_PREFERENCE", 26, 31);
        CRYPTO_PAYROLL_PREFERENCE = activityItemType27;
        ActivityItemType activityItemType28 = new ActivityItemType("WITHDRAWAL_BTC", 27, 32);
        WITHDRAWAL_BTC = activityItemType28;
        ActivityItemType activityItemType29 = new ActivityItemType("WIRE_TRANSFER", 28, 33);
        WIRE_TRANSFER = activityItemType29;
        ActivityItemType activityItemType30 = new ActivityItemType("DEPOSIT_BTC", 29, 34);
        DEPOSIT_BTC = activityItemType30;
        ActivityItemType activityItemType31 = new ActivityItemType("AFTERPAY_SUMMARY", 30, 35);
        AFTERPAY_SUMMARY = activityItemType31;
        ActivityItemType activityItemType32 = new ActivityItemType("C4B_ONBOARDING", 31, 36);
        C4B_ONBOARDING = activityItemType32;
        ActivityItemType activityItemType33 = new ActivityItemType("P2P_SHADOW_PAYMENT", 32, 37);
        P2P_SHADOW_PAYMENT = activityItemType33;
        ActivityItemType activityItemType34 = new ActivityItemType("RECURRING_BUY_BTC", 33, 38);
        RECURRING_BUY_BTC = activityItemType34;
        ActivityItemType activityItemType35 = new ActivityItemType("OVERDRAFT_TRANSACTION", 34, 39);
        OVERDRAFT_TRANSACTION = activityItemType35;
        ActivityItemType activityItemType36 = new ActivityItemType("LOAN_TRANSACTION", 35, 40);
        LOAN_TRANSACTION = activityItemType36;
        ActivityItemType activityItemType37 = new ActivityItemType("SPONSORSHIP_FEATURE_INVITATION", 36, 41);
        SPONSORSHIP_FEATURE_INVITATION = activityItemType37;
        ActivityItemType activityItemType38 = new ActivityItemType("INSTANT_PAY_SETTLEMENT", 37, 42);
        INSTANT_PAY_SETTLEMENT = activityItemType38;
        ActivityItemType activityItemType39 = new ActivityItemType("BANKING_TRANSACTION", 38, 53);
        BANKING_TRANSACTION = activityItemType39;
        ActivityItemType activityItemType40 = new ActivityItemType("BILL_PAYMENT_PAYMENTUS", 39, 56);
        BILL_PAYMENT_PAYMENTUS = activityItemType40;
        ActivityItemType activityItemType41 = new ActivityItemType("CASH_APP_PAY_DEPOSITS", 40, 57);
        CASH_APP_PAY_DEPOSITS = activityItemType41;
        ActivityItemType activityItemType42 = new ActivityItemType("CASH_APP_PAY_PAYMENT", 41, 59);
        CASH_APP_PAY_PAYMENT = activityItemType42;
        ActivityItemType activityItemType43 = new ActivityItemType("CASH_APP_PAY_REFUND", 42, 60);
        CASH_APP_PAY_REFUND = activityItemType43;
        ActivityItemType activityItemType44 = new ActivityItemType("CASH_APP_ORDER", 43, 61);
        CASH_APP_ORDER = activityItemType44;
        ActivityItemType activityItemType45 = new ActivityItemType("CASH_APP_PAYOUT", 44, 80);
        CASH_APP_PAYOUT = activityItemType45;
        ActivityItemType activityItemType46 = new ActivityItemType("INVESTING_AUTOMATION_EXECUTION", 45, 17);
        INVESTING_AUTOMATION_EXECUTION = activityItemType46;
        ActivityItemType activityItemType47 = new ActivityItemType("INVESTMENT_CORPORATE_ACTION", 46, 43);
        INVESTMENT_CORPORATE_ACTION = activityItemType47;
        ActivityItemType activityItemType48 = new ActivityItemType("INVESTMENT_CORRECTION", 47, 58);
        INVESTMENT_CORRECTION = activityItemType48;
        ActivityItemType activityItemType49 = new ActivityItemType("INVESTMENT_DIVIDEND", 48, 28);
        INVESTMENT_DIVIDEND = activityItemType49;
        ActivityItemType activityItemType50 = new ActivityItemType("INVESTMENT_ORDER", 49, 22);
        INVESTMENT_ORDER = activityItemType50;
        ActivityItemType activityItemType51 = new ActivityItemType("INVESTING_LEDGER", 50, 67);
        INVESTING_LEDGER = activityItemType51;
        ActivityItemType activityItemType52 = new ActivityItemType("LEDGER", 51, 62);
        LEDGER = activityItemType52;
        ActivityItemType activityItemType53 = new ActivityItemType("LEDGER_REFERENCE", 52, 63);
        LEDGER_REFERENCE = activityItemType53;
        ActivityItemType activityItemType54 = new ActivityItemType("LEDGER_ACTIVITY_REFERENCE", 53, 69);
        LEDGER_ACTIVITY_REFERENCE = activityItemType54;
        ActivityItemType activityItemType55 = new ActivityItemType("LEDGER_EVENT_NO_ACTIVITY_ITEM", 54, 74);
        LEDGER_EVENT_NO_ACTIVITY_ITEM = activityItemType55;
        ActivityItemType activityItemType56 = new ActivityItemType("LOCAL_CASHBACK", 55, 64);
        LOCAL_CASHBACK = activityItemType56;
        ActivityItemType activityItemType57 = new ActivityItemType("LOCAL_ORDER", 56, 65);
        LOCAL_ORDER = activityItemType57;
        ActivityItemType activityItemType58 = new ActivityItemType("SAVINGS_CASH_IN", 57, 66);
        SAVINGS_CASH_IN = activityItemType58;
        ActivityItemType activityItemType59 = new ActivityItemType("BANKING_TRANSACTION_V2", 58, 68);
        BANKING_TRANSACTION_V2 = activityItemType59;
        ActivityItemType activityItemType60 = new ActivityItemType("SPONSOR_PAYMENT_APPROVAL", 59, 70);
        SPONSOR_PAYMENT_APPROVAL = activityItemType60;
        ActivityItemType activityItemType61 = new ActivityItemType("STABLE_WITHDRAWAL_USDC", 60, 71);
        STABLE_WITHDRAWAL_USDC = activityItemType61;
        ActivityItemType activityItemType62 = new ActivityItemType("STABLE_DEPOSIT_USDC", 61, 72);
        STABLE_DEPOSIT_USDC = activityItemType62;
        ActivityItemType activityItemType63 = new ActivityItemType("P2P_POOL", 62, 73);
        P2P_POOL = activityItemType63;
        ActivityItemType activityItemType64 = new ActivityItemType("C4B_LISTING_PAYMENT_ACTIVITY", 63, 75);
        C4B_LISTING_PAYMENT_ACTIVITY = activityItemType64;
        ActivityItemType activityItemType65 = new ActivityItemType("CUSTOMER_ADJUSTMENT", 64, 78);
        CUSTOMER_ADJUSTMENT = activityItemType65;
        ActivityItemType activityItemType66 = new ActivityItemType("SAVINGS_SCHEDULED_AUTO_TRANSFER", 65, 79);
        SAVINGS_SCHEDULED_AUTO_TRANSFER = activityItemType66;
        ActivityItemType activityItemType67 = new ActivityItemType("LIFTED_RESTRICTION_TRANSFER", 66, 81);
        LIFTED_RESTRICTION_TRANSFER = activityItemType67;
        ActivityItemType activityItemType68 = new ActivityItemType("CASH_LITE_ONRAMP_CASH_IN", 67, 82);
        CASH_LITE_ONRAMP_CASH_IN = activityItemType68;
        ActivityItemType activityItemType69 = new ActivityItemType("CASH_LITE_OFFRAMP_CASH_OUT", 68, 83);
        CASH_LITE_OFFRAMP_CASH_OUT = activityItemType69;
        ActivityItemType activityItemType70 = new ActivityItemType("CASH_LITE_CARD_TRANSACTION", 69, 84);
        CASH_LITE_CARD_TRANSACTION = activityItemType70;
        ActivityItemType[] activityItemTypeArr = {activityItemType, activityItemType2, activityItemType3, activityItemType4, activityItemType5, activityItemType6, activityItemType7, activityItemType8, activityItemType9, activityItemType10, activityItemType11, activityItemType12, activityItemType13, activityItemType14, activityItemType15, activityItemType16, activityItemType17, activityItemType18, activityItemType19, activityItemType20, activityItemType21, activityItemType22, activityItemType23, activityItemType24, activityItemType25, activityItemType26, activityItemType27, activityItemType28, activityItemType29, activityItemType30, activityItemType31, activityItemType32, activityItemType33, activityItemType34, activityItemType35, activityItemType36, activityItemType37, activityItemType38, activityItemType39, activityItemType40, activityItemType41, activityItemType42, activityItemType43, activityItemType44, activityItemType45, activityItemType46, activityItemType47, activityItemType48, activityItemType49, activityItemType50, activityItemType51, activityItemType52, activityItemType53, activityItemType54, activityItemType55, activityItemType56, activityItemType57, activityItemType58, activityItemType59, activityItemType60, activityItemType61, activityItemType62, activityItemType63, activityItemType64, activityItemType65, activityItemType66, activityItemType67, activityItemType68, activityItemType69, activityItemType70};
        $VALUES = activityItemTypeArr;
        $ENTRIES = new EnumEntriesList(activityItemTypeArr);
        INSTANCE = new Companion();
        ADAPTER = new ActivityItemType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ActivityItemType.class), Syntax.PROTO_2, activityItemType);
    }

    public ActivityItemType(String str, int i, int i2) {
        this.value = i2;
    }

    public static final ActivityItemType fromValue(int i) {
        INSTANCE.getClass();
        return Companion.fromValue(i);
    }

    public static ActivityItemType valueOf(String str) {
        return (ActivityItemType) Enum.valueOf(ActivityItemType.class, str);
    }

    public static ActivityItemType[] values() {
        return (ActivityItemType[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}

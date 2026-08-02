package com.squareup.protos.franklin.data;

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
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\bX\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[¨\u0006\\"}, d2 = {"com/squareup/protos/franklin/data/Payment$CreationMechanism", "Lcom/squareup/wire/WireEnum;", "", "Lcom/squareup/protos/franklin/data/Payment$CreationMechanism;", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "EMAIL", "RPC", "TPP", "APP", "TRY_IT_NOW", "REFERRAL_BOUNTY", "BUSINESS_REFERRAL_BOUNTY", "WELCOME_BONUS", "REWARD", "WEB_SIGNUP", "WEB", "CASHBOARD", "RECURRING_PAYMENTS", "REIMBURSEMENT", "BANKSY", "CLAIMABLE", "IMESSAGE", "PAY_WITH_CASH", "ISSUED_CARD", "CASH_ADVANCE", "DDA_ACH", "CLAWBACK", "P2P_BANKLIN", "DISCOUNT", "PURCHASE", "PAYROLL", "YELLOW", "KEY_BANK", "ROBINHOOD", "BUTTERCOIN", "LEDGER", "THX", "CAVIAR", "CAVIAR_RESTAURANT", "CAVIAR_COURIER", "CAVIAR_DINER", "SQCAPITAL", "SQPAYROLL", "SQPAYROLL_TO_EMPLOYER", "SQPAYROLL_TO_EMPLOYEE", "CASHBOT", "PAYMENT_SCHEDULER", "INSTRUMENT_VERIFICATION", "QR_CODE", "NFC_TAG", "COLLEGE_BONUS", "INVEST_TRADE_ERROR", "MARKETING", "STOCK_PURCHASE", "ASYNC_CASH_OUT", "PLAID_UPSELL_BONUS", "LOAN_PAYMENT", "CROSS_BORDER_CASH_IN", "BITCOIN_PURCHASE", "CHECK", "SUPPORT_BALANCE_TRANSFER", "INVEST_P2P", "MONEY_MOVER_TEST", "PHYSICAL_CASH", "BNPL", "P2P_CORE", "INSTANT_PAYCHECK", "MONETA", "WIRE_TRANSFER", "LIGHTNING_TRANSFER", "CASH_ME_OUTSIDE", "CASH_OUT", "MONETA_P2P_INFLOW", "P2P_ENGINE", "ALLOWANCE", "OVERDRAFTLY", "CASH_FOR_BUSINESS", "PIGGYBANK", "CIVIL_PROCESSOR", "BILL_PAYMENT", "AFTERPAY_LOAN", "POOLS", "MONEYBOT", "PAY_LINK", "NEARBY", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Payment$CreationMechanism implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Payment$CreationMechanism[] $VALUES;
    public static final ProtoAdapter ADAPTER;
    public static final Payment$CreationMechanism AFTERPAY_LOAN;
    public static final Payment$CreationMechanism ALLOWANCE;
    public static final Payment$CreationMechanism APP;
    public static final Payment$CreationMechanism ASYNC_CASH_OUT;
    public static final Payment$CreationMechanism BANKSY;
    public static final Payment$CreationMechanism BILL_PAYMENT;
    public static final Payment$CreationMechanism BITCOIN_PURCHASE;
    public static final Payment$CreationMechanism BNPL;
    public static final Payment$CreationMechanism BUSINESS_REFERRAL_BOUNTY;
    public static final Payment$CreationMechanism BUTTERCOIN;
    public static final Payment$CreationMechanism CASHBOARD;
    public static final Payment$CreationMechanism CASHBOT;
    public static final Payment$CreationMechanism CASH_ADVANCE;
    public static final Payment$CreationMechanism CASH_FOR_BUSINESS;
    public static final Payment$CreationMechanism CASH_ME_OUTSIDE;
    public static final Payment$CreationMechanism CASH_OUT;
    public static final Payment$CreationMechanism CAVIAR;
    public static final Payment$CreationMechanism CAVIAR_COURIER;
    public static final Payment$CreationMechanism CAVIAR_DINER;
    public static final Payment$CreationMechanism CAVIAR_RESTAURANT;
    public static final Payment$CreationMechanism CHECK;
    public static final Payment$CreationMechanism CIVIL_PROCESSOR;
    public static final Payment$CreationMechanism CLAIMABLE;
    public static final Payment$CreationMechanism CLAWBACK;
    public static final Payment$CreationMechanism COLLEGE_BONUS;
    public static final Payment$CreationMechanism CROSS_BORDER_CASH_IN;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Payment$CreationMechanism DDA_ACH;
    public static final Payment$CreationMechanism DISCOUNT;
    public static final Payment$CreationMechanism EMAIL;
    public static final Payment$CreationMechanism IMESSAGE;
    public static final Payment$CreationMechanism INSTANT_PAYCHECK;
    public static final Payment$CreationMechanism INSTRUMENT_VERIFICATION;
    public static final Payment$CreationMechanism INVEST_P2P;
    public static final Payment$CreationMechanism INVEST_TRADE_ERROR;
    public static final Payment$CreationMechanism ISSUED_CARD;
    public static final Payment$CreationMechanism KEY_BANK;
    public static final Payment$CreationMechanism LEDGER;
    public static final Payment$CreationMechanism LIGHTNING_TRANSFER;
    public static final Payment$CreationMechanism LOAN_PAYMENT;
    public static final Payment$CreationMechanism MARKETING;
    public static final Payment$CreationMechanism MONETA;
    public static final Payment$CreationMechanism MONETA_P2P_INFLOW;
    public static final Payment$CreationMechanism MONEYBOT;
    public static final Payment$CreationMechanism MONEY_MOVER_TEST;
    public static final Payment$CreationMechanism NEARBY;
    public static final Payment$CreationMechanism NFC_TAG;
    public static final Payment$CreationMechanism OVERDRAFTLY;
    public static final Payment$CreationMechanism P2P_BANKLIN;
    public static final Payment$CreationMechanism P2P_CORE;
    public static final Payment$CreationMechanism P2P_ENGINE;
    public static final Payment$CreationMechanism PAYMENT_SCHEDULER;
    public static final Payment$CreationMechanism PAYROLL;
    public static final Payment$CreationMechanism PAY_LINK;
    public static final Payment$CreationMechanism PAY_WITH_CASH;
    public static final Payment$CreationMechanism PHYSICAL_CASH;
    public static final Payment$CreationMechanism PIGGYBANK;
    public static final Payment$CreationMechanism PLAID_UPSELL_BONUS;
    public static final Payment$CreationMechanism POOLS;
    public static final Payment$CreationMechanism PURCHASE;
    public static final Payment$CreationMechanism QR_CODE;
    public static final Payment$CreationMechanism RECURRING_PAYMENTS;
    public static final Payment$CreationMechanism REFERRAL_BOUNTY;
    public static final Payment$CreationMechanism REIMBURSEMENT;
    public static final Payment$CreationMechanism REWARD;
    public static final Payment$CreationMechanism ROBINHOOD;
    public static final Payment$CreationMechanism RPC;
    public static final Payment$CreationMechanism SQCAPITAL;
    public static final Payment$CreationMechanism SQPAYROLL;
    public static final Payment$CreationMechanism SQPAYROLL_TO_EMPLOYEE;
    public static final Payment$CreationMechanism SQPAYROLL_TO_EMPLOYER;
    public static final Payment$CreationMechanism STOCK_PURCHASE;
    public static final Payment$CreationMechanism SUPPORT_BALANCE_TRANSFER;
    public static final Payment$CreationMechanism THX;
    public static final Payment$CreationMechanism TPP;
    public static final Payment$CreationMechanism TRY_IT_NOW;
    public static final Payment$CreationMechanism WEB;
    public static final Payment$CreationMechanism WEB_SIGNUP;
    public static final Payment$CreationMechanism WELCOME_BONUS;
    public static final Payment$CreationMechanism WIRE_TRANSFER;
    public static final Payment$CreationMechanism YELLOW;
    private final int value;

    private static final /* synthetic */ Payment$CreationMechanism[] $values() {
        return new Payment$CreationMechanism[]{EMAIL, RPC, TPP, APP, TRY_IT_NOW, REFERRAL_BOUNTY, BUSINESS_REFERRAL_BOUNTY, WELCOME_BONUS, REWARD, WEB_SIGNUP, WEB, CASHBOARD, RECURRING_PAYMENTS, REIMBURSEMENT, BANKSY, CLAIMABLE, IMESSAGE, PAY_WITH_CASH, ISSUED_CARD, CASH_ADVANCE, DDA_ACH, CLAWBACK, P2P_BANKLIN, DISCOUNT, PURCHASE, PAYROLL, YELLOW, KEY_BANK, ROBINHOOD, BUTTERCOIN, LEDGER, THX, CAVIAR, CAVIAR_RESTAURANT, CAVIAR_COURIER, CAVIAR_DINER, SQCAPITAL, SQPAYROLL, SQPAYROLL_TO_EMPLOYER, SQPAYROLL_TO_EMPLOYEE, CASHBOT, PAYMENT_SCHEDULER, INSTRUMENT_VERIFICATION, QR_CODE, NFC_TAG, COLLEGE_BONUS, INVEST_TRADE_ERROR, MARKETING, STOCK_PURCHASE, ASYNC_CASH_OUT, PLAID_UPSELL_BONUS, LOAN_PAYMENT, CROSS_BORDER_CASH_IN, BITCOIN_PURCHASE, CHECK, SUPPORT_BALANCE_TRANSFER, INVEST_P2P, MONEY_MOVER_TEST, PHYSICAL_CASH, BNPL, P2P_CORE, INSTANT_PAYCHECK, MONETA, WIRE_TRANSFER, LIGHTNING_TRANSFER, CASH_ME_OUTSIDE, CASH_OUT, MONETA_P2P_INFLOW, P2P_ENGINE, ALLOWANCE, OVERDRAFTLY, CASH_FOR_BUSINESS, PIGGYBANK, CIVIL_PROCESSOR, BILL_PAYMENT, AFTERPAY_LOAN, POOLS, MONEYBOT, PAY_LINK, NEARBY};
    }

    static {
        final Payment$CreationMechanism payment$CreationMechanism = new Payment$CreationMechanism("EMAIL", 0, 0);
        EMAIL = payment$CreationMechanism;
        RPC = new Payment$CreationMechanism("RPC", 1, 1);
        TPP = new Payment$CreationMechanism("TPP", 2, 2);
        APP = new Payment$CreationMechanism("APP", 3, 3);
        TRY_IT_NOW = new Payment$CreationMechanism("TRY_IT_NOW", 4, 4);
        REFERRAL_BOUNTY = new Payment$CreationMechanism("REFERRAL_BOUNTY", 5, 5);
        BUSINESS_REFERRAL_BOUNTY = new Payment$CreationMechanism("BUSINESS_REFERRAL_BOUNTY", 6, 19);
        WELCOME_BONUS = new Payment$CreationMechanism("WELCOME_BONUS", 7, 8);
        REWARD = new Payment$CreationMechanism("REWARD", 8, 18);
        WEB_SIGNUP = new Payment$CreationMechanism("WEB_SIGNUP", 9, 14);
        WEB = new Payment$CreationMechanism("WEB", 10, 15);
        CASHBOARD = new Payment$CreationMechanism("CASHBOARD", 11, 21);
        RECURRING_PAYMENTS = new Payment$CreationMechanism("RECURRING_PAYMENTS", 12, 16);
        REIMBURSEMENT = new Payment$CreationMechanism("REIMBURSEMENT", 13, 17);
        BANKSY = new Payment$CreationMechanism("BANKSY", 14, 20);
        CLAIMABLE = new Payment$CreationMechanism("CLAIMABLE", 15, 39);
        IMESSAGE = new Payment$CreationMechanism("IMESSAGE", 16, 22);
        PAY_WITH_CASH = new Payment$CreationMechanism("PAY_WITH_CASH", 17, 40);
        ISSUED_CARD = new Payment$CreationMechanism("ISSUED_CARD", 18, 23);
        CASH_ADVANCE = new Payment$CreationMechanism("CASH_ADVANCE", 19, 25);
        DDA_ACH = new Payment$CreationMechanism("DDA_ACH", 20, 31);
        CLAWBACK = new Payment$CreationMechanism("CLAWBACK", 21, 32);
        P2P_BANKLIN = new Payment$CreationMechanism("P2P_BANKLIN", 22, 33);
        DISCOUNT = new Payment$CreationMechanism("DISCOUNT", 23, 34);
        PURCHASE = new Payment$CreationMechanism("PURCHASE", 24, 38);
        PAYROLL = new Payment$CreationMechanism("PAYROLL", 25, 6);
        YELLOW = new Payment$CreationMechanism("YELLOW", 26, 7);
        KEY_BANK = new Payment$CreationMechanism("KEY_BANK", 27, 9);
        ROBINHOOD = new Payment$CreationMechanism("ROBINHOOD", 28, 10);
        BUTTERCOIN = new Payment$CreationMechanism("BUTTERCOIN", 29, 11);
        LEDGER = new Payment$CreationMechanism("LEDGER", 30, 12);
        THX = new Payment$CreationMechanism("THX", 31, 13);
        CAVIAR = new Payment$CreationMechanism("CAVIAR", 32, 24);
        CAVIAR_RESTAURANT = new Payment$CreationMechanism("CAVIAR_RESTAURANT", 33, 27);
        CAVIAR_COURIER = new Payment$CreationMechanism("CAVIAR_COURIER", 34, 28);
        CAVIAR_DINER = new Payment$CreationMechanism("CAVIAR_DINER", 35, 37);
        SQCAPITAL = new Payment$CreationMechanism("SQCAPITAL", 36, 29);
        SQPAYROLL = new Payment$CreationMechanism("SQPAYROLL", 37, 30);
        SQPAYROLL_TO_EMPLOYER = new Payment$CreationMechanism("SQPAYROLL_TO_EMPLOYER", 38, 35);
        SQPAYROLL_TO_EMPLOYEE = new Payment$CreationMechanism("SQPAYROLL_TO_EMPLOYEE", 39, 36);
        CASHBOT = new Payment$CreationMechanism("CASHBOT", 40, 26);
        PAYMENT_SCHEDULER = new Payment$CreationMechanism("PAYMENT_SCHEDULER", 41, 41);
        INSTRUMENT_VERIFICATION = new Payment$CreationMechanism("INSTRUMENT_VERIFICATION", 42, 42);
        QR_CODE = new Payment$CreationMechanism("QR_CODE", 43, 43);
        NFC_TAG = new Payment$CreationMechanism("NFC_TAG", 44, 44);
        COLLEGE_BONUS = new Payment$CreationMechanism("COLLEGE_BONUS", 45, 45);
        INVEST_TRADE_ERROR = new Payment$CreationMechanism("INVEST_TRADE_ERROR", 46, 46);
        MARKETING = new Payment$CreationMechanism("MARKETING", 47, 47);
        STOCK_PURCHASE = new Payment$CreationMechanism("STOCK_PURCHASE", 48, 48);
        ASYNC_CASH_OUT = new Payment$CreationMechanism("ASYNC_CASH_OUT", 49, 49);
        PLAID_UPSELL_BONUS = new Payment$CreationMechanism("PLAID_UPSELL_BONUS", 50, 50);
        LOAN_PAYMENT = new Payment$CreationMechanism("LOAN_PAYMENT", 51, 51);
        CROSS_BORDER_CASH_IN = new Payment$CreationMechanism("CROSS_BORDER_CASH_IN", 52, 52);
        BITCOIN_PURCHASE = new Payment$CreationMechanism("BITCOIN_PURCHASE", 53, 53);
        CHECK = new Payment$CreationMechanism("CHECK", 54, 54);
        SUPPORT_BALANCE_TRANSFER = new Payment$CreationMechanism("SUPPORT_BALANCE_TRANSFER", 55, 55);
        INVEST_P2P = new Payment$CreationMechanism("INVEST_P2P", 56, 56);
        MONEY_MOVER_TEST = new Payment$CreationMechanism("MONEY_MOVER_TEST", 57, 57);
        PHYSICAL_CASH = new Payment$CreationMechanism("PHYSICAL_CASH", 58, 58);
        BNPL = new Payment$CreationMechanism("BNPL", 59, 59);
        P2P_CORE = new Payment$CreationMechanism("P2P_CORE", 60, 60);
        INSTANT_PAYCHECK = new Payment$CreationMechanism("INSTANT_PAYCHECK", 61, 61);
        MONETA = new Payment$CreationMechanism("MONETA", 62, 62);
        WIRE_TRANSFER = new Payment$CreationMechanism("WIRE_TRANSFER", 63, 63);
        LIGHTNING_TRANSFER = new Payment$CreationMechanism("LIGHTNING_TRANSFER", 64, 64);
        CASH_ME_OUTSIDE = new Payment$CreationMechanism("CASH_ME_OUTSIDE", 65, 65);
        CASH_OUT = new Payment$CreationMechanism("CASH_OUT", 66, 66);
        MONETA_P2P_INFLOW = new Payment$CreationMechanism("MONETA_P2P_INFLOW", 67, 70);
        P2P_ENGINE = new Payment$CreationMechanism("P2P_ENGINE", 68, 67);
        ALLOWANCE = new Payment$CreationMechanism("ALLOWANCE", 69, 68);
        OVERDRAFTLY = new Payment$CreationMechanism("OVERDRAFTLY", 70, 69);
        CASH_FOR_BUSINESS = new Payment$CreationMechanism("CASH_FOR_BUSINESS", 71, 71);
        PIGGYBANK = new Payment$CreationMechanism("PIGGYBANK", 72, 72);
        CIVIL_PROCESSOR = new Payment$CreationMechanism("CIVIL_PROCESSOR", 73, 73);
        BILL_PAYMENT = new Payment$CreationMechanism("BILL_PAYMENT", 74, 74);
        AFTERPAY_LOAN = new Payment$CreationMechanism("AFTERPAY_LOAN", 75, 75);
        POOLS = new Payment$CreationMechanism("POOLS", 76, 76);
        MONEYBOT = new Payment$CreationMechanism("MONEYBOT", 77, 77);
        PAY_LINK = new Payment$CreationMechanism("PAY_LINK", 78, 78);
        NEARBY = new Payment$CreationMechanism("NEARBY", 79, 79);
        Payment$CreationMechanism[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Payment$CreationMechanism.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, payment$CreationMechanism) { // from class: com.squareup.protos.franklin.data.Payment$CreationMechanism$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public Payment$CreationMechanism fromValue(int value) {
                return Payment$CreationMechanism.INSTANCE.fromValue(value);
            }
        };
    }

    private Payment$CreationMechanism(String str, int i, int i2) {
        this.value = i2;
    }

    public static final Payment$CreationMechanism fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static Payment$CreationMechanism valueOf(String str) {
        return (Payment$CreationMechanism) Enum.valueOf(Payment$CreationMechanism.class, str);
    }

    public static Payment$CreationMechanism[] values() {
        return (Payment$CreationMechanism[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/data/Payment$CreationMechanism$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/data/Payment$CreationMechanism;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Payment$CreationMechanism fromValue(int value) {
            switch (value) {
                case 0:
                    return Payment$CreationMechanism.EMAIL;
                case 1:
                    return Payment$CreationMechanism.RPC;
                case 2:
                    return Payment$CreationMechanism.TPP;
                case 3:
                    return Payment$CreationMechanism.APP;
                case 4:
                    return Payment$CreationMechanism.TRY_IT_NOW;
                case 5:
                    return Payment$CreationMechanism.REFERRAL_BOUNTY;
                case 6:
                    return Payment$CreationMechanism.PAYROLL;
                case 7:
                    return Payment$CreationMechanism.YELLOW;
                case 8:
                    return Payment$CreationMechanism.WELCOME_BONUS;
                case 9:
                    return Payment$CreationMechanism.KEY_BANK;
                case 10:
                    return Payment$CreationMechanism.ROBINHOOD;
                case 11:
                    return Payment$CreationMechanism.BUTTERCOIN;
                case 12:
                    return Payment$CreationMechanism.LEDGER;
                case 13:
                    return Payment$CreationMechanism.THX;
                case 14:
                    return Payment$CreationMechanism.WEB_SIGNUP;
                case 15:
                    return Payment$CreationMechanism.WEB;
                case 16:
                    return Payment$CreationMechanism.RECURRING_PAYMENTS;
                case 17:
                    return Payment$CreationMechanism.REIMBURSEMENT;
                case 18:
                    return Payment$CreationMechanism.REWARD;
                case 19:
                    return Payment$CreationMechanism.BUSINESS_REFERRAL_BOUNTY;
                case 20:
                    return Payment$CreationMechanism.BANKSY;
                case 21:
                    return Payment$CreationMechanism.CASHBOARD;
                case 22:
                    return Payment$CreationMechanism.IMESSAGE;
                case 23:
                    return Payment$CreationMechanism.ISSUED_CARD;
                case 24:
                    return Payment$CreationMechanism.CAVIAR;
                case 25:
                    return Payment$CreationMechanism.CASH_ADVANCE;
                case 26:
                    return Payment$CreationMechanism.CASHBOT;
                case 27:
                    return Payment$CreationMechanism.CAVIAR_RESTAURANT;
                case 28:
                    return Payment$CreationMechanism.CAVIAR_COURIER;
                case 29:
                    return Payment$CreationMechanism.SQCAPITAL;
                case 30:
                    return Payment$CreationMechanism.SQPAYROLL;
                case 31:
                    return Payment$CreationMechanism.DDA_ACH;
                case 32:
                    return Payment$CreationMechanism.CLAWBACK;
                case 33:
                    return Payment$CreationMechanism.P2P_BANKLIN;
                case 34:
                    return Payment$CreationMechanism.DISCOUNT;
                case 35:
                    return Payment$CreationMechanism.SQPAYROLL_TO_EMPLOYER;
                case 36:
                    return Payment$CreationMechanism.SQPAYROLL_TO_EMPLOYEE;
                case 37:
                    return Payment$CreationMechanism.CAVIAR_DINER;
                case 38:
                    return Payment$CreationMechanism.PURCHASE;
                case 39:
                    return Payment$CreationMechanism.CLAIMABLE;
                case 40:
                    return Payment$CreationMechanism.PAY_WITH_CASH;
                case 41:
                    return Payment$CreationMechanism.PAYMENT_SCHEDULER;
                case 42:
                    return Payment$CreationMechanism.INSTRUMENT_VERIFICATION;
                case 43:
                    return Payment$CreationMechanism.QR_CODE;
                case 44:
                    return Payment$CreationMechanism.NFC_TAG;
                case 45:
                    return Payment$CreationMechanism.COLLEGE_BONUS;
                case 46:
                    return Payment$CreationMechanism.INVEST_TRADE_ERROR;
                case 47:
                    return Payment$CreationMechanism.MARKETING;
                case 48:
                    return Payment$CreationMechanism.STOCK_PURCHASE;
                case 49:
                    return Payment$CreationMechanism.ASYNC_CASH_OUT;
                case 50:
                    return Payment$CreationMechanism.PLAID_UPSELL_BONUS;
                case 51:
                    return Payment$CreationMechanism.LOAN_PAYMENT;
                case 52:
                    return Payment$CreationMechanism.CROSS_BORDER_CASH_IN;
                case 53:
                    return Payment$CreationMechanism.BITCOIN_PURCHASE;
                case 54:
                    return Payment$CreationMechanism.CHECK;
                case 55:
                    return Payment$CreationMechanism.SUPPORT_BALANCE_TRANSFER;
                case 56:
                    return Payment$CreationMechanism.INVEST_P2P;
                case 57:
                    return Payment$CreationMechanism.MONEY_MOVER_TEST;
                case 58:
                    return Payment$CreationMechanism.PHYSICAL_CASH;
                case 59:
                    return Payment$CreationMechanism.BNPL;
                case 60:
                    return Payment$CreationMechanism.P2P_CORE;
                case 61:
                    return Payment$CreationMechanism.INSTANT_PAYCHECK;
                case 62:
                    return Payment$CreationMechanism.MONETA;
                case 63:
                    return Payment$CreationMechanism.WIRE_TRANSFER;
                case 64:
                    return Payment$CreationMechanism.LIGHTNING_TRANSFER;
                case 65:
                    return Payment$CreationMechanism.CASH_ME_OUTSIDE;
                case 66:
                    return Payment$CreationMechanism.CASH_OUT;
                case 67:
                    return Payment$CreationMechanism.P2P_ENGINE;
                case 68:
                    return Payment$CreationMechanism.ALLOWANCE;
                case 69:
                    return Payment$CreationMechanism.OVERDRAFTLY;
                case 70:
                    return Payment$CreationMechanism.MONETA_P2P_INFLOW;
                case 71:
                    return Payment$CreationMechanism.CASH_FOR_BUSINESS;
                case 72:
                    return Payment$CreationMechanism.PIGGYBANK;
                case 73:
                    return Payment$CreationMechanism.CIVIL_PROCESSOR;
                case 74:
                    return Payment$CreationMechanism.BILL_PAYMENT;
                case 75:
                    return Payment$CreationMechanism.AFTERPAY_LOAN;
                case 76:
                    return Payment$CreationMechanism.POOLS;
                case 77:
                    return Payment$CreationMechanism.MONEYBOT;
                case 78:
                    return Payment$CreationMechanism.PAY_LINK;
                case 79:
                    return Payment$CreationMechanism.NEARBY;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }
}

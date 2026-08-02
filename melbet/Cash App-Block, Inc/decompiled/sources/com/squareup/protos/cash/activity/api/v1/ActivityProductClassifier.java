package com.squareup.protos.cash.activity.api.v1;

import com.plaid.internal.EnumC0170g;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Reflection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0003\b\u0082\u0001\b\u0086\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001¨\u0006\u0085\u0001"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityProductClassifier;", "Lcom/squareup/wire/WireEnum;", "", "", "value", "I", "getValue", "()I", "Companion", "APC_DEFAULT_DO_NOT_USE", "APC_ACH_TRANSFER", "APC_ACH_TRANSFER_RETURN", "APC_AFTERPAY_SUMMARY", "APC_ALLOWANCE", "APC_ATM", "APC_AUTOMATED", "APC_BALANCE_IMPACT_CASH", "APC_BALANCE_IMPACT_SAVINGS", "APC_BIDV_FAILED", "APC_BIDV_IN_REVIEW", "APC_BIDV_PASSED", "APC_BILL_PAYMENT", "APC_BITKEY_TRANSFER", "APC_BORROW", "APC_BTC", "APC_BTC_AUTO_WITHDRAWAL", "APC_BTC_BOOST", "APC_BTC_BUY", "APC_BTC_LIGHTNING_NETWORK", "APC_BTC_SELL", "APC_BUSINESS_ACCOUNT_ONBOARDING", "APC_BUSINESS_CARD", "APC_C4B_LISTING_PAYMENT", "APC_CASH_APP_LOCAL", "APC_CASH_APP_LOCAL_CASHBACK", "APC_CASH_APP_LOCAL_ORDER", "APC_CASH_APP_ORDER", "APC_CASH_APP_PAY", "APC_CASH_APP_PAY_DEPOSIT", "APC_CASH_APP_PAY_LATER", "APC_CASH_APP_PAY_NOW", "APC_CASH_APP_PAY_PAYMENT", "APC_CASH_APP_PAY_REFUND", "APC_CASH_APP_PAYOUT", "APC_CASH_CARD", "APC_CASH_CARD_ACCOUNT_FUNDING_TRANSACTION", "APC_CASH_CARD_CASHBACK", "APC_CASH_CARD_ORIGINAL_CREDIT_TRANSACTION", "APC_CASH_CARD_QUASI_CASH", "APC_CASH_CARD_RETURN", "APC_CASH_IN", "APC_CASH_OUT", "APC_CHECK_DEPOSIT", "APC_COUPON", "APC_CRYPTO_EXCHANGE", "APC_CRYPTO_TRADING_SETTLEMENT", "APC_CUSTOMER_ADJUSTMENT", "APC_CUSTOMER_ADJUSTMENT_CLAWBACK", "APC_CUSTOMER_ADJUSTMENT_REIMBURSEMENT", "APC_DEBIT_TRANSFER", "APC_DEPOSIT_REVERSAL", "APC_DEVICE_LOGIN", "APC_ESTIMATED_INTEREST_PAYOUT", "APC_EXPIRED_COUPON", "APC_EXTERNAL_TRANSFER", "APC_FEE", "APC_FIAT", "APC_GENERIC_BTC_TRANSACTION", "APC_GIFT_CARD", "APC_GIVEAWAY", "APC_INSTANT_PAY", "APC_INSTANT_TRANSFER", "APC_INTEREST_PAYOUT", "APC_INTERNAL_TRANSFER", "APC_INVEST", "APC_INVEST_CORPORATE_ACTION", "APC_INVEST_CORRECTION", "APC_INVEST_DIVIDEND", "APC_INVEST_ORDER", "APC_ISSUER_PROCESSING", "APC_KYB_COMPLETED", "APC_LENDING", "APC_LENDING_PRE_PURCHASE_FINANCING", "APC_LENDING_RETROACTIVE_FINANCING", "APC_LENDING_RETROACTIVE_FINANCING_ELIGIBLE", "APC_LENDING_SINGLE_USE_PAYMENT", "APC_LIFTED_RESTRICTION_TRANSFER", "APC_LIGHTNING_DEPOSIT", "APC_LIGHTNING_WITHDRAWAL", "APC_LOYALTY", "APC_MARQETA", "APC_NON_BALANCE_IMPACTING_ITEM", "APC_OVERDRAFT", "APC_P2P", "APC_P2P_EXTERNALLY_FUNDED", "APC_P2P_OON", "APC_P2P_PROSPECT", "APC_P2P_RECEIVE_AS_BITCOIN", "APC_P2P_POOL", "APC_P2P_POOL_CLOSURE", "APC_P2P_POOL_CONTRIBUTION", "APC_P2P_POOL_GOAL_REACHED", "APC_P2P_POOL_INVITE", "APC_P2P_POOL_STATUS", "APC_PAPER_MONEY_DEPOSIT", "APC_PAYCHECK", "APC_PAYCHECK_DISTRIBUTION", "APC_RECURRING", "APC_REDEEMED_COUPON", "APC_REFERRAL", "APC_REFUND", "APC_REMITTANCE", "APC_ROUND_UP", "APC_RUNNING_BALANCE_LINK", "APC_SAVINGS", "APC_SHAZAM", "APC_SLOW_TRANSFER", "APC_SPONSORED_ACTIVITY", "APC_SPONSORSHIP", "APC_SPONSORSHIP_FEATURE_INVITATION", "APC_SPONSOR_PAYMENT_APPROVAL", "APC_SQUARE_BTC_SAVINGS", "APC_SQUARE_PAYROLL", "APC_SQUARE_PAYROLL_TIPS", "APC_STABLE", "APC_STABLE_DEPOSIT", "APC_STABLE_WITHDRAWAL", "APC_STOCK_BUY", "APC_STOCK_SELL", "APC_TAP_TO_PAY", "APC_TIDAL_CONTRIBUTION", "APC_VISA_DPS", "APC_WIRE_TRANSFER", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityProductClassifier implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ActivityProductClassifier[] $VALUES;
    public static final ProtoAdapter ADAPTER;
    public static final ActivityProductClassifier APC_ACH_TRANSFER;
    public static final ActivityProductClassifier APC_ACH_TRANSFER_RETURN;
    public static final ActivityProductClassifier APC_AFTERPAY_SUMMARY;
    public static final ActivityProductClassifier APC_ALLOWANCE;
    public static final ActivityProductClassifier APC_ATM;
    public static final ActivityProductClassifier APC_AUTOMATED;
    public static final ActivityProductClassifier APC_BALANCE_IMPACT_CASH;
    public static final ActivityProductClassifier APC_BALANCE_IMPACT_SAVINGS;
    public static final ActivityProductClassifier APC_BIDV_FAILED;
    public static final ActivityProductClassifier APC_BIDV_IN_REVIEW;
    public static final ActivityProductClassifier APC_BIDV_PASSED;
    public static final ActivityProductClassifier APC_BILL_PAYMENT;
    public static final ActivityProductClassifier APC_BITKEY_TRANSFER;
    public static final ActivityProductClassifier APC_BORROW;
    public static final ActivityProductClassifier APC_BTC;
    public static final ActivityProductClassifier APC_BTC_AUTO_WITHDRAWAL;
    public static final ActivityProductClassifier APC_BTC_BOOST;
    public static final ActivityProductClassifier APC_BTC_BUY;
    public static final ActivityProductClassifier APC_BTC_LIGHTNING_NETWORK;
    public static final ActivityProductClassifier APC_BTC_SELL;
    public static final ActivityProductClassifier APC_BUSINESS_ACCOUNT_ONBOARDING;
    public static final ActivityProductClassifier APC_BUSINESS_CARD;
    public static final ActivityProductClassifier APC_C4B_LISTING_PAYMENT;
    public static final ActivityProductClassifier APC_CASH_APP_LOCAL;
    public static final ActivityProductClassifier APC_CASH_APP_LOCAL_CASHBACK;
    public static final ActivityProductClassifier APC_CASH_APP_LOCAL_ORDER;
    public static final ActivityProductClassifier APC_CASH_APP_ORDER;
    public static final ActivityProductClassifier APC_CASH_APP_PAY;
    public static final ActivityProductClassifier APC_CASH_APP_PAYOUT;
    public static final ActivityProductClassifier APC_CASH_APP_PAY_DEPOSIT;
    public static final ActivityProductClassifier APC_CASH_APP_PAY_LATER;
    public static final ActivityProductClassifier APC_CASH_APP_PAY_NOW;
    public static final ActivityProductClassifier APC_CASH_APP_PAY_PAYMENT;
    public static final ActivityProductClassifier APC_CASH_APP_PAY_REFUND;
    public static final ActivityProductClassifier APC_CASH_CARD;
    public static final ActivityProductClassifier APC_CASH_CARD_ACCOUNT_FUNDING_TRANSACTION;
    public static final ActivityProductClassifier APC_CASH_CARD_CASHBACK;
    public static final ActivityProductClassifier APC_CASH_CARD_ORIGINAL_CREDIT_TRANSACTION;
    public static final ActivityProductClassifier APC_CASH_CARD_QUASI_CASH;
    public static final ActivityProductClassifier APC_CASH_CARD_RETURN;
    public static final ActivityProductClassifier APC_CASH_IN;
    public static final ActivityProductClassifier APC_CASH_OUT;
    public static final ActivityProductClassifier APC_CHECK_DEPOSIT;
    public static final ActivityProductClassifier APC_COUPON;
    public static final ActivityProductClassifier APC_CRYPTO_EXCHANGE;
    public static final ActivityProductClassifier APC_CRYPTO_TRADING_SETTLEMENT;
    public static final ActivityProductClassifier APC_CUSTOMER_ADJUSTMENT;
    public static final ActivityProductClassifier APC_CUSTOMER_ADJUSTMENT_CLAWBACK;
    public static final ActivityProductClassifier APC_CUSTOMER_ADJUSTMENT_REIMBURSEMENT;
    public static final ActivityProductClassifier APC_DEBIT_TRANSFER;
    public static final ActivityProductClassifier APC_DEFAULT_DO_NOT_USE;
    public static final ActivityProductClassifier APC_DEPOSIT_REVERSAL;
    public static final ActivityProductClassifier APC_DEVICE_LOGIN;
    public static final ActivityProductClassifier APC_ESTIMATED_INTEREST_PAYOUT;
    public static final ActivityProductClassifier APC_EXPIRED_COUPON;
    public static final ActivityProductClassifier APC_EXTERNAL_TRANSFER;
    public static final ActivityProductClassifier APC_FEE;
    public static final ActivityProductClassifier APC_FIAT;
    public static final ActivityProductClassifier APC_GENERIC_BTC_TRANSACTION;
    public static final ActivityProductClassifier APC_GIFT_CARD;
    public static final ActivityProductClassifier APC_GIVEAWAY;
    public static final ActivityProductClassifier APC_INSTANT_PAY;
    public static final ActivityProductClassifier APC_INSTANT_TRANSFER;
    public static final ActivityProductClassifier APC_INTEREST_PAYOUT;
    public static final ActivityProductClassifier APC_INTERNAL_TRANSFER;
    public static final ActivityProductClassifier APC_INVEST;
    public static final ActivityProductClassifier APC_INVEST_CORPORATE_ACTION;
    public static final ActivityProductClassifier APC_INVEST_CORRECTION;
    public static final ActivityProductClassifier APC_INVEST_DIVIDEND;
    public static final ActivityProductClassifier APC_INVEST_ORDER;
    public static final ActivityProductClassifier APC_ISSUER_PROCESSING;
    public static final ActivityProductClassifier APC_KYB_COMPLETED;
    public static final ActivityProductClassifier APC_LENDING;
    public static final ActivityProductClassifier APC_LENDING_PRE_PURCHASE_FINANCING;
    public static final ActivityProductClassifier APC_LENDING_RETROACTIVE_FINANCING;
    public static final ActivityProductClassifier APC_LENDING_RETROACTIVE_FINANCING_ELIGIBLE;
    public static final ActivityProductClassifier APC_LENDING_SINGLE_USE_PAYMENT;
    public static final ActivityProductClassifier APC_LIFTED_RESTRICTION_TRANSFER;
    public static final ActivityProductClassifier APC_LIGHTNING_DEPOSIT;
    public static final ActivityProductClassifier APC_LIGHTNING_WITHDRAWAL;
    public static final ActivityProductClassifier APC_LOYALTY;
    public static final ActivityProductClassifier APC_MARQETA;
    public static final ActivityProductClassifier APC_NON_BALANCE_IMPACTING_ITEM;
    public static final ActivityProductClassifier APC_OVERDRAFT;
    public static final ActivityProductClassifier APC_P2P;
    public static final ActivityProductClassifier APC_P2P_EXTERNALLY_FUNDED;
    public static final ActivityProductClassifier APC_P2P_OON;
    public static final ActivityProductClassifier APC_P2P_POOL;
    public static final ActivityProductClassifier APC_P2P_POOL_CLOSURE;
    public static final ActivityProductClassifier APC_P2P_POOL_CONTRIBUTION;
    public static final ActivityProductClassifier APC_P2P_POOL_GOAL_REACHED;
    public static final ActivityProductClassifier APC_P2P_POOL_INVITE;
    public static final ActivityProductClassifier APC_P2P_POOL_STATUS;
    public static final ActivityProductClassifier APC_P2P_PROSPECT;
    public static final ActivityProductClassifier APC_P2P_RECEIVE_AS_BITCOIN;
    public static final ActivityProductClassifier APC_PAPER_MONEY_DEPOSIT;
    public static final ActivityProductClassifier APC_PAYCHECK;
    public static final ActivityProductClassifier APC_PAYCHECK_DISTRIBUTION;
    public static final ActivityProductClassifier APC_RECURRING;
    public static final ActivityProductClassifier APC_REDEEMED_COUPON;
    public static final ActivityProductClassifier APC_REFERRAL;
    public static final ActivityProductClassifier APC_REFUND;
    public static final ActivityProductClassifier APC_REMITTANCE;
    public static final ActivityProductClassifier APC_ROUND_UP;
    public static final ActivityProductClassifier APC_RUNNING_BALANCE_LINK;
    public static final ActivityProductClassifier APC_SAVINGS;
    public static final ActivityProductClassifier APC_SHAZAM;
    public static final ActivityProductClassifier APC_SLOW_TRANSFER;
    public static final ActivityProductClassifier APC_SPONSORED_ACTIVITY;
    public static final ActivityProductClassifier APC_SPONSORSHIP;
    public static final ActivityProductClassifier APC_SPONSORSHIP_FEATURE_INVITATION;
    public static final ActivityProductClassifier APC_SPONSOR_PAYMENT_APPROVAL;
    public static final ActivityProductClassifier APC_SQUARE_BTC_SAVINGS;
    public static final ActivityProductClassifier APC_SQUARE_PAYROLL;
    public static final ActivityProductClassifier APC_SQUARE_PAYROLL_TIPS;
    public static final ActivityProductClassifier APC_STABLE;
    public static final ActivityProductClassifier APC_STABLE_DEPOSIT;
    public static final ActivityProductClassifier APC_STABLE_WITHDRAWAL;
    public static final ActivityProductClassifier APC_STOCK_BUY;
    public static final ActivityProductClassifier APC_STOCK_SELL;
    public static final ActivityProductClassifier APC_TAP_TO_PAY;
    public static final ActivityProductClassifier APC_TIDAL_CONTRIBUTION;
    public static final ActivityProductClassifier APC_VISA_DPS;
    public static final ActivityProductClassifier APC_WIRE_TRANSFER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/ActivityProductClassifier$Companion;", "", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityProductClassifier;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static ActivityProductClassifier fromValue(int i) {
            switch (i) {
                case 0:
                    return ActivityProductClassifier.APC_DEFAULT_DO_NOT_USE;
                case 1:
                    return ActivityProductClassifier.APC_CASH_CARD;
                case 2:
                    return ActivityProductClassifier.APC_ATM;
                case 3:
                    return ActivityProductClassifier.APC_CASH_IN;
                case 4:
                    return ActivityProductClassifier.APC_CASH_OUT;
                case 5:
                    return ActivityProductClassifier.APC_EXTERNAL_TRANSFER;
                case 6:
                    return ActivityProductClassifier.APC_P2P;
                case 7:
                    return ActivityProductClassifier.APC_ALLOWANCE;
                case 8:
                    return ActivityProductClassifier.APC_SAVINGS;
                case 9:
                    return ActivityProductClassifier.APC_CASH_APP_PAY;
                case 10:
                    return ActivityProductClassifier.APC_CASH_CARD_CASHBACK;
                case 11:
                    return ActivityProductClassifier.APC_WIRE_TRANSFER;
                case 12:
                    return ActivityProductClassifier.APC_ACH_TRANSFER;
                case 13:
                    return ActivityProductClassifier.APC_ACH_TRANSFER_RETURN;
                case 14:
                    return ActivityProductClassifier.APC_BTC_BOOST;
                case 15:
                    return ActivityProductClassifier.APC_BTC;
                case 16:
                    return ActivityProductClassifier.APC_BUSINESS_CARD;
                case 17:
                    return ActivityProductClassifier.APC_ISSUER_PROCESSING;
                case 18:
                    return ActivityProductClassifier.APC_FEE;
                case 19:
                    return ActivityProductClassifier.APC_CHECK_DEPOSIT;
                case 20:
                    return ActivityProductClassifier.APC_MARQETA;
                case 21:
                    return ActivityProductClassifier.APC_SHAZAM;
                case 22:
                    return ActivityProductClassifier.APC_CASH_CARD_RETURN;
                case 23:
                    return ActivityProductClassifier.APC_CASH_CARD_QUASI_CASH;
                case 24:
                    return ActivityProductClassifier.APC_FIAT;
                case 25:
                    return ActivityProductClassifier.APC_INTERNAL_TRANSFER;
                case 26:
                    return ActivityProductClassifier.APC_AFTERPAY_SUMMARY;
                case 27:
                    return ActivityProductClassifier.APC_NON_BALANCE_IMPACTING_ITEM;
                case 28:
                    return ActivityProductClassifier.APC_DEVICE_LOGIN;
                case 29:
                    return ActivityProductClassifier.APC_GIFT_CARD;
                case 30:
                    return ActivityProductClassifier.APC_STOCK_BUY;
                case 31:
                    return ActivityProductClassifier.APC_RECURRING;
                case 32:
                    return ActivityProductClassifier.APC_REFERRAL;
                case 33:
                    return ActivityProductClassifier.APC_PAYCHECK;
                case 34:
                    return ActivityProductClassifier.APC_OVERDRAFT;
                case 35:
                    return ActivityProductClassifier.APC_PAYCHECK_DISTRIBUTION;
                case 36:
                    return ActivityProductClassifier.APC_BORROW;
                case 37:
                    return ActivityProductClassifier.APC_BILL_PAYMENT;
                case 38:
                    return ActivityProductClassifier.APC_REMITTANCE;
                case 39:
                    return ActivityProductClassifier.APC_BTC_BUY;
                case 40:
                    return ActivityProductClassifier.APC_BTC_SELL;
                case 41:
                    return ActivityProductClassifier.APC_COUPON;
                case 42:
                    return ActivityProductClassifier.APC_PAPER_MONEY_DEPOSIT;
                case 43:
                    return ActivityProductClassifier.APC_TAP_TO_PAY;
                case 44:
                    return ActivityProductClassifier.APC_BTC_LIGHTNING_NETWORK;
                case 45:
                    return ActivityProductClassifier.APC_INSTANT_PAY;
                case 46:
                    return ActivityProductClassifier.APC_AUTOMATED;
                case 47:
                    return ActivityProductClassifier.APC_ROUND_UP;
                case 48:
                    return ActivityProductClassifier.APC_LOYALTY;
                case 49:
                    return ActivityProductClassifier.APC_INTEREST_PAYOUT;
                case 50:
                    return ActivityProductClassifier.APC_INVEST;
                case 51:
                    return ActivityProductClassifier.APC_CRYPTO_EXCHANGE;
                case 52:
                    return ActivityProductClassifier.APC_SPONSORSHIP;
                case 53:
                    return ActivityProductClassifier.APC_SPONSORED_ACTIVITY;
                case 54:
                    return ActivityProductClassifier.APC_SPONSORSHIP_FEATURE_INVITATION;
                case 55:
                    return ActivityProductClassifier.APC_LIGHTNING_DEPOSIT;
                case 56:
                    return ActivityProductClassifier.APC_LIGHTNING_WITHDRAWAL;
                case 57:
                case 58:
                default:
                    return null;
                case 59:
                    return ActivityProductClassifier.APC_BUSINESS_ACCOUNT_ONBOARDING;
                case 60:
                    return ActivityProductClassifier.APC_BIDV_IN_REVIEW;
                case 61:
                    return ActivityProductClassifier.APC_BIDV_FAILED;
                case 62:
                    return ActivityProductClassifier.APC_BIDV_PASSED;
                case 63:
                    return ActivityProductClassifier.APC_KYB_COMPLETED;
                case 64:
                    return ActivityProductClassifier.APC_INVEST_CORPORATE_ACTION;
                case 65:
                    return ActivityProductClassifier.APC_INVEST_DIVIDEND;
                case 66:
                    return ActivityProductClassifier.APC_INVEST_ORDER;
                case 67:
                    return ActivityProductClassifier.APC_INVEST_CORRECTION;
                case 68:
                    return ActivityProductClassifier.APC_STOCK_SELL;
                case 69:
                    return ActivityProductClassifier.APC_SLOW_TRANSFER;
                case 70:
                    return ActivityProductClassifier.APC_INSTANT_TRANSFER;
                case 71:
                    return ActivityProductClassifier.APC_DEBIT_TRANSFER;
                case 72:
                    return ActivityProductClassifier.APC_ESTIMATED_INTEREST_PAYOUT;
                case 73:
                    return ActivityProductClassifier.APC_EXPIRED_COUPON;
                case 74:
                    return ActivityProductClassifier.APC_REDEEMED_COUPON;
                case 75:
                    return ActivityProductClassifier.APC_REFUND;
                case 76:
                    return ActivityProductClassifier.APC_CASH_APP_PAY_DEPOSIT;
                case 77:
                    return ActivityProductClassifier.APC_LENDING;
                case 78:
                    return ActivityProductClassifier.APC_LENDING_SINGLE_USE_PAYMENT;
                case 79:
                    return ActivityProductClassifier.APC_LENDING_RETROACTIVE_FINANCING;
                case 80:
                    return ActivityProductClassifier.APC_LENDING_PRE_PURCHASE_FINANCING;
                case 81:
                    return ActivityProductClassifier.APC_CRYPTO_TRADING_SETTLEMENT;
                case 82:
                    return ActivityProductClassifier.APC_GENERIC_BTC_TRANSACTION;
                case 83:
                    return ActivityProductClassifier.APC_CASH_APP_PAY_PAYMENT;
                case 84:
                    return ActivityProductClassifier.APC_CASH_APP_PAY_REFUND;
                case 85:
                    return ActivityProductClassifier.APC_CASH_CARD_ACCOUNT_FUNDING_TRANSACTION;
                case 86:
                    return ActivityProductClassifier.APC_CASH_CARD_ORIGINAL_CREDIT_TRANSACTION;
                case 87:
                    return ActivityProductClassifier.APC_CASH_APP_ORDER;
                case 88:
                    return ActivityProductClassifier.APC_CASH_APP_PAY_NOW;
                case 89:
                    return ActivityProductClassifier.APC_CASH_APP_PAY_LATER;
                case 90:
                    return ActivityProductClassifier.APC_CASH_APP_LOCAL;
                case 91:
                    return ActivityProductClassifier.APC_CASH_APP_LOCAL_CASHBACK;
                case 92:
                    return ActivityProductClassifier.APC_CASH_APP_LOCAL_ORDER;
                case 93:
                    return ActivityProductClassifier.APC_SQUARE_BTC_SAVINGS;
                case 94:
                    return ActivityProductClassifier.APC_BITKEY_TRANSFER;
                case 95:
                    return ActivityProductClassifier.APC_DEPOSIT_REVERSAL;
                case 96:
                    return ActivityProductClassifier.APC_LENDING_RETROACTIVE_FINANCING_ELIGIBLE;
                case 97:
                    return ActivityProductClassifier.APC_SPONSOR_PAYMENT_APPROVAL;
                case 98:
                    return ActivityProductClassifier.APC_STABLE;
                case 99:
                    return ActivityProductClassifier.APC_STABLE_WITHDRAWAL;
                case 100:
                    return ActivityProductClassifier.APC_STABLE_DEPOSIT;
                case 101:
                    return ActivityProductClassifier.APC_P2P_POOL;
                case 102:
                    return ActivityProductClassifier.APC_P2P_POOL_INVITE;
                case 103:
                    return ActivityProductClassifier.APC_P2P_POOL_CONTRIBUTION;
                case 104:
                    return ActivityProductClassifier.APC_P2P_POOL_GOAL_REACHED;
                case 105:
                    return ActivityProductClassifier.APC_P2P_POOL_CLOSURE;
                case 106:
                    return ActivityProductClassifier.APC_P2P_OON;
                case 107:
                    return ActivityProductClassifier.APC_P2P_POOL_STATUS;
                case 108:
                    return ActivityProductClassifier.APC_SQUARE_PAYROLL;
                case 109:
                    return ActivityProductClassifier.APC_SQUARE_PAYROLL_TIPS;
                case 110:
                    return ActivityProductClassifier.APC_TIDAL_CONTRIBUTION;
                case 111:
                    return ActivityProductClassifier.APC_C4B_LISTING_PAYMENT;
                case 112:
                    return ActivityProductClassifier.APC_P2P_EXTERNALLY_FUNDED;
                case 113:
                    return ActivityProductClassifier.APC_BALANCE_IMPACT_CASH;
                case 114:
                    return ActivityProductClassifier.APC_BALANCE_IMPACT_SAVINGS;
                case 115:
                    return ActivityProductClassifier.APC_GIVEAWAY;
                case 116:
                    return ActivityProductClassifier.APC_CUSTOMER_ADJUSTMENT_CLAWBACK;
                case 117:
                    return ActivityProductClassifier.APC_CUSTOMER_ADJUSTMENT_REIMBURSEMENT;
                case 118:
                    return ActivityProductClassifier.APC_CUSTOMER_ADJUSTMENT;
                case 119:
                    return ActivityProductClassifier.APC_CASH_APP_PAYOUT;
                case 120:
                    return ActivityProductClassifier.APC_VISA_DPS;
                case 121:
                    return ActivityProductClassifier.APC_LIFTED_RESTRICTION_TRANSFER;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                    return ActivityProductClassifier.APC_RUNNING_BALANCE_LINK;
                case SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE:
                    return ActivityProductClassifier.APC_P2P_PROSPECT;
                case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                    return ActivityProductClassifier.APC_P2P_RECEIVE_AS_BITCOIN;
                case 125:
                    return ActivityProductClassifier.APC_BTC_AUTO_WITHDRAWAL;
            }
        }
    }

    static {
        ActivityProductClassifier activityProductClassifier = new ActivityProductClassifier("APC_DEFAULT_DO_NOT_USE", 0, 0);
        APC_DEFAULT_DO_NOT_USE = activityProductClassifier;
        ActivityProductClassifier activityProductClassifier2 = new ActivityProductClassifier("APC_ACH_TRANSFER", 1, 12);
        APC_ACH_TRANSFER = activityProductClassifier2;
        ActivityProductClassifier activityProductClassifier3 = new ActivityProductClassifier("APC_ACH_TRANSFER_RETURN", 2, 13);
        APC_ACH_TRANSFER_RETURN = activityProductClassifier3;
        ActivityProductClassifier activityProductClassifier4 = new ActivityProductClassifier("APC_AFTERPAY_SUMMARY", 3, 26);
        APC_AFTERPAY_SUMMARY = activityProductClassifier4;
        ActivityProductClassifier activityProductClassifier5 = new ActivityProductClassifier("APC_ALLOWANCE", 4, 7);
        APC_ALLOWANCE = activityProductClassifier5;
        ActivityProductClassifier activityProductClassifier6 = new ActivityProductClassifier("APC_ATM", 5, 2);
        APC_ATM = activityProductClassifier6;
        ActivityProductClassifier activityProductClassifier7 = new ActivityProductClassifier("APC_AUTOMATED", 6, 46);
        APC_AUTOMATED = activityProductClassifier7;
        ActivityProductClassifier activityProductClassifier8 = new ActivityProductClassifier("APC_BALANCE_IMPACT_CASH", 7, 113);
        APC_BALANCE_IMPACT_CASH = activityProductClassifier8;
        ActivityProductClassifier activityProductClassifier9 = new ActivityProductClassifier("APC_BALANCE_IMPACT_SAVINGS", 8, 114);
        APC_BALANCE_IMPACT_SAVINGS = activityProductClassifier9;
        ActivityProductClassifier activityProductClassifier10 = new ActivityProductClassifier("APC_BIDV_FAILED", 9, 61);
        APC_BIDV_FAILED = activityProductClassifier10;
        ActivityProductClassifier activityProductClassifier11 = new ActivityProductClassifier("APC_BIDV_IN_REVIEW", 10, 60);
        APC_BIDV_IN_REVIEW = activityProductClassifier11;
        ActivityProductClassifier activityProductClassifier12 = new ActivityProductClassifier("APC_BIDV_PASSED", 11, 62);
        APC_BIDV_PASSED = activityProductClassifier12;
        ActivityProductClassifier activityProductClassifier13 = new ActivityProductClassifier("APC_BILL_PAYMENT", 12, 37);
        APC_BILL_PAYMENT = activityProductClassifier13;
        ActivityProductClassifier activityProductClassifier14 = new ActivityProductClassifier("APC_BITKEY_TRANSFER", 13, 94);
        APC_BITKEY_TRANSFER = activityProductClassifier14;
        ActivityProductClassifier activityProductClassifier15 = new ActivityProductClassifier("APC_BORROW", 14, 36);
        APC_BORROW = activityProductClassifier15;
        ActivityProductClassifier activityProductClassifier16 = new ActivityProductClassifier("APC_BTC", 15, 15);
        APC_BTC = activityProductClassifier16;
        ActivityProductClassifier activityProductClassifier17 = new ActivityProductClassifier("APC_BTC_AUTO_WITHDRAWAL", 16, 125);
        APC_BTC_AUTO_WITHDRAWAL = activityProductClassifier17;
        ActivityProductClassifier activityProductClassifier18 = new ActivityProductClassifier("APC_BTC_BOOST", 17, 14);
        APC_BTC_BOOST = activityProductClassifier18;
        ActivityProductClassifier activityProductClassifier19 = new ActivityProductClassifier("APC_BTC_BUY", 18, 39);
        APC_BTC_BUY = activityProductClassifier19;
        ActivityProductClassifier activityProductClassifier20 = new ActivityProductClassifier("APC_BTC_LIGHTNING_NETWORK", 19, 44);
        APC_BTC_LIGHTNING_NETWORK = activityProductClassifier20;
        ActivityProductClassifier activityProductClassifier21 = new ActivityProductClassifier("APC_BTC_SELL", 20, 40);
        APC_BTC_SELL = activityProductClassifier21;
        ActivityProductClassifier activityProductClassifier22 = new ActivityProductClassifier("APC_BUSINESS_ACCOUNT_ONBOARDING", 21, 59);
        APC_BUSINESS_ACCOUNT_ONBOARDING = activityProductClassifier22;
        ActivityProductClassifier activityProductClassifier23 = new ActivityProductClassifier("APC_BUSINESS_CARD", 22, 16);
        APC_BUSINESS_CARD = activityProductClassifier23;
        ActivityProductClassifier activityProductClassifier24 = new ActivityProductClassifier("APC_C4B_LISTING_PAYMENT", 23, 111);
        APC_C4B_LISTING_PAYMENT = activityProductClassifier24;
        ActivityProductClassifier activityProductClassifier25 = new ActivityProductClassifier("APC_CASH_APP_LOCAL", 24, 90);
        APC_CASH_APP_LOCAL = activityProductClassifier25;
        ActivityProductClassifier activityProductClassifier26 = new ActivityProductClassifier("APC_CASH_APP_LOCAL_CASHBACK", 25, 91);
        APC_CASH_APP_LOCAL_CASHBACK = activityProductClassifier26;
        ActivityProductClassifier activityProductClassifier27 = new ActivityProductClassifier("APC_CASH_APP_LOCAL_ORDER", 26, 92);
        APC_CASH_APP_LOCAL_ORDER = activityProductClassifier27;
        ActivityProductClassifier activityProductClassifier28 = new ActivityProductClassifier("APC_CASH_APP_ORDER", 27, 87);
        APC_CASH_APP_ORDER = activityProductClassifier28;
        ActivityProductClassifier activityProductClassifier29 = new ActivityProductClassifier("APC_CASH_APP_PAY", 28, 9);
        APC_CASH_APP_PAY = activityProductClassifier29;
        ActivityProductClassifier activityProductClassifier30 = new ActivityProductClassifier("APC_CASH_APP_PAY_DEPOSIT", 29, 76);
        APC_CASH_APP_PAY_DEPOSIT = activityProductClassifier30;
        ActivityProductClassifier activityProductClassifier31 = new ActivityProductClassifier("APC_CASH_APP_PAY_LATER", 30, 89);
        APC_CASH_APP_PAY_LATER = activityProductClassifier31;
        ActivityProductClassifier activityProductClassifier32 = new ActivityProductClassifier("APC_CASH_APP_PAY_NOW", 31, 88);
        APC_CASH_APP_PAY_NOW = activityProductClassifier32;
        ActivityProductClassifier activityProductClassifier33 = new ActivityProductClassifier("APC_CASH_APP_PAY_PAYMENT", 32, 83);
        APC_CASH_APP_PAY_PAYMENT = activityProductClassifier33;
        ActivityProductClassifier activityProductClassifier34 = new ActivityProductClassifier("APC_CASH_APP_PAY_REFUND", 33, 84);
        APC_CASH_APP_PAY_REFUND = activityProductClassifier34;
        ActivityProductClassifier activityProductClassifier35 = new ActivityProductClassifier("APC_CASH_APP_PAYOUT", 34, 119);
        APC_CASH_APP_PAYOUT = activityProductClassifier35;
        ActivityProductClassifier activityProductClassifier36 = new ActivityProductClassifier("APC_CASH_CARD", 35, 1);
        APC_CASH_CARD = activityProductClassifier36;
        ActivityProductClassifier activityProductClassifier37 = new ActivityProductClassifier("APC_CASH_CARD_ACCOUNT_FUNDING_TRANSACTION", 36, 85);
        APC_CASH_CARD_ACCOUNT_FUNDING_TRANSACTION = activityProductClassifier37;
        ActivityProductClassifier activityProductClassifier38 = new ActivityProductClassifier("APC_CASH_CARD_CASHBACK", 37, 10);
        APC_CASH_CARD_CASHBACK = activityProductClassifier38;
        ActivityProductClassifier activityProductClassifier39 = new ActivityProductClassifier("APC_CASH_CARD_ORIGINAL_CREDIT_TRANSACTION", 38, 86);
        APC_CASH_CARD_ORIGINAL_CREDIT_TRANSACTION = activityProductClassifier39;
        ActivityProductClassifier activityProductClassifier40 = new ActivityProductClassifier("APC_CASH_CARD_QUASI_CASH", 39, 23);
        APC_CASH_CARD_QUASI_CASH = activityProductClassifier40;
        ActivityProductClassifier activityProductClassifier41 = new ActivityProductClassifier("APC_CASH_CARD_RETURN", 40, 22);
        APC_CASH_CARD_RETURN = activityProductClassifier41;
        ActivityProductClassifier activityProductClassifier42 = new ActivityProductClassifier("APC_CASH_IN", 41, 3);
        APC_CASH_IN = activityProductClassifier42;
        ActivityProductClassifier activityProductClassifier43 = new ActivityProductClassifier("APC_CASH_OUT", 42, 4);
        APC_CASH_OUT = activityProductClassifier43;
        ActivityProductClassifier activityProductClassifier44 = new ActivityProductClassifier("APC_CHECK_DEPOSIT", 43, 19);
        APC_CHECK_DEPOSIT = activityProductClassifier44;
        ActivityProductClassifier activityProductClassifier45 = new ActivityProductClassifier("APC_COUPON", 44, 41);
        APC_COUPON = activityProductClassifier45;
        ActivityProductClassifier activityProductClassifier46 = new ActivityProductClassifier("APC_CRYPTO_EXCHANGE", 45, 51);
        APC_CRYPTO_EXCHANGE = activityProductClassifier46;
        ActivityProductClassifier activityProductClassifier47 = new ActivityProductClassifier("APC_CRYPTO_TRADING_SETTLEMENT", 46, 81);
        APC_CRYPTO_TRADING_SETTLEMENT = activityProductClassifier47;
        ActivityProductClassifier activityProductClassifier48 = new ActivityProductClassifier("APC_CUSTOMER_ADJUSTMENT", 47, 118);
        APC_CUSTOMER_ADJUSTMENT = activityProductClassifier48;
        ActivityProductClassifier activityProductClassifier49 = new ActivityProductClassifier("APC_CUSTOMER_ADJUSTMENT_CLAWBACK", 48, 116);
        APC_CUSTOMER_ADJUSTMENT_CLAWBACK = activityProductClassifier49;
        ActivityProductClassifier activityProductClassifier50 = new ActivityProductClassifier("APC_CUSTOMER_ADJUSTMENT_REIMBURSEMENT", 49, 117);
        APC_CUSTOMER_ADJUSTMENT_REIMBURSEMENT = activityProductClassifier50;
        ActivityProductClassifier activityProductClassifier51 = new ActivityProductClassifier("APC_DEBIT_TRANSFER", 50, 71);
        APC_DEBIT_TRANSFER = activityProductClassifier51;
        ActivityProductClassifier activityProductClassifier52 = new ActivityProductClassifier("APC_DEPOSIT_REVERSAL", 51, 95);
        APC_DEPOSIT_REVERSAL = activityProductClassifier52;
        ActivityProductClassifier activityProductClassifier53 = new ActivityProductClassifier("APC_DEVICE_LOGIN", 52, 28);
        APC_DEVICE_LOGIN = activityProductClassifier53;
        ActivityProductClassifier activityProductClassifier54 = new ActivityProductClassifier("APC_ESTIMATED_INTEREST_PAYOUT", 53, 72);
        APC_ESTIMATED_INTEREST_PAYOUT = activityProductClassifier54;
        ActivityProductClassifier activityProductClassifier55 = new ActivityProductClassifier("APC_EXPIRED_COUPON", 54, 73);
        APC_EXPIRED_COUPON = activityProductClassifier55;
        ActivityProductClassifier activityProductClassifier56 = new ActivityProductClassifier("APC_EXTERNAL_TRANSFER", 55, 5);
        APC_EXTERNAL_TRANSFER = activityProductClassifier56;
        ActivityProductClassifier activityProductClassifier57 = new ActivityProductClassifier("APC_FEE", 56, 18);
        APC_FEE = activityProductClassifier57;
        ActivityProductClassifier activityProductClassifier58 = new ActivityProductClassifier("APC_FIAT", 57, 24);
        APC_FIAT = activityProductClassifier58;
        ActivityProductClassifier activityProductClassifier59 = new ActivityProductClassifier("APC_GENERIC_BTC_TRANSACTION", 58, 82);
        APC_GENERIC_BTC_TRANSACTION = activityProductClassifier59;
        ActivityProductClassifier activityProductClassifier60 = new ActivityProductClassifier("APC_GIFT_CARD", 59, 29);
        APC_GIFT_CARD = activityProductClassifier60;
        ActivityProductClassifier activityProductClassifier61 = new ActivityProductClassifier("APC_GIVEAWAY", 60, 115);
        APC_GIVEAWAY = activityProductClassifier61;
        ActivityProductClassifier activityProductClassifier62 = new ActivityProductClassifier("APC_INSTANT_PAY", 61, 45);
        APC_INSTANT_PAY = activityProductClassifier62;
        ActivityProductClassifier activityProductClassifier63 = new ActivityProductClassifier("APC_INSTANT_TRANSFER", 62, 70);
        APC_INSTANT_TRANSFER = activityProductClassifier63;
        ActivityProductClassifier activityProductClassifier64 = new ActivityProductClassifier("APC_INTEREST_PAYOUT", 63, 49);
        APC_INTEREST_PAYOUT = activityProductClassifier64;
        ActivityProductClassifier activityProductClassifier65 = new ActivityProductClassifier("APC_INTERNAL_TRANSFER", 64, 25);
        APC_INTERNAL_TRANSFER = activityProductClassifier65;
        ActivityProductClassifier activityProductClassifier66 = new ActivityProductClassifier("APC_INVEST", 65, 50);
        APC_INVEST = activityProductClassifier66;
        ActivityProductClassifier activityProductClassifier67 = new ActivityProductClassifier("APC_INVEST_CORPORATE_ACTION", 66, 64);
        APC_INVEST_CORPORATE_ACTION = activityProductClassifier67;
        ActivityProductClassifier activityProductClassifier68 = new ActivityProductClassifier("APC_INVEST_CORRECTION", 67, 67);
        APC_INVEST_CORRECTION = activityProductClassifier68;
        ActivityProductClassifier activityProductClassifier69 = new ActivityProductClassifier("APC_INVEST_DIVIDEND", 68, 65);
        APC_INVEST_DIVIDEND = activityProductClassifier69;
        ActivityProductClassifier activityProductClassifier70 = new ActivityProductClassifier("APC_INVEST_ORDER", 69, 66);
        APC_INVEST_ORDER = activityProductClassifier70;
        ActivityProductClassifier activityProductClassifier71 = new ActivityProductClassifier("APC_ISSUER_PROCESSING", 70, 17);
        APC_ISSUER_PROCESSING = activityProductClassifier71;
        ActivityProductClassifier activityProductClassifier72 = new ActivityProductClassifier("APC_KYB_COMPLETED", 71, 63);
        APC_KYB_COMPLETED = activityProductClassifier72;
        ActivityProductClassifier activityProductClassifier73 = new ActivityProductClassifier("APC_LENDING", 72, 77);
        APC_LENDING = activityProductClassifier73;
        ActivityProductClassifier activityProductClassifier74 = new ActivityProductClassifier("APC_LENDING_PRE_PURCHASE_FINANCING", 73, 80);
        APC_LENDING_PRE_PURCHASE_FINANCING = activityProductClassifier74;
        ActivityProductClassifier activityProductClassifier75 = new ActivityProductClassifier("APC_LENDING_RETROACTIVE_FINANCING", 74, 79);
        APC_LENDING_RETROACTIVE_FINANCING = activityProductClassifier75;
        ActivityProductClassifier activityProductClassifier76 = new ActivityProductClassifier("APC_LENDING_RETROACTIVE_FINANCING_ELIGIBLE", 75, 96);
        APC_LENDING_RETROACTIVE_FINANCING_ELIGIBLE = activityProductClassifier76;
        ActivityProductClassifier activityProductClassifier77 = new ActivityProductClassifier("APC_LENDING_SINGLE_USE_PAYMENT", 76, 78);
        APC_LENDING_SINGLE_USE_PAYMENT = activityProductClassifier77;
        ActivityProductClassifier activityProductClassifier78 = new ActivityProductClassifier("APC_LIFTED_RESTRICTION_TRANSFER", 77, 121);
        APC_LIFTED_RESTRICTION_TRANSFER = activityProductClassifier78;
        ActivityProductClassifier activityProductClassifier79 = new ActivityProductClassifier("APC_LIGHTNING_DEPOSIT", 78, 55);
        APC_LIGHTNING_DEPOSIT = activityProductClassifier79;
        ActivityProductClassifier activityProductClassifier80 = new ActivityProductClassifier("APC_LIGHTNING_WITHDRAWAL", 79, 56);
        APC_LIGHTNING_WITHDRAWAL = activityProductClassifier80;
        ActivityProductClassifier activityProductClassifier81 = new ActivityProductClassifier("APC_LOYALTY", 80, 48);
        APC_LOYALTY = activityProductClassifier81;
        ActivityProductClassifier activityProductClassifier82 = new ActivityProductClassifier("APC_MARQETA", 81, 20);
        APC_MARQETA = activityProductClassifier82;
        ActivityProductClassifier activityProductClassifier83 = new ActivityProductClassifier("APC_NON_BALANCE_IMPACTING_ITEM", 82, 27);
        APC_NON_BALANCE_IMPACTING_ITEM = activityProductClassifier83;
        ActivityProductClassifier activityProductClassifier84 = new ActivityProductClassifier("APC_OVERDRAFT", 83, 34);
        APC_OVERDRAFT = activityProductClassifier84;
        ActivityProductClassifier activityProductClassifier85 = new ActivityProductClassifier("APC_P2P", 84, 6);
        APC_P2P = activityProductClassifier85;
        ActivityProductClassifier activityProductClassifier86 = new ActivityProductClassifier("APC_P2P_EXTERNALLY_FUNDED", 85, 112);
        APC_P2P_EXTERNALLY_FUNDED = activityProductClassifier86;
        ActivityProductClassifier activityProductClassifier87 = new ActivityProductClassifier("APC_P2P_OON", 86, 106);
        APC_P2P_OON = activityProductClassifier87;
        ActivityProductClassifier activityProductClassifier88 = new ActivityProductClassifier("APC_P2P_PROSPECT", 87, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        APC_P2P_PROSPECT = activityProductClassifier88;
        ActivityProductClassifier activityProductClassifier89 = new ActivityProductClassifier("APC_P2P_RECEIVE_AS_BITCOIN", 88, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
        APC_P2P_RECEIVE_AS_BITCOIN = activityProductClassifier89;
        ActivityProductClassifier activityProductClassifier90 = new ActivityProductClassifier("APC_P2P_POOL", 89, 101);
        APC_P2P_POOL = activityProductClassifier90;
        ActivityProductClassifier activityProductClassifier91 = new ActivityProductClassifier("APC_P2P_POOL_CLOSURE", 90, 105);
        APC_P2P_POOL_CLOSURE = activityProductClassifier91;
        ActivityProductClassifier activityProductClassifier92 = new ActivityProductClassifier("APC_P2P_POOL_CONTRIBUTION", 91, 103);
        APC_P2P_POOL_CONTRIBUTION = activityProductClassifier92;
        ActivityProductClassifier activityProductClassifier93 = new ActivityProductClassifier("APC_P2P_POOL_GOAL_REACHED", 92, 104);
        APC_P2P_POOL_GOAL_REACHED = activityProductClassifier93;
        ActivityProductClassifier activityProductClassifier94 = new ActivityProductClassifier("APC_P2P_POOL_INVITE", 93, 102);
        APC_P2P_POOL_INVITE = activityProductClassifier94;
        ActivityProductClassifier activityProductClassifier95 = new ActivityProductClassifier("APC_P2P_POOL_STATUS", 94, 107);
        APC_P2P_POOL_STATUS = activityProductClassifier95;
        ActivityProductClassifier activityProductClassifier96 = new ActivityProductClassifier("APC_PAPER_MONEY_DEPOSIT", 95, 42);
        APC_PAPER_MONEY_DEPOSIT = activityProductClassifier96;
        ActivityProductClassifier activityProductClassifier97 = new ActivityProductClassifier("APC_PAYCHECK", 96, 33);
        APC_PAYCHECK = activityProductClassifier97;
        ActivityProductClassifier activityProductClassifier98 = new ActivityProductClassifier("APC_PAYCHECK_DISTRIBUTION", 97, 35);
        APC_PAYCHECK_DISTRIBUTION = activityProductClassifier98;
        ActivityProductClassifier activityProductClassifier99 = new ActivityProductClassifier("APC_RECURRING", 98, 31);
        APC_RECURRING = activityProductClassifier99;
        ActivityProductClassifier activityProductClassifier100 = new ActivityProductClassifier("APC_REDEEMED_COUPON", 99, 74);
        APC_REDEEMED_COUPON = activityProductClassifier100;
        ActivityProductClassifier activityProductClassifier101 = new ActivityProductClassifier("APC_REFERRAL", 100, 32);
        APC_REFERRAL = activityProductClassifier101;
        ActivityProductClassifier activityProductClassifier102 = new ActivityProductClassifier("APC_REFUND", 101, 75);
        APC_REFUND = activityProductClassifier102;
        ActivityProductClassifier activityProductClassifier103 = new ActivityProductClassifier("APC_REMITTANCE", 102, 38);
        APC_REMITTANCE = activityProductClassifier103;
        ActivityProductClassifier activityProductClassifier104 = new ActivityProductClassifier("APC_ROUND_UP", 103, 47);
        APC_ROUND_UP = activityProductClassifier104;
        ActivityProductClassifier activityProductClassifier105 = new ActivityProductClassifier("APC_RUNNING_BALANCE_LINK", 104, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
        APC_RUNNING_BALANCE_LINK = activityProductClassifier105;
        ActivityProductClassifier activityProductClassifier106 = new ActivityProductClassifier("APC_SAVINGS", 105, 8);
        APC_SAVINGS = activityProductClassifier106;
        ActivityProductClassifier activityProductClassifier107 = new ActivityProductClassifier("APC_SHAZAM", 106, 21);
        APC_SHAZAM = activityProductClassifier107;
        ActivityProductClassifier activityProductClassifier108 = new ActivityProductClassifier("APC_SLOW_TRANSFER", 107, 69);
        APC_SLOW_TRANSFER = activityProductClassifier108;
        ActivityProductClassifier activityProductClassifier109 = new ActivityProductClassifier("APC_SPONSORED_ACTIVITY", 108, 53);
        APC_SPONSORED_ACTIVITY = activityProductClassifier109;
        ActivityProductClassifier activityProductClassifier110 = new ActivityProductClassifier("APC_SPONSORSHIP", 109, 52);
        APC_SPONSORSHIP = activityProductClassifier110;
        ActivityProductClassifier activityProductClassifier111 = new ActivityProductClassifier("APC_SPONSORSHIP_FEATURE_INVITATION", 110, 54);
        APC_SPONSORSHIP_FEATURE_INVITATION = activityProductClassifier111;
        ActivityProductClassifier activityProductClassifier112 = new ActivityProductClassifier("APC_SPONSOR_PAYMENT_APPROVAL", 111, 97);
        APC_SPONSOR_PAYMENT_APPROVAL = activityProductClassifier112;
        ActivityProductClassifier activityProductClassifier113 = new ActivityProductClassifier("APC_SQUARE_BTC_SAVINGS", 112, 93);
        APC_SQUARE_BTC_SAVINGS = activityProductClassifier113;
        ActivityProductClassifier activityProductClassifier114 = new ActivityProductClassifier("APC_SQUARE_PAYROLL", 113, 108);
        APC_SQUARE_PAYROLL = activityProductClassifier114;
        ActivityProductClassifier activityProductClassifier115 = new ActivityProductClassifier("APC_SQUARE_PAYROLL_TIPS", 114, 109);
        APC_SQUARE_PAYROLL_TIPS = activityProductClassifier115;
        ActivityProductClassifier activityProductClassifier116 = new ActivityProductClassifier("APC_STABLE", 115, 98);
        APC_STABLE = activityProductClassifier116;
        ActivityProductClassifier activityProductClassifier117 = new ActivityProductClassifier("APC_STABLE_DEPOSIT", 116, 100);
        APC_STABLE_DEPOSIT = activityProductClassifier117;
        ActivityProductClassifier activityProductClassifier118 = new ActivityProductClassifier("APC_STABLE_WITHDRAWAL", 117, 99);
        APC_STABLE_WITHDRAWAL = activityProductClassifier118;
        ActivityProductClassifier activityProductClassifier119 = new ActivityProductClassifier("APC_STOCK_BUY", 118, 30);
        APC_STOCK_BUY = activityProductClassifier119;
        ActivityProductClassifier activityProductClassifier120 = new ActivityProductClassifier("APC_STOCK_SELL", 119, 68);
        APC_STOCK_SELL = activityProductClassifier120;
        ActivityProductClassifier activityProductClassifier121 = new ActivityProductClassifier("APC_TAP_TO_PAY", 120, 43);
        APC_TAP_TO_PAY = activityProductClassifier121;
        ActivityProductClassifier activityProductClassifier122 = new ActivityProductClassifier("APC_TIDAL_CONTRIBUTION", 121, 110);
        APC_TIDAL_CONTRIBUTION = activityProductClassifier122;
        ActivityProductClassifier activityProductClassifier123 = new ActivityProductClassifier("APC_VISA_DPS", EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 120);
        APC_VISA_DPS = activityProductClassifier123;
        ActivityProductClassifier activityProductClassifier124 = new ActivityProductClassifier("APC_WIRE_TRANSFER", EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 11);
        APC_WIRE_TRANSFER = activityProductClassifier124;
        ActivityProductClassifier[] activityProductClassifierArr = {activityProductClassifier, activityProductClassifier2, activityProductClassifier3, activityProductClassifier4, activityProductClassifier5, activityProductClassifier6, activityProductClassifier7, activityProductClassifier8, activityProductClassifier9, activityProductClassifier10, activityProductClassifier11, activityProductClassifier12, activityProductClassifier13, activityProductClassifier14, activityProductClassifier15, activityProductClassifier16, activityProductClassifier17, activityProductClassifier18, activityProductClassifier19, activityProductClassifier20, activityProductClassifier21, activityProductClassifier22, activityProductClassifier23, activityProductClassifier24, activityProductClassifier25, activityProductClassifier26, activityProductClassifier27, activityProductClassifier28, activityProductClassifier29, activityProductClassifier30, activityProductClassifier31, activityProductClassifier32, activityProductClassifier33, activityProductClassifier34, activityProductClassifier35, activityProductClassifier36, activityProductClassifier37, activityProductClassifier38, activityProductClassifier39, activityProductClassifier40, activityProductClassifier41, activityProductClassifier42, activityProductClassifier43, activityProductClassifier44, activityProductClassifier45, activityProductClassifier46, activityProductClassifier47, activityProductClassifier48, activityProductClassifier49, activityProductClassifier50, activityProductClassifier51, activityProductClassifier52, activityProductClassifier53, activityProductClassifier54, activityProductClassifier55, activityProductClassifier56, activityProductClassifier57, activityProductClassifier58, activityProductClassifier59, activityProductClassifier60, activityProductClassifier61, activityProductClassifier62, activityProductClassifier63, activityProductClassifier64, activityProductClassifier65, activityProductClassifier66, activityProductClassifier67, activityProductClassifier68, activityProductClassifier69, activityProductClassifier70, activityProductClassifier71, activityProductClassifier72, activityProductClassifier73, activityProductClassifier74, activityProductClassifier75, activityProductClassifier76, activityProductClassifier77, activityProductClassifier78, activityProductClassifier79, activityProductClassifier80, activityProductClassifier81, activityProductClassifier82, activityProductClassifier83, activityProductClassifier84, activityProductClassifier85, activityProductClassifier86, activityProductClassifier87, activityProductClassifier88, activityProductClassifier89, activityProductClassifier90, activityProductClassifier91, activityProductClassifier92, activityProductClassifier93, activityProductClassifier94, activityProductClassifier95, activityProductClassifier96, activityProductClassifier97, activityProductClassifier98, activityProductClassifier99, activityProductClassifier100, activityProductClassifier101, activityProductClassifier102, activityProductClassifier103, activityProductClassifier104, activityProductClassifier105, activityProductClassifier106, activityProductClassifier107, activityProductClassifier108, activityProductClassifier109, activityProductClassifier110, activityProductClassifier111, activityProductClassifier112, activityProductClassifier113, activityProductClassifier114, activityProductClassifier115, activityProductClassifier116, activityProductClassifier117, activityProductClassifier118, activityProductClassifier119, activityProductClassifier120, activityProductClassifier121, activityProductClassifier122, activityProductClassifier123, activityProductClassifier124};
        $VALUES = activityProductClassifierArr;
        $ENTRIES = new EnumEntriesList(activityProductClassifierArr);
        INSTANCE = new Companion();
        ADAPTER = new ActivityProductClassifier$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ActivityProductClassifier.class), Syntax.PROTO_2, activityProductClassifier);
    }

    public ActivityProductClassifier(String str, int i, int i2) {
        this.value = i2;
    }

    public static final ActivityProductClassifier fromValue(int i) {
        INSTANCE.getClass();
        return Companion.fromValue(i);
    }

    public static ActivityProductClassifier valueOf(String str) {
        return (ActivityProductClassifier) Enum.valueOf(ActivityProductClassifier.class, str);
    }

    public static ActivityProductClassifier[] values() {
        return (ActivityProductClassifier[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}

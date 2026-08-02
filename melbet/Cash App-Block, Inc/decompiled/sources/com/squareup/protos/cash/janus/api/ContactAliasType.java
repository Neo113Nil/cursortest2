package com.squareup.protos.cash.janus.api;

import com.squareup.protos.cash.investautomator.model.Automation;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.protos.cash.investcrypto.resources.OrderStateReason;
import com.squareup.protos.cash.kgoosememorystore.api.v1.FinancialKey;
import com.squareup.protos.cash.kgoosememorystore.api.v1.TemporalQualifier;
import com.squareup.protos.cash.local.client.v1.LocalCashConfiguration;
import com.squareup.protos.cash.messagingplatformcommon.common.ProductType;
import com.squareup.protos.cash.money.content.MoneyTab;
import com.squareup.protos.cash.papermate.states.PaperMoneyDepositState;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.protos.cash.pay.CashAppPayPaymentScheduleRenderData;
import com.squareup.protos.cash.paychecks.api.blockers.v1.SetPaycheckAllocationAmountInputs;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum ContactAliasType implements WireEnum {
    ALIAS_TYPE_UNKNOWN(1),
    ALIAS_TYPE_EMAIL(2),
    ALIAS_TYPE_SMS(3);

    public final int value;
    public static final Companion Companion = new Companion();
    public static final ContactAliasType$Companion$ADAPTER$1 ADAPTER = new ContactAliasType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ContactAliasType.class), Syntax.PROTO_2, null);

    ContactAliasType(int i) {
        this.value = i;
    }

    public static final ContactAliasType fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return ALIAS_TYPE_UNKNOWN;
        }
        if (i == 2) {
            return ALIAS_TYPE_EMAIL;
        }
        if (i != 3) {
            return null;
        }
        return ALIAS_TYPE_SMS;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    public final class Companion {
        /* renamed from: fromValue, reason: collision with other method in class */
        public static ProductType m3894fromValue(int i) {
            switch (i) {
                case 0:
                    return ProductType.PRODUCT_TYPE_UNSPECIFIED;
                case 1:
                    return ProductType.PRODUCT_TYPE_BANKING;
                case 2:
                    return ProductType.PRODUCT_TYPE_BITCOIN;
                case 3:
                    return ProductType.PRODUCT_TYPE_CASH_CARD;
                case 4:
                    return ProductType.PRODUCT_TYPE_COMMUNITY;
                case 5:
                    return ProductType.PRODUCT_TYPE_STOCKS;
                case 6:
                    return ProductType.PRODUCT_TYPE_TAXES;
                case 7:
                    return ProductType.PRODUCT_TYPE_TEENS;
                case 8:
                    return ProductType.PRODUCT_TYPE_CASH_APP_PAY;
                case 9:
                    return ProductType.PRODUCT_TYPE_BORROW;
                case 10:
                    return ProductType.PRODUCT_TYPE_CASH_APP_AFTERPAY;
                case 11:
                    return ProductType.PRODUCT_TYPE_C4B;
                case 12:
                    return ProductType.PRODUCT_TYPE_LOCAL;
                case 13:
                    return ProductType.PRODUCT_TYPE_CASH_APP_CARD;
                case 14:
                    return ProductType.PRODUCT_TYPE_CASH_APP_CARD_CARD_ORDER;
                case 15:
                    return ProductType.PRODUCT_TYPE_CASH_APP_CARD_CARD_DESIGN;
                case 16:
                    return ProductType.PRODUCT_TYPE_CASH_APP_CARD_ATM;
                case 17:
                    return ProductType.PRODUCT_TYPE_CASH_APP_CARD_OFFERS;
                case 18:
                    return ProductType.PRODUCT_TYPE_LENDING;
                case 19:
                    return ProductType.PRODUCT_TYPE_LENDING_RETRO;
                case 20:
                    return ProductType.PRODUCT_TYPE_LENDING_BORROW;
                case 21:
                    return ProductType.PRODUCT_TYPE_LENDING_BNPL;
                case 22:
                    return ProductType.PRODUCT_TYPE_LENDING_TAX_REFUND_ADVANCE;
                case 23:
                    return ProductType.PRODUCT_TYPE_LENDING_OVERDRAFT;
                case 24:
                    return ProductType.PRODUCT_TYPE_SAVINGS;
                case 25:
                    return ProductType.PRODUCT_TYPE_SAVINGS_APY;
                case 26:
                    return ProductType.PRODUCT_TYPE_SAVINGS_GOALS;
                case 27:
                    return ProductType.PRODUCT_TYPE_SAVINGS_AUTOSAVE;
                case 28:
                    return ProductType.PRODUCT_TYPE_SAVINGS_ROUNDUPS;
                case 29:
                    return ProductType.PRODUCT_TYPE_BITCOIN_AUTO_INVEST;
                case 30:
                    return ProductType.PRODUCT_TYPE_BITCOIN_PAID_IN_BITCOIN;
                case 31:
                    return ProductType.PRODUCT_TYPE_BITCOIN_ROUND_UPS;
                case 32:
                    return ProductType.PRODUCT_TYPE_TRANSFERS;
                case 33:
                    return ProductType.PRODUCT_TYPE_TRANSFERS_ADD_MONEY;
                case 34:
                    return ProductType.PRODUCT_TYPE_TRANSFERS_AUTO_RELOAD;
                case 35:
                    return ProductType.PRODUCT_TYPE_TRANSFERS_WITHDRAW;
                case 36:
                    return ProductType.PRODUCT_TYPE_TRANSFERS_INSTRUMENT_LINKING;
                case 37:
                    return ProductType.PRODUCT_TYPE_TRANSFERS_WIRE_TRANSFERS;
                case 38:
                    return ProductType.PRODUCT_TYPE_PRIMARY_BANKING;
                case 39:
                    return ProductType.PRODUCT_TYPE_PRIMARY_BANKING_DIRECT_DEPOSIT;
                case 40:
                    return ProductType.PRODUCT_TYPE_PRIMARY_BANKING_GREEN;
                case 41:
                    return ProductType.PRODUCT_TYPE_PRIMARY_BANKING_PMD;
                case 42:
                    return ProductType.PRODUCT_TYPE_PRIMARY_BANKING_CHECK_DEPOSITS;
                case 43:
                    return ProductType.PRODUCT_TYPE_PRIMARY_BANKING_ACH_DEBITS_RDFI;
                case 44:
                    return ProductType.PRODUCT_TYPE_PRIMARY_BANKING_OVERDRAFT;
                case 45:
                    return ProductType.PRODUCT_TYPE_STOCKS_AUTO_INVEST;
                case 46:
                    return ProductType.PRODUCT_TYPE_STOCKS_ROUNDUPS;
                case 47:
                    return ProductType.PRODUCT_TYPE_TAXES_ESTIMATE_REFUND;
                case 48:
                    return ProductType.PRODUCT_TYPE_TAXES_FILE_REFUND;
                case 49:
                    return ProductType.PRODUCT_TYPE_NETWORK;
                case 50:
                    return ProductType.PRODUCT_TYPE_NETWORK_P2P;
                case 51:
                    return ProductType.PRODUCT_TYPE_NETWORK_POOLS;
                case 52:
                    return ProductType.PRODUCT_TYPE_FAMILIES;
                case 53:
                    return ProductType.PRODUCT_TYPE_FAMILIES_LIMITS;
                case 54:
                    return ProductType.PRODUCT_TYPE_FAMILIES_ALLOWANCE;
                case 55:
                    return ProductType.PRODUCT_TYPE_FAMILIES_SAFETY;
                case 56:
                    return ProductType.PRODUCT_TYPE_FAMILIES_SPONSOR;
                case 57:
                    return ProductType.PRODUCT_TYPE_FAMILIES_TEENS;
                case 58:
                    return ProductType.PRODUCT_TYPE_INCENTIVES;
                case 59:
                    return ProductType.PRODUCT_TYPE_INCENTIVES_GIVEAWAY;
                case 60:
                    return ProductType.PRODUCT_TYPE_INCENTIVES_INVITATIONS;
                case 61:
                    return ProductType.PRODUCT_TYPE_INCENTIVES_SURPRISE_AND_DELIGHT;
                case 62:
                    return ProductType.PRODUCT_TYPE_INCENTIVES_SWEEPSTAKES;
                case 63:
                    return ProductType.PRODUCT_TYPE_INCENTIVES_ACTION_BASED;
                case 64:
                    return ProductType.PRODUCT_TYPE_NEIGHBORHOODS;
                case 65:
                    return ProductType.PRODUCT_TYPE_MONEYBOT;
                case 66:
                    return ProductType.PRODUCT_TYPE_ACCOUNT;
                case 67:
                    return ProductType.PRODUCT_TYPE_ADVERSITIES;
                case 68:
                    return ProductType.PRODUCT_TYPE_CASH_APP_TAG;
                case 69:
                    return ProductType.PRODUCT_TYPE_EARNINGS;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static PaperMoneyDepositState m3896fromValue(int i) {
            switch (i) {
                case 0:
                    return PaperMoneyDepositState.DO_NOT_USE;
                case 1:
                    return PaperMoneyDepositState.INITIATED;
                case 2:
                    return PaperMoneyDepositState.VALIDATED;
                case 3:
                    return PaperMoneyDepositState.PENDING;
                case 4:
                    return PaperMoneyDepositState.SETTLED;
                case 5:
                    return PaperMoneyDepositState.EXPIRED;
                case 6:
                    return PaperMoneyDepositState.FAILED;
                case 7:
                    return PaperMoneyDepositState.DECLINED;
                case 8:
                    return PaperMoneyDepositState.REVERSED;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static OrderStateReason m3890fromValue(int i) {
            switch (i) {
                case 1:
                    return OrderStateReason.MANUAL;
                case 2:
                case 3:
                case 6:
                case 10:
                default:
                    return null;
                case 4:
                    return OrderStateReason.CUSTOM_ORDER_TYPE_CHANGED;
                case 5:
                    return OrderStateReason.CUSTOM_ORDER_LIMITS_EXCEEDED;
                case 7:
                    return OrderStateReason.INSUFFICIENT_FUNDS;
                case 8:
                    return OrderStateReason.LIMITS_EXCEEDED;
                case 9:
                    return OrderStateReason.RISK_FAILURE;
                case 11:
                    return OrderStateReason.DENYLISTED;
                case 12:
                    return OrderStateReason.DENYLISTED_TAX_B_NOTICE;
                case 13:
                    return OrderStateReason.ORDER_ABANDONED;
                case 14:
                    return OrderStateReason.ORDER_EXPIRED;
                case 15:
                    return OrderStateReason.CUSTOMER_REGION_NOT_AVAILABLE;
                case 16:
                    return OrderStateReason.CUSTOMER_CONTROL_DISABLED_BY_SPONSOR;
                case 17:
                    return OrderStateReason.DENYLISTED_TAX_B_NOTICE_ON_SPONSOR;
                case 18:
                    return OrderStateReason.ORDER_REJECTION_GENERIC_ERROR;
                case 19:
                    return OrderStateReason.TRADING_HALTED;
                case 20:
                    return OrderStateReason.ACCOUNT_FROZEN;
                case 21:
                    return OrderStateReason.ZERO_OR_NEGATIVE_AMOUNT;
                case 22:
                    return OrderStateReason.ACCOUNT_DENYLISTED;
                case 23:
                    return OrderStateReason.CUSTOMER_ELIGIBILITY_VIOLATION;
                case 24:
                    return OrderStateReason.CASH_FOR_BUSINESS;
                case 25:
                    return OrderStateReason.ORDER_ABANDONED_FAILED_PUSH_REVERSAL;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static FinancialKey m3891fromValue(int i) {
            switch (i) {
                case 0:
                    return FinancialKey.FINANCIAL_KEY_UNSPECIFIED;
                case 1:
                    return FinancialKey.FINANCIAL_KEY_HOUSEHOLD_SIZE;
                case 2:
                    return FinancialKey.FINANCIAL_KEY_MONTHLY_INCOME;
                case 3:
                    return FinancialKey.FINANCIAL_KEY_INCOME_STABILITY;
                case 4:
                    return FinancialKey.FINANCIAL_KEY_MONTHLY_EXPENSES;
                case 5:
                    return FinancialKey.FINANCIAL_KEY_HOUSING_PAYMENT;
                case 6:
                    return FinancialKey.FINANCIAL_KEY_CHECKING_BALANCE;
                case 7:
                    return FinancialKey.FINANCIAL_KEY_SAVINGS_BALANCE;
                case 8:
                    return FinancialKey.FINANCIAL_KEY_RETIREMENT_BALANCE;
                case 9:
                    return FinancialKey.FINANCIAL_KEY_BROKERAGE_BALANCE;
                case 10:
                    return FinancialKey.FINANCIAL_KEY_CREDIT_CARD_DEBT;
                case 11:
                    return FinancialKey.FINANCIAL_KEY_STUDENT_LOAN_DEBT;
                case 12:
                    return FinancialKey.FINANCIAL_KEY_AUTO_LOAN_DEBT;
                case 13:
                    return FinancialKey.FINANCIAL_KEY_MORTGAGE_DEBT;
                case 14:
                    return FinancialKey.FINANCIAL_KEY_PRIMARY_GOAL;
                case 15:
                    return FinancialKey.FINANCIAL_KEY_RISK_TOLERANCE;
                case 16:
                    return FinancialKey.FINANCIAL_KEY_EMPLOYMENT_STATUS;
                case 17:
                    return FinancialKey.FINANCIAL_KEY_NUMBER_DEPENDENTS;
                case 18:
                    return FinancialKey.FINANCIAL_KEY_EMPLOYMENT_TYPE;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static TemporalQualifier m3892fromValue(int i) {
            if (i == 0) {
                return TemporalQualifier.TEMPORAL_QUALIFIER_UNSPECIFIED;
            }
            if (i == 1) {
                return TemporalQualifier.TEMPORAL_QUALIFIER_CURRENT;
            }
            if (i == 2) {
                return TemporalQualifier.TEMPORAL_QUALIFIER_PLANNED;
            }
            if (i == 3) {
                return TemporalQualifier.TEMPORAL_QUALIFIER_HISTORICAL;
            }
            if (i != 4) {
                return null;
            }
            return TemporalQualifier.TEMPORAL_QUALIFIER_RECURRING;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static SetPaycheckAllocationAmountInputs.SubmissionInteraction m3899fromValue(int i) {
            if (i == 0) {
                return SetPaycheckAllocationAmountInputs.SubmissionInteraction.SUBMISSION_INTERACTION_UNSPECIFIED;
            }
            if (i == 1) {
                return SetPaycheckAllocationAmountInputs.SubmissionInteraction.SUBMISSION_INTERACTION_CANCEL;
            }
            if (i == 2) {
                return SetPaycheckAllocationAmountInputs.SubmissionInteraction.SUBMISSION_INTERACTION_BUTTON_TAP_CONFIRM;
            }
            if (i == 3) {
                return SetPaycheckAllocationAmountInputs.SubmissionInteraction.SUBMISSION_INTERACTION_BUTTON_TAP_DISABLE;
            }
            if (i == 4) {
                return SetPaycheckAllocationAmountInputs.SubmissionInteraction.SUBMISSION_INTERACTION_CONFIGURATION_ROW_TAP;
            }
            if (i != 5) {
                return null;
            }
            return SetPaycheckAllocationAmountInputs.SubmissionInteraction.SUBMISSION_INTERACTION_DESTINATION_SELECTION_CHANGE;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static LocalCashConfiguration.ApplicationMethod m3893fromValue(int i) {
            if (i == 0) {
                return LocalCashConfiguration.ApplicationMethod.APPLICATION_METHOD_UNSPECIFIED;
            }
            if (i == 1) {
                return LocalCashConfiguration.ApplicationMethod.APPLICATION_METHOD_PRE_TAX_PRE_TIP;
            }
            if (i == 2) {
                return LocalCashConfiguration.ApplicationMethod.APPLICATION_METHOD_PRE_TAX_POST_TIP;
            }
            if (i == 3) {
                return LocalCashConfiguration.ApplicationMethod.APPLICATION_METHOD_POST_TAX_PRE_TIP;
            }
            if (i != 4) {
                return null;
            }
            return LocalCashConfiguration.ApplicationMethod.APPLICATION_METHOD_POST_TAX_POST_TIP;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static MoneyTab.Applet.Id m3895fromValue(int i) {
            switch (i) {
                case 0:
                    return MoneyTab.Applet.Id.UNSPECIFIED;
                case 1:
                    return MoneyTab.Applet.Id.BANKING_CARD;
                case 2:
                    return MoneyTab.Applet.Id.BANKING_BENEFITS;
                case 3:
                    return MoneyTab.Applet.Id.TAXES;
                case 4:
                    return MoneyTab.Applet.Id.SAVINGS;
                case 5:
                    return MoneyTab.Applet.Id.BORROW;
                case 6:
                    return MoneyTab.Applet.Id.PAYCHECKS;
                case 7:
                    return MoneyTab.Applet.Id.BITCOIN;
                case 8:
                    return MoneyTab.Applet.Id.STOCKS;
                case 9:
                    return MoneyTab.Applet.Id.EARNINGS;
                case 10:
                    return MoneyTab.Applet.Id.FAMILY;
                case 11:
                    return MoneyTab.Applet.Id.AFTERPAY;
                case 12:
                    return MoneyTab.Applet.Id.POOLS;
                case 13:
                    return MoneyTab.Applet.Id.CASH_CREDIT_SCORE;
                case 14:
                    return MoneyTab.Applet.Id.EARNER;
                case 15:
                    return MoneyTab.Applet.Id.PHONE_PLAN;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static CashAppPayPaymentScheduleRenderData.PaymentScheduleState m3898fromValue(int i) {
            switch (i) {
                case 0:
                    return CashAppPayPaymentScheduleRenderData.PaymentScheduleState.UNKNOWN_PAYMENT_SCHEDULE_STATE;
                case 1:
                    return CashAppPayPaymentScheduleRenderData.PaymentScheduleState.OWED_PAYMENT_SCHEDULE_STATE;
                case 2:
                    return CashAppPayPaymentScheduleRenderData.PaymentScheduleState.PAID_PAYMENT_SCHEDULE_STATE;
                case 3:
                    return CashAppPayPaymentScheduleRenderData.PaymentScheduleState.OVER_DUE_PAYMENT_SCHEDULE_STATE;
                case 4:
                    return CashAppPayPaymentScheduleRenderData.PaymentScheduleState.REFUNDED_PAYMENT_SCHEDULE_STATE;
                case 5:
                    return CashAppPayPaymentScheduleRenderData.PaymentScheduleState.DEFERRED_PAYMENT_SCHEDULE_STATE;
                case 6:
                    return CashAppPayPaymentScheduleRenderData.PaymentScheduleState.PENDING_PAYMENT_SCHEDULE_STATE;
                case 7:
                    return CashAppPayPaymentScheduleRenderData.PaymentScheduleState.PARTIALLY_REFUNDED_PAYMENT_SCHEDULE_STATE;
                case 8:
                    return CashAppPayPaymentScheduleRenderData.PaymentScheduleState.CANCELLED_PAYMENT_SCHEDULE_STATE;
                case 9:
                    return CashAppPayPaymentScheduleRenderData.PaymentScheduleState.MISSED_PAYMENT_SCHEDULE_STATE;
                default:
                    return null;
            }
        }

        public static Automation.AutomationTarget.Type fromValue(int i) {
            if (i == 0) {
                return Automation.AutomationTarget.Type.COULD_NOT_PARSE_AUTOMATION_TARGET_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return Automation.AutomationTarget.Type.INVESTMENT_ENTITY;
            }
            if (i == 2) {
                return Automation.AutomationTarget.Type.CRYPTOCURRENCY;
            }
            if (i == 4) {
                return Automation.AutomationTarget.Type.SAVINGS_BALANCE;
            }
            if (i != 5) {
                return null;
            }
            return Automation.AutomationTarget.Type.SAVINGS_GOAL;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static Order.Feature m3889fromValue(int i) {
            switch (i) {
                case 1:
                    return Order.Feature.MANUAL;
                case 2:
                    return Order.Feature.MANUAL_RECURRING;
                case 3:
                    return Order.Feature.CASH_CARD_BOOST;
                case 4:
                    return Order.Feature.P2P_GIFTING;
                case 5:
                    return Order.Feature.PAYROLL_CONVERSION;
                case 6:
                    return Order.Feature.CASH_CARD_ROUND_UP;
                case 7:
                    return Order.Feature.SQUARE_BITCOIN_SAVINGS;
                case 8:
                    return Order.Feature.CANCELED_SPONSORSHIP;
                case 9:
                    return Order.Feature.REVERSAL;
                case 10:
                    return Order.Feature.BITKEY_TRANSFER;
                case 11:
                    return Order.Feature.USD_ON_LN_PAYMENT;
                case 12:
                    return Order.Feature.BTC_CARD_SPEND;
                case 13:
                    return Order.Feature.ACH_CLAWBACK;
                case 14:
                    return Order.Feature.BITCOIN_MODE_REWARD;
                case 15:
                    return Order.Feature.P2P_RECEIVE;
                case 16:
                    return Order.Feature.P2P_SEND;
                case 17:
                    return Order.Feature.BTC_FUNDED_ACH;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static CashAppPayOrderRenderData.Product m3897fromValue(int i) {
            switch (i) {
                case 0:
                    return CashAppPayOrderRenderData.Product.PRODUCT_UNKNOWN;
                case 1:
                    return CashAppPayOrderRenderData.Product.PRODUCT_RETROACTIVE_FINANCING;
                case 2:
                    return CashAppPayOrderRenderData.Product.PRODUCT_CASH_APP_PAY;
                case 3:
                    return CashAppPayOrderRenderData.Product.PRODUCT_AFTERPAY;
                case 4:
                    return CashAppPayOrderRenderData.Product.PRODUCT_CASH_APP_CARD;
                case 5:
                    return CashAppPayOrderRenderData.Product.PRODUCT_CASH_CARD_RETROACTIVE_FINANCING;
                case 6:
                    return CashAppPayOrderRenderData.Product.PRODUCT_AFTERPAY_PAY_IN_FOUR;
                case 7:
                    return CashAppPayOrderRenderData.Product.PRODUCT_AFTERPAY_PAY_NOW;
                case 8:
                    return CashAppPayOrderRenderData.Product.PRODUCT_AFTERPAY_PAY_MONTHLY;
                case 9:
                    return CashAppPayOrderRenderData.Product.PRODUCT_P2P_RETROACTIVE_FINANCING;
                case 10:
                    return CashAppPayOrderRenderData.Product.PRODUCT_PRE_PURCHASE_FINANCING;
                case 11:
                    return CashAppPayOrderRenderData.Product.PRODUCT_OTHER;
                case 12:
                    return CashAppPayOrderRenderData.Product.PRODUCT_CF_BNPL;
                case 13:
                    return CashAppPayOrderRenderData.Product.PRODUCT_SINGLE_USE_PAYMENT;
                case 14:
                    return CashAppPayOrderRenderData.Product.PRODUCT_PAYOUT;
                case 15:
                    return CashAppPayOrderRenderData.Product.PRODUCT_CASH_APP_PAY_RETROACTIVE_FINANCING;
                default:
                    return null;
            }
        }
    }
}

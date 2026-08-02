package com.squareup.protos.franklin.data;

import com.plaid.internal.EnumC0170g;
import com.squareup.protos.franklin.common.DisputedTransactionRenderData;
import com.squareup.protos.franklin.common.InvestPaymentRenderData;
import com.squareup.protos.franklin.common.LendingRenderData;
import com.squareup.protos.franklin.lending.RefundReason;
import com.squareup.protos.franklin.ui.CardOrderData;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum LinkResult implements WireEnum {
    SUCCESS(1),
    ERROR(68),
    BANK_INVALID_ACCOUNT_NUMBER(2),
    BANK_INVALID_ROUTING_NUMBER(3),
    BANK_NOT_FOUND_ROUTING_NUMBER(45),
    BANK_PREVIOUSLY_FAILED_PUSH(46),
    BANK_EXPECTED_ROUTING_GOT_WIRE_TRANSFER_NUMBER(55),
    BANK_MISSING_ACCOUNT_NUMBER(4),
    BANK_MISSING_ROUTING_NUMBER(5),
    CARD_BRAND_UNSUPPORTED(6),
    CARD_LENGTH_INVALID(7),
    CARD_LINKED_TOO_MANY_ACCOUNTS(8),
    CARD_NUMBER_INVALID(9),
    CARD_NUMBER_MISSING(10),
    CARD_NUMBER_TOO_LONG(11),
    CARD_NUMBER_TOO_SHORT(12),
    CARD_VERIFICATION_ERROR(13),
    EXPIRED(14),
    INVALID_BIN(15),
    PREPAID_BIN(39),
    INVALID_COUNTRY(40),
    NO_CARD_TYPE(41),
    NO_INFORMATION_FOR_BIN(42),
    INVALID_OR_NO_PREPAID_STATUS(43),
    INVALID_OR_NO_CARD_PRODUCT(44),
    INVALID_BIN_US_DEBIT_OR_CREDIT(16),
    INVALID_EXPIRATION(17),
    INVALID_ZIP(18),
    NEED_BANK_ACCOUNT(19),
    SENDER_NON_MTL(20),
    TOO_MANY_FAILED_CARD_LINK_ATTEMPTS(21),
    VISA_PREPAID_CARD(22),
    INVALID_CVV(23),
    BANK_LINKED_TOO_MANY_ACCOUNTS(24),
    TOO_MANY_FAILED_CVV_ATTEMPTS(25),
    CARD_BLOCKED_BY_TOTAL_FAILED_CVV_ATTEMPTS(26),
    RECIPIENT_NON_MTL(27),
    AUTO_UPDATED(28),
    INVALID_CVV_OR_EXPIRATION(29),
    CARD_BLACKLISTED(30),
    CARD_DENYLISTED(63),
    BANK_ACCOUNT_BLACKLISTED(31),
    BANK_ACCOUNT_DENYLISTED(64),
    NORMALIZED_BANK_ACCOUNT_BLACKLISTED(32),
    NORMALIZED_BANK_ACCOUNT_DENYLISTED(65),
    ROUTING_NUMBER_BLACKLISTED(33),
    ROUTING_NUMBER_DENYLISTED(66),
    ROUTING_NUMBER_DENYLISTED_MANUAL_LINK(113),
    CARD_EXPECTED_DEBIT_GOT_CREDIT(34),
    CARD_EXPECTED_CREDIT_GOT_DEBIT(35),
    CARD_UNSUPPORTED_UNLINKED_ON_PUSH_OR_PULL(36),
    AMEX_LINKED_BY_INELIGIBLE_CUSTOMER(37),
    CREDIT_CARD_LINKED_BY_INELIGIBLE_CUSTOMER(38),
    CARD_LINK_BLOCKED_BY_RISK(57),
    BANK_ACCOUNT_PERMANENTLY_FAILED(48),
    BANK_ACCOUNT_NOT_VERIFIED(50),
    BANK_ACCOUNT_BLACKLISTED_IN_GRINGOTTS(53),
    BANK_ACCOUNT_DENYLISTED_IN_GRINGOTTS(67),
    BANK_ACCOUNT_UNEXPECTED_GRINGOTTS_BLOCKER(54),
    BANK_ACCOUNT_CLOSED_FAILURE_IN_GRINGOTTS(EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE),
    SQUARE_ISSUED_CARD(56),
    INSTRUMENT_LINKING_DISABLED(58),
    CARD_LINK_BLOCKED_BY_CUSTOMER_DENYLIST_RULES(59),
    THREEDS_CHALLENGE_REQUIRED(60),
    THREEDS_CHALLENGE_FAILED(61),
    THREEDS_SERVICE_FAILURE(62),
    MICRO_AUTHORIZATION_REQUIRED(103),
    MICRO_AUTHORIZATION_FAILURE(104),
    MICRO_AUTHORIZATION_CUSTOMER_DECLINED(105),
    MICRO_AUTHORIZATION_SERVER_FAILURE(106),
    MICRO_AUTHORIZATION_INELIGIBLE(107),
    MICRO_AUTHORIZATION_INSUFFICIENT_FUNDS(108),
    MICRO_AUTHORIZATION_AUTH_DECLINED(109),
    MICRO_AUTHORIZATION_TIMED_OUT(112),
    BANK_LINK_BLOCKED_BY_CUSTOMER_DENYLIST_RULES(69),
    INSTRUMENT_LINK_BLOCKED_BY_COMPLIANCE_HIGH_RISK(70),
    CREDIT_CARD_LINK_BLOCKED_BY_CUSTOMER_DENYLIST_RULES(71),
    CREDIT_CARD_LINK_BLOCKED_BY_CUSTOMER_DENYLIST_RULE(72),
    CARD_LINK_BLOCKED_BY_ZERO_BALANCE_DENYLIST_RULE(73),
    BANK_LINK_BLOCKED_BY_ZERO_BALANCE_DENYLIST_RULE(74),
    CV_ERROR_CUSTOMER_CONTACT_REQUIRED(75),
    CV_ERROR_GENERIC_DECLINE_DO_NOT_HONOR(76),
    CV_ERROR_RETURN_CARD(77),
    CV_ERROR_WRONG_CARD_NUMBER(78),
    CV_ERROR_CARD_LOST_OR_STOLEN(79),
    CV_ERROR_ACCOUNT_CLOSED(80),
    CV_ERROR_INSUFFICIENT_FUNDS(81),
    CV_ERROR_EXPIRED_CARD(82),
    CV_ERROR_RESTRICTED_CARD(83),
    CV_ERROR_TRANSACTION_TYPE_NOT_ALLOWED(84),
    CV_ERROR_BLOCKED_FIRST_USE(101),
    CV_ERROR_SUSPECTED_FRAUD(102),
    CARD_LINK_BLOCKED_BY_PREPAID_ELIGIBILITY_RULE(85),
    TOO_MANY_CARD_LINK_ATTEMPTS(86),
    TOO_MANY_BANK_LINK_ATTEMPTS(87),
    TOO_MANY_SUCCESSFUL_CARD_LINKS_THIRTY_DAYS(88),
    TOO_MANY_SUCCESSFUL_BANK_LINKS_THIRTY_DAYS(89),
    TOO_MANY_SUCCESSFUL_CARD_LINKS_ONE_DAY(90),
    TOO_MANY_SUCCESSFUL_BANK_LINKS_ONE_DAY(91),
    TOO_MANY_CARD_LINK_ATTEMPTS_THIRTY_DAYS(92),
    TOO_MANY_BANK_LINK_ATTEMPTS_THIRTY_DAYS(93),
    TOO_MANY_CARD_LINK_ATTEMPTS_ONE_DAY(94),
    TOO_MANY_BANK_LINK_ATTEMPTS_ONE_DAY(95),
    TOO_MANY_SUCCESSFUL_CARD_LINKS_IR_THIRTY_DAYS(97),
    TOO_MANY_SUCCESSFUL_BANK_LINKS_IR_THIRTY_DAYS(98),
    TOO_MANY_SUCCESSFUL_CARD_LINKS_IR_ONE_DAY(99),
    TOO_MANY_SUCCESSFUL_BANK_LINKS_IR_ONE_DAY(100),
    TOO_MANY_ACTIVE_BANK_ACCOUNT_LINKS(114),
    TOO_MANY_ACTIVE_CREDIT_CARD_LINKS(115),
    TOO_MANY_ACTIVE_DEBIT_CARD_LINKS(116),
    BANK_ACCOUNT_ALREADY_LINKED(117),
    CREDIT_CARD_ALREADY_LINKED(118),
    DEBIT_CARD_ALREADY_LINKED(119),
    BANK_LINKED_TOO_MANY_SSNS(110),
    CARD_LINKED_TOO_MANY_SSNS(111),
    CONCURRENT_LINK_BLOCKED(96),
    SCOPE_DOWNGRADE(120),
    BLOCKED_BY_ELIGIBILITY_RULE(121),
    CARD_LINK_BLOCKED_BY_DIDV_REQUIREMENT(EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE),
    CARD_LINK_BLOCKED_BY_DIDV_MANUAL_REVIEW(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE),
    CARD_LINK_BLOCKED_BY_DIDV_FAILED(125),
    CARD_LINK_DIDV_VERIFIED_RETRY_REQUIRED(EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);

    public final int value;
    public static final Companion Companion = new Companion();
    public static final LinkResult$Companion$ADAPTER$1 ADAPTER = new LinkResult$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(LinkResult.class), Syntax.PROTO_2, null);

    LinkResult(int i) {
        this.value = i;
    }

    public static final LinkResult fromValue(int i) {
        Companion.getClass();
        return Companion.m3959fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    public final class Companion {
        /* renamed from: fromValue, reason: collision with other method in class */
        public static LinkResult m3959fromValue(int i) {
            switch (i) {
                case 1:
                    return LinkResult.SUCCESS;
                case 2:
                    return LinkResult.BANK_INVALID_ACCOUNT_NUMBER;
                case 3:
                    return LinkResult.BANK_INVALID_ROUTING_NUMBER;
                case 4:
                    return LinkResult.BANK_MISSING_ACCOUNT_NUMBER;
                case 5:
                    return LinkResult.BANK_MISSING_ROUTING_NUMBER;
                case 6:
                    return LinkResult.CARD_BRAND_UNSUPPORTED;
                case 7:
                    return LinkResult.CARD_LENGTH_INVALID;
                case 8:
                    return LinkResult.CARD_LINKED_TOO_MANY_ACCOUNTS;
                case 9:
                    return LinkResult.CARD_NUMBER_INVALID;
                case 10:
                    return LinkResult.CARD_NUMBER_MISSING;
                case 11:
                    return LinkResult.CARD_NUMBER_TOO_LONG;
                case 12:
                    return LinkResult.CARD_NUMBER_TOO_SHORT;
                case 13:
                    return LinkResult.CARD_VERIFICATION_ERROR;
                case 14:
                    return LinkResult.EXPIRED;
                case 15:
                    return LinkResult.INVALID_BIN;
                case 16:
                    return LinkResult.INVALID_BIN_US_DEBIT_OR_CREDIT;
                case 17:
                    return LinkResult.INVALID_EXPIRATION;
                case 18:
                    return LinkResult.INVALID_ZIP;
                case 19:
                    return LinkResult.NEED_BANK_ACCOUNT;
                case 20:
                    return LinkResult.SENDER_NON_MTL;
                case 21:
                    return LinkResult.TOO_MANY_FAILED_CARD_LINK_ATTEMPTS;
                case 22:
                    return LinkResult.VISA_PREPAID_CARD;
                case 23:
                    return LinkResult.INVALID_CVV;
                case 24:
                    return LinkResult.BANK_LINKED_TOO_MANY_ACCOUNTS;
                case 25:
                    return LinkResult.TOO_MANY_FAILED_CVV_ATTEMPTS;
                case 26:
                    return LinkResult.CARD_BLOCKED_BY_TOTAL_FAILED_CVV_ATTEMPTS;
                case 27:
                    return LinkResult.RECIPIENT_NON_MTL;
                case 28:
                    return LinkResult.AUTO_UPDATED;
                case 29:
                    return LinkResult.INVALID_CVV_OR_EXPIRATION;
                case 30:
                    return LinkResult.CARD_BLACKLISTED;
                case 31:
                    return LinkResult.BANK_ACCOUNT_BLACKLISTED;
                case 32:
                    return LinkResult.NORMALIZED_BANK_ACCOUNT_BLACKLISTED;
                case 33:
                    return LinkResult.ROUTING_NUMBER_BLACKLISTED;
                case 34:
                    return LinkResult.CARD_EXPECTED_DEBIT_GOT_CREDIT;
                case 35:
                    return LinkResult.CARD_EXPECTED_CREDIT_GOT_DEBIT;
                case 36:
                    return LinkResult.CARD_UNSUPPORTED_UNLINKED_ON_PUSH_OR_PULL;
                case 37:
                    return LinkResult.AMEX_LINKED_BY_INELIGIBLE_CUSTOMER;
                case 38:
                    return LinkResult.CREDIT_CARD_LINKED_BY_INELIGIBLE_CUSTOMER;
                case 39:
                    return LinkResult.PREPAID_BIN;
                case 40:
                    return LinkResult.INVALID_COUNTRY;
                case 41:
                    return LinkResult.NO_CARD_TYPE;
                case 42:
                    return LinkResult.NO_INFORMATION_FOR_BIN;
                case 43:
                    return LinkResult.INVALID_OR_NO_PREPAID_STATUS;
                case 44:
                    return LinkResult.INVALID_OR_NO_CARD_PRODUCT;
                case 45:
                    return LinkResult.BANK_NOT_FOUND_ROUTING_NUMBER;
                case 46:
                    return LinkResult.BANK_PREVIOUSLY_FAILED_PUSH;
                case 47:
                case 49:
                case 51:
                case 52:
                default:
                    return null;
                case 48:
                    return LinkResult.BANK_ACCOUNT_PERMANENTLY_FAILED;
                case 50:
                    return LinkResult.BANK_ACCOUNT_NOT_VERIFIED;
                case 53:
                    return LinkResult.BANK_ACCOUNT_BLACKLISTED_IN_GRINGOTTS;
                case 54:
                    return LinkResult.BANK_ACCOUNT_UNEXPECTED_GRINGOTTS_BLOCKER;
                case 55:
                    return LinkResult.BANK_EXPECTED_ROUTING_GOT_WIRE_TRANSFER_NUMBER;
                case 56:
                    return LinkResult.SQUARE_ISSUED_CARD;
                case 57:
                    return LinkResult.CARD_LINK_BLOCKED_BY_RISK;
                case 58:
                    return LinkResult.INSTRUMENT_LINKING_DISABLED;
                case 59:
                    return LinkResult.CARD_LINK_BLOCKED_BY_CUSTOMER_DENYLIST_RULES;
                case 60:
                    return LinkResult.THREEDS_CHALLENGE_REQUIRED;
                case 61:
                    return LinkResult.THREEDS_CHALLENGE_FAILED;
                case 62:
                    return LinkResult.THREEDS_SERVICE_FAILURE;
                case 63:
                    return LinkResult.CARD_DENYLISTED;
                case 64:
                    return LinkResult.BANK_ACCOUNT_DENYLISTED;
                case 65:
                    return LinkResult.NORMALIZED_BANK_ACCOUNT_DENYLISTED;
                case 66:
                    return LinkResult.ROUTING_NUMBER_DENYLISTED;
                case 67:
                    return LinkResult.BANK_ACCOUNT_DENYLISTED_IN_GRINGOTTS;
                case 68:
                    return LinkResult.ERROR;
                case 69:
                    return LinkResult.BANK_LINK_BLOCKED_BY_CUSTOMER_DENYLIST_RULES;
                case 70:
                    return LinkResult.INSTRUMENT_LINK_BLOCKED_BY_COMPLIANCE_HIGH_RISK;
                case 71:
                    return LinkResult.CREDIT_CARD_LINK_BLOCKED_BY_CUSTOMER_DENYLIST_RULES;
                case 72:
                    return LinkResult.CREDIT_CARD_LINK_BLOCKED_BY_CUSTOMER_DENYLIST_RULE;
                case 73:
                    return LinkResult.CARD_LINK_BLOCKED_BY_ZERO_BALANCE_DENYLIST_RULE;
                case 74:
                    return LinkResult.BANK_LINK_BLOCKED_BY_ZERO_BALANCE_DENYLIST_RULE;
                case 75:
                    return LinkResult.CV_ERROR_CUSTOMER_CONTACT_REQUIRED;
                case 76:
                    return LinkResult.CV_ERROR_GENERIC_DECLINE_DO_NOT_HONOR;
                case 77:
                    return LinkResult.CV_ERROR_RETURN_CARD;
                case 78:
                    return LinkResult.CV_ERROR_WRONG_CARD_NUMBER;
                case 79:
                    return LinkResult.CV_ERROR_CARD_LOST_OR_STOLEN;
                case 80:
                    return LinkResult.CV_ERROR_ACCOUNT_CLOSED;
                case 81:
                    return LinkResult.CV_ERROR_INSUFFICIENT_FUNDS;
                case 82:
                    return LinkResult.CV_ERROR_EXPIRED_CARD;
                case 83:
                    return LinkResult.CV_ERROR_RESTRICTED_CARD;
                case 84:
                    return LinkResult.CV_ERROR_TRANSACTION_TYPE_NOT_ALLOWED;
                case 85:
                    return LinkResult.CARD_LINK_BLOCKED_BY_PREPAID_ELIGIBILITY_RULE;
                case 86:
                    return LinkResult.TOO_MANY_CARD_LINK_ATTEMPTS;
                case 87:
                    return LinkResult.TOO_MANY_BANK_LINK_ATTEMPTS;
                case 88:
                    return LinkResult.TOO_MANY_SUCCESSFUL_CARD_LINKS_THIRTY_DAYS;
                case 89:
                    return LinkResult.TOO_MANY_SUCCESSFUL_BANK_LINKS_THIRTY_DAYS;
                case 90:
                    return LinkResult.TOO_MANY_SUCCESSFUL_CARD_LINKS_ONE_DAY;
                case 91:
                    return LinkResult.TOO_MANY_SUCCESSFUL_BANK_LINKS_ONE_DAY;
                case 92:
                    return LinkResult.TOO_MANY_CARD_LINK_ATTEMPTS_THIRTY_DAYS;
                case 93:
                    return LinkResult.TOO_MANY_BANK_LINK_ATTEMPTS_THIRTY_DAYS;
                case 94:
                    return LinkResult.TOO_MANY_CARD_LINK_ATTEMPTS_ONE_DAY;
                case 95:
                    return LinkResult.TOO_MANY_BANK_LINK_ATTEMPTS_ONE_DAY;
                case 96:
                    return LinkResult.CONCURRENT_LINK_BLOCKED;
                case 97:
                    return LinkResult.TOO_MANY_SUCCESSFUL_CARD_LINKS_IR_THIRTY_DAYS;
                case 98:
                    return LinkResult.TOO_MANY_SUCCESSFUL_BANK_LINKS_IR_THIRTY_DAYS;
                case 99:
                    return LinkResult.TOO_MANY_SUCCESSFUL_CARD_LINKS_IR_ONE_DAY;
                case 100:
                    return LinkResult.TOO_MANY_SUCCESSFUL_BANK_LINKS_IR_ONE_DAY;
                case 101:
                    return LinkResult.CV_ERROR_BLOCKED_FIRST_USE;
                case 102:
                    return LinkResult.CV_ERROR_SUSPECTED_FRAUD;
                case 103:
                    return LinkResult.MICRO_AUTHORIZATION_REQUIRED;
                case 104:
                    return LinkResult.MICRO_AUTHORIZATION_FAILURE;
                case 105:
                    return LinkResult.MICRO_AUTHORIZATION_CUSTOMER_DECLINED;
                case 106:
                    return LinkResult.MICRO_AUTHORIZATION_SERVER_FAILURE;
                case 107:
                    return LinkResult.MICRO_AUTHORIZATION_INELIGIBLE;
                case 108:
                    return LinkResult.MICRO_AUTHORIZATION_INSUFFICIENT_FUNDS;
                case 109:
                    return LinkResult.MICRO_AUTHORIZATION_AUTH_DECLINED;
                case 110:
                    return LinkResult.BANK_LINKED_TOO_MANY_SSNS;
                case 111:
                    return LinkResult.CARD_LINKED_TOO_MANY_SSNS;
                case 112:
                    return LinkResult.MICRO_AUTHORIZATION_TIMED_OUT;
                case 113:
                    return LinkResult.ROUTING_NUMBER_DENYLISTED_MANUAL_LINK;
                case 114:
                    return LinkResult.TOO_MANY_ACTIVE_BANK_ACCOUNT_LINKS;
                case 115:
                    return LinkResult.TOO_MANY_ACTIVE_CREDIT_CARD_LINKS;
                case 116:
                    return LinkResult.TOO_MANY_ACTIVE_DEBIT_CARD_LINKS;
                case 117:
                    return LinkResult.BANK_ACCOUNT_ALREADY_LINKED;
                case 118:
                    return LinkResult.CREDIT_CARD_ALREADY_LINKED;
                case 119:
                    return LinkResult.DEBIT_CARD_ALREADY_LINKED;
                case 120:
                    return LinkResult.SCOPE_DOWNGRADE;
                case 121:
                    return LinkResult.BLOCKED_BY_ELIGIBILITY_RULE;
                case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                    return LinkResult.BANK_ACCOUNT_CLOSED_FAILURE_IN_GRINGOTTS;
                case SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE:
                    return LinkResult.CARD_LINK_BLOCKED_BY_DIDV_REQUIREMENT;
                case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                    return LinkResult.CARD_LINK_BLOCKED_BY_DIDV_MANUAL_REVIEW;
                case 125:
                    return LinkResult.CARD_LINK_BLOCKED_BY_DIDV_FAILED;
                case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                    return LinkResult.CARD_LINK_DIDV_VERIFIED_RETRY_REQUIRED;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static BorrowData.TileType m3962fromValue(int i) {
            if (i == 0) {
                return BorrowData.TileType.CREDIT_LIMIT_AND_BORROW_BUTTON;
            }
            if (i == 1) {
                return BorrowData.TileType.PAYMENT_TIMELINE_TILE;
            }
            if (i == 2) {
                return BorrowData.TileType.BULLETINS_TILE;
            }
            if (i == 3) {
                return BorrowData.TileType.LOAN_HISTORY_TILE;
            }
            if (i != 4) {
                return null;
            }
            return BorrowData.TileType.LINKS_TILE;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static RefundReason m3960fromValue(int i) {
            switch (i) {
                case 1:
                    return RefundReason.CAPTURE_WINDOW_EXPIRED;
                case 2:
                    return RefundReason.ITEM_RETURN;
                case 3:
                    return RefundReason.SINGLE_USE_PAYMENT_DOWN_PAYMENT_DISPUTE_WIN;
                case 4:
                    return RefundReason.SINGLE_USE_PAYMENT_ORDER_BUFFER;
                case 5:
                    return RefundReason.CARD_TRANSACTION_REFUNDED;
                case 6:
                    return RefundReason.CARD_TRANSACTION_DECLINED;
                case 7:
                    return RefundReason.EARLY_REPAYMENT_FEE_REFUND;
                case 8:
                    return RefundReason.CARD_TRANSACTION_DISPUTE_WRITE_OFF_RECEIVED;
                case 9:
                    return RefundReason.BANKRUPTCY_REPORTED;
                case 10:
                    return RefundReason.ACCOUNT_TAKEOVER_REPORTED;
                case 11:
                    return RefundReason.ADMIN_INITIATED_VOID;
                case 12:
                    return RefundReason.DECEASED_REPORTED;
                case 13:
                    return RefundReason.CARD_TRANSACTION_DISPUTE_PARTIAL_WRITE_OFF;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static CardOrderData.StateReason m3961fromValue(int i) {
            switch (i) {
                case 1:
                    return CardOrderData.StateReason.ORDER_INITIATED;
                case 2:
                    return CardOrderData.StateReason.SPONSORSHIP_REQUESTED;
                case 3:
                    return CardOrderData.StateReason.ORDER_SUBMITTED;
                case 4:
                    return CardOrderData.StateReason.REVIEW_DECLINED;
                case 5:
                    return CardOrderData.StateReason.REVIEW_APPROVED;
                case 6:
                    return CardOrderData.StateReason.SPONSORSHIP_CANCELED;
                case 7:
                    return CardOrderData.StateReason.ORDER_REJECTED;
                case 8:
                    return CardOrderData.StateReason.MANUAL_INTERVENTION_RESOLVED;
                case 9:
                    return CardOrderData.StateReason.MAILING_ADDRESS_AMENDED;
                case 10:
                    return CardOrderData.StateReason.CARD_UNDELIVERABLE;
                case 11:
                    return CardOrderData.StateReason.MANUAL_INTERVENTION;
                case 12:
                    return CardOrderData.StateReason.SUSPENDED_TOO_LONG_TIME;
                case 13:
                    return CardOrderData.StateReason.CARD_ISSUED;
                case 14:
                    return CardOrderData.StateReason.CARD_SHIPPED;
                case 15:
                    return CardOrderData.StateReason.CARD_DELIVERED;
                case 16:
                    return CardOrderData.StateReason.ORDER_UNLINKED;
                case 17:
                    return CardOrderData.StateReason.RISK_REVIEW_DECLINED;
                case 18:
                    return CardOrderData.StateReason.VIRTUAL_CARD_ACTIVATION_FAILED;
                case 19:
                    return CardOrderData.StateReason.OTHER_FAILURE;
                case 20:
                    return CardOrderData.StateReason.CARD_REISSUED;
                case 21:
                    return CardOrderData.StateReason.CARD_OUT_FOR_DELIVERY;
                case 22:
                    return CardOrderData.StateReason.IDV_REVIEW_PENDING;
                case 23:
                    return CardOrderData.StateReason.IDV_REVIEW_FAILED;
                case 24:
                    return CardOrderData.StateReason.OUT_OF_STOCK;
                case 25:
                    return CardOrderData.StateReason.PENDING_ORDER_SUBMISSION;
                case 26:
                    return CardOrderData.StateReason.INCONSISTENT_SPONSOR_CARD_PRODUCT;
                case 27:
                    return CardOrderData.StateReason.INCONSISTENT_CARD_PRODUCT;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static InvestPaymentRenderData.RecipientData.Status m3957fromValue(int i) {
            switch (i) {
                case 1:
                    return InvestPaymentRenderData.RecipientData.Status.WAITING_ON_RECIPIENT;
                case 2:
                    return InvestPaymentRenderData.RecipientData.Status.ORDER_SCHEDULED;
                case 3:
                    return InvestPaymentRenderData.RecipientData.Status.ORDER_PLACED;
                case 4:
                    return InvestPaymentRenderData.RecipientData.Status.COMPLETE;
                case 5:
                    return InvestPaymentRenderData.RecipientData.Status.DECLINED_TO_REFUND;
                case 6:
                    return InvestPaymentRenderData.RecipientData.Status.EXPIRED;
                case 7:
                    return InvestPaymentRenderData.RecipientData.Status.BROKER_REVIEW_FAILED;
                case 8:
                    return InvestPaymentRenderData.RecipientData.Status.WAITING_ON_BROKER_REVIEW;
                case 9:
                    return InvestPaymentRenderData.RecipientData.Status.CASH_IN_COMPLETE;
                case 10:
                    return InvestPaymentRenderData.RecipientData.Status.REFUNDED;
                case 11:
                    return InvestPaymentRenderData.RecipientData.Status.WAITING_ON_CASH_IN;
                case 12:
                    return InvestPaymentRenderData.RecipientData.Status.WAITING_ON_P2P_CORE;
                case 13:
                    return InvestPaymentRenderData.RecipientData.Status.CANCELED;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static LendingRenderData.Type m3958fromValue(int i) {
            switch (i) {
                case 1:
                    return LendingRenderData.Type.LOAN_CREATION;
                case 2:
                    return LendingRenderData.Type.SCHEDULED_PAYMENT;
                case 3:
                    return LendingRenderData.Type.SKIPPED_PAYMENT;
                case 4:
                    return LendingRenderData.Type.COMPLETED_PAYMENT;
                case 5:
                    return LendingRenderData.Type.MISSED_PAYMENT;
                case 6:
                    return LendingRenderData.Type.OVERDUE_PAYMENT;
                case 7:
                    return LendingRenderData.Type.INTEREST_CHARGE;
                case 8:
                    return LendingRenderData.Type.REFUND;
                case 9:
                    return LendingRenderData.Type.ADJUSTMENT;
                case 10:
                    return LendingRenderData.Type.PARTIAL_PAYMENT;
                case 11:
                    return LendingRenderData.Type.LATE_FEE;
                default:
                    return null;
            }
        }

        public static DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason fromValue(int i) {
            if (i != 20) {
                switch (i) {
                    case 1:
                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.TRANSACTION_AUTHORIZED_BY_YOU;
                    case 2:
                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.TRANSACTION_PROCESSED_PROPERLY;
                    case 3:
                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.MERCHANT_FULFILLED_OBLIGATIONS;
                    case 4:
                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.ATM_DISPENSED_PROPERLY;
                    case 5:
                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CORRECT_NON_REFUND;
                    case 6:
                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CANCELED_DUE_TO_MERCHANT_REFUND;
                    case 7:
                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.WITHDRAWN_BY_YOU;
                    case 8:
                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.TERMS_OF_SERVICE_TIMEFRAME_EXCEEDED_FRAUD;
                    case 9:
                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.TERMS_OF_SERVICE_TIMEFRAME_EXCEEDED_NON_FRAUD;
                    default:
                        switch (i) {
                            case 28:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.FRAUD_60_DAY_P2P;
                            case 29:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.AUTHORIZED_USER_P2P;
                            case 30:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CHARGEBACK_ACCEPTED_P2P;
                            case 31:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CHARGEBACK_PENDING_P2P;
                            case 32:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CLAIM_WITHDRAWN_P2P;
                            case 33:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.DEVICE_ACTIVITY_P2P;
                            case 34:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.DEVICE_IN_POSSESSION_P2P;
                            case 35:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.MATCHING_FUNDS_P2P;
                            case 36:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.PIN_USAGE_P2P;
                            case 37:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SUBSEQUENT_ACTIVITY_P2P;
                            case 38:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.USER_ERROR_P2P;
                            case 39:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.DISPUTE_ABUSE_VIRAL_SCAM;
                            case 40:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.IDENTITY_VERIFICATION_FAILED;
                            case 41:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.IDENTITY_VERIFICATION_TIMED_OUT;
                            case 42:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.GOODS_OR_SERVICES_NOT_RECEIVED;
                            case 43:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CUSTOMER_AUTHENTICATED_TRANSACTION;
                            case 44:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.MERCHANT_REFUND;
                            case 45:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.DUPLICATE_TRANSACTION;
                            case 46:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SPONSOR_IDENTITY_VERIFICATION_FAILED;
                            case 47:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SPONSOR_IDENTITY_VERIFICATION_TIMED_OUT;
                            case 48:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.FRAUDULENT_OR_FALSE_CLAIM_P2P;
                            case 49:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SEV_RESPONSE_GENERIC_0;
                            case 50:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SEV_RESPONSE_GENERIC_1;
                            case 51:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SEV_RESPONSE_GENERIC_2;
                            case 52:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SEV_RESPONSE_GENERIC_3;
                            case 53:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SEV_RESPONSE_GENERIC_4;
                            case 54:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SEV_RESPONSE_GENERIC_5;
                            case 55:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SEV_RESPONSE_GENERIC_6;
                            case 56:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SEV_RESPONSE_GENERIC_7;
                            case 57:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SEV_RESPONSE_GENERIC_8;
                            case 58:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SEV_RESPONSE_GENERIC_9;
                            case 59:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SEV_RESPONSE_GENERIC_P2P_0;
                            case 60:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SEV_RESPONSE_GENERIC_P2P_1;
                            case 61:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SEV_RESPONSE_GENERIC_P2P_2;
                            case 62:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SEV_RESPONSE_GENERIC_P2P_3;
                            case 63:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SEV_RESPONSE_GENERIC_P2P_4;
                            case 64:
                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SEV_RESPONSE_GENERIC_P2P_5;
                            default:
                                switch (i) {
                                    case 66:
                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CONFLICTING_SUBMISSION;
                                    case 67:
                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CONFLICTING_TIMEFRAME;
                                    case 68:
                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.MATCHING_ACCOUNT;
                                    case 69:
                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.RECIPIENT_RELATIONSHIP;
                                    case 70:
                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.REFUND_EVIDENCE;
                                    case 71:
                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.RETURNED_FUNDS;
                                    case 72:
                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.AUTHORIZED_PAYMENT;
                                    default:
                                        switch (i) {
                                            case 74:
                                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SCAM_INSUFFICIENT_EVIDENCE;
                                            case 75:
                                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SCAM_EVIDENCE_AGAINST;
                                            case 76:
                                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SCAM_FRAUDULENT_OR_FALSE_CLAIM;
                                            case 77:
                                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SCAM_USER_ERROR;
                                            case 78:
                                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SCAM_CLAIM_WITHDRAWN;
                                            case 79:
                                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SCAM_OUTSIDE_OF_REPORT_WINDOW_TIMEFRAME;
                                            case 80:
                                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SCAM_CUSTOMER_WAS_WARNED_OF_POTENTIAL_SCAM;
                                            case 81:
                                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SCAM_PRIOR_BLOCKS;
                                            case 82:
                                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SCAM_TERMS_OF_SERVICE_VIOLATION;
                                            case 83:
                                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SCAM_ALREADY_REFUNDED;
                                            case 84:
                                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SCAM_OVER_REIMBURSEMENT_THRESHOLD;
                                            case 85:
                                                return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SCAM_NOT_COVERED_IN_POLICY;
                                            default:
                                                switch (i) {
                                                    case 87:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.POSSESSION_TIMEFRAME;
                                                    case 88:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.RECIPIENT_REIMBURSEMENT;
                                                    case 89:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CONTRADICTING_RESUBMISSION_DETAILS;
                                                    case 90:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SHARED_IDENTITY;
                                                    case 91:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.INCONSISTENT_RECOVERY_NARRATIVE;
                                                    case 92:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SUBSEQUENT_DEVICE_ACTIVITY;
                                                    case 93:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SECURITY_LOCK;
                                                    case 94:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.DISPUTE_ABUSE_P2P;
                                                    case 95:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CAP_AUTHORIZED_USER;
                                                    case 96:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CAP_CONTRADICTING_RESUBMISSION_DETAILS;
                                                    case 97:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CAP_DEVICE_IN_POSSESSION;
                                                    case 98:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CAP_SHARED_IDENTITY;
                                                    case 99:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CAP_INCONSISTENT_RECOVERY_NARRATIVE;
                                                    case 100:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CAP_POSSESSION_TIMEFRAME;
                                                    case 101:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CAP_SECURITY_LOCK;
                                                    case 102:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CAP_USER_ERROR;
                                                    case 103:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CAP_DISPUTE_ABUSE;
                                                    case 104:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CAP_FRAUD_60_DAY;
                                                    case 105:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CAP_CLAIM_WITHDRAWN;
                                                    case 106:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CAP_CHARGEBACK_ACCEPTED;
                                                    case 107:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CAP_MERCHANT_REFUND;
                                                    case 108:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CAP_CONFLICTING_SUBMISSION;
                                                    case 109:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CAP_CONFLICTING_TIMEFRAME;
                                                    case 110:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CAP_RETURNED_FUNDS;
                                                    case 111:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CAP_REFUND_EVIDENCE;
                                                    case 112:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.CAP_ALREADY_CORRECTED_MERCHANT_REFUND;
                                                    case 113:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SCAM_CLAIM_ABUSE;
                                                    case 114:
                                                        return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.SCAM_NOT_A_SCAM;
                                                    default:
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
            }
            return DisputedTransactionRenderData.DisputedCapture.DisputeCase.DenialReason.DISPUTE_ABUSE;
        }
    }
}

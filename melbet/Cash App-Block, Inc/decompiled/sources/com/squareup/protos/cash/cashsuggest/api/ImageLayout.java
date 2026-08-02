package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.cashliteorchestrator.api.v1.OperationFailureReason;
import com.squareup.protos.cash.cashstorefronts.api.IdentifierType;
import com.squareup.protos.cash.commerce.CommerceOrderRenderData;
import com.squareup.protos.cash.deviceintegritly.api.PlayIntegrityVerdict;
import com.squareup.protos.cash.discover.api.app.v1.model.DisplayCriteria;
import com.squareup.protos.cash.discover.api.app.v1.model.TextStyle;
import com.squareup.protos.cash.disputron.core.DisputeClaim$Reason;
import com.squareup.protos.cash.genericelements.ui.SemanticBackgroundColor;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum ImageLayout implements WireEnum {
    VERTICAL_RECTANGLE(0),
    HORIZONTAL_RECTANGLE(1);

    public static final ImageLayout$Companion$ADAPTER$1 ADAPTER;
    public static final Companion Companion;
    public final int value;

    static {
        ImageLayout imageLayout = VERTICAL_RECTANGLE;
        Companion = new Companion();
        ADAPTER = new ImageLayout$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ImageLayout.class), Syntax.PROTO_2, imageLayout);
    }

    ImageLayout(int i) {
        this.value = i;
    }

    public static final ImageLayout fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return VERTICAL_RECTANGLE;
        }
        if (i != 1) {
            return null;
        }
        return HORIZONTAL_RECTANGLE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    public final class Companion {
        /* renamed from: fromValue, reason: collision with other method in class */
        public static DisputeClaim$Reason m3847fromValue(int i) {
            switch (i) {
                case 0:
                    return DisputeClaim$Reason.UNKNOWN_REASON;
                case 1:
                    return DisputeClaim$Reason.DID_NOT_MAKE_TRANSACTION;
                case 2:
                    return DisputeClaim$Reason.CHARGED_WRONG_AMOUNT;
                case 3:
                    return DisputeClaim$Reason.PAID_BY_OTHER_MEANS;
                case 4:
                    return DisputeClaim$Reason.DUPLICATE_TRANSACTION;
                case 5:
                    return DisputeClaim$Reason.PAYMENT_FOR_CANCELLED_SERVICE;
                case 6:
                    return DisputeClaim$Reason.GOODS_OR_SERVICES_NOT_RECEIVED;
                case 7:
                    return DisputeClaim$Reason.GOODS_OR_SERVICES_NOT_AS_DESCRIBED;
                case 8:
                    return DisputeClaim$Reason.EXPECTED_REFUND;
                case 9:
                    return DisputeClaim$Reason.ATM_WITHDRAWAL_ERROR;
                case 10:
                    return DisputeClaim$Reason.SENT_TO_WRONG_PERSON;
                case 11:
                    return DisputeClaim$Reason.MISSING_FROM_STATEMENT;
                case 12:
                    return DisputeClaim$Reason.UNRECOGNISED_OR_UNAUTHORIZED_TRANSACTION;
                case 13:
                    return DisputeClaim$Reason.ISSUE_WITH_GOODS_OR_SERVICES;
                case 14:
                    return DisputeClaim$Reason.SCAMMED;
                case 15:
                    return DisputeClaim$Reason.DEVICE_LOST_OR_STOLEN;
                case 16:
                    return DisputeClaim$Reason.ACCOUNT_HACKED;
                case 17:
                    return DisputeClaim$Reason.SOMETHING_ELSE;
                case 18:
                    return DisputeClaim$Reason.CASH_APP_PAY_NO_KNOWLEDGE;
                case 19:
                    return DisputeClaim$Reason.CASH_APP_PAY_NO_KNOWLEDGE_MERCHANT_LIABLE;
                case 20:
                    return DisputeClaim$Reason.CASH_APP_PAY_DUPLICATE;
                case 21:
                    return DisputeClaim$Reason.CASH_APP_PAY_AMOUNT_DIFFERS;
                case 22:
                    return DisputeClaim$Reason.CASH_APP_PAY_PAID_BY_OTHER_MEANS;
                case 23:
                    return DisputeClaim$Reason.CASH_APP_PAY_CANCELLED;
                case 24:
                    return DisputeClaim$Reason.CASH_APP_PAY_NOT_AS_DESCRIBED;
                case 25:
                    return DisputeClaim$Reason.CASH_APP_PAY_NOT_RECEIVED;
                case 26:
                    return DisputeClaim$Reason.CASH_APP_PAY_CUSTOMER_REQUESTS_CREDIT;
                case 27:
                    return DisputeClaim$Reason.P2P_AUTHORIZED_OTHER;
                case 28:
                    return DisputeClaim$Reason.P2P_UNAUTHORIZED_OTHER;
                case 29:
                    return DisputeClaim$Reason.MADE_UNDER_DURESS;
                case 30:
                    return DisputeClaim$Reason.MISDIRECTED_PAYMENT;
                case 31:
                    return DisputeClaim$Reason.APPEAL_DEFAULT;
                case 32:
                    return DisputeClaim$Reason.CAC_APPEAL_DEFAULT;
                case 33:
                    return DisputeClaim$Reason.ACH_GOODS_OR_SERVICES_NOT_RECEIVED;
                case 34:
                    return DisputeClaim$Reason.ACH_GOODS_OR_SERVICES_NOT_AS_DESCRIBED;
                case 35:
                    return DisputeClaim$Reason.ACH_PAID_BY_OTHER_MEANS;
                case 36:
                    return DisputeClaim$Reason.ACH_DUPLICATE_TRANSACTION;
                case 37:
                    return DisputeClaim$Reason.ACH_CHARGED_WRONG_AMOUNT;
                case 38:
                    return DisputeClaim$Reason.ACH_PAYMENT_FOR_CANCELLED_SERVICE;
                case 39:
                    return DisputeClaim$Reason.ACH_EXPECTED_REFUND;
                case 40:
                    return DisputeClaim$Reason.ACH_DID_NOT_MAKE_TRANSACTION;
                case 41:
                    return DisputeClaim$Reason.ACH_DEBITED_BEFORE_DATE_AUTHORIZED;
                case 42:
                    return DisputeClaim$Reason.ACH_MERCHANT_DID_NOT_RECEIVE_OR_LOCATE_PAYMENT;
                case 43:
                    return DisputeClaim$Reason.ACH_TRANSACTION_MISSING_FROM_STATEMENT;
                case 44:
                    return DisputeClaim$Reason.ACH_UNKNOWN_DEPOSIT;
                case 45:
                case 46:
                case 87:
                default:
                    return null;
                case 47:
                    return DisputeClaim$Reason.ACH_CHECK_PROCESSED_ELECTRONICALLY;
                case 48:
                    return DisputeClaim$Reason.ATO_GROUP;
                case 49:
                    return DisputeClaim$Reason.ACH_THIRD_PARTY_FAILED_TO_MAKE_PAYMENT;
                case 50:
                    return DisputeClaim$Reason.ACH_PRIOR_RETURN_IMPROPERLY_REINITIATED;
                case 51:
                    return DisputeClaim$Reason.ACH_IMPROPER_REVERSAL;
                case 52:
                    return DisputeClaim$Reason.DENYLIST_APPEAL_DEFAULT;
                case 53:
                    return DisputeClaim$Reason.PMD_INCORRECT_AMOUNT;
                case 54:
                    return DisputeClaim$Reason.PMD_UNKNOWN_DEPOSIT;
                case 55:
                    return DisputeClaim$Reason.PMD_MISSING_FROM_STATEMENT;
                case 56:
                    return DisputeClaim$Reason.CASH_IN_DID_NOT_MAKE_TRANSACTION;
                case 57:
                    return DisputeClaim$Reason.CASH_OUT_DID_NOT_MAKE_TRANSACTION;
                case 58:
                    return DisputeClaim$Reason.BITCOIN_DID_NOT_MAKE_TRANSACTION;
                case 59:
                    return DisputeClaim$Reason.PMD_MISSING_DEPOSIT;
                case 60:
                    return DisputeClaim$Reason.CC_MISSING_FROM_STATEMENT;
                case 61:
                    return DisputeClaim$Reason.INCORRECT_BALANCE;
                case 62:
                    return DisputeClaim$Reason.AFTERPAY_NOT_ENABLED;
                case 63:
                    return DisputeClaim$Reason.STATEMENT_NOT_RECEIVED;
                case 64:
                    return DisputeClaim$Reason.PMD_FUNDS_NOT_AVAILABLE;
                case 65:
                    return DisputeClaim$Reason.PAYMENT_NOT_REFLECTED;
                case 66:
                    return DisputeClaim$Reason.INCORRECT_FEE_CHARGED;
                case 67:
                    return DisputeClaim$Reason.PMD_INCORRECT_FEE_CHARGED;
                case 68:
                    return DisputeClaim$Reason.CASH_IN_INCORRECT_AMOUNT;
                case 69:
                    return DisputeClaim$Reason.CASH_IN_MISSING_FROM_STATEMENT;
                case 70:
                    return DisputeClaim$Reason.CASH_IN_DUPLICATE_TRANSACTION;
                case 71:
                    return DisputeClaim$Reason.CASH_IN_FUNDS_NOT_AVAILABLE;
                case 72:
                    return DisputeClaim$Reason.CASH_OUT_INCORRECT_AMOUNT;
                case 73:
                    return DisputeClaim$Reason.CASH_OUT_MISSING_FROM_STATEMENT;
                case 74:
                    return DisputeClaim$Reason.CASH_OUT_DUPLICATE_TRANSACTION;
                case 75:
                    return DisputeClaim$Reason.CASH_IN_MISSING_DEPOSIT;
                case 76:
                    return DisputeClaim$Reason.CASH_OUT_MISSING_DEPOSIT;
                case 77:
                    return DisputeClaim$Reason.CASH_OUT_INCORRECT_FEE_CHARGED;
                case 78:
                    return DisputeClaim$Reason.CASH_IN_INCORRECT_FEE_CHARGED;
                case 79:
                    return DisputeClaim$Reason.PAYOUT_MISSING_DEPOSIT;
                case 80:
                    return DisputeClaim$Reason.PAYOUT_INCORRECT_AMOUNT;
                case 81:
                    return DisputeClaim$Reason.INCORRECT_LOAN_BALANCE;
                case 82:
                    return DisputeClaim$Reason.P2P_STABLECOIN_INCORRECT_AMOUNT;
                case 83:
                    return DisputeClaim$Reason.P2P_STABLECOIN_DATE_OF_AVAILABILITY_ERROR;
                case 84:
                    return DisputeClaim$Reason.P2P_STABLECOIN_DID_NOT_MAKE_TRANSACTION;
                case 85:
                    return DisputeClaim$Reason.P2P_STABLECOIN_MISSING_FROM_STATEMENT;
                case 86:
                    return DisputeClaim$Reason.P2P_STABLECOIN_DUPLICATE_TRANSACTION;
                case 88:
                    return DisputeClaim$Reason.CASH_APP_PAY_APPEAL_DEFAULT;
                case 89:
                    return DisputeClaim$Reason.ACH_MISSING_DEPOSIT;
                case 90:
                    return DisputeClaim$Reason.MISSING_DEPOSIT;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static SemanticBackgroundColor m3848fromValue(int i) {
            switch (i) {
                case 1:
                    return SemanticBackgroundColor.BACKGROUND_APP;
                case 2:
                    return SemanticBackgroundColor.BACKGROUND_BITCOIN;
                case 3:
                    return SemanticBackgroundColor.BACKGROUND_BRAND;
                case 4:
                    return SemanticBackgroundColor.BACKGROUND_DANGER;
                case 5:
                    return SemanticBackgroundColor.BACKGROUND_DIMMER;
                case 6:
                    return SemanticBackgroundColor.BACKGROUND_EXTRA_PROMINENT;
                case 7:
                    return SemanticBackgroundColor.BACKGROUND_NOTIFICATION;
                case 8:
                    return SemanticBackgroundColor.BACKGROUND_PROMINENT;
                case 9:
                    return SemanticBackgroundColor.BACKGROUND_STANDARD;
                case 10:
                    return SemanticBackgroundColor.BACKGROUND_SUBTLE;
                case 11:
                    return SemanticBackgroundColor.BACKGROUND_WARNING;
                default:
                    return null;
            }
        }

        public static OperationFailureReason fromValue(int i) {
            switch (i) {
                case 0:
                    return OperationFailureReason.OPERATION_FAILURE_REASON_UNSPECIFIED;
                case 1:
                    return OperationFailureReason.OPERATION_FAILURE_REASON_USEROP_REVERTED;
                case 2:
                    return OperationFailureReason.OPERATION_FAILURE_REASON_RELAY_TIMEOUT;
                case 3:
                    return OperationFailureReason.OPERATION_FAILURE_REASON_ATTESTATION_FAILED;
                case 4:
                    return OperationFailureReason.OPERATION_FAILURE_REASON_BRIDGE_UNAVAILABLE;
                case 5:
                    return OperationFailureReason.OPERATION_FAILURE_REASON_EXPIRED;
                case 6:
                    return OperationFailureReason.OPERATION_FAILURE_REASON_USEROP_TIMEOUT;
                case 7:
                    return OperationFailureReason.OPERATION_FAILURE_REASON_RELAY_REVERTED;
                case 8:
                    return OperationFailureReason.OPERATION_FAILURE_REASON_RELAY_SUBMISSION_FAILED;
                case 9:
                    return OperationFailureReason.OPERATION_FAILURE_REASON_SWAP_FAILED;
                case 10:
                    return OperationFailureReason.OPERATION_FAILURE_REASON_SWAP_REFUNDED;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static IdentifierType m3842fromValue(int i) {
            if (i == 0) {
                return IdentifierType.IDENTIFIER_TYPE_UNKNOWN;
            }
            if (i == 20) {
                return IdentifierType.IDENTIFIER_TYPE_OFFER_OFFERLY;
            }
            if (i != 21) {
                switch (i) {
                    case 10:
                        return IdentifierType.IDENTIFIER_TYPE_BUSINESS_PROFILE;
                    case 11:
                        return IdentifierType.IDENTIFIER_TYPE_BUSINESS_MERCHANTEIN_PARENT;
                    case 12:
                        return IdentifierType.IDENTIFIER_TYPE_BUSINESS_CASH_APP_PAY;
                    case 13:
                        return IdentifierType.IDENTIFIER_TYPE_BUSINESS_BRAND;
                    case 14:
                        return IdentifierType.IDENTIFIER_TYPE_SQUARE_MERCHANT;
                    default:
                        return null;
                }
            }
            return IdentifierType.IDENTIFIER_TYPE_OFFER_BOOST;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static TextStyle m3846fromValue(int i) {
            switch (i) {
                case 1:
                    return TextStyle.BIG_MONEY;
                case 2:
                    return TextStyle.HEADER_1;
                case 3:
                    return TextStyle.HEADER_2;
                case 4:
                    return TextStyle.HEADER_3;
                case 5:
                    return TextStyle.HEADER_4;
                case 6:
                    return TextStyle.INPUT;
                case 7:
                    return TextStyle.MAIN_TITLE;
                case 8:
                    return TextStyle.MAIN_BODY;
                case 9:
                    return TextStyle.SMALL_TITLE;
                case 10:
                    return TextStyle.SMALL_BODY;
                case 11:
                    return TextStyle.STRONG_CAPTION;
                case 12:
                    return TextStyle.CAPTION;
                case 13:
                    return TextStyle.IDENTIFIER;
                case 14:
                    return TextStyle.ARCADE_KEYPAD_TOTAL;
                case 15:
                    return TextStyle.ARCADE_HERO_NUMERICS;
                case 16:
                    return TextStyle.ARCADE_HERO;
                case 17:
                    return TextStyle.ARCADE_HEADER;
                case 18:
                    return TextStyle.ARCADE_KEYPAD_NUMBERS;
                case 19:
                    return TextStyle.ARCADE_LARGE_LABEL;
                case 20:
                    return TextStyle.ARCADE_TAB_TITLE;
                case 21:
                    return TextStyle.ARCADE_SECTION_TITLE;
                case 22:
                    return TextStyle.ARCADE_PAGE_TITLE;
                case 23:
                    return TextStyle.ARCADE_LABEL;
                case 24:
                    return TextStyle.ARCADE_BODY;
                case 25:
                    return TextStyle.ARCADE_INPUT;
                case 26:
                    return TextStyle.ARCADE_BUTTON;
                case 27:
                    return TextStyle.ARCADE_COMPACT_BUTTON;
                case 28:
                    return TextStyle.ARCADE_CELL_BODY;
                case 29:
                    return TextStyle.ARCADE_HELP_TEXT;
                case 30:
                    return TextStyle.ARCADE_DISCLAIMER;
                case 31:
                    return TextStyle.ARCADE_META_TEXT;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static DisplayCriteria m3845fromValue(int i) {
            if (i == 0) {
                return DisplayCriteria.ONCE_PER_SECTION;
            }
            if (i == 1) {
                return DisplayCriteria.ALWAYS;
            }
            if (i != 2) {
                return null;
            }
            return DisplayCriteria.NEVER;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static CommerceOrderRenderData.Product m3843fromValue(int i) {
            switch (i) {
                case 0:
                    return CommerceOrderRenderData.Product.PRODUCT_UNKNOWN;
                case 1:
                    return CommerceOrderRenderData.Product.PRODUCT_CASH_APP_PAY;
                case 2:
                    return CommerceOrderRenderData.Product.PRODUCT_AFTERPAY_ONLINE_CHECKOUT;
                case 3:
                    return CommerceOrderRenderData.Product.PRODUCT_RETROACTIVE_FINANCING;
                case 4:
                    return CommerceOrderRenderData.Product.PRODUCT_CASH_APP_CARD;
                case 5:
                    return CommerceOrderRenderData.Product.PRODUCT_CASH_CARD_RETROACTIVE_FINANCING;
                case 6:
                    return CommerceOrderRenderData.Product.PRODUCT_AFTERPAY_PAY_IN_FOUR;
                case 7:
                    return CommerceOrderRenderData.Product.PRODUCT_AFTERPAY_PAY_NOW;
                case 8:
                    return CommerceOrderRenderData.Product.PRODUCT_AFTERPAY_PAY_MONTHLY;
                case 9:
                    return CommerceOrderRenderData.Product.PRODUCT_P2P_RETROACTIVE_FINANCING;
                case 10:
                    return CommerceOrderRenderData.Product.PRODUCT_PRE_PURCHASE_FINANCING;
                case 11:
                    return CommerceOrderRenderData.Product.PRODUCT_OTHER;
                case 12:
                    return CommerceOrderRenderData.Product.PRODUCT_CF_BNPL;
                case 13:
                    return CommerceOrderRenderData.Product.PRODUCT_SINGLE_USE_PAYMENT;
                case 14:
                    return CommerceOrderRenderData.Product.PRODUCT_PAYOUT;
                case 15:
                    return CommerceOrderRenderData.Product.PRODUCT_CASH_APP_PAY_RETROACTIVE_FINANCING;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static PlayIntegrityVerdict.DeviceRecognitionVerdict m3844fromValue(int i) {
            if (i == 1) {
                return PlayIntegrityVerdict.DeviceRecognitionVerdict.NO_LABEL;
            }
            if (i == 2) {
                return PlayIntegrityVerdict.DeviceRecognitionVerdict.MEETS_BASIC_INTEGRITY;
            }
            if (i == 3) {
                return PlayIntegrityVerdict.DeviceRecognitionVerdict.MEETS_DEVICE_INTEGRITY;
            }
            if (i == 4) {
                return PlayIntegrityVerdict.DeviceRecognitionVerdict.MEETS_STRONG_INTEGRITY;
            }
            if (i != 5) {
                return null;
            }
            return PlayIntegrityVerdict.DeviceRecognitionVerdict.INVALID_ATTESTATION;
        }
    }
}

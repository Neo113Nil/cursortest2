package com.squareup.protos.cash.compass.api;

import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import com.squareup.protos.cash.cashliteflow.blockers.v1.ApplePayPushProvisioningFailureReason;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.LightningInvoiceState;
import com.squareup.protos.cash.cashstorefronts.api.GetBusinessProfileRequest;
import com.squareup.protos.cash.clientsync.service.SyncTopic;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage;
import com.squareup.protos.cash.genericelements.ui.TextElement;
import com.squareup.protos.cash.grantly.api.DecisionMethod;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum RadioType implements WireEnum {
    RADIO_TYPE_UNKNOWN(0),
    RADIO_TYPE_GSM(1),
    RADIO_TYPE_CDMA(2),
    RADIO_TYPE_WCDMA(3),
    RADIO_TYPE_LTE(4),
    RADIO_TYPE_NR(5);

    public static final RadioType$Companion$ADAPTER$1 ADAPTER;
    public static final Companion Companion;
    public final int value;

    static {
        RadioType radioType = RADIO_TYPE_UNKNOWN;
        Companion = new Companion();
        ADAPTER = new RadioType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RadioType.class), Syntax.PROTO_2, radioType);
    }

    RadioType(int i) {
        this.value = i;
    }

    public static final RadioType fromValue(int i) {
        Companion.getClass();
        return Companion.m3853fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    public final class Companion {
        /* renamed from: fromValue, reason: collision with other method in class */
        public static SyncTopic m3852fromValue(int i) {
            switch (i) {
                case -1:
                    return SyncTopic.UNKNOWN;
                case 0:
                    return SyncTopic.FRANKLIN_PRIMARY;
                case 1:
                    return SyncTopic.CLIENTSYNC_PRIMARY;
                case 2:
                    return SyncTopic.SYNC_VALUES;
                case 3:
                    return SyncTopic.P2P_PAYMENTS;
                case 4:
                    return SyncTopic.P2P_PAYMENTS_MIGRATION;
                case 5:
                    return SyncTopic.TRANSACTION;
                case 6:
                    return SyncTopic.LENDING;
                case 7:
                case 21:
                case 30:
                default:
                    return null;
                case 8:
                    return SyncTopic.INVESTMENT_ENTITIES;
                case 9:
                    return SyncTopic.INVITATIONS;
                case 10:
                    return SyncTopic.RECURRING_PREFERENCES;
                case 11:
                    return SyncTopic.INVESTMENT_CATEGORIES;
                case 12:
                    return SyncTopic.ATM_PICKERS;
                case 13:
                    return SyncTopic.SPECIAL_CUSTOMERS;
                case 14:
                    return SyncTopic.TRANSACTION_V2;
                case 15:
                    return SyncTopic.INVESTMENT_CATEGORIES_ADVANCED;
                case 16:
                    return SyncTopic.INVESTMENT_INCENTIVES;
                case 17:
                    return SyncTopic.LOYALTY;
                case 18:
                    return SyncTopic.TRANSACTION_TIDB;
                case 19:
                    return SyncTopic.CLIENTSYNC_GLOBAL;
                case 20:
                    return SyncTopic.LOYALTY_ACTIVITIES;
                case 22:
                    return SyncTopic.COMPUTED_SYNC_VALUES;
                case 23:
                    return SyncTopic.REFERENCES;
                case 24:
                    return SyncTopic.ACTIVITY;
                case 25:
                    return SyncTopic.CASH_LOCAL;
                case 26:
                    return SyncTopic.NOTIFICATION_SETTINGS;
                case 27:
                    return SyncTopic.SUPPORT;
                case 28:
                    return SyncTopic.BITCOIN_PERFORMANCE;
                case 29:
                    return SyncTopic.ELIGIBILITY_REFRESH;
                case 31:
                    return SyncTopic.CASH_APP_CARD;
                case 32:
                    return SyncTopic.CASH_SHOPPING;
                case 33:
                    return SyncTopic.CASH_O_CLOCK;
                case 34:
                    return SyncTopic.PAYCHECKS;
                case 35:
                    return SyncTopic.CASH_GREEN;
                case 36:
                    return SyncTopic.LYNX_INSTRUMENTS;
                case 37:
                    return SyncTopic.CASH_CREDIT_SCORE;
                case 38:
                    return SyncTopic.CLIENT_SYNC_CONFIG;
                case 39:
                    return SyncTopic.ACCOUNT_SUSPENSION;
                case 40:
                    return SyncTopic.BADGING;
                case 41:
                    return SyncTopic.MONEYBOT;
                case 42:
                    return SyncTopic.CARD_UI_CONFIG;
                case 43:
                    return SyncTopic.RESTRICTIONS;
                case 44:
                    return SyncTopic.ADVERSITY_BANNER;
                case 45:
                    return SyncTopic.CASH_DDA;
                case 46:
                    return SyncTopic.CASH_APP_TAG;
                case 47:
                    return SyncTopic.RECIPIENT_SUGGESTIONS;
                case 48:
                    return SyncTopic.EARNINGS;
                case 49:
                    return SyncTopic.CASH_FOR_WORK_APPLET;
                case 50:
                    return SyncTopic.CASH_LITE_CARD_UI_CONFIG;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static RadioType m3853fromValue(int i) {
            if (i == 0) {
                return RadioType.RADIO_TYPE_UNKNOWN;
            }
            if (i == 1) {
                return RadioType.RADIO_TYPE_GSM;
            }
            if (i == 2) {
                return RadioType.RADIO_TYPE_CDMA;
            }
            if (i == 3) {
                return RadioType.RADIO_TYPE_WCDMA;
            }
            if (i == 4) {
                return RadioType.RADIO_TYPE_LTE;
            }
            if (i != 5) {
                return null;
            }
            return RadioType.RADIO_TYPE_NR;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static ApplePayPushProvisioningFailureReason m3849fromValue(int i) {
            if (i == 0) {
                return ApplePayPushProvisioningFailureReason.APPLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_UNSPECIFIED;
            }
            if (i == 1) {
                return ApplePayPushProvisioningFailureReason.APPLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_UNKNOWN_ERROR;
            }
            if (i == 2) {
                return ApplePayPushProvisioningFailureReason.APPLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_INVALID_DATA_ERROR;
            }
            if (i == 3) {
                return ApplePayPushProvisioningFailureReason.APPLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_UNSUPPORTED_VERSION_ERROR;
            }
            if (i == 4) {
                return ApplePayPushProvisioningFailureReason.APPLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_INVALID_SIGNATURE;
            }
            if (i != 5) {
                return null;
            }
            return ApplePayPushProvisioningFailureReason.APPLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_NOT_ENTITLED_ERROR;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static DecisionMethod m3856fromValue(int i) {
            switch (i) {
                case 1:
                    return DecisionMethod.MOBILE_REDIRECT;
                case 2:
                    return DecisionMethod.CASH_QR_CODE_SCAN;
                case 3:
                    return DecisionMethod.NATIVE_QR_CODE_SCAN;
                case 4:
                    return DecisionMethod.QR_CODE_PRESENT;
                case 5:
                    return DecisionMethod.INTERNAL_API;
                case 6:
                    return DecisionMethod.WEB_CHECKOUT;
                case 7:
                    return DecisionMethod.NATIVE_MOBILE_CASH_APP;
                case 8:
                    return DecisionMethod.ANDROID_ACTIVITY;
                case 9:
                    return DecisionMethod.WEB_LOGIN;
                case 10:
                    return DecisionMethod.PUBLIC_API;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static LightningInvoiceState m3850fromValue(int i) {
            if (i == 0) {
                return LightningInvoiceState.LIGHTNING_INVOICE_STATE_UNSPECIFIED;
            }
            if (i == 1) {
                return LightningInvoiceState.LIGHTNING_INVOICE_STATE_REQUESTED;
            }
            if (i == 2) {
                return LightningInvoiceState.LIGHTNING_INVOICE_STATE_CREATED;
            }
            if (i == 3) {
                return LightningInvoiceState.LIGHTNING_INVOICE_STATE_FAILED;
            }
            if (i != 4) {
                return null;
            }
            return LightningInvoiceState.LIGHTNING_INVOICE_STATE_EXPIRED;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static GetBusinessProfileRequest.ProfileField m3851fromValue(int i) {
            if (i == 0) {
                return GetBusinessProfileRequest.ProfileField.UNKNOWN_FIELD;
            }
            if (i == 1) {
                return GetBusinessProfileRequest.ProfileField.BUSINESS_STATUSES;
            }
            if (i == 2) {
                return GetBusinessProfileRequest.ProfileField.FEATURES;
            }
            if (i == 3) {
                return GetBusinessProfileRequest.ProfileField.BUSINESS_METADATA;
            }
            if (i != 4) {
                return null;
            }
            return GetBusinessProfileRequest.ProfileField.IMAGE_ASSETS;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static TextElement.Style m3855fromValue(int i) {
            switch (i) {
                case 1:
                    return TextElement.Style.BIO;
                case 2:
                    return TextElement.Style.BIG_MONEY;
                case 3:
                    return TextElement.Style.HEADER_1;
                case 4:
                    return TextElement.Style.HEADER_2;
                case 5:
                    return TextElement.Style.HEADER_3;
                case 6:
                    return TextElement.Style.HEADER_4;
                case 7:
                    return TextElement.Style.INPUT;
                case 8:
                    return TextElement.Style.MAIN_TITLE;
                case 9:
                    return TextElement.Style.MAIN_BODY;
                case 10:
                    return TextElement.Style.SMALL_TITLE;
                case 11:
                    return TextElement.Style.SMALL_BODY;
                case 12:
                    return TextElement.Style.SMALL_BODY_ITALIC;
                case 13:
                    return TextElement.Style.STRONG_CAPTION;
                case 14:
                    return TextElement.Style.CAPTION;
                case 15:
                    return TextElement.Style.IDENTIFIER;
                case 16:
                    return TextElement.Style.SMALL_CAPTION;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static DetailsPage.TextPlacement m3854fromValue(int i) {
            if (i == 0) {
                return DetailsPage.TextPlacement.TEXT_PLACEMENT_UNSPECIFIED;
            }
            if (i == 1) {
                return DetailsPage.TextPlacement.TEXT_PLACEMENT_TOP_LEFT;
            }
            if (i == 2) {
                return DetailsPage.TextPlacement.TEXT_PLACEMENT_MIDDLE_LEFT;
            }
            if (i == 3) {
                return DetailsPage.TextPlacement.TEXT_PLACEMENT_BOTTOM_LEFT;
            }
            if (i != 4) {
                return null;
            }
            return DetailsPage.TextPlacement.TEXT_PLACEMENT_TOP_CENTER;
        }

        public static GetCustomerLimitsResponse.LimitsSection.SectionType fromValue(int i) {
            if (i == 0) {
                return GetCustomerLimitsResponse.LimitsSection.SectionType.SECTION_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return GetCustomerLimitsResponse.LimitsSection.SectionType.SECTION_TYPE_SEND_AND_RECEIVE;
            }
            if (i == 2) {
                return GetCustomerLimitsResponse.LimitsSection.SectionType.SECTION_TYPE_DEPOSIT_AND_WITHDRAW;
            }
            if (i == 3) {
                return GetCustomerLimitsResponse.LimitsSection.SectionType.SECTION_TYPE_CASH_CARD;
            }
            if (i == 4) {
                return GetCustomerLimitsResponse.LimitsSection.SectionType.SECTION_TYPE_BITCOIN;
            }
            if (i != 5) {
                return null;
            }
            return GetCustomerLimitsResponse.LimitsSection.SectionType.SECTION_TYPE_STOCKS;
        }
    }
}

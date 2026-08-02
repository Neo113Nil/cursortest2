package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import com.squareup.protos.cash.local.client.v1.RequiredInput;
import com.squareup.protos.cash.messagingplatformcommon.app.StatusResultMessage;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.cash.pay.CashAppPayDisputeRenderData;
import com.squareup.protos.cash.pay.CashAppPayRenderData;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum Origin implements WireEnum {
    UNSPECIFIED(1),
    FRANKLIN(2),
    INVEST_P2P(3),
    INVEST_CRYPTO(4),
    INVEST_SENSOR_CRYPTO(5),
    CASH_PROXY(6),
    BACKFILL(7),
    HUMAN_USER(9),
    INVEST_AUTOMATOR(10),
    CRYPTO_INVEST_FLOW(11),
    SQUARE_INVEST(12),
    BANKLIN(13),
    SHADOW(14),
    BTC_MOONGATE(15),
    CRYPTO_WALLET(16),
    CRYPTO_SPARKY(17),
    GPTSTORE(18),
    FIATLY(19),
    P2P_ENGINE(20),
    NACHO_CHIP_FACTORY(21);

    public final int value;
    public static final Companion Companion = new Companion();
    public static final Origin$Companion$ADAPTER$1 ADAPTER = new Origin$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Origin.class), Syntax.PROTO_2, null);

    Origin(int i) {
        this.value = i;
    }

    public static final Origin fromValue(int i) {
        Companion.getClass();
        return Companion.m3880fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    public final class Companion {
        /* renamed from: fromValue, reason: collision with other method in class */
        public static NotificationCategory m3886fromValue(int i) {
            if (i == 0) {
                return NotificationCategory.NOTIFICATION_CATEGORY_UNSPECIFIED;
            }
            if (i == 200) {
                return NotificationCategory.NOTIFICATION_CATEGORY_ACTIVITY_TRANSACTIONS;
            }
            if (i == 500) {
                return NotificationCategory.NOTIFICATION_CATEGORY_CASH_APP_TAXES;
            }
            if (i == 600) {
                return NotificationCategory.NOTIFICATION_CATEGORY_FAMILY;
            }
            if (i == 10) {
                return NotificationCategory.NOTIFICATION_CATEGORY_SPECIAL_SILENT_PUSH;
            }
            if (i == 11) {
                return NotificationCategory.NOTIFICATION_CATEGORY_SPECIAL_VOICE_CALL;
            }
            switch (i) {
                case 100:
                    return NotificationCategory.NOTIFICATION_CATEGORY_ACCOUNT_SECURITY;
                case 101:
                    return NotificationCategory.NOTIFICATION_CATEGORY_ACCOUNT_NOTICES;
                case 102:
                    return NotificationCategory.NOTIFICATION_CATEGORY_ACCOUNT_CHANGES;
                default:
                    switch (i) {
                        case SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE:
                            return NotificationCategory.NOTIFICATION_CATEGORY_INVESTING_OWNED_STOCK_PRICE_CHANGES;
                        case SDK_ASSET_CASH_ICON_CIRCLE_VALUE:
                            return NotificationCategory.NOTIFICATION_CATEGORY_INVESTING_OWNED_STOCK_EARNINGS_REPORTS;
                        case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE:
                            return NotificationCategory.NOTIFICATION_CATEGORY_INVESTING_FOLLOWED_STOCK_PRICE_CHANGES;
                        case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE:
                            return NotificationCategory.NOTIFICATION_CATEGORY_INVESTING_FOLLOWED_STOCK_EARNINGS_REPORTS;
                        case SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE:
                            return NotificationCategory.NOTIFICATION_CATEGORY_BITCOIN_PRICE_ALERTS;
                        default:
                            switch (i) {
                                case 400:
                                    return NotificationCategory.NOTIFICATION_CATEGORY_MARKETING_CASH_APP_NEWS;
                                case HttpStatusCode.UNAUTHORIZED_401 /* 401 */:
                                    return NotificationCategory.NOTIFICATION_CATEGORY_MARKETING_OFFERS;
                                case 402:
                                    return NotificationCategory.NOTIFICATION_CATEGORY_MARKETING_EXCLUSIVES;
                                case 403:
                                    return NotificationCategory.NOTIFICATION_CATEGORY_MARKETING_CASH_APP_LOCAL;
                                default:
                                    switch (i) {
                                        case 700:
                                            return NotificationCategory.NOTIFICATION_CATEGORY_MONEYBOT_ALERTS;
                                        case 701:
                                            return NotificationCategory.NOTIFICATION_CATEGORY_MONEYBOT_RECOMMENDATIONS;
                                        case 702:
                                            return NotificationCategory.NOTIFICATION_CATEGORY_MONEYBOT_PROGRESS_UPDATES;
                                        default:
                                            return null;
                                    }
                            }
                    }
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static Origin m3880fromValue(int i) {
            switch (i) {
                case 1:
                    return Origin.UNSPECIFIED;
                case 2:
                    return Origin.FRANKLIN;
                case 3:
                    return Origin.INVEST_P2P;
                case 4:
                    return Origin.INVEST_CRYPTO;
                case 5:
                    return Origin.INVEST_SENSOR_CRYPTO;
                case 6:
                    return Origin.CASH_PROXY;
                case 7:
                    return Origin.BACKFILL;
                case 8:
                default:
                    return null;
                case 9:
                    return Origin.HUMAN_USER;
                case 10:
                    return Origin.INVEST_AUTOMATOR;
                case 11:
                    return Origin.CRYPTO_INVEST_FLOW;
                case 12:
                    return Origin.SQUARE_INVEST;
                case 13:
                    return Origin.BANKLIN;
                case 14:
                    return Origin.SHADOW;
                case 15:
                    return Origin.BTC_MOONGATE;
                case 16:
                    return Origin.CRYPTO_WALLET;
                case 17:
                    return Origin.CRYPTO_SPARKY;
                case 18:
                    return Origin.GPTSTORE;
                case 19:
                    return Origin.FIATLY;
                case 20:
                    return Origin.P2P_ENGINE;
                case 21:
                    return Origin.NACHO_CHIP_FACTORY;
            }
        }

        public static OrderRejectionReason$Reason fromValue(int i) {
            switch (i) {
                case 1:
                    return OrderRejectionReason$Reason.INSUFFICIENT_FUNDS;
                case 2:
                    return OrderRejectionReason$Reason.INTERNAL_FAILURE;
                case 3:
                    return OrderRejectionReason$Reason.CUSTOM_ORDER_TYPE_CHANGED;
                case 4:
                    return OrderRejectionReason$Reason.ORDER_EXPIRED;
                case 5:
                    return OrderRejectionReason$Reason.LIMITS_EXCEEDED;
                case 6:
                    return OrderRejectionReason$Reason.RISK_FAILURE;
                case 7:
                    return OrderRejectionReason$Reason.CUSTOM_ORDER_LIMITS_EXCEEDED;
                case 8:
                    return OrderRejectionReason$Reason.CUSTOM_ORDER_INVALID_ORIGINAL_PRICE;
                case 9:
                    return OrderRejectionReason$Reason.CRYPTO_STORED_BALANCE_NOT_UNIQUE;
                case 10:
                    return OrderRejectionReason$Reason.INVALID_ORDER_STATE;
                case 11:
                    return OrderRejectionReason$Reason.DENYLISTED;
                case 12:
                    return OrderRejectionReason$Reason.DENYLISTED_TAX_B_NOTICE;
                case 13:
                    return OrderRejectionReason$Reason.ORDER_ABANDONED;
                case 14:
                    return OrderRejectionReason$Reason.CUSTOMER_REGION_NOT_AVAILABLE;
                case 15:
                    return OrderRejectionReason$Reason.CUSTOMER_CONTROL_DISABLED_BY_SPONSOR;
                case 16:
                    return OrderRejectionReason$Reason.DENYLISTED_TAX_B_NOTICE_ON_SPONSOR;
                case 17:
                    return OrderRejectionReason$Reason.INDETERMINATE_LEDGER_RESPONSE;
                case 18:
                    return OrderRejectionReason$Reason.ORDER_REJECTION_GENERIC_ERROR;
                case 19:
                    return OrderRejectionReason$Reason.TRADING_HALTED;
                case 20:
                    return OrderRejectionReason$Reason.ACCOUNT_FROZEN;
                case 21:
                    return OrderRejectionReason$Reason.ZERO_OR_NEGATIVE_AMOUNT;
                case 22:
                    return OrderRejectionReason$Reason.ACCOUNT_DENYLISTED;
                case 23:
                    return OrderRejectionReason$Reason.INCORRECT_FEATURE_METADATA;
                case 24:
                    return OrderRejectionReason$Reason.INVALID_MONEY_AMOUNT;
                case 25:
                    return OrderRejectionReason$Reason.CUSTOMER_ELIGIBILITY_VIOLATION;
                case 26:
                    return OrderRejectionReason$Reason.CASH_FOR_BUSINESS;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static RequiredInput.InputType m3884fromValue(int i) {
            if (i == 0) {
                return RequiredInput.InputType.INPUT_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return RequiredInput.InputType.INPUT_TYPE_TEXT;
            }
            if (i == 2) {
                return RequiredInput.InputType.INPUT_TYPE_PHONE;
            }
            if (i == 3) {
                return RequiredInput.InputType.INPUT_TYPE_APPOINTMENT_SLOT;
            }
            if (i == 4) {
                return RequiredInput.InputType.INPUT_TYPE_ADDRESS;
            }
            if (i != 5) {
                return null;
            }
            return RequiredInput.InputType.INPUT_TYPE_OPTION_PICKER;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static StatusResultMessage.Placement m3885fromValue(int i) {
            if (i == 1) {
                return StatusResultMessage.Placement.CASH_IN_SUCCESS;
            }
            if (i == 2) {
                return StatusResultMessage.Placement.CASH_IN_FAILURE;
            }
            if (i == 3) {
                return StatusResultMessage.Placement.CASH_OUT_SUCCESS;
            }
            if (i == 4) {
                return StatusResultMessage.Placement.ISSUED_CARD_ACTIVATED_PHYSICAL_CARD_REQUESTED;
            }
            if (i != 5) {
                return null;
            }
            return StatusResultMessage.Placement.PHYSICAL_CARD_REQUEST_SUCCESS;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static CashAppPayDisputeRenderData.DisputeState m3887fromValue(int i) {
            if (i == 0) {
                return CashAppPayDisputeRenderData.DisputeState.UNKNOWN_DISPUTE_STATE;
            }
            if (i == 1) {
                return CashAppPayDisputeRenderData.DisputeState.PENDING_RESPONDENT_ACTION_DISPUTE_STATE;
            }
            if (i == 2) {
                return CashAppPayDisputeRenderData.DisputeState.PENDING_DECISION_DISPUTE_STATE;
            }
            if (i == 3) {
                return CashAppPayDisputeRenderData.DisputeState.RATIFIED_DISPUTE_STATE;
            }
            if (i == 4) {
                return CashAppPayDisputeRenderData.DisputeState.REJECTED_DISPUTE_STATE;
            }
            if (i != 5) {
                return null;
            }
            return CashAppPayDisputeRenderData.DisputeState.WRITE_OFF_DISPUTE_STATE;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static LocalProfileWidget.Type m3883fromValue(int i) {
            switch (i) {
                case 0:
                    return LocalProfileWidget.Type.TYPE_UNSPECIFIED;
                case 1:
                    return LocalProfileWidget.Type.TYPE_ORDERING_REORDERING;
                case 2:
                    return LocalProfileWidget.Type.TYPE_ORDERING_MENUS;
                case 3:
                    return LocalProfileWidget.Type.TYPE_BOOKING_REBOOKING;
                case 4:
                    return LocalProfileWidget.Type.TYPE_BOOKING_SERVICES;
                case 5:
                    return LocalProfileWidget.Type.TYPE_BOOKING_TEAM_MEMBERS;
                case 6:
                    return LocalProfileWidget.Type.TYPE_ABOUT;
                case 7:
                    return LocalProfileWidget.Type.TYPE_POLICIES;
                case 8:
                    return LocalProfileWidget.Type.TYPE_HOURS;
                case 9:
                    return LocalProfileWidget.Type.TYPE_CONTACT;
                case 10:
                    return LocalProfileWidget.Type.TYPE_LINKS;
                case 11:
                    return LocalProfileWidget.Type.TYPE_RETAIL;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static CashAppPayRenderData.Dispute.State m3888fromValue(int i) {
            if (i == 0) {
                return CashAppPayRenderData.Dispute.State.UNKNOWN_STATE;
            }
            if (i == 1) {
                return CashAppPayRenderData.Dispute.State.PENDING_RESPONDENT_ACTION;
            }
            if (i == 2) {
                return CashAppPayRenderData.Dispute.State.PENDING_DECISION;
            }
            if (i == 3) {
                return CashAppPayRenderData.Dispute.State.RATIFIED;
            }
            if (i == 4) {
                return CashAppPayRenderData.Dispute.State.REJECTED;
            }
            if (i != 5) {
                return null;
            }
            return CashAppPayRenderData.Dispute.State.WRITE_OFF;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static CashAppLocalOrderRenderData.AdjustmentLine.Type m3881fromValue(int i) {
            switch (i) {
                case 0:
                    return CashAppLocalOrderRenderData.AdjustmentLine.Type.TYPE_UNSPECIFIED;
                case 1:
                    return CashAppLocalOrderRenderData.AdjustmentLine.Type.TYPE_DELIVERY_FEE;
                case 2:
                    return CashAppLocalOrderRenderData.AdjustmentLine.Type.TYPE_SERVICE_FEE;
                case 3:
                    return CashAppLocalOrderRenderData.AdjustmentLine.Type.TYPE_SALES_TAX;
                case 4:
                    return CashAppLocalOrderRenderData.AdjustmentLine.Type.TYPE_TIP;
                case 5:
                    return CashAppLocalOrderRenderData.AdjustmentLine.Type.TYPE_DISCOUNT;
                case 6:
                    return CashAppLocalOrderRenderData.AdjustmentLine.Type.TYPE_GIFT_CARD;
                case 7:
                    return CashAppLocalOrderRenderData.AdjustmentLine.Type.TYPE_LOCAL_CASH;
                case 8:
                    return CashAppLocalOrderRenderData.AdjustmentLine.Type.TYPE_CUSTOM_SERVICE_CHARGE;
                case 9:
                    return CashAppLocalOrderRenderData.AdjustmentLine.Type.TYPE_COUPON;
                case 10:
                    return CashAppLocalOrderRenderData.AdjustmentLine.Type.TYPE_REWARD;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static GetNeighborhoodsTabContentResponse.AppletType m3882fromValue(int i) {
            if (i == 0) {
                return GetNeighborhoodsTabContentResponse.AppletType.APPLET_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return GetNeighborhoodsTabContentResponse.AppletType.APPLET_TYPE_LOCAL_CASH;
            }
            if (i == 2) {
                return GetNeighborhoodsTabContentResponse.AppletType.APPLET_TYPE_REORDER;
            }
            if (i == 3) {
                return GetNeighborhoodsTabContentResponse.AppletType.APPLET_TYPE_BRAND_COLLECTION;
            }
            if (i == 4) {
                return GetNeighborhoodsTabContentResponse.AppletType.APPLET_TYPE_FOLLOWING;
            }
            if (i != 5) {
                return null;
            }
            return GetNeighborhoodsTabContentResponse.AppletType.APPLET_TYPE_MARKETING_MESSAGE;
        }
    }
}

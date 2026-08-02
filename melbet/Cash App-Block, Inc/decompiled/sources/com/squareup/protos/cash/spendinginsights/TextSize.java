package com.squareup.protos.cash.spendinginsights;

import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.protos.cash.scheduledreloader.resources.v1.ScheduledReloadStatus;
import com.squareup.protos.cash.weaver.api.shared.RecommendationType;
import com.squareup.protos.cash.whimsicard.syncentity.Timeline;
import com.squareup.protos.franklin.api.Payment$CancellationReason;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum TextSize implements WireEnum {
    TEXT_SIZE_UNSPECIFIED(0),
    TEXT_SIZE_MEDIUM(1),
    TEXT_SIZE_LARGE(2);

    public static final TextSize$Companion$ADAPTER$1 ADAPTER;
    public static final Companion Companion;
    public final int value;

    static {
        TextSize textSize = TEXT_SIZE_UNSPECIFIED;
        Companion = new Companion();
        ADAPTER = new TextSize$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TextSize.class), Syntax.PROTO_2, textSize);
    }

    TextSize(int i) {
        this.value = i;
    }

    public static final TextSize fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return TEXT_SIZE_UNSPECIFIED;
        }
        if (i == 1) {
            return TEXT_SIZE_MEDIUM;
        }
        if (i != 2) {
            return null;
        }
        return TEXT_SIZE_LARGE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    public final class Companion {
        /* renamed from: fromValue, reason: collision with other method in class */
        public static Payment$CancellationReason m3923fromValue(int i) {
            switch (i) {
                case 1:
                    return Payment$CancellationReason.OTHER;
                case 2:
                    return Payment$CancellationReason.EXPIRED;
                case 3:
                    return Payment$CancellationReason.SENDER_CANCELED;
                case 4:
                    return Payment$CancellationReason.RECIPIENT_CANCELED;
                case 5:
                    return Payment$CancellationReason.SQUARE_CANCELED;
                case 6:
                    return Payment$CancellationReason.LIMIT_EXCEEDED;
                case 7:
                    return Payment$CancellationReason.DECLINED;
                case 8:
                    return Payment$CancellationReason.BELOW_LIMIT;
                case 9:
                    return Payment$CancellationReason.PAYING_SELF;
                case 10:
                    return Payment$CancellationReason.DEPOSIT_MECHANISMS_EXHAUSTED;
                case 11:
                    return Payment$CancellationReason.EXPIRED_WAITING_ON_SENDER;
                case 12:
                    return Payment$CancellationReason.EXPIRED_WAITING_ON_RECIPIENT;
                case 13:
                    return Payment$CancellationReason.BLOCKER_CANCELLED;
                case 14:
                    return Payment$CancellationReason.UNUSUAL_ACTIVITY;
                case 15:
                    return Payment$CancellationReason.REFUNDED;
                case 16:
                    return Payment$CancellationReason.AMOUNT_EXCEEDED_SENDER_LIMIT;
                case 17:
                    return Payment$CancellationReason.AMOUNT_EXCEEDED_SENDER_STATE_LIMIT;
                case 18:
                    return Payment$CancellationReason.AMOUNT_EXCEEDED_RECIPIENT_STATE_LIMIT;
                case 19:
                    return Payment$CancellationReason.EXCEEDED_PASSCODE_ATTEMPTS;
                case 20:
                    return Payment$CancellationReason.TOO_MANY_RECIPIENTS;
                case 21:
                    return Payment$CancellationReason.EMAIL_BOUNCED;
                case 22:
                    return Payment$CancellationReason.SUBJECT_INVALID;
                case 23:
                    return Payment$CancellationReason.REQUEST_IN_SUBJECT;
                case 24:
                    return Payment$CancellationReason.WELCOME_BONUS_ALREADY_A_CUSTOMER;
                case 25:
                    return Payment$CancellationReason.WELCOME_BONUS_NOT_VALID_FOR_ACH;
                case 26:
                    return Payment$CancellationReason.DECLINED_INSUFFICIENT_BALANCE;
                case 27:
                    return Payment$CancellationReason.DECLINED_POTENTIALLY_INSUFFICIENT_BALANCE;
                case 28:
                    return Payment$CancellationReason.DECLINED_BY_SQUARE;
                case 29:
                    return Payment$CancellationReason.DECLINED_CARD_DISABLED;
                case 30:
                    return Payment$CancellationReason.DECLINED_EXPIRATION_OR_SECURITY_CODE_INCORRECT;
                case 31:
                    return Payment$CancellationReason.DECLINED_CARD_NOT_ACTIVATED;
                case 32:
                    return Payment$CancellationReason.DECLINED_AVS_FAILED;
                case 33:
                    return Payment$CancellationReason.ABUSE_REPORTED_ON_USER;
                case 34:
                    return Payment$CancellationReason.ABUSE_REPORTED_ON_TRANSACTION;
                case 35:
                    return Payment$CancellationReason.DECLINED_CURRENCY_UNSUPPORTED;
                case 36:
                    return Payment$CancellationReason.DECLINED_INVALID_PIN;
                case 37:
                    return Payment$CancellationReason.DECLINED_INSTRUMENT_EXPIRED;
                case 38:
                    return Payment$CancellationReason.ACH_DECLINED_INSUFFICIENT_FUNDS;
                case 39:
                    return Payment$CancellationReason.ACH_DECLINED_INVALID_BANK_ACCOUNT;
                case 40:
                    return Payment$CancellationReason.ACH_DECLINED_EXPIRED_BANK_ACCOUNT;
                case 41:
                    return Payment$CancellationReason.ACH_DECLINED_FROZEN_BANK_ACCOUNT;
                case 42:
                    return Payment$CancellationReason.ACH_DECLINED_OTHER;
                case 43:
                    return Payment$CancellationReason.INTERNATIONAL_WIRE_TRANSFER;
                case 44:
                    return Payment$CancellationReason.DECLINED_MERCHANT_BLOCKED_BY_CUSTOMER;
                case 45:
                    return Payment$CancellationReason.DECLINED_MERCHANT_BLOCKED_FOR_SPONSORED_CUSTOMER;
                case 46:
                    return Payment$CancellationReason.AMOUNT_EXCEEDED_DAILY_LIMIT;
                case 47:
                    return Payment$CancellationReason.AMOUNT_EXCEEDED_WEEKLY_LIMIT;
                case 48:
                    return Payment$CancellationReason.AMOUNT_EXCEEDED_MONTHLY_LIMIT;
                case 49:
                    return Payment$CancellationReason.UNUSABLE_PREPAID_CARD;
                case 50:
                    return Payment$CancellationReason.BELOW_LIMIT_RECOMMEND_STANDARD;
                case 51:
                    return Payment$CancellationReason.INVALID_INSTRUMENT;
                case 52:
                    return Payment$CancellationReason.INVALID_CARD_INFO;
                case 53:
                    return Payment$CancellationReason.TRANSFER_DECLINED;
                case 54:
                    return Payment$CancellationReason.CUSTOMER_CHARGEBACK;
                case 55:
                    return Payment$CancellationReason.OTHER_NO_RETRY;
                case 56:
                    return Payment$CancellationReason.BACKGROUND_RETRY_AFTER_ERROR;
                case 57:
                    return Payment$CancellationReason.BACKGROUND_RETRY_NO_ERROR;
                case 58:
                    return Payment$CancellationReason.ABUSE_REPORTED_ON_USER_BY_SPONSOR;
                case 59:
                    return Payment$CancellationReason.SENDER_EXCEEDED_VELOCITY_LIMIT;
                case 60:
                    return Payment$CancellationReason.RECIPIENT_EXCEEDED_VELOCITY_LIMIT;
                case 61:
                    return Payment$CancellationReason.SQUARE_REIMBURSED;
                case 62:
                    return Payment$CancellationReason.DECLINED_CARD_TERMINATED;
                case 63:
                    return Payment$CancellationReason.FUNDS_FROZEN_BY_COMPLIANCE_CASE_REVIEW;
                case 64:
                    return Payment$CancellationReason.SENDER_SPONSORSHIP_CANCELLED;
                case 65:
                    return Payment$CancellationReason.RECIPIENT_SPONSORSHIP_CANCELLED;
                case 66:
                    return Payment$CancellationReason.SENDER_SPONSORSHIP_SUSPENDED;
                case 67:
                    return Payment$CancellationReason.RECIPIENT_SPONSORSHIP_SUSPENDED;
                case 68:
                    return Payment$CancellationReason.POOL_CLOSED;
                case 69:
                    return Payment$CancellationReason.DECLINED_MERCHANT_BLOCKED_BY_SPONSOR;
                case 70:
                    return Payment$CancellationReason.INVALID_USE_OF_CASH_APP_CARD_WITH_APPLE_PAY;
                case 71:
                    return Payment$CancellationReason.INVALID_USE_OF_CASH_APP_CARD_WITH_GOOGLE_PAY;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static RecommendationType m3921fromValue(int i) {
            if (i == 0) {
                return RecommendationType.DO_NOT_USE_RECOMMENDATION_TYPE;
            }
            if (i == 14) {
                return RecommendationType.DISCOVER_YOUR_NETWORK_SECTION_GROUP;
            }
            if (i == 28) {
                return RecommendationType.LOCAL_BRAND;
            }
            if (i == 9999) {
                return RecommendationType.GENERIC_RECOMMENDATION;
            }
            if (i == 2) {
                return RecommendationType.CUSTOMER_AFTERPAY_CATEGORY;
            }
            if (i == 3) {
                return RecommendationType.CONTACT;
            }
            if (i == 4) {
                return RecommendationType.BOOST_CAROUSEL;
            }
            if (i == 17) {
                return RecommendationType.AP_PERSONALIZATION_RECOMMENDED_FOR_YOU;
            }
            if (i != 18) {
                switch (i) {
                    case 10:
                        return RecommendationType.OFFERS_TAB_MERCHANT;
                    case 11:
                        return RecommendationType.APPLETS;
                    case 12:
                        return RecommendationType.DISCOVER_MORE_IN_CASHAPP_SECTION;
                    default:
                        switch (i) {
                            case 20:
                                return RecommendationType.STAGING_TEST_TYPE;
                            case 21:
                                return RecommendationType.AP_PERSONALIZATION_RECOMMENDED_STORES_WITHIN_CATEGORY;
                            case 22:
                                return RecommendationType.LOAD_TEST_TYPE;
                            default:
                                switch (i) {
                                    case 24:
                                        return RecommendationType.FAMILY_BLOCKLIST_NULL_STATE;
                                    case 25:
                                        return RecommendationType.CARD_NUX;
                                    case 26:
                                        return RecommendationType.PRODUCT_DISCOVERY_CASH_IN_SUCCESS;
                                    default:
                                        switch (i) {
                                            case 31:
                                                return RecommendationType.P2P_NULL_STATE;
                                            case 32:
                                                return RecommendationType.AP_STORE_SEMANTIC_SEARCH;
                                            case 33:
                                                return RecommendationType.PRODUCT_DISCOVERY_RECEIPTS;
                                            case 34:
                                                return RecommendationType.COURIER_MARKETING;
                                            default:
                                                switch (i) {
                                                    case 36:
                                                        return RecommendationType.AP_APPLET_PERSONALIZATION;
                                                    case 37:
                                                        return RecommendationType.DISCOVER_GLOBAL_SEARCH_SECTIONS;
                                                    case 38:
                                                        return RecommendationType.PROMOTER_MESSAGING;
                                                    case 39:
                                                        return RecommendationType.EARNER_UPSELL;
                                                    default:
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
            }
            return RecommendationType.AP_PERSONALIZATION_GIFT_CARDS;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static Timeline.TimelineIcon m3922fromValue(int i) {
            if (i == 0) {
                return Timeline.TimelineIcon.TIMELINE_ICON_UNSPECIFIED;
            }
            if (i == 1) {
                return Timeline.TimelineIcon.CHECKMARK;
            }
            if (i == 2) {
                return Timeline.TimelineIcon.PACKAGE;
            }
            if (i == 3) {
                return Timeline.TimelineIcon.TRUCK;
            }
            if (i != 4) {
                return null;
            }
            return Timeline.TimelineIcon.CHECKMARK_SUCCESS;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static ScheduledReloadStatus m3920fromValue(int i) {
            switch (i) {
                case 0:
                    return ScheduledReloadStatus.SCHEDULED_RELOAD_STATUS_UNSPECIFIED;
                case 1:
                    return ScheduledReloadStatus.SCHEDULED_RELOAD_STATUS_PENDING;
                case 2:
                    return ScheduledReloadStatus.SCHEDULED_RELOAD_STATUS_CANCELED;
                case 3:
                    return ScheduledReloadStatus.SCHEDULED_RELOAD_STATUS_COMPLETED;
                case 4:
                    return ScheduledReloadStatus.SCHEDULED_RELOAD_STATUS_FAILED;
                case 5:
                    return ScheduledReloadStatus.SCHEDULED_RELOAD_STATUS_FUNDING;
                case 6:
                    return ScheduledReloadStatus.SCHEDULED_RELOAD_STATUS_EARMARKED;
                case 7:
                    return ScheduledReloadStatus.SCHEDULED_RELOAD_STATUS_DISPATCHED;
                case 8:
                    return ScheduledReloadStatus.SCHEDULED_RELOAD_STATUS_PENDING_SKIP;
                case 9:
                    return ScheduledReloadStatus.SCHEDULED_RELOAD_STATUS_SKIPPED;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static CashAppCard.PhysicalCardOrderState m3919fromValue(int i) {
            if (i == 0) {
                return CashAppCard.PhysicalCardOrderState.STATE_UNSPECIFIED;
            }
            if (i == 1) {
                return CashAppCard.PhysicalCardOrderState.NO_CARD;
            }
            if (i == 2) {
                return CashAppCard.PhysicalCardOrderState.PENDING_SHIPMENT;
            }
            if (i == 3) {
                return CashAppCard.PhysicalCardOrderState.PENDING_ACTIVATION;
            }
            if (i != 4) {
                return null;
            }
            return CashAppCard.PhysicalCardOrderState.ACTIVATED;
        }

        public static CardModule.UseCase fromValue(int i) {
            if (i == 0) {
                return CardModule.UseCase.USE_CASE_UNSPECIFIED;
            }
            if (i == 1) {
                return CardModule.UseCase.VIRTUAL_CARD_STATUS;
            }
            if (i == 2) {
                return CardModule.UseCase.ISSUED_CARD_NO_CARD_ORDER_STATUS;
            }
            if (i == 3) {
                return CardModule.UseCase.PHYSICAL_CARD_ORDER_STATUS;
            }
            if (i == 4) {
                return CardModule.UseCase.NO_VIRTUAL_CARD_UPSELL;
            }
            if (i != 5) {
                return null;
            }
            return CardModule.UseCase.OVERFLOW_UI_ELEMENT;
        }
    }
}

package com.squareup.protos.cash.groups;

import com.squareup.protos.cash.instantpay.api.InstantPayoutAttemptStatus;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.protos.cash.local.client.v1.LocalStoredInstrument;
import com.squareup.protos.cash.nearby.api.v1.NearbyContext;
import com.squareup.protos.cash.papermate.enums.ExternalSystem;
import com.squareup.protos.cash.paymenttemplate.v1.CreationChannel;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum SliceStatus implements WireEnum {
    SLICE_STATUS_UNSPECIFIED(0),
    SLICE_STATUS_PENDING(1),
    SLICE_STATUS_PAID(2),
    SLICE_STATUS_DECLINED(3),
    SLICE_STATUS_CANCELED(4);

    public static final SliceStatus$Companion$ADAPTER$1 ADAPTER;
    public static final Companion Companion;
    public final int value;

    static {
        SliceStatus sliceStatus = SLICE_STATUS_UNSPECIFIED;
        Companion = new Companion();
        ADAPTER = new SliceStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SliceStatus.class), Syntax.PROTO_2, sliceStatus);
    }

    SliceStatus(int i) {
        this.value = i;
    }

    public static final SliceStatus fromValue(int i) {
        Companion.getClass();
        return Companion.fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }

    public final class Companion {
        /* renamed from: fromValue, reason: collision with other method in class */
        public static LocalErrorResponse.Error.Reason m3875fromValue(int i) {
            switch (i) {
                case 0:
                    return LocalErrorResponse.Error.Reason.REASON_UNSPECIFIED;
                case 1:
                    return LocalErrorResponse.Error.Reason.REASON_BAD_REQUEST;
                case 2:
                    return LocalErrorResponse.Error.Reason.REASON_NOT_FOUND;
                case 3:
                    return LocalErrorResponse.Error.Reason.REASON_LOCATION_NOT_ACCEPTING_ORDERS;
                case 4:
                    return LocalErrorResponse.Error.Reason.REASON_PAYMENT_FAILURE;
                case 5:
                    return LocalErrorResponse.Error.Reason.REASON_TIP_AMOUNT_NEGATIVE;
                case 6:
                    return LocalErrorResponse.Error.Reason.REASON_TIP_AMOUNT_OVER_LIMIT;
                case 7:
                    return LocalErrorResponse.Error.Reason.REASON_TIP_AMOUNT_CURRENCY_MISMATCH;
                case 8:
                    return LocalErrorResponse.Error.Reason.REASON_ITEM_NOT_AVAILABLE_FOR_SALE;
                case 9:
                    return LocalErrorResponse.Error.Reason.REASON_VARIATION_NOT_AVAILABLE_FOR_SALE;
                case 10:
                    return LocalErrorResponse.Error.Reason.REASON_MODIFIER_NOT_AVAILABLE_FOR_SALE;
                case 11:
                    return LocalErrorResponse.Error.Reason.REASON_PICKUP_TIME_DURATION_BEYOND_MAX_DURATION;
                case 12:
                    return LocalErrorResponse.Error.Reason.REASON_ORDERING_INTERFACE_FAILURE;
                case 13:
                    return LocalErrorResponse.Error.Reason.REASON_DISCOUNT_CODE_INVALID;
                case 14:
                    return LocalErrorResponse.Error.Reason.REASON_MISSING_REQUIRED_PARAMETER;
                case 15:
                    return LocalErrorResponse.Error.Reason.REASON_INVALID_VALUE;
                case 16:
                    return LocalErrorResponse.Error.Reason.REASON_INTERNAL_SERVER_ERROR;
                case 17:
                    return LocalErrorResponse.Error.Reason.REASON_ORDER_ALREADY_PAID;
                case 18:
                    return LocalErrorResponse.Error.Reason.REASON_DELIVERY_NOT_SUPPORTED;
                case 19:
                    return LocalErrorResponse.Error.Reason.REASON_TOO_MANY_REQUESTS;
                case 20:
                    return LocalErrorResponse.Error.Reason.REASON_CART_IS_STALE;
                case 21:
                    return LocalErrorResponse.Error.Reason.REASON_ORDER_SUBTOTAL_UNDER_MINIMUM;
                case 22:
                    return LocalErrorResponse.Error.Reason.REASON_ORDER_FULFILLMENT_SCHEDULED_TIME_SLOT_NOT_AVAILABLE;
                case 23:
                    return LocalErrorResponse.Error.Reason.REASON_BRAND_NOT_ACCEPTING_ORDERS;
                case 24:
                    return LocalErrorResponse.Error.Reason.REASON_BRAND_LOGO_IMAGE_NOT_PNG;
                case 25:
                    return LocalErrorResponse.Error.Reason.REASON_BRAND_LOGO_IMAGE_NOT_TRANSPARENT;
                case 26:
                    return LocalErrorResponse.Error.Reason.REASON_ITEM_MAX_QUANTITY_EXCEEDED;
                case 27:
                    return LocalErrorResponse.Error.Reason.REASON_LOYALTY_REWARD_NOT_APPLICABLE;
                case 28:
                    return LocalErrorResponse.Error.Reason.REASON_ITEM_NOT_AVAILABLE_AT_SCHEDULED_TIME;
                case 29:
                    return LocalErrorResponse.Error.Reason.REASON_GIFT_CARD_NOT_APPLICABLE;
                case 30:
                    return LocalErrorResponse.Error.Reason.REASON_IN_STORE_QR_CODE_LINK_INVALID;
                case 31:
                    return LocalErrorResponse.Error.Reason.REASON_BRAND_LOGO_IMAGE_TOO_SMALL;
                case 32:
                    return LocalErrorResponse.Error.Reason.REASON_BRAND_LOGO_IMAGE_TOO_LARGE;
                case 33:
                    return LocalErrorResponse.Error.Reason.REASON_BRAND_LOGO_FILE_TOO_LARGE;
                case 34:
                    return LocalErrorResponse.Error.Reason.REASON_BRAND_LOGO_INVALID_IMAGE_FORMAT;
                case 35:
                    return LocalErrorResponse.Error.Reason.REASON_COMBO_NOT_AVAILABLE_FOR_SALE;
                case 36:
                    return LocalErrorResponse.Error.Reason.REASON_ORDER_MAX_QUANTITY_EXCEEDED;
                case 37:
                    return LocalErrorResponse.Error.Reason.REASON_ORDER_SUBTOTAL_OVER_MAXIMUM;
                case 38:
                    return LocalErrorResponse.Error.Reason.REASON_BRAND_LOGO_LIKELY_PHOTOGRAPH;
                case 39:
                    return LocalErrorResponse.Error.Reason.REASON_UNAUTHENTICATED;
                case 40:
                    return LocalErrorResponse.Error.Reason.REASON_VARIATION_INSUFFICIENT_INVENTORY_AVAILABLE;
                case 41:
                    return LocalErrorResponse.Error.Reason.REASON_ITEM_NOT_AVAILABLE_FOR_FULFILLMENT_TYPE;
                case 42:
                    return LocalErrorResponse.Error.Reason.REASON_ITEM_CUTOFF_TIME_PASSED;
                case 43:
                    return LocalErrorResponse.Error.Reason.REASON_ITEM_PRE_ORDERING_CONFLICT;
                case 44:
                    return LocalErrorResponse.Error.Reason.REASON_SELLER_PREVIEW_NOT_ALLOWED;
                case 45:
                    return LocalErrorResponse.Error.Reason.REASON_INVALID_SHIPPING_RATE;
                case 46:
                    return LocalErrorResponse.Error.Reason.REASON_LOCATION_NOT_ACCEPTING_SHIPPING_ORDERS;
                case 47:
                    return LocalErrorResponse.Error.Reason.REASON_FULFILLMENT_SELECTION_REQUIRED;
                case 48:
                    return LocalErrorResponse.Error.Reason.REASON_LOCATION_REQUIRED;
                case 49:
                    return LocalErrorResponse.Error.Reason.REASON_TAB_ALREADY_CLOSED;
                case 50:
                    return LocalErrorResponse.Error.Reason.REASON_TAB_CLOSED_BY_POS;
                case 51:
                    return LocalErrorResponse.Error.Reason.REASON_TAB_CANCELLED;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static ExternalSystem m3878fromValue(int i) {
            if (i == 0) {
                return ExternalSystem.EXTERNAL_SYSTEM_DO_NOT_USE;
            }
            if (i == 1) {
                return ExternalSystem.VDBS;
            }
            if (i == 2) {
                return ExternalSystem.ISTL;
            }
            if (i == 3) {
                return ExternalSystem.BHN_BARCODE;
            }
            if (i != 4) {
                return null;
            }
            return ExternalSystem.BHN_SWIPE;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static CreationChannel m3879fromValue(int i) {
            if (i == 0) {
                return CreationChannel.CREATION_CHANNEL_UNSPECIFIED;
            }
            if (i == 1) {
                return CreationChannel.CREATION_CHANNEL_PAY_LINK;
            }
            if (i == 2) {
                return CreationChannel.CREATION_CHANNEL_NEARBY;
            }
            if (i == 3) {
                return CreationChannel.CREATION_CHANNEL_LITE_SEND;
            }
            if (i != 4) {
                return null;
            }
            return CreationChannel.CREATION_CHANNEL_REQUEST_INITIATOR;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static InstantPayoutAttemptStatus m3874fromValue(int i) {
            if (i == 0) {
                return InstantPayoutAttemptStatus.UNSUPPORTED;
            }
            if (i == 1) {
                return InstantPayoutAttemptStatus.PROCESSING;
            }
            if (i == 2) {
                return InstantPayoutAttemptStatus.APPROVED;
            }
            if (i == 3) {
                return InstantPayoutAttemptStatus.FAILED;
            }
            if (i != 4) {
                return null;
            }
            return InstantPayoutAttemptStatus.EXPIRED;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static NearbyContext.NearbyIntent m3877fromValue(int i) {
            if (i == 0) {
                return NearbyContext.NearbyIntent.NEARBY_INTENT_UNSPECIFIED;
            }
            if (i == 1) {
                return NearbyContext.NearbyIntent.NEARBY_INTENT_P2P_REQUEST;
            }
            if (i != 2) {
                return null;
            }
            return NearbyContext.NearbyIntent.NEARBY_INTENT_SHARE_PROFILE;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static LocalStoredInstrument.Type m3876fromValue(int i) {
            if (i == 0) {
                return LocalStoredInstrument.Type.TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return LocalStoredInstrument.Type.TYPE_VISA;
            }
            if (i == 2) {
                return LocalStoredInstrument.Type.TYPE_MASTERCARD;
            }
            if (i == 3) {
                return LocalStoredInstrument.Type.TYPE_AMERICAN_EXPRESS;
            }
            if (i == 4) {
                return LocalStoredInstrument.Type.TYPE_DISCOVER;
            }
            if (i != 5) {
                return null;
            }
            return LocalStoredInstrument.Type.TYPE_DISCOVER_DINERS;
        }

        public static SliceStatus fromValue(int i) {
            if (i == 0) {
                return SliceStatus.SLICE_STATUS_UNSPECIFIED;
            }
            if (i == 1) {
                return SliceStatus.SLICE_STATUS_PENDING;
            }
            if (i == 2) {
                return SliceStatus.SLICE_STATUS_PAID;
            }
            if (i == 3) {
                return SliceStatus.SLICE_STATUS_DECLINED;
            }
            if (i != 4) {
                return null;
            }
            return SliceStatus.SLICE_STATUS_CANCELED;
        }
    }
}

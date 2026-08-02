package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.ExpenseSlice;
import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.cash.money.content.MoneyTab;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalErrorResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalErrorResponse> CREATOR;
    public final List errors;

    public final class Error extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Error> CREATOR;
        public final String field;
        public final Level level;
        public final String message;
        public final Reason reason;
        public final String related_token;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1308type;

        public enum Level implements WireEnum {
            LEVEL_UNSPECIFIED(0),
            LEVEL_WARNING(1),
            LEVEL_ERROR(3);

            public static final LocalErrorResponse$Error$Level$Companion$ADAPTER$1 ADAPTER;
            public static final Origin.Companion Companion;
            public final int value;

            static {
                Level level = LEVEL_UNSPECIFIED;
                Companion = new Origin.Companion();
                ADAPTER = new LocalErrorResponse$Error$Level$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Level.class), Syntax.PROTO_2, level);
            }

            Level(int i) {
                this.value = i;
            }

            public static final Level fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return LEVEL_UNSPECIFIED;
                }
                if (i == 1) {
                    return LEVEL_WARNING;
                }
                if (i != 3) {
                    return null;
                }
                return LEVEL_ERROR;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        public enum Reason implements WireEnum {
            REASON_UNSPECIFIED(0),
            REASON_BAD_REQUEST(1),
            REASON_NOT_FOUND(2),
            REASON_LOCATION_NOT_ACCEPTING_ORDERS(3),
            REASON_PAYMENT_FAILURE(4),
            REASON_TIP_AMOUNT_NEGATIVE(5),
            REASON_TIP_AMOUNT_OVER_LIMIT(6),
            REASON_TIP_AMOUNT_CURRENCY_MISMATCH(7),
            REASON_ITEM_NOT_AVAILABLE_FOR_SALE(8),
            REASON_VARIATION_NOT_AVAILABLE_FOR_SALE(9),
            REASON_MODIFIER_NOT_AVAILABLE_FOR_SALE(10),
            REASON_PICKUP_TIME_DURATION_BEYOND_MAX_DURATION(11),
            REASON_ORDERING_INTERFACE_FAILURE(12),
            REASON_DISCOUNT_CODE_INVALID(13),
            REASON_MISSING_REQUIRED_PARAMETER(14),
            REASON_INVALID_VALUE(15),
            REASON_INTERNAL_SERVER_ERROR(16),
            REASON_ORDER_ALREADY_PAID(17),
            REASON_DELIVERY_NOT_SUPPORTED(18),
            REASON_TOO_MANY_REQUESTS(19),
            REASON_CART_IS_STALE(20),
            REASON_ORDER_SUBTOTAL_UNDER_MINIMUM(21),
            REASON_ORDER_FULFILLMENT_SCHEDULED_TIME_SLOT_NOT_AVAILABLE(22),
            REASON_BRAND_NOT_ACCEPTING_ORDERS(23),
            REASON_BRAND_LOGO_IMAGE_NOT_PNG(24),
            REASON_BRAND_LOGO_IMAGE_NOT_TRANSPARENT(25),
            REASON_ITEM_MAX_QUANTITY_EXCEEDED(26),
            REASON_LOYALTY_REWARD_NOT_APPLICABLE(27),
            REASON_ITEM_NOT_AVAILABLE_AT_SCHEDULED_TIME(28),
            REASON_GIFT_CARD_NOT_APPLICABLE(29),
            REASON_IN_STORE_QR_CODE_LINK_INVALID(30),
            REASON_BRAND_LOGO_IMAGE_TOO_SMALL(31),
            REASON_BRAND_LOGO_IMAGE_TOO_LARGE(32),
            REASON_BRAND_LOGO_FILE_TOO_LARGE(33),
            REASON_BRAND_LOGO_INVALID_IMAGE_FORMAT(34),
            REASON_COMBO_NOT_AVAILABLE_FOR_SALE(35),
            REASON_ORDER_MAX_QUANTITY_EXCEEDED(36),
            REASON_ORDER_SUBTOTAL_OVER_MAXIMUM(37),
            REASON_BRAND_LOGO_LIKELY_PHOTOGRAPH(38),
            REASON_UNAUTHENTICATED(39),
            REASON_VARIATION_INSUFFICIENT_INVENTORY_AVAILABLE(40),
            REASON_ITEM_NOT_AVAILABLE_FOR_FULFILLMENT_TYPE(41),
            REASON_ITEM_CUTOFF_TIME_PASSED(42),
            REASON_ITEM_PRE_ORDERING_CONFLICT(43),
            REASON_SELLER_PREVIEW_NOT_ALLOWED(44),
            REASON_INVALID_SHIPPING_RATE(45),
            REASON_LOCATION_NOT_ACCEPTING_SHIPPING_ORDERS(46),
            REASON_FULFILLMENT_SELECTION_REQUIRED(47),
            REASON_LOCATION_REQUIRED(48),
            REASON_TAB_ALREADY_CLOSED(49),
            REASON_TAB_CLOSED_BY_POS(50),
            REASON_TAB_CANCELLED(51);

            public static final LocalErrorResponse$Error$Reason$Companion$ADAPTER$1 ADAPTER;
            public static final SliceStatus.Companion Companion;
            public final int value;

            static {
                Reason reason = REASON_UNSPECIFIED;
                Companion = new SliceStatus.Companion();
                ADAPTER = new LocalErrorResponse$Error$Reason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Reason.class), Syntax.PROTO_2, reason);
            }

            Reason(int i) {
                this.value = i;
            }

            public static final Reason fromValue(int i) {
                Companion.getClass();
                return SliceStatus.Companion.m3875fromValue(i);
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        public enum Type implements WireEnum {
            TYPE_UNSPECIFIED(0),
            TYPE_VALIDATION_ERROR(1),
            TYPE_STATE_CHANGED(2),
            TYPE_INTERNAL_ERROR(3);

            public static final LocalErrorResponse$Error$Type$Companion$ADAPTER$1 ADAPTER;
            public static final FeeType.Companion Companion;
            public final int value;

            static {
                Type type2 = TYPE_UNSPECIFIED;
                Companion = new FeeType.Companion();
                ADAPTER = new LocalErrorResponse$Error$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, type2);
            }

            Type(int i) {
                this.value = i;
            }

            public static final Type fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return TYPE_UNSPECIFIED;
                }
                if (i == 1) {
                    return TYPE_VALIDATION_ERROR;
                }
                if (i == 2) {
                    return TYPE_STATE_CHANGED;
                }
                if (i != 3) {
                    return null;
                }
                return TYPE_INTERNAL_ERROR;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            LocalErrorResponse$Error$Companion$ADAPTER$1 localErrorResponse$Error$Companion$ADAPTER$1 = new LocalErrorResponse$Error$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Error.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalErrorResponse.Error", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_error_response.proto");
            ADAPTER = localErrorResponse$Error$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localErrorResponse$Error$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String str, Type type2, Reason reason, String str2, Level level, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.message = str;
            this.f1308type = type2;
            this.reason = reason;
            this.field = str2;
            this.level = level;
            this.related_token = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(unknownFields(), error.unknownFields()) && Intrinsics.areEqual(this.message, error.message) && this.f1308type == error.f1308type && this.reason == error.reason && Intrinsics.areEqual(this.field, error.field) && this.level == error.level && Intrinsics.areEqual(this.related_token, error.related_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.message;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Type type2 = this.f1308type;
            int hashCode3 = (hashCode2 + (type2 != null ? type2.hashCode() : 0)) * 37;
            Reason reason = this.reason;
            int hashCode4 = (hashCode3 + (reason != null ? reason.hashCode() : 0)) * 37;
            String str2 = this.field;
            int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Level level = this.level;
            int hashCode6 = (hashCode5 + (level != null ? level.hashCode() : 0)) * 37;
            String str3 = this.related_token;
            int hashCode7 = hashCode6 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ExpenseSlice.Builder builder = new ExpenseSlice.Builder(14);
            builder.slice_token = this.message;
            builder.requester = this.f1308type;
            builder.responder = this.reason;
            builder.amount = this.field;
            builder.status = this.level;
            builder.action = this.related_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.message;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message=", arrayList);
            }
            Type type2 = this.f1308type;
            if (type2 != null) {
                arrayList.add("type=" + type2);
            }
            Reason reason = this.reason;
            if (reason != null) {
                arrayList.add("reason=" + reason);
            }
            String str2 = this.field;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "field=", arrayList);
            }
            Level level = this.level;
            if (level != null) {
                arrayList.add("level=" + level);
            }
            String str3 = this.related_token;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "related_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Error{", "}", 0, null, null, 56);
        }
    }

    static {
        LocalErrorResponse$Companion$ADAPTER$1 localErrorResponse$Companion$ADAPTER$1 = new LocalErrorResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalErrorResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalErrorResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_error_response.proto");
        ADAPTER = localErrorResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localErrorResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalErrorResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.errors = TransactorKt.immutableCopyOf("errors", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalErrorResponse)) {
            return false;
        }
        LocalErrorResponse localErrorResponse = (LocalErrorResponse) obj;
        return Intrinsics.areEqual(unknownFields(), localErrorResponse.unknownFields()) && Intrinsics.areEqual(this.errors, localErrorResponse.errors);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.errors.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        MoneyTab.Builder builder = new MoneyTab.Builder(9, false);
        builder.applets = this.errors;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.errors;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("errors=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalErrorResponse{", "}", 0, null, null, 56);
    }
}

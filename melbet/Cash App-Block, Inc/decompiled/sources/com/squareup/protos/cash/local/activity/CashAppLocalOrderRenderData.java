package com.squareup.protos.cash.local.activity;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.bumptech.glide.module.ManifestParser;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.favorites.Favorite;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.groups.Group;
import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.local.common.values.LocalCash;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.protos.cash.pools.Instrument;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.common.ProfileRow;
import com.squareup.protos.timecards.Timecard;
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
public final class CashAppLocalOrderRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashAppLocalOrderRenderData> CREATOR;
    public final Actions actions;
    public final List adjustment_lines;
    public final String brand_name;
    public final String buyer_name;
    public final LocalCashData local_cash_data;
    public final String location_address;
    public final OrderActivityEntry order_activity_entry;
    public final Money order_fee_amount;
    public final List order_lines;
    public final OrderPaymentData order_payment_data;
    public final OrderStatus order_status;
    public final Money order_subtotal_amount;
    public final Money order_tax_amount;
    public final Money order_tip_amount;
    public final Money order_total_amount;
    public final String pickup_time;
    public final Money total_amount_paid_by_buyer;

    public final class Actions extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Actions> CREATOR;
        public final String follow_brand_client_route;
        public final String new_order_client_route;
        public final String show_local_cash_detail_sheet_client_route;
        public final String show_order_confirmation_screen_client_route;
        public final String view_square_receipt_external_route;

        static {
            CashAppLocalOrderRenderData$Actions$Companion$ADAPTER$1 cashAppLocalOrderRenderData$Actions$Companion$ADAPTER$1 = new CashAppLocalOrderRenderData$Actions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Actions.class), "type.googleapis.com/squareup.cash.local.activity.CashAppLocalOrderRenderData.Actions", Syntax.PROTO_2, null, "squareup/cash/local/activity/local_order_render_data.proto");
            ADAPTER = cashAppLocalOrderRenderData$Actions$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppLocalOrderRenderData$Actions$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Actions(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.new_order_client_route = str;
            this.show_local_cash_detail_sheet_client_route = str2;
            this.show_order_confirmation_screen_client_route = str3;
            this.view_square_receipt_external_route = str4;
            this.follow_brand_client_route = str5;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Actions)) {
                return false;
            }
            Actions actions = (Actions) obj;
            return Intrinsics.areEqual(unknownFields(), actions.unknownFields()) && Intrinsics.areEqual(this.new_order_client_route, actions.new_order_client_route) && Intrinsics.areEqual(this.show_local_cash_detail_sheet_client_route, actions.show_local_cash_detail_sheet_client_route) && Intrinsics.areEqual(this.show_order_confirmation_screen_client_route, actions.show_order_confirmation_screen_client_route) && Intrinsics.areEqual(this.view_square_receipt_external_route, actions.view_square_receipt_external_route) && Intrinsics.areEqual(this.follow_brand_client_route, actions.follow_brand_client_route);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.new_order_client_route;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.show_local_cash_detail_sheet_client_route;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.show_order_confirmation_screen_client_route;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.view_square_receipt_external_route;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.follow_brand_client_route;
            int hashCode6 = hashCode5 + (str5 != null ? str5.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ProfileRow.Builder builder = new ProfileRow.Builder(5);
            builder.client_route = this.new_order_client_route;
            builder.icon_id = this.show_local_cash_detail_sheet_client_route;
            builder.title = this.show_order_confirmation_screen_client_route;
            builder.subtitle = this.view_square_receipt_external_route;
            builder.call_to_action = this.follow_brand_client_route;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.new_order_client_route;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "new_order_client_route=", arrayList);
            }
            String str2 = this.show_local_cash_detail_sheet_client_route;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "show_local_cash_detail_sheet_client_route=", arrayList);
            }
            String str3 = this.show_order_confirmation_screen_client_route;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "show_order_confirmation_screen_client_route=", arrayList);
            }
            String str4 = this.view_square_receipt_external_route;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "view_square_receipt_external_route=", arrayList);
            }
            String str5 = this.follow_brand_client_route;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "follow_brand_client_route=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Actions{", "}", 0, null, null, 56);
        }
    }

    public final class AdjustmentLine extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AdjustmentLine> CREATOR;
        public final Money amount;
        public final String description;
        public final ManifestParser detail;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1302type;

        public final class CouponDetail extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<CouponDetail> CREATOR;
            public final String code;

            static {
                CashAppLocalOrderRenderData$AdjustmentLine$CouponDetail$Companion$ADAPTER$1 cashAppLocalOrderRenderData$AdjustmentLine$CouponDetail$Companion$ADAPTER$1 = new CashAppLocalOrderRenderData$AdjustmentLine$CouponDetail$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CouponDetail.class), "type.googleapis.com/squareup.cash.local.activity.CashAppLocalOrderRenderData.AdjustmentLine.CouponDetail", Syntax.PROTO_2, null, "squareup/cash/local/activity/local_order_render_data.proto");
                ADAPTER = cashAppLocalOrderRenderData$AdjustmentLine$CouponDetail$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppLocalOrderRenderData$AdjustmentLine$CouponDetail$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CouponDetail(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.code = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CouponDetail)) {
                    return false;
                }
                CouponDetail couponDetail = (CouponDetail) obj;
                return Intrinsics.areEqual(unknownFields(), couponDetail.unknownFields()) && Intrinsics.areEqual(this.code, couponDetail.code);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.code;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Favorite.Builder builder = new Favorite.Builder(28);
                builder.favorite_customer_token = this.code;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.code;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "code=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "CouponDetail{", "}", 0, null, null, 56);
            }
        }

        public final class CustomChargeDetail extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<CustomChargeDetail> CREATOR;
            public final String name;

            static {
                CashAppLocalOrderRenderData$AdjustmentLine$CustomChargeDetail$Companion$ADAPTER$1 cashAppLocalOrderRenderData$AdjustmentLine$CustomChargeDetail$Companion$ADAPTER$1 = new CashAppLocalOrderRenderData$AdjustmentLine$CustomChargeDetail$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CustomChargeDetail.class), "type.googleapis.com/squareup.cash.local.activity.CashAppLocalOrderRenderData.AdjustmentLine.CustomChargeDetail", Syntax.PROTO_2, null, "squareup/cash/local/activity/local_order_render_data.proto");
                ADAPTER = cashAppLocalOrderRenderData$AdjustmentLine$CustomChargeDetail$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppLocalOrderRenderData$AdjustmentLine$CustomChargeDetail$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CustomChargeDetail(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.name = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CustomChargeDetail)) {
                    return false;
                }
                CustomChargeDetail customChargeDetail = (CustomChargeDetail) obj;
                return Intrinsics.areEqual(unknownFields(), customChargeDetail.unknownFields()) && Intrinsics.areEqual(this.name, customChargeDetail.name);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.name;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Favorite.Builder builder = new Favorite.Builder(29);
                builder.favorite_customer_token = this.name;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.name;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "CustomChargeDetail{", "}", 0, null, null, 56);
            }
        }

        public final class DiscountDetail extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<DiscountDetail> CREATOR;
            public final String name;

            static {
                CashAppLocalOrderRenderData$AdjustmentLine$DiscountDetail$Companion$ADAPTER$1 cashAppLocalOrderRenderData$AdjustmentLine$DiscountDetail$Companion$ADAPTER$1 = new CashAppLocalOrderRenderData$AdjustmentLine$DiscountDetail$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DiscountDetail.class), "type.googleapis.com/squareup.cash.local.activity.CashAppLocalOrderRenderData.AdjustmentLine.DiscountDetail", Syntax.PROTO_2, null, "squareup/cash/local/activity/local_order_render_data.proto");
                ADAPTER = cashAppLocalOrderRenderData$AdjustmentLine$DiscountDetail$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppLocalOrderRenderData$AdjustmentLine$DiscountDetail$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DiscountDetail(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.name = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DiscountDetail)) {
                    return false;
                }
                DiscountDetail discountDetail = (DiscountDetail) obj;
                return Intrinsics.areEqual(unknownFields(), discountDetail.unknownFields()) && Intrinsics.areEqual(this.name, discountDetail.name);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.name;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Instrument.Builder builder = new Instrument.Builder(1);
                builder.token = this.name;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.name;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "DiscountDetail{", "}", 0, null, null, 56);
            }
        }

        public final class GiftCardDetail extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<GiftCardDetail> CREATOR;
            public final String last4;

            static {
                CashAppLocalOrderRenderData$AdjustmentLine$GiftCardDetail$Companion$ADAPTER$1 cashAppLocalOrderRenderData$AdjustmentLine$GiftCardDetail$Companion$ADAPTER$1 = new CashAppLocalOrderRenderData$AdjustmentLine$GiftCardDetail$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GiftCardDetail.class), "type.googleapis.com/squareup.cash.local.activity.CashAppLocalOrderRenderData.AdjustmentLine.GiftCardDetail", Syntax.PROTO_2, null, "squareup/cash/local/activity/local_order_render_data.proto");
                ADAPTER = cashAppLocalOrderRenderData$AdjustmentLine$GiftCardDetail$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppLocalOrderRenderData$AdjustmentLine$GiftCardDetail$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GiftCardDetail(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.last4 = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof GiftCardDetail)) {
                    return false;
                }
                GiftCardDetail giftCardDetail = (GiftCardDetail) obj;
                return Intrinsics.areEqual(unknownFields(), giftCardDetail.unknownFields()) && Intrinsics.areEqual(this.last4, giftCardDetail.last4);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.last4;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Instrument.Builder builder = new Instrument.Builder(2);
                builder.token = this.last4;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.last4;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "last4=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "GiftCardDetail{", "}", 0, null, null, 56);
            }
        }

        public final class TaxDetail extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<TaxDetail> CREATOR;
            public final String name;
            public final String rate_percentage;

            static {
                CashAppLocalOrderRenderData$AdjustmentLine$TaxDetail$Companion$ADAPTER$1 cashAppLocalOrderRenderData$AdjustmentLine$TaxDetail$Companion$ADAPTER$1 = new CashAppLocalOrderRenderData$AdjustmentLine$TaxDetail$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TaxDetail.class), "type.googleapis.com/squareup.cash.local.activity.CashAppLocalOrderRenderData.AdjustmentLine.TaxDetail", Syntax.PROTO_2, null, "squareup/cash/local/activity/local_order_render_data.proto");
                ADAPTER = cashAppLocalOrderRenderData$AdjustmentLine$TaxDetail$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppLocalOrderRenderData$AdjustmentLine$TaxDetail$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaxDetail(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.name = str;
                this.rate_percentage = str2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof TaxDetail)) {
                    return false;
                }
                TaxDetail taxDetail = (TaxDetail) obj;
                return Intrinsics.areEqual(unknownFields(), taxDetail.unknownFields()) && Intrinsics.areEqual(this.name, taxDetail.name) && Intrinsics.areEqual(this.rate_percentage, taxDetail.rate_percentage);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.name;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.rate_percentage;
                int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                FullName.Builder builder = new FullName.Builder(11);
                builder.given_name = this.name;
                builder.family_name = this.rate_percentage;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.name;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
                }
                String str2 = this.rate_percentage;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "rate_percentage=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "TaxDetail{", "}", 0, null, null, 56);
            }
        }

        public enum Type implements WireEnum {
            TYPE_UNSPECIFIED(0),
            TYPE_DELIVERY_FEE(1),
            TYPE_SERVICE_FEE(2),
            TYPE_SALES_TAX(3),
            TYPE_TIP(4),
            TYPE_DISCOUNT(5),
            TYPE_GIFT_CARD(6),
            TYPE_LOCAL_CASH(7),
            TYPE_CUSTOM_SERVICE_CHARGE(8),
            TYPE_COUPON(9),
            TYPE_REWARD(10);

            public static final CashAppLocalOrderRenderData$AdjustmentLine$Type$Companion$ADAPTER$1 ADAPTER;
            public static final Origin.Companion Companion;
            public final int value;

            static {
                Type type2 = TYPE_UNSPECIFIED;
                Companion = new Origin.Companion();
                ADAPTER = new CashAppLocalOrderRenderData$AdjustmentLine$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, type2);
            }

            Type(int i) {
                this.value = i;
            }

            public static final Type fromValue(int i) {
                Companion.getClass();
                return Origin.Companion.m3881fromValue(i);
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            CashAppLocalOrderRenderData$AdjustmentLine$Companion$ADAPTER$1 cashAppLocalOrderRenderData$AdjustmentLine$Companion$ADAPTER$1 = new CashAppLocalOrderRenderData$AdjustmentLine$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AdjustmentLine.class), "type.googleapis.com/squareup.cash.local.activity.CashAppLocalOrderRenderData.AdjustmentLine", Syntax.PROTO_2, null, "squareup/cash/local/activity/local_order_render_data.proto");
            ADAPTER = cashAppLocalOrderRenderData$AdjustmentLine$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppLocalOrderRenderData$AdjustmentLine$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdjustmentLine(Type type2, Money money, ManifestParser manifestParser, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.f1302type = type2;
            this.amount = money;
            this.detail = manifestParser;
            this.description = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AdjustmentLine)) {
                return false;
            }
            AdjustmentLine adjustmentLine = (AdjustmentLine) obj;
            return Intrinsics.areEqual(unknownFields(), adjustmentLine.unknownFields()) && this.f1302type == adjustmentLine.f1302type && Intrinsics.areEqual(this.amount, adjustmentLine.amount) && Intrinsics.areEqual(this.detail, adjustmentLine.detail) && Intrinsics.areEqual(this.description, adjustmentLine.description);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Type type2 = this.f1302type;
            int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
            Money money = this.amount;
            int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
            ManifestParser manifestParser = this.detail;
            int hashCode4 = (hashCode3 + (manifestParser != null ? manifestParser.hashCode() : 0)) * 37;
            String str = this.description;
            int hashCode5 = hashCode4 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Card.CardPii.Builder builder = new Card.CardPii.Builder(27, false);
            builder.last_four_digits = this.f1302type;
            builder.expiration = this.amount;
            builder.ciphertext_ = this.detail;
            builder.postal_code = this.description;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Type type2 = this.f1302type;
            if (type2 != null) {
                arrayList.add("type=" + type2);
            }
            Money money = this.amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
            }
            ManifestParser manifestParser = this.detail;
            if (manifestParser != null) {
                arrayList.add("detail=" + manifestParser);
            }
            String str = this.description;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "description=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AdjustmentLine{", "}", 0, null, null, 56);
        }
    }

    public final class LocalCashData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LocalCashData> CREATOR;
        public final LocalCash local_cash_earnings;
        public final Money local_cash_order_redemption_amount;

        static {
            CashAppLocalOrderRenderData$LocalCashData$Companion$ADAPTER$1 cashAppLocalOrderRenderData$LocalCashData$Companion$ADAPTER$1 = new CashAppLocalOrderRenderData$LocalCashData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalCashData.class), "type.googleapis.com/squareup.cash.local.activity.CashAppLocalOrderRenderData.LocalCashData", Syntax.PROTO_2, null, "squareup/cash/local/activity/local_order_render_data.proto");
            ADAPTER = cashAppLocalOrderRenderData$LocalCashData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppLocalOrderRenderData$LocalCashData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalCashData(Money money, LocalCash localCash, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.local_cash_order_redemption_amount = money;
            this.local_cash_earnings = localCash;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LocalCashData)) {
                return false;
            }
            LocalCashData localCashData = (LocalCashData) obj;
            return Intrinsics.areEqual(unknownFields(), localCashData.unknownFields()) && Intrinsics.areEqual(this.local_cash_order_redemption_amount, localCashData.local_cash_order_redemption_amount) && Intrinsics.areEqual(this.local_cash_earnings, localCashData.local_cash_earnings);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.local_cash_order_redemption_amount;
            int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
            LocalCash localCash = this.local_cash_earnings;
            int hashCode3 = hashCode2 + (localCash != null ? localCash.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Card.Builder builder = new Card.Builder(20);
            builder.card_type = this.local_cash_order_redemption_amount;
            builder.card_pii = this.local_cash_earnings;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.local_cash_order_redemption_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("local_cash_order_redemption_amount=", money, arrayList);
            }
            LocalCash localCash = this.local_cash_earnings;
            if (localCash != null) {
                arrayList.add("local_cash_earnings=" + localCash);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LocalCashData{", "}", 0, null, null, 56);
        }
    }

    public final class OrderActivityEntry extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OrderActivityEntry> CREATOR;
        public final String subject_id;
        public final OrderActivityEntrySubject subject_type;
        public final Long subject_version;

        static {
            CashAppLocalOrderRenderData$OrderActivityEntry$Companion$ADAPTER$1 cashAppLocalOrderRenderData$OrderActivityEntry$Companion$ADAPTER$1 = new CashAppLocalOrderRenderData$OrderActivityEntry$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OrderActivityEntry.class), "type.googleapis.com/squareup.cash.local.activity.CashAppLocalOrderRenderData.OrderActivityEntry", Syntax.PROTO_2, null, "squareup/cash/local/activity/local_order_render_data.proto");
            ADAPTER = cashAppLocalOrderRenderData$OrderActivityEntry$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppLocalOrderRenderData$OrderActivityEntry$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderActivityEntry(OrderActivityEntrySubject orderActivityEntrySubject, String str, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.subject_type = orderActivityEntrySubject;
            this.subject_id = str;
            this.subject_version = l;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OrderActivityEntry)) {
                return false;
            }
            OrderActivityEntry orderActivityEntry = (OrderActivityEntry) obj;
            return Intrinsics.areEqual(unknownFields(), orderActivityEntry.unknownFields()) && this.subject_type == orderActivityEntry.subject_type && Intrinsics.areEqual(this.subject_id, orderActivityEntry.subject_id) && Intrinsics.areEqual(this.subject_version, orderActivityEntry.subject_version);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            OrderActivityEntrySubject orderActivityEntrySubject = this.subject_type;
            int hashCode2 = (hashCode + (orderActivityEntrySubject != null ? orderActivityEntrySubject.hashCode() : 0)) * 37;
            String str = this.subject_id;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            Long l = this.subject_version;
            int hashCode4 = hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Group.Builder builder = new Group.Builder(11);
            builder.group_image = this.subject_type;
            builder.name = this.subject_id;
            builder.participants = this.subject_version;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            OrderActivityEntrySubject orderActivityEntrySubject = this.subject_type;
            if (orderActivityEntrySubject != null) {
                arrayList.add("subject_type=" + orderActivityEntrySubject);
            }
            String str = this.subject_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "subject_id=", arrayList);
            }
            Long l = this.subject_version;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("subject_version=", l, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OrderActivityEntry{", "}", 0, null, null, 56);
        }
    }

    public enum OrderActivityEntrySubject implements WireEnum {
        ORDER_ACTIVITY_ENTRY_SUBJECT_UNSPECIFIED(0),
        ORDER_ACTIVITY_ENTRY_SUBJECT_LOCAL(1),
        ORDER_ACTIVITY_ENTRY_SUBJECT_SQUARE(2),
        ORDER_ACTIVITY_ENTRY_SUBJECT_LOCAL_V2(3);

        public static final CashAppLocalOrderRenderData$OrderActivityEntrySubject$Companion$ADAPTER$1 ADAPTER;
        public static final SliceStatus.Companion Companion;
        public final int value;

        static {
            OrderActivityEntrySubject orderActivityEntrySubject = ORDER_ACTIVITY_ENTRY_SUBJECT_UNSPECIFIED;
            Companion = new SliceStatus.Companion();
            ADAPTER = new CashAppLocalOrderRenderData$OrderActivityEntrySubject$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OrderActivityEntrySubject.class), Syntax.PROTO_2, orderActivityEntrySubject);
        }

        OrderActivityEntrySubject(int i) {
            this.value = i;
        }

        public static final OrderActivityEntrySubject fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return ORDER_ACTIVITY_ENTRY_SUBJECT_UNSPECIFIED;
            }
            if (i == 1) {
                return ORDER_ACTIVITY_ENTRY_SUBJECT_LOCAL;
            }
            if (i == 2) {
                return ORDER_ACTIVITY_ENTRY_SUBJECT_SQUARE;
            }
            if (i != 3) {
                return null;
            }
            return ORDER_ACTIVITY_ENTRY_SUBJECT_LOCAL_V2;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class OrderLine extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OrderLine> CREATOR;
        public final String item_name;
        public final Integer quantity;
        public final Money total_price;

        static {
            CashAppLocalOrderRenderData$OrderLine$Companion$ADAPTER$1 cashAppLocalOrderRenderData$OrderLine$Companion$ADAPTER$1 = new CashAppLocalOrderRenderData$OrderLine$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OrderLine.class), "type.googleapis.com/squareup.cash.local.activity.CashAppLocalOrderRenderData.OrderLine", Syntax.PROTO_2, null, "squareup/cash/local/activity/local_order_render_data.proto");
            ADAPTER = cashAppLocalOrderRenderData$OrderLine$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppLocalOrderRenderData$OrderLine$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderLine(String str, Integer num, Money money, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.item_name = str;
            this.quantity = num;
            this.total_price = money;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OrderLine)) {
                return false;
            }
            OrderLine orderLine = (OrderLine) obj;
            return Intrinsics.areEqual(unknownFields(), orderLine.unknownFields()) && Intrinsics.areEqual(this.item_name, orderLine.item_name) && Intrinsics.areEqual(this.quantity, orderLine.quantity) && Intrinsics.areEqual(this.total_price, orderLine.total_price);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.item_name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Integer num = this.quantity;
            int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Money money = this.total_price;
            int hashCode4 = hashCode3 + (money != null ? money.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Group.Builder builder = new Group.Builder(12);
            builder.name = this.item_name;
            builder.group_image = this.quantity;
            builder.participants = this.total_price;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.item_name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "item_name=", arrayList);
            }
            Integer num = this.quantity;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("quantity=", num, arrayList);
            }
            Money money = this.total_price;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("total_price=", money, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OrderLine{", "}", 0, null, null, 56);
        }
    }

    public final class OrderPaymentData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OrderPaymentData> CREATOR;
        public final String instrument_display_name;
        public final CashInstrumentType instrument_type;
        public final String square_payment_token;
        public final OrderPaymentStatus status;
        public final String transaction_number;

        public enum OrderPaymentStatus implements WireEnum {
            ORDER_PAYMENT_STATUS_UNSPECIFIED(0),
            ORDER_PAYMENT_STATUS_IN_PROGRESS(1),
            ORDER_PAYMENT_STATUS_COMPLETED(2);

            public static final CashAppLocalOrderRenderData$OrderPaymentData$OrderPaymentStatus$Companion$ADAPTER$1 ADAPTER;
            public static final FeeType.Companion Companion;
            public final int value;

            static {
                OrderPaymentStatus orderPaymentStatus = ORDER_PAYMENT_STATUS_UNSPECIFIED;
                Companion = new FeeType.Companion();
                ADAPTER = new CashAppLocalOrderRenderData$OrderPaymentData$OrderPaymentStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OrderPaymentStatus.class), Syntax.PROTO_2, orderPaymentStatus);
            }

            OrderPaymentStatus(int i) {
                this.value = i;
            }

            public static final OrderPaymentStatus fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return ORDER_PAYMENT_STATUS_UNSPECIFIED;
                }
                if (i == 1) {
                    return ORDER_PAYMENT_STATUS_IN_PROGRESS;
                }
                if (i != 2) {
                    return null;
                }
                return ORDER_PAYMENT_STATUS_COMPLETED;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            CashAppLocalOrderRenderData$OrderPaymentData$Companion$ADAPTER$1 cashAppLocalOrderRenderData$OrderPaymentData$Companion$ADAPTER$1 = new CashAppLocalOrderRenderData$OrderPaymentData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OrderPaymentData.class), "type.googleapis.com/squareup.cash.local.activity.CashAppLocalOrderRenderData.OrderPaymentData", Syntax.PROTO_2, null, "squareup/cash/local/activity/local_order_render_data.proto");
            ADAPTER = cashAppLocalOrderRenderData$OrderPaymentData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppLocalOrderRenderData$OrderPaymentData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderPaymentData(OrderPaymentStatus orderPaymentStatus, CashInstrumentType cashInstrumentType, String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.status = orderPaymentStatus;
            this.instrument_type = cashInstrumentType;
            this.instrument_display_name = str;
            this.transaction_number = str2;
            this.square_payment_token = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OrderPaymentData)) {
                return false;
            }
            OrderPaymentData orderPaymentData = (OrderPaymentData) obj;
            return Intrinsics.areEqual(unknownFields(), orderPaymentData.unknownFields()) && this.status == orderPaymentData.status && this.instrument_type == orderPaymentData.instrument_type && Intrinsics.areEqual(this.instrument_display_name, orderPaymentData.instrument_display_name) && Intrinsics.areEqual(this.transaction_number, orderPaymentData.transaction_number) && Intrinsics.areEqual(this.square_payment_token, orderPaymentData.square_payment_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            OrderPaymentStatus orderPaymentStatus = this.status;
            int hashCode2 = (hashCode + (orderPaymentStatus != null ? orderPaymentStatus.hashCode() : 0)) * 37;
            CashInstrumentType cashInstrumentType = this.instrument_type;
            int hashCode3 = (hashCode2 + (cashInstrumentType != null ? cashInstrumentType.hashCode() : 0)) * 37;
            String str = this.instrument_display_name;
            int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.transaction_number;
            int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.square_payment_token;
            int hashCode6 = hashCode5 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Text.Builder builder = new Text.Builder(19);
            builder.text_style = this.status;
            builder.text_decoration = this.instrument_type;
            builder.text = this.instrument_display_name;
            builder.text_color = this.transaction_number;
            builder.icon = this.square_payment_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            OrderPaymentStatus orderPaymentStatus = this.status;
            if (orderPaymentStatus != null) {
                arrayList.add("status=" + orderPaymentStatus);
            }
            CashInstrumentType cashInstrumentType = this.instrument_type;
            if (cashInstrumentType != null) {
                arrayList.add("instrument_type=" + cashInstrumentType);
            }
            String str = this.instrument_display_name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instrument_display_name=", arrayList);
            }
            String str2 = this.transaction_number;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "transaction_number=", arrayList);
            }
            String str3 = this.square_payment_token;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "square_payment_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OrderPaymentData{", "}", 0, null, null, 56);
        }
    }

    public enum OrderStatus implements WireEnum {
        ORDER_STATUS_UNSPECIFIED(0),
        ORDER_STATUS_IN_PROGRESS(1),
        ORDER_STATUS_READY_FOR_PICKUP(2),
        ORDER_STATUS_ORDER_COMPLETED(3);

        public static final CashAppLocalOrderRenderData$OrderStatus$Companion$ADAPTER$1 ADAPTER;
        public static final ContactAliasType.Companion Companion;
        public final int value;

        static {
            OrderStatus orderStatus = ORDER_STATUS_UNSPECIFIED;
            Companion = new ContactAliasType.Companion();
            ADAPTER = new CashAppLocalOrderRenderData$OrderStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OrderStatus.class), Syntax.PROTO_2, orderStatus);
        }

        OrderStatus(int i) {
            this.value = i;
        }

        public static final OrderStatus fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return ORDER_STATUS_UNSPECIFIED;
            }
            if (i == 1) {
                return ORDER_STATUS_IN_PROGRESS;
            }
            if (i == 2) {
                return ORDER_STATUS_READY_FOR_PICKUP;
            }
            if (i != 3) {
                return null;
            }
            return ORDER_STATUS_ORDER_COMPLETED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CashAppLocalOrderRenderData$Companion$ADAPTER$1 cashAppLocalOrderRenderData$Companion$ADAPTER$1 = new CashAppLocalOrderRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashAppLocalOrderRenderData.class), "type.googleapis.com/squareup.cash.local.activity.CashAppLocalOrderRenderData", Syntax.PROTO_2, null, "squareup/cash/local/activity/local_order_render_data.proto");
        ADAPTER = cashAppLocalOrderRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppLocalOrderRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppLocalOrderRenderData(String str, OrderStatus orderStatus, String str2, String str3, String str4, List list, Actions actions, Money money, Money money2, Money money3, Money money4, Money money5, OrderPaymentData orderPaymentData, Money money6, LocalCashData localCashData, OrderActivityEntry orderActivityEntry, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.brand_name = str;
        this.order_status = orderStatus;
        this.buyer_name = str2;
        this.pickup_time = str3;
        this.location_address = str4;
        this.actions = actions;
        this.order_subtotal_amount = money;
        this.order_tax_amount = money2;
        this.order_tip_amount = money3;
        this.order_fee_amount = money4;
        this.order_total_amount = money5;
        this.order_payment_data = orderPaymentData;
        this.total_amount_paid_by_buyer = money6;
        this.local_cash_data = localCashData;
        this.order_activity_entry = orderActivityEntry;
        this.order_lines = TransactorKt.immutableCopyOf("order_lines", list);
        this.adjustment_lines = TransactorKt.immutableCopyOf("adjustment_lines", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashAppLocalOrderRenderData)) {
            return false;
        }
        CashAppLocalOrderRenderData cashAppLocalOrderRenderData = (CashAppLocalOrderRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), cashAppLocalOrderRenderData.unknownFields()) && Intrinsics.areEqual(this.brand_name, cashAppLocalOrderRenderData.brand_name) && this.order_status == cashAppLocalOrderRenderData.order_status && Intrinsics.areEqual(this.buyer_name, cashAppLocalOrderRenderData.buyer_name) && Intrinsics.areEqual(this.pickup_time, cashAppLocalOrderRenderData.pickup_time) && Intrinsics.areEqual(this.location_address, cashAppLocalOrderRenderData.location_address) && Intrinsics.areEqual(this.order_lines, cashAppLocalOrderRenderData.order_lines) && Intrinsics.areEqual(this.actions, cashAppLocalOrderRenderData.actions) && Intrinsics.areEqual(this.order_subtotal_amount, cashAppLocalOrderRenderData.order_subtotal_amount) && Intrinsics.areEqual(this.order_tax_amount, cashAppLocalOrderRenderData.order_tax_amount) && Intrinsics.areEqual(this.order_tip_amount, cashAppLocalOrderRenderData.order_tip_amount) && Intrinsics.areEqual(this.order_fee_amount, cashAppLocalOrderRenderData.order_fee_amount) && Intrinsics.areEqual(this.order_total_amount, cashAppLocalOrderRenderData.order_total_amount) && Intrinsics.areEqual(this.order_payment_data, cashAppLocalOrderRenderData.order_payment_data) && Intrinsics.areEqual(this.total_amount_paid_by_buyer, cashAppLocalOrderRenderData.total_amount_paid_by_buyer) && Intrinsics.areEqual(this.local_cash_data, cashAppLocalOrderRenderData.local_cash_data) && Intrinsics.areEqual(this.order_activity_entry, cashAppLocalOrderRenderData.order_activity_entry) && Intrinsics.areEqual(this.adjustment_lines, cashAppLocalOrderRenderData.adjustment_lines);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.brand_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        OrderStatus orderStatus = this.order_status;
        int hashCode3 = (hashCode2 + (orderStatus != null ? orderStatus.hashCode() : 0)) * 37;
        String str2 = this.buyer_name;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.pickup_time;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.location_address;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37, 37, this.order_lines);
        Actions actions = this.actions;
        int hashCode6 = (m + (actions != null ? actions.hashCode() : 0)) * 37;
        Money money = this.order_subtotal_amount;
        int hashCode7 = (hashCode6 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.order_tax_amount;
        int hashCode8 = (hashCode7 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.order_tip_amount;
        int hashCode9 = (hashCode8 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.order_fee_amount;
        int hashCode10 = (hashCode9 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Money money5 = this.order_total_amount;
        int hashCode11 = (hashCode10 + (money5 != null ? money5.hashCode() : 0)) * 37;
        OrderPaymentData orderPaymentData = this.order_payment_data;
        int hashCode12 = (hashCode11 + (orderPaymentData != null ? orderPaymentData.hashCode() : 0)) * 37;
        Money money6 = this.total_amount_paid_by_buyer;
        int hashCode13 = (hashCode12 + (money6 != null ? money6.hashCode() : 0)) * 37;
        LocalCashData localCashData = this.local_cash_data;
        int hashCode14 = (hashCode13 + (localCashData != null ? localCashData.hashCode() : 0)) * 37;
        OrderActivityEntry orderActivityEntry = this.order_activity_entry;
        int hashCode15 = this.adjustment_lines.hashCode() + ((hashCode14 + (orderActivityEntry != null ? orderActivityEntry.hashCode() : 0)) * 37);
        this.hashCode = hashCode15;
        return hashCode15;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Timecard.Builder builder = new Timecard.Builder(5);
        builder.token = this.brand_name;
        builder.clockin_unit_token = this.order_status;
        builder.shift_id = this.buyer_name;
        builder.merchant_token = this.pickup_time;
        builder.employee_token = this.location_address;
        builder.clockout_unit_token = this.order_lines;
        builder.note = this.actions;
        builder.hourly_wage = this.order_subtotal_amount;
        builder.declared_tip = this.order_tax_amount;
        builder.employee = this.order_tip_amount;
        builder.deleted = this.order_fee_amount;
        builder.was_automatically_clocked_out = this.order_total_amount;
        builder.clockin_timestamp_ms = this.order_payment_data;
        builder.clockout_timestamp_ms = this.total_amount_paid_by_buyer;
        builder.created_at_timestamp_ms = this.local_cash_data;
        builder.updated_at_timestamp_ms = this.order_activity_entry;
        builder.employee_job_info = this.adjustment_lines;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.brand_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "brand_name=", arrayList);
        }
        OrderStatus orderStatus = this.order_status;
        if (orderStatus != null) {
            arrayList.add("order_status=" + orderStatus);
        }
        if (this.buyer_name != null) {
            arrayList.add("buyer_name=██");
        }
        String str2 = this.pickup_time;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "pickup_time=", arrayList);
        }
        String str3 = this.location_address;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "location_address=", arrayList);
        }
        List list = this.order_lines;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("order_lines=", arrayList, list);
        }
        Actions actions = this.actions;
        if (actions != null) {
            arrayList.add("actions=" + actions);
        }
        Money money = this.order_subtotal_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("order_subtotal_amount=", money, arrayList);
        }
        Money money2 = this.order_tax_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("order_tax_amount=", money2, arrayList);
        }
        Money money3 = this.order_tip_amount;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("order_tip_amount=", money3, arrayList);
        }
        Money money4 = this.order_fee_amount;
        if (money4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("order_fee_amount=", money4, arrayList);
        }
        Money money5 = this.order_total_amount;
        if (money5 != null) {
            Matcher$$ExternalSyntheticOutline0.m("order_total_amount=", money5, arrayList);
        }
        OrderPaymentData orderPaymentData = this.order_payment_data;
        if (orderPaymentData != null) {
            arrayList.add("order_payment_data=" + orderPaymentData);
        }
        Money money6 = this.total_amount_paid_by_buyer;
        if (money6 != null) {
            Matcher$$ExternalSyntheticOutline0.m("total_amount_paid_by_buyer=", money6, arrayList);
        }
        LocalCashData localCashData = this.local_cash_data;
        if (localCashData != null) {
            arrayList.add("local_cash_data=" + localCashData);
        }
        OrderActivityEntry orderActivityEntry = this.order_activity_entry;
        if (orderActivityEntry != null) {
            arrayList.add("order_activity_entry=" + orderActivityEntry);
        }
        List list2 = this.adjustment_lines;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("adjustment_lines=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAppLocalOrderRenderData{", "}", 0, null, null, 56);
    }
}

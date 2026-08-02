package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.AppLinks;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.protos.franklin.investing.resources.OrderType;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes8.dex */
public final class InvestPaymentRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InvestPaymentRenderData> CREATOR;
    public final String invest_payment_identifier;
    public final InvestmentEntityRenderData investment_entity_render_data;
    public final RecipientData recipient_data;
    public final SenderData sender_data;

    public final class RecipientData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RecipientData> CREATOR;
        public final String action_deep_link;
        public final String cancel_deep_link;
        public final String crypto_order_token;
        public final Money fees;
        public final String localized_market_hours;
        public final OrderType order_type;
        public final String owner_customer_token;
        public final Money share_price;
        public final String shares;
        public final Status status;
        public final String trade_confirmation_file_key;
        public final String view_equity_link;

        public enum Status implements WireEnum {
            WAITING_ON_BROKER_REVIEW(8),
            WAITING_ON_RECIPIENT(1),
            ORDER_SCHEDULED(2),
            ORDER_PLACED(3),
            COMPLETE(4),
            DECLINED_TO_REFUND(5),
            EXPIRED(6),
            BROKER_REVIEW_FAILED(7),
            CASH_IN_COMPLETE(9),
            REFUNDED(10),
            WAITING_ON_CASH_IN(11),
            WAITING_ON_P2P_CORE(12),
            CANCELED(13);

            public final int value;
            public static final LinkResult.Companion Companion = new LinkResult.Companion();
            public static final InvestPaymentRenderData$RecipientData$Status$Companion$ADAPTER$1 ADAPTER = new InvestPaymentRenderData$RecipientData$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, null);

            Status(int i) {
                this.value = i;
            }

            public static final Status fromValue(int i) {
                Companion.getClass();
                return LinkResult.Companion.m3957fromValue(i);
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            InvestPaymentRenderData$RecipientData$Companion$ADAPTER$1 investPaymentRenderData$RecipientData$Companion$ADAPTER$1 = new InvestPaymentRenderData$RecipientData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecipientData.class), "type.googleapis.com/squareup.franklin.InvestPaymentRenderData.RecipientData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = investPaymentRenderData$RecipientData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(investPaymentRenderData$RecipientData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecipientData(String str, String str2, String str3, String str4, Status status, String str5, OrderType orderType, Money money, Money money2, String str6, String str7, String str8, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.shares = str;
            this.action_deep_link = str2;
            this.localized_market_hours = str3;
            this.trade_confirmation_file_key = str4;
            this.status = status;
            this.view_equity_link = str5;
            this.order_type = orderType;
            this.share_price = money;
            this.fees = money2;
            this.crypto_order_token = str6;
            this.cancel_deep_link = str7;
            this.owner_customer_token = str8;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RecipientData)) {
                return false;
            }
            RecipientData recipientData = (RecipientData) obj;
            return Intrinsics.areEqual(unknownFields(), recipientData.unknownFields()) && Intrinsics.areEqual(this.shares, recipientData.shares) && Intrinsics.areEqual(this.action_deep_link, recipientData.action_deep_link) && Intrinsics.areEqual(this.localized_market_hours, recipientData.localized_market_hours) && Intrinsics.areEqual(this.trade_confirmation_file_key, recipientData.trade_confirmation_file_key) && this.status == recipientData.status && Intrinsics.areEqual(this.view_equity_link, recipientData.view_equity_link) && this.order_type == recipientData.order_type && Intrinsics.areEqual(this.share_price, recipientData.share_price) && Intrinsics.areEqual(this.fees, recipientData.fees) && Intrinsics.areEqual(this.crypto_order_token, recipientData.crypto_order_token) && Intrinsics.areEqual(this.cancel_deep_link, recipientData.cancel_deep_link) && Intrinsics.areEqual(this.owner_customer_token, recipientData.owner_customer_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.shares;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.action_deep_link;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.localized_market_hours;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.trade_confirmation_file_key;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            Status status = this.status;
            int hashCode6 = (hashCode5 + (status != null ? status.hashCode() : 0)) * 37;
            String str5 = this.view_equity_link;
            int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
            OrderType orderType = this.order_type;
            int hashCode8 = (hashCode7 + (orderType != null ? orderType.hashCode() : 0)) * 37;
            Money money = this.share_price;
            int hashCode9 = (hashCode8 + (money != null ? money.hashCode() : 0)) * 37;
            Money money2 = this.fees;
            int hashCode10 = (hashCode9 + (money2 != null ? money2.hashCode() : 0)) * 37;
            String str6 = this.crypto_order_token;
            int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 37;
            String str7 = this.cancel_deep_link;
            int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 37;
            String str8 = this.owner_customer_token;
            int hashCode13 = hashCode12 + (str8 != null ? str8.hashCode() : 0);
            this.hashCode = hashCode13;
            return hashCode13;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Expression.Builder builder = new Expression.Builder(21, false);
            builder.string_literal = this.shares;
            builder.key_path_ref = this.action_deep_link;
            builder.int_literal = this.localized_market_hours;
            builder.float_literal = this.trade_confirmation_file_key;
            builder.bool_literal = this.status;
            builder.blob_literal = this.view_equity_link;
            builder.unary_op = this.order_type;
            builder.binary_op = this.share_price;
            builder.conditional_op = this.fees;
            builder.filter_op = this.crypto_order_token;
            builder.collection_literal = this.cancel_deep_link;
            builder.format_string_op = this.owner_customer_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.shares;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "shares=", arrayList);
            }
            String str2 = this.action_deep_link;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "action_deep_link=", arrayList);
            }
            String str3 = this.localized_market_hours;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "localized_market_hours=", arrayList);
            }
            String str4 = this.trade_confirmation_file_key;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "trade_confirmation_file_key=", arrayList);
            }
            Status status = this.status;
            if (status != null) {
                arrayList.add("status=" + status);
            }
            String str5 = this.view_equity_link;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "view_equity_link=", arrayList);
            }
            OrderType orderType = this.order_type;
            if (orderType != null) {
                arrayList.add("order_type=" + orderType);
            }
            Money money = this.share_price;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("share_price=", money, arrayList);
            }
            Money money2 = this.fees;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("fees=", money2, arrayList);
            }
            String str6 = this.crypto_order_token;
            if (str6 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "crypto_order_token=", arrayList);
            }
            String str7 = this.cancel_deep_link;
            if (str7 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "cancel_deep_link=", arrayList);
            }
            String str8 = this.owner_customer_token;
            if (str8 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "owner_customer_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RecipientData{", "}", 0, null, null, 56);
        }
    }

    public final class SenderData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SenderData> CREATOR;
        public final String shares;
        public final Status status;

        public enum Status implements WireEnum {
            SENT(1),
            REFUNDED(2),
            WAITING_ON_FUNDING(3);

            public final int value;
            public static final Trigger.Companion Companion = new Trigger.Companion();
            public static final InvestPaymentRenderData$SenderData$Status$Companion$ADAPTER$1 ADAPTER = new InvestPaymentRenderData$SenderData$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, null);

            Status(int i) {
                this.value = i;
            }

            public static final Status fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return SENT;
                }
                if (i == 2) {
                    return REFUNDED;
                }
                if (i != 3) {
                    return null;
                }
                return WAITING_ON_FUNDING;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            InvestPaymentRenderData$SenderData$Companion$ADAPTER$1 investPaymentRenderData$SenderData$Companion$ADAPTER$1 = new InvestPaymentRenderData$SenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SenderData.class), "type.googleapis.com/squareup.franklin.InvestPaymentRenderData.SenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = investPaymentRenderData$SenderData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(investPaymentRenderData$SenderData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SenderData(Status status, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.status = status;
            this.shares = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SenderData)) {
                return false;
            }
            SenderData senderData = (SenderData) obj;
            return Intrinsics.areEqual(unknownFields(), senderData.unknownFields()) && this.status == senderData.status && Intrinsics.areEqual(this.shares, senderData.shares);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Status status = this.status;
            int hashCode2 = (hashCode + (status != null ? status.hashCode() : 0)) * 37;
            String str = this.shares;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            AppLinks.Builder builder = new AppLinks.Builder(10);
            builder.f1372android = this.status;
            builder.ios = this.shares;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Status status = this.status;
            if (status != null) {
                arrayList.add("status=" + status);
            }
            String str = this.shares;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "shares=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SenderData{", "}", 0, null, null, 56);
        }
    }

    static {
        InvestPaymentRenderData$Companion$ADAPTER$1 investPaymentRenderData$Companion$ADAPTER$1 = new InvestPaymentRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InvestPaymentRenderData.class), "type.googleapis.com/squareup.franklin.InvestPaymentRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = investPaymentRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(investPaymentRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestPaymentRenderData(InvestmentEntityRenderData investmentEntityRenderData, String str, RecipientData recipientData, SenderData senderData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.investment_entity_render_data = investmentEntityRenderData;
        this.invest_payment_identifier = str;
        this.recipient_data = recipientData;
        this.sender_data = senderData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InvestPaymentRenderData)) {
            return false;
        }
        InvestPaymentRenderData investPaymentRenderData = (InvestPaymentRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), investPaymentRenderData.unknownFields()) && Intrinsics.areEqual(this.investment_entity_render_data, investPaymentRenderData.investment_entity_render_data) && Intrinsics.areEqual(this.invest_payment_identifier, investPaymentRenderData.invest_payment_identifier) && Intrinsics.areEqual(this.recipient_data, investPaymentRenderData.recipient_data) && Intrinsics.areEqual(this.sender_data, investPaymentRenderData.sender_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        InvestmentEntityRenderData investmentEntityRenderData = this.investment_entity_render_data;
        int hashCode2 = (hashCode + (investmentEntityRenderData != null ? investmentEntityRenderData.hashCode() : 0)) * 37;
        String str = this.invest_payment_identifier;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        RecipientData recipientData = this.recipient_data;
        int hashCode4 = (hashCode3 + (recipientData != null ? recipientData.hashCode() : 0)) * 37;
        SenderData senderData = this.sender_data;
        int hashCode5 = hashCode4 + (senderData != null ? senderData.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ColoredButton.Builder builder = new ColoredButton.Builder(23);
        builder.button_color = this.investment_entity_render_data;
        builder.text_color = this.invest_payment_identifier;
        builder.text = this.recipient_data;
        builder.action = this.sender_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        InvestmentEntityRenderData investmentEntityRenderData = this.investment_entity_render_data;
        if (investmentEntityRenderData != null) {
            arrayList.add("investment_entity_render_data=" + investmentEntityRenderData);
        }
        String str = this.invest_payment_identifier;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "invest_payment_identifier=", arrayList);
        }
        RecipientData recipientData = this.recipient_data;
        if (recipientData != null) {
            arrayList.add("recipient_data=" + recipientData);
        }
        SenderData senderData = this.sender_data;
        if (senderData != null) {
            arrayList.add("sender_data=" + senderData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvestPaymentRenderData{", "}", 0, null, null, 56);
    }
}

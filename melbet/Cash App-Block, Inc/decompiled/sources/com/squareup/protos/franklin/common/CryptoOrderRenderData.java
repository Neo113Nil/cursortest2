package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.investcrypto.resources.OrderStateReason;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.protos.franklin.lending.CreditLine;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.hieroglyph.KeyScope;
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

/* loaded from: classes8.dex */
public final class CryptoOrderRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CryptoOrderRenderData> CREATOR;
    public final Money crypto_amount;
    public final CryptoPayrollRenderData crypto_payroll_render_data;
    public final Money current_price;
    public final Long expiration_epoch_ms;
    public final OrderFeature feature;
    public final Money fee;
    public final Money fiat_amount;
    public final Money immediately_available_amount;
    public final OrderStateReason order_state_reason;
    public final Money original_price;
    public final OrderSide side;
    public final String source_instrument_token;
    public final String source_transaction_token;
    public final OrderState state;
    public final String target_instrument_token;
    public final Money target_price;
    public final String target_transaction_token;
    public final String token;

    /* renamed from: type, reason: collision with root package name */
    public final OrderType f1376type;

    public enum OrderFeature implements WireEnum {
        MANUAL(1),
        MANUAL_RECURRING(2),
        CASH_CARD_BOOST(3),
        P2P_GIFTING(4),
        PAYROLL_CONVERSION(5),
        CASH_CARD_ROUND_UP(6),
        SQUARE_BITCOIN_SAVINGS(7),
        CANCELED_SPONSORSHIP(8),
        REVERSAL(9),
        BITKEY_TRANSFER(10),
        USD_ON_LN_PAYMENT(11),
        BTC_CARD_SPEND(12),
        ACH_CLAWBACK(13),
        BITCOIN_MODE_REWARD(14),
        P2P_RECEIVE(15);

        public final int value;
        public static final UiControl.Type.Companion Companion = new UiControl.Type.Companion();
        public static final CryptoOrderRenderData$OrderFeature$Companion$ADAPTER$1 ADAPTER = new CryptoOrderRenderData$OrderFeature$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OrderFeature.class), Syntax.PROTO_2, null);

        OrderFeature(int i) {
            this.value = i;
        }

        public static final OrderFeature fromValue(int i) {
            Companion.getClass();
            return UiControl.Type.Companion.m3963fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum OrderSide implements WireEnum {
        BUY(1),
        SELL(2);

        public final int value;
        public static final LinkResult.Companion Companion = new LinkResult.Companion();
        public static final CryptoOrderRenderData$OrderSide$Companion$ADAPTER$1 ADAPTER = new CryptoOrderRenderData$OrderSide$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OrderSide.class), Syntax.PROTO_2, null);

        OrderSide(int i) {
            this.value = i;
        }

        public static final OrderSide fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return BUY;
            }
            if (i != 2) {
                return null;
            }
            return SELL;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum OrderState implements WireEnum {
        QUOTED(1),
        ABANDONED(2),
        PLACED(3),
        FILLED(4),
        CANCELED(5),
        REJECTED(6),
        EXPIRED(7);

        public final int value;
        public static final Trigger.Companion Companion = new Trigger.Companion();
        public static final CryptoOrderRenderData$OrderState$Companion$ADAPTER$1 ADAPTER = new CryptoOrderRenderData$OrderState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OrderState.class), Syntax.PROTO_2, null);

        OrderState(int i) {
            this.value = i;
        }

        public static final OrderState fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 1:
                    return QUOTED;
                case 2:
                    return ABANDONED;
                case 3:
                    return PLACED;
                case 4:
                    return FILLED;
                case 5:
                    return CANCELED;
                case 6:
                    return REJECTED;
                case 7:
                    return EXPIRED;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum OrderType implements WireEnum {
        MARKET(1),
        CUSTOM(2);

        public final int value;
        public static final KeyScope.Companion Companion = new KeyScope.Companion();
        public static final CryptoOrderRenderData$OrderType$Companion$ADAPTER$1 ADAPTER = new CryptoOrderRenderData$OrderType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OrderType.class), Syntax.PROTO_2, null);

        OrderType(int i) {
            this.value = i;
        }

        public static final OrderType fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return MARKET;
            }
            if (i != 2) {
                return null;
            }
            return CUSTOM;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CryptoOrderRenderData$Companion$ADAPTER$1 cryptoOrderRenderData$Companion$ADAPTER$1 = new CryptoOrderRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CryptoOrderRenderData.class), "type.googleapis.com/squareup.franklin.CryptoOrderRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = cryptoOrderRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cryptoOrderRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoOrderRenderData(String str, OrderSide orderSide, OrderType orderType, OrderState orderState, Money money, Money money2, Money money3, Money money4, Money money5, Money money6, Long l, CryptoPayrollRenderData cryptoPayrollRenderData, OrderStateReason orderStateReason, OrderFeature orderFeature, String str2, String str3, String str4, String str5, Money money7, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.side = orderSide;
        this.f1376type = orderType;
        this.state = orderState;
        this.crypto_amount = money;
        this.fiat_amount = money2;
        this.fee = money3;
        this.current_price = money4;
        this.target_price = money5;
        this.original_price = money6;
        this.expiration_epoch_ms = l;
        this.crypto_payroll_render_data = cryptoPayrollRenderData;
        this.order_state_reason = orderStateReason;
        this.feature = orderFeature;
        this.source_instrument_token = str2;
        this.target_instrument_token = str3;
        this.source_transaction_token = str4;
        this.target_transaction_token = str5;
        this.immediately_available_amount = money7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CryptoOrderRenderData)) {
            return false;
        }
        CryptoOrderRenderData cryptoOrderRenderData = (CryptoOrderRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), cryptoOrderRenderData.unknownFields()) && Intrinsics.areEqual(this.token, cryptoOrderRenderData.token) && this.side == cryptoOrderRenderData.side && this.f1376type == cryptoOrderRenderData.f1376type && this.state == cryptoOrderRenderData.state && Intrinsics.areEqual(this.crypto_amount, cryptoOrderRenderData.crypto_amount) && Intrinsics.areEqual(this.fiat_amount, cryptoOrderRenderData.fiat_amount) && Intrinsics.areEqual(this.fee, cryptoOrderRenderData.fee) && Intrinsics.areEqual(this.current_price, cryptoOrderRenderData.current_price) && Intrinsics.areEqual(this.target_price, cryptoOrderRenderData.target_price) && Intrinsics.areEqual(this.original_price, cryptoOrderRenderData.original_price) && Intrinsics.areEqual(this.expiration_epoch_ms, cryptoOrderRenderData.expiration_epoch_ms) && Intrinsics.areEqual(this.crypto_payroll_render_data, cryptoOrderRenderData.crypto_payroll_render_data) && this.order_state_reason == cryptoOrderRenderData.order_state_reason && this.feature == cryptoOrderRenderData.feature && Intrinsics.areEqual(this.source_instrument_token, cryptoOrderRenderData.source_instrument_token) && Intrinsics.areEqual(this.target_instrument_token, cryptoOrderRenderData.target_instrument_token) && Intrinsics.areEqual(this.source_transaction_token, cryptoOrderRenderData.source_transaction_token) && Intrinsics.areEqual(this.target_transaction_token, cryptoOrderRenderData.target_transaction_token) && Intrinsics.areEqual(this.immediately_available_amount, cryptoOrderRenderData.immediately_available_amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        OrderSide orderSide = this.side;
        int hashCode3 = (hashCode2 + (orderSide != null ? orderSide.hashCode() : 0)) * 37;
        OrderType orderType = this.f1376type;
        int hashCode4 = (hashCode3 + (orderType != null ? orderType.hashCode() : 0)) * 37;
        OrderState orderState = this.state;
        int hashCode5 = (hashCode4 + (orderState != null ? orderState.hashCode() : 0)) * 37;
        Money money = this.crypto_amount;
        int hashCode6 = (hashCode5 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.fiat_amount;
        int hashCode7 = (hashCode6 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.fee;
        int hashCode8 = (hashCode7 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.current_price;
        int hashCode9 = (hashCode8 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Money money5 = this.target_price;
        int hashCode10 = (hashCode9 + (money5 != null ? money5.hashCode() : 0)) * 37;
        Money money6 = this.original_price;
        int hashCode11 = (hashCode10 + (money6 != null ? money6.hashCode() : 0)) * 37;
        Long l = this.expiration_epoch_ms;
        int hashCode12 = (hashCode11 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        CryptoPayrollRenderData cryptoPayrollRenderData = this.crypto_payroll_render_data;
        int hashCode13 = (hashCode12 + (cryptoPayrollRenderData != null ? cryptoPayrollRenderData.hashCode() : 0)) * 37;
        OrderStateReason orderStateReason = this.order_state_reason;
        int hashCode14 = (hashCode13 + (orderStateReason != null ? orderStateReason.hashCode() : 0)) * 37;
        OrderFeature orderFeature = this.feature;
        int hashCode15 = (hashCode14 + (orderFeature != null ? orderFeature.hashCode() : 0)) * 37;
        String str2 = this.source_instrument_token;
        int hashCode16 = (hashCode15 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.target_instrument_token;
        int hashCode17 = (hashCode16 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.source_transaction_token;
        int hashCode18 = (hashCode17 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.target_transaction_token;
        int hashCode19 = (hashCode18 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Money money7 = this.immediately_available_amount;
        int hashCode20 = hashCode19 + (money7 != null ? money7.hashCode() : 0);
        this.hashCode = hashCode20;
        return hashCode20;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CreditLine.Builder builder = new CreditLine.Builder(4);
        builder.token = this.token;
        builder.setup_fee_bps = this.side;
        builder.quick_amounts = this.f1376type;
        builder.first_time_borrow_data = this.state;
        builder.credit_limit = this.crypto_amount;
        builder.available_amount = this.fiat_amount;
        builder.outstanding_amount = this.fee;
        builder.minimum_loan_amount = this.current_price;
        builder.unlock_borrow_data = this.target_price;
        builder.credit_line_status_icon = this.original_price;
        builder.skip_loan_amount_selection = this.expiration_epoch_ms;
        builder.lending_product = this.crypto_payroll_render_data;
        builder.credit_line_status_data = this.order_state_reason;
        builder.credit_line_limit_data = this.feature;
        builder.instrument_display_name = this.source_instrument_token;
        builder.instrument_subtitle = this.target_instrument_token;
        builder.alert = this.source_transaction_token;
        builder.localizable_instrument_display_name = this.target_transaction_token;
        builder.localizable_instrument_subtitle = this.immediately_available_amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        OrderSide orderSide = this.side;
        if (orderSide != null) {
            arrayList.add("side=" + orderSide);
        }
        OrderType orderType = this.f1376type;
        if (orderType != null) {
            arrayList.add("type=" + orderType);
        }
        OrderState orderState = this.state;
        if (orderState != null) {
            arrayList.add("state=" + orderState);
        }
        Money money = this.crypto_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("crypto_amount=", money, arrayList);
        }
        Money money2 = this.fiat_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("fiat_amount=", money2, arrayList);
        }
        Money money3 = this.fee;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("fee=", money3, arrayList);
        }
        Money money4 = this.current_price;
        if (money4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("current_price=", money4, arrayList);
        }
        Money money5 = this.target_price;
        if (money5 != null) {
            Matcher$$ExternalSyntheticOutline0.m("target_price=", money5, arrayList);
        }
        Money money6 = this.original_price;
        if (money6 != null) {
            Matcher$$ExternalSyntheticOutline0.m("original_price=", money6, arrayList);
        }
        Long l = this.expiration_epoch_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expiration_epoch_ms=", l, arrayList);
        }
        CryptoPayrollRenderData cryptoPayrollRenderData = this.crypto_payroll_render_data;
        if (cryptoPayrollRenderData != null) {
            arrayList.add("crypto_payroll_render_data=" + cryptoPayrollRenderData);
        }
        OrderStateReason orderStateReason = this.order_state_reason;
        if (orderStateReason != null) {
            arrayList.add("order_state_reason=" + orderStateReason);
        }
        OrderFeature orderFeature = this.feature;
        if (orderFeature != null) {
            arrayList.add("feature=" + orderFeature);
        }
        String str2 = this.source_instrument_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "source_instrument_token=", arrayList);
        }
        String str3 = this.target_instrument_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "target_instrument_token=", arrayList);
        }
        String str4 = this.source_transaction_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "source_transaction_token=", arrayList);
        }
        String str5 = this.target_transaction_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "target_transaction_token=", arrayList);
        }
        Money money7 = this.immediately_available_amount;
        if (money7 != null) {
            Matcher$$ExternalSyntheticOutline0.m("immediately_available_amount=", money7, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoOrderRenderData{", "}", 0, null, null, 56);
    }
}

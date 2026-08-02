package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Order$Companion$ADAPTER$1 extends ProtoAdapter {
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.squareup.wire.ProtoAdapter
    public final java.lang.Object decode(com.squareup.wire.ProtoReader r87) {
        /*
            Method dump skipped, instructions count: 1192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.protos.cash.investcrypto.resources.Order$Companion$ADAPTER$1.decode(com.squareup.wire.ProtoReader):java.lang.Object");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Order order = (Order) obj;
        reverseProtoWriter.getClass();
        order.getClass();
        reverseProtoWriter.writeBytes(order.unknownFields());
        TradingModel.ADAPTER.encodeWithTag(reverseProtoWriter, 38, order.trading_model);
        Order.FundingSource.ADAPTER.encodeWithTag(reverseProtoWriter, 37, order.funding_source);
        Order.OrderSponsorship.ADAPTER.encodeWithTag(reverseProtoWriter, 36, order.order_sponsorship);
        ProtoAdapter protoAdapter = ProtoAdapter.DOUBLE;
        protoAdapter.encodeWithTag(reverseProtoWriter, 35, order.incorporated_spread_bps);
        protoAdapter.encodeWithTag(reverseProtoWriter, 34, order.price_spread_bps);
        Order.FeatureMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 33, order.feature_metadata);
        PriceStrategy.ADAPTER.encodeWithTag(reverseProtoWriter, 32, order.price_strategy);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 31, order.spread_price_fee);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 30, order.reference_price);
        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 29, order.target_transaction_token);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 28, order.source_transaction_token);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 27, order.target_instrument_token);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 26, order.source_instrument_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 25, order.target_money);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 24, order.source_money);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 23, order.push_transaction_token);
        Order.RecurringSchedule.ADAPTER.encodeWithTag(reverseProtoWriter, 22, order.recurring_schedule);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 19, order.idempotence_token);
        Order.Feature.ADAPTER.encodeWithTag(reverseProtoWriter, 21, order.feature);
        Origin.ADAPTER.encodeWithTag(reverseProtoWriter, 18, order.origin);
        ProtoAdapter protoAdapter4 = ProtoAdapter.UINT64;
        protoAdapter4.encodeWithTag(reverseProtoWriter, 17, order.creation_epoch_ms);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 16, order.customer_token);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 15, order.funding_transaction_token);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 14, order.crypto_instrument_token);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 13, order.fiat_instrument_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 12, order.final_price);
        protoAdapter4.encodeWithTag(reverseProtoWriter, 11, order.expiration_epoch_ms);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, order.original_price);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, order.target_price);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, order.current_price);
        FeeStrategy.ADAPTER.encodeWithTag(reverseProtoWriter, 20, order.fee_strategy);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, order.fee);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, order.fiat_amount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, order.crypto_amount);
        OrderState.ADAPTER.encodeWithTag(reverseProtoWriter, 4, order.state);
        OrderType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, order.f1280type);
        OrderSide.ADAPTER.encodeWithTag(reverseProtoWriter, 2, order.side);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 1, order.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Order order = (Order) obj;
        order.getClass();
        int size$okio = order.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = OrderState.ADAPTER.encodedSizeWithTag(4, order.state) + OrderType.ADAPTER.encodedSizeWithTag(3, order.f1280type) + OrderSide.ADAPTER.encodedSizeWithTag(2, order.side) + protoAdapter.encodedSizeWithTag(1, order.token) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(10, order.original_price) + protoAdapter2.encodedSizeWithTag(9, order.target_price) + protoAdapter2.encodedSizeWithTag(8, order.current_price) + FeeStrategy.ADAPTER.encodedSizeWithTag(20, order.fee_strategy) + protoAdapter2.encodedSizeWithTag(7, order.fee) + protoAdapter2.encodedSizeWithTag(6, order.fiat_amount) + protoAdapter2.encodedSizeWithTag(5, order.crypto_amount) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.UINT64;
        int encodedSizeWithTag3 = Order.FeatureMetadata.ADAPTER.encodedSizeWithTag(33, order.feature_metadata) + PriceStrategy.ADAPTER.encodedSizeWithTag(32, order.price_strategy) + protoAdapter2.encodedSizeWithTag(31, order.spread_price_fee) + protoAdapter2.encodedSizeWithTag(30, order.reference_price) + protoAdapter.encodedSizeWithTag(29, order.target_transaction_token) + protoAdapter.encodedSizeWithTag(28, order.source_transaction_token) + protoAdapter.encodedSizeWithTag(27, order.target_instrument_token) + protoAdapter.encodedSizeWithTag(26, order.source_instrument_token) + protoAdapter2.encodedSizeWithTag(25, order.target_money) + protoAdapter2.encodedSizeWithTag(24, order.source_money) + protoAdapter.encodedSizeWithTag(23, order.push_transaction_token) + Order.RecurringSchedule.ADAPTER.encodedSizeWithTag(22, order.recurring_schedule) + protoAdapter.encodedSizeWithTag(19, order.idempotence_token) + Order.Feature.ADAPTER.encodedSizeWithTag(21, order.feature) + Origin.ADAPTER.encodedSizeWithTag(18, order.origin) + protoAdapter3.encodedSizeWithTag(17, order.creation_epoch_ms) + protoAdapter.encodedSizeWithTag(16, order.customer_token) + protoAdapter.encodedSizeWithTag(15, order.funding_transaction_token) + protoAdapter.encodedSizeWithTag(14, order.crypto_instrument_token) + protoAdapter.encodedSizeWithTag(13, order.fiat_instrument_token) + protoAdapter2.encodedSizeWithTag(12, order.final_price) + protoAdapter3.encodedSizeWithTag(11, order.expiration_epoch_ms) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter4 = ProtoAdapter.DOUBLE;
        return TradingModel.ADAPTER.encodedSizeWithTag(38, order.trading_model) + Order.FundingSource.ADAPTER.encodedSizeWithTag(37, order.funding_source) + Order.OrderSponsorship.ADAPTER.encodedSizeWithTag(36, order.order_sponsorship) + protoAdapter4.encodedSizeWithTag(35, order.incorporated_spread_bps) + protoAdapter4.encodedSizeWithTag(34, order.price_spread_bps) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Order order = (Order) obj;
        order.getClass();
        Money money = order.crypto_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = order.fiat_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = order.fee;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        Money money7 = order.current_price;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        Money money9 = order.target_price;
        Money money10 = money9 != null ? (Money) Money.ADAPTER.redact(money9) : null;
        Money money11 = order.original_price;
        Money money12 = money11 != null ? (Money) Money.ADAPTER.redact(money11) : null;
        Money money13 = order.final_price;
        Money money14 = money13 != null ? (Money) Money.ADAPTER.redact(money13) : null;
        Order.RecurringSchedule recurringSchedule = order.recurring_schedule;
        Order.RecurringSchedule recurringSchedule2 = recurringSchedule != null ? (Order.RecurringSchedule) Order.RecurringSchedule.ADAPTER.redact(recurringSchedule) : null;
        Money money15 = order.source_money;
        Money money16 = money15 != null ? (Money) Money.ADAPTER.redact(money15) : null;
        Money money17 = order.target_money;
        Money money18 = money17 != null ? (Money) Money.ADAPTER.redact(money17) : null;
        Money money19 = order.reference_price;
        Money money20 = money19 != null ? (Money) Money.ADAPTER.redact(money19) : null;
        Money money21 = order.spread_price_fee;
        Money money22 = money21 != null ? (Money) Money.ADAPTER.redact(money21) : null;
        Order.FeatureMetadata featureMetadata = order.feature_metadata;
        Order.FeatureMetadata featureMetadata2 = featureMetadata != null ? (Order.FeatureMetadata) Order.FeatureMetadata.ADAPTER.redact(featureMetadata) : null;
        Order.OrderSponsorship orderSponsorship = order.order_sponsorship;
        Order.OrderSponsorship orderSponsorship2 = orderSponsorship != null ? (Order.OrderSponsorship) Order.OrderSponsorship.ADAPTER.redact(orderSponsorship) : null;
        Order.FundingSource fundingSource = order.funding_source;
        Order.FundingSource fundingSource2 = fundingSource != null ? (Order.FundingSource) Order.FundingSource.ADAPTER.redact(fundingSource) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = order.token;
        OrderSide orderSide = order.side;
        OrderType orderType = order.f1280type;
        OrderState orderState = order.state;
        FeeStrategy feeStrategy = order.fee_strategy;
        Long l = order.expiration_epoch_ms;
        String str2 = order.fiat_instrument_token;
        String str3 = order.crypto_instrument_token;
        String str4 = order.funding_transaction_token;
        String str5 = order.customer_token;
        Long l2 = order.creation_epoch_ms;
        Origin origin = order.origin;
        Order.Feature feature = order.feature;
        String str6 = order.idempotence_token;
        String str7 = order.push_transaction_token;
        String str8 = order.source_instrument_token;
        String str9 = order.target_instrument_token;
        String str10 = order.source_transaction_token;
        String str11 = order.target_transaction_token;
        PriceStrategy priceStrategy = order.price_strategy;
        Double d = order.price_spread_bps;
        Double d2 = order.incorporated_spread_bps;
        TradingModel tradingModel = order.trading_model;
        byteString.getClass();
        return new Order(str, orderSide, orderType, orderState, money2, money4, money6, feeStrategy, money8, money10, money12, l, money14, str2, str3, str4, str5, l2, origin, feature, str6, recurringSchedule2, str7, money16, money18, str8, str9, str10, str11, money20, money22, priceStrategy, featureMetadata2, d, d2, orderSponsorship2, fundingSource2, tradingModel, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Order order = (Order) obj;
        order.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, order.token);
        OrderSide.ADAPTER.encodeWithTag(protoWriter, 2, order.side);
        OrderType.ADAPTER.encodeWithTag(protoWriter, 3, order.f1280type);
        OrderState.ADAPTER.encodeWithTag(protoWriter, 4, order.state);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 5, order.crypto_amount);
        protoAdapter2.encodeWithTag(protoWriter, 6, order.fiat_amount);
        protoAdapter2.encodeWithTag(protoWriter, 7, order.fee);
        FeeStrategy.ADAPTER.encodeWithTag(protoWriter, 20, order.fee_strategy);
        protoAdapter2.encodeWithTag(protoWriter, 8, order.current_price);
        protoAdapter2.encodeWithTag(protoWriter, 9, order.target_price);
        protoAdapter2.encodeWithTag(protoWriter, 10, order.original_price);
        ProtoAdapter protoAdapter3 = ProtoAdapter.UINT64;
        protoAdapter3.encodeWithTag(protoWriter, 11, order.expiration_epoch_ms);
        protoAdapter2.encodeWithTag(protoWriter, 12, order.final_price);
        protoAdapter.encodeWithTag(protoWriter, 13, order.fiat_instrument_token);
        protoAdapter.encodeWithTag(protoWriter, 14, order.crypto_instrument_token);
        protoAdapter.encodeWithTag(protoWriter, 15, order.funding_transaction_token);
        protoAdapter.encodeWithTag(protoWriter, 16, order.customer_token);
        protoAdapter3.encodeWithTag(protoWriter, 17, order.creation_epoch_ms);
        Origin.ADAPTER.encodeWithTag(protoWriter, 18, order.origin);
        Order.Feature.ADAPTER.encodeWithTag(protoWriter, 21, order.feature);
        protoAdapter.encodeWithTag(protoWriter, 19, order.idempotence_token);
        Order.RecurringSchedule.ADAPTER.encodeWithTag(protoWriter, 22, order.recurring_schedule);
        protoAdapter.encodeWithTag(protoWriter, 23, order.push_transaction_token);
        protoAdapter2.encodeWithTag(protoWriter, 24, order.source_money);
        protoAdapter2.encodeWithTag(protoWriter, 25, order.target_money);
        protoAdapter.encodeWithTag(protoWriter, 26, order.source_instrument_token);
        protoAdapter.encodeWithTag(protoWriter, 27, order.target_instrument_token);
        protoAdapter.encodeWithTag(protoWriter, 28, order.source_transaction_token);
        protoAdapter.encodeWithTag(protoWriter, 29, order.target_transaction_token);
        protoAdapter2.encodeWithTag(protoWriter, 30, order.reference_price);
        protoAdapter2.encodeWithTag(protoWriter, 31, order.spread_price_fee);
        PriceStrategy.ADAPTER.encodeWithTag(protoWriter, 32, order.price_strategy);
        Order.FeatureMetadata.ADAPTER.encodeWithTag(protoWriter, 33, order.feature_metadata);
        ProtoAdapter protoAdapter4 = ProtoAdapter.DOUBLE;
        protoAdapter4.encodeWithTag(protoWriter, 34, order.price_spread_bps);
        protoAdapter4.encodeWithTag(protoWriter, 35, order.incorporated_spread_bps);
        Order.OrderSponsorship.ADAPTER.encodeWithTag(protoWriter, 36, order.order_sponsorship);
        Order.FundingSource.ADAPTER.encodeWithTag(protoWriter, 37, order.funding_source);
        TradingModel.ADAPTER.encodeWithTag(protoWriter, 38, order.trading_model);
        protoWriter.writeBytes(order.unknownFields());
    }
}

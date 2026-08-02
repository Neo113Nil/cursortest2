package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.investcrypto.resources.OrderStateReason;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.CryptoOrderRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CryptoOrderRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        CryptoOrderRenderData.OrderType orderType;
        CryptoOrderRenderData.OrderState orderState;
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        String str = null;
        Object obj2 = null;
        CryptoOrderRenderData.OrderType orderType2 = null;
        CryptoOrderRenderData.OrderState orderState2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Long l = null;
        Object obj9 = null;
        OrderStateReason orderStateReason = null;
        CryptoOrderRenderData.OrderFeature orderFeature = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        CryptoOrderRenderData.OrderSide orderSide = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CryptoOrderRenderData(str, orderSide, orderType2, orderState2, (Money) obj3, (Money) obj4, (Money) obj5, (Money) obj6, (Money) obj7, (Money) obj8, l, (CryptoPayrollRenderData) obj9, orderStateReason, orderFeature, str2, str3, str4, str5, (Money) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj = obj2;
                    orderType = orderType2;
                    orderState = orderState2;
                    try {
                        orderSide = CryptoOrderRenderData.OrderSide.ADAPTER.decode(protoReader);
                        obj2 = obj;
                        orderType2 = orderType;
                        orderState2 = orderState;
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    obj = obj2;
                    orderType = orderType2;
                    orderState = orderState2;
                    try {
                        orderType2 = CryptoOrderRenderData.OrderType.ADAPTER.decode(protoReader);
                        obj2 = obj;
                        orderState2 = orderState;
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 4:
                    obj = obj2;
                    orderType = orderType2;
                    orderState = orderState2;
                    try {
                        orderState2 = CryptoOrderRenderData.OrderState.ADAPTER.decode(protoReader);
                        obj2 = obj;
                        orderType2 = orderType;
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 5:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    decode = str;
                    break;
                case 6:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    decode = str;
                    break;
                case 7:
                    obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                    decode = str;
                    break;
                case 8:
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    decode = str;
                    break;
                case 9:
                    obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj7);
                    decode = str;
                    break;
                case 10:
                    obj8 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj8);
                    decode = str;
                    break;
                case 11:
                    l = ProtoAdapter.UINT64.decode(protoReader);
                    decode = str;
                    break;
                case 12:
                    obj9 = TransactorKt.decodeMessageOrMerge(CryptoPayrollRenderData.ADAPTER, protoReader, obj9);
                    decode = str;
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj2;
                    orderType = orderType2;
                    orderState = orderState2;
                    decode = str;
                    obj2 = obj;
                    orderType2 = orderType;
                    orderState2 = orderState;
                    break;
                case 17:
                    obj = obj2;
                    orderType = orderType2;
                    orderState = orderState2;
                    try {
                        orderStateReason = OrderStateReason.ADAPTER.decode(protoReader);
                        obj2 = obj;
                        orderType2 = orderType;
                        orderState2 = orderState;
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        break;
                    }
                case 18:
                    try {
                        orderFeature = CryptoOrderRenderData.OrderFeature.ADAPTER.decode(protoReader);
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                        obj = obj2;
                        orderType = orderType2;
                        orderState = orderState2;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                        break;
                    }
                case 19:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 20:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 21:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 22:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 23:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    decode = str;
                    break;
            }
            str = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CryptoOrderRenderData cryptoOrderRenderData = (CryptoOrderRenderData) obj;
        reverseProtoWriter.getClass();
        cryptoOrderRenderData.getClass();
        reverseProtoWriter.writeBytes(cryptoOrderRenderData.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 23, cryptoOrderRenderData.immediately_available_amount);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 22, cryptoOrderRenderData.target_transaction_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 21, cryptoOrderRenderData.source_transaction_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 20, cryptoOrderRenderData.target_instrument_token);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 19, cryptoOrderRenderData.source_instrument_token);
        CryptoOrderRenderData.OrderFeature.ADAPTER.encodeWithTag(reverseProtoWriter, 18, cryptoOrderRenderData.feature);
        OrderStateReason.ADAPTER.encodeWithTag(reverseProtoWriter, 17, cryptoOrderRenderData.order_state_reason);
        CryptoPayrollRenderData.ADAPTER.encodeWithTag(reverseProtoWriter, 12, cryptoOrderRenderData.crypto_payroll_render_data);
        ProtoAdapter.UINT64.encodeWithTag(reverseProtoWriter, 11, cryptoOrderRenderData.expiration_epoch_ms);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, cryptoOrderRenderData.original_price);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, cryptoOrderRenderData.target_price);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, cryptoOrderRenderData.current_price);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, cryptoOrderRenderData.fee);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, cryptoOrderRenderData.fiat_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, cryptoOrderRenderData.crypto_amount);
        CryptoOrderRenderData.OrderState.ADAPTER.encodeWithTag(reverseProtoWriter, 4, cryptoOrderRenderData.state);
        CryptoOrderRenderData.OrderType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cryptoOrderRenderData.f1376type);
        CryptoOrderRenderData.OrderSide.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cryptoOrderRenderData.side);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, cryptoOrderRenderData.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CryptoOrderRenderData cryptoOrderRenderData = (CryptoOrderRenderData) obj;
        cryptoOrderRenderData.getClass();
        int size$okio = cryptoOrderRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = CryptoOrderRenderData.OrderState.ADAPTER.encodedSizeWithTag(4, cryptoOrderRenderData.state) + CryptoOrderRenderData.OrderType.ADAPTER.encodedSizeWithTag(3, cryptoOrderRenderData.f1376type) + CryptoOrderRenderData.OrderSide.ADAPTER.encodedSizeWithTag(2, cryptoOrderRenderData.side) + protoAdapter.encodedSizeWithTag(1, cryptoOrderRenderData.token) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(23, cryptoOrderRenderData.immediately_available_amount) + protoAdapter.encodedSizeWithTag(22, cryptoOrderRenderData.target_transaction_token) + protoAdapter.encodedSizeWithTag(21, cryptoOrderRenderData.source_transaction_token) + protoAdapter.encodedSizeWithTag(20, cryptoOrderRenderData.target_instrument_token) + protoAdapter.encodedSizeWithTag(19, cryptoOrderRenderData.source_instrument_token) + CryptoOrderRenderData.OrderFeature.ADAPTER.encodedSizeWithTag(18, cryptoOrderRenderData.feature) + OrderStateReason.ADAPTER.encodedSizeWithTag(17, cryptoOrderRenderData.order_state_reason) + CryptoPayrollRenderData.ADAPTER.encodedSizeWithTag(12, cryptoOrderRenderData.crypto_payroll_render_data) + ProtoAdapter.UINT64.encodedSizeWithTag(11, cryptoOrderRenderData.expiration_epoch_ms) + protoAdapter2.encodedSizeWithTag(10, cryptoOrderRenderData.original_price) + protoAdapter2.encodedSizeWithTag(9, cryptoOrderRenderData.target_price) + protoAdapter2.encodedSizeWithTag(8, cryptoOrderRenderData.current_price) + protoAdapter2.encodedSizeWithTag(7, cryptoOrderRenderData.fee) + protoAdapter2.encodedSizeWithTag(6, cryptoOrderRenderData.fiat_amount) + protoAdapter2.encodedSizeWithTag(5, cryptoOrderRenderData.crypto_amount) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CryptoOrderRenderData cryptoOrderRenderData = (CryptoOrderRenderData) obj;
        cryptoOrderRenderData.getClass();
        Money money = cryptoOrderRenderData.crypto_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = cryptoOrderRenderData.fiat_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = cryptoOrderRenderData.fee;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        Money money7 = cryptoOrderRenderData.current_price;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        Money money9 = cryptoOrderRenderData.target_price;
        Money money10 = money9 != null ? (Money) Money.ADAPTER.redact(money9) : null;
        Money money11 = cryptoOrderRenderData.original_price;
        Money money12 = money11 != null ? (Money) Money.ADAPTER.redact(money11) : null;
        CryptoPayrollRenderData cryptoPayrollRenderData = cryptoOrderRenderData.crypto_payroll_render_data;
        CryptoPayrollRenderData cryptoPayrollRenderData2 = cryptoPayrollRenderData != null ? (CryptoPayrollRenderData) CryptoPayrollRenderData.ADAPTER.redact(cryptoPayrollRenderData) : null;
        Money money13 = cryptoOrderRenderData.immediately_available_amount;
        Money money14 = money13 != null ? (Money) Money.ADAPTER.redact(money13) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cryptoOrderRenderData.token;
        CryptoOrderRenderData.OrderSide orderSide = cryptoOrderRenderData.side;
        CryptoOrderRenderData.OrderType orderType = cryptoOrderRenderData.f1376type;
        CryptoOrderRenderData.OrderState orderState = cryptoOrderRenderData.state;
        Long l = cryptoOrderRenderData.expiration_epoch_ms;
        OrderStateReason orderStateReason = cryptoOrderRenderData.order_state_reason;
        CryptoOrderRenderData.OrderFeature orderFeature = cryptoOrderRenderData.feature;
        String str2 = cryptoOrderRenderData.source_instrument_token;
        String str3 = cryptoOrderRenderData.target_instrument_token;
        String str4 = cryptoOrderRenderData.source_transaction_token;
        String str5 = cryptoOrderRenderData.target_transaction_token;
        byteString.getClass();
        return new CryptoOrderRenderData(str, orderSide, orderType, orderState, money2, money4, money6, money8, money10, money12, l, cryptoPayrollRenderData2, orderStateReason, orderFeature, str2, str3, str4, str5, money14, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CryptoOrderRenderData cryptoOrderRenderData = (CryptoOrderRenderData) obj;
        cryptoOrderRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cryptoOrderRenderData.token);
        CryptoOrderRenderData.OrderSide.ADAPTER.encodeWithTag(protoWriter, 2, cryptoOrderRenderData.side);
        CryptoOrderRenderData.OrderType.ADAPTER.encodeWithTag(protoWriter, 3, cryptoOrderRenderData.f1376type);
        CryptoOrderRenderData.OrderState.ADAPTER.encodeWithTag(protoWriter, 4, cryptoOrderRenderData.state);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 5, cryptoOrderRenderData.crypto_amount);
        protoAdapter2.encodeWithTag(protoWriter, 6, cryptoOrderRenderData.fiat_amount);
        protoAdapter2.encodeWithTag(protoWriter, 7, cryptoOrderRenderData.fee);
        protoAdapter2.encodeWithTag(protoWriter, 8, cryptoOrderRenderData.current_price);
        protoAdapter2.encodeWithTag(protoWriter, 9, cryptoOrderRenderData.target_price);
        protoAdapter2.encodeWithTag(protoWriter, 10, cryptoOrderRenderData.original_price);
        ProtoAdapter.UINT64.encodeWithTag(protoWriter, 11, cryptoOrderRenderData.expiration_epoch_ms);
        CryptoPayrollRenderData.ADAPTER.encodeWithTag(protoWriter, 12, cryptoOrderRenderData.crypto_payroll_render_data);
        OrderStateReason.ADAPTER.encodeWithTag(protoWriter, 17, cryptoOrderRenderData.order_state_reason);
        CryptoOrderRenderData.OrderFeature.ADAPTER.encodeWithTag(protoWriter, 18, cryptoOrderRenderData.feature);
        protoAdapter.encodeWithTag(protoWriter, 19, cryptoOrderRenderData.source_instrument_token);
        protoAdapter.encodeWithTag(protoWriter, 20, cryptoOrderRenderData.target_instrument_token);
        protoAdapter.encodeWithTag(protoWriter, 21, cryptoOrderRenderData.source_transaction_token);
        protoAdapter.encodeWithTag(protoWriter, 22, cryptoOrderRenderData.target_transaction_token);
        protoAdapter2.encodeWithTag(protoWriter, 23, cryptoOrderRenderData.immediately_available_amount);
        protoWriter.writeBytes(cryptoOrderRenderData.unknownFields());
    }
}

package com.squareup.protos.cash.local.activity;

import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppLocalOrderRenderData$OrderPaymentData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppLocalOrderRenderData.OrderPaymentData((CashAppLocalOrderRenderData.OrderPaymentData.OrderPaymentStatus) obj, (CashInstrumentType) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CashAppLocalOrderRenderData.OrderPaymentData.OrderPaymentStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = CashInstrumentType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppLocalOrderRenderData.OrderPaymentData orderPaymentData = (CashAppLocalOrderRenderData.OrderPaymentData) obj;
        reverseProtoWriter.getClass();
        orderPaymentData.getClass();
        reverseProtoWriter.writeBytes(orderPaymentData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, orderPaymentData.square_payment_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, orderPaymentData.transaction_number);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, orderPaymentData.instrument_display_name);
        CashInstrumentType.ADAPTER.encodeWithTag(reverseProtoWriter, 5, orderPaymentData.instrument_type);
        CashAppLocalOrderRenderData.OrderPaymentData.OrderPaymentStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 1, orderPaymentData.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppLocalOrderRenderData.OrderPaymentData orderPaymentData = (CashAppLocalOrderRenderData.OrderPaymentData) obj;
        orderPaymentData.getClass();
        int encodedSizeWithTag = CashInstrumentType.ADAPTER.encodedSizeWithTag(5, orderPaymentData.instrument_type) + CashAppLocalOrderRenderData.OrderPaymentData.OrderPaymentStatus.ADAPTER.encodedSizeWithTag(1, orderPaymentData.status) + orderPaymentData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, orderPaymentData.square_payment_token) + protoAdapter.encodedSizeWithTag(3, orderPaymentData.transaction_number) + protoAdapter.encodedSizeWithTag(2, orderPaymentData.instrument_display_name) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppLocalOrderRenderData.OrderPaymentData orderPaymentData = (CashAppLocalOrderRenderData.OrderPaymentData) obj;
        orderPaymentData.getClass();
        ByteString byteString = ByteString.EMPTY;
        CashAppLocalOrderRenderData.OrderPaymentData.OrderPaymentStatus orderPaymentStatus = orderPaymentData.status;
        CashInstrumentType cashInstrumentType = orderPaymentData.instrument_type;
        String str = orderPaymentData.instrument_display_name;
        String str2 = orderPaymentData.transaction_number;
        String str3 = orderPaymentData.square_payment_token;
        byteString.getClass();
        return new CashAppLocalOrderRenderData.OrderPaymentData(orderPaymentStatus, cashInstrumentType, str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppLocalOrderRenderData.OrderPaymentData orderPaymentData = (CashAppLocalOrderRenderData.OrderPaymentData) obj;
        orderPaymentData.getClass();
        CashAppLocalOrderRenderData.OrderPaymentData.OrderPaymentStatus.ADAPTER.encodeWithTag(protoWriter, 1, orderPaymentData.status);
        CashInstrumentType.ADAPTER.encodeWithTag(protoWriter, 5, orderPaymentData.instrument_type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, orderPaymentData.instrument_display_name);
        protoAdapter.encodeWithTag(protoWriter, 3, orderPaymentData.transaction_number);
        protoAdapter.encodeWithTag(protoWriter, 4, orderPaymentData.square_payment_token);
        protoWriter.writeBytes(orderPaymentData.unknownFields());
    }
}

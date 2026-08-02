package com.squareup.protos.cash.fx.app;

import com.squareup.protos.common.CurrencyCode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class StreamExchangeRateRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StreamExchangeRateRequest((CurrencyCode) obj, (CurrencyCode) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CurrencyCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = CurrencyCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StreamExchangeRateRequest streamExchangeRateRequest = (StreamExchangeRateRequest) obj;
        reverseProtoWriter.getClass();
        streamExchangeRateRequest.getClass();
        reverseProtoWriter.writeBytes(streamExchangeRateRequest.unknownFields());
        ProtoAdapter protoAdapter = CurrencyCode.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, streamExchangeRateRequest.to_currency);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, streamExchangeRateRequest.from_currency);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StreamExchangeRateRequest streamExchangeRateRequest = (StreamExchangeRateRequest) obj;
        streamExchangeRateRequest.getClass();
        int size$okio = streamExchangeRateRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = CurrencyCode.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, streamExchangeRateRequest.to_currency) + protoAdapter.encodedSizeWithTag(1, streamExchangeRateRequest.from_currency) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StreamExchangeRateRequest streamExchangeRateRequest = (StreamExchangeRateRequest) obj;
        streamExchangeRateRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        CurrencyCode currencyCode = streamExchangeRateRequest.from_currency;
        CurrencyCode currencyCode2 = streamExchangeRateRequest.to_currency;
        byteString.getClass();
        return new StreamExchangeRateRequest(currencyCode, currencyCode2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StreamExchangeRateRequest streamExchangeRateRequest = (StreamExchangeRateRequest) obj;
        streamExchangeRateRequest.getClass();
        ProtoAdapter protoAdapter = CurrencyCode.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, streamExchangeRateRequest.from_currency);
        protoAdapter.encodeWithTag(protoWriter, 2, streamExchangeRateRequest.to_currency);
        protoWriter.writeBytes(streamExchangeRateRequest.unknownFields());
    }
}

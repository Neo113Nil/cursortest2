package com.squareup.protos.cash.fx.app;

import androidx.room.TransactorKt;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class StreamExchangeRateUpdate$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StreamExchangeRateUpdate((ExchangeRate) obj, (CurrencyCode) obj2, (CurrencyCode) obj3, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ExchangeRate.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                try {
                    obj2 = CurrencyCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                try {
                    obj3 = CurrencyCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StreamExchangeRateUpdate streamExchangeRateUpdate = (StreamExchangeRateUpdate) obj;
        reverseProtoWriter.getClass();
        streamExchangeRateUpdate.getClass();
        reverseProtoWriter.writeBytes(streamExchangeRateUpdate.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 4, streamExchangeRateUpdate.emitted_at_ms);
        ProtoAdapter protoAdapter = CurrencyCode.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, streamExchangeRateUpdate.to_currency);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, streamExchangeRateUpdate.from_currency);
        ExchangeRate.ADAPTER.encodeWithTag(reverseProtoWriter, 1, streamExchangeRateUpdate.exchange_rate);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StreamExchangeRateUpdate streamExchangeRateUpdate = (StreamExchangeRateUpdate) obj;
        streamExchangeRateUpdate.getClass();
        int encodedSizeWithTag = ExchangeRate.ADAPTER.encodedSizeWithTag(1, streamExchangeRateUpdate.exchange_rate) + streamExchangeRateUpdate.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = CurrencyCode.ADAPTER;
        return ProtoAdapter.INT64.encodedSizeWithTag(4, streamExchangeRateUpdate.emitted_at_ms) + protoAdapter.encodedSizeWithTag(3, streamExchangeRateUpdate.to_currency) + protoAdapter.encodedSizeWithTag(2, streamExchangeRateUpdate.from_currency) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StreamExchangeRateUpdate streamExchangeRateUpdate = (StreamExchangeRateUpdate) obj;
        streamExchangeRateUpdate.getClass();
        ExchangeRate exchangeRate = streamExchangeRateUpdate.exchange_rate;
        ExchangeRate exchangeRate2 = exchangeRate != null ? (ExchangeRate) ExchangeRate.ADAPTER.redact(exchangeRate) : null;
        ByteString byteString = ByteString.EMPTY;
        CurrencyCode currencyCode = streamExchangeRateUpdate.from_currency;
        CurrencyCode currencyCode2 = streamExchangeRateUpdate.to_currency;
        Long l = streamExchangeRateUpdate.emitted_at_ms;
        byteString.getClass();
        return new StreamExchangeRateUpdate(exchangeRate2, currencyCode, currencyCode2, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StreamExchangeRateUpdate streamExchangeRateUpdate = (StreamExchangeRateUpdate) obj;
        streamExchangeRateUpdate.getClass();
        ExchangeRate.ADAPTER.encodeWithTag(protoWriter, 1, streamExchangeRateUpdate.exchange_rate);
        ProtoAdapter protoAdapter = CurrencyCode.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, streamExchangeRateUpdate.from_currency);
        protoAdapter.encodeWithTag(protoWriter, 3, streamExchangeRateUpdate.to_currency);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, streamExchangeRateUpdate.emitted_at_ms);
        protoWriter.writeBytes(streamExchangeRateUpdate.unknownFields());
    }
}

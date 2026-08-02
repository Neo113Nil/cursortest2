package com.squareup.protos.cash.fx.app;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ExchangeRate$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ExchangeRate((CurrencyInfo) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CurrencyInfo.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ExchangeRate exchangeRate = (ExchangeRate) obj;
        reverseProtoWriter.getClass();
        exchangeRate.getClass();
        reverseProtoWriter.writeBytes(exchangeRate.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, exchangeRate.rate);
        CurrencyInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 1, exchangeRate.from_currency);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ExchangeRate exchangeRate = (ExchangeRate) obj;
        exchangeRate.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, exchangeRate.rate) + CurrencyInfo.ADAPTER.encodedSizeWithTag(1, exchangeRate.from_currency) + exchangeRate.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExchangeRate exchangeRate = (ExchangeRate) obj;
        exchangeRate.getClass();
        CurrencyInfo currencyInfo = exchangeRate.from_currency;
        CurrencyInfo currencyInfo2 = currencyInfo != null ? (CurrencyInfo) CurrencyInfo.ADAPTER.redact(currencyInfo) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = exchangeRate.rate;
        byteString.getClass();
        return new ExchangeRate(currencyInfo2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ExchangeRate exchangeRate = (ExchangeRate) obj;
        exchangeRate.getClass();
        CurrencyInfo.ADAPTER.encodeWithTag(protoWriter, 1, exchangeRate.from_currency);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, exchangeRate.rate);
        protoWriter.writeBytes(exchangeRate.unknownFields());
    }
}

package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ExchangeData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ExchangeData((CurrencyCode) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                m.add(ExchangeRate.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ExchangeData exchangeData = (ExchangeData) obj;
        reverseProtoWriter.getClass();
        exchangeData.getClass();
        reverseProtoWriter.writeBytes(exchangeData.unknownFields());
        ExchangeRate.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, exchangeData.rates);
        CurrencyCode.ADAPTER.encodeWithTag(reverseProtoWriter, 1, exchangeData.base_currency_code);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ExchangeData exchangeData = (ExchangeData) obj;
        exchangeData.getClass();
        return ExchangeRate.ADAPTER.asRepeated().encodedSizeWithTag(2, exchangeData.rates) + CurrencyCode.ADAPTER.encodedSizeWithTag(1, exchangeData.base_currency_code) + exchangeData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExchangeData exchangeData = (ExchangeData) obj;
        exchangeData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(exchangeData.rates, ExchangeRate.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        CurrencyCode currencyCode = exchangeData.base_currency_code;
        byteString.getClass();
        return new ExchangeData(currencyCode, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ExchangeData exchangeData = (ExchangeData) obj;
        exchangeData.getClass();
        CurrencyCode.ADAPTER.encodeWithTag(protoWriter, 1, exchangeData.base_currency_code);
        ExchangeRate.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, exchangeData.rates);
        protoWriter.writeBytes(exchangeData.unknownFields());
    }
}

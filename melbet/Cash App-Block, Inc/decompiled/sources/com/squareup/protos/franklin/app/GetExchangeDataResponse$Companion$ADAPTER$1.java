package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ExchangeData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetExchangeDataResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetExchangeDataResponse((ExchangeData) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ExchangeData.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ExchangeData.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetExchangeDataResponse getExchangeDataResponse = (GetExchangeDataResponse) obj;
        reverseProtoWriter.getClass();
        getExchangeDataResponse.getClass();
        reverseProtoWriter.writeBytes(getExchangeDataResponse.unknownFields());
        ProtoAdapter protoAdapter = ExchangeData.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, getExchangeDataResponse.equity_data);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, getExchangeDataResponse.exchange_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetExchangeDataResponse getExchangeDataResponse = (GetExchangeDataResponse) obj;
        getExchangeDataResponse.getClass();
        int size$okio = getExchangeDataResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ExchangeData.ADAPTER;
        return protoAdapter.asRepeated().encodedSizeWithTag(2, getExchangeDataResponse.equity_data) + protoAdapter.encodedSizeWithTag(1, getExchangeDataResponse.exchange_data) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetExchangeDataResponse getExchangeDataResponse = (GetExchangeDataResponse) obj;
        getExchangeDataResponse.getClass();
        ExchangeData exchangeData = getExchangeDataResponse.exchange_data;
        ExchangeData exchangeData2 = exchangeData != null ? (ExchangeData) ExchangeData.ADAPTER.redact(exchangeData) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getExchangeDataResponse.equity_data, ExchangeData.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetExchangeDataResponse(exchangeData2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetExchangeDataResponse getExchangeDataResponse = (GetExchangeDataResponse) obj;
        getExchangeDataResponse.getClass();
        ProtoAdapter protoAdapter = ExchangeData.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, getExchangeDataResponse.exchange_data);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, getExchangeDataResponse.equity_data);
        protoWriter.writeBytes(getExchangeDataResponse.unknownFields());
    }
}

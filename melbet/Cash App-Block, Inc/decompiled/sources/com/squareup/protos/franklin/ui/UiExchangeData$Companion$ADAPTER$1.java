package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ExchangeData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiExchangeData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiExchangeData((ExchangeData) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ExchangeData.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiExchangeData uiExchangeData = (UiExchangeData) obj;
        reverseProtoWriter.getClass();
        uiExchangeData.getClass();
        reverseProtoWriter.writeBytes(uiExchangeData.unknownFields());
        ExchangeData.ADAPTER.encodeWithTag(reverseProtoWriter, 1, uiExchangeData.exchange_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiExchangeData uiExchangeData = (UiExchangeData) obj;
        uiExchangeData.getClass();
        return ExchangeData.ADAPTER.encodedSizeWithTag(1, uiExchangeData.exchange_data) + uiExchangeData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiExchangeData uiExchangeData = (UiExchangeData) obj;
        uiExchangeData.getClass();
        ExchangeData exchangeData = uiExchangeData.exchange_data;
        ExchangeData exchangeData2 = exchangeData != null ? (ExchangeData) ExchangeData.ADAPTER.redact(exchangeData) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UiExchangeData(exchangeData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiExchangeData uiExchangeData = (UiExchangeData) obj;
        uiExchangeData.getClass();
        ExchangeData.ADAPTER.encodeWithTag(protoWriter, 1, uiExchangeData.exchange_data);
        protoWriter.writeBytes(uiExchangeData.unknownFields());
    }
}

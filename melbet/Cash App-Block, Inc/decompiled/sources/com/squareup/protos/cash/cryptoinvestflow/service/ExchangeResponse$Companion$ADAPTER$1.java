package com.squareup.protos.cash.cryptoinvestflow.service;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ExchangeResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ExchangeResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ExchangeResponse exchangeResponse = (ExchangeResponse) obj;
        reverseProtoWriter.getClass();
        exchangeResponse.getClass();
        reverseProtoWriter.writeBytes(exchangeResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, exchangeResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ExchangeResponse exchangeResponse = (ExchangeResponse) obj;
        exchangeResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, exchangeResponse.response_context) + exchangeResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExchangeResponse exchangeResponse = (ExchangeResponse) obj;
        exchangeResponse.getClass();
        ResponseContext responseContext = exchangeResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ExchangeResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ExchangeResponse exchangeResponse = (ExchangeResponse) obj;
        exchangeResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, exchangeResponse.response_context);
        protoWriter.writeBytes(exchangeResponse.unknownFields());
    }
}

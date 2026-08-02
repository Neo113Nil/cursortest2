package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateSwapQuoteResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateSwapQuoteResponse((SwapQuote) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(SwapQuote.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateSwapQuoteResponse createSwapQuoteResponse = (CreateSwapQuoteResponse) obj;
        reverseProtoWriter.getClass();
        createSwapQuoteResponse.getClass();
        reverseProtoWriter.writeBytes(createSwapQuoteResponse.unknownFields());
        SwapQuote.ADAPTER.encodeWithTag(reverseProtoWriter, 1, createSwapQuoteResponse.quote);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateSwapQuoteResponse createSwapQuoteResponse = (CreateSwapQuoteResponse) obj;
        createSwapQuoteResponse.getClass();
        return SwapQuote.ADAPTER.encodedSizeWithTag(1, createSwapQuoteResponse.quote) + createSwapQuoteResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateSwapQuoteResponse createSwapQuoteResponse = (CreateSwapQuoteResponse) obj;
        createSwapQuoteResponse.getClass();
        SwapQuote swapQuote = createSwapQuoteResponse.quote;
        SwapQuote swapQuote2 = swapQuote != null ? (SwapQuote) SwapQuote.ADAPTER.redact(swapQuote) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CreateSwapQuoteResponse(swapQuote2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateSwapQuoteResponse createSwapQuoteResponse = (CreateSwapQuoteResponse) obj;
        createSwapQuoteResponse.getClass();
        SwapQuote.ADAPTER.encodeWithTag(protoWriter, 1, createSwapQuoteResponse.quote);
        protoWriter.writeBytes(createSwapQuoteResponse.unknownFields());
    }
}

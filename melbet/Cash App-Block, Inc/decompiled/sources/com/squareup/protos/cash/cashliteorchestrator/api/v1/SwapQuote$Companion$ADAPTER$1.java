package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SwapQuote$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SwapQuote((String) obj, (SwapEstimate) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(SwapEstimate.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SwapQuote swapQuote = (SwapQuote) obj;
        reverseProtoWriter.getClass();
        swapQuote.getClass();
        reverseProtoWriter.writeBytes(swapQuote.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, swapQuote.expires_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, swapQuote.lightning_invoice);
        SwapEstimate.ADAPTER.encodeWithTag(reverseProtoWriter, 2, swapQuote.estimate);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, swapQuote.quote_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SwapQuote swapQuote = (SwapQuote) obj;
        swapQuote.getClass();
        int size$okio = swapQuote.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, swapQuote.expires_at) + protoAdapter.encodedSizeWithTag(3, swapQuote.lightning_invoice) + SwapEstimate.ADAPTER.encodedSizeWithTag(2, swapQuote.estimate) + protoAdapter.encodedSizeWithTag(1, swapQuote.quote_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SwapQuote swapQuote = (SwapQuote) obj;
        swapQuote.getClass();
        SwapEstimate swapEstimate = swapQuote.estimate;
        SwapEstimate swapEstimate2 = swapEstimate != null ? (SwapEstimate) SwapEstimate.ADAPTER.redact(swapEstimate) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = swapQuote.quote_id;
        String str2 = swapQuote.lightning_invoice;
        String str3 = swapQuote.expires_at;
        byteString.getClass();
        return new SwapQuote(str, swapEstimate2, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SwapQuote swapQuote = (SwapQuote) obj;
        swapQuote.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, swapQuote.quote_id);
        SwapEstimate.ADAPTER.encodeWithTag(protoWriter, 2, swapQuote.estimate);
        protoAdapter.encodeWithTag(protoWriter, 3, swapQuote.lightning_invoice);
        protoAdapter.encodeWithTag(protoWriter, 4, swapQuote.expires_at);
        protoWriter.writeBytes(swapQuote.unknownFields());
    }
}

package com.squareup.protos.cash.cryptosparky.api.deposits;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RefreshInvoice$Response$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RefreshInvoice$Response((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        RefreshInvoice$Response refreshInvoice$Response = (RefreshInvoice$Response) obj;
        reverseProtoWriter.getClass();
        refreshInvoice$Response.getClass();
        reverseProtoWriter.writeBytes(refreshInvoice$Response.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, refreshInvoice$Response.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RefreshInvoice$Response refreshInvoice$Response = (RefreshInvoice$Response) obj;
        refreshInvoice$Response.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, refreshInvoice$Response.response_context) + refreshInvoice$Response.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RefreshInvoice$Response refreshInvoice$Response = (RefreshInvoice$Response) obj;
        refreshInvoice$Response.getClass();
        ResponseContext responseContext = refreshInvoice$Response.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RefreshInvoice$Response(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RefreshInvoice$Response refreshInvoice$Response = (RefreshInvoice$Response) obj;
        refreshInvoice$Response.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, refreshInvoice$Response.response_context);
        protoWriter.writeBytes(refreshInvoice$Response.unknownFields());
    }
}

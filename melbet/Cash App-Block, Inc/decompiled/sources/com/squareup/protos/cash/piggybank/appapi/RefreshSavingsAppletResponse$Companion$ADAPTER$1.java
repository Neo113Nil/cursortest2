package com.squareup.protos.cash.piggybank.appapi;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RefreshSavingsAppletResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RefreshSavingsAppletResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        RefreshSavingsAppletResponse refreshSavingsAppletResponse = (RefreshSavingsAppletResponse) obj;
        reverseProtoWriter.getClass();
        refreshSavingsAppletResponse.getClass();
        reverseProtoWriter.writeBytes(refreshSavingsAppletResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, refreshSavingsAppletResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RefreshSavingsAppletResponse refreshSavingsAppletResponse = (RefreshSavingsAppletResponse) obj;
        refreshSavingsAppletResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, refreshSavingsAppletResponse.response_context) + refreshSavingsAppletResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RefreshSavingsAppletResponse refreshSavingsAppletResponse = (RefreshSavingsAppletResponse) obj;
        refreshSavingsAppletResponse.getClass();
        ResponseContext responseContext = refreshSavingsAppletResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RefreshSavingsAppletResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RefreshSavingsAppletResponse refreshSavingsAppletResponse = (RefreshSavingsAppletResponse) obj;
        refreshSavingsAppletResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, refreshSavingsAppletResponse.response_context);
        protoWriter.writeBytes(refreshSavingsAppletResponse.unknownFields());
    }
}

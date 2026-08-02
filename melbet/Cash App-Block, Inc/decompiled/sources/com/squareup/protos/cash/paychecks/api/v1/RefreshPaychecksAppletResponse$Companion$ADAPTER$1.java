package com.squareup.protos.cash.paychecks.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RefreshPaychecksAppletResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RefreshPaychecksAppletResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        RefreshPaychecksAppletResponse refreshPaychecksAppletResponse = (RefreshPaychecksAppletResponse) obj;
        reverseProtoWriter.getClass();
        refreshPaychecksAppletResponse.getClass();
        reverseProtoWriter.writeBytes(refreshPaychecksAppletResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, refreshPaychecksAppletResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RefreshPaychecksAppletResponse refreshPaychecksAppletResponse = (RefreshPaychecksAppletResponse) obj;
        refreshPaychecksAppletResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, refreshPaychecksAppletResponse.response_context) + refreshPaychecksAppletResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RefreshPaychecksAppletResponse refreshPaychecksAppletResponse = (RefreshPaychecksAppletResponse) obj;
        refreshPaychecksAppletResponse.getClass();
        ResponseContext responseContext = refreshPaychecksAppletResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RefreshPaychecksAppletResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RefreshPaychecksAppletResponse refreshPaychecksAppletResponse = (RefreshPaychecksAppletResponse) obj;
        refreshPaychecksAppletResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, refreshPaychecksAppletResponse.response_context);
        protoWriter.writeBytes(refreshPaychecksAppletResponse.unknownFields());
    }
}

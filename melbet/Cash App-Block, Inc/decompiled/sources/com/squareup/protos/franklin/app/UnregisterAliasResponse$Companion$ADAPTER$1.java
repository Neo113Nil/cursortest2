package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.UnregisterAliasResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UnregisterAliasResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UnregisterAliasResponse((ResponseContext) obj, (UnregisterAliasResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = UnregisterAliasResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UnregisterAliasResponse unregisterAliasResponse = (UnregisterAliasResponse) obj;
        reverseProtoWriter.getClass();
        unregisterAliasResponse.getClass();
        reverseProtoWriter.writeBytes(unregisterAliasResponse.unknownFields());
        UnregisterAliasResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, unregisterAliasResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, unregisterAliasResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UnregisterAliasResponse unregisterAliasResponse = (UnregisterAliasResponse) obj;
        unregisterAliasResponse.getClass();
        return UnregisterAliasResponse.Status.ADAPTER.encodedSizeWithTag(1, unregisterAliasResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(3, unregisterAliasResponse.response_context) + unregisterAliasResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UnregisterAliasResponse unregisterAliasResponse = (UnregisterAliasResponse) obj;
        unregisterAliasResponse.getClass();
        ResponseContext responseContext = unregisterAliasResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        UnregisterAliasResponse.Status status = unregisterAliasResponse.status;
        byteString.getClass();
        return new UnregisterAliasResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UnregisterAliasResponse unregisterAliasResponse = (UnregisterAliasResponse) obj;
        unregisterAliasResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 3, unregisterAliasResponse.response_context);
        UnregisterAliasResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, unregisterAliasResponse.status);
        protoWriter.writeBytes(unregisterAliasResponse.unknownFields());
    }
}

package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.ResolveMergeResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ResolveMergeResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ResolveMergeResponse((ResponseContext) obj, (ResolveMergeResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = ResolveMergeResponse.Status.ADAPTER.decode(protoReader);
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
        ResolveMergeResponse resolveMergeResponse = (ResolveMergeResponse) obj;
        reverseProtoWriter.getClass();
        resolveMergeResponse.getClass();
        reverseProtoWriter.writeBytes(resolveMergeResponse.unknownFields());
        ResolveMergeResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, resolveMergeResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, resolveMergeResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ResolveMergeResponse resolveMergeResponse = (ResolveMergeResponse) obj;
        resolveMergeResponse.getClass();
        return ResolveMergeResponse.Status.ADAPTER.encodedSizeWithTag(1, resolveMergeResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(3, resolveMergeResponse.response_context) + resolveMergeResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ResolveMergeResponse resolveMergeResponse = (ResolveMergeResponse) obj;
        resolveMergeResponse.getClass();
        ResponseContext responseContext = resolveMergeResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        ResolveMergeResponse.Status status = resolveMergeResponse.status;
        byteString.getClass();
        return new ResolveMergeResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ResolveMergeResponse resolveMergeResponse = (ResolveMergeResponse) obj;
        resolveMergeResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 3, resolveMergeResponse.response_context);
        ResolveMergeResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, resolveMergeResponse.status);
        protoWriter.writeBytes(resolveMergeResponse.unknownFields());
    }
}

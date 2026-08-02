package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.SkipBlockerResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SkipBlockerResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SkipBlockerResponse((ResponseContext) obj, (SkipBlockerResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = SkipBlockerResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SkipBlockerResponse skipBlockerResponse = (SkipBlockerResponse) obj;
        reverseProtoWriter.getClass();
        skipBlockerResponse.getClass();
        reverseProtoWriter.writeBytes(skipBlockerResponse.unknownFields());
        SkipBlockerResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, skipBlockerResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, skipBlockerResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SkipBlockerResponse skipBlockerResponse = (SkipBlockerResponse) obj;
        skipBlockerResponse.getClass();
        return SkipBlockerResponse.Status.ADAPTER.encodedSizeWithTag(1, skipBlockerResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(4, skipBlockerResponse.response_context) + skipBlockerResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SkipBlockerResponse skipBlockerResponse = (SkipBlockerResponse) obj;
        skipBlockerResponse.getClass();
        ResponseContext responseContext = skipBlockerResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        SkipBlockerResponse.Status status = skipBlockerResponse.status;
        byteString.getClass();
        return new SkipBlockerResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SkipBlockerResponse skipBlockerResponse = (SkipBlockerResponse) obj;
        skipBlockerResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 4, skipBlockerResponse.response_context);
        SkipBlockerResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, skipBlockerResponse.status);
        protoWriter.writeBytes(skipBlockerResponse.unknownFields());
    }
}

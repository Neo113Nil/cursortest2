package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.ClearProfilePhotoResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ClearProfilePhotoResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClearProfilePhotoResponse((ClearProfilePhotoResponse.Status) obj, (ResponseContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = ClearProfilePhotoResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClearProfilePhotoResponse clearProfilePhotoResponse = (ClearProfilePhotoResponse) obj;
        reverseProtoWriter.getClass();
        clearProfilePhotoResponse.getClass();
        reverseProtoWriter.writeBytes(clearProfilePhotoResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, clearProfilePhotoResponse.response_context);
        ClearProfilePhotoResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, clearProfilePhotoResponse.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClearProfilePhotoResponse clearProfilePhotoResponse = (ClearProfilePhotoResponse) obj;
        clearProfilePhotoResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(2, clearProfilePhotoResponse.response_context) + ClearProfilePhotoResponse.Status.ADAPTER.encodedSizeWithTag(1, clearProfilePhotoResponse.status) + clearProfilePhotoResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClearProfilePhotoResponse clearProfilePhotoResponse = (ClearProfilePhotoResponse) obj;
        clearProfilePhotoResponse.getClass();
        ResponseContext responseContext = clearProfilePhotoResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        ClearProfilePhotoResponse.Status status = clearProfilePhotoResponse.status;
        byteString.getClass();
        return new ClearProfilePhotoResponse(status, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClearProfilePhotoResponse clearProfilePhotoResponse = (ClearProfilePhotoResponse) obj;
        clearProfilePhotoResponse.getClass();
        ClearProfilePhotoResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, clearProfilePhotoResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, clearProfilePhotoResponse.response_context);
        protoWriter.writeBytes(clearProfilePhotoResponse.unknownFields());
    }
}

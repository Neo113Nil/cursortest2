package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UploadFileResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UploadFileResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 8) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UploadFileResponse uploadFileResponse = (UploadFileResponse) obj;
        reverseProtoWriter.getClass();
        uploadFileResponse.getClass();
        reverseProtoWriter.writeBytes(uploadFileResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 8, uploadFileResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UploadFileResponse uploadFileResponse = (UploadFileResponse) obj;
        uploadFileResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(8, uploadFileResponse.response_context) + uploadFileResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UploadFileResponse uploadFileResponse = (UploadFileResponse) obj;
        uploadFileResponse.getClass();
        ResponseContext responseContext = uploadFileResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UploadFileResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UploadFileResponse uploadFileResponse = (UploadFileResponse) obj;
        uploadFileResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 8, uploadFileResponse.response_context);
        protoWriter.writeBytes(uploadFileResponse.unknownFields());
    }
}

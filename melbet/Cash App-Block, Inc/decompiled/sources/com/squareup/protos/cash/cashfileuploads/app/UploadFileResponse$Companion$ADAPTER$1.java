package com.squareup.protos.cash.cashfileuploads.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UploadFileResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = "";
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UploadFileResponse((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
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
        String str = uploadFileResponse.file_token;
        if (Intrinsics.areEqual(str, "")) {
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, str);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UploadFileResponse uploadFileResponse = (UploadFileResponse) obj;
        uploadFileResponse.getClass();
        int size$okio = uploadFileResponse.unknownFields().getSize$okio();
        String str = uploadFileResponse.file_token;
        return !Intrinsics.areEqual(str, "") ? ProtoAdapter.STRING.encodedSizeWithTag(1, str) + size$okio : size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UploadFileResponse uploadFileResponse = (UploadFileResponse) obj;
        uploadFileResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = uploadFileResponse.file_token;
        str.getClass();
        byteString.getClass();
        return new UploadFileResponse(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UploadFileResponse uploadFileResponse = (UploadFileResponse) obj;
        uploadFileResponse.getClass();
        String str = uploadFileResponse.file_token;
        if (!Intrinsics.areEqual(str, "")) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str);
        }
        protoWriter.writeBytes(uploadFileResponse.unknownFields());
    }
}

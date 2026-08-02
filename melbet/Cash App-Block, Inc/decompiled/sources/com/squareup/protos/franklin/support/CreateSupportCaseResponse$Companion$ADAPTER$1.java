package com.squareup.protos.franklin.support;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CreateSupportCaseResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateSupportCaseResponse((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateSupportCaseResponse createSupportCaseResponse = (CreateSupportCaseResponse) obj;
        reverseProtoWriter.getClass();
        createSupportCaseResponse.getClass();
        reverseProtoWriter.writeBytes(createSupportCaseResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, createSupportCaseResponse.result_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateSupportCaseResponse createSupportCaseResponse = (CreateSupportCaseResponse) obj;
        createSupportCaseResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, createSupportCaseResponse.result_text) + createSupportCaseResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((CreateSupportCaseResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CreateSupportCaseResponse(null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateSupportCaseResponse createSupportCaseResponse = (CreateSupportCaseResponse) obj;
        createSupportCaseResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, createSupportCaseResponse.result_text);
        protoWriter.writeBytes(createSupportCaseResponse.unknownFields());
    }
}

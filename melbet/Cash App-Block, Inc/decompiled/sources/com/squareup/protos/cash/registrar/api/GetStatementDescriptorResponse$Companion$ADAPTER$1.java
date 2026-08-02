package com.squareup.protos.cash.registrar.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetStatementDescriptorResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetStatementDescriptorResponse((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetStatementDescriptorResponse getStatementDescriptorResponse = (GetStatementDescriptorResponse) obj;
        reverseProtoWriter.getClass();
        getStatementDescriptorResponse.getClass();
        reverseProtoWriter.writeBytes(getStatementDescriptorResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, getStatementDescriptorResponse.display_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, getStatementDescriptorResponse.file_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetStatementDescriptorResponse getStatementDescriptorResponse = (GetStatementDescriptorResponse) obj;
        getStatementDescriptorResponse.getClass();
        int size$okio = getStatementDescriptorResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, getStatementDescriptorResponse.display_name) + protoAdapter.encodedSizeWithTag(1, getStatementDescriptorResponse.file_name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetStatementDescriptorResponse getStatementDescriptorResponse = (GetStatementDescriptorResponse) obj;
        getStatementDescriptorResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = getStatementDescriptorResponse.file_name;
        String str2 = getStatementDescriptorResponse.display_name;
        byteString.getClass();
        return new GetStatementDescriptorResponse(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetStatementDescriptorResponse getStatementDescriptorResponse = (GetStatementDescriptorResponse) obj;
        getStatementDescriptorResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, getStatementDescriptorResponse.file_name);
        protoAdapter.encodeWithTag(protoWriter, 2, getStatementDescriptorResponse.display_name);
        protoWriter.writeBytes(getStatementDescriptorResponse.unknownFields());
    }
}

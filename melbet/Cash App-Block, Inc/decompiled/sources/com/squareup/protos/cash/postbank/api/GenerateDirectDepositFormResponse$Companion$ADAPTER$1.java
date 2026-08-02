package com.squareup.protos.cash.postbank.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenerateDirectDepositFormResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenerateDirectDepositFormResponse((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        GenerateDirectDepositFormResponse generateDirectDepositFormResponse = (GenerateDirectDepositFormResponse) obj;
        reverseProtoWriter.getClass();
        generateDirectDepositFormResponse.getClass();
        reverseProtoWriter.writeBytes(generateDirectDepositFormResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, generateDirectDepositFormResponse.document_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, generateDirectDepositFormResponse.file_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenerateDirectDepositFormResponse generateDirectDepositFormResponse = (GenerateDirectDepositFormResponse) obj;
        generateDirectDepositFormResponse.getClass();
        int size$okio = generateDirectDepositFormResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, generateDirectDepositFormResponse.document_token) + protoAdapter.encodedSizeWithTag(1, generateDirectDepositFormResponse.file_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenerateDirectDepositFormResponse generateDirectDepositFormResponse = (GenerateDirectDepositFormResponse) obj;
        generateDirectDepositFormResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = generateDirectDepositFormResponse.document_token;
        byteString.getClass();
        return new GenerateDirectDepositFormResponse(null, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenerateDirectDepositFormResponse generateDirectDepositFormResponse = (GenerateDirectDepositFormResponse) obj;
        generateDirectDepositFormResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, generateDirectDepositFormResponse.file_url);
        protoAdapter.encodeWithTag(protoWriter, 2, generateDirectDepositFormResponse.document_token);
        protoWriter.writeBytes(generateDirectDepositFormResponse.unknownFields());
    }
}

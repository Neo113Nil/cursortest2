package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.CreateCFPBSettlementCaseResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CreateCFPBSettlementCaseResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateCFPBSettlementCaseResponse((CreateCFPBSettlementCaseResponse.Status) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CreateCFPBSettlementCaseResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateCFPBSettlementCaseResponse createCFPBSettlementCaseResponse = (CreateCFPBSettlementCaseResponse) obj;
        reverseProtoWriter.getClass();
        createCFPBSettlementCaseResponse.getClass();
        reverseProtoWriter.writeBytes(createCFPBSettlementCaseResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, createCFPBSettlementCaseResponse.message);
        CreateCFPBSettlementCaseResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, createCFPBSettlementCaseResponse.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateCFPBSettlementCaseResponse createCFPBSettlementCaseResponse = (CreateCFPBSettlementCaseResponse) obj;
        createCFPBSettlementCaseResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, createCFPBSettlementCaseResponse.message) + CreateCFPBSettlementCaseResponse.Status.ADAPTER.encodedSizeWithTag(1, createCFPBSettlementCaseResponse.status) + createCFPBSettlementCaseResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateCFPBSettlementCaseResponse createCFPBSettlementCaseResponse = (CreateCFPBSettlementCaseResponse) obj;
        createCFPBSettlementCaseResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        CreateCFPBSettlementCaseResponse.Status status = createCFPBSettlementCaseResponse.status;
        String str = createCFPBSettlementCaseResponse.message;
        byteString.getClass();
        return new CreateCFPBSettlementCaseResponse(status, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateCFPBSettlementCaseResponse createCFPBSettlementCaseResponse = (CreateCFPBSettlementCaseResponse) obj;
        createCFPBSettlementCaseResponse.getClass();
        CreateCFPBSettlementCaseResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, createCFPBSettlementCaseResponse.status);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, createCFPBSettlementCaseResponse.message);
        protoWriter.writeBytes(createCFPBSettlementCaseResponse.unknownFields());
    }
}

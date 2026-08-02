package com.squareup.protos.franklin.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class HumanConfirmationRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new HumanConfirmationRequest((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HumanConfirmationRequest humanConfirmationRequest = (HumanConfirmationRequest) obj;
        reverseProtoWriter.getClass();
        humanConfirmationRequest.getClass();
        reverseProtoWriter.writeBytes(humanConfirmationRequest.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, humanConfirmationRequest.blocker_descriptor_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, humanConfirmationRequest.proof);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, humanConfirmationRequest.confirmation_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HumanConfirmationRequest humanConfirmationRequest = (HumanConfirmationRequest) obj;
        humanConfirmationRequest.getClass();
        int size$okio = humanConfirmationRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, humanConfirmationRequest.blocker_descriptor_id) + protoAdapter.encodedSizeWithTag(2, humanConfirmationRequest.proof) + protoAdapter.encodedSizeWithTag(1, humanConfirmationRequest.confirmation_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HumanConfirmationRequest humanConfirmationRequest = (HumanConfirmationRequest) obj;
        humanConfirmationRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = humanConfirmationRequest.confirmation_id;
        String str2 = humanConfirmationRequest.proof;
        String str3 = humanConfirmationRequest.blocker_descriptor_id;
        byteString.getClass();
        return new HumanConfirmationRequest(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HumanConfirmationRequest humanConfirmationRequest = (HumanConfirmationRequest) obj;
        humanConfirmationRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, humanConfirmationRequest.confirmation_id);
        protoAdapter.encodeWithTag(protoWriter, 2, humanConfirmationRequest.proof);
        protoAdapter.encodeWithTag(protoWriter, 3, humanConfirmationRequest.blocker_descriptor_id);
        protoWriter.writeBytes(humanConfirmationRequest.unknownFields());
    }
}

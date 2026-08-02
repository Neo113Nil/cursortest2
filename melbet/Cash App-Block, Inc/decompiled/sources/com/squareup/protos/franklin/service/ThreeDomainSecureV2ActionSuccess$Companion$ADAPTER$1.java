package com.squareup.protos.franklin.service;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ThreeDomainSecureV2ActionSuccess$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ThreeDomainSecureV2ActionSuccess((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        ThreeDomainSecureV2ActionSuccess threeDomainSecureV2ActionSuccess = (ThreeDomainSecureV2ActionSuccess) obj;
        reverseProtoWriter.getClass();
        threeDomainSecureV2ActionSuccess.getClass();
        reverseProtoWriter.writeBytes(threeDomainSecureV2ActionSuccess.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, threeDomainSecureV2ActionSuccess.security_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, threeDomainSecureV2ActionSuccess.action_details);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ThreeDomainSecureV2ActionSuccess threeDomainSecureV2ActionSuccess = (ThreeDomainSecureV2ActionSuccess) obj;
        threeDomainSecureV2ActionSuccess.getClass();
        int size$okio = threeDomainSecureV2ActionSuccess.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, threeDomainSecureV2ActionSuccess.security_code) + protoAdapter.encodedSizeWithTag(1, threeDomainSecureV2ActionSuccess.action_details) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ThreeDomainSecureV2ActionSuccess threeDomainSecureV2ActionSuccess = (ThreeDomainSecureV2ActionSuccess) obj;
        threeDomainSecureV2ActionSuccess.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = threeDomainSecureV2ActionSuccess.action_details;
        byteString.getClass();
        return new ThreeDomainSecureV2ActionSuccess(str, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ThreeDomainSecureV2ActionSuccess threeDomainSecureV2ActionSuccess = (ThreeDomainSecureV2ActionSuccess) obj;
        threeDomainSecureV2ActionSuccess.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, threeDomainSecureV2ActionSuccess.action_details);
        protoAdapter.encodeWithTag(protoWriter, 2, threeDomainSecureV2ActionSuccess.security_code);
        protoWriter.writeBytes(threeDomainSecureV2ActionSuccess.unknownFields());
    }
}

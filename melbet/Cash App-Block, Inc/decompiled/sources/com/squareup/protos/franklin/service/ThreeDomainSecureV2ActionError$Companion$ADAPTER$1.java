package com.squareup.protos.franklin.service;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ThreeDomainSecureV2ActionError$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ThreeDomainSecureV2ActionError((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        ThreeDomainSecureV2ActionError threeDomainSecureV2ActionError = (ThreeDomainSecureV2ActionError) obj;
        reverseProtoWriter.getClass();
        threeDomainSecureV2ActionError.getClass();
        reverseProtoWriter.writeBytes(threeDomainSecureV2ActionError.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, threeDomainSecureV2ActionError.adyen_lib_error_message);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, threeDomainSecureV2ActionError.adyen_lib_error_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ThreeDomainSecureV2ActionError threeDomainSecureV2ActionError = (ThreeDomainSecureV2ActionError) obj;
        threeDomainSecureV2ActionError.getClass();
        int size$okio = threeDomainSecureV2ActionError.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, threeDomainSecureV2ActionError.adyen_lib_error_message) + protoAdapter.encodedSizeWithTag(1, threeDomainSecureV2ActionError.adyen_lib_error_type) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ThreeDomainSecureV2ActionError threeDomainSecureV2ActionError = (ThreeDomainSecureV2ActionError) obj;
        threeDomainSecureV2ActionError.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = threeDomainSecureV2ActionError.adyen_lib_error_type;
        String str2 = threeDomainSecureV2ActionError.adyen_lib_error_message;
        byteString.getClass();
        return new ThreeDomainSecureV2ActionError(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ThreeDomainSecureV2ActionError threeDomainSecureV2ActionError = (ThreeDomainSecureV2ActionError) obj;
        threeDomainSecureV2ActionError.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, threeDomainSecureV2ActionError.adyen_lib_error_type);
        protoAdapter.encodeWithTag(protoWriter, 2, threeDomainSecureV2ActionError.adyen_lib_error_message);
        protoWriter.writeBytes(threeDomainSecureV2ActionError.unknownFields());
    }
}

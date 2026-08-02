package com.squareup.protos.cash.supportal.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ValidateEmailResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ValidateEmailResponse((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ValidateEmailResponse validateEmailResponse = (ValidateEmailResponse) obj;
        reverseProtoWriter.getClass();
        validateEmailResponse.getClass();
        reverseProtoWriter.writeBytes(validateEmailResponse.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, validateEmailResponse.is_valid);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ValidateEmailResponse validateEmailResponse = (ValidateEmailResponse) obj;
        validateEmailResponse.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, validateEmailResponse.is_valid) + validateEmailResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ValidateEmailResponse validateEmailResponse = (ValidateEmailResponse) obj;
        validateEmailResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = validateEmailResponse.is_valid;
        byteString.getClass();
        return new ValidateEmailResponse(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ValidateEmailResponse validateEmailResponse = (ValidateEmailResponse) obj;
        validateEmailResponse.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, validateEmailResponse.is_valid);
        protoWriter.writeBytes(validateEmailResponse.unknownFields());
    }
}

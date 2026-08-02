package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RegisterLiteP2pPaymentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RegisterLiteP2pPaymentResponse((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        RegisterLiteP2pPaymentResponse registerLiteP2pPaymentResponse = (RegisterLiteP2pPaymentResponse) obj;
        reverseProtoWriter.getClass();
        registerLiteP2pPaymentResponse.getClass();
        reverseProtoWriter.writeBytes(registerLiteP2pPaymentResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, registerLiteP2pPaymentResponse.operation_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RegisterLiteP2pPaymentResponse registerLiteP2pPaymentResponse = (RegisterLiteP2pPaymentResponse) obj;
        registerLiteP2pPaymentResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, registerLiteP2pPaymentResponse.operation_token) + registerLiteP2pPaymentResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RegisterLiteP2pPaymentResponse registerLiteP2pPaymentResponse = (RegisterLiteP2pPaymentResponse) obj;
        registerLiteP2pPaymentResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = registerLiteP2pPaymentResponse.operation_token;
        byteString.getClass();
        return new RegisterLiteP2pPaymentResponse(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RegisterLiteP2pPaymentResponse registerLiteP2pPaymentResponse = (RegisterLiteP2pPaymentResponse) obj;
        registerLiteP2pPaymentResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, registerLiteP2pPaymentResponse.operation_token);
        protoWriter.writeBytes(registerLiteP2pPaymentResponse.unknownFields());
    }
}

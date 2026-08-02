package com.squareup.protos.franklin.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RegisterAppMessageActionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RegisterAppMessageActionResponse(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RegisterAppMessageActionResponse registerAppMessageActionResponse = (RegisterAppMessageActionResponse) obj;
        reverseProtoWriter.getClass();
        registerAppMessageActionResponse.getClass();
        reverseProtoWriter.writeBytes(registerAppMessageActionResponse.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RegisterAppMessageActionResponse registerAppMessageActionResponse = (RegisterAppMessageActionResponse) obj;
        registerAppMessageActionResponse.getClass();
        return registerAppMessageActionResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((RegisterAppMessageActionResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RegisterAppMessageActionResponse(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RegisterAppMessageActionResponse registerAppMessageActionResponse = (RegisterAppMessageActionResponse) obj;
        registerAppMessageActionResponse.getClass();
        protoWriter.writeBytes(registerAppMessageActionResponse.unknownFields());
    }
}

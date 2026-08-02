package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.RegisterDeviceResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RegisterDeviceResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RegisterDeviceResponse((RegisterDeviceResponse.Status) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = RegisterDeviceResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RegisterDeviceResponse registerDeviceResponse = (RegisterDeviceResponse) obj;
        reverseProtoWriter.getClass();
        registerDeviceResponse.getClass();
        reverseProtoWriter.writeBytes(registerDeviceResponse.unknownFields());
        RegisterDeviceResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, registerDeviceResponse.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RegisterDeviceResponse registerDeviceResponse = (RegisterDeviceResponse) obj;
        registerDeviceResponse.getClass();
        return RegisterDeviceResponse.Status.ADAPTER.encodedSizeWithTag(1, registerDeviceResponse.status) + registerDeviceResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RegisterDeviceResponse registerDeviceResponse = (RegisterDeviceResponse) obj;
        registerDeviceResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        RegisterDeviceResponse.Status status = registerDeviceResponse.status;
        byteString.getClass();
        return new RegisterDeviceResponse(status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RegisterDeviceResponse registerDeviceResponse = (RegisterDeviceResponse) obj;
        registerDeviceResponse.getClass();
        RegisterDeviceResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, registerDeviceResponse.status);
        protoWriter.writeBytes(registerDeviceResponse.unknownFields());
    }
}

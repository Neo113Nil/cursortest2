package com.squareup.protos.cash.deviceintegritly.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AppAttestAssertion$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AppAttestAssertion((String) obj, (ByteString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BYTES.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppAttestAssertion appAttestAssertion = (AppAttestAssertion) obj;
        reverseProtoWriter.getClass();
        appAttestAssertion.getClass();
        reverseProtoWriter.writeBytes(appAttestAssertion.unknownFields());
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 2, appAttestAssertion.payload);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, appAttestAssertion.key_identifier);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AppAttestAssertion appAttestAssertion = (AppAttestAssertion) obj;
        appAttestAssertion.getClass();
        return ProtoAdapter.BYTES.encodedSizeWithTag(2, appAttestAssertion.payload) + ProtoAdapter.STRING.encodedSizeWithTag(1, appAttestAssertion.key_identifier) + appAttestAssertion.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppAttestAssertion appAttestAssertion = (AppAttestAssertion) obj;
        appAttestAssertion.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = appAttestAssertion.key_identifier;
        ByteString byteString2 = appAttestAssertion.payload;
        byteString.getClass();
        return new AppAttestAssertion(str, byteString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppAttestAssertion appAttestAssertion = (AppAttestAssertion) obj;
        appAttestAssertion.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, appAttestAssertion.key_identifier);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, appAttestAssertion.payload);
        protoWriter.writeBytes(appAttestAssertion.unknownFields());
    }
}

package com.squareup.protos.cash.taply.app.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FidesmoEncryptionData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FidesmoEncryptionData((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        FidesmoEncryptionData fidesmoEncryptionData = (FidesmoEncryptionData) obj;
        reverseProtoWriter.getClass();
        fidesmoEncryptionData.getClass();
        reverseProtoWriter.writeBytes(fidesmoEncryptionData.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, fidesmoEncryptionData.service_key);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FidesmoEncryptionData fidesmoEncryptionData = (FidesmoEncryptionData) obj;
        fidesmoEncryptionData.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, fidesmoEncryptionData.service_key) + fidesmoEncryptionData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((FidesmoEncryptionData) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new FidesmoEncryptionData(null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FidesmoEncryptionData fidesmoEncryptionData = (FidesmoEncryptionData) obj;
        fidesmoEncryptionData.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, fidesmoEncryptionData.service_key);
        protoWriter.writeBytes(fidesmoEncryptionData.unknownFields());
    }
}

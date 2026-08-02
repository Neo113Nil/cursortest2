package com.squareup.protos.cash.taply.app.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class EncryptedCardData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EncryptedCardData((String) obj, (ByteString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        EncryptedCardData encryptedCardData = (EncryptedCardData) obj;
        reverseProtoWriter.getClass();
        encryptedCardData.getClass();
        reverseProtoWriter.writeBytes(encryptedCardData.unknownFields());
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 2, encryptedCardData.encrypted_card_info);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, encryptedCardData.encrypted_ephemeral_key);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EncryptedCardData encryptedCardData = (EncryptedCardData) obj;
        encryptedCardData.getClass();
        return ProtoAdapter.BYTES.encodedSizeWithTag(2, encryptedCardData.encrypted_card_info) + ProtoAdapter.STRING.encodedSizeWithTag(1, encryptedCardData.encrypted_ephemeral_key) + encryptedCardData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EncryptedCardData encryptedCardData = (EncryptedCardData) obj;
        encryptedCardData.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = encryptedCardData.encrypted_ephemeral_key;
        ByteString byteString2 = encryptedCardData.encrypted_card_info;
        byteString.getClass();
        return new EncryptedCardData(str, byteString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EncryptedCardData encryptedCardData = (EncryptedCardData) obj;
        encryptedCardData.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, encryptedCardData.encrypted_ephemeral_key);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, encryptedCardData.encrypted_card_info);
        protoWriter.writeBytes(encryptedCardData.unknownFields());
    }
}

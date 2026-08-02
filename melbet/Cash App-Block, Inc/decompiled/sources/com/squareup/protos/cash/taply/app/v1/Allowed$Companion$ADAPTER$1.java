package com.squareup.protos.cash.taply.app.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Allowed$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Allowed((EncryptedCardData) obj, (String) obj2, (DeviceMetadata) obj3, (SuccessScreen) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(EncryptedCardData.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(DeviceMetadata.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(SuccessScreen.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Allowed allowed = (Allowed) obj;
        reverseProtoWriter.getClass();
        allowed.getClass();
        reverseProtoWriter.writeBytes(allowed.unknownFields());
        SuccessScreen.ADAPTER.encodeWithTag(reverseProtoWriter, 4, allowed.success_screen);
        DeviceMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 3, allowed.device_metadata);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, allowed.customer_token_hash_email);
        EncryptedCardData.ADAPTER.encodeWithTag(reverseProtoWriter, 1, allowed.card_encryption_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Allowed allowed = (Allowed) obj;
        allowed.getClass();
        return SuccessScreen.ADAPTER.encodedSizeWithTag(4, allowed.success_screen) + DeviceMetadata.ADAPTER.encodedSizeWithTag(3, allowed.device_metadata) + ProtoAdapter.STRING.encodedSizeWithTag(2, allowed.customer_token_hash_email) + EncryptedCardData.ADAPTER.encodedSizeWithTag(1, allowed.card_encryption_data) + allowed.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Allowed allowed = (Allowed) obj;
        allowed.getClass();
        DeviceMetadata deviceMetadata = allowed.device_metadata;
        DeviceMetadata deviceMetadata2 = deviceMetadata != null ? (DeviceMetadata) DeviceMetadata.ADAPTER.redact(deviceMetadata) : null;
        SuccessScreen successScreen = allowed.success_screen;
        SuccessScreen successScreen2 = successScreen != null ? (SuccessScreen) SuccessScreen.ADAPTER.redact(successScreen) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Allowed(null, null, deviceMetadata2, successScreen2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Allowed allowed = (Allowed) obj;
        allowed.getClass();
        EncryptedCardData.ADAPTER.encodeWithTag(protoWriter, 1, allowed.card_encryption_data);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, allowed.customer_token_hash_email);
        DeviceMetadata.ADAPTER.encodeWithTag(protoWriter, 3, allowed.device_metadata);
        SuccessScreen.ADAPTER.encodeWithTag(protoWriter, 4, allowed.success_screen);
        protoWriter.writeBytes(allowed.unknownFields());
    }
}

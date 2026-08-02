package com.squareup.protos.franklin.common;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class EncryptedSyncEntity$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EncryptedSyncEntity((ByteString) obj, (SyncEntityType) obj2, (SyncValueType) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = SyncEntityType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = SyncValueType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EncryptedSyncEntity encryptedSyncEntity = (EncryptedSyncEntity) obj;
        reverseProtoWriter.getClass();
        encryptedSyncEntity.getClass();
        reverseProtoWriter.writeBytes(encryptedSyncEntity.unknownFields());
        SyncValueType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, encryptedSyncEntity.sync_value_type);
        SyncEntityType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, encryptedSyncEntity.f1377type);
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, encryptedSyncEntity.encrypted_sync_entity);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EncryptedSyncEntity encryptedSyncEntity = (EncryptedSyncEntity) obj;
        encryptedSyncEntity.getClass();
        return SyncValueType.ADAPTER.encodedSizeWithTag(3, encryptedSyncEntity.sync_value_type) + SyncEntityType.ADAPTER.encodedSizeWithTag(2, encryptedSyncEntity.f1377type) + ProtoAdapter.BYTES.encodedSizeWithTag(1, encryptedSyncEntity.encrypted_sync_entity) + encryptedSyncEntity.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EncryptedSyncEntity encryptedSyncEntity = (EncryptedSyncEntity) obj;
        encryptedSyncEntity.getClass();
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = encryptedSyncEntity.encrypted_sync_entity;
        SyncEntityType syncEntityType = encryptedSyncEntity.f1377type;
        SyncValueType syncValueType = encryptedSyncEntity.sync_value_type;
        byteString.getClass();
        return new EncryptedSyncEntity(byteString2, syncEntityType, syncValueType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EncryptedSyncEntity encryptedSyncEntity = (EncryptedSyncEntity) obj;
        encryptedSyncEntity.getClass();
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, encryptedSyncEntity.encrypted_sync_entity);
        SyncEntityType.ADAPTER.encodeWithTag(protoWriter, 2, encryptedSyncEntity.f1377type);
        SyncValueType.ADAPTER.encodeWithTag(protoWriter, 3, encryptedSyncEntity.sync_value_type);
        protoWriter.writeBytes(encryptedSyncEntity.unknownFields());
    }
}

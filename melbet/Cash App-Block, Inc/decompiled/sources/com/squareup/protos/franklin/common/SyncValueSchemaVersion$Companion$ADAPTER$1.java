package com.squareup.protos.franklin.common;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncValueSchemaVersion$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncValueSchemaVersion((SyncValueType) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = SyncValueType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncValueSchemaVersion syncValueSchemaVersion = (SyncValueSchemaVersion) obj;
        reverseProtoWriter.getClass();
        syncValueSchemaVersion.getClass();
        reverseProtoWriter.writeBytes(syncValueSchemaVersion.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, syncValueSchemaVersion.version);
        SyncValueType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncValueSchemaVersion.f1394type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncValueSchemaVersion syncValueSchemaVersion = (SyncValueSchemaVersion) obj;
        syncValueSchemaVersion.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, syncValueSchemaVersion.version) + SyncValueType.ADAPTER.encodedSizeWithTag(1, syncValueSchemaVersion.f1394type) + syncValueSchemaVersion.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncValueSchemaVersion syncValueSchemaVersion = (SyncValueSchemaVersion) obj;
        syncValueSchemaVersion.getClass();
        ByteString byteString = ByteString.EMPTY;
        SyncValueType syncValueType = syncValueSchemaVersion.f1394type;
        Long l = syncValueSchemaVersion.version;
        byteString.getClass();
        return new SyncValueSchemaVersion(syncValueType, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncValueSchemaVersion syncValueSchemaVersion = (SyncValueSchemaVersion) obj;
        syncValueSchemaVersion.getClass();
        SyncValueType.ADAPTER.encodeWithTag(protoWriter, 1, syncValueSchemaVersion.f1394type);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, syncValueSchemaVersion.version);
        protoWriter.writeBytes(syncValueSchemaVersion.unknownFields());
    }
}

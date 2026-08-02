package com.squareup.stafftasks.resources;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TargetEntity$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TargetEntity((String) obj, (TargetEntityType) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = TargetEntityType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TargetEntity targetEntity = (TargetEntity) obj;
        reverseProtoWriter.getClass();
        targetEntity.getClass();
        reverseProtoWriter.writeBytes(targetEntity.unknownFields());
        TargetEntityType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, targetEntity.entity_type);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, targetEntity.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TargetEntity targetEntity = (TargetEntity) obj;
        targetEntity.getClass();
        return TargetEntityType.ADAPTER.encodedSizeWithTag(2, targetEntity.entity_type) + ProtoAdapter.STRING.encodedSizeWithTag(1, targetEntity.id) + targetEntity.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TargetEntity targetEntity = (TargetEntity) obj;
        targetEntity.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = targetEntity.id;
        TargetEntityType targetEntityType = targetEntity.entity_type;
        byteString.getClass();
        return new TargetEntity(str, targetEntityType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TargetEntity targetEntity = (TargetEntity) obj;
        targetEntity.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, targetEntity.id);
        TargetEntityType.ADAPTER.encodeWithTag(protoWriter, 2, targetEntity.entity_type);
        protoWriter.writeBytes(targetEntity.unknownFields());
    }
}

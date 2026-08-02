package com.squareup.protos.cash.clientsync.service;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.syncentity.DomainType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TargetSpecifications$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TargetSpecifications((SyncTopic) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = SyncTopic.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    DomainType.ADAPTER.tryDecode(protoReader, m);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TargetSpecifications targetSpecifications = (TargetSpecifications) obj;
        reverseProtoWriter.getClass();
        targetSpecifications.getClass();
        reverseProtoWriter.writeBytes(targetSpecifications.unknownFields());
        DomainType.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, targetSpecifications.domain_types);
        SyncTopic.ADAPTER.encodeWithTag(reverseProtoWriter, 1, targetSpecifications.sync_topic);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TargetSpecifications targetSpecifications = (TargetSpecifications) obj;
        targetSpecifications.getClass();
        return DomainType.ADAPTER.asRepeated().encodedSizeWithTag(3, targetSpecifications.domain_types) + SyncTopic.ADAPTER.encodedSizeWithTag(1, targetSpecifications.sync_topic) + targetSpecifications.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TargetSpecifications targetSpecifications = (TargetSpecifications) obj;
        targetSpecifications.getClass();
        ByteString byteString = ByteString.EMPTY;
        SyncTopic syncTopic = targetSpecifications.sync_topic;
        List list = targetSpecifications.domain_types;
        list.getClass();
        byteString.getClass();
        return new TargetSpecifications(syncTopic, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TargetSpecifications targetSpecifications = (TargetSpecifications) obj;
        targetSpecifications.getClass();
        SyncTopic.ADAPTER.encodeWithTag(protoWriter, 1, targetSpecifications.sync_topic);
        DomainType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, targetSpecifications.domain_types);
        protoWriter.writeBytes(targetSpecifications.unknownFields());
    }
}

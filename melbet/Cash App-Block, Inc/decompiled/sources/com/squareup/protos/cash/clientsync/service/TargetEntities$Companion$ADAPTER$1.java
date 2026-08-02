package com.squareup.protos.cash.clientsync.service;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TargetEntities$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TargetEntities((TargetSpecifications) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(TargetSpecifications.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(SyncEntity.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TargetEntities targetEntities = (TargetEntities) obj;
        reverseProtoWriter.getClass();
        targetEntities.getClass();
        reverseProtoWriter.writeBytes(targetEntities.unknownFields());
        SyncEntity.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, targetEntities.entities);
        TargetSpecifications.ADAPTER.encodeWithTag(reverseProtoWriter, 1, targetEntities.target_specifications);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TargetEntities targetEntities = (TargetEntities) obj;
        targetEntities.getClass();
        return SyncEntity.ADAPTER.asRepeated().encodedSizeWithTag(2, targetEntities.entities) + TargetSpecifications.ADAPTER.encodedSizeWithTag(1, targetEntities.target_specifications) + targetEntities.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TargetEntities targetEntities = (TargetEntities) obj;
        targetEntities.getClass();
        TargetSpecifications targetSpecifications = targetEntities.target_specifications;
        TargetSpecifications targetSpecifications2 = targetSpecifications != null ? (TargetSpecifications) TargetSpecifications.ADAPTER.redact(targetSpecifications) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(targetEntities.entities, SyncEntity.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new TargetEntities(targetSpecifications2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TargetEntities targetEntities = (TargetEntities) obj;
        targetEntities.getClass();
        TargetSpecifications.ADAPTER.encodeWithTag(protoWriter, 1, targetEntities.target_specifications);
        SyncEntity.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, targetEntities.entities);
        protoWriter.writeBytes(targetEntities.unknownFields());
    }
}

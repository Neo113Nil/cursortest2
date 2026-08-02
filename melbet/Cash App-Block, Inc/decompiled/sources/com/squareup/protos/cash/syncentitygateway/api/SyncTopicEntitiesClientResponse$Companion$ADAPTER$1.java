package com.squareup.protos.cash.syncentitygateway.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.SyncEntitiesResponse;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncTopicEntitiesClientResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncTopicEntitiesClientResponse((Integer) obj, m, (ByteString) obj2, (Boolean) obj3, (SyncEntitiesResponse.RefreshAllEntitiesType) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(SyncEntity.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag == 4) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = SyncEntitiesResponse.RefreshAllEntitiesType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncTopicEntitiesClientResponse syncTopicEntitiesClientResponse = (SyncTopicEntitiesClientResponse) obj;
        reverseProtoWriter.getClass();
        syncTopicEntitiesClientResponse.getClass();
        reverseProtoWriter.writeBytes(syncTopicEntitiesClientResponse.unknownFields());
        SyncEntitiesResponse.RefreshAllEntitiesType.ADAPTER.encodeWithTag(reverseProtoWriter, 5, syncTopicEntitiesClientResponse.refresh_all_entities);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, syncTopicEntitiesClientResponse.has_more);
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 3, syncTopicEntitiesClientResponse.sync_range);
        SyncEntity.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, syncTopicEntitiesClientResponse.entities);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, syncTopicEntitiesClientResponse.topic);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncTopicEntitiesClientResponse syncTopicEntitiesClientResponse = (SyncTopicEntitiesClientResponse) obj;
        syncTopicEntitiesClientResponse.getClass();
        return SyncEntitiesResponse.RefreshAllEntitiesType.ADAPTER.encodedSizeWithTag(5, syncTopicEntitiesClientResponse.refresh_all_entities) + ProtoAdapter.BOOL.encodedSizeWithTag(4, syncTopicEntitiesClientResponse.has_more) + ProtoAdapter.BYTES.encodedSizeWithTag(3, syncTopicEntitiesClientResponse.sync_range) + SyncEntity.ADAPTER.asRepeated().encodedSizeWithTag(2, syncTopicEntitiesClientResponse.entities) + ProtoAdapter.INT32.encodedSizeWithTag(1, syncTopicEntitiesClientResponse.topic) + syncTopicEntitiesClientResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncTopicEntitiesClientResponse syncTopicEntitiesClientResponse = (SyncTopicEntitiesClientResponse) obj;
        syncTopicEntitiesClientResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(syncTopicEntitiesClientResponse.entities, SyncEntity.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Integer num = syncTopicEntitiesClientResponse.topic;
        ByteString byteString2 = syncTopicEntitiesClientResponse.sync_range;
        Boolean bool = syncTopicEntitiesClientResponse.has_more;
        SyncEntitiesResponse.RefreshAllEntitiesType refreshAllEntitiesType = syncTopicEntitiesClientResponse.refresh_all_entities;
        byteString.getClass();
        return new SyncTopicEntitiesClientResponse(num, m1169redactElements, byteString2, bool, refreshAllEntitiesType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncTopicEntitiesClientResponse syncTopicEntitiesClientResponse = (SyncTopicEntitiesClientResponse) obj;
        syncTopicEntitiesClientResponse.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, syncTopicEntitiesClientResponse.topic);
        SyncEntity.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, syncTopicEntitiesClientResponse.entities);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, syncTopicEntitiesClientResponse.sync_range);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, syncTopicEntitiesClientResponse.has_more);
        SyncEntitiesResponse.RefreshAllEntitiesType.ADAPTER.encodeWithTag(protoWriter, 5, syncTopicEntitiesClientResponse.refresh_all_entities);
        protoWriter.writeBytes(syncTopicEntitiesClientResponse.unknownFields());
    }
}

package com.squareup.protos.cash.syncentitygateway.api;

import com.squareup.protos.franklin.common.Trigger;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncTopicEntitiesClientRequest$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SyncTopicEntitiesClientRequest((Integer) obj, (ByteString) obj2, (Trigger) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = Trigger.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncTopicEntitiesClientRequest syncTopicEntitiesClientRequest = (SyncTopicEntitiesClientRequest) obj;
        reverseProtoWriter.getClass();
        syncTopicEntitiesClientRequest.getClass();
        reverseProtoWriter.writeBytes(syncTopicEntitiesClientRequest.unknownFields());
        Trigger.ADAPTER.encodeWithTag(reverseProtoWriter, 3, syncTopicEntitiesClientRequest.trigger);
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 2, syncTopicEntitiesClientRequest.sync_range);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, syncTopicEntitiesClientRequest.topic);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncTopicEntitiesClientRequest syncTopicEntitiesClientRequest = (SyncTopicEntitiesClientRequest) obj;
        syncTopicEntitiesClientRequest.getClass();
        return Trigger.ADAPTER.encodedSizeWithTag(3, syncTopicEntitiesClientRequest.trigger) + ProtoAdapter.BYTES.encodedSizeWithTag(2, syncTopicEntitiesClientRequest.sync_range) + ProtoAdapter.INT32.encodedSizeWithTag(1, syncTopicEntitiesClientRequest.topic) + syncTopicEntitiesClientRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncTopicEntitiesClientRequest syncTopicEntitiesClientRequest = (SyncTopicEntitiesClientRequest) obj;
        syncTopicEntitiesClientRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = syncTopicEntitiesClientRequest.topic;
        ByteString byteString2 = syncTopicEntitiesClientRequest.sync_range;
        Trigger trigger = syncTopicEntitiesClientRequest.trigger;
        byteString.getClass();
        return new SyncTopicEntitiesClientRequest(num, byteString2, trigger, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncTopicEntitiesClientRequest syncTopicEntitiesClientRequest = (SyncTopicEntitiesClientRequest) obj;
        syncTopicEntitiesClientRequest.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, syncTopicEntitiesClientRequest.topic);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, syncTopicEntitiesClientRequest.sync_range);
        Trigger.ADAPTER.encodeWithTag(protoWriter, 3, syncTopicEntitiesClientRequest.trigger);
        protoWriter.writeBytes(syncTopicEntitiesClientRequest.unknownFields());
    }
}

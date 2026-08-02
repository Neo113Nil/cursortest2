package com.squareup.protos.cash.clientsync.serverpush;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SyncEntitiesNudge$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SyncEntitiesNudge((String) obj, (Long) obj2, (Integer) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncEntitiesNudge syncEntitiesNudge = (SyncEntitiesNudge) obj;
        reverseProtoWriter.getClass();
        syncEntitiesNudge.getClass();
        reverseProtoWriter.writeBytes(syncEntitiesNudge.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 3, syncEntitiesNudge.topicVal);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, syncEntitiesNudge.timestamp);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, syncEntitiesNudge.topic);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncEntitiesNudge syncEntitiesNudge = (SyncEntitiesNudge) obj;
        syncEntitiesNudge.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(3, syncEntitiesNudge.topicVal) + ProtoAdapter.INT64.encodedSizeWithTag(2, syncEntitiesNudge.timestamp) + ProtoAdapter.STRING.encodedSizeWithTag(1, syncEntitiesNudge.topic) + syncEntitiesNudge.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncEntitiesNudge syncEntitiesNudge = (SyncEntitiesNudge) obj;
        syncEntitiesNudge.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = syncEntitiesNudge.topic;
        Long l = syncEntitiesNudge.timestamp;
        Integer num = syncEntitiesNudge.topicVal;
        byteString.getClass();
        return new SyncEntitiesNudge(str, l, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncEntitiesNudge syncEntitiesNudge = (SyncEntitiesNudge) obj;
        syncEntitiesNudge.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, syncEntitiesNudge.topic);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, syncEntitiesNudge.timestamp);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, syncEntitiesNudge.topicVal);
        protoWriter.writeBytes(syncEntitiesNudge.unknownFields());
    }
}

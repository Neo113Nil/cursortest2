package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.groups.Group;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncGroup$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncGroup((Group) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Group.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncGroup syncGroup = (SyncGroup) obj;
        reverseProtoWriter.getClass();
        syncGroup.getClass();
        reverseProtoWriter.writeBytes(syncGroup.unknownFields());
        Group.ADAPTER.encodeWithTag(reverseProtoWriter, 1, syncGroup.group);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncGroup syncGroup = (SyncGroup) obj;
        syncGroup.getClass();
        return Group.ADAPTER.encodedSizeWithTag(1, syncGroup.group) + syncGroup.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncGroup syncGroup = (SyncGroup) obj;
        syncGroup.getClass();
        Group group = syncGroup.group;
        Group group2 = group != null ? (Group) Group.ADAPTER.redact(group) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SyncGroup(group2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncGroup syncGroup = (SyncGroup) obj;
        syncGroup.getClass();
        Group.ADAPTER.encodeWithTag(protoWriter, 1, syncGroup.group);
        protoWriter.writeBytes(syncGroup.unknownFields());
    }
}

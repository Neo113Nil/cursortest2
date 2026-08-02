package com.squareup.protos.cash.groups;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Group$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Group((String) obj, (Avatar) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(GroupParticipant.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Group group = (Group) obj;
        reverseProtoWriter.getClass();
        group.getClass();
        reverseProtoWriter.writeBytes(group.unknownFields());
        GroupParticipant.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, group.participants);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 2, group.group_image);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, group.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Group group = (Group) obj;
        group.getClass();
        return GroupParticipant.ADAPTER.asRepeated().encodedSizeWithTag(3, group.participants) + Avatar.ADAPTER.encodedSizeWithTag(2, group.group_image) + ProtoAdapter.STRING.encodedSizeWithTag(1, group.name) + group.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Group group = (Group) obj;
        group.getClass();
        Avatar avatar = group.group_image;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(group.participants, GroupParticipant.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = group.name;
        byteString.getClass();
        return new Group(str, avatar2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Group group = (Group) obj;
        group.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, group.name);
        Avatar.ADAPTER.encodeWithTag(protoWriter, 2, group.group_image);
        GroupParticipant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, group.participants);
        protoWriter.writeBytes(group.unknownFields());
    }
}

package com.squareup.protos.cash.groups;

import com.squareup.protos.cash.groups.GroupParticipant;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GroupParticipant$Anonymous$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GroupParticipant.Anonymous(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GroupParticipant.Anonymous anonymous = (GroupParticipant.Anonymous) obj;
        reverseProtoWriter.getClass();
        anonymous.getClass();
        reverseProtoWriter.writeBytes(anonymous.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GroupParticipant.Anonymous anonymous = (GroupParticipant.Anonymous) obj;
        anonymous.getClass();
        return anonymous.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((GroupParticipant.Anonymous) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GroupParticipant.Anonymous(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GroupParticipant.Anonymous anonymous = (GroupParticipant.Anonymous) obj;
        anonymous.getClass();
        protoWriter.writeBytes(anonymous.unknownFields());
    }
}

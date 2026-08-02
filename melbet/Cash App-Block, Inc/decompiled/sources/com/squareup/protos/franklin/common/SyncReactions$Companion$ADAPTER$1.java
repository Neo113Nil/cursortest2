package com.squareup.protos.franklin.common;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncReactions$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncReactions(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncReactions syncReactions = (SyncReactions) obj;
        reverseProtoWriter.getClass();
        syncReactions.getClass();
        reverseProtoWriter.writeBytes(syncReactions.unknownFields());
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, syncReactions.emoji);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncReactions syncReactions = (SyncReactions) obj;
        syncReactions.getClass();
        return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, syncReactions.emoji) + syncReactions.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncReactions syncReactions = (SyncReactions) obj;
        syncReactions.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = syncReactions.emoji;
        list.getClass();
        byteString.getClass();
        return new SyncReactions(list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncReactions syncReactions = (SyncReactions) obj;
        syncReactions.getClass();
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, syncReactions.emoji);
        protoWriter.writeBytes(syncReactions.unknownFields());
    }
}

package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ReactionRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ReactionRenderData(m, arrayList, (Long) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Reaction.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                arrayList.add(Reaction.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ReactionRenderData reactionRenderData = (ReactionRenderData) obj;
        reverseProtoWriter.getClass();
        reactionRenderData.getClass();
        reverseProtoWriter.writeBytes(reactionRenderData.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, reactionRenderData.show_extended_picker);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, reactionRenderData.can_add_reactions_until);
        ProtoAdapter protoAdapter = Reaction.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, reactionRenderData.available_reactions);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 1, reactionRenderData.existing_reactions);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ReactionRenderData reactionRenderData = (ReactionRenderData) obj;
        reactionRenderData.getClass();
        int size$okio = reactionRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Reaction.ADAPTER;
        return ProtoAdapter.BOOL.encodedSizeWithTag(4, reactionRenderData.show_extended_picker) + ProtoAdapter.INT64.encodedSizeWithTag(3, reactionRenderData.can_add_reactions_until) + protoAdapter.asRepeated().encodedSizeWithTag(2, reactionRenderData.available_reactions) + protoAdapter.asRepeated().encodedSizeWithTag(1, reactionRenderData.existing_reactions) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ReactionRenderData reactionRenderData = (ReactionRenderData) obj;
        reactionRenderData.getClass();
        List list = reactionRenderData.existing_reactions;
        ProtoAdapter protoAdapter = Reaction.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(reactionRenderData.available_reactions, protoAdapter);
        ByteString byteString = ByteString.EMPTY;
        Long l = reactionRenderData.can_add_reactions_until;
        Boolean bool = reactionRenderData.show_extended_picker;
        byteString.getClass();
        return new ReactionRenderData(m1169redactElements, m1169redactElements2, l, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ReactionRenderData reactionRenderData = (ReactionRenderData) obj;
        reactionRenderData.getClass();
        ProtoAdapter protoAdapter = Reaction.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, reactionRenderData.existing_reactions);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, reactionRenderData.available_reactions);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, reactionRenderData.can_add_reactions_until);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, reactionRenderData.show_extended_picker);
        protoWriter.writeBytes(reactionRenderData.unknownFields());
    }
}

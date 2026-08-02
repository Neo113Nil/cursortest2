package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.Reaction;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ReactionConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ReactionConfig((Integer) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.UINT32.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(Reaction.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ReactionConfig reactionConfig = (ReactionConfig) obj;
        reverseProtoWriter.getClass();
        reactionConfig.getClass();
        reverseProtoWriter.writeBytes(reactionConfig.unknownFields());
        Reaction.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, reactionConfig.extended_picker_reactions);
        ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 1, reactionConfig.max_emoji_per_reaction);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ReactionConfig reactionConfig = (ReactionConfig) obj;
        reactionConfig.getClass();
        return Reaction.ADAPTER.asRepeated().encodedSizeWithTag(2, reactionConfig.extended_picker_reactions) + ProtoAdapter.UINT32.encodedSizeWithTag(1, reactionConfig.max_emoji_per_reaction) + reactionConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ReactionConfig reactionConfig = (ReactionConfig) obj;
        reactionConfig.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(reactionConfig.extended_picker_reactions, Reaction.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Integer num = reactionConfig.max_emoji_per_reaction;
        byteString.getClass();
        return new ReactionConfig(num, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ReactionConfig reactionConfig = (ReactionConfig) obj;
        reactionConfig.getClass();
        ProtoAdapter.UINT32.encodeWithTag(protoWriter, 1, reactionConfig.max_emoji_per_reaction);
        Reaction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, reactionConfig.extended_picker_reactions);
        protoWriter.writeBytes(reactionConfig.unknownFields());
    }
}

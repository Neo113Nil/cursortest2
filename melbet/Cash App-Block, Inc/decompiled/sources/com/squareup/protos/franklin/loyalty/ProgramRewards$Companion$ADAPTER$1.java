package com.squareup.protos.franklin.loyalty;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ProgramRewards$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProgramRewards(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(PointsReward.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProgramRewards programRewards = (ProgramRewards) obj;
        reverseProtoWriter.getClass();
        programRewards.getClass();
        reverseProtoWriter.writeBytes(programRewards.unknownFields());
        PointsReward.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, programRewards.points_rewards);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProgramRewards programRewards = (ProgramRewards) obj;
        programRewards.getClass();
        return PointsReward.ADAPTER.asRepeated().encodedSizeWithTag(1, programRewards.points_rewards) + programRewards.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProgramRewards programRewards = (ProgramRewards) obj;
        programRewards.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(programRewards.points_rewards, PointsReward.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ProgramRewards(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProgramRewards programRewards = (ProgramRewards) obj;
        programRewards.getClass();
        PointsReward.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, programRewards.points_rewards);
        protoWriter.writeBytes(programRewards.unknownFields());
    }
}

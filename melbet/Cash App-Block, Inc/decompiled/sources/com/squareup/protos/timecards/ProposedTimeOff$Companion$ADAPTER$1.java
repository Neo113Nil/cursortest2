package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.protos.timecards.scheduling.TimeOff;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ProposedTimeOff$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProposedTimeOff((TimeOff) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(TimeOff.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProposedTimeOff proposedTimeOff = (ProposedTimeOff) obj;
        reverseProtoWriter.getClass();
        proposedTimeOff.getClass();
        reverseProtoWriter.writeBytes(proposedTimeOff.unknownFields());
        TimeOff.ADAPTER.encodeWithTag(reverseProtoWriter, 1, proposedTimeOff.time_off);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProposedTimeOff proposedTimeOff = (ProposedTimeOff) obj;
        proposedTimeOff.getClass();
        return TimeOff.ADAPTER.encodedSizeWithTag(1, proposedTimeOff.time_off) + proposedTimeOff.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProposedTimeOff proposedTimeOff = (ProposedTimeOff) obj;
        proposedTimeOff.getClass();
        TimeOff timeOff = proposedTimeOff.time_off;
        TimeOff timeOff2 = timeOff != null ? (TimeOff) TimeOff.ADAPTER.redact(timeOff) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ProposedTimeOff(timeOff2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProposedTimeOff proposedTimeOff = (ProposedTimeOff) obj;
        proposedTimeOff.getClass();
        TimeOff.ADAPTER.encodeWithTag(protoWriter, 1, proposedTimeOff.time_off);
        protoWriter.writeBytes(proposedTimeOff.unknownFields());
    }
}

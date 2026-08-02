package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.protos.timecards.TimecardEditRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TimecardEditRequest$TimecardBreakEditRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TimecardEditRequest.TimecardBreakEditRequest((String) obj, (String) obj2, (TimecardEditRequest.TimecardBreakEditRequest.ProposedBreakDefinition) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(TimecardEditRequest.TimecardBreakEditRequest.ProposedBreakDefinition.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TimecardEditRequest.TimecardBreakEditRequest timecardBreakEditRequest = (TimecardEditRequest.TimecardBreakEditRequest) obj;
        reverseProtoWriter.getClass();
        timecardBreakEditRequest.getClass();
        reverseProtoWriter.writeBytes(timecardBreakEditRequest.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, timecardBreakEditRequest.proposed_stop_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, timecardBreakEditRequest.proposed_start_at);
        TimecardEditRequest.TimecardBreakEditRequest.ProposedBreakDefinition.ADAPTER.encodeWithTag(reverseProtoWriter, 5, timecardBreakEditRequest.proposed_break_definition);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, timecardBreakEditRequest.proposed_break_definition_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, timecardBreakEditRequest.break_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TimecardEditRequest.TimecardBreakEditRequest timecardBreakEditRequest = (TimecardEditRequest.TimecardBreakEditRequest) obj;
        timecardBreakEditRequest.getClass();
        int size$okio = timecardBreakEditRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, timecardBreakEditRequest.proposed_stop_at) + protoAdapter.encodedSizeWithTag(3, timecardBreakEditRequest.proposed_start_at) + TimecardEditRequest.TimecardBreakEditRequest.ProposedBreakDefinition.ADAPTER.encodedSizeWithTag(5, timecardBreakEditRequest.proposed_break_definition) + protoAdapter.encodedSizeWithTag(2, timecardBreakEditRequest.proposed_break_definition_id) + protoAdapter.encodedSizeWithTag(1, timecardBreakEditRequest.break_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TimecardEditRequest.TimecardBreakEditRequest timecardBreakEditRequest = (TimecardEditRequest.TimecardBreakEditRequest) obj;
        timecardBreakEditRequest.getClass();
        TimecardEditRequest.TimecardBreakEditRequest.ProposedBreakDefinition proposedBreakDefinition = timecardBreakEditRequest.proposed_break_definition;
        TimecardEditRequest.TimecardBreakEditRequest.ProposedBreakDefinition proposedBreakDefinition2 = proposedBreakDefinition != null ? (TimecardEditRequest.TimecardBreakEditRequest.ProposedBreakDefinition) TimecardEditRequest.TimecardBreakEditRequest.ProposedBreakDefinition.ADAPTER.redact(proposedBreakDefinition) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = timecardBreakEditRequest.break_id;
        String str2 = timecardBreakEditRequest.proposed_break_definition_id;
        String str3 = timecardBreakEditRequest.proposed_start_at;
        String str4 = timecardBreakEditRequest.proposed_stop_at;
        byteString.getClass();
        return new TimecardEditRequest.TimecardBreakEditRequest(str, str2, proposedBreakDefinition2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TimecardEditRequest.TimecardBreakEditRequest timecardBreakEditRequest = (TimecardEditRequest.TimecardBreakEditRequest) obj;
        timecardBreakEditRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, timecardBreakEditRequest.break_id);
        protoAdapter.encodeWithTag(protoWriter, 2, timecardBreakEditRequest.proposed_break_definition_id);
        TimecardEditRequest.TimecardBreakEditRequest.ProposedBreakDefinition.ADAPTER.encodeWithTag(protoWriter, 5, timecardBreakEditRequest.proposed_break_definition);
        protoAdapter.encodeWithTag(protoWriter, 3, timecardBreakEditRequest.proposed_start_at);
        protoAdapter.encodeWithTag(protoWriter, 4, timecardBreakEditRequest.proposed_stop_at);
        protoWriter.writeBytes(timecardBreakEditRequest.unknownFields());
    }
}

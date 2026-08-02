package com.squareup.protos.timecards;

import com.squareup.protos.timecards.TimecardEditRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TimecardEditRequest$TimecardBreakEditRequest$ProposedBreakDefinition$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TimecardEditRequest.TimecardBreakEditRequest.ProposedBreakDefinition((Boolean) obj4, (String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TimecardEditRequest.TimecardBreakEditRequest.ProposedBreakDefinition proposedBreakDefinition = (TimecardEditRequest.TimecardBreakEditRequest.ProposedBreakDefinition) obj;
        reverseProtoWriter.getClass();
        proposedBreakDefinition.getClass();
        reverseProtoWriter.writeBytes(proposedBreakDefinition.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, proposedBreakDefinition.is_paid);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, proposedBreakDefinition.expected_duration);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, proposedBreakDefinition.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, proposedBreakDefinition.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TimecardEditRequest.TimecardBreakEditRequest.ProposedBreakDefinition proposedBreakDefinition = (TimecardEditRequest.TimecardBreakEditRequest.ProposedBreakDefinition) obj;
        proposedBreakDefinition.getClass();
        int size$okio = proposedBreakDefinition.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.BOOL.encodedSizeWithTag(4, proposedBreakDefinition.is_paid) + protoAdapter.encodedSizeWithTag(3, proposedBreakDefinition.expected_duration) + protoAdapter.encodedSizeWithTag(2, proposedBreakDefinition.name) + protoAdapter.encodedSizeWithTag(1, proposedBreakDefinition.id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TimecardEditRequest.TimecardBreakEditRequest.ProposedBreakDefinition proposedBreakDefinition = (TimecardEditRequest.TimecardBreakEditRequest.ProposedBreakDefinition) obj;
        proposedBreakDefinition.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = proposedBreakDefinition.id;
        String str2 = proposedBreakDefinition.name;
        String str3 = proposedBreakDefinition.expected_duration;
        Boolean bool = proposedBreakDefinition.is_paid;
        byteString.getClass();
        return new TimecardEditRequest.TimecardBreakEditRequest.ProposedBreakDefinition(bool, str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TimecardEditRequest.TimecardBreakEditRequest.ProposedBreakDefinition proposedBreakDefinition = (TimecardEditRequest.TimecardBreakEditRequest.ProposedBreakDefinition) obj;
        proposedBreakDefinition.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, proposedBreakDefinition.id);
        protoAdapter.encodeWithTag(protoWriter, 2, proposedBreakDefinition.name);
        protoAdapter.encodeWithTag(protoWriter, 3, proposedBreakDefinition.expected_duration);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, proposedBreakDefinition.is_paid);
        protoWriter.writeBytes(proposedBreakDefinition.unknownFields());
    }
}
